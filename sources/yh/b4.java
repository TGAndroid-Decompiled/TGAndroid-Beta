package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.g01;
public final class b4 {
    public final float f47013a;
    public final g01 f47014b;
    public final g01 f47015c;

    public b4(float f7, String str, CharSequence charSequence) {
        this.f47014b = new g01(str, 12.0f, null);
        this.f47015c = new g01(charSequence, 12.0f, AndroidUtilities.bold());
        this.f47013a = (a() / 2.0f) + f7;
    }

    public final float a() {
        return Math.max(this.f47014b.j(), this.f47015c.j());
    }
}
