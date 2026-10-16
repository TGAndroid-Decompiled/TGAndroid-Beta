package uh;

import android.view.View;
import android.view.WindowInsets;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.p20;
import r0.l1;
import r0.n;
import ri.h0;
public final class b implements p20, n {
    public final f f46436a;

    public b(f fVar) {
        this.f46436a = fVar;
    }

    @Override
    public l1 Q0(View view, l1 l1Var) {
        boolean z10;
        WindowInsets g10 = l1Var.g();
        f fVar = this.f46436a;
        fVar.processLegacyContainerInsets(g10);
        ne.b bVar = fVar.Y;
        if (l1Var.f43497a.f(8).d > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        bVar.a(z10, true);
        return l1.f43496b;
    }

    @Override
    public void a(int i10) {
        int min = Math.min(i10, AndroidUtilities.dp(144.0f));
        if (i10 > 0) {
            min -= AndroidUtilities.dp(8.0f);
        }
        f fVar = this.f46436a;
        if (fVar.f46456l0 != min) {
            fVar.f46456l0 = min;
            fVar.X.a(min);
            fVar.f46452h0.postOnAnimation(new h0(fVar, 19));
        }
    }
}
