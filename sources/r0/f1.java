package r0;

import android.view.WindowInsets;
public class f1 extends e1 {
    public i0.c f44681o;
    public i0.c f44682p;
    public i0.c f44683q;

    public f1(l1 l1Var, WindowInsets windowInsets) {
        super(l1Var, windowInsets);
        this.f44681o = null;
        this.f44682p = null;
        this.f44683q = null;
    }

    @Override
    public i0.c h() {
        if (this.f44682p == null) {
            this.f44682p = i0.c.c(this.f44671c.getMandatorySystemGestureInsets());
        }
        return this.f44682p;
    }

    @Override
    public i0.c j() {
        if (this.f44681o == null) {
            this.f44681o = i0.c.c(this.f44671c.getSystemGestureInsets());
        }
        return this.f44681o;
    }

    @Override
    public i0.c l() {
        if (this.f44683q == null) {
            this.f44683q = i0.c.c(this.f44671c.getTappableElementInsets());
        }
        return this.f44683q;
    }

    @Override
    public l1 m(int i10, int i11, int i12, int i13) {
        return l1.h(null, this.f44671c.inset(i10, i11, i12, i13));
    }

    @Override
    public void s(i0.c cVar) {
    }
}
