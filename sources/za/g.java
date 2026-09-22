package za;
public final class g implements ia.d {
    public static final g f49098a = new Object();
    public static final ia.c f49099b = ia.c.c("eventType");
    public static final ia.c f49100c = ia.c.c("sessionData");
    public static final ia.c d = ia.c.c("applicationInfo");

    @Override
    public final void a(Object obj, Object obj2) {
        a0 a0Var = (a0) obj;
        ia.e eVar = (ia.e) obj2;
        a0Var.getClass();
        eVar.a(f49099b, k.SESSION_START);
        eVar.a(f49100c, a0Var.f49063a);
        eVar.a(d, a0Var.f49064b);
    }
}
