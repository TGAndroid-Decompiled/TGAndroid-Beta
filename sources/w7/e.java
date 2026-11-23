package w7;

import com.google.android.gms.internal.vision.e2;
public final class e {
    public final Object f59649a;
    public final Object f59650b;
    public final Object f59651c;

    public e(Object obj, Object obj2, Object obj3) {
        this.f59649a = obj;
        this.f59650b = obj2;
        this.f59651c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f59649a;
        return new IllegalArgumentException(p5.c.m(String.valueOf(obj), "=", String.valueOf(this.f59651c), e2.n("Multiple entries with same key: ", String.valueOf(obj), "=", String.valueOf(this.f59650b), " and ")));
    }
}
