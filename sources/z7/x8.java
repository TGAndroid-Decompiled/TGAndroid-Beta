package z7;
public final class x8 implements ja.d {
    public static final x8 f49862a = new Object();
    public static final ja.c f49863b = new ja.c("isForegroundConfidenceMaskEnabled", i2.d.n(t8.b.n(w.class, new s(1))));
    public static final ja.c f49864c = new ja.c("isForegroundBitmapEnabled", i2.d.n(t8.b.n(w.class, new s(2))));
    public static final ja.c d = new ja.c("isMultipleSubjectsEnabled", i2.d.n(t8.b.n(w.class, new s(3))));
    public static final ja.c e = new ja.c("isSubjectConfidenceMaskEnabled", i2.d.n(t8.b.n(w.class, new s(4))));
    public static final ja.c f49865f = new ja.c("isSubjectBitmapEnabled", i2.d.n(t8.b.n(w.class, new s(5))));

    @Override
    public final void a(Object obj, Object obj2) {
        ve veVar = (ve) obj;
        ja.e eVar = (ja.e) obj2;
        eVar.d(f49863b, veVar.f49824a);
        eVar.d(f49864c, veVar.f49825b);
        eVar.d(d, veVar.f49826c);
        eVar.d(e, veVar.d);
        eVar.d(f49865f, veVar.e);
    }
}
