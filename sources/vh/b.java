package vh;

import android.view.View;
import android.view.WindowInsets;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.w00;
import r0.k1;
import r0.m;
import vg.o;
public final class b implements w00, m {
    public final h f58986a;

    public b(h hVar) {
        this.f58986a = hVar;
    }

    @Override
    public k1 M0(View view, k1 k1Var) {
        boolean z10;
        WindowInsets g10 = k1Var.g();
        h hVar = this.f58986a;
        hVar.t0(g10);
        te.a aVar = hVar.U1;
        if (k1Var.f55682a.f(8).d > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        aVar.a(z10, true);
        return k1.f55681b;
    }

    @Override
    public void a(int i7) {
        int min = Math.min(i7, g0.L(144.0f));
        if (i7 > 0) {
            min -= g0.L(8.0f);
        }
        h hVar = this.f58986a;
        if (hVar.f59005h2 != min) {
            hVar.f59005h2 = min;
            hVar.T1.a(min);
            hVar.d2.postOnAnimation(new o(hVar, 1));
        }
    }
}
