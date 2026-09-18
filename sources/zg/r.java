package zg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.zn;
import w7.y5;
public final class r implements Runnable {
    public final int f49416a;
    public final t f49417b;

    public r(t tVar, int i10) {
        this.f49416a = i10;
        this.f49417b = tVar;
    }

    @Override
    public final void run() {
        boolean z10;
        int i10;
        int i11;
        switch (this.f49416a) {
            case 0:
                this.f49417b.c(true);
                return;
            default:
                t tVar = this.f49417b;
                tVar.e = tVar.b();
                int i12 = tVar.f49423f;
                int i13 = tVar.h;
                zn znVar = tVar.f49420a;
                if (tVar.f49421b == null) {
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
                    zn znVar2 = tVar.f49420a;
                    ?? qk0Var = new qk0(i10, znVar.getCurrentAccount(), tVar.getContext(), znVar2, znVar.getResourceProvider());
                    qk0Var.l1 = 1.0f;
                    qk0Var.setWillNotDraw(false);
                    tVar.f49421b = qk0Var;
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
                    qk0Var.setPadding(i14, dp2, dp3 + i13, AndroidUtilities.dp(i12));
                    tVar.f49421b.setDelegate(new n2.e(tVar, 28));
                    tVar.f49421b.setClipChildren(false);
                    tVar.f49421b.setClipToPadding(false);
                    tVar.addView(tVar.f49421b, y5.e(-2, i12 + 70, 5));
                }
                tVar.c(false);
                if (tVar.f49421b.isEnabled()) {
                    tVar.f49428x = true;
                    tVar.f49421b.p(tVar.e, znVar.Z7, true);
                    tVar.f49421b.r(false);
                    return;
                }
                tVar.f49428x = false;
                tVar.f49421b.setTransitionProgress(1.0f);
                return;
        }
    }
}
