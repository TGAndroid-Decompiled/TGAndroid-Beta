package vh;

import android.os.Build;
public final class d5 implements ei.o, ei.n {
    public final f5 f51093a;

    public d5(f5 f5Var) {
        this.f51093a = f5Var;
    }

    @Override
    public int c() {
        f5 f5Var = this.f51093a;
        f5Var.getClass();
        return org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20930d6, f5Var.I0);
    }

    @Override
    public void j(int i10) {
        f5 f5Var = this.f51093a;
        tg.f fVar = f5Var.f51155d2;
        if (Build.VERSION.SDK_INT >= 31 && fVar != null) {
            if (v7.u7.a(i10, 4)) {
                fVar.h(f5Var.X0.e());
            }
            fVar.e(f5Var.f51158g2, f5Var.f21587b.getWidth(), f5Var.f21587b.getHeight());
        }
    }
}
