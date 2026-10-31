package r0;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import j$.util.Objects;
public class c1 extends b1 {
    public c1(j1 j1Var, WindowInsets windowInsets) {
        super(j1Var, windowInsets);
    }

    @Override
    public j1 a() {
        return j1.h(null, this.f46100c.consumeDisplayCutout());
    }

    @Override
    public h e() {
        DisplayCutout displayCutout = this.f46100c.getDisplayCutout();
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
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        if (Objects.equals(this.f46100c, c1Var.f46100c) && Objects.equals(this.f46102g, c1Var.f46102g) && a1.B(this.h, c1Var.h)) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.f46100c.hashCode();
    }
}
