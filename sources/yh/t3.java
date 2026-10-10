package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.m11;
public final class t3 {
    public final float f53285a;
    public final m11 f53286b;
    public final m11 f53287c;

    public t3(float f7, String str, CharSequence charSequence) {
        this.f53286b = new m11(str, 12.0f, null);
        this.f53287c = new m11(charSequence, 12.0f, AndroidUtilities.bold());
        this.f53285a = (a() / 2.0f) + f7;
    }

    public final float a() {
        return Math.max(this.f53286b.j(), this.f53287c.j());
    }
}
