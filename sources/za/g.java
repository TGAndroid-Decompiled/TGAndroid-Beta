package za;
public final class g implements ia.d {
    public static final g f47895a = new Object();
    public static final ia.c f47896b = ia.c.c("eventType");
    public static final ia.c f47897c = ia.c.c("sessionData");
    public static final ia.c d = ia.c.c("applicationInfo");

    @Override
    public final void a(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        ia.e eVar = (ia.e) obj2;
        b0Var.getClass();
        eVar.a(f47896b, k.SESSION_START);
        eVar.a(f47897c, b0Var.f47865a);
        eVar.a(d, b0Var.f47866b);
    }
}
