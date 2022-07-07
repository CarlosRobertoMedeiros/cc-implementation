![GitHub top language](https://img.shields.io/badge/SPRING%20BOOT-2.7.1-brightgreen)
![GitHub top language](https://img.shields.io/badge/APP%20RELEASE-1.0.0-blue)
# POC - Exemplo explicativo CC(Clean Code) Implementation

## Project Arch
	- Project BackEnd: Spring Cloud 2.7.1
	
## Owner
	- Carlos Roberto Medeiros de Lima
	
## Tips
	- Clean Archtecture utilizando SOLID and Clean Code 
	
	SOLID 
		
		Obs: Visto por uma visão mínima de código e não por um modelo arquitetural.
		
		SRP = Separar Coisas que Mudam por motivos diferentes(Exemplo Pedido e Impostos)
			Os impostos devem estar associados aos items e não ao Pedido.
		
		OCP = Devemos estar fechados para modificação e abertos para extensão
			Utilização de Polimorfismo, alteração dos códigos ifs de acordo com a categoria dos ItemDePedido por polimorfismo utilizando template method no exemplo.
		
			public Double calculaImposto(){
				return this.preco * this.getImposto();
			}

			//Implementando um Template Method
			public abstract double getImposto();

		LSP = Se S (Refrigerante,Cerveja,Agua) é subclasse de T (Item) em um programa
			deve ser possível substituir instâncias de T (Item) por instâncias de S (Refrigerante,Cerveja,Agua), sem quebrar o funcionamento do programa.
			
			1 - Pré condições não podem ser fortalecidas
			2 - Pós condições não podem ser enfraquecidas
			3 - Invariantes devem se manter consistentes
		

	
	
	
	
