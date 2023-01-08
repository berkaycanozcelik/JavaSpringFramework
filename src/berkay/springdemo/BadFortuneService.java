package berkay.springdemo;

public class BadFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "It is such a bad day";
    }
}
