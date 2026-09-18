package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.h01;
public final class b4 {
    public final float f47041a;
    public final h01 f47042b;
    public final h01 f47043c;

    public b4(float f7, String str, CharSequence charSequence) {
        this.f47042b = new h01(str, 12.0f, null);
        this.f47043c = new h01(charSequence, 12.0f, AndroidUtilities.bold());
        this.f47041a = (a() / 2.0f) + f7;
    }

    public final float a() {
        return Math.max(this.f47042b.j(), this.f47043c.j());
    }
}
