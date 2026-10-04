package yh;

import org.telegram.ui.Components.wv0;
public final class i6 implements le.d, wv0 {
    public final int f51430a;
    public final x7 f51431b;

    public i6(x7 x7Var, int i10) {
        this.f51430a = i10;
        this.f51431b = x7Var;
    }

    @Override
    public void V(float f7, int i10) {
        int i11 = this.f51430a;
    }

    @Override
    public void a0(int i10, float f7, float f10, le.e eVar) {
        switch (this.f51430a) {
            case 0:
                this.f51431b.u1();
                return;
            case 1:
                this.f51431b.u1();
                return;
            default:
                this.f51431b.U.setAlpha(f7);
                return;
        }
    }

    @Override
    public int b() {
        return this.f51431b.Y;
    }

    private final void a(float f7, int i10) {
    }

    private final void c(float f7, int i10) {
    }

    private final void d(float f7, int i10) {
    }
}
