package r0;

import android.view.WindowInsets;
public class e1 extends d1 {
    public i0.c f44827o;
    public i0.c f44828p;
    public i0.c f44829q;

    public e1(k1 k1Var, WindowInsets windowInsets) {
        super(k1Var, windowInsets);
        this.f44827o = null;
        this.f44828p = null;
        this.f44829q = null;
    }

    @Override
    public i0.c h() {
        if (this.f44828p == null) {
            this.f44828p = i0.c.c(this.f44819c.getMandatorySystemGestureInsets());
        }
        return this.f44828p;
    }

    @Override
    public i0.c j() {
        if (this.f44827o == null) {
            this.f44827o = i0.c.c(this.f44819c.getSystemGestureInsets());
        }
        return this.f44827o;
    }

    @Override
    public i0.c l() {
        if (this.f44829q == null) {
            this.f44829q = i0.c.c(this.f44819c.getTappableElementInsets());
        }
        return this.f44829q;
    }

    @Override
    public k1 m(int i10, int i11, int i12, int i13) {
        return k1.h(null, this.f44819c.inset(i10, i11, i12, i13));
    }

    @Override
    public void s(i0.c cVar) {
    }
}
