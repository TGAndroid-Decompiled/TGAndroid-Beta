package uh;

import android.view.View;
import android.view.WindowInsets;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.c20;
import r0.l1;
import r0.n;
import sg.p0;
public final class b implements c20, n {
    public final f f47266a;

    public b(f fVar) {
        this.f47266a = fVar;
    }

    @Override
    public l1 T0(View view, l1 l1Var) {
        boolean z10;
        WindowInsets g10 = l1Var.g();
        f fVar = this.f47266a;
        fVar.processLegacyContainerInsets(g10);
        le.b bVar = fVar.Y;
        if (l1Var.f44739a.f(8).d > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        bVar.a(z10, true);
        return l1.f44738b;
    }

    @Override
    public void a(int i10) {
        int min = Math.min(i10, AndroidUtilities.dp(144.0f));
        if (i10 > 0) {
            min -= AndroidUtilities.dp(8.0f);
        }
        f fVar = this.f47266a;
        if (fVar.f47286l0 != min) {
            fVar.f47286l0 = min;
            fVar.X.a(min);
            fVar.f47282h0.postOnAnimation(new p0(fVar, 12));
        }
    }
}
