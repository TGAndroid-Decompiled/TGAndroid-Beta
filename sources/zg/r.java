package zg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.bo;
import w7.x5;
import yh.f2;
public final class r implements Runnable {
    public final int f49157a;
    public final t f49158b;

    public r(t tVar, int i10) {
        this.f49157a = i10;
        this.f49158b = tVar;
    }

    @Override
    public final void run() {
        boolean z10;
        int i10;
        int i11;
        switch (this.f49157a) {
            case 0:
                this.f49158b.c(true);
                return;
            default:
                t tVar = this.f49158b;
                tVar.e = tVar.b();
                int i12 = tVar.f49164f;
                int i13 = tVar.h;
                bo boVar = tVar.f49161a;
                if (tVar.f49162b == null) {
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
                    bo boVar2 = tVar.f49161a;
                    ?? fk0Var = new fk0(i10, boVar.getCurrentAccount(), tVar.getContext(), boVar2, boVar.getResourceProvider());
                    fk0Var.l1 = 1.0f;
                    fk0Var.setWillNotDraw(false);
                    tVar.f49162b = fk0Var;
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
                    fk0Var.setPadding(i14, dp2, dp3 + i13, AndroidUtilities.dp(i12));
                    tVar.f49162b.setDelegate(new f2(tVar));
                    tVar.f49162b.setClipChildren(false);
                    tVar.f49162b.setClipToPadding(false);
                    tVar.addView(tVar.f49162b, x5.e(-2, i12 + 70, 5));
                }
                tVar.c(false);
                if (tVar.f49162b.isEnabled()) {
                    tVar.f49169x = true;
                    tVar.f49162b.p(tVar.e, boVar.Z7, true);
                    tVar.f49162b.r(false);
                    return;
                }
                tVar.f49169x = false;
                tVar.f49162b.setTransitionProgress(1.0f);
                return;
        }
    }
}
