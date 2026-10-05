package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
public final class th1 implements View.OnClickListener {
    public final int f40914a;
    public final ki1 f40915b;
    public final VoIPService f40916c;

    public th1(ki1 ki1Var, VoIPService voIPService, int i10) {
        this.f40914a = i10;
        this.f40915b = ki1Var;
        this.f40916c = voIPService;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40914a) {
            case 0:
                ki1 ki1Var = this.f40915b;
                AndroidUtilities.runOnUIThread(new uh1(ki1Var, 8));
                int i10 = ki1Var.L;
                if (i10 > 0) {
                    this.f40916c.sendCallRating(i10);
                    return;
                }
                return;
            default:
                ki1 ki1Var2 = this.f40915b;
                AndroidUtilities.runOnUIThread(new uh1(ki1Var2, 10));
                int i11 = ki1Var2.L;
                if (i11 > 0) {
                    this.f40916c.sendCallRating(i11);
                    return;
                }
                return;
        }
    }
}
