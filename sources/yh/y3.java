package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.e11;
public final class y3 {
    public final float f52288a;
    public final e11 f52289b;
    public final e11 f52290c;

    public y3(float f7, String str, CharSequence charSequence) {
        this.f52289b = new e11(str, 12.0f, null);
        this.f52290c = new e11(charSequence, 12.0f, AndroidUtilities.bold());
        this.f52288a = (a() / 2.0f) + f7;
    }

    public final float a() {
        return Math.max(this.f52289b.j(), this.f52290c.j());
    }
}
