package zg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.yn;
import w7.z5;
public final class r implements Runnable {
    public final int f53526a;
    public final t f53527b;

    public r(t tVar, int i10) {
        this.f53526a = i10;
        this.f53527b = tVar;
    }

    @Override
    public final void run() {
        boolean z10;
        int i10;
        int i11;
        switch (this.f53526a) {
            case 0:
                this.f53527b.c(true);
                return;
            default:
                t tVar = this.f53527b;
                tVar.f53533e = tVar.b();
                int i12 = tVar.f53534f;
                int i13 = tVar.h;
                yn ynVar = tVar.f53530a;
                if (tVar.f53531b == null) {
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
                    yn ynVar2 = tVar.f53530a;
                    ?? sk0Var = new sk0(i10, ynVar.getCurrentAccount(), tVar.getContext(), ynVar2, ynVar.getResourceProvider());
                    sk0Var.l1 = 1.0f;
                    sk0Var.setWillNotDraw(false);
                    tVar.f53531b = sk0Var;
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
                    tVar.f53531b.setDelegate(new w9.k(tVar));
                    tVar.f53531b.setClipChildren(false);
                    tVar.f53531b.setClipToPadding(false);
                    tVar.addView(tVar.f53531b, z5.e(-2, i12 + 70, 5));
                }
                tVar.c(false);
                if (tVar.f53531b.isEnabled()) {
                    tVar.f53539x = true;
                    tVar.f53531b.p(tVar.f53533e, ynVar.X7, true);
                    tVar.f53531b.r(false);
                    return;
                }
                tVar.f53539x = false;
                tVar.f53531b.setTransitionProgress(1.0f);
                return;
        }
    }
}
