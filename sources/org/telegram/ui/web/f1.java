package org.telegram.ui.web;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class f1 extends org.telegram.ui.ActionBar.j {
    public final h1 f42183a;

    public f1(h1 h1Var) {
        this.f42183a = h1Var;
    }

    @Override
    public final void b(int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        if (i10 == -1) {
            h1 h1Var = this.f42183a;
            kVar = ((org.telegram.ui.ActionBar.n2) h1Var).actionBar;
            if (kVar.s()) {
                kVar2 = ((org.telegram.ui.ActionBar.n2) h1Var).actionBar;
                kVar2.r();
                h1Var.v.clear();
                AndroidUtilities.forEachViews((RecyclerView) h1Var.f32725a, (Utilities.Callback<View>) new ai.i(23));
                return;
            }
            h1Var.finishFragment();
        }
    }
}
