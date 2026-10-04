package r0;

import android.view.WindowInsets;
public class f1 extends e1 {
    public i0.b f45579o;
    public i0.b f45580p;
    public i0.b f45581q;

    public f1(l1 l1Var, WindowInsets windowInsets) {
        super(l1Var, windowInsets);
        this.f45579o = null;
        this.f45580p = null;
        this.f45581q = null;
    }

    @Override
    public i0.b h() {
        if (this.f45580p == null) {
            this.f45580p = i0.b.c(this.f45569c.getMandatorySystemGestureInsets());
        }
        return this.f45580p;
    }

    @Override
    public i0.b j() {
        if (this.f45579o == null) {
            this.f45579o = i0.b.c(this.f45569c.getSystemGestureInsets());
        }
        return this.f45579o;
    }

    @Override
    public i0.b l() {
        if (this.f45581q == null) {
            this.f45581q = i0.b.c(this.f45569c.getTappableElementInsets());
        }
        return this.f45581q;
    }

    @Override
    public l1 m(int i10, int i11, int i12, int i13) {
        return l1.h(null, this.f45569c.inset(i10, i11, i12, i13));
    }

    @Override
    public void s(i0.b bVar) {
    }
}
