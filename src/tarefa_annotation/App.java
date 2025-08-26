package tarefa_annotation;

public class App {
	public static void main(String args[]) {
		tableNameByReflection(Cliente.class);
	}

	private static void tableNameByReflection(Class<?> entity) {
		
		
		if(entity.isAnnotationPresent(Tabela.class)) {
			Tabela tabela = (Tabela) entity.getAnnotation(Tabela.class);
			System.out.println("Nome da tabela: " + tabela.value());
		} else {
			System.out.println("A classe" + entity.getSimpleName() + "não possui o valor não possui a annotation @Tabela.");
		}
		
	}
}
