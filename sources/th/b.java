package th;

import android.view.View;
import android.view.WindowInsets;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.u20;
import r0.k1;
import r0.n;
import rg.x1;
public final class b implements u20, n {
    public final f f48547a;

    public b(f fVar) {
        this.f48547a = fVar;
    }

    @Override
    public k1 M0(View view, k1 k1Var) {
        boolean z10;
        WindowInsets g10 = k1Var.g();
        f fVar = this.f48547a;
        fVar.processLegacyContainerInsets(g10);
        me.b bVar = fVar.Y;
        if (k1Var.f46867a.f(8).d > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        bVar.a(z10, true);
        return k1.f46866b;
    }

    @Override
    public void a(int i10) {
        int min = Math.min(i10, AndroidUtilities.dp(144.0f));
        if (i10 > 0) {
            min -= AndroidUtilities.dp(8.0f);
        }
        f fVar = this.f48547a;
        if (fVar.f48567l0 != min) {
            fVar.f48567l0 = min;
            fVar.X.a(min);
            fVar.f48563h0.postOnAnimation(new x1(fVar, 13));
        }
    }
}
