package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.w01;
public final class z3 {
    public final float f48383a;
    public final w01 f48384b;
    public final w01 f48385c;

    public z3(float f7, String str, CharSequence charSequence) {
        this.f48384b = new w01(str, 12.0f, null);
        this.f48385c = new w01(charSequence, 12.0f, AndroidUtilities.bold());
        this.f48383a = (a() / 2.0f) + f7;
    }

    public final float a() {
        return Math.max(this.f48384b.j(), this.f48385c.j());
    }
}
