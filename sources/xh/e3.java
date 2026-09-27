package xh;

import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.xc;
import org.telegram.ui.xn;
public final class e3 extends xn {
    public boolean Pc;
    public final TL_stars.TL_starGiftUnique Qc;
    public final long Rc;

    public e3(Bundle bundle, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3) {
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
            qc O = xc.a0(this).O(this.Qc.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftToTitle), LocaleController.formatString(R.string.BoughtResoldGiftToText, DialogObject.getShortName(this.currentAccount, this.Rc)));
            O.f27699r = false;
            O.j();
            t00 t00Var = this.f39846m9;
            if (t00Var != null) {
                t00Var.c(true);
            }
        }
    }
}
