package br.pucrs.tp.entidade;

public class Smartphone {

	private Integer id;
	private String name;
	private String description;
	private String image;
	private Double value;
	
	public Smartphone(){		
	}
	
	public Smartphone(Integer id, String name, String description, String image, Double value) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.image = image;
		this.value = value;
	}

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getImage() {
		return image;
	}
	
	public void setImage(String image) {
		this.image = image;
	}
	
	public Double getValue() {
		return value;
	}
	
	public void setValue(Double value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return "Smartphone [id=" + id + ", name=" + name + ", description=" + description + ", image=" + image
				+ ", value=" + value + "]";
	}
	
	
}
