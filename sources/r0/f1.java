package r0;

import android.view.WindowInsets;
public class f1 extends e1 {
    public i0.b f42114o;
    public i0.b f42115p;
    public i0.b f42116q;

    public f1(l1 l1Var, WindowInsets windowInsets) {
        super(l1Var, windowInsets);
        this.f42114o = null;
        this.f42115p = null;
        this.f42116q = null;
    }

    @Override
    public i0.b h() {
        if (this.f42115p == null) {
            this.f42115p = i0.b.c(this.f42106c.getMandatorySystemGestureInsets());
        }
        return this.f42115p;
    }

    @Override
    public i0.b j() {
        if (this.f42114o == null) {
            this.f42114o = i0.b.c(this.f42106c.getSystemGestureInsets());
        }
        return this.f42114o;
    }

    @Override
    public i0.b l() {
        if (this.f42116q == null) {
            this.f42116q = i0.b.c(this.f42106c.getTappableElementInsets());
        }
        return this.f42116q;
    }

    @Override
    public l1 m(int i10, int i11, int i12, int i13) {
        return l1.h(null, this.f42106c.inset(i10, i11, i12, i13));
    }

    @Override
    public void s(i0.b bVar) {
    }
}
