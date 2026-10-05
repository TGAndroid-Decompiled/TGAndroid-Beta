package zg;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class h implements Runnable {
    public final int f53393a;
    public final o f53394b;

    public h(o oVar, int i10) {
        this.f53393a = i10;
        this.f53394b = oVar;
    }

    @Override
    public final void run() {
        int i10 = this.f53393a;
        o oVar = this.f53394b;
        switch (i10) {
            case 0:
                oVar.h.requestFocus();
                return;
            case 1:
                oVar.h.setFocusableInTouchMode(true);
                return;
            case 2:
                oVar.finishFragment();
                return;
            case 3:
                if (oVar.O && !oVar.N) {
                    oVar.N = true;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                    oVar.f53502c.setVisibility(0);
                    oVar.f53502c.setLayerType(2, null);
                    oVar.e0(oVar.P.f15436e);
                    oVar.P.a(true, true);
                    return;
                }
                return;
            case 4:
                nf.f.s(oVar.getParentActivity(), "https://t.me/stickers");
                return;
            case 5:
                nf.f.s(oVar.getParentActivity(), LocaleController.getString(R.string.ChannelEnablePaidReactionsInfoLink));
                return;
            default:
                oVar.Y(false);
                return;
        }
    }
}
