package com.rasysbox.locationservice.util;

import com.rasysbox.ws.domain.dto.ResponseDTO;
import com.rasysbox.ws.domain.model.Location;
import org.owasp.html.PolicyFactory;
import org.owasp.html.Sanitizers;
import org.springframework.stereotype.Component;

@Component
public class Shield {

    public static String blindStr(String value) {
        PolicyFactory policy = Sanitizers.FORMATTING.and(Sanitizers.LINKS);
        return policy.sanitize(value)
                .replace("&#34;", "'")
                .replace("&#43;", "+")
                .replace("&#39;", "'")
                .replace("&#61;", "=")
                .replace("&amp;", " & ")
                .replace("&#64;", "@");
    }

    public static ResponseDTO blindResponseDTO(Location request){
        return ResponseDTO.builder()
                .departamento(blindStr(request.getDepartamento()))
                .region(blindStr(request.getRegion()))
                .municipio(blindStr(request.getMunicipio()))
                //.codigoDaneDelDepartamento(blindStr(request.getCodigoDaneDelDepartamento()))
                //.codigoDaneDelMunicipio(blindStr(request.getCodigoDaneDelMunicipio()))
                .build();
    }

}
