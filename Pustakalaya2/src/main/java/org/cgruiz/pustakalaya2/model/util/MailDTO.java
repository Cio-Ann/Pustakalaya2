package org.cgruiz.pustakalaya2.model.util;

import java.util.List;

/**
 * Clase que representa los datos de un email
 *
 * @author Cio-Ann
 */
public class MailDTO {
	
	private String from;
	
	private List<String> to;
	
	private String subject;
	
	private String body;

	/**
	 * @return the from
	 */
	public String getFrom() {
		return from;
	}

	/**
	 * @param from the from to set
	 */
	public void setFrom(String from) {
		this.from = from;
	}

	/**
	 * @return the to
	 */
	public List<String> getTo() {
		return to;
	}

	/**
	 * @param to the to to set
	 */
	public void setTo(List<String> to) {
		this.to = to;
	}

	/**
	 * @return the subject
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * @param subject the subject to set
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}

	/**
	 * @return the body
	 */
	public String getBody() {
		return body;
	}

	/**
	 * @param body the body to set
	 */
	public void setBody(String body) {
		this.body = body;
	}

	public MailDTO() { }
	
	public MailDTO(String from, List<String> to, String subject, String body) {
		this.from = from;
		this.to = to;
		this.subject = subject;
		this.body = body;
	}

	@Override
	public String toString() {
		return "MailDTO [from=" + from + ", to=" + to + ", subject=" + subject + ", body=" + body + "]";
	}
	
}
