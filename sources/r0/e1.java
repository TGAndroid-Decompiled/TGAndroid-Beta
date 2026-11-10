package r0;

import android.view.WindowInsets;
public class e1 extends d1 {
    public i0.b f54190o;
    public i0.b f54191p;
    public i0.b f54192q;

    public e1(k1 k1Var, WindowInsets windowInsets) {
        super(k1Var, windowInsets);
        this.f54190o = null;
        this.f54191p = null;
        this.f54192q = null;
    }

    @Override
    public i0.b h() {
        if (this.f54191p == null) {
            this.f54191p = i0.b.c(this.f54180c.getMandatorySystemGestureInsets());
        }
        return this.f54191p;
    }

    @Override
    public i0.b j() {
        if (this.f54190o == null) {
            this.f54190o = i0.b.c(this.f54180c.getSystemGestureInsets());
        }
        return this.f54190o;
    }

    @Override
    public i0.b l() {
        if (this.f54192q == null) {
            this.f54192q = i0.b.c(this.f54180c.getTappableElementInsets());
        }
        return this.f54192q;
    }

    @Override
    public k1 m(int i7, int i10, int i11, int i12) {
        return k1.h(null, this.f54180c.inset(i7, i10, i11, i12));
    }

    @Override
    public void s(i0.b bVar) {
    }
}
