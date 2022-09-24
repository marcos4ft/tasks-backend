package br.ce.wcaquino.taskbackend.utils;

import java.time.LocalDate;

import org.junit.Assert;
import org.junit.Test;

public class DateuUtilsTest {

	@Test
	public void deveRetornarTrueParaDatasFuturas() {
		LocalDate date = LocalDate.of(2030, 01, 01);
		Assert.assertTrue(DateUtils.isEqualOrFutureDate(date));
	}
	
	@Test
	public void deveRetornarFalseParaDatasPassadas() {
		LocalDate date = LocalDate.of(2020, 01, 01);
		Assert.assertTrue(DateUtils.isEqualOrFutureDate(date));
	}
	
	@Test
	public void deveRetornarTrueParaDataDeHoje() {
		LocalDate date = LocalDate.now();
		Assert.assertTrue(DateUtils.isEqualOrFutureDate(date));
	}
}
