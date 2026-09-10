package r0;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import j$.util.Objects;
public class e1 extends d1 {
    public e1(l1 l1Var, WindowInsets windowInsets) {
        super(l1Var, windowInsets);
    }

    @Override
    public l1 a() {
        return l1.h(null, this.f41039c.consumeDisplayCutout());
    }

    @Override
    public i e() {
        DisplayCutout displayCutout = this.f41039c.getDisplayCutout();
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
        if (!(obj instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        if (Objects.equals(this.f41039c, e1Var.f41039c) && Objects.equals(this.f41041g, e1Var.f41041g) && c1.B(this.h, e1Var.h)) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.f41039c.hashCode();
    }
}
