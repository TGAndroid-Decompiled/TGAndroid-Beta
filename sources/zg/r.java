package zg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.bo;
import w7.x5;
import yh.g2;
public final class r implements Runnable {
    public final int f49187a;
    public final t f49188b;

    public r(t tVar, int i10) {
        this.f49187a = i10;
        this.f49188b = tVar;
    }

    @Override
    public final void run() {
        boolean z10;
        int i10;
        int i11;
        switch (this.f49187a) {
            case 0:
                this.f49188b.c(true);
                return;
            default:
                t tVar = this.f49188b;
                tVar.e = tVar.b();
                int i12 = tVar.f49194f;
                int i13 = tVar.h;
                bo boVar = tVar.f49191a;
                if (tVar.f49192b == null) {
                    if (boVar.getUserConfig().getClientUserId() == boVar.a()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        i10 = 3;
                    } else {
                        i10 = 0;
                    }
                    bo boVar2 = tVar.f49191a;
                    ?? gk0Var = new gk0(i10, boVar.getCurrentAccount(), tVar.getContext(), boVar2, boVar.getResourceProvider());
                    gk0Var.l1 = 1.0f;
                    gk0Var.setWillNotDraw(false);
                    tVar.f49192b = gk0Var;
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
                    tVar.f49192b.setDelegate(new g2(tVar));
                    tVar.f49192b.setClipChildren(false);
                    tVar.f49192b.setClipToPadding(false);
                    tVar.addView(tVar.f49192b, x5.e(-2, i12 + 70, 5));
                }
                tVar.c(false);
                if (tVar.f49192b.isEnabled()) {
                    tVar.f49199x = true;
                    tVar.f49192b.p(tVar.e, boVar.Z7, true);
                    tVar.f49192b.r(false);
                    return;
                }
                tVar.f49199x = false;
                tVar.f49192b.setTransitionProgress(1.0f);
                return;
        }
    }
}
