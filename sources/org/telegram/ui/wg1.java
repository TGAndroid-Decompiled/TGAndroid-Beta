package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
public final class wg1 implements View.OnClickListener {
    public final int f43350a;
    public final nh1 f43351b;
    public final VoIPService f43352c;

    public wg1(nh1 nh1Var, VoIPService voIPService, int i10) {
        this.f43350a = i10;
        this.f43351b = nh1Var;
        this.f43352c = voIPService;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f43350a) {
            case 0:
                nh1 nh1Var = this.f43351b;
                AndroidUtilities.runOnUIThread(new xg1(nh1Var, 8));
                int i10 = nh1Var.L;
                if (i10 > 0) {
                    this.f43352c.sendCallRating(i10);
                    return;
                }
                return;
            default:
                nh1 nh1Var2 = this.f43351b;
                AndroidUtilities.runOnUIThread(new xg1(nh1Var2, 10));
                int i11 = nh1Var2.L;
                if (i11 > 0) {
                    this.f43352c.sendCallRating(i11);
                    return;
                }
                return;
        }
    }
}
