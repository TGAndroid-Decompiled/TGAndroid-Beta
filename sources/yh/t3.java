package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.r11;
public final class t3 {
    public final float f53464a;
    public final r11 f53465b;
    public final r11 f53466c;

    public t3(float f7, String str, CharSequence charSequence) {
        this.f53465b = new r11(str, 12.0f, null);
        this.f53466c = new r11(charSequence, 12.0f, AndroidUtilities.bold());
        this.f53464a = (a() / 2.0f) + f7;
    }

    public final float a() {
        return Math.max(this.f53465b.j(), this.f53466c.j());
    }
}
