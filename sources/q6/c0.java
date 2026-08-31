package q6;
public enum c0 implements a {
    RS256(-257),
    RS384(-258),
    RS512(-259),
    LEGACY_RS1(-262),
    PS256(-37),
    PS384(-38),
    PS512(-39),
    RS1(-65535);
    
    public final int f44653a;

    c0(int i10) {
        this.f44653a = i10;
    }

    @Override
    public final int a() {
        return this.f44653a;
    }
}
