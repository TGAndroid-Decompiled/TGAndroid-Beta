package z7;
public final class x8 implements ia.d {
    public static final x8 f51356a = new Object();
    public static final ia.c f51357b = new ia.c("isForegroundConfidenceMaskEnabled", i2.g.n(w.f.k(w.class, new s(1))));
    public static final ia.c f51358c = new ia.c("isForegroundBitmapEnabled", i2.g.n(w.f.k(w.class, new s(2))));
    public static final ia.c d = new ia.c("isMultipleSubjectsEnabled", i2.g.n(w.f.k(w.class, new s(3))));
    public static final ia.c f51359e = new ia.c("isSubjectConfidenceMaskEnabled", i2.g.n(w.f.k(w.class, new s(4))));
    public static final ia.c f51360f = new ia.c("isSubjectBitmapEnabled", i2.g.n(w.f.k(w.class, new s(5))));

    @Override
    public final void a(Object obj, Object obj2) {
        ve veVar = (ve) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f51357b, veVar.f51315a);
        eVar.a(f51358c, veVar.f51316b);
        eVar.a(d, veVar.f51317c);
        eVar.a(f51359e, veVar.d);
        eVar.a(f51360f, veVar.f51318e);
    }
}
