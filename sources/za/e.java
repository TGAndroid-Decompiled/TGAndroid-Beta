package za;
public final class e implements ia.d {
    public static final e f53081a = new Object();
    public static final ia.c f53082b = ia.c.c("performance");
    public static final ia.c f53083c = ia.c.c("crashlytics");
    public static final ia.c d = ia.c.c("sessionSamplingRate");

    @Override
    public final void a(Object obj, Object obj2) {
        j jVar = (j) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f53082b, jVar.f53123a);
        eVar.a(f53083c, jVar.f53124b);
        eVar.g(d, jVar.f53125c);
    }
}
