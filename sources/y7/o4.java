package y7;

import org.telegram.ui.Components.b10;
public final class o4 implements ka.d {
    public static final o4 f52259a = new Object();
    public static final ka.c f52260b = new ka.c("maxLabels", ic.a.m(b10.o(b0.class, new y(1))));
    public static final ka.c f52261c = new ka.c("confidenceThreshold", ic.a.m(b10.o(b0.class, new y(2))));
    public static final ka.c d = new ka.c("customLocalModelOptions", ic.a.m(b10.o(b0.class, new y(3))));

    @Override
    public final void a(Object obj, Object obj2) {
        ka.e eVar = (ka.e) obj2;
        eVar.a(f52260b, null);
        eVar.a(f52261c, ((f8) obj).f52145a);
        eVar.a(d, null);
    }
}
