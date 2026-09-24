package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
public final class vh1 implements View.OnClickListener {
    public final int f38704a;
    public final mi1 f38705b;
    public final VoIPService f38706c;

    public vh1(mi1 mi1Var, VoIPService voIPService, int i10) {
        this.f38704a = i10;
        this.f38705b = mi1Var;
        this.f38706c = voIPService;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f38704a) {
            case 0:
                mi1 mi1Var = this.f38705b;
                AndroidUtilities.runOnUIThread(new wh1(mi1Var, 8));
                int i10 = mi1Var.L;
                if (i10 > 0) {
                    this.f38706c.sendCallRating(i10);
                    return;
                }
                return;
            default:
                mi1 mi1Var2 = this.f38705b;
                AndroidUtilities.runOnUIThread(new wh1(mi1Var2, 10));
                int i11 = mi1Var2.L;
                if (i11 > 0) {
                    this.f38706c.sendCallRating(i11);
                    return;
                }
                return;
        }
    }
}
