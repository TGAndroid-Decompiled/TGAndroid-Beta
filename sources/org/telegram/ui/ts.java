package org.telegram.ui;

import android.app.Activity;
import android.view.View;
public final class ts implements View.OnClickListener {
    public final int f41742a;
    public final et f41743b;

    public ts(et etVar, int i10) {
        this.f41742a = i10;
        this.f41743b = etVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f41742a) {
            case 0:
                et etVar = this.f41743b;
                etVar.K = false;
                etVar.f36800z.invalidate();
                etVar.n();
                return;
            case 1:
                et etVar2 = this.f41743b;
                Activity activity = etVar2.f36797w;
                if (activity instanceof LaunchActivity) {
                    LaunchActivity launchActivity = (LaunchActivity) activity;
                    if (launchActivity.O() != null && launchActivity.O().getLastFragment() != null) {
                        launchActivity.O().getLastFragment().dismissCurrentDialog();
                    }
                    launchActivity.t0(new PremiumPreviewFragment(0, PremiumPreviewFragment.l0(5)));
                }
                etVar2.K = false;
                etVar2.f36800z.invalidate();
                etVar2.n();
                return;
            case 2:
                et etVar3 = this.f41743b;
                ct ctVar = etVar3.f36787l;
                if (ctVar != null) {
                    ctVar.K();
                }
                etVar3.p();
                return;
            default:
                et etVar4 = this.f41743b;
                ct ctVar2 = etVar4.f36787l;
                if (ctVar2 != null) {
                    ctVar2.q();
                }
                etVar4.p();
                return;
        }
    }
}
