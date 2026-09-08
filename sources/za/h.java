package za;
public final class h implements ia.d {
    public static final h f51461a = new Object();
    public static final ia.c f51462b = ia.c.c("sessionId");
    public static final ia.c f51463c = ia.c.c("firstSessionId");
    public static final ia.c d = ia.c.c("sessionIndex");
    public static final ia.c f51464e = ia.c.c("eventTimestampUs");
    public static final ia.c f51465f = ia.c.c("dataCollectionStatus");
    public static final ia.c f51466g = ia.c.c("firebaseInstallationId");

    @Override
    public final void a(Object obj, Object obj2) {
        j0 j0Var = (j0) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f51462b, j0Var.f51479a);
        eVar.a(f51463c, j0Var.f51480b);
        eVar.e(d, j0Var.f51481c);
        eVar.f(f51464e, j0Var.d);
        eVar.a(f51465f, j0Var.f51482e);
        eVar.a(f51466g, j0Var.f51483f);
    }
}
