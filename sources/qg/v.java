package qg;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.Components.q90;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.st0;
import yh.s5;
public final class v implements Runnable {
    public final int f42060a;
    public final int f42061b;
    public final Object f42062c;

    public v(int i10, b5 b5Var) {
        this.f42060a = 3;
        this.f42061b = i10;
        this.f42062c = b5Var;
    }

    @Override
    public final void run() {
        int i10 = this.f42060a;
        boolean z10 = false;
        int i11 = this.f42061b;
        Object obj = this.f42062c;
        switch (i10) {
            case 0:
                st0 st0Var = (st0) obj;
                pg.t1 t1Var = st0Var.K1;
                st0Var.s0(t1Var, null);
                pg.u0.e(i11).j(t1Var.f41366c);
                return;
            case 1:
                n2 n2Var = (n2) obj;
                n2Var.getClass();
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.customStickerCreated, Boolean.FALSE);
                n2Var.h();
                return;
            case 2:
                q90 q90Var = ((tg.r0) obj).e;
                try {
                    if (q90Var.getLayout().getLineForOffset(i11) == 0) {
                        q90Var.getEditableText().insert(i11, "\n");
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
                ((b5) obj).getLastFragment().presentFragment(new ProfileActivity(bundle, null));
                return;
            case 4:
                nf.f.s(((yh.g) obj).getParentActivity(), LocaleController.getString(i11));
                return;
            case 5:
                ConnectionsManager.getInstance(((s5) obj).f48119a).cancelRequest(i11, true);
                return;
            default:
                zg.f fVar = (zg.f) obj;
                if (fVar.f49404b) {
                    Utilities.Callback callback = fVar.d;
                    if (callback != null) {
                        if (i11 < 300) {
                            z10 = true;
                        }
                        callback.run(Boolean.valueOf(z10));
                        try {
                            fVar.f49403a.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    fVar.f49405c = true;
                    int max = Math.max(50, i11 - 100);
                    AndroidUtilities.runOnUIThread(new v(fVar, max, 6), max);
                    return;
                }
                return;
        }
    }

    public v(Object obj, int i10, int i11) {
        this.f42060a = i11;
        this.f42062c = obj;
        this.f42061b = i10;
    }
}
