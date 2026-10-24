package yh;

import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.x00;
import org.telegram.ui.sn;
public final class a3 extends sn {
    public boolean f50616ed;
    public final TL_stars.TL_starGiftUnique f50617fd;
    public final long f50618gd;

    public a3(Bundle bundle, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10) {
        super(bundle);
        this.f50617fd = tL_starGiftUnique;
        this.f50618gd = j10;
        this.f50616ed = false;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f50616ed) {
            this.f50616ed = true;
            oc O = vc.a0(this).O(this.f50617fd.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftToTitle), LocaleController.formatString(R.string.BoughtResoldGiftToText, DialogObject.getShortName(this.currentAccount, this.f50618gd)));
            O.f29211r = false;
            O.j();
            x00 x00Var = this.f41756y9;
            if (x00Var != null) {
                x00Var.c(true);
            }
        }
    }
}
