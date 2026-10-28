package org.telegram.ui;

import android.app.Activity;
import android.view.View;
public final class ws implements View.OnClickListener {
    public final int f45393a;
    public final ht f45394b;

    public ws(ht htVar, int i10) {
        this.f45393a = i10;
        this.f45394b = htVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f45393a) {
            case 0:
                ht htVar = this.f45394b;
                htVar.K = false;
                htVar.f39987z.invalidate();
                htVar.l();
                return;
            case 1:
                ht htVar2 = this.f45394b;
                Activity activity = htVar2.f39984w;
                if (activity instanceof LaunchActivity) {
                    LaunchActivity launchActivity = (LaunchActivity) activity;
                    if (launchActivity.O() != null && launchActivity.O().getLastFragment() != null) {
                        launchActivity.O().getLastFragment().dismissCurrentDialog();
                    }
                    launchActivity.u0(new PremiumPreviewFragment(0, PremiumPreviewFragment.m0(5)));
                }
                htVar2.K = false;
                htVar2.f39987z.invalidate();
                htVar2.l();
                return;
            case 2:
                ht htVar3 = this.f45394b;
                ft ftVar = htVar3.f39974l;
                if (ftVar != null) {
                    ftVar.J();
                }
                htVar3.n();
                return;
            default:
                ht htVar4 = this.f45394b;
                ft ftVar2 = htVar4.f39974l;
                if (ftVar2 != null) {
                    ftVar2.r();
                }
                htVar4.n();
                return;
        }
    }
}
