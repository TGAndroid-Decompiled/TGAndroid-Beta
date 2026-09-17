package zh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.f01;
public final class x3 {
    public final float f52874a;
    public final f01 f52875b;
    public final f01 f52876c;

    public x3(float f7, String str, CharSequence charSequence) {
        this.f52875b = new f01(str, 12.0f, null);
        this.f52876c = new f01(charSequence, 12.0f, AndroidUtilities.bold());
        this.f52874a = (a() / 2.0f) + f7;
    }

    public final float a() {
        return Math.max(this.f52875b.j(), this.f52876c.j());
    }
}
