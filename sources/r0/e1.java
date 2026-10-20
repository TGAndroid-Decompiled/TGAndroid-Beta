package r0;

import android.view.WindowInsets;
public class e1 extends d1 {
    public i0.b f44809o;
    public i0.b f44810p;
    public i0.b f44811q;

    public e1(k1 k1Var, WindowInsets windowInsets) {
        super(k1Var, windowInsets);
        this.f44809o = null;
        this.f44810p = null;
        this.f44811q = null;
    }

    @Override
    public i0.b h() {
        if (this.f44810p == null) {
            this.f44810p = i0.b.c(this.f44801c.getMandatorySystemGestureInsets());
        }
        return this.f44810p;
    }

    @Override
    public i0.b j() {
        if (this.f44809o == null) {
            this.f44809o = i0.b.c(this.f44801c.getSystemGestureInsets());
        }
        return this.f44809o;
    }

    @Override
    public i0.b l() {
        if (this.f44811q == null) {
            this.f44811q = i0.b.c(this.f44801c.getTappableElementInsets());
        }
        return this.f44811q;
    }

    @Override
    public k1 m(int i10, int i11, int i12, int i13) {
        return k1.h(null, this.f44801c.inset(i10, i11, i12, i13));
    }

    @Override
    public void s(i0.b bVar) {
    }
}
