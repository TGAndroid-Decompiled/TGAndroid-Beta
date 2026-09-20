package r0;

import android.view.WindowInsets;
public class f1 extends e1 {
    public i0.b f42127o;
    public i0.b f42128p;
    public i0.b f42129q;

    public f1(l1 l1Var, WindowInsets windowInsets) {
        super(l1Var, windowInsets);
        this.f42127o = null;
        this.f42128p = null;
        this.f42129q = null;
    }

    @Override
    public i0.b h() {
        if (this.f42128p == null) {
            this.f42128p = i0.b.c(this.f42119c.getMandatorySystemGestureInsets());
        }
        return this.f42128p;
    }

    @Override
    public i0.b j() {
        if (this.f42127o == null) {
            this.f42127o = i0.b.c(this.f42119c.getSystemGestureInsets());
        }
        return this.f42127o;
    }

    @Override
    public i0.b l() {
        if (this.f42129q == null) {
            this.f42129q = i0.b.c(this.f42119c.getTappableElementInsets());
        }
        return this.f42129q;
    }

    @Override
    public l1 m(int i10, int i11, int i12, int i13) {
        return l1.h(null, this.f42119c.inset(i10, i11, i12, i13));
    }

    @Override
    public void s(i0.b bVar) {
    }
}
