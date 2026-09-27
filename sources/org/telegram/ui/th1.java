package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
public final class th1 implements View.OnClickListener {
    public final int f37824a;
    public final ki1 f37825b;
    public final VoIPService f37826c;

    public th1(ki1 ki1Var, VoIPService voIPService, int i10) {
        this.f37824a = i10;
        this.f37825b = ki1Var;
        this.f37826c = voIPService;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37824a) {
            case 0:
                ki1 ki1Var = this.f37825b;
                AndroidUtilities.runOnUIThread(new uh1(ki1Var, 8));
                int i10 = ki1Var.L;
                if (i10 > 0) {
                    this.f37826c.sendCallRating(i10);
                    return;
                }
                return;
            default:
                ki1 ki1Var2 = this.f37825b;
                AndroidUtilities.runOnUIThread(new uh1(ki1Var2, 10));
                int i11 = ki1Var2.L;
                if (i11 > 0) {
                    this.f37826c.sendCallRating(i11);
                    return;
                }
                return;
        }
    }
}
