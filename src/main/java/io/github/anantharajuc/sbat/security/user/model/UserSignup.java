package io.github.anantharajuc.sbat.security.user.model;

import io.github.anantharajuc.sbat.auditing.AuditEntity;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level=AccessLevel.PRIVATE)
@EqualsAndHashCode(callSuper=false)
public class UserSignup extends AuditEntity
{
	private static final long serialVersionUID = 1L;
	
	String email;
    String username;
    String password;
}