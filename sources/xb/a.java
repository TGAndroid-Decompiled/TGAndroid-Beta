package xb;

import q6.m;
import wb.c;
public final class a extends c {
    public static final a f58563b;

    static {
        ?? obj = new Object();
        obj.f54132a = -1.0f;
        boolean z9 = false;
        if (Float.compare(0.5f, 0.0f) >= 0 && Float.compare(0.5f, 1.0f) <= 0) {
            z9 = true;
        }
        m.a("Confidence Threshold should be in range [0.0f, 1.0f].", z9);
        obj.f54132a = 0.5f;
        f58563b = new c(obj);
    }
}
