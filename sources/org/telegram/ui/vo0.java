package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class vo0 implements Utilities.Callback2 {
    public final int f41790a;
    public final TL_stars.TL_starGiftUnique f41791b;
    public final long f41792c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object f41793e;
    public final Object f41794f;

    public vo0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, Object obj2, int i10) {
        this.f41790a = i10;
        this.d = notificationCenterDelegate;
        this.f41793e = obj;
        this.f41791b = tL_starGiftUnique;
        this.f41792c = j3;
        this.f41794f = obj2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        boolean z10;
        switch (this.f41790a) {
            case 0:
                wp0.S((wp0) this.d, (boolean[]) this.f41793e, this.f41791b, this.f41792c, (to0) this.f41794f, (yh.a3) obj, (nf.e) obj2);
                return;
            default:
                yh.x3 x3Var = (yh.x3) this.d;
                xh.j0 j0Var = (xh.j0) this.f41794f;
                String str = (String) obj2;
                ((nf.e) this.f41793e).b();
                if (((Boolean) obj).booleanValue()) {
                    yh.j2 j2Var = x3Var.O0;
                    if (j2Var != null) {
                        if (j0Var != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        j2Var.b(this.f41791b, this.f41792c, z10);
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
