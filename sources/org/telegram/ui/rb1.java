package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.voip.VoIPService;
public final class rb1 implements View.OnClickListener {
    public final int f49403a;
    public final ic1 f49404b;
    public final VoIPService f49405c;

    public rb1(ic1 ic1Var, VoIPService voIPService, int i7) {
        this.f49403a = i7;
        this.f49404b = ic1Var;
        this.f49405c = voIPService;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f49403a) {
            case 0:
                ic1 ic1Var = this.f49404b;
                org.telegram.messenger.g0.h3(new tb1(ic1Var, 8));
                int i7 = ic1Var.L;
                if (i7 > 0) {
                    this.f49405c.sendCallRating(i7);
                    return;
                }
                return;
            default:
                ic1 ic1Var2 = this.f49404b;
                org.telegram.messenger.g0.h3(new tb1(ic1Var2, 10));
                int i10 = ic1Var2.L;
                if (i10 > 0) {
                    this.f49405c.sendCallRating(i10);
                    return;
                }
                return;
        }
    }
}
