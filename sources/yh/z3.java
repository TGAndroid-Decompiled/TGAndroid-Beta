package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.f01;
public final class z3 {
    public final float f48009a;
    public final f01 f48010b;
    public final f01 f48011c;

    public z3(float f7, String str, CharSequence charSequence) {
        this.f48010b = new f01(str, 12.0f, null);
        this.f48011c = new f01(charSequence, 12.0f, AndroidUtilities.bold());
        this.f48009a = (a() / 2.0f) + f7;
    }

    public final float a() {
        return Math.max(this.f48010b.j(), this.f48011c.j());
    }
}
