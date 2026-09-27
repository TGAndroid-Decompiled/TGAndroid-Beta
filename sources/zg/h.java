package zg;

import ai.l2;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.Components.sr;
import xh.h1;
public final class h implements Runnable {
    public final int f49353a;
    public final r f49354b;

    public h(r rVar, int i10) {
        this.f49353a = i10;
        this.f49354b = rVar;
    }

    @Override
    public final void run() {
        int i10 = this.f49353a;
        r rVar = this.f49354b;
        switch (i10) {
            case 0:
                rVar.f49477n.requestFocus();
                return;
            case 1:
                rVar.finishFragment();
                return;
            case 2:
                if (!rVar.K) {
                    rVar.K = true;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                    int measuredHeight = rVar.f49475c.getMeasuredHeight();
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) rVar.f49482y.getLayoutParams();
                    marginLayoutParams.bottomMargin = measuredHeight;
                    rVar.f49482y.setLayoutParams(marginLayoutParams);
                    rVar.f49475c.setVisibility(0);
                    h1 h1Var = rVar.f49475c;
                    h1Var.setTranslationY(h1Var.getMeasuredHeight());
                    rVar.f49475c.animate().setListener(null).cancel();
                    rVar.f49475c.animate().translationY(0.0f).withLayer().setDuration(350L).setInterpolator(sr.f28359f).setUpdateListener(new j(rVar, 0)).setListener(new l2(2)).start();
                    return;
                }
                return;
            case 3:
                nf.f.s(rVar.getParentActivity(), "https://t.me/stickers");
                return;
            case 4:
                nf.f.s(rVar.getParentActivity(), LocaleController.getString(R.string.ChannelEnablePaidReactionsInfoLink));
                return;
            default:
                rVar.Y(false);
                return;
        }
    }
}
