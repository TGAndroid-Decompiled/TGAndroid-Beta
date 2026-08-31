package rg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
public class b implements a {
    public final g6 f46803a;
    public final int f46804b;
    public final float f46805c;
    public int d;
    public int f46806e;
    public int f46807f;
    public int h;

    public b(int i10, g6 g6Var) {
        this(g6Var, i10, LiteMode.isEnabled(262144) ? 0.85f : 0.76f);
    }

    @Override
    public int I() {
        return this.f46806e;
    }

    @Override
    public int U() {
        return this.d;
    }

    public boolean a() {
        if (AndroidUtilities.computePerceivedBrightness(k6.v0(this.f46804b, this.f46803a)) < 0.721f) {
            return true;
        }
        return false;
    }

    public final void b() {
        this.d = k6.l1(this.f46805c, k6.v0(this.f46804b, this.f46803a));
        if (a()) {
            this.f46807f = 687865855;
            this.h = 352321535;
            this.f46806e = 0;
            return;
        }
        this.f46807f = -1;
        this.h = -1;
        this.f46806e = 536870912;
    }

    @Override
    public int k() {
        return this.f46807f;
    }

    @Override
    public int x() {
        return this.h;
    }

    public b(g6 g6Var, int i10, float f10) {
        this.f46803a = g6Var;
        this.f46804b = i10;
        this.f46805c = f10;
        b();
    }
}
