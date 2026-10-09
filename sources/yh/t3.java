package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.l11;
public final class t3 {
    public final float f53241a;
    public final l11 f53242b;
    public final l11 f53243c;

    public t3(float f7, String str, CharSequence charSequence) {
        this.f53242b = new l11(str, 12.0f, null);
        this.f53243c = new l11(charSequence, 12.0f, AndroidUtilities.bold());
        this.f53241a = (a() / 2.0f) + f7;
    }

    public final float a() {
        return Math.max(this.f53242b.j(), this.f53243c.j());
    }
}
