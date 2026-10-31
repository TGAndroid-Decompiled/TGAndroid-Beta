package rb;

import n6.l;
import qb.c;
public final class a extends c {
    public static final a f46478b;

    static {
        ?? obj = new Object();
        obj.f13940a = -1.0f;
        boolean z10 = false;
        if (Float.compare(0.5f, 0.0f) >= 0 && Float.compare(0.5f, 1.0f) <= 0) {
            z10 = true;
        }
        l.a("Confidence Threshold should be in range [0.0f, 1.0f].", z10);
        obj.f13940a = 0.5f;
        f46478b = new c(obj);
    }
}
