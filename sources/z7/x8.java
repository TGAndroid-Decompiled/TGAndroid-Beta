package z7;
public final class x8 implements ia.d {
    public static final x8 f54173a = new Object();
    public static final ia.c f54174b = new ia.c("isForegroundConfidenceMaskEnabled", hg.c.m(sc.v.o(w.class, new s(1))));
    public static final ia.c f54175c = new ia.c("isForegroundBitmapEnabled", hg.c.m(sc.v.o(w.class, new s(2))));
    public static final ia.c d = new ia.c("isMultipleSubjectsEnabled", hg.c.m(sc.v.o(w.class, new s(3))));
    public static final ia.c f54176e = new ia.c("isSubjectConfidenceMaskEnabled", hg.c.m(sc.v.o(w.class, new s(4))));
    public static final ia.c f54177f = new ia.c("isSubjectBitmapEnabled", hg.c.m(sc.v.o(w.class, new s(5))));

    @Override
    public final void a(Object obj, Object obj2) {
        ve veVar = (ve) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f54174b, veVar.f54132a);
        eVar.a(f54175c, veVar.f54133b);
        eVar.a(d, veVar.f54134c);
        eVar.a(f54176e, veVar.d);
        eVar.a(f54177f, veVar.f54135e);
    }
}
