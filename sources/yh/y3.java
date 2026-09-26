package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.u01;
public final class y3 {
    public final float f48291a;
    public final u01 f48292b;
    public final u01 f48293c;

    public y3(float f7, String str, CharSequence charSequence) {
        this.f48292b = new u01(str, 12.0f, null);
        this.f48293c = new u01(charSequence, 12.0f, AndroidUtilities.bold());
        this.f48291a = (a() / 2.0f) + f7;
    }

    public final float a() {
        return Math.max(this.f48292b.j(), this.f48293c.j());
    }
}
