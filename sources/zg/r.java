package zg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.zn;
import w7.y5;
public final class r implements Runnable {
    public final int f49484a;
    public final u f49485b;

    public r(u uVar, int i10) {
        this.f49484a = i10;
        this.f49485b = uVar;
    }

    @Override
    public final void run() {
        boolean z10;
        int i10;
        int i11;
        switch (this.f49484a) {
            case 0:
                this.f49485b.c(true);
                return;
            default:
                u uVar = this.f49485b;
                uVar.e = uVar.b();
                int i12 = uVar.f49492f;
                int i13 = uVar.h;
                zn znVar = uVar.f49489a;
                if (uVar.f49490b == null) {
                    if (znVar.getUserConfig().getClientUserId() == znVar.a()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        i10 = 3;
                    } else {
                        i10 = 0;
                    }
                    zn znVar2 = uVar.f49489a;
                    ?? sk0Var = new sk0(i10, znVar.getCurrentAccount(), uVar.getContext(), znVar2, znVar.getResourceProvider());
                    sk0Var.l1 = 1.0f;
                    sk0Var.setWillNotDraw(false);
                    uVar.f49490b = sk0Var;
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
                    uVar.f49490b.setDelegate(new t(uVar));
                    uVar.f49490b.setClipChildren(false);
                    uVar.f49490b.setClipToPadding(false);
                    uVar.addView(uVar.f49490b, y5.e(-2, i12 + 70, 5));
                }
                uVar.c(false);
                if (uVar.f49490b.isEnabled()) {
                    uVar.f49497x = true;
                    uVar.f49490b.p(uVar.e, znVar.Z7, true);
                    uVar.f49490b.r(false);
                    return;
                }
                uVar.f49497x = false;
                uVar.f49490b.setTransitionProgress(1.0f);
                return;
        }
    }
}
