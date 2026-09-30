package y9;
public final class s implements ia.d {
    public static final s f47005a = new Object();
    public static final ia.c f47006b = ia.c.c("batteryLevel");
    public static final ia.c f47007c = ia.c.c("batteryVelocity");
    public static final ia.c d = ia.c.c("proximityOn");
    public static final ia.c e = ia.c.c("orientation");
    public static final ia.c f47008f = ia.c.c("ramUsed");
    public static final ia.c f47009g = ia.c.c("diskUsed");

    @Override
    public final void a(Object obj, Object obj2) {
        ia.e eVar = (ia.e) obj2;
        u0 u0Var = (u0) ((v1) obj);
        eVar.a(f47006b, u0Var.f47023a);
        eVar.e(f47007c, u0Var.f47024b);
        eVar.c(d, u0Var.f47025c);
        eVar.e(e, u0Var.d);
        eVar.f(f47008f, u0Var.e);
        eVar.f(f47009g, u0Var.f47026f);
    }
}
