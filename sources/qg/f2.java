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
import yh.t5;
public final class f2 implements Runnable {
    public final int f45024a;
    public final int f45025b;
    public final Object f45026c;

    public f2(int i10, c5 c5Var) {
        this.f45024a = 2;
        this.f45025b = i10;
        this.f45026c = c5Var;
    }

    @Override
    public final void run() {
        int i10 = this.f45024a;
        boolean z10 = false;
        int i11 = this.f45025b;
        Object obj = this.f45026c;
        switch (i10) {
            case 0:
                n2 n2Var = (n2) obj;
                n2Var.getClass();
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.customStickerCreated, Boolean.FALSE);
                n2Var.h();
                return;
            case 1:
                q90 q90Var = ((tg.r0) obj).f47091e;
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
                nf.f.s(((yh.g) obj).getParentActivity(), LocaleController.getString(i11));
                return;
            case 4:
                ConnectionsManager.getInstance(((t5) obj).f52011a).cancelRequest(i11, true);
                return;
            default:
                zg.f fVar = (zg.f) obj;
                if (fVar.f53374b) {
                    Utilities.Callback callback = fVar.d;
                    if (callback != null) {
                        if (i11 < 300) {
                            z10 = true;
                        }
                        callback.run(Boolean.valueOf(z10));
                        try {
                            fVar.f53373a.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    fVar.f53375c = true;
                    int max = Math.max(50, i11 - 100);
                    AndroidUtilities.runOnUIThread(new f2(fVar, max, 5), max);
                    return;
                }
                return;
        }
    }

    public f2(Object obj, int i10, int i11) {
        this.f45024a = i11;
        this.f45026c = obj;
        this.f45025b = i10;
    }
}
