package zg;

import ai.l2;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.Components.qr;
import xh.h1;
public final class h implements Runnable {
    public final int f49357a;
    public final q f49358b;

    public h(q qVar, int i10) {
        this.f49357a = i10;
        this.f49358b = qVar;
    }

    @Override
    public final void run() {
        int i10 = this.f49357a;
        q qVar = this.f49358b;
        switch (i10) {
            case 0:
                qVar.f49453n.requestFocus();
                return;
            case 1:
                qVar.finishFragment();
                return;
            case 2:
                if (!qVar.K) {
                    qVar.K = true;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                    int measuredHeight = qVar.f49451c.getMeasuredHeight();
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) qVar.f49458y.getLayoutParams();
                    marginLayoutParams.bottomMargin = measuredHeight;
                    qVar.f49458y.setLayoutParams(marginLayoutParams);
                    qVar.f49451c.setVisibility(0);
                    h1 h1Var = qVar.f49451c;
                    h1Var.setTranslationY(h1Var.getMeasuredHeight());
                    qVar.f49451c.animate().setListener(null).cancel();
                    qVar.f49451c.animate().translationY(0.0f).withLayer().setDuration(350L).setInterpolator(qr.f27653f).setUpdateListener(new i(qVar, 0)).setListener(new l2(2)).start();
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
