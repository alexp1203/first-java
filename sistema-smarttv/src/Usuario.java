public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status -> TV Ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status -> TV Ligada? " + smartTv.ligada);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume);

        System.out.println("Canal Atual: " + smartTv.canal);

        smartTv.mudarCanal(13);
        System.out.println("Canal atual: " + smartTv.canal);

    }
}

/*Criando um exemplo de uma classe para representar uma smartTV onde:
 * ela tenha caracteristicas: ligada (boolean) canal (int) e volume (int)
 * TV pode lgar e desligar mudando assim o estado ligada
 * TV pode aumentar ou diminuir o volume em +1 ou -1
 * TV pode mudar de canal de 1 em 1 ou definindo o numero do canal correspondente
 * 
 */