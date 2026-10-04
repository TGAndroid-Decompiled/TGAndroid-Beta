package zg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.yn;
import w7.z5;
public final class r implements Runnable {
    public final int f53520a;
    public final t f53521b;

    public r(t tVar, int i10) {
        this.f53520a = i10;
        this.f53521b = tVar;
    }

    @Override
    public final void run() {
        boolean z10;
        int i10;
        int i11;
        switch (this.f53520a) {
            case 0:
                this.f53521b.c(true);
                return;
            default:
                t tVar = this.f53521b;
                tVar.f53527e = tVar.b();
                int i12 = tVar.f53528f;
                int i13 = tVar.h;
                yn ynVar = tVar.f53524a;
                if (tVar.f53525b == null) {
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
                    yn ynVar2 = tVar.f53524a;
                    ?? sk0Var = new sk0(i10, ynVar.getCurrentAccount(), tVar.getContext(), ynVar2, ynVar.getResourceProvider());
                    sk0Var.l1 = 1.0f;
                    sk0Var.setWillNotDraw(false);
                    tVar.f53525b = sk0Var;
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
                    tVar.f53525b.setDelegate(new w9.k(tVar));
                    tVar.f53525b.setClipChildren(false);
                    tVar.f53525b.setClipToPadding(false);
                    tVar.addView(tVar.f53525b, z5.e(-2, i12 + 70, 5));
                }
                tVar.c(false);
                if (tVar.f53525b.isEnabled()) {
                    tVar.f53533x = true;
                    tVar.f53525b.p(tVar.f53527e, ynVar.X7, true);
                    tVar.f53525b.r(false);
                    return;
                }
                tVar.f53533x = false;
                tVar.f53525b.setTransitionProgress(1.0f);
                return;
        }
    }
}
