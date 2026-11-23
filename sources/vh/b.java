package vh;

import android.view.View;
import android.view.WindowInsets;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.d10;
import r0.l1;
import r0.m;
import ug.u1;
public final class b implements d10, m {
    public final g f59681a;

    public b(g gVar) {
        this.f59681a = gVar;
    }

    @Override
    public void a(int i7) {
        int min = Math.min(i7, g0.L(144.0f));
        if (i7 > 0) {
            min -= g0.L(8.0f);
        }
        g gVar = this.f59681a;
        if (gVar.f59698h2 != min) {
            gVar.f59698h2 = min;
            gVar.T1.a(min);
            gVar.d2.postOnAnimation(new u1(gVar, 5));
        }
    }

    @Override
    public l1 l1(View view, l1 l1Var) {
        boolean z10;
        WindowInsets g10 = l1Var.g();
        g gVar = this.f59681a;
        gVar.t0(g10);
        te.a aVar = gVar.U1;
        if (l1Var.f56381a.f(8).d > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        aVar.a(z10, true);
        return l1.f56380b;
    }
}
