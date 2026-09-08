package wa;
public enum c implements la.c {
    UNKNOWN_OS(0),
    ANDROID(1),
    IOS(2),
    WEB(3);
    
    public final int f48497a;

    c(int i10) {
        this.f48497a = i10;
    }

    @Override
    public final int a() {
        return this.f48497a;
    }
}
