package r0;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import j$.util.Objects;
public class d1 extends c1 {
    public d1(k1 k1Var, WindowInsets windowInsets) {
        super(k1Var, windowInsets);
    }

    @Override
    public k1 a() {
        return k1.h(null, this.f53993c.consumeDisplayCutout());
    }

    @Override
    public h e() {
        DisplayCutout displayCutout = this.f53993c.getDisplayCutout();
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
        if (Objects.equals(this.f53993c, d1Var.f53993c) && Objects.equals(this.f53996g, d1Var.f53996g) && b1.B(this.h, d1Var.h)) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.f53993c.hashCode();
    }
}
