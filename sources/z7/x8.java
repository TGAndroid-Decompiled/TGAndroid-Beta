package z7;
public final class x8 implements ia.d {
    public static final x8 f51355a = new Object();
    public static final ia.c f51356b = new ia.c("isForegroundConfidenceMaskEnabled", i2.g.n(w.f.k(w.class, new s(1))));
    public static final ia.c f51357c = new ia.c("isForegroundBitmapEnabled", i2.g.n(w.f.k(w.class, new s(2))));
    public static final ia.c d = new ia.c("isMultipleSubjectsEnabled", i2.g.n(w.f.k(w.class, new s(3))));
    public static final ia.c f51358e = new ia.c("isSubjectConfidenceMaskEnabled", i2.g.n(w.f.k(w.class, new s(4))));
    public static final ia.c f51359f = new ia.c("isSubjectBitmapEnabled", i2.g.n(w.f.k(w.class, new s(5))));

    @Override
    public final void a(Object obj, Object obj2) {
        ve veVar = (ve) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f51356b, veVar.f51314a);
        eVar.a(f51357c, veVar.f51315b);
        eVar.a(d, veVar.f51316c);
        eVar.a(f51358e, veVar.d);
        eVar.a(f51359f, veVar.f51317e);
    }
}
