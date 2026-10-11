package zg;

import ai.m2;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.Components.is;
import rg.t0;
public final class h implements Runnable {
    public final int f54657a;
    public final q f54658b;

    public h(q qVar, int i10) {
        this.f54657a = i10;
        this.f54658b = qVar;
    }

    @Override
    public final void run() {
        int i10 = this.f54657a;
        q qVar = this.f54658b;
        switch (i10) {
            case 0:
                qVar.f54773n.requestFocus();
                return;
            case 1:
                qVar.finishFragment();
                return;
            case 2:
                if (!qVar.K) {
                    qVar.K = true;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                    int measuredHeight = qVar.f54770c.getMeasuredHeight();
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) qVar.f54778y.getLayoutParams();
                    marginLayoutParams.bottomMargin = measuredHeight;
                    qVar.f54778y.setLayoutParams(marginLayoutParams);
                    qVar.f54770c.setVisibility(0);
                    t0 t0Var = qVar.f54770c;
                    t0Var.setTranslationY(t0Var.getMeasuredHeight());
                    qVar.f54770c.animate().setListener(null).cancel();
                    qVar.f54770c.animate().translationY(0.0f).withLayer().setDuration(350L).setInterpolator(is.f27500f).setUpdateListener(new j(qVar, 0)).setListener(new m2(2)).start();
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
