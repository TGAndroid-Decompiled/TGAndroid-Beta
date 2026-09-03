package ph;

import android.text.TextUtils;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.zw0;
public final class s2 extends z2 {
    public final a3 f42334x;

    public s2(a3 a3Var) {
        super(a3Var);
        this.f42334x = a3Var;
    }

    @Override
    public final void F(boolean z4) {
        a3 a3Var = this.f42334x;
        org.telegram.ui.ActionBar.w0 w0Var = a3Var.D;
        if (w0Var != null) {
            w0Var.setShowSearchProgress(z4);
        }
        a3Var.f41293s.e(z4, true);
    }

    @Override
    public final void l() {
        zw0 zw0Var = this.f42334x.f41293s;
        super.l();
        if (TextUtils.isEmpty(this.f42687f)) {
            zw0Var.setStickerType(11);
            zw0Var.d.setText(LocaleController.getString(R.string.SearchImagesType));
            return;
        }
        zw0Var.setStickerType(1);
        zw0Var.d.setText(LocaleController.formatString(R.string.NoResultFoundFor, this.f42687f));
    }
}
