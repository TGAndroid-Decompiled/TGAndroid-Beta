package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class vc0 extends gg.u0 {
    public final cd0 N;

    public vc0(cd0 cd0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(context, d6Var, false, z10);
        this.N = cd0Var;
    }

    @Override
    public final void l() {
        cd0 cd0Var = this.N;
        org.telegram.ui.ActionBar.u0 u0Var = cd0Var.f32682w;
        if (u0Var != null) {
            u0Var.setShowSearchProgress(cd0Var.W.J);
        }
        TextView textView = cd0Var.f32675r;
        if (textView != null) {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoPlacesFoundInfo", R.string.NoPlacesFoundInfo, cd0Var.W.f9665x)));
        }
        super.l();
    }
}
