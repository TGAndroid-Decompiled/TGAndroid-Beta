package zg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.wn;
import w7.y5;
public final class r implements Runnable {
    public final int f49435a;
    public final t f49436b;

    public r(t tVar, int i10) {
        this.f49435a = i10;
        this.f49436b = tVar;
    }

    @Override
    public final void run() {
        boolean z10;
        int i10;
        int i11;
        switch (this.f49435a) {
            case 0:
                this.f49436b.c(true);
                return;
            default:
                t tVar = this.f49436b;
                tVar.e = tVar.b();
                int i12 = tVar.f49442f;
                int i13 = tVar.h;
                wn wnVar = tVar.f49439a;
                if (tVar.f49440b == null) {
                    if (wnVar.getUserConfig().getClientUserId() == wnVar.a()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        i10 = 3;
                    } else {
                        i10 = 0;
                    }
                    wn wnVar2 = tVar.f49439a;
                    ?? qk0Var = new qk0(i10, wnVar.getCurrentAccount(), tVar.getContext(), wnVar2, wnVar.getResourceProvider());
                    qk0Var.l1 = 1.0f;
                    qk0Var.setWillNotDraw(false);
                    tVar.f49440b = qk0Var;
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
                    tVar.f49440b.setDelegate(new n2.e(tVar, 28));
                    tVar.f49440b.setClipChildren(false);
                    tVar.f49440b.setClipToPadding(false);
                    tVar.addView(tVar.f49440b, y5.e(-2, i12 + 70, 5));
                }
                tVar.c(false);
                if (tVar.f49440b.isEnabled()) {
                    tVar.f49447x = true;
                    tVar.f49440b.p(tVar.e, wnVar.Z7, true);
                    tVar.f49440b.r(false);
                    return;
                }
                tVar.f49447x = false;
                tVar.f49440b.setTransitionProgress(1.0f);
                return;
        }
    }
}
