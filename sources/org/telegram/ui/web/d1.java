package org.telegram.ui.web;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.n2;
public final class d1 extends org.telegram.ui.ActionBar.j {
    public final f1 f42574a;

    public d1(f1 f1Var) {
        this.f42574a = f1Var;
    }

    @Override
    public final void b(int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        if (i10 == -1) {
            f1 f1Var = this.f42574a;
            kVar = ((n2) f1Var).actionBar;
            if (kVar.s()) {
                kVar2 = ((n2) f1Var).actionBar;
                kVar2.r();
                f1Var.f42588s.clear();
                AndroidUtilities.forEachViews((RecyclerView) f1Var.f31190a, (Utilities.Callback<View>) new ci.e(23));
                return;
            }
            f1Var.finishFragment();
        }
    }
}
