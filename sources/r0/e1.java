package r0;

import android.view.WindowInsets;
public class e1 extends d1 {
    public i0.b f47126o;
    public i0.b f47127p;
    public i0.b f47128q;

    public e1(k1 k1Var, WindowInsets windowInsets) {
        super(k1Var, windowInsets);
        this.f47126o = null;
        this.f47127p = null;
        this.f47128q = null;
    }

    @Override
    public i0.b h() {
        if (this.f47127p == null) {
            this.f47127p = i0.b.c(this.f47118c.getMandatorySystemGestureInsets());
        }
        return this.f47127p;
    }

    @Override
    public i0.b j() {
        if (this.f47126o == null) {
            this.f47126o = i0.b.c(this.f47118c.getSystemGestureInsets());
        }
        return this.f47126o;
    }

    @Override
    public i0.b l() {
        if (this.f47128q == null) {
            this.f47128q = i0.b.c(this.f47118c.getTappableElementInsets());
        }
        return this.f47128q;
    }

    @Override
    public k1 m(int i10, int i11, int i12, int i13) {
        return k1.h(null, this.f47118c.inset(i10, i11, i12, i13));
    }

    @Override
    public void s(i0.b bVar) {
    }
}
