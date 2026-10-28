package zh;

import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.z00;
import org.telegram.ui.wn;
public final class c3 extends wn {
    public boolean f52981od;
    public final TL_stars.TL_starGiftUnique f52982pd;
    public final long f52983qd;

    public c3(Bundle bundle, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10) {
        super(bundle);
        this.f52982pd = tL_starGiftUnique;
        this.f52983qd = j10;
        this.f52981od = false;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f52981od) {
            this.f52981od = true;
            qc O = wc.b0(this).O(this.f52982pd.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftToTitle), LocaleController.formatString(R.string.BoughtResoldGiftToText, DialogObject.getShortName(this.currentAccount, this.f52983qd)));
            O.f31870s = false;
            O.j();
            z00 z00Var = this.C9;
            if (z00Var != null) {
                z00Var.c(true);
            }
        }
    }
}
