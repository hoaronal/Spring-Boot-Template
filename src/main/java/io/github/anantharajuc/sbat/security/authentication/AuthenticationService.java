package io.github.anantharajuc.sbat.security.authentication;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import io.github.anantharajuc.sbat.security.jwt.model.AuthenticationResponse;
import io.github.anantharajuc.sbat.security.jwt.model.RefreshToken;
import io.github.anantharajuc.sbat.security.jwt.model.VerificationToken;
import io.github.anantharajuc.sbat.security.user.model.User;
import io.github.anantharajuc.sbat.security.user.model.UserLogin;
import io.github.anantharajuc.sbat.security.user.model.UserSignup;

public interface AuthenticationService 
{
	void signup(UserSignup userSignup);
	
	void fetchUserAndEnable(VerificationToken verificationToken);
	
	String verifyAccount(@PathVariable String token);
	
	String generateVerificationToken(User user);
	
	AuthenticationResponse login(@RequestBody UserLogin userLogin);
	
	AuthenticationResponse refreshToken(RefreshToken refreshToken);
}
