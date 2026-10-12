package yh;

import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.d10;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.zc;
import org.telegram.ui.fo;
public final class b3 extends fo {
    public boolean Qc;
    public final TL_stars.TL_starGiftUnique Rc;
    public final long Sc;

    public b3(Bundle bundle, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10) {
        super(bundle);
        this.Rc = tL_starGiftUnique;
        this.Sc = j10;
        this.Qc = false;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.Qc) {
            this.Qc = true;
            sc O = zc.a0(this).O(this.Rc.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftToTitle), LocaleController.formatString(R.string.BoughtResoldGiftToText, DialogObject.getShortName(this.currentAccount, this.Sc)));
            O.f29110r = false;
            O.j();
            d10 d10Var = this.f36028m9;
            if (d10Var != null) {
                d10Var.c(true);
            }
        }
    }
}
