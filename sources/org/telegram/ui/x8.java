package org.telegram.ui;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class x8 extends s4.s0 {
    public boolean f38603a;
    public final k9 f38604b;

    public x8(k9 k9Var) {
        this.f38604b = k9Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int abs;
        int i12;
        zg.e eVar;
        boolean z10;
        k9 k9Var = this.f38604b;
        ArrayList arrayList = k9Var.G;
        int L0 = k9Var.f34275c.L0();
        boolean z11 = false;
        if (L0 == -1) {
            abs = 0;
        } else {
            abs = Math.abs(k9Var.f34275c.N0() - L0) + 1;
        }
        if (abs > 0) {
            int size = k9Var.d.Y2.f24253x.size();
            if (!k9Var.J && !k9Var.H && !arrayList.isEmpty() && abs + L0 >= size - 5) {
                AndroidUtilities.runOnUIThread(new n(8, this, (g9) hc.b.i(1, arrayList)));
            }
        }
        View childAt = recyclerView.getChildAt(0);
        if (childAt != null) {
            i12 = childAt.getTop();
        } else {
            i12 = 0;
        }
        if (i11 != 0 && this.f38603a) {
            org.telegram.ui.Components.h20 h20Var = k9Var.f34279f;
            if (i11 < 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            h20Var.e(z10, true);
        }
        this.f38603a = true;
        k9Var.f34282r.b((L0 != 0 || i12 < k9Var.d.getPaddingTop()) ? true : true, true);
        if (Build.VERSION.SDK_INT >= 31 && (eVar = k9Var.Y) != null) {
            eVar.f(i10, i11);
            k9Var.f0();
        }
    }
}
