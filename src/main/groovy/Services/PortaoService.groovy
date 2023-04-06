package Services

import Model.Portao

class PortaoService {

    String execute(String entrada) {

        Portao portao = new Portao(resultado: "", situacao: "", posicao: 0, obstaculos: 0, tempoParado: 0, velocidadeDupla: false)

        for (int i = 0; i < entrada.size(); i++) {

            boolean TOTALMENTE_ABERTO = portao.posicao == 5
            boolean TOTALMENTE_FECHADO = portao.posicao == 0
            boolean OBSTACULO_ENQUANTO_FECHA = entrada[i] == "O" && portao.situacao != "PAUSOUABRINDO"
            boolean DUPLO_COMANDO = entrada[i - 1] == "P" && entrada[i + 1] != "P" && entrada[i + 1] != "O" && portao.situacao == "ABRINDO" || entrada[i - 1] == "P" && entrada[i + 1] != "P" && (entrada[i + 1] != "O" && portao.situacao == "FECHANDO")

            if (TOTALMENTE_ABERTO) {
                fecharPortao(entrada[i], portao)

            } else if (OBSTACULO_ENQUANTO_FECHA) {
                abrirPortao(entrada[i], portao)

            } else if (entrada[i] == "P") {
                if (TOTALMENTE_FECHADO) {
                    abrirPortao(entrada[i], portao)

                } else if(DUPLO_COMANDO){
                    duploComando(portao)
                }
                else {
                    alterarSituacao(portao)
                }
            } else {
                aguardandoComando(entrada[i], portao)
            }

            calcularResultado(portao)
        }
        return "n= ${portao.obstaculos}, tp=  ${portao.tempoParado} | ${portao.resultado}"

    }

    def fecharPortao(String entrada, Portao portao) {
        if (entrada == "P") {
            portao.situacao = "FECHANDO"
            portao.posicao--
        } else if (entrada == "O") {
            portao.obstaculos++
            portao.tempoParado++
            portao.velocidadeDupla = false
        } else {
            portao.tempoParado++
        }
    }

    def abrirPortao(String entrada, Portao portao) {
        if (entrada == "O") {
            portao.obstaculos++
        }
        portao.situacao = "ABRINDO"
        portao.posicao++
    }

    def alterarSituacao(Portao portao) {
        if (portao.situacao == "ABRINDO") {
            portao.situacao = "PAUSOUABRINDO"
            portao.tempoParado++

        } else if (portao.situacao == "PAUSOUABRINDO") {
            portao.situacao = "ABRINDO"
            portao.posicao++
            portao.velocidadeDupla = false

        } else if (portao.situacao == "FECHANDO") {
            portao.situacao = "PAUSOUFECHANDO"
            portao.tempoParado++

        } else if (portao.situacao == "PAUSOUFECHANDO") {
            portao.situacao = "FECHANDO"
            portao.posicao--
            portao.velocidadeDupla = false
        }
    }

    def duploComando(Portao portao) {
        if (portao.situacao == "ABRINDO") {
            portao.velocidadeDupla = true
            portao.posicao++

        } else if (portao.situacao == "FECHANDO") {
            portao.situacao = "PAUSOUFECHANDO"
            portao.tempoParado++
        }
    }

    def aguardandoComando(String entrada, Portao portao){
        if (portao.posicao == 0) {
            portao.tempoParado++

        } else if (portao.situacao == "ABRINDO") {
            portao.posicao++

        } else if (portao.situacao == "FECHANDO") {
            portao.posicao--

        } else if (entrada == "O") {
            portao.tempoParado++
            portao.obstaculos++
        } else {
            portao.tempoParado++
        }
    }

    def calcularResultado(Portao portao){
        if (portao.velocidadeDupla && (portao.posicao <= 4 && portao.posicao >= 1)) {
            if (portao.situacao == "ABRINDO") {
                portao.resultado += ++portao.posicao
            } else if (portao.situacao == "FECHANDO") {
                portao.resultado += --portao.posicao
            } else {
                portao.resultado += portao.posicao
            }
        } else {
            portao.resultado += portao.posicao
        }
    }
}





