package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class vo0 implements Utilities.Callback2 {
    public final int f41783a;
    public final TL_stars.TL_starGiftUnique f41784b;
    public final long f41785c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object f41786e;
    public final Object f41787f;

    public vo0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, Object obj2, int i10) {
        this.f41783a = i10;
        this.d = notificationCenterDelegate;
        this.f41786e = obj;
        this.f41784b = tL_starGiftUnique;
        this.f41785c = j3;
        this.f41787f = obj2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        boolean z10;
        switch (this.f41783a) {
            case 0:
                wp0.S((wp0) this.d, (boolean[]) this.f41786e, this.f41784b, this.f41785c, (to0) this.f41787f, (yh.a3) obj, (nf.e) obj2);
                return;
            default:
                yh.x3 x3Var = (yh.x3) this.d;
                xh.j0 j0Var = (xh.j0) this.f41787f;
                String str = (String) obj2;
                ((nf.e) this.f41786e).b();
                if (((Boolean) obj).booleanValue()) {
                    yh.j2 j2Var = x3Var.O0;
                    if (j2Var != null) {
                        if (j0Var != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        j2Var.b(this.f41784b, this.f41785c, z10);
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
