package wh;

import android.view.View;
import android.view.WindowInsets;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.o00;
import r0.k1;
import r0.m;
import r4.u;
public final class b implements o00, m {
    public final h f57757a;

    public b(h hVar) {
        this.f57757a = hVar;
    }

    @Override
    public k1 R0(View view, k1 k1Var) {
        boolean z10;
        WindowInsets g7 = k1Var.g();
        h hVar = this.f57757a;
        hVar.t0(g7);
        qe.a aVar = hVar.R1;
        if (k1Var.f54026a.f(8).d > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        aVar.a(z10, true);
        return k1.f54025b;
    }

    @Override
    public void a(int i3) {
        int min = Math.min(i3, g0.L(144.0f));
        if (i3 > 0) {
            min -= g0.L(8.0f);
        }
        h hVar = this.f57757a;
        if (hVar.f57773e2 != min) {
            hVar.f57773e2 = min;
            hVar.Q1.a(min);
            hVar.f57770a2.postOnAnimation(new u(hVar, 28));
        }
    }
}
