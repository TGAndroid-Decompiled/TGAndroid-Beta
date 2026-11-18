package w7;

import com.google.android.gms.internal.vision.e2;
public final class e {
    public final Object f59606a;
    public final Object f59607b;
    public final Object f59608c;

    public e(Object obj, Object obj2, Object obj3) {
        this.f59606a = obj;
        this.f59607b = obj2;
        this.f59608c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f59606a;
        return new IllegalArgumentException(p5.c.m(String.valueOf(obj), "=", String.valueOf(this.f59608c), e2.n("Multiple entries with same key: ", String.valueOf(obj), "=", String.valueOf(this.f59607b), " and ")));
    }
}
