package z7;
public final class x8 implements ia.d {
    public static final x8 f52997a = new Object();
    public static final ia.c f52998b = new ia.c("isForegroundConfidenceMaskEnabled", hg.k0.m(t8.b.o(w.class, new s(1))));
    public static final ia.c f52999c = new ia.c("isForegroundBitmapEnabled", hg.k0.m(t8.b.o(w.class, new s(2))));
    public static final ia.c d = new ia.c("isMultipleSubjectsEnabled", hg.k0.m(t8.b.o(w.class, new s(3))));
    public static final ia.c f53000e = new ia.c("isSubjectConfidenceMaskEnabled", hg.k0.m(t8.b.o(w.class, new s(4))));
    public static final ia.c f53001f = new ia.c("isSubjectBitmapEnabled", hg.k0.m(t8.b.o(w.class, new s(5))));

    @Override
    public final void a(Object obj, Object obj2) {
        ve veVar = (ve) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f52998b, veVar.f52956a);
        eVar.a(f52999c, veVar.f52957b);
        eVar.a(d, veVar.f52958c);
        eVar.a(f53000e, veVar.d);
        eVar.a(f53001f, veVar.f52959e);
    }
}
