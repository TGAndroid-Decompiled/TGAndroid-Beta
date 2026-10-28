package vh;

import android.view.View;
import android.view.WindowInsets;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.n20;
import r0.k1;
import r0.n;
public final class b implements n20, n {
    public final f f50339a;

    public b(f fVar) {
        this.f50339a = fVar;
    }

    @Override
    public k1 P0(View view, k1 k1Var) {
        boolean z10;
        WindowInsets g7 = k1Var.g();
        f fVar = this.f50339a;
        fVar.processLegacyContainerInsets(g7);
        oe.b bVar = fVar.Y;
        if (k1Var.f47153a.f(8).d > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        bVar.a(z10, true);
        return k1.f47152b;
    }

    @Override
    public void a(int i10) {
        int min = Math.min(i10, AndroidUtilities.dp(144.0f));
        if (i10 > 0) {
            min -= AndroidUtilities.dp(8.0f);
        }
        f fVar = this.f50339a;
        if (fVar.f50359l0 != min) {
            fVar.f50359l0 = min;
            fVar.X.a(min);
            fVar.f50355h0.postOnAnimation(new ti.g(fVar, 12));
        }
    }
}
