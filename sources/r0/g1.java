package r0;

import android.view.WindowInsets;
public class g1 extends f1 {
    public i0.b f46422o;
    public i0.b f46423p;
    public i0.b f46424q;

    public g1(m1 m1Var, WindowInsets windowInsets) {
        super(m1Var, windowInsets);
        this.f46422o = null;
        this.f46423p = null;
        this.f46424q = null;
    }

    @Override
    public i0.b h() {
        if (this.f46423p == null) {
            this.f46423p = i0.b.c(this.f46412c.getMandatorySystemGestureInsets());
        }
        return this.f46423p;
    }

    @Override
    public i0.b j() {
        if (this.f46422o == null) {
            this.f46422o = i0.b.c(this.f46412c.getSystemGestureInsets());
        }
        return this.f46422o;
    }

    @Override
    public i0.b l() {
        if (this.f46424q == null) {
            this.f46424q = i0.b.c(this.f46412c.getTappableElementInsets());
        }
        return this.f46424q;
    }

    @Override
    public m1 m(int i10, int i11, int i12, int i13) {
        return m1.h(null, this.f46412c.inset(i10, i11, i12, i13));
    }

    @Override
    public void s(i0.b bVar) {
    }
}
