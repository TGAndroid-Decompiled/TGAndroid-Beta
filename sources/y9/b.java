package y9;
public final class b implements ia.d {
    public static final b f50574a = new Object();
    public static final ia.c f50575b = ia.c.c("pid");
    public static final ia.c f50576c = ia.c.c("processName");
    public static final ia.c d = ia.c.c("reasonCode");
    public static final ia.c f50577e = ia.c.c("importance");
    public static final ia.c f50578f = ia.c.c("pss");
    public static final ia.c f50579g = ia.c.c("rss");
    public static final ia.c h = ia.c.c("timestamp");
    public static final ia.c f50580i = ia.c.c("traceFile");
    public static final ia.c f50581j = ia.c.c("buildIdMappingForArch");

    @Override
    public final void a(Object obj, Object obj2) {
        ia.e eVar = (ia.e) obj2;
        b0 b0Var = (b0) ((g1) obj);
        eVar.e(f50575b, b0Var.f50582a);
        eVar.a(f50576c, b0Var.f50583b);
        eVar.e(d, b0Var.f50584c);
        eVar.e(f50577e, b0Var.d);
        eVar.f(f50578f, b0Var.f50585e);
        eVar.f(f50579g, b0Var.f50586f);
        eVar.f(h, b0Var.f50587g);
        eVar.a(f50580i, b0Var.h);
        eVar.a(f50581j, b0Var.f50588i);
    }
}
