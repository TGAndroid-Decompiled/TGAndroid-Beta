package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.h01;
public final class b4 {
    public final float f47036a;
    public final h01 f47037b;
    public final h01 f47038c;

    public b4(float f7, String str, CharSequence charSequence) {
        this.f47037b = new h01(str, 12.0f, null);
        this.f47038c = new h01(charSequence, 12.0f, AndroidUtilities.bold());
        this.f47036a = (a() / 2.0f) + f7;
    }

    public final float a() {
        return Math.max(this.f47037b.j(), this.f47038c.j());
    }
}
