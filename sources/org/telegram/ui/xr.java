package org.telegram.ui;

import android.app.Activity;
import android.view.View;
public final class xr implements View.OnClickListener {
    public final int f52080a;
    public final is f52081b;

    public xr(is isVar, int i3) {
        this.f52080a = i3;
        this.f52081b = isVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f52080a) {
            case 0:
                is isVar = this.f52081b;
                isVar.K = false;
                isVar.f46409z.invalidate();
                isVar.m();
                return;
            case 1:
                is isVar2 = this.f52081b;
                Activity activity = isVar2.f46406w;
                if (activity instanceof LaunchActivity) {
                    LaunchActivity launchActivity = (LaunchActivity) activity;
                    if (launchActivity.M() != null && launchActivity.M().getLastFragment() != null) {
                        launchActivity.M().getLastFragment().dismissCurrentDialog();
                    }
                    launchActivity.t0(new PremiumPreviewFragment(0, PremiumPreviewFragment.q0(5)));
                }
                isVar2.K = false;
                isVar2.f46409z.invalidate();
                isVar2.m();
                return;
            case 2:
                is isVar3 = this.f52081b;
                gs gsVar = isVar3.f46396l;
                if (gsVar != null) {
                    gsVar.J();
                }
                isVar3.o();
                return;
            default:
                is isVar4 = this.f52081b;
                gs gsVar2 = isVar4.f46396l;
                if (gsVar2 != null) {
                    gsVar2.r();
                }
                isVar4.o();
                return;
        }
    }
}
