package za;
public final class h implements ia.d {
    public static final h f47901a = new Object();
    public static final ia.c f47902b = ia.c.c("sessionId");
    public static final ia.c f47903c = ia.c.c("firstSessionId");
    public static final ia.c d = ia.c.c("sessionIndex");
    public static final ia.c e = ia.c.c("eventTimestampUs");
    public static final ia.c f47904f = ia.c.c("dataCollectionStatus");
    public static final ia.c f47905g = ia.c.c("firebaseInstallationId");

    @Override
    public final void a(Object obj, Object obj2) {
        k0 k0Var = (k0) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f47902b, k0Var.f47924a);
        eVar.a(f47903c, k0Var.f47925b);
        eVar.e(d, k0Var.f47926c);
        eVar.f(e, k0Var.d);
        eVar.a(f47904f, k0Var.e);
        eVar.a(f47905g, k0Var.f47927f);
    }
}
