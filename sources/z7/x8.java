package z7;
public final class x8 implements ia.d {
    public static final x8 f54340a = new Object();
    public static final ia.c f54341b = new ia.c("isForegroundConfidenceMaskEnabled", hg.c.o(sc.v.o(w.class, new s(1))));
    public static final ia.c f54342c = new ia.c("isForegroundBitmapEnabled", hg.c.o(sc.v.o(w.class, new s(2))));
    public static final ia.c d = new ia.c("isMultipleSubjectsEnabled", hg.c.o(sc.v.o(w.class, new s(3))));
    public static final ia.c f54343e = new ia.c("isSubjectConfidenceMaskEnabled", hg.c.o(sc.v.o(w.class, new s(4))));
    public static final ia.c f54344f = new ia.c("isSubjectBitmapEnabled", hg.c.o(sc.v.o(w.class, new s(5))));

    @Override
    public final void a(Object obj, Object obj2) {
        we weVar = (we) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f54341b, weVar.f54326a);
        eVar.a(f54342c, weVar.f54327b);
        eVar.a(d, weVar.f54328c);
        eVar.a(f54343e, weVar.d);
        eVar.a(f54344f, weVar.f54329e);
    }
}
