package r0;

import android.view.WindowInsets;
public class e1 extends d1 {
    public i0.b f44812o;
    public i0.b f44813p;
    public i0.b f44814q;

    public e1(k1 k1Var, WindowInsets windowInsets) {
        super(k1Var, windowInsets);
        this.f44812o = null;
        this.f44813p = null;
        this.f44814q = null;
    }

    @Override
    public i0.b h() {
        if (this.f44813p == null) {
            this.f44813p = i0.b.c(this.f44804c.getMandatorySystemGestureInsets());
        }
        return this.f44813p;
    }

    @Override
    public i0.b j() {
        if (this.f44812o == null) {
            this.f44812o = i0.b.c(this.f44804c.getSystemGestureInsets());
        }
        return this.f44812o;
    }

    @Override
    public i0.b l() {
        if (this.f44814q == null) {
            this.f44814q = i0.b.c(this.f44804c.getTappableElementInsets());
        }
        return this.f44814q;
    }

    @Override
    public k1 m(int i10, int i11, int i12, int i13) {
        return k1.h(null, this.f44804c.inset(i10, i11, i12, i13));
    }

    @Override
    public void s(i0.b bVar) {
    }
}
