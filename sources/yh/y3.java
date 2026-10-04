package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.e11;
public final class y3 {
    public final float f52293a;
    public final e11 f52294b;
    public final e11 f52295c;

    public y3(float f7, String str, CharSequence charSequence) {
        this.f52294b = new e11(str, 12.0f, null);
        this.f52295c = new e11(charSequence, 12.0f, AndroidUtilities.bold());
        this.f52293a = (a() / 2.0f) + f7;
    }

    public final float a() {
        return Math.max(this.f52294b.j(), this.f52295c.j());
    }
}
