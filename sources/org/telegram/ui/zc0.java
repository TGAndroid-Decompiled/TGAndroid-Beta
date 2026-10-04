package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class zc0 extends gg.u0 {
    public final gd0 N;

    public zc0(gd0 gd0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(context, d6Var, false, z10);
        this.N = gd0Var;
    }

    @Override
    public final void l() {
        gd0 gd0Var = this.N;
        org.telegram.ui.ActionBar.v0 v0Var = gd0Var.f36596w;
        if (v0Var != null) {
            v0Var.setShowSearchProgress(gd0Var.W.J);
        }
        TextView textView = gd0Var.f36589r;
        if (textView != null) {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoPlacesFoundInfo", R.string.NoPlacesFoundInfo, gd0Var.W.f10525x)));
        }
        super.l();
    }
}
