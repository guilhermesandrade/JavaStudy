package exercicio_cap13_enumeracoes_composicao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	
	/* Instanciamos aqui para conseguir colocar a data/hora no StringBuilder, e instanciamos
	 	Como private static para que eu não tenha uma cópia do objeto para cada post da aplicação
	 	e apenas um para todas*/
	private static SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	private Date moment;
	private String title;
	private String content;
	private Integer likes;
	
	private List<Comment_post> comments= new ArrayList<>();
	
	public Post() {
		
	}

	public Post(Date moment, String title, String content, Integer likes) {
		
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Comment_post> getComments() {
		return comments;
	}
	
	// Como é uma coleção, não usamos get e set, usamos add e remove
	
	public void addComment(Comment_post comment) {
		
		comments.add(comment);
	}
	
	public void removeComment(Comment_post comment) {
		
		comments.remove(comment);
	}
	
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(title+ "\n");
		sb.append(likes);
		sb.append(" Likes - ");
		sb.append(sdf.format(moment)+ "\n");
		sb.append(content+ "\n");
		sb.append("Comments : \n");
		
		// for each (para cada comments do objeto Comment_post, faça...)
		for(Comment_post c : comments) {
			
			sb.append(c.getText() + "\n");
		}
		
		return sb.toString();
		
		
	}
	
	
	
}
