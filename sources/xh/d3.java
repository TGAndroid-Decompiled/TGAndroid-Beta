package xh;

import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.u00;
import org.telegram.ui.Components.yc;
import org.telegram.ui.yn;
public final class d3 extends yn {
    public boolean Kc;
    public final TL_stars.TL_starGiftUnique Lc;
    public final long Mc;

    public d3(Bundle bundle, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3) {
        super(bundle);
        this.Lc = tL_starGiftUnique;
        this.Mc = j3;
        this.Kc = false;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.Kc) {
            this.Kc = true;
            rc O = yc.a0(this).O(this.Lc.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftToTitle), LocaleController.formatString(R.string.BoughtResoldGiftToText, DialogObject.getShortName(this.currentAccount, this.Mc)));
            O.f30347r = false;
            O.j();
            u00 u00Var = this.f43398k9;
            if (u00Var != null) {
                u00Var.c(true);
            }
        }
    }
}
