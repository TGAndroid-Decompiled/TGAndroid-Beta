package z7;
public final class x8 implements ia.d {
    public static final x8 f48962a = new Object();
    public static final ia.c f48963b = new ia.c("isForegroundConfidenceMaskEnabled", hg.c.m(v7.j.m(w.class, new s(1))));
    public static final ia.c f48964c = new ia.c("isForegroundBitmapEnabled", hg.c.m(v7.j.m(w.class, new s(2))));
    public static final ia.c d = new ia.c("isMultipleSubjectsEnabled", hg.c.m(v7.j.m(w.class, new s(3))));
    public static final ia.c e = new ia.c("isSubjectConfidenceMaskEnabled", hg.c.m(v7.j.m(w.class, new s(4))));
    public static final ia.c f48965f = new ia.c("isSubjectBitmapEnabled", hg.c.m(v7.j.m(w.class, new s(5))));

    @Override
    public final void a(Object obj, Object obj2) {
        ve veVar = (ve) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f48963b, veVar.f48924a);
        eVar.a(f48964c, veVar.f48925b);
        eVar.a(d, veVar.f48926c);
        eVar.a(e, veVar.d);
        eVar.a(f48965f, veVar.e);
    }
}
