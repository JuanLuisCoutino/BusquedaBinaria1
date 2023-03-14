import javax.swing.JOptionPane

var numFind = JOptionPane.showInputDialog("Introduce el numero que quieres encontrar").toInt()

var listaNumeros = IntArray(7)
for (i in(0 until 7)){
    listaNumeros[i] = JOptionPane.showInputDialog("Ingresa el numero de la posicion ${i+1}").toInt()
}
var n = listaNumeros.size
var inferior = 0
var centro = 0
var superior = n-1
var bandera = false
var vueltas = 0
println("$superior")
while (inferior<=superior){
    centro = (superior + inferior)/2
    if (numFind==listaNumeros[centro]){
        bandera = true
        break
    }else if(numFind<listaNumeros[centro]){
        superior = centro -1
    }else{
        inferior = centro +1
        vueltas++
    }
}
    if (bandera==true) {
        println("Tu numero $numFind se encuentra en la posicion ${centro+1}")
        println("El ciclo dio $vueltas vueltas")
    }

    else{
        println("El numero $numFind no se encuentra en el arreglo")
    }

