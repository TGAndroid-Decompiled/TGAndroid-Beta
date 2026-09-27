package zg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.xn;
import w7.y5;
public final class s implements Runnable {
    public final int f49483a;
    public final u f49484b;

    public s(u uVar, int i10) {
        this.f49483a = i10;
        this.f49484b = uVar;
    }

    @Override
    public final void run() {
        boolean z10;
        int i10;
        int i11;
        switch (this.f49483a) {
            case 0:
                this.f49484b.c(true);
                return;
            default:
                u uVar = this.f49484b;
                uVar.e = uVar.b();
                int i12 = uVar.f49490f;
                int i13 = uVar.h;
                xn xnVar = uVar.f49487a;
                if (uVar.f49488b == null) {
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
                    xn xnVar2 = uVar.f49487a;
                    ?? sk0Var = new sk0(i10, xnVar.getCurrentAccount(), uVar.getContext(), xnVar2, xnVar.getResourceProvider());
                    sk0Var.l1 = 1.0f;
                    sk0Var.setWillNotDraw(false);
                    uVar.f49488b = sk0Var;
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
                    uVar.f49488b.setDelegate(new o0.c(uVar, 25));
                    uVar.f49488b.setClipChildren(false);
                    uVar.f49488b.setClipToPadding(false);
                    uVar.addView(uVar.f49488b, y5.e(-2, i12 + 70, 5));
                }
                uVar.c(false);
                if (uVar.f49488b.isEnabled()) {
                    uVar.f49495x = true;
                    uVar.f49488b.p(uVar.e, xnVar.Z7, true);
                    uVar.f49488b.r(false);
                    return;
                }
                uVar.f49495x = false;
                uVar.f49488b.setTransitionProgress(1.0f);
                return;
        }
    }
}
