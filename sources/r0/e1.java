package r0;

import android.view.WindowInsets;
public class e1 extends d1 {
    public i0.b f44801o;
    public i0.b f44802p;
    public i0.b f44803q;

    public e1(k1 k1Var, WindowInsets windowInsets) {
        super(k1Var, windowInsets);
        this.f44801o = null;
        this.f44802p = null;
        this.f44803q = null;
    }

    @Override
    public i0.b h() {
        if (this.f44802p == null) {
            this.f44802p = i0.b.c(this.f44793c.getMandatorySystemGestureInsets());
        }
        return this.f44802p;
    }

    @Override
    public i0.b j() {
        if (this.f44801o == null) {
            this.f44801o = i0.b.c(this.f44793c.getSystemGestureInsets());
        }
        return this.f44801o;
    }

    @Override
    public i0.b l() {
        if (this.f44803q == null) {
            this.f44803q = i0.b.c(this.f44793c.getTappableElementInsets());
        }
        return this.f44803q;
    }

    @Override
    public k1 m(int i10, int i11, int i12, int i13) {
        return k1.h(null, this.f44793c.inset(i10, i11, i12, i13));
    }

    @Override
    public void s(i0.b bVar) {
    }
}
