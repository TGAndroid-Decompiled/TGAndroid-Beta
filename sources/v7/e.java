package v7;

import org.telegram.ui.Cells.f1;
public final class e {
    public final Object f56453a;
    public final Object f56454b;
    public final Object f56455c;

    public e(Object obj, Object obj2, Object obj3) {
        this.f56453a = obj;
        this.f56454b = obj2;
        this.f56455c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f56453a;
        return new IllegalArgumentException(f1.r(String.valueOf(obj), "=", String.valueOf(this.f56455c), com.google.android.recaptcha.internal.a.n("Multiple entries with same key: ", String.valueOf(obj), "=", String.valueOf(this.f56454b), " and ")));
    }
}
