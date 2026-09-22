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
import org.telegram.ui.Components.c90;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.au0;
import yh.u5;
public final class v implements Runnable {
    public final int f41667a;
    public final int f41668b;
    public final Object f41669c;

    public v(int i10, d5 d5Var) {
        this.f41667a = 3;
        this.f41668b = i10;
        this.f41669c = d5Var;
    }

    @Override
    public final void run() {
        int i10 = this.f41667a;
        boolean z10 = false;
        int i11 = this.f41668b;
        Object obj = this.f41669c;
        switch (i10) {
            case 0:
                au0 au0Var = (au0) obj;
                pg.q1 q1Var = au0Var.K1;
                au0Var.t0(q1Var, null);
                pg.s0.e(i11).j(q1Var.f40968c);
                return;
            case 1:
                p2 p2Var = (p2) obj;
                p2Var.getClass();
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.customStickerCreated, Boolean.FALSE);
                p2Var.h();
                return;
            case 2:
                c90 c90Var = ((tg.s0) obj).e;
                try {
                    if (c90Var.getLayout().getLineForOffset(i11) == 0) {
                        c90Var.getEditableText().insert(i11, "\n");
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
                ConnectionsManager.getInstance(((u5) obj).f47801a).cancelRequest(i11, true);
                return;
            default:
                zg.f fVar = (zg.f) obj;
                if (fVar.f49013b) {
                    Utilities.Callback callback = fVar.d;
                    if (callback != null) {
                        if (i11 < 300) {
                            z10 = true;
                        }
                        callback.run(Boolean.valueOf(z10));
                        try {
                            fVar.f49012a.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    fVar.f49014c = true;
                    int max = Math.max(50, i11 - 100);
                    AndroidUtilities.runOnUIThread(new v(fVar, max, 6), max);
                    return;
                }
                return;
        }
    }

    public v(Object obj, int i10, int i11) {
        this.f41667a = i11;
        this.f41669c = obj;
        this.f41668b = i10;
    }
}
