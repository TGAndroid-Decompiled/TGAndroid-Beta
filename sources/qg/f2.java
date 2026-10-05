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
import org.telegram.ui.Components.q90;
import org.telegram.ui.ProfileActivity;
import yh.u5;
public final class f2 implements Runnable {
    public final int f45038a;
    public final int f45039b;
    public final Object f45040c;

    public f2(int i10, c5 c5Var) {
        this.f45038a = 2;
        this.f45039b = i10;
        this.f45040c = c5Var;
    }

    @Override
    public final void run() {
        int i10 = this.f45038a;
        boolean z10 = false;
        int i11 = this.f45039b;
        Object obj = this.f45040c;
        switch (i10) {
            case 0:
                n2 n2Var = (n2) obj;
                n2Var.getClass();
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.customStickerCreated, Boolean.FALSE);
                n2Var.h();
                return;
            case 1:
                q90 q90Var = ((tg.r0) obj).f47106e;
                try {
                    if (q90Var.getLayout().getLineForOffset(i11) == 0) {
                        q90Var.getEditableText().insert(i11, "\n");
                        return;
                    }
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 2:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", UserConfig.getInstance(i11).clientUserId);
                ((c5) obj).getLastFragment().presentFragment(new ProfileActivity(bundle, null));
                return;
            case 3:
                nf.f.s(((yh.h) obj).getParentActivity(), LocaleController.getString(i11));
                return;
            case 4:
                ConnectionsManager.getInstance(((u5) obj).f52085a).cancelRequest(i11, true);
                return;
            default:
                zg.f fVar = (zg.f) obj;
                if (fVar.f53379b) {
                    Utilities.Callback callback = fVar.d;
                    if (callback != null) {
                        if (i11 < 300) {
                            z10 = true;
                        }
                        callback.run(Boolean.valueOf(z10));
                        try {
                            fVar.f53378a.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    fVar.f53380c = true;
                    int max = Math.max(50, i11 - 100);
                    AndroidUtilities.runOnUIThread(new f2(fVar, max, 5), max);
                    return;
                }
                return;
        }
    }

    public f2(Object obj, int i10, int i11) {
        this.f45038a = i11;
        this.f45040c = obj;
        this.f45039b = i10;
    }
}
