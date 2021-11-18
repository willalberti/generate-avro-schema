package com.vivo.avro.generateavroschema;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.dataformat.avro.AvroMapper;
import com.fasterxml.jackson.dataformat.avro.AvroSchema;
import com.fasterxml.jackson.dataformat.avro.schema.AvroSchemaGenerator;
import com.vivo.avro.generateavroschema.domain.ProtocolServiceDetailsDTO;


@SpringBootApplication
public class GenerateAvroSchemaApplication {

	public static void main(String[] args) throws JsonMappingException {
		SpringApplication.run(GenerateAvroSchemaApplication.class, args);
		
		
		 AvroMapper avMapper = new AvroMapper();
		 AvroSchemaGenerator gen = new AvroSchemaGenerator();
		 avMapper.acceptJsonFormatVisitor(ProtocolServiceDetailsDTO.class, gen);
		 AvroSchema schema1 = gen.getGeneratedSchema();
		 System.out.println("-----< inicio >-----");
		 System.out.println(schema1.getAvroSchema());
		 System.out.println("-----< fim >-----");
		 
	}

}
