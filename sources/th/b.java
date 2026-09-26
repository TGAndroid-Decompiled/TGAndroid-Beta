package th;

import android.view.View;
import android.view.WindowInsets;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.d20;
import r0.l1;
import r0.n;
import rg.q1;
public final class b implements d20, n {
    public final f f43534a;

    public b(f fVar) {
        this.f43534a = fVar;
    }

    @Override
    public l1 Q0(View view, l1 l1Var) {
        boolean z10;
        WindowInsets g10 = l1Var.g();
        f fVar = this.f43534a;
        fVar.processLegacyContainerInsets(g10);
        le.c cVar = fVar.Y;
        if (l1Var.f42140a.f(8).d > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        cVar.a(z10, true);
        return l1.f42139b;
    }

    @Override
    public void a(int i10) {
        int min = Math.min(i10, AndroidUtilities.dp(144.0f));
        if (i10 > 0) {
            min -= AndroidUtilities.dp(8.0f);
        }
        f fVar = this.f43534a;
        if (fVar.f43554l0 != min) {
            fVar.f43554l0 = min;
            fVar.X.a(min);
            fVar.f43550h0.postOnAnimation(new q1(fVar, 10));
        }
    }
}
