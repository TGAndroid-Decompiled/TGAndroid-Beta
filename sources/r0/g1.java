package r0;

import android.view.WindowInsets;
public class g1 extends f1 {
    public i0.b f46453o;
    public i0.b f46454p;
    public i0.b f46455q;

    public g1(m1 m1Var, WindowInsets windowInsets) {
        super(m1Var, windowInsets);
        this.f46453o = null;
        this.f46454p = null;
        this.f46455q = null;
    }

    @Override
    public i0.b h() {
        if (this.f46454p == null) {
            this.f46454p = i0.b.c(this.f46443c.getMandatorySystemGestureInsets());
        }
        return this.f46454p;
    }

    @Override
    public i0.b j() {
        if (this.f46453o == null) {
            this.f46453o = i0.b.c(this.f46443c.getSystemGestureInsets());
        }
        return this.f46453o;
    }

    @Override
    public i0.b l() {
        if (this.f46455q == null) {
            this.f46455q = i0.b.c(this.f46443c.getTappableElementInsets());
        }
        return this.f46455q;
    }

    @Override
    public m1 m(int i10, int i11, int i12, int i13) {
        return m1.h(null, this.f46443c.inset(i10, i11, i12, i13));
    }

    @Override
    public void s(i0.b bVar) {
    }
}
