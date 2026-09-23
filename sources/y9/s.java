package y9;
public final class s implements ia.d {
    public static final s f46572a = new Object();
    public static final ia.c f46573b = ia.c.c("batteryLevel");
    public static final ia.c f46574c = ia.c.c("batteryVelocity");
    public static final ia.c d = ia.c.c("proximityOn");
    public static final ia.c e = ia.c.c("orientation");
    public static final ia.c f46575f = ia.c.c("ramUsed");
    public static final ia.c f46576g = ia.c.c("diskUsed");

    @Override
    public final void a(Object obj, Object obj2) {
        ia.e eVar = (ia.e) obj2;
        u0 u0Var = (u0) ((v1) obj);
        eVar.a(f46573b, u0Var.f46590a);
        eVar.e(f46574c, u0Var.f46591b);
        eVar.c(d, u0Var.f46592c);
        eVar.e(e, u0Var.d);
        eVar.f(f46575f, u0Var.e);
        eVar.f(f46576g, u0Var.f46593f);
    }
}
