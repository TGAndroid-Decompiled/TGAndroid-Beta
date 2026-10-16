package r0;

import android.view.WindowInsets;
public class f1 extends e1 {
    public i0.b f43470o;
    public i0.b f43471p;
    public i0.b f43472q;

    public f1(l1 l1Var, WindowInsets windowInsets) {
        super(l1Var, windowInsets);
        this.f43470o = null;
        this.f43471p = null;
        this.f43472q = null;
    }

    @Override
    public i0.b h() {
        if (this.f43471p == null) {
            this.f43471p = i0.b.c(this.f43462c.getMandatorySystemGestureInsets());
        }
        return this.f43471p;
    }

    @Override
    public i0.b j() {
        if (this.f43470o == null) {
            this.f43470o = i0.b.c(this.f43462c.getSystemGestureInsets());
        }
        return this.f43470o;
    }

    @Override
    public i0.b l() {
        if (this.f43472q == null) {
            this.f43472q = i0.b.c(this.f43462c.getTappableElementInsets());
        }
        return this.f43472q;
    }

    @Override
    public l1 m(int i10, int i11, int i12, int i13) {
        return l1.h(null, this.f43462c.inset(i10, i11, i12, i13));
    }

    @Override
    public void s(i0.b bVar) {
    }
}
