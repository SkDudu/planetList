package mobile.unifor.planetlist.repository

import mobile.unifor.planetlist.R
import mobile.unifor.planetlist.model.Planets

object PlanetRepository {

    fun findAll():List<Planets>{
        return listOf(
            Planets(
                1,
                R.drawable.sun,
                "Sol",
                1391000,
                0,
                "O componente central e principal fonte de energia do Sistema Solar, o Sol, embora seja o astro mais luminoso quando visto do nosso planeta, é uma estrela relativamente pequena e comum na Via Láctea, com um raio de aproximadamente setecentos mil quilômetros. É constituído essencialmente por hidrogênio e hélio ionizados, mantidos coesos sob forma aproximadamente esférica graças à ação da gravidade. Consequentemente, a imensa pressão e temperatura em seu núcleo são suficientes para que ocorra o processo de fusão nuclear, no qual há a conversão de núcleos de hidrogênio em núcleos de hélio e liberação de energia. A estrela emite radiação em praticamente todo o espectro eletromagnético, sobretudo na forma de luz visível."
            ),

            Planets(
                2,
                2,
                "Mercúrio",
                4880,
                57910000,
                "O planeta mais próximo do Sol, que gasta somente oitenta e oito dias para completar seu período de translação, possui uma aparência acinzentada com inúmeras marcas de impactos que lembram a superfície lunar. Na topografia de Mercúrio, destacam-se as áreas planas, as crateras de impacto e as cadeias montanhosas sinuosas, formadas pela contração da crosta durante o período de resfriamento do planeta. Mercúrio possui uma atmosfera extremamente rarefeita, formada somente de partículas retidas do vento solar que logo se perdem devido à intensa radiação oriunda da estrela. Por isso, a temperatura na superfície chega a ultrapassar 420 graus Celsius durante o dia e cai drasticamente durante a noite, atingindo -180 °C. Também por causa da ausência de uma atmosfera substancial que pudesse desencadear processos erosivos, conservaram-se registros dos impactos de meteoroides, asteroides e cometas que ocorreram há bilhões de anos[nota 1] e que deixaram marcas por vezes extensas, como a bacia Caloris, com mais de 1 500 quilômetros de diâmetro. Mercúrio é o segundo planeta mais denso do Sistema Solar, com um núcleo metálico cujo raio equivale a 75% do total do planeta e que é responsável pela manutenção de um fraco campo magnético. Existem evidências da presença de água sob a forma de gelo em crateras profundas nos polos norte e sul que nunca recebem a luz do Sol diretamente."
            ),

            Planets(
                3,
                3,
                "Vênus",
                12104,
                108200000,
                "O segundo planeta a partir do Sol possui tamanho, composição e massa similares à Terra. Contudo, o seu período de rotação é de 243 dias, superior ao tempo que Vênus leva a completar uma órbita ao redor do Sol, pelo que um dia venusiano é mais longo que um ano venusiano. Apesar de o núcleo ferroso de Vênus ser similar ao da Terra, a rotação extremamente lenta de Vênus não permite a existência de um campo magnético. A atmosfera venusiana, extraordinariamente espessa e violenta, é composta primariamente por dióxido de carbono e vapores de ácido sulfúrico na forma de nuvens permanentes que envolvem todo o planeta. Como consequência, além de uma intensa pressão atmosférica (noventa vezes superior à pressão atmosférica terrestre), ocorre um superefeito estufa que faz com que a temperatura na superfície atinja mais de 470 graus Celsius.A cobertura permanente de nuvens impede a observação direta das características da superfície, pelo que o seu mapeamento é efetuado por meio de radar e de sondas enviadas ao planeta. Tais pesquisas sugerem que o relevo de Vênus foi alterado em quase sua totalidade por ação da atividade vulcânica entre trezentos e quinhentos milhões de anos atrás. Em seu estado atual destacam-se duas regiões elevadas, a Terra de Ishtar e a Terra de Afrodite, além dos Montes Maxwell, um maciço montanhoso onde se localiza o ponto mais alto do planeta, comparável ao Monte Everest na Terra. Na geografia do planeta são igualmente característicos diversos canais que se estendem por milhares de quilômetros, criados por fluxos de lava."
            ),

            Planets(
                4,
                4,
                "Terra",
                12756,
                149600000,
                "O maior planeta telúrico e o quinto maior do Sistema Solar, é o terceiro a contar do Sol. Seu núcleo é constituído principalmente por ferro, ao redor do qual encontra-se uma camada de rochas fundidas, por sua vez cercada por uma crosta relativamente fina e dividida em placas tectônicas em constante movimento, responsáveis pelas atividades sísmica e vulcânica na Terra. O núcleo metálico e a rotação do planeta permitem a formação de um substancial campo magnético. Com mais de setenta por cento de sua superfície coberta por água, a Terra apresenta uma peculiaridade em relação aos demais planetas, já que é o único conhecido a abrigar vida. Os seres que nele habitam influenciam a composição e a dinâmica da atmosfera terrestre, formada principalmente por nitrogênio e oxigênio. A inclinação do eixo de rotação é responsável pela ocorrência de estações que regulam o clima. Nosso planeta possui somente um satélite natural, a Lua. Como praticamente não possui atmosfera nem está sujeita a outros agentes erosivos, a superfície lunar encontra-se coberta por marcas de impacto de outros corpos na forma de inúmeras crateras. Visualmente, a Lua é dividida em duas regiões conforme sua coloração: as terras altas, geralmente mais claras, e os mares, bacias de impacto preenchidas com lava que se mostram mais escuras. O período de rotação do satélite (cerca de 27 dias) é exatamente igual ao período de translação em torno da Terra, o que faz com que a Lua tenha sempre a mesma face voltada para o planeta (fenômeno denominado rotação sincronizada). Dentre as influências que a presença da Lua provoca na Terra, pode-se ressaltar a ocorrência das marés e a estabilidade no eixo de rotação do planeta.[nota 5][35] As primeiras sondas para explorar o satélite foram enviadas em 1959 e, dez anos depois, uma missão tripulada veio a realizar uma alunissagem, o que fez da Lua o primeiro e único corpo celeste visitado por humanos até o presente."
            ),
            Planets(
                5,
                5,
                "Marte",
                6794,
                227940000,
                "O planeta telúrico mais afastado do Sol passou a ser um mundo intrigante a partir do advento das observações telescópicas. Exibindo calotas polares variáveis e características superficiais mutantes, levantava suspeitas da possível existência de vida fora da Terra. Contudo, após o envio de sondas e exploradores robóticos, descobriu-se que Marte é um planeta desértico e não se constatou a existência de seres vivos. Entretanto, a sonda Mars Reconnaissance Orbiter revelou veios de água salgada que fluem em regiões montanhosas nos meses mais quentes do planeta, aumentando a possibilidade da existência de vida micro-orgânica.[37] Com metade do tamanho da Terra, apresenta acidentes geográficos notáveis, como o Monte Olimpo, o maior vulcão extinto do Sistema Solar, com altitude três vezes maior do que a do Monte Everest, e o Valles Marineris, um sistema de cânions que se estende por mais de três mil quilômetros na região equatorial. A atmosfera marciana, embora bem mais rarefeita do que a atmosfera terrestre, pode apresentar tempestades globais durante semanas, que levantam a poeira da superfície (rica em minérios de ferro, daí a coloração avermelhada predominante) e alteram completamente as características visuais do planeta. Por vezes formam-se nuvens de vapor de água e neblina sobre vales e crateras, provocando eventuais precipitações sob a forma de neve nas calotas polares. Evidências geológicas sugerem que Marte já foi um planeta rico em água, cuja quantidade teria sido suficiente para escavar os vales existentes atualmente, o que reforça também a possibilidade de o planeta, em determinado momento de sua história, ter abrigado alguma forma de vida. Marte possui dois satélites naturais, Fobos e Deimos, ambos de reduzidas dimensões e formato irregular, tratando-se provavelmente de asteroides capturados pela gravidade do planeta."
            ),
            Planets(
                6,
                6,
                "Júpiter",
                142984,
                778330000,
                "O maior e mais massivo planeta do Sistema Solar exibe peculiares faixas multicoloridas criadas por fortíssimos ventos que percorrem faixas longitudinais na parte superior de sua atmosfera. Frequentemente surgem nessas bandas vórtices e sistemas de tempestades circulares, como a Grande Mancha Vermelha, uma tormenta maior que a Terra que já dura por séculos. Dentre os gases que compõem sua atmosfera, hidrogênio e hélio são os mais abundantes, seguidos por pequenas frações de vapor d'água, metano e amônia.[42] Nas camadas gasosas inferiores do planeta, a pressão atmosférica é suficiente para liquefazer o hidrogênio. Já nas camadas mais internas do planeta, o mesmo elemento adquire propriedades metálicas e se torna eletricamente condutivo, dando origem, através do fluxo de cargas elétricas, a um poderoso campo magnético cuja intensidade é vinte mil vezes superior ao que é produzido pela Terra. O número total de satélites naturais de Júpiter excede 60, sendo que os quatro maiores e mais notáveis recebem a denominação particular de luas galileanas, por ter sido Galileu Galilei quem as primeiro observou por meio de um telescópio em 1610. Numa órbita interior à dos outros três, Io é o corpo geologicamente mais ativo do Sistema Solar, com vários vulcões continuamente renovando a matéria em sua superfície.[nota 6][44] Europa atrai especial atenção devido à expectativa de que alguma forma de vida habite o imenso oceano de água em estado líquido (cujo volume pode exceder o dobro de toda a água da Terra) que se considera existir sob a camada de gelo que envolve a lua. Ganimedes, o maior satélite natural no Sistema Solar e o único que mantém seu próprio campo magnético, ultrapassa as dimensões de Mercúrio. Por fim, a superfície extremamente antiga e repleta de crateras de Calisto é uma recordação visível dos eventos que ocorreram no início da história do Sistema Solar. Outra peculiaridade desses satélites são suas interações gravitacionais; Io, por exemplo, oscila entre a atração gravitacional exercida por Júpiter e a que sofre por parte de Europa e Ganimedes. Tal como acontece com a Lua, que mostra sempre a mesma face voltada para a Terra, também as luas de Galileu apresentam uma rotação sincronizada com Júpiter, provocando o mesmo efeito. O planeta possui ainda um tênue sistema de anéis, de difícil observação por ser formado de minúsculas partículas de baixo albedo."
            ),
            Planets(
                7,
                7,
                "Saturno",
                120536,
                1429400000,
                "O segundo maior planeta do Sistema Solar possui uma composição semelhante à de Júpiter, rica em hidrogênio e hélio. Sua atmosfera, em função do calor irradiado do interior de Saturno, apresenta-se em constante turbulência, com ventos de mais de 1 800 quilômetros por hora que criam bandas visíveis nas suas camadas superiores em tons de amarelo e dourado. Embora mais fraco que o de Júpiter, o campo magnético do planeta ainda é quinhentas vezes mais intenso que o terrestre. Contudo, a característica mais notável de Saturno é seu impressionante sistema de anéis, formado essencialmente por fragmentos de gelo que se espalham por faixas, com milhares de quilômetros de extensão e paralelo ao equador do planeta. Sua espessura média é de apenas dez metros, nunca excedendo 1,5 quilômetro, e a maioria dos corpos que o compõem apresentam tipicamente dimensões entre um centímetro e dez metros. Os satélites naturais de Saturno ostentam peculiaridades únicas no Sistema Solar. O maior deles, Titã, é envolvido por uma espessa atmosfera composta principalmente de nitrogênio, provavelmente similar à da Terra antes do surgimento das primeiras formas de vida. Jápeto possui um hemisfério com coloração brilhante e outro escuro, além de uma cordilheira que se estende exatamente sobre seu equador. Mimas apresenta uma cratera gigantesca resultante de um impacto que quase rompeu o satélite ao meio. Rico em gelo, Encélado mostra indícios de atividade vulcânica, com ejeções de vapor de água no hemisfério sul. No total, Saturno possui 53 satélites naturais, muitos deles descobertos somente através de sondas espaciais."
            ),
            Planets(
                8,
                8,
                "Urano",
                51118,
                2870990000,
                "O sétimo planeta a partir do Sol foi o primeiro a ser descoberto com o auxílio de um telescópio em 1781. À semelhança de Vênus, o sentido de rotação de Urano é retrógrado relativamente ao da maioria dos corpos do Sistema Solar. Além disso, seu eixo de rotação é extremamente inclinado, fazendo com que cada um dos polos do planeta fique diretamente voltado para o Sol durante um longo período. A atmosfera de Urano, formada principalmente de hidrogênio e hélio, além de uma pequena quantidade de metano (responsável pela coloração azul-esverdeada) e água, mostra-se dinâmica conforme as mudanças de estação do planeta. No seu interior, possivelmente se aloja uma camada líquida de água, metano e amônia. Também possui um sistema de anéis com faixas estreitas e composto por partículas escuras nos anéis mais internos e brilhantes nos mais externos. Os satélites naturais de Urano, que totalizam 27, foram designados segundo os nomes de personagens das obras de William Shakespeare e da sátira The Rape of the Lock (\"O Rapto da Madeixa\") de Alexander Pope, exceção à prática mais corrente de se associarem às luas nomes de figuras da mitologia greco-romana. Oberon e Titânia são os maiores corpos que orbitam o planeta, enquanto Ariel tem a superfície mais brilhante e possivelmente a mais recente dentre os satélites de Urano, com poucas crateras de impacto. Miranda, por sua vez, apresenta intrigantes cânions onde áreas cuja superfície parece antiga se estendem ao lado de outras de aspecto recente. Todos estes satélites aparentam ser formados de uma mistura entre rochas e gelo. Os demais corpos ao redor de Urano provavelmente são asteroides capturados pela gravidade do planeta."
            ),
            Planets(
                9,
                9,
                "netuno",
                49532,
                4504000000,
                "O gigante e gelado Netuno é o planeta mais afastado do Sol e foi o primeiro a ser localizado a partir de cálculos matemáticos em vez de observações regulares do céu. Sua busca foi motivada por se terem constatado irregularidades na órbita de Urano que só poderiam ser explicadas pela interação com um corpo de massa considerável ainda desconhecido. Observações subsequentes da área onde Netuno se deveria encontrar, segundo os resultados calculados, vieram comprovar a sua existência. A extremamente violenta atmosfera netuniana, com ventos cuja velocidade máxima de 1 200 km/h excede nove vezes a dos mais intensos que ocorrem na Terra, apresenta relevante porcentagem de metano, responsável por sua coloração azulada. Frequentemente surgem sistemas de tempestades circulares no planeta, como a grande mancha escura, um sistema anticiclônico maior que a Terra que desapareceu alguns anos após ser fotografado pela sonda Voyager 2. Presume-se que as camadas intermediárias de Netuno sejam formadas por compostos gelados, como amônia e água, ao redor de um núcleo rochoso. Dos quatorze satélites naturais conhecidos de Netuno, o maior e mais intrigante é Tritão, que orbita o planeta em direção oposta à dos demais, o que sugere que tenha sido capturado pelo planeta no passado distante. Apesar de extremamente gelado (com temperaturas inferiores a -230 graus Celsius), apresenta formações semelhantes a gêiseres que expelem gelo da superfície a uma altura de 8 km, além de uma tênue atmosfera que, por razões desconhecidas, está se tornando mais quente. Muitas das outras luas são pequenas e escuras, razão pela qual foram descobertas somente após o envio de sondas espaciais. O sistema de anéis do planeta exibe diversas irregularidades, sendo preenchido de forma muito desigual, que não só apresentam indícios de serem recentes como também efêmeras."
            ),
            Planets(
                9,
                9,
                "Ceres - Planeta anão",
                952,
                4140000000,
                "Ceres é o maior objeto no cinturão de asteroides entre Marte e Júpiter, com 952 km de diâmetro, e o único planeta anão localizado no sistema solar interno. Foi o primeiro membro do cinturão de asteroides a ser descoberto quando Giuseppe Piazzi o avistou em 1801. E quando Dawn chegou em 2015, Ceres se tornou o primeiro planeta anão a receber a visita de uma nave espacial. Este planeta leva 1 682 dias terrestres, ou 4,6 anos terrestres, para fazer uma viagem ao redor do Sol. Ele completa uma rotação a cada 9 horas, tornando a duração do seu dia uma das mais curtas do Sistema Solar. Sua superfície é coberta por crateras pequenas e jovens, mas nenhuma tem mais de 280 quilômetros de diâmetro. Isso é surpreendente, dado que o planeta anão deve ter sido atingido por vários grandes asteroides durante sua vida de 4,5 bilhões de anos."
            ),
            Planets(
                10,
                10,
                "Plutão - Planeta anão",
                2374,
                5913520000,
                "Plutão, o maior planeta anão do Sistema Solar, tem 2 374 km de diâmetro. Foi descoberto em 1930 e por muito tempo foi considerado um desajustado ou uma anomalia no Sistema Solar. No entanto, a descoberta de 1992 do Cinturão de Kuiper - uma região em forma de toro além da órbita de Netuno e a maior estrutura em nosso sistema planetário de três zonas - forneceu um novo contexto, mostrando Plutão como o maior de uma nova classe de pequenos planetas formados no Sistema Solar externo durante a antiga era de acréscimo planetário, ~ 4,5 bilhões de anos atrás. Em 14 de julho de 2015, a nave espacial New Horizons da NASA fez seu voo histórico através do sistema de Plutão - fornecendo imagens mais detalhadas do planeta anão e de suas luas e coletando outros dados que transformaram nossa compreensão desses mundos na fronteira externa do Sistema Solar. Este planeta possui cinco satélites naturais: Caronte, Hidra, Nix, Cérbero e Estige. O maior deles é Caronte, que tem 1 212 quilômetros de diâmetro, cerca da metade que o planeta que orbita; as outras luas, Hídra, Nix, Cérbero e Estige têm 61, 46, 28 e 20 quilômetros de diâmetro, respectivamente."
            )
        )
    }

}