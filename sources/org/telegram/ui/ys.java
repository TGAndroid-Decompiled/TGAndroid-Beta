package org.telegram.ui;

import android.app.Activity;
import android.view.View;

public final class ys implements View.OnClickListener {

    public final int f44891a;

    public final kt f44892b;

    public ys(kt ktVar, int i10) {
        this.f44891a = i10;
        this.f44892b = ktVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f44891a) {
            case 0:
                kt ktVar = this.f44892b;
                ktVar.K = false;
                ktVar.f39881z.invalidate();
                ktVar.n();
                break;
            case 1:
                kt ktVar2 = this.f44892b;
                Activity activity = ktVar2.f39878w;
                if (activity instanceof LaunchActivity) {
                    LaunchActivity launchActivity = (LaunchActivity) activity;
                    if (launchActivity.O() != null && launchActivity.O().getLastFragment() != null) {
                        launchActivity.O().getLastFragment().dismissCurrentDialog();
                    }
                    launchActivity.p0(new PremiumPreviewFragment(0, PremiumPreviewFragment.l0(5)));
                }
                ktVar2.K = false;
                ktVar2.f39881z.invalidate();
                ktVar2.n();
                break;
            case 2:
                kt ktVar3 = this.f44892b;
                ht htVar = ktVar3.f39868l;
                if (htVar != null) {
                    htVar.J();
                }
                ktVar3.p();
                break;
            default:
                kt ktVar4 = this.f44892b;
                ht htVar2 = ktVar4.f39868l;
                if (htVar2 != null) {
                    htVar2.q();
                }
                ktVar4.p();
                break;
        }
    }
}
