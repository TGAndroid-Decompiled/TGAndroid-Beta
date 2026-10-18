package r0;

import android.view.WindowInsets;
public class e1 extends d1 {
    public i0.b f44847o;
    public i0.b f44848p;
    public i0.b f44849q;

    public e1(k1 k1Var, WindowInsets windowInsets) {
        super(k1Var, windowInsets);
        this.f44847o = null;
        this.f44848p = null;
        this.f44849q = null;
    }

    @Override
    public i0.b h() {
        if (this.f44848p == null) {
            this.f44848p = i0.b.c(this.f44839c.getMandatorySystemGestureInsets());
        }
        return this.f44848p;
    }

    @Override
    public i0.b j() {
        if (this.f44847o == null) {
            this.f44847o = i0.b.c(this.f44839c.getSystemGestureInsets());
        }
        return this.f44847o;
    }

    @Override
    public i0.b l() {
        if (this.f44849q == null) {
            this.f44849q = i0.b.c(this.f44839c.getTappableElementInsets());
        }
        return this.f44849q;
    }

    @Override
    public k1 m(int i10, int i11, int i12, int i13) {
        return k1.h(null, this.f44839c.inset(i10, i11, i12, i13));
    }

    @Override
    public void s(i0.b bVar) {
    }
}
