package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.l11;
public final class t3 {
    public final float f53239a;
    public final l11 f53240b;
    public final l11 f53241c;

    public t3(float f7, String str, CharSequence charSequence) {
        this.f53240b = new l11(str, 12.0f, null);
        this.f53241c = new l11(charSequence, 12.0f, AndroidUtilities.bold());
        this.f53239a = (a() / 2.0f) + f7;
    }

    public final float a() {
        return Math.max(this.f53240b.j(), this.f53241c.j());
    }
}
