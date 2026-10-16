package z9;
public final class b implements ja.d {
    public static final b f49922a = new Object();
    public static final ja.c f49923b = ja.c.c("pid");
    public static final ja.c f49924c = ja.c.c("processName");
    public static final ja.c d = ja.c.c("reasonCode");
    public static final ja.c e = ja.c.c("importance");
    public static final ja.c f49925f = ja.c.c("pss");
    public static final ja.c f49926g = ja.c.c("rss");
    public static final ja.c h = ja.c.c("timestamp");
    public static final ja.c f49927i = ja.c.c("traceFile");
    public static final ja.c f49928j = ja.c.c("buildIdMappingForArch");

    @Override
    public final void a(Object obj, Object obj2) {
        ja.e eVar = (ja.e) obj2;
        b0 b0Var = (b0) ((g1) obj);
        eVar.g(f49923b, b0Var.f49929a);
        eVar.d(f49924c, b0Var.f49930b);
        eVar.g(d, b0Var.f49931c);
        eVar.g(e, b0Var.d);
        eVar.f(f49925f, b0Var.e);
        eVar.f(f49926g, b0Var.f49932f);
        eVar.f(h, b0Var.f49933g);
        eVar.d(f49927i, b0Var.h);
        eVar.d(f49928j, b0Var.f49934i);
    }
}
