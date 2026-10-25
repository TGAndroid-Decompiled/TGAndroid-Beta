package w7;

import org.telegram.ui.Components.b10;
public final class u2 implements ka.d {
    public static final u2 f50982a = new Object();
    public static final ka.c f50983b = new ka.c("identifyLanguageConfidenceThreshold", ic.a.m(b10.m(h.class, new e(1))));
    public static final ka.c f50984c = new ka.c("identifyAllLanguagesConfidenceThreshold", ic.a.m(b10.m(h.class, new e(2))));
    public static final ka.c d = new ka.c("confidenceThreshold", ic.a.m(b10.m(h.class, new e(3))));

    @Override
    public final void a(Object obj, Object obj2) {
        ka.e eVar = (ka.e) obj2;
        eVar.a(f50983b, null);
        eVar.a(f50984c, null);
        eVar.a(d, ((i6) obj).f50884a);
    }
}
