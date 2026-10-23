package r0;

import android.view.WindowInsets;
public class e1 extends d1 {
    public i0.b f44813o;
    public i0.b f44814p;
    public i0.b f44815q;

    public e1(k1 k1Var, WindowInsets windowInsets) {
        super(k1Var, windowInsets);
        this.f44813o = null;
        this.f44814p = null;
        this.f44815q = null;
    }

    @Override
    public i0.b h() {
        if (this.f44814p == null) {
            this.f44814p = i0.b.c(this.f44805c.getMandatorySystemGestureInsets());
        }
        return this.f44814p;
    }

    @Override
    public i0.b j() {
        if (this.f44813o == null) {
            this.f44813o = i0.b.c(this.f44805c.getSystemGestureInsets());
        }
        return this.f44813o;
    }

    @Override
    public i0.b l() {
        if (this.f44815q == null) {
            this.f44815q = i0.b.c(this.f44805c.getTappableElementInsets());
        }
        return this.f44815q;
    }

    @Override
    public k1 m(int i10, int i11, int i12, int i13) {
        return k1.h(null, this.f44805c.inset(i10, i11, i12, i13));
    }

    @Override
    public void s(i0.b bVar) {
    }
}
