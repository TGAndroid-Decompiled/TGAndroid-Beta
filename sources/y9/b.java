package y9;
public final class b implements ia.d {
    public static final b f46784a = new Object();
    public static final ia.c f46785b = ia.c.c("pid");
    public static final ia.c f46786c = ia.c.c("processName");
    public static final ia.c d = ia.c.c("reasonCode");
    public static final ia.c e = ia.c.c("importance");
    public static final ia.c f46787f = ia.c.c("pss");
    public static final ia.c f46788g = ia.c.c("rss");
    public static final ia.c h = ia.c.c("timestamp");
    public static final ia.c f46789i = ia.c.c("traceFile");
    public static final ia.c f46790j = ia.c.c("buildIdMappingForArch");

    @Override
    public final void a(Object obj, Object obj2) {
        ia.e eVar = (ia.e) obj2;
        b0 b0Var = (b0) ((g1) obj);
        eVar.e(f46785b, b0Var.f46791a);
        eVar.a(f46786c, b0Var.f46792b);
        eVar.e(d, b0Var.f46793c);
        eVar.e(e, b0Var.d);
        eVar.f(f46787f, b0Var.e);
        eVar.f(f46788g, b0Var.f46794f);
        eVar.f(h, b0Var.f46795g);
        eVar.a(f46789i, b0Var.h);
        eVar.a(f46790j, b0Var.f46796i);
    }
}
