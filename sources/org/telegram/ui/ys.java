package org.telegram.ui;

import android.app.Activity;
import android.view.View;
public final class ys implements View.OnClickListener {
    public final int f43719a;
    public final kt f43720b;

    public ys(kt ktVar, int i10) {
        this.f43719a = i10;
        this.f43720b = ktVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f43719a) {
            case 0:
                kt ktVar = this.f43720b;
                ktVar.K = false;
                ktVar.f38999z.invalidate();
                ktVar.m();
                return;
            case 1:
                kt ktVar2 = this.f43720b;
                Activity activity = ktVar2.f38996w;
                if (activity instanceof LaunchActivity) {
                    LaunchActivity launchActivity = (LaunchActivity) activity;
                    if (launchActivity.M() != null && launchActivity.M().getLastFragment() != null) {
                        launchActivity.M().getLastFragment().dismissCurrentDialog();
                    }
                    launchActivity.t0(new PremiumPreviewFragment(0, PremiumPreviewFragment.q0(5)));
                }
                ktVar2.K = false;
                ktVar2.f38999z.invalidate();
                ktVar2.m();
                return;
            case 2:
                kt ktVar3 = this.f43720b;
                ht htVar = ktVar3.f38986l;
                if (htVar != null) {
                    htVar.J();
                }
                ktVar3.o();
                return;
            default:
                kt ktVar4 = this.f43720b;
                ht htVar2 = ktVar4.f38986l;
                if (htVar2 != null) {
                    htVar2.q();
                }
                ktVar4.o();
                return;
        }
    }
}
