package za;
public final class g implements ia.d {
    public static final g f53120a = new Object();
    public static final ia.c f53121b = ia.c.c("eventType");
    public static final ia.c f53122c = ia.c.c("sessionData");
    public static final ia.c d = ia.c.c("applicationInfo");

    @Override
    public final void a(Object obj, Object obj2) {
        a0 a0Var = (a0) obj;
        ia.e eVar = (ia.e) obj2;
        a0Var.getClass();
        eVar.a(f53121b, k.SESSION_START);
        eVar.a(f53122c, a0Var.f53081a);
        eVar.a(d, a0Var.f53082b);
    }
}
