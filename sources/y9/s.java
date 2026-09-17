package y9;
public final class s implements ia.d {
    public static final s f49902a = new Object();
    public static final ia.c f49903b = ia.c.c("batteryLevel");
    public static final ia.c f49904c = ia.c.c("batteryVelocity");
    public static final ia.c d = ia.c.c("proximityOn");
    public static final ia.c f49905e = ia.c.c("orientation");
    public static final ia.c f49906f = ia.c.c("ramUsed");
    public static final ia.c f49907g = ia.c.c("diskUsed");

    @Override
    public final void a(Object obj, Object obj2) {
        ia.e eVar = (ia.e) obj2;
        u0 u0Var = (u0) ((v1) obj);
        eVar.a(f49903b, u0Var.f49923a);
        eVar.e(f49904c, u0Var.f49924b);
        eVar.c(d, u0Var.f49925c);
        eVar.e(f49905e, u0Var.d);
        eVar.f(f49906f, u0Var.f49926e);
        eVar.f(f49907g, u0Var.f49927f);
    }
}
