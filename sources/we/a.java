package we;

import android.animation.ValueAnimator;
import android.content.DialogInterface;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.Components.er;
import org.telegram.ui.ys0;
import yf.p1;
import yf.r0;
import zf.f;
import zf.g;
import zf.j;
import zf.n2;

public final class a implements Runnable {

    public final int f49288a;

    public final int f49289b;

    public final Object f49290c;

    public a(Object obj, int i10, int i11) {
        this.f49288a = i11;
        this.f49290c = obj;
        this.f49289b = i10;
    }

    @Override
    public final void run() {
        int i10 = this.f49288a;
        final int i11 = this.f49289b;
        Object obj = this.f49290c;
        switch (i10) {
            case 0:
                b2[] b2VarArr = (b2[]) obj;
                b2 b2Var = b2VarArr[0];
                if (b2Var != null) {
                    try {
                        b2Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                            @Override
                            public final void onCancel(DialogInterface dialogInterface) {
                                ConnectionsManager.getInstance(UserConfig.selectedAccount).cancelRequest(i11, true);
                            }
                        });
                        b2VarArr[0].show();
                    } catch (Exception unused) {
                        return;
                    }
                    break;
                }
                break;
            case 1:
                ((wg.a) obj).v0(i11, 0, null);
                break;
            case 2:
                j jVar = (j) obj;
                jVar.H = i11;
                jVar.G = true;
                int i12 = 2;
                try {
                    jVar.performHapticFeedback(3, 2);
                    break;
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
                duration.setInterpolator(er.f28122f);
                jVar.L.addUpdateListener(new f(jVar, 5));
                jVar.L.addListener(new g(jVar, i12));
                jVar.L.start();
                break;
            case 3:
                ys0 ys0Var = (ys0) obj;
                p1 p1Var = ys0Var.G1;
                ys0Var.s0(p1Var, null);
                r0.e(i11).j(p1Var.f50036c);
                break;
            default:
                n2 n2Var = (n2) obj;
                n2Var.getClass();
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.customStickerCreated, Boolean.FALSE);
                n2Var.h();
                break;
        }
    }
}
