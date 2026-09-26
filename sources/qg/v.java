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
import org.telegram.ui.Components.o90;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.st0;
import yh.s5;
public final class v implements Runnable {
    public final int f41956a;
    public final int f41957b;
    public final Object f41958c;

    public v(int i10, b5 b5Var) {
        this.f41956a = 3;
        this.f41957b = i10;
        this.f41958c = b5Var;
    }

    @Override
    public final void run() {
        int i10 = this.f41956a;
        boolean z10 = false;
        int i11 = this.f41957b;
        Object obj = this.f41958c;
        switch (i10) {
            case 0:
                st0 st0Var = (st0) obj;
                pg.t1 t1Var = st0Var.K1;
                st0Var.t0(t1Var, null);
                pg.u0.e(i11).j(t1Var.f41266c);
                return;
            case 1:
                n2 n2Var = (n2) obj;
                n2Var.getClass();
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.customStickerCreated, Boolean.FALSE);
                n2Var.h();
                return;
            case 2:
                o90 o90Var = ((tg.r0) obj).e;
                try {
                    if (o90Var.getLayout().getLineForOffset(i11) == 0) {
                        o90Var.getEditableText().insert(i11, "\n");
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
                ConnectionsManager.getInstance(((s5) obj).f48010a).cancelRequest(i11, true);
                return;
            default:
                zg.f fVar = (zg.f) obj;
                if (fVar.f49295b) {
                    Utilities.Callback callback = fVar.d;
                    if (callback != null) {
                        if (i11 < 300) {
                            z10 = true;
                        }
                        callback.run(Boolean.valueOf(z10));
                        try {
                            fVar.f49294a.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    fVar.f49296c = true;
                    int max = Math.max(50, i11 - 100);
                    AndroidUtilities.runOnUIThread(new v(fVar, max, 6), max);
                    return;
                }
                return;
        }
    }

    public v(Object obj, int i10, int i11) {
        this.f41956a = i11;
        this.f41958c = obj;
        this.f41957b = i10;
    }
}
