package org.telegram.ui;

import android.app.Activity;
import android.view.View;
public final class vs implements View.OnClickListener {
    public final int f42265a;
    public final gt f42266b;

    public vs(gt gtVar, int i10) {
        this.f42265a = i10;
        this.f42266b = gtVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f42265a) {
            case 0:
                gt gtVar = this.f42266b;
                gtVar.K = false;
                gtVar.f37316z.invalidate();
                gtVar.n();
                return;
            case 1:
                gt gtVar2 = this.f42266b;
                Activity activity = gtVar2.f37313w;
                if (activity instanceof LaunchActivity) {
                    LaunchActivity launchActivity = (LaunchActivity) activity;
                    if (launchActivity.O() != null && launchActivity.O().getLastFragment() != null) {
                        launchActivity.O().getLastFragment().dismissCurrentDialog();
                    }
                    launchActivity.t0(new PremiumPreviewFragment(0, PremiumPreviewFragment.l0(5)));
                }
                gtVar2.K = false;
                gtVar2.f37316z.invalidate();
                gtVar2.n();
                return;
            case 2:
                gt gtVar3 = this.f42266b;
                et etVar = gtVar3.f37303l;
                if (etVar != null) {
                    etVar.K();
                }
                gtVar3.p();
                return;
            default:
                gt gtVar4 = this.f42266b;
                et etVar2 = gtVar4.f37303l;
                if (etVar2 != null) {
                    etVar2.q();
                }
                gtVar4.p();
                return;
        }
    }
}
