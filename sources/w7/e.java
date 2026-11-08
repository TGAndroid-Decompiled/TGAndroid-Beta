package w7;

import org.telegram.ui.Cells.f1;
public final class e {
    public final Object f57589a;
    public final Object f57590b;
    public final Object f57591c;

    public e(Object obj, Object obj2, Object obj3) {
        this.f57589a = obj;
        this.f57590b = obj2;
        this.f57591c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f57589a;
        return new IllegalArgumentException(f1.n(String.valueOf(obj), "=", String.valueOf(this.f57591c), com.google.android.recaptcha.internal.a.n("Multiple entries with same key: ", String.valueOf(obj), "=", String.valueOf(this.f57590b), " and ")));
    }
}
