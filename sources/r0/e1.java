package r0;

import android.view.WindowInsets;
public class e1 extends d1 {
    public i0.b f54061o;
    public i0.b f54062p;
    public i0.b f54063q;

    public e1(k1 k1Var, WindowInsets windowInsets) {
        super(k1Var, windowInsets);
        this.f54061o = null;
        this.f54062p = null;
        this.f54063q = null;
    }

    @Override
    public i0.b h() {
        if (this.f54062p == null) {
            this.f54062p = i0.b.c(this.f54051c.getMandatorySystemGestureInsets());
        }
        return this.f54062p;
    }

    @Override
    public i0.b j() {
        if (this.f54061o == null) {
            this.f54061o = i0.b.c(this.f54051c.getSystemGestureInsets());
        }
        return this.f54061o;
    }

    @Override
    public i0.b l() {
        if (this.f54063q == null) {
            this.f54063q = i0.b.c(this.f54051c.getTappableElementInsets());
        }
        return this.f54063q;
    }

    @Override
    public k1 m(int i7, int i10, int i11, int i12) {
        return k1.h(null, this.f54051c.inset(i7, i10, i11, i12));
    }

    @Override
    public void s(i0.b bVar) {
    }
}
