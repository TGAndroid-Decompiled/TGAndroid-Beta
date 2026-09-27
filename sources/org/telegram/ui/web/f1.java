package org.telegram.ui.web;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class f1 extends org.telegram.ui.ActionBar.j {
    public final h1 f39012a;

    public f1(h1 h1Var) {
        this.f39012a = h1Var;
    }

    @Override
    public final void b(int i10) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        if (i10 == -1) {
            h1 h1Var = this.f39012a;
            lVar = ((org.telegram.ui.ActionBar.o2) h1Var).actionBar;
            if (lVar.t()) {
                lVar2 = ((org.telegram.ui.ActionBar.o2) h1Var).actionBar;
                lVar2.s();
                h1Var.v.clear();
                AndroidUtilities.forEachViews((RecyclerView) h1Var.f27008a, (Utilities.Callback<View>) new ai.i(23));
                return;
            }
            h1Var.finishFragment();
        }
    }
}
