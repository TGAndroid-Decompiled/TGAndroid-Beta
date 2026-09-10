package y9;
public final class s implements ia.d {
    public static final s f46768a = new Object();
    public static final ia.c f46769b = ia.c.c("batteryLevel");
    public static final ia.c f46770c = ia.c.c("batteryVelocity");
    public static final ia.c d = ia.c.c("proximityOn");
    public static final ia.c e = ia.c.c("orientation");
    public static final ia.c f46771f = ia.c.c("ramUsed");
    public static final ia.c f46772g = ia.c.c("diskUsed");

    @Override
    public final void a(Object obj, Object obj2) {
        ia.e eVar = (ia.e) obj2;
        u0 u0Var = (u0) ((v1) obj);
        eVar.a(f46769b, u0Var.f46786a);
        eVar.e(f46770c, u0Var.f46787b);
        eVar.c(d, u0Var.f46788c);
        eVar.e(e, u0Var.d);
        eVar.f(f46771f, u0Var.e);
        eVar.f(f46772g, u0Var.f46789f);
    }
}
