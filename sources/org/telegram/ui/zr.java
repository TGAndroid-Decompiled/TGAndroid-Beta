package org.telegram.ui;

import android.app.Activity;
import android.view.View;
public final class zr implements View.OnClickListener {
    public final int f52648a;
    public final ks f52649b;

    public zr(ks ksVar, int i7) {
        this.f52648a = i7;
        this.f52649b = ksVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f52648a) {
            case 0:
                ks ksVar = this.f52649b;
                ksVar.K = false;
                ksVar.f47295z.invalidate();
                ksVar.m();
                return;
            case 1:
                ks ksVar2 = this.f52649b;
                Activity activity = ksVar2.f47292w;
                if (activity instanceof LaunchActivity) {
                    LaunchActivity launchActivity = (LaunchActivity) activity;
                    if (launchActivity.M() != null && launchActivity.M().getLastFragment() != null) {
                        launchActivity.M().getLastFragment().dismissCurrentDialog();
                    }
                    launchActivity.t0(new PremiumPreviewFragment(0, PremiumPreviewFragment.q0(5)));
                }
                ksVar2.K = false;
                ksVar2.f47295z.invalidate();
                ksVar2.m();
                return;
            case 2:
                ks ksVar3 = this.f52649b;
                is isVar = ksVar3.f47282l;
                if (isVar != null) {
                    isVar.K();
                }
                ksVar3.o();
                return;
            default:
                ks ksVar4 = this.f52649b;
                is isVar2 = ksVar4.f47282l;
                if (isVar2 != null) {
                    isVar2.r();
                }
                ksVar4.o();
                return;
        }
    }
}
