package wh;

import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.y00;
import org.telegram.ui.eo;
public final class b3 extends eo {
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
            pc O = wc.a0(this).O(this.Rc.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftToTitle), LocaleController.formatString(R.string.BoughtResoldGiftToText, DialogObject.getShortName(this.currentAccount, this.Sc)));
            O.f26089r = false;
            O.j();
            y00 y00Var = this.f32411m9;
            if (y00Var != null) {
                y00Var.c(true);
            }
        }
    }
}
