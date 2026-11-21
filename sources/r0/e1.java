package r0;

import android.view.WindowInsets;
public class e1 extends d1 {
    public i0.b f56274o;
    public i0.b f56275p;
    public i0.b f56276q;

    public e1(l1 l1Var, WindowInsets windowInsets) {
        super(l1Var, windowInsets);
        this.f56274o = null;
        this.f56275p = null;
        this.f56276q = null;
    }

    @Override
    public i0.b h() {
        if (this.f56275p == null) {
            this.f56275p = i0.b.c(this.f56264c.getMandatorySystemGestureInsets());
        }
        return this.f56275p;
    }

    @Override
    public i0.b j() {
        if (this.f56274o == null) {
            this.f56274o = i0.b.c(this.f56264c.getSystemGestureInsets());
        }
        return this.f56274o;
    }

    @Override
    public i0.b l() {
        if (this.f56276q == null) {
            this.f56276q = i0.b.c(this.f56264c.getTappableElementInsets());
        }
        return this.f56276q;
    }

    @Override
    public l1 m(int i7, int i10, int i11, int i12) {
        return l1.h(null, this.f56264c.inset(i7, i10, i11, i12));
    }

    @Override
    public void s(i0.b bVar) {
    }
}
