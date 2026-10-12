package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.r11;
public final class t3 {
    public final float f53476a;
    public final r11 f53477b;
    public final r11 f53478c;

    public t3(float f7, String str, CharSequence charSequence) {
        this.f53477b = new r11(str, 12.0f, null);
        this.f53478c = new r11(charSequence, 12.0f, AndroidUtilities.bold());
        this.f53476a = (a() / 2.0f) + f7;
    }

    public final float a() {
        return Math.max(this.f53477b.j(), this.f53478c.j());
    }
}
