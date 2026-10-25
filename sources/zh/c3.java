package zh;

import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.z00;
import org.telegram.ui.un;
public final class c3 extends un {
    public boolean f52920kd;
    public final TL_stars.TL_starGiftUnique f52921ld;
    public final long f52922md;

    public c3(Bundle bundle, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10) {
        super(bundle);
        this.f52921ld = tL_starGiftUnique;
        this.f52922md = j10;
        this.f52920kd = false;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f52920kd) {
            this.f52920kd = true;
            qc O = wc.b0(this).O(this.f52921ld.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftToTitle), LocaleController.formatString(R.string.BoughtResoldGiftToText, DialogObject.getShortName(this.currentAccount, this.f52922md)));
            O.f31896s = false;
            O.j();
            z00 z00Var = this.f44489y9;
            if (z00Var != null) {
                z00Var.c(true);
            }
        }
    }
}
