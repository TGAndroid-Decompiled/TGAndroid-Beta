package qg;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.d5;
import org.telegram.ui.Components.n90;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.au0;
import yh.u5;
public final class v implements Runnable {
    public final int f41992a;
    public final int f41993b;
    public final Object f41994c;

    public v(int i10, d5 d5Var) {
        this.f41992a = 3;
        this.f41993b = i10;
        this.f41994c = d5Var;
    }

    @Override
    public final void run() {
        int i10 = this.f41992a;
        boolean z10 = false;
        int i11 = this.f41993b;
        Object obj = this.f41994c;
        switch (i10) {
            case 0:
                au0 au0Var = (au0) obj;
                pg.t1 t1Var = au0Var.K1;
                au0Var.s0(t1Var, null);
                pg.u0.e(i11).j(t1Var.f41316c);
                return;
            case 1:
                n2 n2Var = (n2) obj;
                n2Var.getClass();
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.customStickerCreated, Boolean.FALSE);
                n2Var.h();
                return;
            case 2:
                n90 n90Var = ((tg.r0) obj).e;
                try {
                    if (n90Var.getLayout().getLineForOffset(i11) == 0) {
                        n90Var.getEditableText().insert(i11, "\n");
                        return;
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 3:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", UserConfig.getInstance(i11).clientUserId);
                ((d5) obj).getLastFragment().presentFragment(new ProfileActivity(bundle, null));
                return;
            case 4:
                nf.f.s(((yh.g) obj).getParentActivity(), LocaleController.getString(i11));
                return;
            case 5:
                ConnectionsManager.getInstance(((u5) obj).f48132a).cancelRequest(i11, true);
                return;
            default:
                zg.f fVar = (zg.f) obj;
                if (fVar.f49340b) {
                    Utilities.Callback callback = fVar.d;
                    if (callback != null) {
                        if (i11 < 300) {
                            z10 = true;
                        }
                        callback.run(Boolean.valueOf(z10));
                        try {
                            fVar.f49339a.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    fVar.f49341c = true;
                    int max = Math.max(50, i11 - 100);
                    AndroidUtilities.runOnUIThread(new v(fVar, max, 6), max);
                    return;
                }
                return;
        }
    }

    public v(Object obj, int i10, int i11) {
        this.f41992a = i11;
        this.f41994c = obj;
        this.f41993b = i10;
    }
}
