package z7;
public final class r4 implements ia.d {
    public static final r4 f54024a = new Object();
    public static final ia.c f54025b = new ia.c("imageFormat", hg.c.m(sc.v.o(w.class, new s(1))));
    public static final ia.c f54026c = new ia.c("originalImageSize", hg.c.m(sc.v.o(w.class, new s(2))));
    public static final ia.c d = new ia.c("compressedImageSize", hg.c.m(sc.v.o(w.class, new s(3))));
    public static final ia.c f54027e = new ia.c("isOdmlImage", hg.c.m(sc.v.o(w.class, new s(4))));

    @Override
    public final void a(Object obj, Object obj2) {
        ra raVar = (ra) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f54025b, raVar.f54032a);
        eVar.a(f54026c, raVar.f54033b);
        eVar.a(d, null);
        eVar.a(f54027e, null);
    }
}
