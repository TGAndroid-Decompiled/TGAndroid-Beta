package r0;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import j$.util.Objects;

public class f1 extends e1 {
    public f1(m1 m1Var, WindowInsets windowInsets) {
        super(m1Var, windowInsets);
    }

    @Override
    public m1 a() {
        return m1.h(null, this.f46579c.consumeDisplayCutout());
    }

    @Override
    public j e() {
        DisplayCutout displayCutout = this.f46579c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new j(displayCutout);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1)) {
            return false;
        }
        f1 f1Var = (f1) obj;
        return Objects.equals(this.f46579c, f1Var.f46579c) && Objects.equals(this.f46582g, f1Var.f46582g) && d1.B(this.h, f1Var.h);
    }

    @Override
    public int hashCode() {
        return this.f46579c.hashCode();
    }
}
