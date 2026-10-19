package org.telegram.ui.web;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.n2;
public final class d1 extends org.telegram.ui.ActionBar.j {
    public final f1 f42615a;

    public d1(f1 f1Var) {
        this.f42615a = f1Var;
    }

    @Override
    public final void b(int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        if (i10 == -1) {
            f1 f1Var = this.f42615a;
            kVar = ((n2) f1Var).actionBar;
            if (kVar.t()) {
                kVar2 = ((n2) f1Var).actionBar;
                kVar2.s();
                f1Var.f42629s.clear();
                AndroidUtilities.forEachViews((RecyclerView) f1Var.f32027a, (Utilities.Callback<View>) new ci.e(23));
                return;
            }
            f1Var.finishFragment();
        }
    }
}
