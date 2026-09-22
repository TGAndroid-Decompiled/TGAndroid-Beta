package za;
public final class g implements ia.d {
    public static final g f48771a = new Object();
    public static final ia.c f48772b = ia.c.c("eventType");
    public static final ia.c f48773c = ia.c.c("sessionData");
    public static final ia.c d = ia.c.c("applicationInfo");

    @Override
    public final void a(Object obj, Object obj2) {
        a0 a0Var = (a0) obj;
        ia.e eVar = (ia.e) obj2;
        a0Var.getClass();
        eVar.a(f48772b, k.SESSION_START);
        eVar.a(f48773c, a0Var.f48736a);
        eVar.a(d, a0Var.f48737b);
    }
}
