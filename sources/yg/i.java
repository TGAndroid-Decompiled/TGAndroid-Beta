package yg;

import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.Components.f10;
import org.telegram.ui.Components.wr;
import xh.a7;
public final class i implements Runnable {
    public final int f47015a;
    public final s f47016b;

    public i(s sVar, int i10) {
        this.f47015a = i10;
        this.f47016b = sVar;
    }

    @Override
    public final void run() {
        int i10 = this.f47015a;
        s sVar = this.f47016b;
        switch (i10) {
            case 0:
                sVar.f47137n.requestFocus();
                return;
            case 1:
                sVar.finishFragment();
                return;
            case 2:
                if (!sVar.K) {
                    sVar.K = true;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                    int measuredHeight = sVar.f47135c.getMeasuredHeight();
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) sVar.f47142y.getLayoutParams();
                    marginLayoutParams.bottomMargin = measuredHeight;
                    sVar.f47142y.setLayoutParams(marginLayoutParams);
                    sVar.f47135c.setVisibility(0);
                    a7 a7Var = sVar.f47135c;
                    a7Var.setTranslationY(a7Var.getMeasuredHeight());
                    sVar.f47135c.animate().setListener(null).cancel();
                    sVar.f47135c.animate().translationY(0.0f).withLayer().setDuration(350L).setInterpolator(wr.f28819f).setUpdateListener(new j(sVar, 0)).setListener(new f10(1)).start();
                    return;
                }
                return;
            case 3:
                nf.f.s(sVar.getParentActivity(), "https://t.me/stickers");
                return;
            case 4:
                nf.f.s(sVar.getParentActivity(), LocaleController.getString(R.string.ChannelEnablePaidReactionsInfoLink));
                return;
            default:
                sVar.Y(false);
                return;
        }
    }
}
