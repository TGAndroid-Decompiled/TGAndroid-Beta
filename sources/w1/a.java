package w1;

import androidx.fragment.app.r;
import kotlin.jvm.internal.j;
public final class a extends RuntimeException {
    public final r f57586a;

    public a(r fragment, String str) {
        super(str);
        j.e(fragment, "fragment");
        this.f57586a = fragment;
    }
}
