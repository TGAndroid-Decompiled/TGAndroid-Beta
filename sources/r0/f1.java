package r0;

import android.view.WindowInsets;
public class f1 extends e1 {
    public i0.b f45580o;
    public i0.b f45581p;
    public i0.b f45582q;

    public f1(l1 l1Var, WindowInsets windowInsets) {
        super(l1Var, windowInsets);
        this.f45580o = null;
        this.f45581p = null;
        this.f45582q = null;
    }

    @Override
    public i0.b h() {
        if (this.f45581p == null) {
            this.f45581p = i0.b.c(this.f45570c.getMandatorySystemGestureInsets());
        }
        return this.f45581p;
    }

    @Override
    public i0.b j() {
        if (this.f45580o == null) {
            this.f45580o = i0.b.c(this.f45570c.getSystemGestureInsets());
        }
        return this.f45580o;
    }

    @Override
    public i0.b l() {
        if (this.f45582q == null) {
            this.f45582q = i0.b.c(this.f45570c.getTappableElementInsets());
        }
        return this.f45582q;
    }

    @Override
    public l1 m(int i10, int i11, int i12, int i13) {
        return l1.h(null, this.f45570c.inset(i10, i11, i12, i13));
    }

    @Override
    public void s(i0.b bVar) {
    }
}
