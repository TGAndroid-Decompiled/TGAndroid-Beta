package za;
public final class g implements ia.d {
    public static final g f53093a = new Object();
    public static final ia.c f53094b = ia.c.c("eventType");
    public static final ia.c f53095c = ia.c.c("sessionData");
    public static final ia.c d = ia.c.c("applicationInfo");

    @Override
    public final void a(Object obj, Object obj2) {
        a0 a0Var = (a0) obj;
        ia.e eVar = (ia.e) obj2;
        a0Var.getClass();
        eVar.a(f53094b, k.SESSION_START);
        eVar.a(f53095c, a0Var.f53054a);
        eVar.a(d, a0Var.f53055b);
    }
}
