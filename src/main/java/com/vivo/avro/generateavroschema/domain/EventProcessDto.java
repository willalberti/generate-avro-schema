package com.vivo.avro.generateavroschema.domain;

import java.util.Date;

import lombok.Data;

@Data
public class EventProcessDto {
	private String step;
	private Date date;
	private String type;
	private String code;
	private String description;
	private String protocolNumber;
	
	
	

	
}


