package r0;

import android.view.WindowInsets;
public class e1 extends d1 {
    public i0.b f45224o;
    public i0.b f45225p;
    public i0.b f45226q;

    public e1(k1 k1Var, WindowInsets windowInsets) {
        super(k1Var, windowInsets);
        this.f45224o = null;
        this.f45225p = null;
        this.f45226q = null;
    }

    @Override
    public i0.b h() {
        if (this.f45225p == null) {
            this.f45225p = i0.b.c(this.f45216c.getMandatorySystemGestureInsets());
        }
        return this.f45225p;
    }

    @Override
    public i0.b j() {
        if (this.f45224o == null) {
            this.f45224o = i0.b.c(this.f45216c.getSystemGestureInsets());
        }
        return this.f45224o;
    }

    @Override
    public i0.b l() {
        if (this.f45226q == null) {
            this.f45226q = i0.b.c(this.f45216c.getTappableElementInsets());
        }
        return this.f45226q;
    }

    @Override
    public k1 m(int i10, int i11, int i12, int i13) {
        return k1.h(null, this.f45216c.inset(i10, i11, i12, i13));
    }

    @Override
    public void s(i0.b bVar) {
    }
}
