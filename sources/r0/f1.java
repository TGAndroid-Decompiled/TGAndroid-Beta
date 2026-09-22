package r0;

import android.view.WindowInsets;
public class f1 extends e1 {
    public i0.b f42148o;
    public i0.b f42149p;
    public i0.b f42150q;

    public f1(l1 l1Var, WindowInsets windowInsets) {
        super(l1Var, windowInsets);
        this.f42148o = null;
        this.f42149p = null;
        this.f42150q = null;
    }

    @Override
    public i0.b h() {
        if (this.f42149p == null) {
            this.f42149p = i0.b.c(this.f42140c.getMandatorySystemGestureInsets());
        }
        return this.f42149p;
    }

    @Override
    public i0.b j() {
        if (this.f42148o == null) {
            this.f42148o = i0.b.c(this.f42140c.getSystemGestureInsets());
        }
        return this.f42148o;
    }

    @Override
    public i0.b l() {
        if (this.f42150q == null) {
            this.f42150q = i0.b.c(this.f42140c.getTappableElementInsets());
        }
        return this.f42150q;
    }

    @Override
    public l1 m(int i10, int i11, int i12, int i13) {
        return l1.h(null, this.f42140c.inset(i10, i11, i12, i13));
    }

    @Override
    public void s(i0.b bVar) {
    }
}
