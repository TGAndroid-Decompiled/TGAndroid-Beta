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
    public boolean f50617ed;
    public final TL_stars.TL_starGiftUnique f50618fd;
    public final long f50619gd;

    public a3(Bundle bundle, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10) {
        super(bundle);
        this.f50618fd = tL_starGiftUnique;
        this.f50619gd = j10;
        this.f50617ed = false;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f50617ed) {
            this.f50617ed = true;
            qc O = xc.a0(this).O(this.f50618fd.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftToTitle), LocaleController.formatString(R.string.BoughtResoldGiftToText, DialogObject.getShortName(this.currentAccount, this.f50619gd)));
            O.f29840r = false;
            O.j();
            z00 z00Var = this.f41759y9;
            if (z00Var != null) {
                z00Var.c(true);
            }
        }
    }
}
