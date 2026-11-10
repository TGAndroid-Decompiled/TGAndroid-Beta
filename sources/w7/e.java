package w7;

import org.telegram.ui.Cells.f1;
public final class e {
    public final Object f57601a;
    public final Object f57602b;
    public final Object f57603c;

    public e(Object obj, Object obj2, Object obj3) {
        this.f57601a = obj;
        this.f57602b = obj2;
        this.f57603c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f57601a;
        return new IllegalArgumentException(f1.n(String.valueOf(obj), "=", String.valueOf(this.f57603c), com.google.android.recaptcha.internal.a.n("Multiple entries with same key: ", String.valueOf(obj), "=", String.valueOf(this.f57602b), " and ")));
    }
}
