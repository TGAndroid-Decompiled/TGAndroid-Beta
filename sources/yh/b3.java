package yh;

import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.r00;
import org.telegram.ui.Components.yc;
import org.telegram.ui.co;
public final class b3 extends co {
    public boolean Qc;
    public final TL_stars.TL_starGiftUnique Rc;
    public final long Sc;

    public b3(Bundle bundle, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3) {
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
            qc O = yc.a0(this).O(this.Rc.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftToTitle), LocaleController.formatString(R.string.BoughtResoldGiftToText, DialogObject.getShortName(this.currentAccount, this.Sc)));
            O.f29687r = false;
            O.j();
            r00 r00Var = this.f35342m9;
            if (r00Var != null) {
                r00Var.c(true);
            }
        }
    }
}
