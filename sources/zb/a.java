package zb;

import n6.l;
import yb.c;
public final class a extends c {
    public static final a f51554b;

    static {
        ?? obj = new Object();
        obj.f17561a = -1.0f;
        boolean z10 = false;
        if (Float.compare(0.5f, 0.0f) >= 0 && Float.compare(0.5f, 1.0f) <= 0) {
            z10 = true;
        }
        l.a("Confidence Threshold should be in range [0.0f, 1.0f].", z10);
        obj.f17561a = 0.5f;
        f51554b = new c(obj);
    }
}
