package com.lojavirtual.met.enums;

public enum TipoEndereco {
	
		
		COBRANCA("cobrança"),
		ENTREGA("entrega");
	
		private  String descricao;
		
		private TipoEndereco(String descricao) {
			this.descricao = descricao;	
		}
		
		public String getDescricao() {
			return descricao;
		}
		
		public String toString() {
			return this.descricao;
		}
		
		
}
