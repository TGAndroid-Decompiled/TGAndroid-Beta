package z7;
public final class x8 implements ia.d {
    public static final x8 f54127a = new Object();
    public static final ia.c f54128b = new ia.c("isForegroundConfidenceMaskEnabled", hg.c.m(sc.v.o(w.class, new s(1))));
    public static final ia.c f54129c = new ia.c("isForegroundBitmapEnabled", hg.c.m(sc.v.o(w.class, new s(2))));
    public static final ia.c d = new ia.c("isMultipleSubjectsEnabled", hg.c.m(sc.v.o(w.class, new s(3))));
    public static final ia.c f54130e = new ia.c("isSubjectConfidenceMaskEnabled", hg.c.m(sc.v.o(w.class, new s(4))));
    public static final ia.c f54131f = new ia.c("isSubjectBitmapEnabled", hg.c.m(sc.v.o(w.class, new s(5))));

    @Override
    public final void a(Object obj, Object obj2) {
        ve veVar = (ve) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f54128b, veVar.f54086a);
        eVar.a(f54129c, veVar.f54087b);
        eVar.a(d, veVar.f54088c);
        eVar.a(f54130e, veVar.d);
        eVar.a(f54131f, veVar.f54089e);
    }
}
