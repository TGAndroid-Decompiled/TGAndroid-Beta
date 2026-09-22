package th;

import android.view.View;
import android.view.WindowInsets;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.c20;
import r0.l1;
import r0.n;
import rg.q1;
public final class b implements c20, n {
    public final f f43570a;

    public b(f fVar) {
        this.f43570a = fVar;
    }

    @Override
    public l1 P0(View view, l1 l1Var) {
        boolean z10;
        WindowInsets g10 = l1Var.g();
        f fVar = this.f43570a;
        fVar.processLegacyContainerInsets(g10);
        le.b bVar = fVar.Y;
        if (l1Var.f42175a.f(8).d > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        bVar.a(z10, true);
        return l1.f42174b;
    }

    @Override
    public void a(int i10) {
        int min = Math.min(i10, AndroidUtilities.dp(144.0f));
        if (i10 > 0) {
            min -= AndroidUtilities.dp(8.0f);
        }
        f fVar = this.f43570a;
        if (fVar.f43590l0 != min) {
            fVar.f43590l0 = min;
            fVar.X.a(min);
            fVar.f43586h0.postOnAnimation(new q1(fVar, 10));
        }
    }
}
