package w7;

import com.google.android.gms.internal.vision.e2;
public final class e {
    public final Object f59614a;
    public final Object f59615b;
    public final Object f59616c;

    public e(Object obj, Object obj2, Object obj3) {
        this.f59614a = obj;
        this.f59615b = obj2;
        this.f59616c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f59614a;
        return new IllegalArgumentException(p5.c.m(String.valueOf(obj), "=", String.valueOf(this.f59616c), e2.n("Multiple entries with same key: ", String.valueOf(obj), "=", String.valueOf(this.f59615b), " and ")));
    }
}
