package r0;

import android.view.WindowInsets;

public class g1 extends f1 {

    public i0.c f46589o;

    public i0.c f46590p;

    public i0.c f46591q;

    public g1(m1 m1Var, WindowInsets windowInsets) {
        super(m1Var, windowInsets);
        this.f46589o = null;
        this.f46590p = null;
        this.f46591q = null;
    }

    @Override
    public i0.c h() {
        if (this.f46590p == null) {
            this.f46590p = i0.c.c(this.f46579c.getMandatorySystemGestureInsets());
        }
        return this.f46590p;
    }

    @Override
    public i0.c j() {
        if (this.f46589o == null) {
            this.f46589o = i0.c.c(this.f46579c.getSystemGestureInsets());
        }
        return this.f46589o;
    }

    @Override
    public i0.c l() {
        if (this.f46591q == null) {
            this.f46591q = i0.c.c(this.f46579c.getTappableElementInsets());
        }
        return this.f46591q;
    }

    @Override
    public m1 m(int i10, int i11, int i12, int i13) {
        return m1.h(null, this.f46579c.inset(i10, i11, i12, i13));
    }

    @Override
    public void s(i0.c cVar) {
    }
}
