package z7;
public final class x8 implements ia.d {
    public static final x8 f48992a = new Object();
    public static final ia.c f48993b = new ia.c("isForegroundConfidenceMaskEnabled", hg.k0.n(v7.j0.l(w.class, new s(1))));
    public static final ia.c f48994c = new ia.c("isForegroundBitmapEnabled", hg.k0.n(v7.j0.l(w.class, new s(2))));
    public static final ia.c d = new ia.c("isMultipleSubjectsEnabled", hg.k0.n(v7.j0.l(w.class, new s(3))));
    public static final ia.c e = new ia.c("isSubjectConfidenceMaskEnabled", hg.k0.n(v7.j0.l(w.class, new s(4))));
    public static final ia.c f48995f = new ia.c("isSubjectBitmapEnabled", hg.k0.n(v7.j0.l(w.class, new s(5))));

    @Override
    public final void a(Object obj, Object obj2) {
        ve veVar = (ve) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f48993b, veVar.f48954a);
        eVar.a(f48994c, veVar.f48955b);
        eVar.a(d, veVar.f48956c);
        eVar.a(e, veVar.d);
        eVar.a(f48995f, veVar.e);
    }
}
