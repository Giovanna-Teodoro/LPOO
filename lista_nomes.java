public static List<String> nomes = new ArrayList<>();
    static{
        nomes.add("Leviathan");
        nomes.add("Medusa");
        nomes.add("Beemote");
        nomes.add("Godzilla");
        nomes.add("Quimera ");
        nomes.add("Strigoi");
        nomes.add("Yokai");
        nomes.add("Akuma");
        nomes.add("Baba Yaga");
        nomes.add("Asmodeus");
        nomes.add("Belzebu");
    }

    private static String selecionarNomeRandom(){
        Random  gerador = new Random();
        return nomes.get(gerador.nextInt(nomes.size()));
    }
