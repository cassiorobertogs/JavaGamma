package core;

public class pessoa {
		protected String nome;
		protected String telefone;
		protected String email;
		public pessoa(String nome, String telefone, String email) {
			super();
			this.nome = nome;
			this.telefone = telefone;
			this.email = email;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getTelefone() {
			return telefone;
		}
		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public void imprimir() {
			System.out.println("nome: "+nome);
			System.out.println("telefone: "+telefone);
			System.out.println("email: "+email);
		}
	}


