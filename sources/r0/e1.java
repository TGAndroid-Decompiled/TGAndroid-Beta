package r0;

import android.view.WindowInsets;
public class e1 extends d1 {
    public i0.b f47088o;
    public i0.b f47089p;
    public i0.b f47090q;

    public e1(k1 k1Var, WindowInsets windowInsets) {
        super(k1Var, windowInsets);
        this.f47088o = null;
        this.f47089p = null;
        this.f47090q = null;
    }

    @Override
    public i0.b h() {
        if (this.f47089p == null) {
            this.f47089p = i0.b.c(this.f47080c.getMandatorySystemGestureInsets());
        }
        return this.f47089p;
    }

    @Override
    public i0.b j() {
        if (this.f47088o == null) {
            this.f47088o = i0.b.c(this.f47080c.getSystemGestureInsets());
        }
        return this.f47088o;
    }

    @Override
    public i0.b l() {
        if (this.f47090q == null) {
            this.f47090q = i0.b.c(this.f47080c.getTappableElementInsets());
        }
        return this.f47090q;
    }

    @Override
    public k1 m(int i10, int i11, int i12, int i13) {
        return k1.h(null, this.f47080c.inset(i10, i11, i12, i13));
    }

    @Override
    public void s(i0.b bVar) {
    }
}
