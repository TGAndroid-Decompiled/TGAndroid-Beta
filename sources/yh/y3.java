package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.t01;
public final class y3 {
    public final float f48281a;
    public final t01 f48282b;
    public final t01 f48283c;

    public y3(float f7, String str, CharSequence charSequence) {
        this.f48282b = new t01(str, 12.0f, null);
        this.f48283c = new t01(charSequence, 12.0f, AndroidUtilities.bold());
        this.f48281a = (a() / 2.0f) + f7;
    }

    public final float a() {
        return Math.max(this.f48282b.j(), this.f48283c.j());
    }
}
