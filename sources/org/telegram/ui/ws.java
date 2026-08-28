package org.telegram.ui;

import android.app.Activity;
import android.view.View;
public final class ws implements View.OnClickListener {
    public final int f44254a;
    public final ht f44255b;

    public ws(ht htVar, int i9) {
        this.f44254a = i9;
        this.f44255b = htVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f44254a) {
            case 0:
                ht htVar = this.f44255b;
                htVar.K = false;
                htVar.f38936z.invalidate();
                htVar.n();
                return;
            case 1:
                ht htVar2 = this.f44255b;
                Activity activity = htVar2.f38933w;
                if (activity instanceof LaunchActivity) {
                    LaunchActivity launchActivity = (LaunchActivity) activity;
                    if (launchActivity.O() != null && launchActivity.O().getLastFragment() != null) {
                        launchActivity.O().getLastFragment().dismissCurrentDialog();
                    }
                    launchActivity.p0(new PremiumPreviewFragment(0, PremiumPreviewFragment.k0(5)));
                }
                htVar2.K = false;
                htVar2.f38936z.invalidate();
                htVar2.n();
                return;
            case 2:
                ht htVar3 = this.f44255b;
                ft ftVar = htVar3.f38923l;
                if (ftVar != null) {
                    ftVar.K();
                }
                htVar3.p();
                return;
            default:
                ht htVar4 = this.f44255b;
                ft ftVar2 = htVar4.f38923l;
                if (ftVar2 != null) {
                    ftVar2.q();
                }
                htVar4.p();
                return;
        }
    }
}
