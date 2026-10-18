package z9;
public final class b implements ja.d {
    public static final b f51305a = new Object();
    public static final ja.c f51306b = ja.c.c("pid");
    public static final ja.c f51307c = ja.c.c("processName");
    public static final ja.c d = ja.c.c("reasonCode");
    public static final ja.c e = ja.c.c("importance");
    public static final ja.c f51308f = ja.c.c("pss");
    public static final ja.c f51309g = ja.c.c("rss");
    public static final ja.c h = ja.c.c("timestamp");
    public static final ja.c f51310i = ja.c.c("traceFile");
    public static final ja.c f51311j = ja.c.c("buildIdMappingForArch");

    @Override
    public final void a(Object obj, Object obj2) {
        ja.e eVar = (ja.e) obj2;
        b0 b0Var = (b0) ((g1) obj);
        eVar.g(f51306b, b0Var.f51312a);
        eVar.d(f51307c, b0Var.f51313b);
        eVar.g(d, b0Var.f51314c);
        eVar.g(e, b0Var.d);
        eVar.f(f51308f, b0Var.e);
        eVar.f(f51309g, b0Var.f51315f);
        eVar.f(h, b0Var.f51316g);
        eVar.d(f51310i, b0Var.h);
        eVar.d(f51311j, b0Var.f51317i);
    }
}
