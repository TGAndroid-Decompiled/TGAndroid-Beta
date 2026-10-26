package org.telegram.ui;

import android.app.Activity;
import android.view.View;
public final class us implements View.OnClickListener {
    public final int f44525a;
    public final ft f44526b;

    public us(ft ftVar, int i10) {
        this.f44525a = i10;
        this.f44526b = ftVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f44525a) {
            case 0:
                ft ftVar = this.f44526b;
                ftVar.K = false;
                ftVar.f39472z.invalidate();
                ftVar.l();
                return;
            case 1:
                ft ftVar2 = this.f44526b;
                Activity activity = ftVar2.f39469w;
                if (activity instanceof LaunchActivity) {
                    LaunchActivity launchActivity = (LaunchActivity) activity;
                    if (launchActivity.O() != null && launchActivity.O().getLastFragment() != null) {
                        launchActivity.O().getLastFragment().dismissCurrentDialog();
                    }
                    launchActivity.u0(new PremiumPreviewFragment(0, PremiumPreviewFragment.m0(5)));
                }
                ftVar2.K = false;
                ftVar2.f39472z.invalidate();
                ftVar2.l();
                return;
            case 2:
                ft ftVar3 = this.f44526b;
                dt dtVar = ftVar3.f39459l;
                if (dtVar != null) {
                    dtVar.J();
                }
                ftVar3.n();
                return;
            default:
                ft ftVar4 = this.f44526b;
                dt dtVar2 = ftVar4.f39459l;
                if (dtVar2 != null) {
                    dtVar2.r();
                }
                ftVar4.n();
                return;
        }
    }
}
