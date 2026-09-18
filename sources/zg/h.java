package zg;

import ai.l2;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.Components.qr;
import xh.h1;
public final class h implements Runnable {
    public final int f49291a;
    public final q f49292b;

    public h(q qVar, int i10) {
        this.f49291a = i10;
        this.f49292b = qVar;
    }

    @Override
    public final void run() {
        int i10 = this.f49291a;
        q qVar = this.f49292b;
        switch (i10) {
            case 0:
                qVar.f49410n.requestFocus();
                return;
            case 1:
                qVar.finishFragment();
                return;
            case 2:
                if (!qVar.K) {
                    qVar.K = true;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                    int measuredHeight = qVar.f49408c.getMeasuredHeight();
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) qVar.f49415y.getLayoutParams();
                    marginLayoutParams.bottomMargin = measuredHeight;
                    qVar.f49415y.setLayoutParams(marginLayoutParams);
                    qVar.f49408c.setVisibility(0);
                    h1 h1Var = qVar.f49408c;
                    h1Var.setTranslationY(h1Var.getMeasuredHeight());
                    qVar.f49408c.animate().setListener(null).cancel();
                    qVar.f49408c.animate().translationY(0.0f).withLayer().setDuration(350L).setInterpolator(qr.f27715f).setUpdateListener(new i(qVar, 0)).setListener(new l2(2)).start();
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
