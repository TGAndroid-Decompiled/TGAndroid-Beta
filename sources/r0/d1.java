package r0;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import j$.util.Objects;
public class d1 extends c1 {
    public d1(l1 l1Var, WindowInsets windowInsets) {
        super(l1Var, windowInsets);
    }

    @Override
    public l1 a() {
        return l1.h(null, this.f56268c.consumeDisplayCutout());
    }

    @Override
    public h e() {
        DisplayCutout displayCutout = this.f56268c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new h(displayCutout);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj;
        if (Objects.equals(this.f56268c, d1Var.f56268c) && Objects.equals(this.f56271g, d1Var.f56271g) && b1.B(this.h, d1Var.h)) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.f56268c.hashCode();
    }
}
