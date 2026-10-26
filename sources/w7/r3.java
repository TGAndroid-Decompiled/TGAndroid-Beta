package w7;

import org.telegram.ui.Components.b10;
public final class r3 implements ka.d {
    public static final r3 f50966a = new Object();
    public static final ka.c f50967b = new ka.c("inferenceCommonLogEvent", ic.a.m(b10.m(h.class, new e(1))));
    public static final ka.c f50968c = new ka.c("options", ic.a.m(b10.m(h.class, new e(2))));
    public static final ka.c d = new ka.c("identifyLanguageResult", ic.a.m(b10.m(h.class, new e(3))));
    public static final ka.c e = new ka.c("identifyPossibleLanguagesResult", ic.a.m(b10.m(h.class, new e(4))));

    @Override
    public final void a(Object obj, Object obj2) {
        k7 k7Var = (k7) obj;
        ka.e eVar = (ka.e) obj2;
        eVar.a(f50967b, k7Var.f50910a);
        eVar.a(f50968c, k7Var.f50911b);
        eVar.a(d, k7Var.f50912c);
        eVar.a(e, null);
    }
}
