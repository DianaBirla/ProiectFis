package Client;
public class BookModel {
	private String titlu;
	private String descriere;
	private String autor;
	private String gen;
	private String an_aparitie;
	private String poza;
	
	public BookModel(String titlu, String descriere, String autor, String gen, String an_aparitie, String poza) {
		super();
		this.titlu = titlu;
		this.descriere = descriere;
		this.autor = autor;
		this.gen = gen;
		this.an_aparitie = an_aparitie;
		this.poza = poza;
	}
	public String getTitlu() {
		return titlu;
	}
	public void setTitlu(String titlu) {
		this.titlu = titlu;
	}
	public String getDescriere() {
		return descriere;
	}
	public void setDescriere(String descriere) {
		this.descriere = descriere;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getGen() {
		return gen;
	}
	public void setGen(String gen) {
		this.gen = gen;
	}
	public String getAn_aparitie() {
		return an_aparitie;
	}
	public void setAn_aparitie(String an_aparitie) {
		this.an_aparitie = an_aparitie;
	}
	public String getPoza() {
		return poza;
	}
	public void setPoza(String poza) {
		this.poza = poza;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((an_aparitie == null) ? 0 : an_aparitie.hashCode());
		result = prime * result + ((autor == null) ? 0 : autor.hashCode());
		result = prime * result + ((descriere == null) ? 0 : descriere.hashCode());
		result = prime * result + ((gen == null) ? 0 : gen.hashCode());
		result = prime * result + ((poza == null) ? 0 : poza.hashCode());
		result = prime * result + ((titlu == null) ? 0 : titlu.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookModel other = (BookModel) obj;
		if (an_aparitie == null) {
			if (other.an_aparitie != null)
				return false;
		} else if (!an_aparitie.equals(other.an_aparitie))
			return false;
		if (autor == null) {
			if (other.autor != null)
				return false;
		} else if (!autor.equals(other.autor))
			return false;
		if (descriere == null) {
			if (other.descriere != null)
				return false;
		} else if (!descriere.equals(other.descriere))
			return false;
		if (gen == null) {
			if (other.gen != null)
				return false;
		} else if (!gen.equals(other.gen))
			return false;
		if (poza == null) {
			if (other.poza != null)
				return false;
		} else if (!poza.equals(other.poza))
			return false;
		if (titlu == null) {
			if (other.titlu != null)
				return false;
		} else if (!titlu.equals(other.titlu))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "BookModel [titlu=" + titlu + ", descriere=" + descriere + ", autor=" + autor + ", gen=" + gen
				+ ", an_aparitie=" + an_aparitie + ", poza=" + poza + "]";
	}
}
	
	