package xa;
public enum c implements ma.c {
    UNKNOWN_OS(0),
    ANDROID(1),
    IOS(2),
    WEB(3);
    
    public final int f48364a;

    c(int i10) {
        this.f48364a = i10;
    }

    @Override
    public final int a() {
        return this.f48364a;
    }
}
