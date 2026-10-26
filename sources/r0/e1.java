package r0;

import android.view.WindowInsets;
public class e1 extends d1 {
    public i0.b f47091o;
    public i0.b f47092p;
    public i0.b f47093q;

    public e1(k1 k1Var, WindowInsets windowInsets) {
        super(k1Var, windowInsets);
        this.f47091o = null;
        this.f47092p = null;
        this.f47093q = null;
    }

    @Override
    public i0.b h() {
        if (this.f47092p == null) {
            this.f47092p = i0.b.c(this.f47083c.getMandatorySystemGestureInsets());
        }
        return this.f47092p;
    }

    @Override
    public i0.b j() {
        if (this.f47091o == null) {
            this.f47091o = i0.b.c(this.f47083c.getSystemGestureInsets());
        }
        return this.f47091o;
    }

    @Override
    public i0.b l() {
        if (this.f47093q == null) {
            this.f47093q = i0.b.c(this.f47083c.getTappableElementInsets());
        }
        return this.f47093q;
    }

    @Override
    public k1 m(int i10, int i11, int i12, int i13) {
        return k1.h(null, this.f47083c.inset(i10, i11, i12, i13));
    }

    @Override
    public void s(i0.b bVar) {
    }
}
