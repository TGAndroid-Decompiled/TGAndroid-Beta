package z7;
public final class x8 implements ia.d {
    public static final x8 f54203a = new Object();
    public static final ia.c f54204b = new ia.c("isForegroundConfidenceMaskEnabled", hg.c.m(sc.v.o(w.class, new s(1))));
    public static final ia.c f54205c = new ia.c("isForegroundBitmapEnabled", hg.c.m(sc.v.o(w.class, new s(2))));
    public static final ia.c d = new ia.c("isMultipleSubjectsEnabled", hg.c.m(sc.v.o(w.class, new s(3))));
    public static final ia.c f54206e = new ia.c("isSubjectConfidenceMaskEnabled", hg.c.m(sc.v.o(w.class, new s(4))));
    public static final ia.c f54207f = new ia.c("isSubjectBitmapEnabled", hg.c.m(sc.v.o(w.class, new s(5))));

    @Override
    public final void a(Object obj, Object obj2) {
        we weVar = (we) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f54204b, weVar.f54189a);
        eVar.a(f54205c, weVar.f54190b);
        eVar.a(d, weVar.f54191c);
        eVar.a(f54206e, weVar.d);
        eVar.a(f54207f, weVar.f54192e);
    }
}
