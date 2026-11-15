package r0;

import android.view.WindowInsets;
public class e1 extends d1 {
    public i0.c f55659o;
    public i0.c f55660p;
    public i0.c f55661q;

    public e1(k1 k1Var, WindowInsets windowInsets) {
        super(k1Var, windowInsets);
        this.f55659o = null;
        this.f55660p = null;
        this.f55661q = null;
    }

    @Override
    public i0.c h() {
        if (this.f55660p == null) {
            this.f55660p = i0.c.c(this.f55649c.getMandatorySystemGestureInsets());
        }
        return this.f55660p;
    }

    @Override
    public i0.c j() {
        if (this.f55659o == null) {
            this.f55659o = i0.c.c(this.f55649c.getSystemGestureInsets());
        }
        return this.f55659o;
    }

    @Override
    public i0.c l() {
        if (this.f55661q == null) {
            this.f55661q = i0.c.c(this.f55649c.getTappableElementInsets());
        }
        return this.f55661q;
    }

    @Override
    public k1 m(int i7, int i10, int i11, int i12) {
        return k1.h(null, this.f55649c.inset(i7, i10, i11, i12));
    }

    @Override
    public void s(i0.c cVar) {
    }
}
