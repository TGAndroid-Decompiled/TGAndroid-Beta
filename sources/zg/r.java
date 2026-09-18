package zg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.bo;
import w7.x5;
import yh.g2;
public final class r implements Runnable {
    public final int f49192a;
    public final t f49193b;

    public r(t tVar, int i10) {
        this.f49192a = i10;
        this.f49193b = tVar;
    }

    @Override
    public final void run() {
        boolean z10;
        int i10;
        int i11;
        switch (this.f49192a) {
            case 0:
                this.f49193b.c(true);
                return;
            default:
                t tVar = this.f49193b;
                tVar.e = tVar.b();
                int i12 = tVar.f49199f;
                int i13 = tVar.h;
                bo boVar = tVar.f49196a;
                if (tVar.f49197b == null) {
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
                    bo boVar2 = tVar.f49196a;
                    ?? gk0Var = new gk0(i10, boVar.getCurrentAccount(), tVar.getContext(), boVar2, boVar.getResourceProvider());
                    gk0Var.l1 = 1.0f;
                    gk0Var.setWillNotDraw(false);
                    tVar.f49197b = gk0Var;
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
                    tVar.f49197b.setDelegate(new g2(tVar));
                    tVar.f49197b.setClipChildren(false);
                    tVar.f49197b.setClipToPadding(false);
                    tVar.addView(tVar.f49197b, x5.e(-2, i12 + 70, 5));
                }
                tVar.c(false);
                if (tVar.f49197b.isEnabled()) {
                    tVar.f49204x = true;
                    tVar.f49197b.p(tVar.e, boVar.Z7, true);
                    tVar.f49197b.r(false);
                    return;
                }
                tVar.f49204x = false;
                tVar.f49197b.setTransitionProgress(1.0f);
                return;
        }
    }
}
