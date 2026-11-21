package w7;

import com.google.android.gms.internal.vision.e2;
public final class e {
    public final Object f59645a;
    public final Object f59646b;
    public final Object f59647c;

    public e(Object obj, Object obj2, Object obj3) {
        this.f59645a = obj;
        this.f59646b = obj2;
        this.f59647c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f59645a;
        return new IllegalArgumentException(p5.c.m(String.valueOf(obj), "=", String.valueOf(this.f59647c), e2.n("Multiple entries with same key: ", String.valueOf(obj), "=", String.valueOf(this.f59646b), " and ")));
    }
}
