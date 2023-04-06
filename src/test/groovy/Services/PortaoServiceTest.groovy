package Services

import groovy.test.GroovyTestCase
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test


class PortaoServiceTest extends GroovyTestCase{

	static PortaoService portaoService

	@BeforeAll
	static void instanciaPortaoService(){
		portaoService = new PortaoService()
	}

	@Test
	void comando1Test() {
		//given
		String entrada           = "..P...O....."
		String resultadoEsperado = "n= 1, tp=  7 | 001234555555"

		//when
		String resultadoObtido = portaoService.execute(entrada)

		//then
		assertEquals(resultadoEsperado, resultadoObtido )
	}

	@Test
	void comando2Test() {
		//given
		String entrada           = ".P...."
		String resultadoEsperado = "n= 0, tp=  1 | 012345"

		//when
		String resultadoObtido = portaoService.execute(entrada)

		//then
		assertEquals(resultadoEsperado, resultadoObtido )
	}

	@Test
	void comando3Test() {
		//given
		String entrada           = "...P.P...P.."
		String resultadoEsperado = "n= 0, tp=  7 | 000122222345"

		//when
		String resultadoObtido = portaoService.execute(entrada)

		//then
		assertEquals(resultadoEsperado, resultadoObtido )
	}

	@Test
	void comando4Test() {
		//given
		String entrada           = "P..O.."
		String resultadoEsperado = "n= 1, tp=  1 | 123455"

		//when
		String resultadoObtido = portaoService.execute(entrada)

		//then
		assertEquals(resultadoEsperado, resultadoObtido )
	}

	@Test
	void comando5Test() {
		//given
		String entrada           = "P....P....."
		String resultadoEsperado = "n= 0, tp=  1 | 12345432100"

		//when
		String resultadoObtido = portaoService.execute(entrada)

		//then
		assertEquals(resultadoEsperado, resultadoObtido )
	}

	@Test
	void comando6Test() {
		//given
		String entrada           = "P..P...PO..."
		String resultadoEsperado = "n= 1, tp=  7 | 123333345555"

		//when
		String resultadoObtido = portaoService.execute(entrada)

		//then
		assertEquals(resultadoEsperado, resultadoObtido )
	}

	@Test
	void comando7Test() {
		//given
		String entrada           = "P...O.O.P...P.."
		String resultadoEsperado = "n= 2, tp=  6 | 123455554321111"

		//when
		String resultadoObtido = portaoService.execute(entrada)

		//then
		assertEquals(resultadoEsperado, resultadoObtido )
	}

	@Test
	void comando8Test() {
		//given
		String entrada           = "P.....P.P..P..."
		String resultadoEsperado = "n= 0, tp=  5 | 123455433332100"

		//when
		String resultadoObtido = portaoService.execute(entrada)

		//then
		assertEquals(resultadoEsperado, resultadoObtido )
	}

	@Test
	void comando9Test() {
		//given
		String entrada           = "P.....P..O...."
		String resultadoEsperado = "n= 1, tp=  3 | 12345543234555"

		//when
		String resultadoObtido = portaoService.execute(entrada)

		//then
		assertEquals(resultadoEsperado, resultadoObtido )
	}

	@Test
	void comando10Test() {
		//given
		String entrada           = "P.......P...O...OP.O."
		String resultadoEsperado = "n= 3, tp=  4 | 123455554321234554345"

		//when
		String resultadoObtido = portaoService.execute(entrada)

		//then
		assertEquals(resultadoEsperado, resultadoObtido )
	}

	@Test
	void comando11Test() {
		//given
		String entrada           = "..P...O....."
		String resultadoEsperado = "n= 1, tp=  7 | 001234555555"

		//when
		String resultadoObtido = portaoService.execute(entrada)

		//then
		assertEquals(resultadoEsperado, resultadoObtido )
	}

	@Test
	void comando12Test() {
		//given
		String entrada           = "..P........"
		String resultadoEsperado = "n= 0, tp=  6 | 00123455555"

		//when
		String resultadoObtido = portaoService.execute(entrada)

		//then
		assertEquals(resultadoEsperado, resultadoObtido )
	}

	@Test
	void comando13Test() {
		//given
		String entrada           = "..P...O....."
		String resultadoEsperado = "n= 1, tp=  7 | 001234555555"

		//when
		String resultadoObtido = portaoService.execute(entrada)

		//then
		assertEquals(resultadoEsperado, resultadoObtido )
	}

	@Test
	void comando14Test() {
		//given
		String entrada           = "..PP...O....."
		String resultadoEsperado = "n= 1, tp=  10 | 0013555555555"

		//when
		String resultadoObtido = portaoService.execute(entrada)

		//then
		assertEquals(resultadoEsperado, resultadoObtido )
	}

	@Test
	void comando15Test() {
		//given
		String entrada           = "..PP...P.O....."
		String resultadoEsperado = "n= 1, tp=  8 | 001355531355555"

		//when
		String resultadoObtido = portaoService.execute(entrada)

		//then
		assertEquals(resultadoEsperado, resultadoObtido )
	}

	@Test
	void comando16Test() {
		//given
		String entrada           = "..PPP..O....."
		String resultadoEsperado = "n= 1, tp=  8 | 0011234555555"

		//when
		String resultadoObtido = portaoService.execute(entrada)

		//then
		assertEquals(resultadoEsperado, resultadoObtido )
	}

	@Test
	void comando17Test() {
		//given
		String entrada           = "..PPO..O......"
		String resultadoEsperado = "n= 2, tp=  13 | 00111111111111"

		//when
		String resultadoObtido = portaoService.execute(entrada)

		//then
		assertEquals(resultadoEsperado, resultadoObtido )
	}

	@Test
	void comando18Test() {
		//given
		String entrada           = "..PP...P.PP.P...O.....POP...."
		String resultadoEsperado = "n= 2, tp=  11 | 00135553110012345555554543210"

		//when
		String resultadoObtido = portaoService.execute(entrada)

		//then
		assertEquals(resultadoEsperado, resultadoObtido )
	}

	@Test
	void comando19Test() {
		//given
		String entrada           = "..PP...P.PP.P...O.....PP.P..PPP...."
		String resultadoEsperado = "n= 1, tp=  14 | 00135553110012345555554443211012345"

		//when
		String resultadoObtido = portaoService.execute(entrada)

		//then
		assertEquals(resultadoEsperado, resultadoObtido )
	}


}
