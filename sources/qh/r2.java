package qh;

import android.text.TextUtils;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.zw0;
public final class r2 extends y2 {
    public final z2 f45986x;

    public r2(z2 z2Var) {
        super(z2Var);
        this.f45986x = z2Var;
    }

    @Override
    public final void F(boolean z4) {
        z2 z2Var = this.f45986x;
        org.telegram.ui.ActionBar.w0 w0Var = z2Var.D;
        if (w0Var != null) {
            w0Var.setShowSearchProgress(z4);
        }
        z2Var.f46399s.e(z4, true);
    }

    @Override
    public final void l() {
        zw0 zw0Var = this.f45986x.f46399s;
        super.l();
        if (TextUtils.isEmpty(this.f46357f)) {
            zw0Var.setStickerType(11);
            zw0Var.d.setText(LocaleController.getString(R.string.SearchImagesType));
            return;
        }
        zw0Var.setStickerType(1);
        zw0Var.d.setText(LocaleController.formatString(R.string.NoResultFoundFor, this.f46357f));
    }
}
