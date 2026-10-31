package rh;

import android.os.Build;
public final class k0 implements ei.n, ei.o {
    public final t0 f47144a;

    @Override
    public int c() {
        return this.f47144a.d1();
    }

    @Override
    public void j(int i10) {
        t0 t0Var = this.f47144a;
        tg.f fVar = t0Var.f47479j2;
        if (Build.VERSION.SDK_INT >= 31 && fVar != null) {
            if (v7.u7.a(i10, 4)) {
                fVar.h(t0Var.X0.e());
            }
            fVar.e(t0Var.f47484o2, t0Var.f21586b.getWidth(), t0Var.f21586b.getHeight());
        }
    }
}
