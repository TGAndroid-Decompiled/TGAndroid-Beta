package r0;

import android.view.WindowInsets;
public class f1 extends e1 {
    public i0.b f45587o;
    public i0.b f45588p;
    public i0.b f45589q;

    public f1(l1 l1Var, WindowInsets windowInsets) {
        super(l1Var, windowInsets);
        this.f45587o = null;
        this.f45588p = null;
        this.f45589q = null;
    }

    @Override
    public i0.b h() {
        if (this.f45588p == null) {
            this.f45588p = i0.b.c(this.f45577c.getMandatorySystemGestureInsets());
        }
        return this.f45588p;
    }

    @Override
    public i0.b j() {
        if (this.f45587o == null) {
            this.f45587o = i0.b.c(this.f45577c.getSystemGestureInsets());
        }
        return this.f45587o;
    }

    @Override
    public i0.b l() {
        if (this.f45589q == null) {
            this.f45589q = i0.b.c(this.f45577c.getTappableElementInsets());
        }
        return this.f45589q;
    }

    @Override
    public l1 m(int i10, int i11, int i12, int i13) {
        return l1.h(null, this.f45577c.inset(i10, i11, i12, i13));
    }

    @Override
    public void s(i0.b bVar) {
    }
}
