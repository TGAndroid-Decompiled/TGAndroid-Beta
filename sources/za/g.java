package za;
public final class g implements ia.d {
    public static final g f48718a = new Object();
    public static final ia.c f48719b = ia.c.c("eventType");
    public static final ia.c f48720c = ia.c.c("sessionData");
    public static final ia.c d = ia.c.c("applicationInfo");

    @Override
    public final void a(Object obj, Object obj2) {
        c0 c0Var = (c0) obj;
        ia.e eVar = (ia.e) obj2;
        c0Var.getClass();
        eVar.a(f48719b, l.SESSION_START);
        eVar.a(f48720c, c0Var.f48700a);
        eVar.a(d, c0Var.f48701b);
    }
}
