package org.telegram.ui.web;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.o2;
public final class e1 extends org.telegram.ui.ActionBar.j {
    public final g1 f43090a;

    public e1(g1 g1Var) {
        this.f43090a = g1Var;
    }

    @Override
    public final void b(int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        if (i10 == -1) {
            g1 g1Var = this.f43090a;
            kVar = ((o2) g1Var).actionBar;
            if (kVar.s()) {
                kVar2 = ((o2) g1Var).actionBar;
                kVar2.r();
                g1Var.f43108s.clear();
                AndroidUtilities.forEachViews((RecyclerView) g1Var.f25615a, (Utilities.Callback<View>) new ci.e(23));
                return;
            }
            g1Var.finishFragment();
        }
    }
}
