package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.g01;
public final class a4 {
    public final float f46920a;
    public final g01 f46921b;
    public final g01 f46922c;

    public a4(float f7, String str, CharSequence charSequence) {
        this.f46921b = new g01(str, 12.0f, null);
        this.f46922c = new g01(charSequence, 12.0f, AndroidUtilities.bold());
        this.f46920a = (a() / 2.0f) + f7;
    }

    public final float a() {
        return Math.max(this.f46921b.j(), this.f46922c.j());
    }
}
