package es.iessoterhernandez.daw.endes.Test4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.AfterEach;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

public class TestAcount2 {

	Account account;

	@BeforeEach

	void init() {

		account = new Account("Paul", 123456789020L, 750F);

	}

	@AfterEach

	void finish() {

		account = null;

	}

	@Test

	public void testDecimalFailure() {

		float balance = account.getBalance();

		for (int i = 0; i < 100; i++) {

			balance += 0.23F;

		}

		assertNotEquals(balance, 773F);

		assertEquals(balance, 772.99805F);

	}

}