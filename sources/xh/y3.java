package xh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.t01;
public final class y3 {
    public final float f46329a;
    public final t01 f46330b;
    public final t01 f46331c;

    public y3(float f7, String str, CharSequence charSequence) {
        this.f46330b = new t01(str, 12.0f, null);
        this.f46331c = new t01(charSequence, 12.0f, AndroidUtilities.bold());
        this.f46329a = (a() / 2.0f) + f7;
    }

    public final float a() {
        return Math.max(this.f46330b.j(), this.f46331c.j());
    }
}
