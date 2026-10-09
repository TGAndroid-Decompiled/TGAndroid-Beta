package za;
public final class e implements ia.d {
    public static final e f54210a = new Object();
    public static final ia.c f54211b = ia.c.c("performance");
    public static final ia.c f54212c = ia.c.c("crashlytics");
    public static final ia.c d = ia.c.c("sessionSamplingRate");

    @Override
    public final void a(Object obj, Object obj2) {
        j jVar = (j) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f54211b, jVar.f54250a);
        eVar.a(f54212c, jVar.f54251b);
        eVar.g(d, jVar.f54252c);
    }
}
