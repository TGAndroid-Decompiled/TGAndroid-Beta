package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
public final class sg1 implements View.OnClickListener {
    public final int f41124a;
    public final jh1 f41125b;
    public final VoIPService f41126c;

    public sg1(jh1 jh1Var, VoIPService voIPService, int i10) {
        this.f41124a = i10;
        this.f41125b = jh1Var;
        this.f41126c = voIPService;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f41124a) {
            case 0:
                jh1 jh1Var = this.f41125b;
                AndroidUtilities.runOnUIThread(new tg1(jh1Var, 8));
                int i10 = jh1Var.L;
                if (i10 > 0) {
                    this.f41126c.sendCallRating(i10);
                    return;
                }
                return;
            default:
                jh1 jh1Var2 = this.f41125b;
                AndroidUtilities.runOnUIThread(new tg1(jh1Var2, 10));
                int i11 = jh1Var2.L;
                if (i11 > 0) {
                    this.f41126c.sendCallRating(i11);
                    return;
                }
                return;
        }
    }
}
