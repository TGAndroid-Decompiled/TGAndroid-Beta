package org.telegram.ui;

import android.app.Activity;
import android.view.View;
public final class zs implements View.OnClickListener {
    public final int f44225a;
    public final lt f44226b;

    public zs(lt ltVar, int i10) {
        this.f44225a = i10;
        this.f44226b = ltVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f44225a) {
            case 0:
                lt ltVar = this.f44226b;
                ltVar.K = false;
                ltVar.f39409z.invalidate();
                ltVar.m();
                return;
            case 1:
                lt ltVar2 = this.f44226b;
                Activity activity = ltVar2.f39406w;
                if (activity instanceof LaunchActivity) {
                    LaunchActivity launchActivity = (LaunchActivity) activity;
                    if (launchActivity.M() != null && launchActivity.M().getLastFragment() != null) {
                        launchActivity.M().getLastFragment().dismissCurrentDialog();
                    }
                    launchActivity.t0(new PremiumPreviewFragment(0, PremiumPreviewFragment.p0(5)));
                }
                ltVar2.K = false;
                ltVar2.f39409z.invalidate();
                ltVar2.m();
                return;
            case 2:
                lt ltVar3 = this.f44226b;
                jt jtVar = ltVar3.f39396l;
                if (jtVar != null) {
                    jtVar.J();
                }
                ltVar3.o();
                return;
            default:
                lt ltVar4 = this.f44226b;
                jt jtVar2 = ltVar4.f39396l;
                if (jtVar2 != null) {
                    jtVar2.q();
                }
                ltVar4.o();
                return;
        }
    }
}
