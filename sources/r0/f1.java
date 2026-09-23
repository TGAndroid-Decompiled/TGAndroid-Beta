package r0;

import android.view.WindowInsets;
public class f1 extends e1 {
    public i0.b f41780o;
    public i0.b f41781p;
    public i0.b f41782q;

    public f1(l1 l1Var, WindowInsets windowInsets) {
        super(l1Var, windowInsets);
        this.f41780o = null;
        this.f41781p = null;
        this.f41782q = null;
    }

    @Override
    public i0.b h() {
        if (this.f41781p == null) {
            this.f41781p = i0.b.c(this.f41772c.getMandatorySystemGestureInsets());
        }
        return this.f41781p;
    }

    @Override
    public i0.b j() {
        if (this.f41780o == null) {
            this.f41780o = i0.b.c(this.f41772c.getSystemGestureInsets());
        }
        return this.f41780o;
    }

    @Override
    public i0.b l() {
        if (this.f41782q == null) {
            this.f41782q = i0.b.c(this.f41772c.getTappableElementInsets());
        }
        return this.f41782q;
    }

    @Override
    public l1 m(int i10, int i11, int i12, int i13) {
        return l1.h(null, this.f41772c.inset(i10, i11, i12, i13));
    }

    @Override
    public void s(i0.b bVar) {
    }
}
