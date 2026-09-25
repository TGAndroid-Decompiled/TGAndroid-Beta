package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.t01;
public final class y3 {
    public final float f48293a;
    public final t01 f48294b;
    public final t01 f48295c;

    public y3(float f7, String str, CharSequence charSequence) {
        this.f48294b = new t01(str, 12.0f, null);
        this.f48295c = new t01(charSequence, 12.0f, AndroidUtilities.bold());
        this.f48293a = (a() / 2.0f) + f7;
    }

    public final float a() {
        return Math.max(this.f48294b.j(), this.f48295c.j());
    }
}
