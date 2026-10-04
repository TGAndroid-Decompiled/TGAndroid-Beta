package zg;

import ai.l2;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.Components.tr;
import rg.j1;
public final class h implements Runnable {
    public final int f53388a;
    public final q f53389b;

    public h(q qVar, int i10) {
        this.f53388a = i10;
        this.f53389b = qVar;
    }

    @Override
    public final void run() {
        int i10 = this.f53388a;
        q qVar = this.f53389b;
        switch (i10) {
            case 0:
                qVar.f53514n.requestFocus();
                return;
            case 1:
                qVar.finishFragment();
                return;
            case 2:
                if (!qVar.K) {
                    qVar.K = true;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                    int measuredHeight = qVar.f53511c.getMeasuredHeight();
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) qVar.f53519y.getLayoutParams();
                    marginLayoutParams.bottomMargin = measuredHeight;
                    qVar.f53519y.setLayoutParams(marginLayoutParams);
                    qVar.f53511c.setVisibility(0);
                    j1 j1Var = qVar.f53511c;
                    j1Var.setTranslationY(j1Var.getMeasuredHeight());
                    qVar.f53511c.animate().setListener(null).cancel();
                    qVar.f53511c.animate().translationY(0.0f).withLayer().setDuration(350L).setInterpolator(tr.f31140f).setUpdateListener(new j(qVar, 0)).setListener(new l2(2)).start();
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
                qVar.X(false);
                return;
        }
    }
}
