package xh;

import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.r00;
import org.telegram.ui.Components.vc;
import org.telegram.ui.bo;
public final class c3 extends bo {
    public boolean Pc;
    public final TL_stars.TL_starGiftUnique Qc;
    public final long Rc;

    public c3(Bundle bundle, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3) {
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
            oc O = vc.a0(this).O(this.Qc.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftToTitle), LocaleController.formatString(R.string.BoughtResoldGiftToText, DialogObject.getShortName(this.currentAccount, this.Rc)));
            O.f26759r = false;
            O.j();
            r00 r00Var = this.f32388m9;
            if (r00Var != null) {
                r00Var.c(true);
            }
        }
    }
}
