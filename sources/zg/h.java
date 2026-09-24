package zg;

import ai.l2;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.Components.rr;
import xh.h1;
public final class h implements Runnable {
    public final int f49299a;
    public final q f49300b;

    public h(q qVar, int i10) {
        this.f49299a = i10;
        this.f49300b = qVar;
    }

    @Override
    public final void run() {
        int i10 = this.f49299a;
        q qVar = this.f49300b;
        switch (i10) {
            case 0:
                qVar.f49418n.requestFocus();
                return;
            case 1:
                qVar.finishFragment();
                return;
            case 2:
                if (!qVar.K) {
                    qVar.K = true;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                    int measuredHeight = qVar.f49416c.getMeasuredHeight();
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) qVar.f49423y.getLayoutParams();
                    marginLayoutParams.bottomMargin = measuredHeight;
                    qVar.f49423y.setLayoutParams(marginLayoutParams);
                    qVar.f49416c.setVisibility(0);
                    h1 h1Var = qVar.f49416c;
                    h1Var.setTranslationY(h1Var.getMeasuredHeight());
                    qVar.f49416c.animate().setListener(null).cancel();
                    qVar.f49416c.animate().translationY(0.0f).withLayer().setDuration(350L).setInterpolator(rr.f28022f).setUpdateListener(new j(qVar, 0)).setListener(new l2(2)).start();
                    return;
                }
                return;
            case 3:
                nf.f.s(qVar.getParentActivity(), "https://t.me/stickers");
                return;
            case 4:
                nf.f.s(qVar.getParentActivity(), LocaleController.getString(R.string.ChannelEnablePaidReactionsInfoLink));
                return;
            default:
                qVar.Y(false);
                return;
        }
    }
}
