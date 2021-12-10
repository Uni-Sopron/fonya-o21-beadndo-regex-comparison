var fs = require("fs");

var log = fs.readFileSync('Windows_2k.log','utf8');
var lines = log.split(/[\r\n]+/g);
var elso = 0;
var masodik = 0;
var harmadik = 0;
var negyedik = 0;
var otodik = 0;
for(var i = 0; i < lines.length; i++) { 
    console.log(lines[i])
    var x = lines[i].search(/\b2016-09-29/i)
    if(x>=0){
        elso +=1
    }
    var y = lines[i].search(/]\b/i)
    if(y>=0){
        masodik +=1
    }
    var z = lines[i].search(/C.S/)
    if(z>=0){
        harmadik +=1
    }
    var v = lines[i].search(/attribute/i)
    if(v>=0){
        negyedik +=1
    }
    var w = lines[i].search(/y+/i)
    if(w>=0){
        otodik +=1
    }

}
console.log("Ennyi sor kezdődik 2016-09-29-el: ")
console.log(elso)
console.log("Ennyi sor végződik szögletes zárójelre: ")
console.log(masodik)
console.log("Ennyi sor tartalmazza a 'C' 'bármilyen karakter' 'S' kifejezést: ")
console.log(harmadik)
console.log("Ennyi sor tartalmazza az 'attribute' kifejezést: ")
console.log(negyedik)
console.log("Ennyi sor tartalmazlegalább egy y betüt: ")
console.log(otodik)