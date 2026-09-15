package r0;

import android.view.WindowInsets;
public class f1 extends e1 {
    public i0.b f41828o;
    public i0.b f41829p;
    public i0.b f41830q;

    public f1(l1 l1Var, WindowInsets windowInsets) {
        super(l1Var, windowInsets);
        this.f41828o = null;
        this.f41829p = null;
        this.f41830q = null;
    }

    @Override
    public i0.b h() {
        if (this.f41829p == null) {
            this.f41829p = i0.b.c(this.f41820c.getMandatorySystemGestureInsets());
        }
        return this.f41829p;
    }

    @Override
    public i0.b j() {
        if (this.f41828o == null) {
            this.f41828o = i0.b.c(this.f41820c.getSystemGestureInsets());
        }
        return this.f41828o;
    }

    @Override
    public i0.b l() {
        if (this.f41830q == null) {
            this.f41830q = i0.b.c(this.f41820c.getTappableElementInsets());
        }
        return this.f41830q;
    }

    @Override
    public l1 m(int i10, int i11, int i12, int i13) {
        return l1.h(null, this.f41820c.inset(i10, i11, i12, i13));
    }

    @Override
    public void s(i0.b bVar) {
    }
}
