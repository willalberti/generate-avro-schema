package com.vivo.avro.generateavroschema.domain;

import lombok.Data;

@Data
public class ProtocolServiceDetailsDto {
	private String protocolNumber;
	private String protocolType;
	private String geographicArea;
	private String network;
}
