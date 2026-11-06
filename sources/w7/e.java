package w7;

import org.telegram.ui.Cells.f1;
public final class e {
    public final Object f57498a;
    public final Object f57499b;
    public final Object f57500c;

    public e(Object obj, Object obj2, Object obj3) {
        this.f57498a = obj;
        this.f57499b = obj2;
        this.f57500c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f57498a;
        return new IllegalArgumentException(f1.n(String.valueOf(obj), "=", String.valueOf(this.f57500c), com.google.android.recaptcha.internal.a.n("Multiple entries with same key: ", String.valueOf(obj), "=", String.valueOf(this.f57499b), " and ")));
    }
}
