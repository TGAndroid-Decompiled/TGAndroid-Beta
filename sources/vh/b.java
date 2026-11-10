package vh;

import android.view.View;
import android.view.WindowInsets;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.s00;
import r0.k1;
import r0.m;
public final class b implements s00, m {
    public final g f57510a;

    public b(g gVar) {
        this.f57510a = gVar;
    }

    @Override
    public k1 S0(View view, k1 k1Var) {
        boolean z9;
        WindowInsets g10 = k1Var.g();
        g gVar = this.f57510a;
        gVar.t0(g10);
        te.a aVar = gVar.T1;
        if (k1Var.f54213a.f(8).d > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        aVar.a(z9, true);
        return k1.f54212b;
    }

    @Override
    public void a(int i7) {
        int min = Math.min(i7, g0.L(144.0f));
        if (i7 > 0) {
            min -= g0.L(8.0f);
        }
        g gVar = this.f57510a;
        if (gVar.f57526g2 != min) {
            gVar.f57526g2 = min;
            gVar.S1.a(min);
            gVar.f57523c2.postOnAnimation(new sh.b(gVar, 25));
        }
    }
}
