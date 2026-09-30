package y9;
public final class b implements ia.d {
    public static final b f46848a = new Object();
    public static final ia.c f46849b = ia.c.c("pid");
    public static final ia.c f46850c = ia.c.c("processName");
    public static final ia.c d = ia.c.c("reasonCode");
    public static final ia.c e = ia.c.c("importance");
    public static final ia.c f46851f = ia.c.c("pss");
    public static final ia.c f46852g = ia.c.c("rss");
    public static final ia.c h = ia.c.c("timestamp");
    public static final ia.c f46853i = ia.c.c("traceFile");
    public static final ia.c f46854j = ia.c.c("buildIdMappingForArch");

    @Override
    public final void a(Object obj, Object obj2) {
        ia.e eVar = (ia.e) obj2;
        b0 b0Var = (b0) ((g1) obj);
        eVar.e(f46849b, b0Var.f46855a);
        eVar.a(f46850c, b0Var.f46856b);
        eVar.e(d, b0Var.f46857c);
        eVar.e(e, b0Var.d);
        eVar.f(f46851f, b0Var.e);
        eVar.f(f46852g, b0Var.f46858f);
        eVar.f(h, b0Var.f46859g);
        eVar.a(f46853i, b0Var.h);
        eVar.a(f46854j, b0Var.f46860i);
    }
}
