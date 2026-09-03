package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
public final class rh1 implements View.OnClickListener {
    public final int f37868a;
    public final ii1 f37869b;
    public final VoIPService f37870c;

    public rh1(ii1 ii1Var, VoIPService voIPService, int i10) {
        this.f37868a = i10;
        this.f37869b = ii1Var;
        this.f37870c = voIPService;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37868a) {
            case 0:
                ii1 ii1Var = this.f37869b;
                AndroidUtilities.runOnUIThread(new sh1(ii1Var, 8));
                int i10 = ii1Var.I;
                if (i10 > 0) {
                    this.f37870c.sendCallRating(i10);
                    return;
                }
                return;
            default:
                ii1 ii1Var2 = this.f37869b;
                AndroidUtilities.runOnUIThread(new sh1(ii1Var2, 10));
                int i11 = ii1Var2.I;
                if (i11 > 0) {
                    this.f37870c.sendCallRating(i11);
                    return;
                }
                return;
        }
    }
}
