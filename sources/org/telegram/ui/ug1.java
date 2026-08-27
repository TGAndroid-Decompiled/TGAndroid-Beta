package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;

public final class ug1 implements View.OnClickListener {

    public final int f43225a;

    public final lh1 f43226b;

    public final VoIPService f43227c;

    public ug1(lh1 lh1Var, VoIPService voIPService, int i10) {
        this.f43225a = i10;
        this.f43226b = lh1Var;
        this.f43227c = voIPService;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f43225a) {
            case 0:
                lh1 lh1Var = this.f43226b;
                AndroidUtilities.runOnUIThread(new vg1(lh1Var, 8));
                int i10 = lh1Var.H;
                if (i10 > 0) {
                    this.f43227c.sendCallRating(i10);
                }
                break;
            default:
                lh1 lh1Var2 = this.f43226b;
                AndroidUtilities.runOnUIThread(new vg1(lh1Var2, 10));
                int i11 = lh1Var2.H;
                if (i11 > 0) {
                    this.f43227c.sendCallRating(i11);
                }
                break;
        }
    }
}
