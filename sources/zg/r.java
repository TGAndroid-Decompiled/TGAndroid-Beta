package zg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.yn;
import w7.z5;
public final class r implements Runnable {
    public final int f53521a;
    public final t f53522b;

    public r(t tVar, int i10) {
        this.f53521a = i10;
        this.f53522b = tVar;
    }

    @Override
    public final void run() {
        boolean z10;
        int i10;
        int i11;
        switch (this.f53521a) {
            case 0:
                this.f53522b.c(true);
                return;
            default:
                t tVar = this.f53522b;
                tVar.f53528e = tVar.b();
                int i12 = tVar.f53529f;
                int i13 = tVar.h;
                yn ynVar = tVar.f53525a;
                if (tVar.f53526b == null) {
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
                    yn ynVar2 = tVar.f53525a;
                    ?? sk0Var = new sk0(i10, ynVar.getCurrentAccount(), tVar.getContext(), ynVar2, ynVar.getResourceProvider());
                    sk0Var.l1 = 1.0f;
                    sk0Var.setWillNotDraw(false);
                    tVar.f53526b = sk0Var;
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
                    tVar.f53526b.setDelegate(new w9.k(tVar));
                    tVar.f53526b.setClipChildren(false);
                    tVar.f53526b.setClipToPadding(false);
                    tVar.addView(tVar.f53526b, z5.e(-2, i12 + 70, 5));
                }
                tVar.c(false);
                if (tVar.f53526b.isEnabled()) {
                    tVar.f53534x = true;
                    tVar.f53526b.p(tVar.f53528e, ynVar.X7, true);
                    tVar.f53526b.r(false);
                    return;
                }
                tVar.f53534x = false;
                tVar.f53526b.setTransitionProgress(1.0f);
                return;
        }
    }
}
