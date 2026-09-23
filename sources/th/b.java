package th;

import android.view.View;
import android.view.WindowInsets;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.d20;
import r0.l1;
import r0.n;
import rg.w1;
public final class b implements d20, n {
    public final f f43201a;

    public b(f fVar) {
        this.f43201a = fVar;
    }

    @Override
    public l1 Q0(View view, l1 l1Var) {
        boolean z10;
        WindowInsets g10 = l1Var.g();
        f fVar = this.f43201a;
        fVar.processLegacyContainerInsets(g10);
        le.c cVar = fVar.Y;
        if (l1Var.f41807a.f(8).d > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        cVar.a(z10, true);
        return l1.f41806b;
    }

    @Override
    public void a(int i10) {
        int min = Math.min(i10, AndroidUtilities.dp(144.0f));
        if (i10 > 0) {
            min -= AndroidUtilities.dp(8.0f);
        }
        f fVar = this.f43201a;
        if (fVar.f43221l0 != min) {
            fVar.f43221l0 = min;
            fVar.X.a(min);
            fVar.f43217h0.postOnAnimation(new w1(fVar, 9));
        }
    }
}
