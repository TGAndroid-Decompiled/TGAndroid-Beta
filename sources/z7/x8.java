package z7;
public final class x8 implements ia.d {
    public static final x8 f54237a = new Object();
    public static final ia.c f54238b = new ia.c("isForegroundConfidenceMaskEnabled", hg.c.m(sc.v.o(w.class, new s(1))));
    public static final ia.c f54239c = new ia.c("isForegroundBitmapEnabled", hg.c.m(sc.v.o(w.class, new s(2))));
    public static final ia.c d = new ia.c("isMultipleSubjectsEnabled", hg.c.m(sc.v.o(w.class, new s(3))));
    public static final ia.c f54240e = new ia.c("isSubjectConfidenceMaskEnabled", hg.c.m(sc.v.o(w.class, new s(4))));
    public static final ia.c f54241f = new ia.c("isSubjectBitmapEnabled", hg.c.m(sc.v.o(w.class, new s(5))));

    @Override
    public final void a(Object obj, Object obj2) {
        we weVar = (we) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f54238b, weVar.f54223a);
        eVar.a(f54239c, weVar.f54224b);
        eVar.a(d, weVar.f54225c);
        eVar.a(f54240e, weVar.d);
        eVar.a(f54241f, weVar.f54226e);
    }
}
