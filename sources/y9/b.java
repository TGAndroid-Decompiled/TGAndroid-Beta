package y9;
public final class b implements ia.d {
    public static final b f50575a = new Object();
    public static final ia.c f50576b = ia.c.c("pid");
    public static final ia.c f50577c = ia.c.c("processName");
    public static final ia.c d = ia.c.c("reasonCode");
    public static final ia.c f50578e = ia.c.c("importance");
    public static final ia.c f50579f = ia.c.c("pss");
    public static final ia.c f50580g = ia.c.c("rss");
    public static final ia.c h = ia.c.c("timestamp");
    public static final ia.c f50581i = ia.c.c("traceFile");
    public static final ia.c f50582j = ia.c.c("buildIdMappingForArch");

    @Override
    public final void a(Object obj, Object obj2) {
        ia.e eVar = (ia.e) obj2;
        b0 b0Var = (b0) ((g1) obj);
        eVar.e(f50576b, b0Var.f50583a);
        eVar.a(f50577c, b0Var.f50584b);
        eVar.e(d, b0Var.f50585c);
        eVar.e(f50578e, b0Var.d);
        eVar.f(f50579f, b0Var.f50586e);
        eVar.f(f50580g, b0Var.f50587f);
        eVar.f(h, b0Var.f50588g);
        eVar.a(f50581i, b0Var.h);
        eVar.a(f50582j, b0Var.f50589i);
    }
}
