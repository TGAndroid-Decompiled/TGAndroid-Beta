package r0;

import android.view.WindowInsets;
public class g1 extends f1 {
    public i0.b f46899o;
    public i0.b f46900p;
    public i0.b f46901q;

    public g1(m1 m1Var, WindowInsets windowInsets) {
        super(m1Var, windowInsets);
        this.f46899o = null;
        this.f46900p = null;
        this.f46901q = null;
    }

    @Override
    public i0.b h() {
        if (this.f46900p == null) {
            this.f46900p = i0.b.c(this.f46889c.getMandatorySystemGestureInsets());
        }
        return this.f46900p;
    }

    @Override
    public i0.b j() {
        if (this.f46899o == null) {
            this.f46899o = i0.b.c(this.f46889c.getSystemGestureInsets());
        }
        return this.f46899o;
    }

    @Override
    public i0.b l() {
        if (this.f46901q == null) {
            this.f46901q = i0.b.c(this.f46889c.getTappableElementInsets());
        }
        return this.f46901q;
    }

    @Override
    public m1 m(int i9, int i10, int i11, int i12) {
        return m1.h(null, this.f46889c.inset(i9, i10, i11, i12));
    }

    @Override
    public void s(i0.b bVar) {
    }
}
