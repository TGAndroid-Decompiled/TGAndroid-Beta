package y7;

import org.telegram.ui.Components.b10;
public final class s1 implements ka.d {
    public static final s1 f52288a = new Object();
    public static final ka.c f52289b = new ka.c("errorCode", ic.a.m(b10.o(b0.class, new y(1))));
    public static final ka.c f52290c = new ka.c("isColdCall", ic.a.m(b10.o(b0.class, new y(2))));
    public static final ka.c d = new ka.c("imageInfo", ic.a.m(b10.o(b0.class, new y(3))));
    public static final ka.c e = new ka.c("detectorOptions", ic.a.m(b10.o(b0.class, new y(4))));

    @Override
    public final void a(Object obj, Object obj2) {
        q0 q0Var = (q0) obj;
        ka.e eVar = (ka.e) obj2;
        eVar.a(f52289b, q0Var.f52268a);
        eVar.a(f52290c, q0Var.f52269b);
        eVar.a(d, null);
        eVar.a(e, q0Var.f52270c);
    }
}
