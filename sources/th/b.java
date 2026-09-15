package th;

import android.view.View;
import android.view.WindowInsets;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.c20;
import r0.l1;
import r0.n;
import rg.w1;
public final class b implements c20, n {
    public final f f43250a;

    public b(f fVar) {
        this.f43250a = fVar;
    }

    @Override
    public l1 Q0(View view, l1 l1Var) {
        boolean z10;
        WindowInsets g10 = l1Var.g();
        f fVar = this.f43250a;
        fVar.processLegacyContainerInsets(g10);
        le.b bVar = fVar.Y;
        if (l1Var.f41855a.f(8).d > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        bVar.a(z10, true);
        return l1.f41854b;
    }

    @Override
    public void a(int i10) {
        int min = Math.min(i10, AndroidUtilities.dp(144.0f));
        if (i10 > 0) {
            min -= AndroidUtilities.dp(8.0f);
        }
        f fVar = this.f43250a;
        if (fVar.f43270l0 != min) {
            fVar.f43270l0 = min;
            fVar.X.a(min);
            fVar.f43266h0.postOnAnimation(new w1(fVar, 9));
        }
    }
}
