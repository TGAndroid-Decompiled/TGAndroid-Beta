package ub;

import p6.m;
import tb.c;
public final class a extends c {
    public static final a f55806b;

    static {
        ?? obj = new Object();
        obj.f53635a = -1.0f;
        boolean z10 = false;
        if (Float.compare(0.5f, 0.0f) >= 0 && Float.compare(0.5f, 1.0f) <= 0) {
            z10 = true;
        }
        m.a("Confidence Threshold should be in range [0.0f, 1.0f].", z10);
        obj.f53635a = 0.5f;
        f55806b = new c(obj);
    }
}
