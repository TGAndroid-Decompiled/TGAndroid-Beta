package qg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
public class b implements a {
    public final f6 f43080a;
    public final int f43081b;
    public final float f43082c;
    public int d;
    public int e;
    public int f43083f;
    public int h;

    public b(int i10, f6 f6Var) {
        this(f6Var, i10, LiteMode.isEnabled(262144) ? 0.85f : 0.76f);
    }

    @Override
    public int D() {
        return this.h;
    }

    public boolean a() {
        if (AndroidUtilities.computePerceivedBrightness(j6.v0(this.f43081b, this.f43080a)) < 0.721f) {
            return true;
        }
        return false;
    }

    public final void b() {
        this.d = j6.l1(this.f43082c, j6.v0(this.f43081b, this.f43080a));
        if (a()) {
            this.f43083f = 687865855;
            this.h = 352321535;
            this.e = 0;
            return;
        }
        this.f43083f = -1;
        this.h = -1;
        this.e = 536870912;
    }

    @Override
    public int e0() {
        return this.e;
    }

    @Override
    public int m0() {
        return this.d;
    }

    @Override
    public int x() {
        return this.f43083f;
    }

    public b(f6 f6Var, int i10, float f10) {
        this.f43080a = f6Var;
        this.f43081b = i10;
        this.f43082c = f10;
        b();
    }
}
