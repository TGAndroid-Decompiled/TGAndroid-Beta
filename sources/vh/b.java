package vh;

import android.view.View;
import android.view.WindowInsets;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.t00;
import r0.k1;
import r0.m;
import sg.t0;
public final class b implements t00, m {
    public final g f57501a;

    public b(g gVar) {
        this.f57501a = gVar;
    }

    @Override
    public k1 S0(View view, k1 k1Var) {
        boolean z9;
        WindowInsets g10 = k1Var.g();
        g gVar = this.f57501a;
        gVar.t0(g10);
        te.a aVar = gVar.Q1;
        if (k1Var.f54201a.f(8).d > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        aVar.a(z9, true);
        return k1.f54200b;
    }

    @Override
    public void a(int i7) {
        int min = Math.min(i7, g0.L(144.0f));
        if (i7 > 0) {
            min -= g0.L(8.0f);
        }
        g gVar = this.f57501a;
        if (gVar.d2 != min) {
            gVar.d2 = min;
            gVar.P1.a(min);
            gVar.Z1.postOnAnimation(new t0(gVar, 27));
        }
    }
}
