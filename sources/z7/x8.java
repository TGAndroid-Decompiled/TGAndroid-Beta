package z7;
public final class x8 implements ia.d {
    public static final x8 f49012a = new Object();
    public static final ia.c f49013b = new ia.c("isForegroundConfidenceMaskEnabled", hg.k0.n(v7.j0.l(w.class, new s(1))));
    public static final ia.c f49014c = new ia.c("isForegroundBitmapEnabled", hg.k0.n(v7.j0.l(w.class, new s(2))));
    public static final ia.c d = new ia.c("isMultipleSubjectsEnabled", hg.k0.n(v7.j0.l(w.class, new s(3))));
    public static final ia.c e = new ia.c("isSubjectConfidenceMaskEnabled", hg.k0.n(v7.j0.l(w.class, new s(4))));
    public static final ia.c f49015f = new ia.c("isSubjectBitmapEnabled", hg.k0.n(v7.j0.l(w.class, new s(5))));

    @Override
    public final void a(Object obj, Object obj2) {
        ve veVar = (ve) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f49013b, veVar.f48974a);
        eVar.a(f49014c, veVar.f48975b);
        eVar.a(d, veVar.f48976c);
        eVar.a(e, veVar.d);
        eVar.a(f49015f, veVar.e);
    }
}
