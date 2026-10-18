package yh;

import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.z00;
import org.telegram.ui.sn;
public final class a3 extends sn {
    public boolean Rc;
    public final TL_stars.TL_starGiftUnique Sc;
    public final long Tc;

    public a3(Bundle bundle, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10) {
        super(bundle);
        this.Sc = tL_starGiftUnique;
        this.Tc = j10;
        this.Rc = false;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.Rc) {
            this.Rc = true;
            qc O = xc.a0(this).O(this.Sc.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftToTitle), LocaleController.formatString(R.string.BoughtResoldGiftToText, DialogObject.getShortName(this.currentAccount, this.Tc)));
            O.f29646r = false;
            O.j();
            z00 z00Var = this.f41287m9;
            if (z00Var != null) {
                z00Var.c(true);
            }
        }
    }
}
