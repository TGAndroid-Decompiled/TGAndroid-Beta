package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.n11;
public final class t3 {
    public final float f53327a;
    public final n11 f53328b;
    public final n11 f53329c;

    public t3(float f7, String str, CharSequence charSequence) {
        this.f53328b = new n11(str, 12.0f, null);
        this.f53329c = new n11(charSequence, 12.0f, AndroidUtilities.bold());
        this.f53327a = (a() / 2.0f) + f7;
    }

    public final float a() {
        return Math.max(this.f53328b.j(), this.f53329c.j());
    }
}
