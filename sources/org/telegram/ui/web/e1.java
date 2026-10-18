package org.telegram.ui.web;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class e1 extends org.telegram.ui.ActionBar.j {
    public final g1 f42580a;

    public e1(g1 g1Var) {
        this.f42580a = g1Var;
    }

    @Override
    public final void b(int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        if (i10 == -1) {
            g1 g1Var = this.f42580a;
            kVar = ((org.telegram.ui.ActionBar.n2) g1Var).actionBar;
            if (kVar.s()) {
                kVar2 = ((org.telegram.ui.ActionBar.n2) g1Var).actionBar;
                kVar2.r();
                g1Var.f42594s.clear();
                AndroidUtilities.forEachViews((RecyclerView) g1Var.f31190a, (Utilities.Callback<View>) new ci.e(23));
                return;
            }
            g1Var.finishFragment();
        }
    }
}
