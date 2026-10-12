package z9;
public final class s implements ja.d {
    public static final s f50078a = new Object();
    public static final ja.c f50079b = ja.c.c("batteryLevel");
    public static final ja.c f50080c = ja.c.c("batteryVelocity");
    public static final ja.c d = ja.c.c("proximityOn");
    public static final ja.c e = ja.c.c("orientation");
    public static final ja.c f50081f = ja.c.c("ramUsed");
    public static final ja.c f50082g = ja.c.c("diskUsed");

    @Override
    public final void a(Object obj, Object obj2) {
        ja.e eVar = (ja.e) obj2;
        u0 u0Var = (u0) ((v1) obj);
        eVar.d(f50079b, u0Var.f50096a);
        eVar.g(f50080c, u0Var.f50097b);
        eVar.a(d, u0Var.f50098c);
        eVar.g(e, u0Var.d);
        eVar.f(f50081f, u0Var.e);
        eVar.f(f50082g, u0Var.f50099f);
    }
}
