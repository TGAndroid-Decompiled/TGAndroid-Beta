package uh;

import android.view.View;
import android.view.WindowInsets;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.l20;
import r0.k1;
import r0.n;
import tg.p;
public final class b implements l20, n {
    public final f f47834a;

    public b(f fVar) {
        this.f47834a = fVar;
    }

    @Override
    public k1 B0(View view, k1 k1Var) {
        boolean z10;
        WindowInsets g10 = k1Var.g();
        f fVar = this.f47834a;
        fVar.processLegacyContainerInsets(g10);
        ne.b bVar = fVar.Y;
        if (k1Var.f44838a.f(8).d > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        bVar.a(z10, true);
        return k1.f44837b;
    }

    @Override
    public void a(int i10) {
        int min = Math.min(i10, AndroidUtilities.dp(144.0f));
        if (i10 > 0) {
            min -= AndroidUtilities.dp(8.0f);
        }
        f fVar = this.f47834a;
        if (fVar.f47854l0 != min) {
            fVar.f47854l0 = min;
            fVar.X.a(min);
            fVar.f47850h0.postOnAnimation(new p(fVar, 9));
        }
    }
}
