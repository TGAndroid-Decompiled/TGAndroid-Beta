package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class uo0 implements Utilities.Callback2 {
    public final int f38497a;
    public final TL_stars.TL_starGiftUnique f38498b;
    public final long f38499c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object e;
    public final Object f38500f;

    public uo0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, Object obj2, int i10) {
        this.f38497a = i10;
        this.d = notificationCenterDelegate;
        this.e = obj;
        this.f38498b = tL_starGiftUnique;
        this.f38499c = j3;
        this.f38500f = obj2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        boolean z10;
        switch (this.f38497a) {
            case 0:
                tp0.U((tp0) this.d, (boolean[]) this.e, this.f38498b, this.f38499c, (qo0) this.f38500f, (yh.a3) obj, (nf.e) obj2);
                return;
            default:
                yh.x3 x3Var = (yh.x3) this.d;
                xh.j0 j0Var = (xh.j0) this.f38500f;
                String str = (String) obj2;
                ((nf.e) this.e).b();
                if (((Boolean) obj).booleanValue()) {
                    yh.j2 j2Var = x3Var.O0;
                    if (j2Var != null) {
                        if (j0Var != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        j2Var.b(this.f38498b, this.f38499c, z10);
                    }
                    if (j0Var != null) {
                        AndroidUtilities.runOnUIThread(new xh.d0(j0Var, 2));
                        x3Var.skipDismissAnimation();
                    }
                    x3Var.dismiss();
                    return;
                }
                return;
        }
    }
}
