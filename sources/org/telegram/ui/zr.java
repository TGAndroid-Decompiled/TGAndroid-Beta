package org.telegram.ui;

import android.app.Activity;
import android.view.View;
public final class zr implements View.OnClickListener {
    public final int f52650a;
    public final ks f52651b;

    public zr(ks ksVar, int i7) {
        this.f52650a = i7;
        this.f52651b = ksVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f52650a) {
            case 0:
                ks ksVar = this.f52651b;
                ksVar.K = false;
                ksVar.f47299z.invalidate();
                ksVar.m();
                return;
            case 1:
                ks ksVar2 = this.f52651b;
                Activity activity = ksVar2.f47296w;
                if (activity instanceof LaunchActivity) {
                    LaunchActivity launchActivity = (LaunchActivity) activity;
                    if (launchActivity.M() != null && launchActivity.M().getLastFragment() != null) {
                        launchActivity.M().getLastFragment().dismissCurrentDialog();
                    }
                    launchActivity.t0(new PremiumPreviewFragment(0, PremiumPreviewFragment.q0(5)));
                }
                ksVar2.K = false;
                ksVar2.f47299z.invalidate();
                ksVar2.m();
                return;
            case 2:
                ks ksVar3 = this.f52651b;
                is isVar = ksVar3.f47286l;
                if (isVar != null) {
                    isVar.K();
                }
                ksVar3.o();
                return;
            default:
                ks ksVar4 = this.f52651b;
                is isVar2 = ksVar4.f47286l;
                if (isVar2 != null) {
                    isVar2.r();
                }
                ksVar4.o();
                return;
        }
    }
}
