package com.vivo.avro.generateavroschema.domain;

import lombok.Data;

@Data
public class ProtocolServiceDetailsDTO {
	private String protocolNumber;
	private ProtocolTypeDTO protocolType;
	private String geographicArea;
	private String network;
}
