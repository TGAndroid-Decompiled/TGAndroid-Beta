package w7;

import org.telegram.ui.Cells.f1;
public final class e {
    public final Object f57590a;
    public final Object f57591b;
    public final Object f57592c;

    public e(Object obj, Object obj2, Object obj3) {
        this.f57590a = obj;
        this.f57591b = obj2;
        this.f57592c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f57590a;
        return new IllegalArgumentException(f1.n(String.valueOf(obj), "=", String.valueOf(this.f57592c), com.google.android.recaptcha.internal.a.n("Multiple entries with same key: ", String.valueOf(obj), "=", String.valueOf(this.f57591b), " and ")));
    }
}
