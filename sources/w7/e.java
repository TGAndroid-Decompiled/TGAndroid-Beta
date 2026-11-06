package w7;

import org.telegram.ui.Cells.f1;
public final class e {
    public final Object f57473a;
    public final Object f57474b;
    public final Object f57475c;

    public e(Object obj, Object obj2, Object obj3) {
        this.f57473a = obj;
        this.f57474b = obj2;
        this.f57475c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f57473a;
        return new IllegalArgumentException(f1.n(String.valueOf(obj), "=", String.valueOf(this.f57475c), com.google.android.recaptcha.internal.a.n("Multiple entries with same key: ", String.valueOf(obj), "=", String.valueOf(this.f57474b), " and ")));
    }
}
