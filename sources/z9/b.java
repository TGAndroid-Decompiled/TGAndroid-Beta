package z9;
public final class b implements ja.d {
    public static final b f55224a = new Object();
    public static final ja.c f55225b = ja.c.c("pid");
    public static final ja.c f55226c = ja.c.c("processName");
    public static final ja.c d = ja.c.c("reasonCode");
    public static final ja.c e = ja.c.c("importance");
    public static final ja.c f55227f = ja.c.c("pss");
    public static final ja.c f55228g = ja.c.c("rss");
    public static final ja.c h = ja.c.c("timestamp");
    public static final ja.c f55229i = ja.c.c("traceFile");
    public static final ja.c f55230j = ja.c.c("buildIdMappingForArch");

    @Override
    public final void a(Object obj, Object obj2) {
        ja.e eVar = (ja.e) obj2;
        b0 b0Var = (b0) ((g1) obj);
        eVar.g(f55225b, b0Var.f55231a);
        eVar.d(f55226c, b0Var.f55232b);
        eVar.g(d, b0Var.f55233c);
        eVar.g(e, b0Var.d);
        eVar.f(f55227f, b0Var.e);
        eVar.f(f55228g, b0Var.f55234f);
        eVar.f(h, b0Var.f55235g);
        eVar.d(f55229i, b0Var.h);
        eVar.d(f55230j, b0Var.f55236i);
    }
}
