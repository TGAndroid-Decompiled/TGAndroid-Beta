package r0;

import android.view.WindowInsets;
public class f1 extends e1 {
    public i0.b f45594o;
    public i0.b f45595p;
    public i0.b f45596q;

    public f1(l1 l1Var, WindowInsets windowInsets) {
        super(l1Var, windowInsets);
        this.f45594o = null;
        this.f45595p = null;
        this.f45596q = null;
    }

    @Override
    public i0.b h() {
        if (this.f45595p == null) {
            this.f45595p = i0.b.c(this.f45584c.getMandatorySystemGestureInsets());
        }
        return this.f45595p;
    }

    @Override
    public i0.b j() {
        if (this.f45594o == null) {
            this.f45594o = i0.b.c(this.f45584c.getSystemGestureInsets());
        }
        return this.f45594o;
    }

    @Override
    public i0.b l() {
        if (this.f45596q == null) {
            this.f45596q = i0.b.c(this.f45584c.getTappableElementInsets());
        }
        return this.f45596q;
    }

    @Override
    public l1 m(int i10, int i11, int i12, int i13) {
        return l1.h(null, this.f45584c.inset(i10, i11, i12, i13));
    }

    @Override
    public void s(i0.b bVar) {
    }
}
