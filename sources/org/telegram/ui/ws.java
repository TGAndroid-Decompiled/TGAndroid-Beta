package org.telegram.ui;

import android.app.Activity;
import android.view.View;
public final class ws implements View.OnClickListener {
    public final int f43393a;
    public final ht f43394b;

    public ws(ht htVar, int i10) {
        this.f43393a = i10;
        this.f43394b = htVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f43393a) {
            case 0:
                ht htVar = this.f43394b;
                htVar.K = false;
                htVar.f38009z.invalidate();
                htVar.l();
                return;
            case 1:
                ht htVar2 = this.f43394b;
                Activity activity = htVar2.f38006w;
                if (activity instanceof LaunchActivity) {
                    LaunchActivity launchActivity = (LaunchActivity) activity;
                    if (launchActivity.O() != null && launchActivity.O().getLastFragment() != null) {
                        launchActivity.O().getLastFragment().dismissCurrentDialog();
                    }
                    launchActivity.u0(new PremiumPreviewFragment(0, PremiumPreviewFragment.l0(5)));
                }
                htVar2.K = false;
                htVar2.f38009z.invalidate();
                htVar2.l();
                return;
            case 2:
                ht htVar3 = this.f43394b;
                ft ftVar = htVar3.f37996l;
                if (ftVar != null) {
                    ftVar.K();
                }
                htVar3.n();
                return;
            default:
                ht htVar4 = this.f43394b;
                ft ftVar2 = htVar4.f37996l;
                if (ftVar2 != null) {
                    ftVar2.q();
                }
                htVar4.n();
                return;
        }
    }
}
