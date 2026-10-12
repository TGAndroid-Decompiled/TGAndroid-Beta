package xh;

import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.k10;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.zc;
import org.telegram.ui.eo;
public final class c3 extends eo {
    public boolean Qc;
    public final TL_stars.TL_starGiftUnique Rc;
    public final long Sc;

    public c3(Bundle bundle, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3) {
        super(bundle);
        this.Rc = tL_starGiftUnique;
        this.Sc = j3;
        this.Qc = false;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.Qc) {
            this.Qc = true;
            sc O = zc.a0(this).O(this.Rc.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftToTitle), LocaleController.formatString(R.string.BoughtResoldGiftToText, DialogObject.getShortName(this.currentAccount, this.Sc)));
            O.f30544r = false;
            O.j();
            k10 k10Var = this.f37351m9;
            if (k10Var != null) {
                k10Var.c(true);
            }
        }
    }
}
