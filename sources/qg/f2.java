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
import org.telegram.ui.Components.p90;
import org.telegram.ui.ProfileActivity;
import yh.s5;
public final class f2 implements Runnable {
    public final int f41672a;
    public final int f41673b;
    public final Object f41674c;

    public f2(int i10, d5 d5Var) {
        this.f41672a = 2;
        this.f41673b = i10;
        this.f41674c = d5Var;
    }

    @Override
    public final void run() {
        int i10 = this.f41672a;
        boolean z10 = false;
        int i11 = this.f41673b;
        Object obj = this.f41674c;
        switch (i10) {
            case 0:
                n2 n2Var = (n2) obj;
                n2Var.getClass();
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.customStickerCreated, Boolean.FALSE);
                n2Var.h();
                return;
            case 1:
                p90 p90Var = ((tg.r0) obj).e;
                try {
                    if (p90Var.getLayout().getLineForOffset(i11) == 0) {
                        p90Var.getEditableText().insert(i11, "\n");
                        return;
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 2:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", UserConfig.getInstance(i11).clientUserId);
                ((d5) obj).getLastFragment().presentFragment(new ProfileActivity(bundle, null));
                return;
            case 3:
                nf.f.s(((yh.g) obj).getParentActivity(), LocaleController.getString(i11));
                return;
            case 4:
                ConnectionsManager.getInstance(((s5) obj).f48056a).cancelRequest(i11, true);
                return;
            default:
                zg.f fVar = (zg.f) obj;
                if (fVar.f49336b) {
                    Utilities.Callback callback = fVar.d;
                    if (callback != null) {
                        if (i11 < 300) {
                            z10 = true;
                        }
                        callback.run(Boolean.valueOf(z10));
                        try {
                            fVar.f49335a.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    fVar.f49337c = true;
                    int max = Math.max(50, i11 - 100);
                    AndroidUtilities.runOnUIThread(new f2(fVar, max, 5), max);
                    return;
                }
                return;
        }
    }

    public f2(Object obj, int i10, int i11) {
        this.f41672a = i11;
        this.f41674c = obj;
        this.f41673b = i10;
    }
}
