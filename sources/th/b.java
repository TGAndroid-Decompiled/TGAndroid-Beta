package th;

import android.view.View;
import android.view.WindowInsets;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.g20;
import r0.l1;
import r0.n;
import rg.s1;
public final class b implements g20, n {
    public final f f47158a;

    public b(f fVar) {
        this.f47158a = fVar;
    }

    @Override
    public l1 Q0(View view, l1 l1Var) {
        boolean z10;
        WindowInsets g10 = l1Var.g();
        f fVar = this.f47158a;
        fVar.processLegacyContainerInsets(g10);
        le.b bVar = fVar.Y;
        if (l1Var.f45624a.f(8).d > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        bVar.a(z10, true);
        return l1.f45623b;
    }

    @Override
    public void a(int i10) {
        int min = Math.min(i10, AndroidUtilities.dp(144.0f));
        if (i10 > 0) {
            min -= AndroidUtilities.dp(8.0f);
        }
        f fVar = this.f47158a;
        if (fVar.f47178l0 != min) {
            fVar.f47178l0 = min;
            fVar.X.a(min);
            fVar.f47174h0.postOnAnimation(new s1(fVar, 10));
        }
    }
}
