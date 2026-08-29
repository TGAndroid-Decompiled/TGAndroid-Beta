package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
public final class xg1 implements View.OnClickListener {
    public final int f44591a;
    public final oh1 f44592b;
    public final VoIPService f44593c;

    public xg1(oh1 oh1Var, VoIPService voIPService, int i10) {
        this.f44591a = i10;
        this.f44592b = oh1Var;
        this.f44593c = voIPService;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f44591a) {
            case 0:
                oh1 oh1Var = this.f44592b;
                AndroidUtilities.runOnUIThread(new yg1(oh1Var, 8));
                int i10 = oh1Var.H;
                if (i10 > 0) {
                    this.f44593c.sendCallRating(i10);
                    return;
                }
                return;
            default:
                oh1 oh1Var2 = this.f44592b;
                AndroidUtilities.runOnUIThread(new yg1(oh1Var2, 10));
                int i11 = oh1Var2.H;
                if (i11 > 0) {
                    this.f44593c.sendCallRating(i11);
                    return;
                }
                return;
        }
    }
}
