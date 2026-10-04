package z7;
public final class x8 implements ia.d {
    public static final x8 f53002a = new Object();
    public static final ia.c f53003b = new ia.c("isForegroundConfidenceMaskEnabled", hg.c.m(sa.e.o(w.class, new s(1))));
    public static final ia.c f53004c = new ia.c("isForegroundBitmapEnabled", hg.c.m(sa.e.o(w.class, new s(2))));
    public static final ia.c d = new ia.c("isMultipleSubjectsEnabled", hg.c.m(sa.e.o(w.class, new s(3))));
    public static final ia.c f53005e = new ia.c("isSubjectConfidenceMaskEnabled", hg.c.m(sa.e.o(w.class, new s(4))));
    public static final ia.c f53006f = new ia.c("isSubjectBitmapEnabled", hg.c.m(sa.e.o(w.class, new s(5))));

    @Override
    public final void a(Object obj, Object obj2) {
        ve veVar = (ve) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f53003b, veVar.f52961a);
        eVar.a(f53004c, veVar.f52962b);
        eVar.a(d, veVar.f52963c);
        eVar.a(f53005e, veVar.d);
        eVar.a(f53006f, veVar.f52964e);
    }
}
