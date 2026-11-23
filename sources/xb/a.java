package xb;

import q6.m;
import wb.c;
public final class a extends c {
    public static final a f60489b;

    static {
        ?? obj = new Object();
        obj.f56350a = -1.0f;
        boolean z10 = false;
        if (Float.compare(0.5f, 0.0f) >= 0 && Float.compare(0.5f, 1.0f) <= 0) {
            z10 = true;
        }
        m.a("Confidence Threshold should be in range [0.0f, 1.0f].", z10);
        obj.f56350a = 0.5f;
        f60489b = new c(obj);
    }
}
