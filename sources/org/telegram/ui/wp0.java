package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MediaController;

public final class wp0 implements org.telegram.ui.Components.al0 {

    public final aq0 f44163a;

    public wp0(aq0 aq0Var) {
        this.f44163a = aq0Var;
    }

    @Override
    public final void a(boolean z10) {
        aq0 aq0Var = this.f44163a;
        aq0Var.S = z10 ? 1 : 0;
        if (z10) {
            ((org.telegram.ui.ActionBar.n2) aq0Var).parentLayout.getView().requestDisallowInterceptTouchEvent(true);
        }
        aq0Var.G.d1(true);
    }

    @Override
    public final boolean b(int i10) {
        return this.f44163a.H.j(i10) == 0;
    }

    @Override
    public final void c(View view, boolean z10) {
        if (z10 == this.f44163a.T && (view instanceof org.telegram.ui.Cells.q5)) {
            org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) view;
            q5Var.f25061w.d(q5Var);
        }
    }

    @Override
    public final boolean d(int i10) {
        aq0 aq0Var = this.f44163a;
        MediaController.AlbumEntry albumEntry = aq0Var.F;
        return aq0Var.f36598b.containsKey(albumEntry != null ? Integer.valueOf(albumEntry.photos.get(i10).imageId) : ((MediaController.SearchImage) aq0Var.f36605f.get(i10)).f19616id);
    }
}
