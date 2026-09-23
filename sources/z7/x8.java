package z7;
public final class x8 implements ia.d {
    public static final x8 f48635a = new Object();
    public static final ia.c f48636b = new ia.c("isForegroundConfidenceMaskEnabled", hg.c.o(w.c.l(w.class, new s(1))));
    public static final ia.c f48637c = new ia.c("isForegroundBitmapEnabled", hg.c.o(w.c.l(w.class, new s(2))));
    public static final ia.c d = new ia.c("isMultipleSubjectsEnabled", hg.c.o(w.c.l(w.class, new s(3))));
    public static final ia.c e = new ia.c("isSubjectConfidenceMaskEnabled", hg.c.o(w.c.l(w.class, new s(4))));
    public static final ia.c f48638f = new ia.c("isSubjectBitmapEnabled", hg.c.o(w.c.l(w.class, new s(5))));

    @Override
    public final void a(Object obj, Object obj2) {
        ve veVar = (ve) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f48636b, veVar.f48597a);
        eVar.a(f48637c, veVar.f48598b);
        eVar.a(d, veVar.f48599c);
        eVar.a(e, veVar.d);
        eVar.a(f48638f, veVar.e);
    }
}
