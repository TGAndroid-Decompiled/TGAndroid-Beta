package zh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.f01;
public final class x3 {
    public final float f52873a;
    public final f01 f52874b;
    public final f01 f52875c;

    public x3(float f7, String str, CharSequence charSequence) {
        this.f52874b = new f01(str, 12.0f, null);
        this.f52875c = new f01(charSequence, 12.0f, AndroidUtilities.bold());
        this.f52873a = (a() / 2.0f) + f7;
    }

    public final float a() {
        return Math.max(this.f52874b.j(), this.f52875c.j());
    }
}
