package za;
public final class h implements ia.d {
    public static final h f48814a = new Object();
    public static final ia.c f48815b = ia.c.c("sessionId");
    public static final ia.c f48816c = ia.c.c("firstSessionId");
    public static final ia.c d = ia.c.c("sessionIndex");
    public static final ia.c e = ia.c.c("eventTimestampUs");
    public static final ia.c f48817f = ia.c.c("dataCollectionStatus");
    public static final ia.c f48818g = ia.c.c("firebaseInstallationId");

    @Override
    public final void a(Object obj, Object obj2) {
        j0 j0Var = (j0) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f48815b, j0Var.f48829a);
        eVar.a(f48816c, j0Var.f48830b);
        eVar.e(d, j0Var.f48831c);
        eVar.f(e, j0Var.d);
        eVar.a(f48817f, j0Var.e);
        eVar.a(f48818g, j0Var.f48832f);
    }
}
