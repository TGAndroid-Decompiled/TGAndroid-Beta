package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.e11;
public final class y3 {
    public final float f52287a;
    public final e11 f52288b;
    public final e11 f52289c;

    public y3(float f7, String str, CharSequence charSequence) {
        this.f52288b = new e11(str, 12.0f, null);
        this.f52289c = new e11(charSequence, 12.0f, AndroidUtilities.bold());
        this.f52287a = (a() / 2.0f) + f7;
    }

    public final float a() {
        return Math.max(this.f52288b.j(), this.f52289c.j());
    }
}
