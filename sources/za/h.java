package za;
public final class h implements ia.d {
    public static final h f53129a = new Object();
    public static final ia.c f53130b = ia.c.c("sessionId");
    public static final ia.c f53131c = ia.c.c("firstSessionId");
    public static final ia.c d = ia.c.c("sessionIndex");
    public static final ia.c f53132e = ia.c.c("eventTimestampUs");
    public static final ia.c f53133f = ia.c.c("dataCollectionStatus");
    public static final ia.c f53134g = ia.c.c("firebaseInstallationId");

    @Override
    public final void a(Object obj, Object obj2) {
        j0 j0Var = (j0) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f53130b, j0Var.f53147a);
        eVar.a(f53131c, j0Var.f53148b);
        eVar.e(d, j0Var.f53149c);
        eVar.f(f53132e, j0Var.d);
        eVar.a(f53133f, j0Var.f53150e);
        eVar.a(f53134g, j0Var.f53151f);
    }
}
