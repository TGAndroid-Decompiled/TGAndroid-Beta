package w7;

import com.google.android.gms.internal.vision.e2;
public final class e {
    public final Object f59734a;
    public final Object f59735b;
    public final Object f59736c;

    public e(Object obj, Object obj2, Object obj3) {
        this.f59734a = obj;
        this.f59735b = obj2;
        this.f59736c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f59734a;
        return new IllegalArgumentException(p5.c.m(String.valueOf(obj), "=", String.valueOf(this.f59736c), e2.n("Multiple entries with same key: ", String.valueOf(obj), "=", String.valueOf(this.f59735b), " and ")));
    }
}
