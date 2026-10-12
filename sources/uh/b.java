package uh;

import android.view.View;
import android.view.WindowInsets;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.p20;
import r0.l1;
import r0.o;
import rh.j;
public final class b implements p20, o {
    public final f f46437a;

    public b(f fVar) {
        this.f46437a = fVar;
    }

    @Override
    public l1 Q0(View view, l1 l1Var) {
        boolean z10;
        WindowInsets g10 = l1Var.g();
        f fVar = this.f46437a;
        fVar.processLegacyContainerInsets(g10);
        ne.b bVar = fVar.Y;
        if (l1Var.f43741a.f(8).d > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        bVar.a(z10, true);
        return l1.f43740b;
    }

    @Override
    public void a(int i10) {
        int min = Math.min(i10, AndroidUtilities.dp(144.0f));
        if (i10 > 0) {
            min -= AndroidUtilities.dp(8.0f);
        }
        f fVar = this.f46437a;
        if (fVar.f46457l0 != min) {
            fVar.f46457l0 = min;
            fVar.X.a(min);
            fVar.f46453h0.postOnAnimation(new j(fVar, 19));
        }
    }
}
