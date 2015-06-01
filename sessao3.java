/*
Classes:

podem ser public, protected e private
defaulf é o package (não aplicavel aos descendentes)

não existe o caso em que só temos isto dentro de uma classe:
*/
private class App {}

public class App {

	public static void main(String[] args) {

		// args[0] -- é o primeiro argumento
		System.out.println("Hello world.");

	}

	
}

class app2 {
	
}

/*
 final - numa class essa class não pode ser extended.

 final num atributo só podemos settar os valores uma vez.

 metodo final este metodo não pode ser overrided nas classes filhas.

 metodos de uma classe é uma ação

 metodos de um objecto é um metodo


 Stack de memória  guardar os valores primitivos e os seus valores, para além disso guarda também as declaração

 Heap de memória guardar as instancias de objecto assim como os valores que têm. (Ex: Person("Ze", 20) )
*/
Person person1 = new Person("ze", 20);
Person person2 = person1;
/*
Neste caso person1  e person2 ocupam o mesmo espaço na heap. Se alterarmos o person1 ireimos também alterar o person2.

Passagem de argumentos para dentro de um metodo é criada uma copia do valor da variavél primitiva

passagem de um objeto por argumento é passada uma cópia da referencia, no entanto se alterarmos as propriedades irá reflectir-se no objecto que foi passado.

class String é imutável, ou seja nunca alteramos o seu valor, por exemplo concatenar Strings cria um novo objecto com o valor concatenado.

idioma fluente é invocar um objecto que retorna o proprio objecto
exemplo: new StringBuilder().append("A").append("B");
*/
