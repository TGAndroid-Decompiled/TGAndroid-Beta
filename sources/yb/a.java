package yb;

import n6.l;
import xb.c;
public final class a extends c {
    public static final a f46986b;

    static {
        ?? obj = new Object();
        obj.f15536a = -1.0f;
        boolean z10 = false;
        if (Float.compare(0.5f, 0.0f) >= 0 && Float.compare(0.5f, 1.0f) <= 0) {
            z10 = true;
        }
        l.a("Confidence Threshold should be in range [0.0f, 1.0f].", z10);
        obj.f15536a = 0.5f;
        f46986b = new c(obj);
    }
}
