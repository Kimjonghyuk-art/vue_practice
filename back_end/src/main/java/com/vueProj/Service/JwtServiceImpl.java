package com.vueProj.Service;

import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.crypto.spec.SecretKeySpec;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import jakarta.xml.bind.DatatypeConverter;

public class JwtServiceImpl implements JwtService {

	private String secretKey = "awefawefaergaetgaeawoein(#*RoniEOWEIFN024OEWIFB0244280OEIBF02242OEIFBOEBFrg";
	
	@Override
	public String getToken(String key, Object value) {
		Date expTime = new Date();
		expTime.setTime(expTime.getTime() + 1000 * 60 * 5);
		
		byte[] secretByteKey = DatatypeConverter.parseBase64Binary(secretKey);
		Key signKey = new SecretKeySpec(secretByteKey, SignatureAlgorithm.HS256.getJcaName());
		
		Map<String, Object> headerMap = new HashMap<>();
		headerMap.put("typ", "JWT");
		headerMap.put("alg", "HS256");
		
		Map<String, Object> map = new HashMap<>();
		map.put(key, value);
		
		JwtBuilder builder = Jwts.builder().setHeader(headerMap)
				.setClaims(map)
				.setExpiration(expTime)
				.signWith(signKey, SignatureAlgorithm.HS256);
		
		
		
		return builder.compact();
	}

}
