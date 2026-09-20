package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.u01;
public final class z3 {
    public final float f48362a;
    public final u01 f48363b;
    public final u01 f48364c;

    public z3(float f7, String str, CharSequence charSequence) {
        this.f48363b = new u01(str, 12.0f, null);
        this.f48364c = new u01(charSequence, 12.0f, AndroidUtilities.bold());
        this.f48362a = (a() / 2.0f) + f7;
    }

    public final float a() {
        return Math.max(this.f48363b.j(), this.f48364c.j());
    }
}
