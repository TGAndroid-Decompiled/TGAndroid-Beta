package z7;
public final class x8 implements ia.d {
    public static final x8 f53023a = new Object();
    public static final ia.c f53024b = new ia.c("isForegroundConfidenceMaskEnabled", hg.c.m(sa.e.o(w.class, new s(1))));
    public static final ia.c f53025c = new ia.c("isForegroundBitmapEnabled", hg.c.m(sa.e.o(w.class, new s(2))));
    public static final ia.c d = new ia.c("isMultipleSubjectsEnabled", hg.c.m(sa.e.o(w.class, new s(3))));
    public static final ia.c f53026e = new ia.c("isSubjectConfidenceMaskEnabled", hg.c.m(sa.e.o(w.class, new s(4))));
    public static final ia.c f53027f = new ia.c("isSubjectBitmapEnabled", hg.c.m(sa.e.o(w.class, new s(5))));

    @Override
    public final void a(Object obj, Object obj2) {
        ve veVar = (ve) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f53024b, veVar.f52982a);
        eVar.a(f53025c, veVar.f52983b);
        eVar.a(d, veVar.f52984c);
        eVar.a(f53026e, veVar.d);
        eVar.a(f53027f, veVar.f52985e);
    }
}
