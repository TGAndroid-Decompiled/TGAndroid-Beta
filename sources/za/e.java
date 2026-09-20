package za;
public final class e implements ia.d {
    public static final e f49062a = new Object();
    public static final ia.c f49063b = ia.c.c("performance");
    public static final ia.c f49064c = ia.c.c("crashlytics");
    public static final ia.c d = ia.c.c("sessionSamplingRate");

    @Override
    public final void a(Object obj, Object obj2) {
        j jVar = (j) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f49063b, jVar.f49098a);
        eVar.a(f49064c, jVar.f49099b);
        eVar.g(d, jVar.f49100c);
    }
}
