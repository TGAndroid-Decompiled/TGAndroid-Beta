package z7;
public final class x8 implements ia.d {
    public static final x8 f48685a = new Object();
    public static final ia.c f48686b = new ia.c("isForegroundConfidenceMaskEnabled", hg.c.o(w.c.l(w.class, new s(1))));
    public static final ia.c f48687c = new ia.c("isForegroundBitmapEnabled", hg.c.o(w.c.l(w.class, new s(2))));
    public static final ia.c d = new ia.c("isMultipleSubjectsEnabled", hg.c.o(w.c.l(w.class, new s(3))));
    public static final ia.c e = new ia.c("isSubjectConfidenceMaskEnabled", hg.c.o(w.c.l(w.class, new s(4))));
    public static final ia.c f48688f = new ia.c("isSubjectBitmapEnabled", hg.c.o(w.c.l(w.class, new s(5))));

    @Override
    public final void a(Object obj, Object obj2) {
        ve veVar = (ve) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f48686b, veVar.f48647a);
        eVar.a(f48687c, veVar.f48648b);
        eVar.a(d, veVar.f48649c);
        eVar.a(e, veVar.d);
        eVar.a(f48688f, veVar.e);
    }
}
