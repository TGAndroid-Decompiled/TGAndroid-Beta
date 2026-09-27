package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class xo0 implements Utilities.Callback2 {
    public final int f40018a;
    public final TL_stars.TL_starGiftUnique f40019b;
    public final long f40020c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object e;
    public final Object f40021f;

    public xo0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, Object obj2, int i10) {
        this.f40018a = i10;
        this.d = notificationCenterDelegate;
        this.e = obj;
        this.f40019b = tL_starGiftUnique;
        this.f40020c = j3;
        this.f40021f = obj2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        boolean z10;
        switch (this.f40018a) {
            case 0:
                wp0.U((wp0) this.d, (boolean[]) this.e, this.f40019b, this.f40020c, (to0) this.f40021f, (yh.a3) obj, (nf.e) obj2);
                return;
            default:
                yh.x3 x3Var = (yh.x3) this.d;
                xh.j0 j0Var = (xh.j0) this.f40021f;
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
                        j2Var.b(this.f40019b, this.f40020c, z10);
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
