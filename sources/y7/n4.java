package y7;

import org.telegram.ui.Components.b10;
public final class n4 implements ka.d {
    public static final n4 f52245a = new Object();
    public static final ka.c f52246b = new ka.c("detectorOptions", ic.a.m(b10.o(b0.class, new y(1))));
    public static final ka.c f52247c = new ka.c("errorCodes", ic.a.m(b10.o(b0.class, new y(2))));
    public static final ka.c d = new ka.c("totalInitializationMs", ic.a.m(b10.o(b0.class, new y(3))));
    public static final ka.c e = new ka.c("loggingInitializationMs", ic.a.m(b10.o(b0.class, new y(4))));
    public static final ka.c f52248f = new ka.c("otherErrors", ic.a.m(b10.o(b0.class, new y(5))));

    @Override
    public final void a(Object obj, Object obj2) {
        e8 e8Var = (e8) obj;
        ka.e eVar = (ka.e) obj2;
        eVar.a(f52246b, e8Var.f52136a);
        eVar.a(f52247c, e8Var.f52137b);
        eVar.a(d, null);
        eVar.a(e, null);
        eVar.a(f52248f, null);
    }
}
