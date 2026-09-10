package r0;

import android.view.WindowInsets;
public class f1 extends e1 {
    public i0.c f41047o;
    public i0.c f41048p;
    public i0.c f41049q;

    public f1(l1 l1Var, WindowInsets windowInsets) {
        super(l1Var, windowInsets);
        this.f41047o = null;
        this.f41048p = null;
        this.f41049q = null;
    }

    @Override
    public i0.c h() {
        if (this.f41048p == null) {
            this.f41048p = i0.c.c(this.f41039c.getMandatorySystemGestureInsets());
        }
        return this.f41048p;
    }

    @Override
    public i0.c j() {
        if (this.f41047o == null) {
            this.f41047o = i0.c.c(this.f41039c.getSystemGestureInsets());
        }
        return this.f41047o;
    }

    @Override
    public i0.c l() {
        if (this.f41049q == null) {
            this.f41049q = i0.c.c(this.f41039c.getTappableElementInsets());
        }
        return this.f41049q;
    }

    @Override
    public l1 m(int i10, int i11, int i12, int i13) {
        return l1.h(null, this.f41039c.inset(i10, i11, i12, i13));
    }

    @Override
    public void s(i0.c cVar) {
    }
}
