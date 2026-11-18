package w7;

import com.google.android.gms.internal.vision.e2;
public final class e {
    public final Object f59607a;
    public final Object f59608b;
    public final Object f59609c;

    public e(Object obj, Object obj2, Object obj3) {
        this.f59607a = obj;
        this.f59608b = obj2;
        this.f59609c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f59607a;
        return new IllegalArgumentException(p5.c.m(String.valueOf(obj), "=", String.valueOf(this.f59609c), e2.n("Multiple entries with same key: ", String.valueOf(obj), "=", String.valueOf(this.f59608b), " and ")));
    }
}
