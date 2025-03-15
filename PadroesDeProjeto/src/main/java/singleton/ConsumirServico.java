package main.java.singleton;

public class ConsumirServico {

    private ConsumirServico() {};
    private static ConsumirServico instance = new ConsumirServico();
    public static ConsumirServico getInstance() {
        return instance;
    }

    private String urlServico;
    private String apiKey;

    public String getUrlServico() {
        return urlServico;
    }

    public void setUrlServico(String urlServico) {
        this.urlServico = urlServico;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

}