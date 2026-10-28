package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
public final class zg1 implements View.OnClickListener {
    public final int f46272a;
    public final rh1 f46273b;
    public final VoIPService f46274c;

    public zg1(rh1 rh1Var, VoIPService voIPService, int i10) {
        this.f46272a = i10;
        this.f46273b = rh1Var;
        this.f46274c = voIPService;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f46272a) {
            case 0:
                rh1 rh1Var = this.f46273b;
                AndroidUtilities.runOnUIThread(new ah1(rh1Var, 8));
                int i10 = rh1Var.L;
                if (i10 > 0) {
                    this.f46274c.sendCallRating(i10);
                    return;
                }
                return;
            default:
                rh1 rh1Var2 = this.f46273b;
                AndroidUtilities.runOnUIThread(new ah1(rh1Var2, 10));
                int i11 = rh1Var2.L;
                if (i11 > 0) {
                    this.f46274c.sendCallRating(i11);
                    return;
                }
                return;
        }
    }
}
