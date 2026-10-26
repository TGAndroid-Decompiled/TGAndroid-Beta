package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
public final class xg1 implements View.OnClickListener {
    public final int f45772a;
    public final ph1 f45773b;
    public final VoIPService f45774c;

    public xg1(ph1 ph1Var, VoIPService voIPService, int i10) {
        this.f45772a = i10;
        this.f45773b = ph1Var;
        this.f45774c = voIPService;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f45772a) {
            case 0:
                ph1 ph1Var = this.f45773b;
                AndroidUtilities.runOnUIThread(new yg1(ph1Var, 8));
                int i10 = ph1Var.L;
                if (i10 > 0) {
                    this.f45774c.sendCallRating(i10);
                    return;
                }
                return;
            default:
                ph1 ph1Var2 = this.f45773b;
                AndroidUtilities.runOnUIThread(new yg1(ph1Var2, 10));
                int i11 = ph1Var2.L;
                if (i11 > 0) {
                    this.f45774c.sendCallRating(i11);
                    return;
                }
                return;
        }
    }
}
