package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.t01;
public final class y3 {
    public final float f48292a;
    public final t01 f48293b;
    public final t01 f48294c;

    public y3(float f7, String str, CharSequence charSequence) {
        this.f48293b = new t01(str, 12.0f, null);
        this.f48294c = new t01(charSequence, 12.0f, AndroidUtilities.bold());
        this.f48292a = (a() / 2.0f) + f7;
    }

    public final float a() {
        return Math.max(this.f48293b.j(), this.f48294c.j());
    }
}
