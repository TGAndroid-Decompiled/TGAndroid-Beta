package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class yc0 extends gg.u0 {
    public final fd0 N;

    public yc0(fd0 fd0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context, e6Var, false, z10);
        this.N = fd0Var;
    }

    @Override
    public final void l() {
        fd0 fd0Var = this.N;
        org.telegram.ui.ActionBar.w0 w0Var = fd0Var.f33514w;
        if (w0Var != null) {
            w0Var.setShowSearchProgress(fd0Var.W.J);
        }
        TextView textView = fd0Var.f33507r;
        if (textView != null) {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoPlacesFoundInfo", R.string.NoPlacesFoundInfo, fd0Var.W.f9671x)));
        }
        super.l();
    }
}
