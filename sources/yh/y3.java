package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.w01;
public final class y3 {
    public final float f48400a;
    public final w01 f48401b;
    public final w01 f48402c;

    public y3(float f7, String str, CharSequence charSequence) {
        this.f48401b = new w01(str, 12.0f, null);
        this.f48402c = new w01(charSequence, 12.0f, AndroidUtilities.bold());
        this.f48400a = (a() / 2.0f) + f7;
    }

    public final float a() {
        return Math.max(this.f48401b.j(), this.f48402c.j());
    }
}
