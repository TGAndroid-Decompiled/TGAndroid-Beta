package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.m11;
public final class t3 {
    public final float f53361a;
    public final m11 f53362b;
    public final m11 f53363c;

    public t3(float f7, String str, CharSequence charSequence) {
        this.f53362b = new m11(str, 12.0f, null);
        this.f53363c = new m11(charSequence, 12.0f, AndroidUtilities.bold());
        this.f53361a = (a() / 2.0f) + f7;
    }

    public final float a() {
        return Math.max(this.f53362b.j(), this.f53363c.j());
    }
}
