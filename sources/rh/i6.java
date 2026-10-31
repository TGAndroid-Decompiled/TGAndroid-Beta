package rh;

import org.telegram.ui.Components.gu0;
public final class i6 implements fe.e, gu0 {
    public final int f47099a;
    public final h8 f47100b;

    public i6(h8 h8Var, int i10) {
        this.f47099a = i10;
        this.f47100b = h8Var;
    }

    @Override
    public void E(float f7, int i10) {
        int i11 = this.f47099a;
    }

    @Override
    public int c() {
        return this.f47100b.f47013a0;
    }

    @Override
    public void v(int i10, float f7, float f10, fe.f fVar) {
        switch (this.f47099a) {
            case 0:
                this.f47100b.q1();
                return;
            case 1:
                this.f47100b.q1();
                return;
            default:
                this.f47100b.W.setAlpha(f7);
                return;
        }
    }

    private final void a(float f7, int i10) {
    }

    private final void b(float f7, int i10) {
    }

    private final void d(float f7, int i10) {
    }
}
