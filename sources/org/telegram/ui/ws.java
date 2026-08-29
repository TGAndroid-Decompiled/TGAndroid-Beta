package org.telegram.ui;

import android.app.Activity;
import android.view.View;
public final class ws implements View.OnClickListener {
    public final int f44367a;
    public final ht f44368b;

    public ws(ht htVar, int i10) {
        this.f44367a = i10;
        this.f44368b = htVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f44367a) {
            case 0:
                ht htVar = this.f44368b;
                htVar.K = false;
                htVar.f39045z.invalidate();
                htVar.n();
                return;
            case 1:
                ht htVar2 = this.f44368b;
                Activity activity = htVar2.f39042w;
                if (activity instanceof LaunchActivity) {
                    LaunchActivity launchActivity = (LaunchActivity) activity;
                    if (launchActivity.O() != null && launchActivity.O().getLastFragment() != null) {
                        launchActivity.O().getLastFragment().dismissCurrentDialog();
                    }
                    launchActivity.p0(new PremiumPreviewFragment(0, PremiumPreviewFragment.l0(5)));
                }
                htVar2.K = false;
                htVar2.f39045z.invalidate();
                htVar2.n();
                return;
            case 2:
                ht htVar3 = this.f44368b;
                ft ftVar = htVar3.f39032l;
                if (ftVar != null) {
                    ftVar.K();
                }
                htVar3.p();
                return;
            default:
                ht htVar4 = this.f44368b;
                ft ftVar2 = htVar4.f39032l;
                if (ftVar2 != null) {
                    ftVar2.q();
                }
                htVar4.p();
                return;
        }
    }
}
