package th;

import android.view.View;
import android.view.WindowInsets;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.c20;
import r0.m1;
import r0.n;
import rg.w1;
public final class b implements c20, n {
    public final f f43505a;

    public b(f fVar) {
        this.f43505a = fVar;
    }

    @Override
    public m1 Q0(View view, m1 m1Var) {
        boolean z10;
        WindowInsets g10 = m1Var.g();
        f fVar = this.f43505a;
        fVar.processLegacyContainerInsets(g10);
        le.b bVar = fVar.Y;
        if (m1Var.f42109a.f(8).d > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        bVar.a(z10, true);
        return m1.f42108b;
    }

    @Override
    public void a(int i10) {
        int min = Math.min(i10, AndroidUtilities.dp(144.0f));
        if (i10 > 0) {
            min -= AndroidUtilities.dp(8.0f);
        }
        f fVar = this.f43505a;
        if (fVar.f43525l0 != min) {
            fVar.f43525l0 = min;
            fVar.X.a(min);
            fVar.f43521h0.postOnAnimation(new w1(fVar, 9));
        }
    }
}
