package za;
public final class e implements ia.d {
    public static final e f54212a = new Object();
    public static final ia.c f54213b = ia.c.c("performance");
    public static final ia.c f54214c = ia.c.c("crashlytics");
    public static final ia.c d = ia.c.c("sessionSamplingRate");

    @Override
    public final void a(Object obj, Object obj2) {
        j jVar = (j) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f54213b, jVar.f54252a);
        eVar.a(f54214c, jVar.f54253b);
        eVar.g(d, jVar.f54254c);
    }
}
