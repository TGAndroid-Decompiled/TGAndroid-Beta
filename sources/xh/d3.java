package xh;

import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.r00;
import org.telegram.ui.Components.xc;
import org.telegram.ui.zn;
public final class d3 extends zn {
    public boolean Pc;
    public final TL_stars.TL_starGiftUnique Qc;
    public final long Rc;

    public d3(Bundle bundle, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3) {
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
            pc O = xc.a0(this).O(this.Qc.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftToTitle), LocaleController.formatString(R.string.BoughtResoldGiftToText, DialogObject.getShortName(this.currentAccount, this.Rc)));
            O.f27319r = false;
            O.j();
            r00 r00Var = this.f40420m9;
            if (r00Var != null) {
                r00Var.c(true);
            }
        }
    }
}
