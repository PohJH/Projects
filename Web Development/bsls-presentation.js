function cellHover(cell)
{
cell.id;

var x = document.getElementById("color");
var X =x.value;

if(X == "RED")
{
      cell.id;
      cell.style.backgroundColor = "red";
    }

if(X == "BLUE")
{
      cell.id;
      cell.style.backgroundColor = "blue";
    }

if(X == "BLACK")
{
      cell.id;
      cell.style.backgroundColor = "black";
      cell.style.color="white";
    }


if(X == "WHITE")
{
      cell.id;
      cell.style.backgroundColor = "white";
    }

if(X == "GREEN")
{
      cell.id;
      cell.style.backgroundColor = "green";
    }

if(X == "YELLOW")
{
      cell.id;
      cell.style.backgroundColor = "yellow";
    }

if(X == "PURPLE")
{
      cell.id;
      cell.style.backgroundColor = "purple";
    }

if(X == "CYAN")
{
      cell.id;
      cell.style.backgroundColor = "cyan";
    }

if(X == "PINK")
{
      cell.id;
      cell.style.backgroundColor = "pink";
    }

if(X == "ORANGE")
{
      cell.id;
      cell.style.backgroundColor = "orange";
    }


if(X == "WHITE")
{
      cell.id;
      cell.style.backgroundColor = "white";
    }
}


function cellClicked(cell)
{

cell.id;
cell.style.backgroundColor = "white";

}



function generate()

{
var COLUMN = document.getElementById("column");
var Column = COLUMN.value;

var ROW = document.getElementById("row");
var Row = ROW.value;

var CELLDATA = document.getElementById("cellData");
var Celldata = CELLDATA.value;

var HEIGHT = document.getElementById("height");
var Height = HEIGHT.value;

var WIDTH = document.getElementById("width");
var Width = WIDTH.value;

var myTable = document.getElementById("generatedTable");

var table = document.createElement('TABLE');

table.border ='1';

var tableBody = document.createElement('TBODY');
table.appendChild(tableBody);

for(var y=0; y<Column ;y++)
{

var tr = document.createElement('TR');
tableBody.appendChild(tr);

for(var x=0; x<Row; x++)
{

var td =document.createElement('TD');

td.width = Width; td.height =HEIGHT;

var cellID ="cell["+ x +"," + y +"]";
td.setAttribute("id",cellID.toString());

td.addEventListener("click", function() {cellClicked(this); });
td.addEventListener("mouseover", function() {cellHover(this); });
if(Celldata == "")
{


td.appendChild(document.createTextNode("Cell " + x + ","+ y));


}
else
{

td.appendChild(document.createTextNode(Celldata));


}

tr.appendChild(td);
}
}
myTable.appendChild(table);
}


function deleteTable() 
{

document.getElementById("generatedTable").innerHTML=""; 
    
}