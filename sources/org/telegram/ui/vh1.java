package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
public final class vh1 implements View.OnClickListener {
    public final int f41760a;
    public final mi1 f41761b;
    public final VoIPService f41762c;

    public vh1(mi1 mi1Var, VoIPService voIPService, int i10) {
        this.f41760a = i10;
        this.f41761b = mi1Var;
        this.f41762c = voIPService;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f41760a) {
            case 0:
                mi1 mi1Var = this.f41761b;
                AndroidUtilities.runOnUIThread(new wh1(mi1Var, 8));
                int i10 = mi1Var.L;
                if (i10 > 0) {
                    this.f41762c.sendCallRating(i10);
                    return;
                }
                return;
            default:
                mi1 mi1Var2 = this.f41761b;
                AndroidUtilities.runOnUIThread(new wh1(mi1Var2, 10));
                int i11 = mi1Var2.L;
                if (i11 > 0) {
                    this.f41762c.sendCallRating(i11);
                    return;
                }
                return;
        }
    }
}
