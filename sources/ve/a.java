package ve;

import android.animation.ValueAnimator;
import android.content.DialogInterface;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.Components.gr;
import org.telegram.ui.xs0;
import xf.q1;
import xf.s0;
import yf.f;
import yf.g;
import yf.j;
import yf.m2;
public final class a implements Runnable {
    public final int f48377a;
    public final int f48378b;
    public final Object f48379c;

    public a(Object obj, int i9, int i10) {
        this.f48377a = i10;
        this.f48379c = obj;
        this.f48378b = i9;
    }

    @Override
    public final void run() {
        int i9 = this.f48377a;
        final int i10 = this.f48378b;
        Object obj = this.f48379c;
        switch (i9) {
            case 0:
                c2[] c2VarArr = (c2[]) obj;
                c2 c2Var = c2VarArr[0];
                if (c2Var != null) {
                    try {
                        c2Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                            @Override
                            public final void onCancel(DialogInterface dialogInterface) {
                                ConnectionsManager.getInstance(UserConfig.selectedAccount).cancelRequest(i10, true);
                            }
                        });
                        c2VarArr[0].show();
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 1:
                ((vg.a) obj).v0(i10, 0, null);
                return;
            case 2:
                j jVar = (j) obj;
                jVar.H = i10;
                jVar.G = true;
                try {
                    jVar.performHapticFeedback(3, 2);
                } catch (Exception unused2) {
                }
                ValueAnimator valueAnimator = jVar.L;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimator2 = jVar.M;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                jVar.L = duration;
                duration.setInterpolator(gr.f28844f);
                jVar.L.addUpdateListener(new f(jVar, 5));
                jVar.L.addListener(new g(jVar, 2));
                jVar.L.start();
                return;
            case 3:
                xs0 xs0Var = (xs0) obj;
                q1 q1Var = xs0Var.G1;
                xs0Var.s0(q1Var, null);
                s0.e(i10).j(q1Var.f49335c);
                return;
            default:
                m2 m2Var = (m2) obj;
                m2Var.getClass();
                NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.customStickerCreated, Boolean.FALSE);
                m2Var.h();
                return;
        }
    }
}
