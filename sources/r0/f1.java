package r0;

import android.view.WindowInsets;
public class f1 extends e1 {
    public i0.b f42158o;
    public i0.b f42159p;
    public i0.b f42160q;

    public f1(l1 l1Var, WindowInsets windowInsets) {
        super(l1Var, windowInsets);
        this.f42158o = null;
        this.f42159p = null;
        this.f42160q = null;
    }

    @Override
    public i0.b h() {
        if (this.f42159p == null) {
            this.f42159p = i0.b.c(this.f42150c.getMandatorySystemGestureInsets());
        }
        return this.f42159p;
    }

    @Override
    public i0.b j() {
        if (this.f42158o == null) {
            this.f42158o = i0.b.c(this.f42150c.getSystemGestureInsets());
        }
        return this.f42158o;
    }

    @Override
    public i0.b l() {
        if (this.f42160q == null) {
            this.f42160q = i0.b.c(this.f42150c.getTappableElementInsets());
        }
        return this.f42160q;
    }

    @Override
    public l1 m(int i10, int i11, int i12, int i13) {
        return l1.h(null, this.f42150c.inset(i10, i11, i12, i13));
    }

    @Override
    public void s(i0.b bVar) {
    }
}
