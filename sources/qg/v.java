package qg;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.c5;
import org.telegram.ui.Components.d90;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.tt0;
import yh.t5;
public final class v implements Runnable {
    public final int f41623a;
    public final int f41624b;
    public final Object f41625c;

    public v(int i10, c5 c5Var) {
        this.f41623a = 3;
        this.f41624b = i10;
        this.f41625c = c5Var;
    }

    @Override
    public final void run() {
        int i10 = this.f41623a;
        boolean z10 = false;
        int i11 = this.f41624b;
        Object obj = this.f41625c;
        switch (i10) {
            case 0:
                tt0 tt0Var = (tt0) obj;
                pg.r1 r1Var = tt0Var.K1;
                tt0Var.t0(r1Var, null);
                pg.t0.e(i11).j(r1Var.f40929c);
                return;
            case 1:
                p2 p2Var = (p2) obj;
                p2Var.getClass();
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.customStickerCreated, Boolean.FALSE);
                p2Var.h();
                return;
            case 2:
                d90 d90Var = ((tg.s0) obj).e;
                try {
                    if (d90Var.getLayout().getLineForOffset(i11) == 0) {
                        d90Var.getEditableText().insert(i11, "\n");
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
                ((c5) obj).getLastFragment().presentFragment(new ProfileActivity(bundle, null));
                return;
            case 4:
                nf.f.s(((yh.g) obj).getParentActivity(), LocaleController.getString(i11));
                return;
            case 5:
                ConnectionsManager.getInstance(((t5) obj).f47732a).cancelRequest(i11, true);
                return;
            default:
                zg.f fVar = (zg.f) obj;
                if (fVar.f48964b) {
                    Utilities.Callback callback = fVar.d;
                    if (callback != null) {
                        if (i11 < 300) {
                            z10 = true;
                        }
                        callback.run(Boolean.valueOf(z10));
                        try {
                            fVar.f48963a.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    fVar.f48965c = true;
                    int max = Math.max(50, i11 - 100);
                    AndroidUtilities.runOnUIThread(new v(fVar, max, 6), max);
                    return;
                }
                return;
        }
    }

    public v(Object obj, int i10, int i11) {
        this.f41623a = i11;
        this.f41625c = obj;
        this.f41624b = i10;
    }
}
