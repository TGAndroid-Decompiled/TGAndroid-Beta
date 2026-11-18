package r0;

import android.view.WindowInsets;
public class e1 extends d1 {
    public i0.b f56233o;
    public i0.b f56234p;
    public i0.b f56235q;

    public e1(l1 l1Var, WindowInsets windowInsets) {
        super(l1Var, windowInsets);
        this.f56233o = null;
        this.f56234p = null;
        this.f56235q = null;
    }

    @Override
    public i0.b h() {
        if (this.f56234p == null) {
            this.f56234p = i0.b.c(this.f56223c.getMandatorySystemGestureInsets());
        }
        return this.f56234p;
    }

    @Override
    public i0.b j() {
        if (this.f56233o == null) {
            this.f56233o = i0.b.c(this.f56223c.getSystemGestureInsets());
        }
        return this.f56233o;
    }

    @Override
    public i0.b l() {
        if (this.f56235q == null) {
            this.f56235q = i0.b.c(this.f56223c.getTappableElementInsets());
        }
        return this.f56235q;
    }

    @Override
    public l1 m(int i7, int i10, int i11, int i12) {
        return l1.h(null, this.f56223c.inset(i7, i10, i11, i12));
    }

    @Override
    public void s(i0.b bVar) {
    }
}
