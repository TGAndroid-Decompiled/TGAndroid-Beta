package z9;
public final class b implements ja.d {
    public static final b f51307a = new Object();
    public static final ja.c f51308b = ja.c.c("pid");
    public static final ja.c f51309c = ja.c.c("processName");
    public static final ja.c d = ja.c.c("reasonCode");
    public static final ja.c e = ja.c.c("importance");
    public static final ja.c f51310f = ja.c.c("pss");
    public static final ja.c f51311g = ja.c.c("rss");
    public static final ja.c h = ja.c.c("timestamp");
    public static final ja.c f51312i = ja.c.c("traceFile");
    public static final ja.c f51313j = ja.c.c("buildIdMappingForArch");

    @Override
    public final void a(Object obj, Object obj2) {
        ja.e eVar = (ja.e) obj2;
        b0 b0Var = (b0) ((g1) obj);
        eVar.g(f51308b, b0Var.f51314a);
        eVar.d(f51309c, b0Var.f51315b);
        eVar.g(d, b0Var.f51316c);
        eVar.g(e, b0Var.d);
        eVar.f(f51310f, b0Var.e);
        eVar.f(f51311g, b0Var.f51317f);
        eVar.f(h, b0Var.f51318g);
        eVar.d(f51312i, b0Var.h);
        eVar.d(f51313j, b0Var.f51319i);
    }
}
