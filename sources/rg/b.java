package rg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
public class b implements a {
    public final g6 f46834a;
    public final int f46835b;
    public final float f46836c;
    public int d;
    public int f46837e;
    public int f46838f;
    public int h;

    public b(int i10, g6 g6Var) {
        this(g6Var, i10, LiteMode.isEnabled(262144) ? 0.85f : 0.76f);
    }

    @Override
    public int I() {
        return this.f46837e;
    }

    @Override
    public int U() {
        return this.d;
    }

    public boolean a() {
        if (AndroidUtilities.computePerceivedBrightness(k6.v0(this.f46835b, this.f46834a)) < 0.721f) {
            return true;
        }
        return false;
    }

    public final void b() {
        this.d = k6.l1(this.f46836c, k6.v0(this.f46835b, this.f46834a));
        if (a()) {
            this.f46838f = 687865855;
            this.h = 352321535;
            this.f46837e = 0;
            return;
        }
        this.f46838f = -1;
        this.h = -1;
        this.f46837e = 536870912;
    }

    @Override
    public int k() {
        return this.f46838f;
    }

    @Override
    public int x() {
        return this.h;
    }

    public b(g6 g6Var, int i10, float f10) {
        this.f46834a = g6Var;
        this.f46835b = i10;
        this.f46836c = f10;
        b();
    }
}
