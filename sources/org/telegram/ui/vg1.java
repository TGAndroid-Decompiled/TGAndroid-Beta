package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
public final class vg1 implements View.OnClickListener {
    public final int f43479a;
    public final mh1 f43480b;
    public final VoIPService f43481c;

    public vg1(mh1 mh1Var, VoIPService voIPService, int i9) {
        this.f43479a = i9;
        this.f43480b = mh1Var;
        this.f43481c = voIPService;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f43479a) {
            case 0:
                mh1 mh1Var = this.f43480b;
                AndroidUtilities.runOnUIThread(new wg1(mh1Var, 8));
                int i9 = mh1Var.H;
                if (i9 > 0) {
                    this.f43481c.sendCallRating(i9);
                    return;
                }
                return;
            default:
                mh1 mh1Var2 = this.f43480b;
                AndroidUtilities.runOnUIThread(new wg1(mh1Var2, 10));
                int i10 = mh1Var2.H;
                if (i10 > 0) {
                    this.f43481c.sendCallRating(i10);
                    return;
                }
                return;
        }
    }
}
