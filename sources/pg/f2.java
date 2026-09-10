package pg;

import android.os.Bundle;
import bi.q3;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.f5;
import org.telegram.ui.Components.m90;
import org.telegram.ui.ProfileActivity;
import xh.v5;
import zh.i5;
public final class f2 implements Runnable {
    public final int f40000a;
    public final int f40001b;
    public final Object f40002c;

    public f2(int i10, f5 f5Var) {
        this.f40000a = 2;
        this.f40001b = i10;
        this.f40002c = f5Var;
    }

    @Override
    public final void run() {
        int i10 = this.f40000a;
        boolean z10 = false;
        int i11 = this.f40001b;
        Object obj = this.f40002c;
        switch (i10) {
            case 0:
                n2 n2Var = (n2) obj;
                n2Var.getClass();
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.customStickerCreated, Boolean.FALSE);
                n2Var.h();
                return;
            case 1:
                m90 m90Var = ((sg.t0) obj).e;
                try {
                    if (m90Var.getLayout().getLineForOffset(i11) == 0) {
                        m90Var.getEditableText().insert(i11, "\n");
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
                ((f5) obj).getLastFragment().presentFragment(new ProfileActivity(bundle, null));
                return;
            case 3:
                nf.f.s(((xh.h) obj).getParentActivity(), LocaleController.getString(i11));
                return;
            case 4:
                ConnectionsManager.getInstance(((v5) obj).f46176a).cancelRequest(i11, true);
                return;
            case 5:
                yg.g gVar = (yg.g) obj;
                if (gVar.f47001b) {
                    Utilities.Callback callback = gVar.d;
                    if (callback != null) {
                        if (i11 < 300) {
                            z10 = true;
                        }
                        callback.run(Boolean.valueOf(z10));
                        try {
                            gVar.f47000a.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    gVar.f47002c = true;
                    int max = Math.max(50, i11 - 100);
                    AndroidUtilities.runOnUIThread(new f2(gVar, max, 5), max);
                    return;
                }
                return;
            default:
                i5 i5Var = (i5) obj;
                ArrayList arrayList = i5Var.f48503g;
                i5Var.v(arrayList);
                q3 q3Var = i5Var.J;
                Collections.sort(arrayList, q3Var);
                ArrayList arrayList2 = i5Var.h;
                i5Var.v(arrayList2);
                Collections.sort(arrayList2, q3Var);
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                return;
        }
    }

    public f2(Object obj, int i10, int i11) {
        this.f40000a = i11;
        this.f40002c = obj;
        this.f40001b = i10;
    }
}
