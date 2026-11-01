package r0;

import android.view.WindowInsets;
public class d1 extends c1 {
    public i0.c f46118o;
    public i0.c f46119p;
    public i0.c f46120q;

    public d1(j1 j1Var, WindowInsets windowInsets) {
        super(j1Var, windowInsets);
        this.f46118o = null;
        this.f46119p = null;
        this.f46120q = null;
    }

    @Override
    public i0.c h() {
        if (this.f46119p == null) {
            this.f46119p = i0.c.c(this.f46111c.getMandatorySystemGestureInsets());
        }
        return this.f46119p;
    }

    @Override
    public i0.c j() {
        if (this.f46118o == null) {
            this.f46118o = i0.c.c(this.f46111c.getSystemGestureInsets());
        }
        return this.f46118o;
    }

    @Override
    public i0.c l() {
        if (this.f46120q == null) {
            this.f46120q = i0.c.c(this.f46111c.getTappableElementInsets());
        }
        return this.f46120q;
    }

    @Override
    public j1 m(int i10, int i11, int i12, int i13) {
        return j1.h(null, this.f46111c.inset(i10, i11, i12, i13));
    }

    @Override
    public void s(i0.c cVar) {
    }
}
