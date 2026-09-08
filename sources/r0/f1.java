package r0;

import android.view.WindowInsets;
public class f1 extends e1 {
    public i0.c f44709o;
    public i0.c f44710p;
    public i0.c f44711q;

    public f1(l1 l1Var, WindowInsets windowInsets) {
        super(l1Var, windowInsets);
        this.f44709o = null;
        this.f44710p = null;
        this.f44711q = null;
    }

    @Override
    public i0.c h() {
        if (this.f44710p == null) {
            this.f44710p = i0.c.c(this.f44699c.getMandatorySystemGestureInsets());
        }
        return this.f44710p;
    }

    @Override
    public i0.c j() {
        if (this.f44709o == null) {
            this.f44709o = i0.c.c(this.f44699c.getSystemGestureInsets());
        }
        return this.f44709o;
    }

    @Override
    public i0.c l() {
        if (this.f44711q == null) {
            this.f44711q = i0.c.c(this.f44699c.getTappableElementInsets());
        }
        return this.f44711q;
    }

    @Override
    public l1 m(int i10, int i11, int i12, int i13) {
        return l1.h(null, this.f44699c.inset(i10, i11, i12, i13));
    }

    @Override
    public void s(i0.c cVar) {
    }
}
