package za;
public final class g implements ia.d {
    public static final g f48801a = new Object();
    public static final ia.c f48802b = ia.c.c("eventType");
    public static final ia.c f48803c = ia.c.c("sessionData");
    public static final ia.c d = ia.c.c("applicationInfo");

    @Override
    public final void a(Object obj, Object obj2) {
        a0 a0Var = (a0) obj;
        ia.e eVar = (ia.e) obj2;
        a0Var.getClass();
        eVar.a(f48802b, k.SESSION_START);
        eVar.a(f48803c, a0Var.f48766a);
        eVar.a(d, a0Var.f48767b);
    }
}
