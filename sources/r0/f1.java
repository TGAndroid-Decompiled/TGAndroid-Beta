package r0;

import android.view.WindowInsets;
public class f1 extends e1 {
    public i0.b f42112o;
    public i0.b f42113p;
    public i0.b f42114q;

    public f1(l1 l1Var, WindowInsets windowInsets) {
        super(l1Var, windowInsets);
        this.f42112o = null;
        this.f42113p = null;
        this.f42114q = null;
    }

    @Override
    public i0.b h() {
        if (this.f42113p == null) {
            this.f42113p = i0.b.c(this.f42104c.getMandatorySystemGestureInsets());
        }
        return this.f42113p;
    }

    @Override
    public i0.b j() {
        if (this.f42112o == null) {
            this.f42112o = i0.b.c(this.f42104c.getSystemGestureInsets());
        }
        return this.f42112o;
    }

    @Override
    public i0.b l() {
        if (this.f42114q == null) {
            this.f42114q = i0.b.c(this.f42104c.getTappableElementInsets());
        }
        return this.f42114q;
    }

    @Override
    public l1 m(int i10, int i11, int i12, int i13) {
        return l1.h(null, this.f42104c.inset(i10, i11, i12, i13));
    }

    @Override
    public void s(i0.b bVar) {
    }
}
