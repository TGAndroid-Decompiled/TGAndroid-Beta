package w7;

import org.telegram.ui.Cells.f1;
public final class e {
    public final Object f57497a;
    public final Object f57498b;
    public final Object f57499c;

    public e(Object obj, Object obj2, Object obj3) {
        this.f57497a = obj;
        this.f57498b = obj2;
        this.f57499c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f57497a;
        return new IllegalArgumentException(f1.n(String.valueOf(obj), "=", String.valueOf(this.f57499c), com.google.android.recaptcha.internal.a.n("Multiple entries with same key: ", String.valueOf(obj), "=", String.valueOf(this.f57498b), " and ")));
    }
}
