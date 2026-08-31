package qh;

import android.text.TextUtils;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ax0;
public final class s2 extends z2 {
    public final a3 f46035x;

    public s2(a3 a3Var) {
        super(a3Var);
        this.f46035x = a3Var;
    }

    @Override
    public final void F(boolean z4) {
        a3 a3Var = this.f46035x;
        org.telegram.ui.ActionBar.w0 w0Var = a3Var.D;
        if (w0Var != null) {
            w0Var.setShowSearchProgress(z4);
        }
        a3Var.f44904s.e(z4, true);
    }

    @Override
    public final void l() {
        ax0 ax0Var = this.f46035x.f44904s;
        super.l();
        if (TextUtils.isEmpty(this.f46375f)) {
            ax0Var.setStickerType(11);
            ax0Var.d.setText(LocaleController.getString(R.string.SearchImagesType));
            return;
        }
        ax0Var.setStickerType(1);
        ax0Var.d.setText(LocaleController.formatString(R.string.NoResultFoundFor, this.f46375f));
    }
}
