package zg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.yn;
import w7.z5;
public final class p implements Runnable {
    public final int f53511a;
    public final r f53512b;

    public p(r rVar, int i10) {
        this.f53511a = i10;
        this.f53512b = rVar;
    }

    @Override
    public final void run() {
        boolean z10;
        int i10;
        int i11;
        switch (this.f53511a) {
            case 0:
                this.f53512b.c(true);
                return;
            default:
                r rVar = this.f53512b;
                rVar.f53518e = rVar.b();
                int i12 = rVar.f53519f;
                int i13 = rVar.h;
                yn ynVar = rVar.f53515a;
                if (rVar.f53516b == null) {
                    if (ynVar.getUserConfig().getClientUserId() == ynVar.a()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        i10 = 3;
                    } else {
                        i10 = 0;
                    }
                    yn ynVar2 = rVar.f53515a;
                    ?? sk0Var = new sk0(i10, ynVar.getCurrentAccount(), rVar.getContext(), ynVar2, ynVar.getResourceProvider());
                    sk0Var.l1 = 1.0f;
                    sk0Var.setWillNotDraw(false);
                    rVar.f53516b = sk0Var;
                    int dp = AndroidUtilities.dp(4.0f);
                    if (LocaleController.isRTL) {
                        i11 = 0;
                    } else {
                        i11 = i13;
                    }
                    int i14 = dp + i11;
                    int dp2 = AndroidUtilities.dp(4.0f);
                    int dp3 = AndroidUtilities.dp(4.0f);
                    if (!LocaleController.isRTL) {
                        i13 = 0;
                    }
                    sk0Var.setPadding(i14, dp2, dp3 + i13, AndroidUtilities.dp(i12));
                    rVar.f53516b.setDelegate(new l2.g(rVar, 25));
                    rVar.f53516b.setClipChildren(false);
                    rVar.f53516b.setClipToPadding(false);
                    rVar.addView(rVar.f53516b, z5.e(-2, i12 + 70, 5));
                }
                rVar.c(false);
                if (rVar.f53516b.isEnabled()) {
                    rVar.f53524x = true;
                    rVar.f53516b.p(rVar.f53518e, ynVar.X7, true);
                    rVar.f53516b.r(false);
                    return;
                }
                rVar.f53524x = false;
                rVar.f53516b.setTransitionProgress(1.0f);
                return;
        }
    }
}
