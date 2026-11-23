package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.voip.VoIPService;
public final class rb1 implements View.OnClickListener {
    public final int f51570a;
    public final hc1 f51571b;
    public final VoIPService f51572c;

    public rb1(hc1 hc1Var, VoIPService voIPService, int i7) {
        this.f51570a = i7;
        this.f51571b = hc1Var;
        this.f51572c = voIPService;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f51570a) {
            case 0:
                hc1 hc1Var = this.f51571b;
                org.telegram.messenger.g0.g3(new tb1(hc1Var, 8));
                int i7 = hc1Var.M;
                if (i7 > 0) {
                    this.f51572c.sendCallRating(i7);
                    return;
                }
                return;
            default:
                hc1 hc1Var2 = this.f51571b;
                org.telegram.messenger.g0.g3(new tb1(hc1Var2, 10));
                int i10 = hc1Var2.M;
                if (i10 > 0) {
                    this.f51572c.sendCallRating(i10);
                    return;
                }
                return;
        }
    }
}
