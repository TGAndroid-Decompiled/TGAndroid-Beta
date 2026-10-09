package zg;

import ai.m2;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.Components.hs;
import rg.t0;
public final class h implements Runnable {
    public final int f54534a;
    public final q f54535b;

    public h(q qVar, int i10) {
        this.f54534a = i10;
        this.f54535b = qVar;
    }

    @Override
    public final void run() {
        int i10 = this.f54534a;
        q qVar = this.f54535b;
        switch (i10) {
            case 0:
                qVar.f54650n.requestFocus();
                return;
            case 1:
                qVar.finishFragment();
                return;
            case 2:
                if (!qVar.K) {
                    qVar.K = true;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                    int measuredHeight = qVar.f54647c.getMeasuredHeight();
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) qVar.f54655y.getLayoutParams();
                    marginLayoutParams.bottomMargin = measuredHeight;
                    qVar.f54655y.setLayoutParams(marginLayoutParams);
                    qVar.f54647c.setVisibility(0);
                    t0 t0Var = qVar.f54647c;
                    t0Var.setTranslationY(t0Var.getMeasuredHeight());
                    qVar.f54647c.animate().setListener(null).cancel();
                    qVar.f54647c.animate().translationY(0.0f).withLayer().setDuration(350L).setInterpolator(hs.f27118f).setUpdateListener(new j(qVar, 0)).setListener(new m2(2)).start();
                    return;
                }
                return;
            case 3:
                of.f.s(qVar.getParentActivity(), "https://t.me/stickers");
                return;
            case 4:
                of.f.s(qVar.getParentActivity(), LocaleController.getString(R.string.ChannelEnablePaidReactionsInfoLink));
                return;
            default:
                qVar.Y(false);
                return;
        }
    }
}
