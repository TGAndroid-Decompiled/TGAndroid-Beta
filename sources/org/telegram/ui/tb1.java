package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.voip.VoIPService;
public final class tb1 implements View.OnClickListener {
    public final int f50226a;
    public final jc1 f50227b;
    public final VoIPService f50228c;

    public tb1(jc1 jc1Var, VoIPService voIPService, int i7) {
        this.f50226a = i7;
        this.f50227b = jc1Var;
        this.f50228c = voIPService;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f50226a) {
            case 0:
                jc1 jc1Var = this.f50227b;
                org.telegram.messenger.g0.h3(new vb1(jc1Var, 8));
                int i7 = jc1Var.L;
                if (i7 > 0) {
                    this.f50228c.sendCallRating(i7);
                    return;
                }
                return;
            default:
                jc1 jc1Var2 = this.f50227b;
                org.telegram.messenger.g0.h3(new vb1(jc1Var2, 10));
                int i10 = jc1Var2.L;
                if (i10 > 0) {
                    this.f50228c.sendCallRating(i10);
                    return;
                }
                return;
        }
    }
}
