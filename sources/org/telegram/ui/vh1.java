package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
public final class vh1 implements View.OnClickListener {
    public final int f38400a;
    public final mi1 f38401b;
    public final VoIPService f38402c;

    public vh1(mi1 mi1Var, VoIPService voIPService, int i10) {
        this.f38400a = i10;
        this.f38401b = mi1Var;
        this.f38402c = voIPService;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f38400a) {
            case 0:
                mi1 mi1Var = this.f38401b;
                AndroidUtilities.runOnUIThread(new wh1(mi1Var, 8));
                int i10 = mi1Var.L;
                if (i10 > 0) {
                    this.f38402c.sendCallRating(i10);
                    return;
                }
                return;
            default:
                mi1 mi1Var2 = this.f38401b;
                AndroidUtilities.runOnUIThread(new wh1(mi1Var2, 10));
                int i11 = mi1Var2.L;
                if (i11 > 0) {
                    this.f38402c.sendCallRating(i11);
                    return;
                }
                return;
        }
    }
}
