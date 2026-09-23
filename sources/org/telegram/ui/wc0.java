package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class wc0 extends gg.u0 {
    public final dd0 N;

    public wc0(dd0 dd0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(context, d6Var, false, z10);
        this.N = dd0Var;
    }

    @Override
    public final void l() {
        dd0 dd0Var = this.N;
        org.telegram.ui.ActionBar.v0 v0Var = dd0Var.f32608w;
        if (v0Var != null) {
            v0Var.setShowSearchProgress(dd0Var.W.J);
        }
        TextView textView = dd0Var.f32601r;
        if (textView != null) {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoPlacesFoundInfo", R.string.NoPlacesFoundInfo, dd0Var.W.f9666x)));
        }
        super.l();
    }
}
