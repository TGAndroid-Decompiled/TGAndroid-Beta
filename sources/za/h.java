package za;
public final class h implements ia.d {
    public static final h f54457a = new Object();
    public static final ia.c f54458b = ia.c.c("sessionId");
    public static final ia.c f54459c = ia.c.c("firstSessionId");
    public static final ia.c d = ia.c.c("sessionIndex");
    public static final ia.c f54460e = ia.c.c("eventTimestampUs");
    public static final ia.c f54461f = ia.c.c("dataCollectionStatus");
    public static final ia.c f54462g = ia.c.c("firebaseInstallationId");

    @Override
    public final void a(Object obj, Object obj2) {
        k0 k0Var = (k0) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f54458b, k0Var.f54482a);
        eVar.a(f54459c, k0Var.f54483b);
        eVar.e(d, k0Var.f54484c);
        eVar.f(f54460e, k0Var.d);
        eVar.a(f54461f, k0Var.f54485e);
        eVar.a(f54462g, k0Var.f54486f);
    }
}
