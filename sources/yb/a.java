package yb;

import n6.l;
import xb.c;
public final class a extends c {
    public static final a f49952b;

    static {
        ?? obj = new Object();
        obj.f16851a = -1.0f;
        boolean z10 = false;
        if (Float.compare(0.5f, 0.0f) >= 0 && Float.compare(0.5f, 1.0f) <= 0) {
            z10 = true;
        }
        l.a("Confidence Threshold should be in range [0.0f, 1.0f].", z10);
        obj.f16851a = 0.5f;
        f49952b = new c(obj);
    }
}
