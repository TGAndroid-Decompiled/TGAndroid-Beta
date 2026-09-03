package r0;

import android.view.WindowInsets;
public class g1 extends f1 {
    public i0.b f43127o;
    public i0.b f43128p;
    public i0.b f43129q;

    public g1(m1 m1Var, WindowInsets windowInsets) {
        super(m1Var, windowInsets);
        this.f43127o = null;
        this.f43128p = null;
        this.f43129q = null;
    }

    @Override
    public i0.b h() {
        if (this.f43128p == null) {
            this.f43128p = i0.b.c(this.f43119c.getMandatorySystemGestureInsets());
        }
        return this.f43128p;
    }

    @Override
    public i0.b j() {
        if (this.f43127o == null) {
            this.f43127o = i0.b.c(this.f43119c.getSystemGestureInsets());
        }
        return this.f43127o;
    }

    @Override
    public i0.b l() {
        if (this.f43129q == null) {
            this.f43129q = i0.b.c(this.f43119c.getTappableElementInsets());
        }
        return this.f43129q;
    }

    @Override
    public m1 m(int i10, int i11, int i12, int i13) {
        return m1.h(null, this.f43119c.inset(i10, i11, i12, i13));
    }

    @Override
    public void s(i0.b bVar) {
    }
}
