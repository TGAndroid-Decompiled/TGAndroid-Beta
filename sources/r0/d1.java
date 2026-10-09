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
        return k1.h(null, this.f46738c.consumeDisplayCutout());
    }

    @Override
    public i e() {
        DisplayCutout displayCutout = this.f46738c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new i(displayCutout);
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
        if (Objects.equals(this.f46738c, d1Var.f46738c) && Objects.equals(this.f46741g, d1Var.f46741g) && b1.B(this.h, d1Var.h)) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.f46738c.hashCode();
    }
}
