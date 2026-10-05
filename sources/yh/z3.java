package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.f11;
public final class z3 {
    public final float f52344a;
    public final f11 f52345b;
    public final f11 f52346c;

    public z3(float f7, String str, CharSequence charSequence) {
        this.f52345b = new f11(str, 12.0f, null);
        this.f52346c = new f11(charSequence, 12.0f, AndroidUtilities.bold());
        this.f52344a = (a() / 2.0f) + f7;
    }

    public final float a() {
        return Math.max(this.f52345b.j(), this.f52346c.j());
    }
}
