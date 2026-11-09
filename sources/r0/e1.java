package r0;

import android.view.WindowInsets;
public class e1 extends d1 {
    public i0.b f54191o;
    public i0.b f54192p;
    public i0.b f54193q;

    public e1(k1 k1Var, WindowInsets windowInsets) {
        super(k1Var, windowInsets);
        this.f54191o = null;
        this.f54192p = null;
        this.f54193q = null;
    }

    @Override
    public i0.b h() {
        if (this.f54192p == null) {
            this.f54192p = i0.b.c(this.f54181c.getMandatorySystemGestureInsets());
        }
        return this.f54192p;
    }

    @Override
    public i0.b j() {
        if (this.f54191o == null) {
            this.f54191o = i0.b.c(this.f54181c.getSystemGestureInsets());
        }
        return this.f54191o;
    }

    @Override
    public i0.b l() {
        if (this.f54193q == null) {
            this.f54193q = i0.b.c(this.f54181c.getTappableElementInsets());
        }
        return this.f54193q;
    }

    @Override
    public k1 m(int i7, int i10, int i11, int i12) {
        return k1.h(null, this.f54181c.inset(i7, i10, i11, i12));
    }

    @Override
    public void s(i0.b bVar) {
    }
}
