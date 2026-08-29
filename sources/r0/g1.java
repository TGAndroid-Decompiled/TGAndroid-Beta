package r0;

import android.view.WindowInsets;
public class g1 extends f1 {
    public i0.b f46813o;
    public i0.b f46814p;
    public i0.b f46815q;

    public g1(m1 m1Var, WindowInsets windowInsets) {
        super(m1Var, windowInsets);
        this.f46813o = null;
        this.f46814p = null;
        this.f46815q = null;
    }

    @Override
    public i0.b h() {
        if (this.f46814p == null) {
            this.f46814p = i0.b.c(this.f46803c.getMandatorySystemGestureInsets());
        }
        return this.f46814p;
    }

    @Override
    public i0.b j() {
        if (this.f46813o == null) {
            this.f46813o = i0.b.c(this.f46803c.getSystemGestureInsets());
        }
        return this.f46813o;
    }

    @Override
    public i0.b l() {
        if (this.f46815q == null) {
            this.f46815q = i0.b.c(this.f46803c.getTappableElementInsets());
        }
        return this.f46815q;
    }

    @Override
    public m1 m(int i10, int i11, int i12, int i13) {
        return m1.h(null, this.f46803c.inset(i10, i11, i12, i13));
    }

    @Override
    public void s(i0.b bVar) {
    }
}
