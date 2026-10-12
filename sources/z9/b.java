package z9;
public final class b implements ja.d {
    public static final b f49921a = new Object();
    public static final ja.c f49922b = ja.c.c("pid");
    public static final ja.c f49923c = ja.c.c("processName");
    public static final ja.c d = ja.c.c("reasonCode");
    public static final ja.c e = ja.c.c("importance");
    public static final ja.c f49924f = ja.c.c("pss");
    public static final ja.c f49925g = ja.c.c("rss");
    public static final ja.c h = ja.c.c("timestamp");
    public static final ja.c f49926i = ja.c.c("traceFile");
    public static final ja.c f49927j = ja.c.c("buildIdMappingForArch");

    @Override
    public final void a(Object obj, Object obj2) {
        ja.e eVar = (ja.e) obj2;
        b0 b0Var = (b0) ((g1) obj);
        eVar.g(f49922b, b0Var.f49928a);
        eVar.d(f49923c, b0Var.f49929b);
        eVar.g(d, b0Var.f49930c);
        eVar.g(e, b0Var.d);
        eVar.f(f49924f, b0Var.e);
        eVar.f(f49925g, b0Var.f49931f);
        eVar.f(h, b0Var.f49932g);
        eVar.d(f49926i, b0Var.h);
        eVar.d(f49927j, b0Var.f49933i);
    }
}
