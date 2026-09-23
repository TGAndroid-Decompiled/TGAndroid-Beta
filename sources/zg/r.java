package zg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.xn;
import w7.x5;
import yh.e2;
public final class r implements Runnable {
    public final int f49108a;
    public final t f49109b;

    public r(t tVar, int i10) {
        this.f49108a = i10;
        this.f49109b = tVar;
    }

    @Override
    public final void run() {
        boolean z10;
        int i10;
        int i11;
        switch (this.f49108a) {
            case 0:
                this.f49109b.c(true);
                return;
            default:
                t tVar = this.f49109b;
                tVar.e = tVar.b();
                int i12 = tVar.f49115f;
                int i13 = tVar.h;
                xn xnVar = tVar.f49112a;
                if (tVar.f49113b == null) {
                    if (xnVar.getUserConfig().getClientUserId() == xnVar.a()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        i10 = 3;
                    } else {
                        i10 = 0;
                    }
                    xn xnVar2 = tVar.f49112a;
                    ?? gk0Var = new gk0(i10, xnVar.getCurrentAccount(), tVar.getContext(), xnVar2, xnVar.getResourceProvider());
                    gk0Var.l1 = 1.0f;
                    gk0Var.setWillNotDraw(false);
                    tVar.f49113b = gk0Var;
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
                    gk0Var.setPadding(i14, dp2, dp3 + i13, AndroidUtilities.dp(i12));
                    tVar.f49113b.setDelegate(new e2(tVar));
                    tVar.f49113b.setClipChildren(false);
                    tVar.f49113b.setClipToPadding(false);
                    tVar.addView(tVar.f49113b, x5.e(-2, i12 + 70, 5));
                }
                tVar.c(false);
                if (tVar.f49113b.isEnabled()) {
                    tVar.f49120x = true;
                    tVar.f49113b.p(tVar.e, xnVar.Z7, true);
                    tVar.f49113b.r(false);
                    return;
                }
                tVar.f49120x = false;
                tVar.f49113b.setTransitionProgress(1.0f);
                return;
        }
    }
}
