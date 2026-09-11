package rg;

import android.animation.ValueAnimator;
import android.os.Bundle;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.d5;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.pr;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.zt0;
import zh.s5;
public final class f implements Runnable {
    public final int f45179a;
    public final int f45180b;
    public final Object f45181c;

    public f(int i10, d5 d5Var) {
        this.f45179a = 4;
        this.f45180b = i10;
        this.f45181c = d5Var;
    }

    @Override
    public final void run() {
        int i10 = this.f45179a;
        int i11 = this.f45180b;
        Object obj = this.f45181c;
        switch (i10) {
            case 0:
                k kVar = (k) obj;
                kVar.L = i11;
                kVar.K = true;
                try {
                    kVar.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                ValueAnimator valueAnimator = kVar.P;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimator2 = kVar.Q;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                kVar.P = duration;
                duration.setInterpolator(pr.f29466f);
                kVar.P.addUpdateListener(new g(kVar, 5));
                kVar.P.addListener(new h(kVar, 2));
                kVar.P.start();
                return;
            case 1:
                zt0 zt0Var = (zt0) obj;
                qg.q1 q1Var = zt0Var.K1;
                zt0Var.s0(q1Var, null);
                qg.s0.e(i11).j(q1Var.f44543c);
                return;
            case 2:
                o2 o2Var = (o2) obj;
                o2Var.getClass();
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.customStickerCreated, Boolean.FALSE);
                o2Var.h();
                return;
            case 3:
                d90 d90Var = ((ug.s0) obj).f47207e;
                try {
                    if (d90Var.getLayout().getLineForOffset(i11) == 0) {
                        d90Var.getEditableText().insert(i11, "\n");
                        return;
                    }
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 4:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", UserConfig.getInstance(i11).clientUserId);
                ((d5) obj).getLastFragment().presentFragment(new ProfileActivity(bundle, null));
                return;
            case 5:
                of.f.s(((zh.g) obj).getParentActivity(), LocaleController.getString(i11));
                return;
            default:
                ConnectionsManager.getInstance(((s5) obj).f52566a).cancelRequest(i11, true);
                return;
        }
    }

    public f(Object obj, int i10, int i11) {
        this.f45179a = i11;
        this.f45181c = obj;
        this.f45180b = i10;
    }
}
