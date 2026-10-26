package org.telegram.ui.web;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.r2;
public final class d1 extends org.telegram.ui.ActionBar.j {
    public final f1 f45217a;

    public d1(f1 f1Var) {
        this.f45217a = f1Var;
    }

    @Override
    public final void b(int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        if (i10 == -1) {
            f1 f1Var = this.f45217a;
            kVar = ((r2) f1Var).actionBar;
            if (kVar.q()) {
                kVar2 = ((r2) f1Var).actionBar;
                kVar2.p();
                f1Var.v.clear();
                AndroidUtilities.forEachViews((RecyclerView) f1Var.f30419a, (Utilities.Callback<View>) new di.e(23));
                return;
            }
            f1Var.finishFragment();
        }
    }
}
