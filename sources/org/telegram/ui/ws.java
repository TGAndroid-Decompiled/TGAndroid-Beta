package org.telegram.ui;

import android.app.Activity;
import android.view.View;
public final class ws implements View.OnClickListener {
    public final int f43430a;
    public final ht f43431b;

    public ws(ht htVar, int i10) {
        this.f43430a = i10;
        this.f43431b = htVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f43430a) {
            case 0:
                ht htVar = this.f43431b;
                htVar.K = false;
                htVar.f37958z.invalidate();
                htVar.l();
                return;
            case 1:
                ht htVar2 = this.f43431b;
                Activity activity = htVar2.f37955w;
                if (activity instanceof LaunchActivity) {
                    LaunchActivity launchActivity = (LaunchActivity) activity;
                    if (launchActivity.O() != null && launchActivity.O().getLastFragment() != null) {
                        launchActivity.O().getLastFragment().dismissCurrentDialog();
                    }
                    launchActivity.u0(new PremiumPreviewFragment(0, PremiumPreviewFragment.l0(5)));
                }
                htVar2.K = false;
                htVar2.f37958z.invalidate();
                htVar2.l();
                return;
            case 2:
                ht htVar3 = this.f43431b;
                ft ftVar = htVar3.f37945l;
                if (ftVar != null) {
                    ftVar.K();
                }
                htVar3.n();
                return;
            default:
                ht htVar4 = this.f43431b;
                ft ftVar2 = htVar4.f37945l;
                if (ftVar2 != null) {
                    ftVar2.q();
                }
                htVar4.n();
                return;
        }
    }
}
