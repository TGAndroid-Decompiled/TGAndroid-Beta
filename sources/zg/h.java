package zg;

import ai.m2;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.Components.js;
public final class h implements Runnable {
    public final int f54760a;
    public final q f54761b;

    public h(q qVar, int i10) {
        this.f54760a = i10;
        this.f54761b = qVar;
    }

    @Override
    public final void run() {
        int i10 = this.f54760a;
        q qVar = this.f54761b;
        switch (i10) {
            case 0:
                qVar.f54876n.requestFocus();
                return;
            case 1:
                qVar.finishFragment();
                return;
            case 2:
                if (!qVar.K) {
                    qVar.K = true;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                    int measuredHeight = qVar.f54873c.getMeasuredHeight();
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) qVar.f54881y.getLayoutParams();
                    marginLayoutParams.bottomMargin = measuredHeight;
                    qVar.f54881y.setLayoutParams(marginLayoutParams);
                    qVar.f54873c.setVisibility(0);
                    rg.p0 p0Var = qVar.f54873c;
                    p0Var.setTranslationY(p0Var.getMeasuredHeight());
                    qVar.f54873c.animate().setListener(null).cancel();
                    qVar.f54873c.animate().translationY(0.0f).withLayer().setDuration(350L).setInterpolator(js.f27627f).setUpdateListener(new j(qVar, 0)).setListener(new m2(2)).start();
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
