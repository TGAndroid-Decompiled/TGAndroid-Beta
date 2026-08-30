package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class tc0 extends tf.i0 {
    public final ad0 K;

    public tc0(ad0 ad0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z4) {
        super(context, f6Var, false, z4);
        this.K = ad0Var;
    }

    @Override
    public final void l() {
        ad0 ad0Var = this.K;
        org.telegram.ui.ActionBar.w0 w0Var = ad0Var.f32549w;
        if (w0Var != null) {
            w0Var.setShowSearchProgress(ad0Var.T.G);
        }
        TextView textView = ad0Var.f32542r;
        if (textView != null) {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoPlacesFoundInfo", R.string.NoPlacesFoundInfo, ad0Var.T.f44674x)));
        }
        super.l();
    }
}
