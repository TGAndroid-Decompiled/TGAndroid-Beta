package org.telegram.ui;

import android.app.Activity;
import android.view.View;
public final class us implements View.OnClickListener {
    public final int f44522a;
    public final ft f44523b;

    public us(ft ftVar, int i10) {
        this.f44522a = i10;
        this.f44523b = ftVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f44522a) {
            case 0:
                ft ftVar = this.f44523b;
                ftVar.K = false;
                ftVar.f39469z.invalidate();
                ftVar.l();
                return;
            case 1:
                ft ftVar2 = this.f44523b;
                Activity activity = ftVar2.f39466w;
                if (activity instanceof LaunchActivity) {
                    LaunchActivity launchActivity = (LaunchActivity) activity;
                    if (launchActivity.O() != null && launchActivity.O().getLastFragment() != null) {
                        launchActivity.O().getLastFragment().dismissCurrentDialog();
                    }
                    launchActivity.u0(new PremiumPreviewFragment(0, PremiumPreviewFragment.m0(5)));
                }
                ftVar2.K = false;
                ftVar2.f39469z.invalidate();
                ftVar2.l();
                return;
            case 2:
                ft ftVar3 = this.f44523b;
                dt dtVar = ftVar3.f39456l;
                if (dtVar != null) {
                    dtVar.J();
                }
                ftVar3.n();
                return;
            default:
                ft ftVar4 = this.f44523b;
                dt dtVar2 = ftVar4.f39456l;
                if (dtVar2 != null) {
                    dtVar2.r();
                }
                ftVar4.n();
                return;
        }
    }
}
