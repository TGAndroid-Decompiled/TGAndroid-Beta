package xh;

import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.h10;
import org.telegram.ui.Components.tc;
import org.telegram.ui.zn;
public final class d3 extends zn {
    public boolean Qc;
    public final TL_stars.TL_starGiftUnique Rc;
    public final long Sc;

    public d3(Bundle bundle, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3) {
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
            tc O = ad.a0(this).O(this.Rc.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftToTitle), LocaleController.formatString(R.string.BoughtResoldGiftToText, DialogObject.getShortName(this.currentAccount, this.Sc)));
            O.f31138r = false;
            O.j();
            h10 h10Var = this.f44858m9;
            if (h10Var != null) {
                h10Var.c(true);
            }
        }
    }
}
