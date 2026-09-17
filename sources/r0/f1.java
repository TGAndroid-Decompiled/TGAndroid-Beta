package r0;

import android.view.WindowInsets;
public class f1 extends e1 {
    public i0.b f41850o;
    public i0.b f41851p;
    public i0.b f41852q;

    public f1(l1 l1Var, WindowInsets windowInsets) {
        super(l1Var, windowInsets);
        this.f41850o = null;
        this.f41851p = null;
        this.f41852q = null;
    }

    @Override
    public i0.b h() {
        if (this.f41851p == null) {
            this.f41851p = i0.b.c(this.f41842c.getMandatorySystemGestureInsets());
        }
        return this.f41851p;
    }

    @Override
    public i0.b j() {
        if (this.f41850o == null) {
            this.f41850o = i0.b.c(this.f41842c.getSystemGestureInsets());
        }
        return this.f41850o;
    }

    @Override
    public i0.b l() {
        if (this.f41852q == null) {
            this.f41852q = i0.b.c(this.f41842c.getTappableElementInsets());
        }
        return this.f41852q;
    }

    @Override
    public l1 m(int i10, int i11, int i12, int i13) {
        return l1.h(null, this.f41842c.inset(i10, i11, i12, i13));
    }

    @Override
    public void s(i0.b bVar) {
    }
}
