package r0;

import android.view.WindowInsets;
public class f1 extends e1 {
    public i0.c f44710o;
    public i0.c f44711p;
    public i0.c f44712q;

    public f1(l1 l1Var, WindowInsets windowInsets) {
        super(l1Var, windowInsets);
        this.f44710o = null;
        this.f44711p = null;
        this.f44712q = null;
    }

    @Override
    public i0.c h() {
        if (this.f44711p == null) {
            this.f44711p = i0.c.c(this.f44700c.getMandatorySystemGestureInsets());
        }
        return this.f44711p;
    }

    @Override
    public i0.c j() {
        if (this.f44710o == null) {
            this.f44710o = i0.c.c(this.f44700c.getSystemGestureInsets());
        }
        return this.f44710o;
    }

    @Override
    public i0.c l() {
        if (this.f44712q == null) {
            this.f44712q = i0.c.c(this.f44700c.getTappableElementInsets());
        }
        return this.f44712q;
    }

    @Override
    public l1 m(int i10, int i11, int i12, int i13) {
        return l1.h(null, this.f44700c.inset(i10, i11, i12, i13));
    }

    @Override
    public void s(i0.c cVar) {
    }
}
