package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class uc0 extends uf.i0 {
    public final bd0 K;

    public uc0(bd0 bd0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z4) {
        super(context, g6Var, false, z4);
        this.K = bd0Var;
    }

    @Override
    public final void l() {
        bd0 bd0Var = this.K;
        org.telegram.ui.ActionBar.w0 w0Var = bd0Var.f35497w;
        if (w0Var != null) {
            w0Var.setShowSearchProgress(bd0Var.T.G);
        }
        TextView textView = bd0Var.f35490r;
        if (textView != null) {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoPlacesFoundInfo", R.string.NoPlacesFoundInfo, bd0Var.T.f48550x)));
        }
        super.l();
    }
}
