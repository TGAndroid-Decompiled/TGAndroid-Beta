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
    public boolean f52923kd;
    public final TL_stars.TL_starGiftUnique f52924ld;
    public final long f52925md;

    public c3(Bundle bundle, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10) {
        super(bundle);
        this.f52924ld = tL_starGiftUnique;
        this.f52925md = j10;
        this.f52923kd = false;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f52923kd) {
            this.f52923kd = true;
            qc O = wc.b0(this).O(this.f52924ld.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftToTitle), LocaleController.formatString(R.string.BoughtResoldGiftToText, DialogObject.getShortName(this.currentAccount, this.f52925md)));
            O.f31898s = false;
            O.j();
            z00 z00Var = this.f44492y9;
            if (z00Var != null) {
                z00Var.c(true);
            }
        }
    }
}
