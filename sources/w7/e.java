package w7;

import com.google.android.gms.internal.vision.e2;
import org.telegram.ui.Cells.y0;
public final class e {
    public final Object f59041a;
    public final Object f59042b;
    public final Object f59043c;

    public e(Object obj, Object obj2, Object obj3) {
        this.f59041a = obj;
        this.f59042b = obj2;
        this.f59043c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f59041a;
        return new IllegalArgumentException(y0.m(String.valueOf(obj), "=", String.valueOf(this.f59043c), e2.n("Multiple entries with same key: ", String.valueOf(obj), "=", String.valueOf(this.f59042b), " and ")));
    }
}
