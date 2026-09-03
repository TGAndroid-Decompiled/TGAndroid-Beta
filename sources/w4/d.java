package w4;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import org.telegram.ui.du;
public final class d {
    public static final du f49414c = new du(24);
    public final v4.b f49415a;
    public final int f49416b;

    public d(SpannableStringBuilder spannableStringBuilder, Layout.Alignment alignment, float f10, int i10, float f11, int i11, boolean z4, int i12, int i13) {
        int i14;
        if (z4) {
            i14 = i12;
        } else {
            i14 = -16777216;
        }
        this.f49415a = new v4.b(spannableStringBuilder, alignment, null, null, f10, 0, i10, f11, i11, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, z4, i14, Integer.MIN_VALUE, 0.0f);
        this.f49416b = i13;
    }
}
