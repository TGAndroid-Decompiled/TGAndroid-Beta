package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
public final class rh1 implements View.OnClickListener {
    public final int f40852a;
    public final ii1 f40853b;
    public final VoIPService f40854c;

    public rh1(ii1 ii1Var, VoIPService voIPService, int i10) {
        this.f40852a = i10;
        this.f40853b = ii1Var;
        this.f40854c = voIPService;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40852a) {
            case 0:
                ii1 ii1Var = this.f40853b;
                AndroidUtilities.runOnUIThread(new sh1(ii1Var, 8));
                int i10 = ii1Var.I;
                if (i10 > 0) {
                    this.f40854c.sendCallRating(i10);
                    return;
                }
                return;
            default:
                ii1 ii1Var2 = this.f40853b;
                AndroidUtilities.runOnUIThread(new sh1(ii1Var2, 10));
                int i11 = ii1Var2.I;
                if (i11 > 0) {
                    this.f40854c.sendCallRating(i11);
                    return;
                }
                return;
        }
    }
}
