
package githubtest;


public class GitHubTest {

    public static void main(String[] args) {
        System.out.println("Inicio");
    //Declaracion de la variable con los espacios
    int numeros[] = new int[100];
   
   //LLenado del arreglo
    for (int i=0; i<numeros.length; i++){
       //llenar la variable con 100 numeros aleatorios
        numeros[i]=((int) (Math.random()*100));
    }
    //Imprimir todo el contenido del arreglo
    System.out.println("Contenido del arreglo");
    for (int i=0; i<numeros.length; i++){
       System.out.println(numeros[i]); 
    }
 
    
       }
    }
    

