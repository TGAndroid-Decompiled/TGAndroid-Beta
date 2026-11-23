package r0;

import android.view.WindowInsets;
public class e1 extends d1 {
    public i0.b f56278o;
    public i0.b f56279p;
    public i0.b f56280q;

    public e1(l1 l1Var, WindowInsets windowInsets) {
        super(l1Var, windowInsets);
        this.f56278o = null;
        this.f56279p = null;
        this.f56280q = null;
    }

    @Override
    public i0.b h() {
        if (this.f56279p == null) {
            this.f56279p = i0.b.c(this.f56268c.getMandatorySystemGestureInsets());
        }
        return this.f56279p;
    }

    @Override
    public i0.b j() {
        if (this.f56278o == null) {
            this.f56278o = i0.b.c(this.f56268c.getSystemGestureInsets());
        }
        return this.f56278o;
    }

    @Override
    public i0.b l() {
        if (this.f56280q == null) {
            this.f56280q = i0.b.c(this.f56268c.getTappableElementInsets());
        }
        return this.f56280q;
    }

    @Override
    public l1 m(int i7, int i10, int i11, int i12) {
        return l1.h(null, this.f56268c.inset(i7, i10, i11, i12));
    }

    @Override
    public void s(i0.b bVar) {
    }
}
