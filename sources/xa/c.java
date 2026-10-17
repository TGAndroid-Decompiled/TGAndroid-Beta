package xa;
public enum c implements ma.c {
    UNKNOWN_OS(0),
    ANDROID(1),
    IOS(2),
    WEB(3);
    
    public final int f49771a;

    c(int i10) {
        this.f49771a = i10;
    }

    @Override
    public final int a() {
        return this.f49771a;
    }
}
