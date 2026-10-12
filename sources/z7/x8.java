package z7;
public final class x8 implements ia.d {
    public static final x8 f54348a = new Object();
    public static final ia.c f54349b = new ia.c("isForegroundConfidenceMaskEnabled", hg.c.o(sc.v.o(w.class, new s(1))));
    public static final ia.c f54350c = new ia.c("isForegroundBitmapEnabled", hg.c.o(sc.v.o(w.class, new s(2))));
    public static final ia.c d = new ia.c("isMultipleSubjectsEnabled", hg.c.o(sc.v.o(w.class, new s(3))));
    public static final ia.c f54351e = new ia.c("isSubjectConfidenceMaskEnabled", hg.c.o(sc.v.o(w.class, new s(4))));
    public static final ia.c f54352f = new ia.c("isSubjectBitmapEnabled", hg.c.o(sc.v.o(w.class, new s(5))));

    @Override
    public final void a(Object obj, Object obj2) {
        we weVar = (we) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f54349b, weVar.f54334a);
        eVar.a(f54350c, weVar.f54335b);
        eVar.a(d, weVar.f54336c);
        eVar.a(f54351e, weVar.d);
        eVar.a(f54352f, weVar.f54337e);
    }
}
