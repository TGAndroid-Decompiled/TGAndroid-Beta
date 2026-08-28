package s4;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import org.telegram.ui.Components.jn0;
public final class d {
    public static final jn0 f47389c = new jn0(24);
    public final r4.b f47390a;
    public final int f47391b;

    public d(SpannableStringBuilder spannableStringBuilder, Layout.Alignment alignment, float f10, int i9, float f11, int i10, boolean z10, int i11, int i12) {
        int i13;
        if (z10) {
            i13 = i11;
        } else {
            i13 = -16777216;
        }
        this.f47390a = new r4.b(spannableStringBuilder, alignment, null, null, f10, 0, i9, f11, i10, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, z10, i13, Integer.MIN_VALUE, 0.0f);
        this.f47391b = i12;
    }
}
