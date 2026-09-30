package r0;

import android.view.WindowInsets;
public class f1 extends e1 {
    public i0.b f42218o;
    public i0.b f42219p;
    public i0.b f42220q;

    public f1(l1 l1Var, WindowInsets windowInsets) {
        super(l1Var, windowInsets);
        this.f42218o = null;
        this.f42219p = null;
        this.f42220q = null;
    }

    @Override
    public i0.b h() {
        if (this.f42219p == null) {
            this.f42219p = i0.b.c(this.f42210c.getMandatorySystemGestureInsets());
        }
        return this.f42219p;
    }

    @Override
    public i0.b j() {
        if (this.f42218o == null) {
            this.f42218o = i0.b.c(this.f42210c.getSystemGestureInsets());
        }
        return this.f42218o;
    }

    @Override
    public i0.b l() {
        if (this.f42220q == null) {
            this.f42220q = i0.b.c(this.f42210c.getTappableElementInsets());
        }
        return this.f42220q;
    }

    @Override
    public l1 m(int i10, int i11, int i12, int i13) {
        return l1.h(null, this.f42210c.inset(i10, i11, i12, i13));
    }

    @Override
    public void s(i0.b bVar) {
    }
}
