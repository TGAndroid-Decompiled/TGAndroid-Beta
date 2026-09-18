package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.v01;
public final class z3 {
    public final float f48316a;
    public final v01 f48317b;
    public final v01 f48318c;

    public z3(float f7, String str, CharSequence charSequence) {
        this.f48317b = new v01(str, 12.0f, null);
        this.f48318c = new v01(charSequence, 12.0f, AndroidUtilities.bold());
        this.f48316a = (a() / 2.0f) + f7;
    }

    public final float a() {
        return Math.max(this.f48317b.j(), this.f48318c.j());
    }
}
