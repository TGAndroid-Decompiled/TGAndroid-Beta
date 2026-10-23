package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
public final class xg1 implements View.OnClickListener {
    public final int f43600a;
    public final oh1 f43601b;
    public final VoIPService f43602c;

    public xg1(oh1 oh1Var, VoIPService voIPService, int i10) {
        this.f43600a = i10;
        this.f43601b = oh1Var;
        this.f43602c = voIPService;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f43600a) {
            case 0:
                oh1 oh1Var = this.f43601b;
                AndroidUtilities.runOnUIThread(new yg1(oh1Var, 8));
                int i10 = oh1Var.L;
                if (i10 > 0) {
                    this.f43602c.sendCallRating(i10);
                    return;
                }
                return;
            default:
                oh1 oh1Var2 = this.f43601b;
                AndroidUtilities.runOnUIThread(new yg1(oh1Var2, 10));
                int i11 = oh1Var2.L;
                if (i11 > 0) {
                    this.f43602c.sendCallRating(i11);
                    return;
                }
                return;
        }
    }
}
