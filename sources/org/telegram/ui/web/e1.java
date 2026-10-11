package org.telegram.ui.web;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class e1 extends org.telegram.ui.ActionBar.j {
    public final g1 f43517a;

    public e1(g1 g1Var) {
        this.f43517a = g1Var;
    }

    @Override
    public final void b(int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        if (i10 == -1) {
            g1 g1Var = this.f43517a;
            kVar = ((org.telegram.ui.ActionBar.m2) g1Var).actionBar;
            if (kVar.t()) {
                kVar2 = ((org.telegram.ui.ActionBar.m2) g1Var).actionBar;
                kVar2.s();
                g1Var.f43532s.clear();
                AndroidUtilities.forEachViews((RecyclerView) g1Var.f26675a, (Utilities.Callback<View>) new ai.i(23));
                return;
            }
            g1Var.finishFragment();
        }
    }
}
