package org.telegram.ui.web;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class f1 extends org.telegram.ui.ActionBar.j {
    public final h1 f41037a;

    public f1(h1 h1Var) {
        this.f41037a = h1Var;
    }

    @Override
    public final void b(int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        if (i10 == -1) {
            h1 h1Var = this.f41037a;
            kVar = ((org.telegram.ui.ActionBar.m2) h1Var).actionBar;
            if (kVar.t()) {
                kVar2 = ((org.telegram.ui.ActionBar.m2) h1Var).actionBar;
                kVar2.s();
                h1Var.f41063s.clear();
                AndroidUtilities.forEachViews((RecyclerView) h1Var.f24003a, (Utilities.Callback<View>) new bi.f(23));
                return;
            }
            h1Var.finishFragment();
        }
    }
}
