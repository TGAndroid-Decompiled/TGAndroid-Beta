package zh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.f01;
public final class x3 {
    public final float f52843a;
    public final f01 f52844b;
    public final f01 f52845c;

    public x3(float f7, String str, CharSequence charSequence) {
        this.f52844b = new f01(str, 12.0f, null);
        this.f52845c = new f01(charSequence, 12.0f, AndroidUtilities.bold());
        this.f52843a = (a() / 2.0f) + f7;
    }

    public final float a() {
        return Math.max(this.f52844b.j(), this.f52845c.j());
    }
}
