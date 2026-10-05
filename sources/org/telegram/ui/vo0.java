package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class vo0 implements Utilities.Callback2 {
    public final int f41788a;
    public final TL_stars.TL_starGiftUnique f41789b;
    public final long f41790c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object f41791e;
    public final Object f41792f;

    public vo0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, Object obj2, int i10) {
        this.f41788a = i10;
        this.d = notificationCenterDelegate;
        this.f41791e = obj;
        this.f41789b = tL_starGiftUnique;
        this.f41790c = j3;
        this.f41792f = obj2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        boolean z10;
        switch (this.f41788a) {
            case 0:
                wp0.S((wp0) this.d, (boolean[]) this.f41791e, this.f41789b, this.f41790c, (to0) this.f41792f, (yh.b3) obj, (nf.e) obj2);
                return;
            default:
                yh.y3 y3Var = (yh.y3) this.d;
                xh.j0 j0Var = (xh.j0) this.f41792f;
                String str = (String) obj2;
                ((nf.e) this.f41791e).b();
                if (((Boolean) obj).booleanValue()) {
                    yh.k2 k2Var = y3Var.O0;
                    if (k2Var != null) {
                        if (j0Var != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        k2Var.b(this.f41789b, this.f41790c, z10);
                    }
                    if (j0Var != null) {
                        AndroidUtilities.runOnUIThread(new xh.d0(j0Var, 2));
                        y3Var.skipDismissAnimation();
                    }
                    y3Var.dismiss();
                    return;
                }
                return;
        }
    }
}
