package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class vc0 extends tf.i0 {
    public final cd0 K;

    public vc0(cd0 cd0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z4) {
        super(context, f6Var, false, z4);
        this.K = cd0Var;
    }

    @Override
    public final void l() {
        cd0 cd0Var = this.K;
        org.telegram.ui.ActionBar.w0 w0Var = cd0Var.f33111w;
        if (w0Var != null) {
            w0Var.setShowSearchProgress(cd0Var.T.G);
        }
        TextView textView = cd0Var.f33104r;
        if (textView != null) {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoPlacesFoundInfo", R.string.NoPlacesFoundInfo, cd0Var.T.f44736x)));
        }
        super.l();
    }
}
