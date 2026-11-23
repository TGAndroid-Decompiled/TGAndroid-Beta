package r0;

import android.view.WindowInsets;
public class e1 extends d1 {
    public i0.b f56243o;
    public i0.b f56244p;
    public i0.b f56245q;

    public e1(l1 l1Var, WindowInsets windowInsets) {
        super(l1Var, windowInsets);
        this.f56243o = null;
        this.f56244p = null;
        this.f56245q = null;
    }

    @Override
    public i0.b h() {
        if (this.f56244p == null) {
            this.f56244p = i0.b.c(this.f56233c.getMandatorySystemGestureInsets());
        }
        return this.f56244p;
    }

    @Override
    public i0.b j() {
        if (this.f56243o == null) {
            this.f56243o = i0.b.c(this.f56233c.getSystemGestureInsets());
        }
        return this.f56243o;
    }

    @Override
    public i0.b l() {
        if (this.f56245q == null) {
            this.f56245q = i0.b.c(this.f56233c.getTappableElementInsets());
        }
        return this.f56245q;
    }

    @Override
    public l1 m(int i7, int i10, int i11, int i12) {
        return l1.h(null, this.f56233c.inset(i7, i10, i11, i12));
    }

    @Override
    public void s(i0.b bVar) {
    }
}
