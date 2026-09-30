package xh;

import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.u00;
import org.telegram.ui.Components.yc;
import org.telegram.ui.wn;
public final class d3 extends wn {
    public boolean Pc;
    public final TL_stars.TL_starGiftUnique Qc;
    public final long Rc;

    public d3(Bundle bundle, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3) {
        super(bundle);
        this.Qc = tL_starGiftUnique;
        this.Rc = j3;
        this.Pc = false;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.Pc) {
            this.Pc = true;
            rc O = yc.a0(this).O(this.Qc.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftToTitle), LocaleController.formatString(R.string.BoughtResoldGiftToText, DialogObject.getShortName(this.currentAccount, this.Rc)));
            O.f27954r = false;
            O.j();
            u00 u00Var = this.f39657m9;
            if (u00Var != null) {
                u00Var.c(true);
            }
        }
    }
}
