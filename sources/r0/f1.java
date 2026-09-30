package r0;

import android.view.WindowInsets;
public class f1 extends e1 {
    public i0.b f42115o;
    public i0.b f42116p;
    public i0.b f42117q;

    public f1(l1 l1Var, WindowInsets windowInsets) {
        super(l1Var, windowInsets);
        this.f42115o = null;
        this.f42116p = null;
        this.f42117q = null;
    }

    @Override
    public i0.b h() {
        if (this.f42116p == null) {
            this.f42116p = i0.b.c(this.f42107c.getMandatorySystemGestureInsets());
        }
        return this.f42116p;
    }

    @Override
    public i0.b j() {
        if (this.f42115o == null) {
            this.f42115o = i0.b.c(this.f42107c.getSystemGestureInsets());
        }
        return this.f42115o;
    }

    @Override
    public i0.b l() {
        if (this.f42117q == null) {
            this.f42117q = i0.b.c(this.f42107c.getTappableElementInsets());
        }
        return this.f42117q;
    }

    @Override
    public l1 m(int i10, int i11, int i12, int i13) {
        return l1.h(null, this.f42107c.inset(i10, i11, i12, i13));
    }

    @Override
    public void s(i0.b bVar) {
    }
}
