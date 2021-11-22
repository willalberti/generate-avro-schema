package com.vivo.avro.generateavroschema;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.dataformat.avro.AvroMapper;
import com.fasterxml.jackson.dataformat.avro.AvroSchema;
import com.fasterxml.jackson.dataformat.avro.schema.AvroSchemaGenerator;
import com.vivo.avro.generateavroschema.domain.EventProcessDto;
import com.vivo.avro.generateavroschema.domain.ProtocolServiceDetailsDto;
import com.vivo.avro.generateavroschema.domain.ResourceDetailsDto;
import com.vivo.avro.generateavroschema.domain.ServiceDetailsDto;


@SpringBootApplication
public class GenerateAvroSchemaApplication {

	public static void main(String[] args) throws JsonMappingException {
		SpringApplication.run(GenerateAvroSchemaApplication.class, args);
		
		
	 
		 
		 getAvroSchema(ProtocolServiceDetailsDto.class);
		 getAvroSchema(EventProcessDto.class);
		 getAvroSchema(ResourceDetailsDto.class);
		 getAvroSchema(ServiceDetailsDto.class);
		 
	}
	
	
	private static void getAvroSchema(Class<?> c) throws JsonMappingException {
		
		 AvroMapper avMapper = new AvroMapper();
		 AvroSchemaGenerator gen = new AvroSchemaGenerator();
		 
		 avMapper.acceptJsonFormatVisitor(c, gen);
		 AvroSchema schema1 = gen.getGeneratedSchema();
		 System.out.println(schema1.getAvroSchema());
		 

		
	}

}
