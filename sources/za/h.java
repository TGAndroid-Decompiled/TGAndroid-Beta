package za;
public final class h implements ia.d {
    public static final h f49086a = new Object();
    public static final ia.c f49087b = ia.c.c("sessionId");
    public static final ia.c f49088c = ia.c.c("firstSessionId");
    public static final ia.c d = ia.c.c("sessionIndex");
    public static final ia.c e = ia.c.c("eventTimestampUs");
    public static final ia.c f49089f = ia.c.c("dataCollectionStatus");
    public static final ia.c f49090g = ia.c.c("firebaseInstallationId");

    @Override
    public final void a(Object obj, Object obj2) {
        j0 j0Var = (j0) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f49087b, j0Var.f49101a);
        eVar.a(f49088c, j0Var.f49102b);
        eVar.e(d, j0Var.f49103c);
        eVar.f(e, j0Var.d);
        eVar.a(f49089f, j0Var.e);
        eVar.a(f49090g, j0Var.f49104f);
    }
}
