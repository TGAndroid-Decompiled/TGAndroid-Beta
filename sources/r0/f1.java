package r0;

import android.view.WindowInsets;
public class f1 extends e1 {
    public i0.b f43714o;
    public i0.b f43715p;
    public i0.b f43716q;

    public f1(l1 l1Var, WindowInsets windowInsets) {
        super(l1Var, windowInsets);
        this.f43714o = null;
        this.f43715p = null;
        this.f43716q = null;
    }

    @Override
    public i0.b h() {
        if (this.f43715p == null) {
            this.f43715p = i0.b.c(this.f43706c.getMandatorySystemGestureInsets());
        }
        return this.f43715p;
    }

    @Override
    public i0.b j() {
        if (this.f43714o == null) {
            this.f43714o = i0.b.c(this.f43706c.getSystemGestureInsets());
        }
        return this.f43714o;
    }

    @Override
    public i0.b l() {
        if (this.f43716q == null) {
            this.f43716q = i0.b.c(this.f43706c.getTappableElementInsets());
        }
        return this.f43716q;
    }

    @Override
    public l1 m(int i10, int i11, int i12, int i13) {
        return l1.h(null, this.f43706c.inset(i10, i11, i12, i13));
    }

    @Override
    public void s(i0.b bVar) {
    }
}
