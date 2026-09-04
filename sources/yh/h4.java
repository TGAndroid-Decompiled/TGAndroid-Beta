package yh;

import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.kk;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.n70;
import org.telegram.ui.wy0;
import zh.j5;
public final class h4 extends org.telegram.ui.ActionBar.j {
    public final org.telegram.ui.ActionBar.v0 f50329a;
    public final long f50330b;
    public final k4 f50331c;

    public h4(k4 k4Var, org.telegram.ui.ActionBar.v0 v0Var, long j3) {
        this.f50331c = k4Var;
        this.f50329a = v0Var;
        this.f50330b = j3;
    }

    @Override
    public final void b(int i10) {
        f6 f6Var;
        int i11;
        int i12;
        boolean canUserDoAction;
        org.telegram.ui.ActionBar.f1 f1Var;
        org.telegram.ui.ActionBar.f1 f1Var2;
        k4 k4Var = this.f50331c;
        j5 j5Var = k4Var.Y;
        if (i10 == 1) {
            n70 n70Var = k4Var.f50384d0;
            if (n70Var != null) {
                n70Var.u();
            }
            org.telegram.ui.ActionBar.d3 d3Var = k4Var.container;
            f6Var = ((org.telegram.ui.ActionBar.f3) k4Var).resourcesProvider;
            n70 F = n70.F(d3Var, f6Var, this.f50329a);
            k4Var.f50384d0 = F;
            i11 = ((org.telegram.ui.ActionBar.f3) k4Var).currentAccount;
            long clientUserId = UserConfig.getInstance(i11).getClientUserId();
            long j3 = this.f50330b;
            if (j3 == clientUserId) {
                canUserDoAction = true;
            } else if (j3 < 0) {
                i12 = ((org.telegram.ui.ActionBar.f3) k4Var).currentAccount;
                canUserDoAction = ChatObject.canUserDoAction(MessagesController.getInstance(i12).getChat(Long.valueOf(-j3)), 5);
            } else {
                canUserDoAction = false;
            }
            org.telegram.ui.ActionBar.f1 f1Var3 = new org.telegram.ui.ActionBar.f1(0, F.f28635e, F.d, false, false);
            F.d(f1Var3);
            F.k();
            org.telegram.ui.ActionBar.f1 h = F.h();
            h.setText(LocaleController.getString(R.string.Gift2FilterUnlimited));
            org.telegram.ui.ActionBar.f1 h10 = F.h();
            h10.setText(LocaleController.getString(R.string.Gift2FilterLimited));
            org.telegram.ui.ActionBar.f1 h11 = F.h();
            h11.setText(LocaleController.getString(R.string.Gift2FilterUpgradable));
            org.telegram.ui.ActionBar.f1 h12 = F.h();
            h12.setText(LocaleController.getString(R.string.Gift2FilterUnique));
            if (canUserDoAction) {
                F.k();
                org.telegram.ui.ActionBar.f1 h13 = F.h();
                h13.setText(LocaleController.getString(R.string.Gift2FilterDisplayed));
                org.telegram.ui.ActionBar.f1 h14 = F.h();
                h14.setText(LocaleController.getString(R.string.Gift2FilterHidden));
                f1Var = h13;
                f1Var2 = h14;
            } else {
                f1Var = null;
                f1Var2 = null;
            }
            kk kkVar = new kk(this, f1Var3, h, h10, h11, h12, canUserDoAction, f1Var, f1Var2, 4);
            kkVar.run();
            f1Var3.setOnClickListener(new wy0(28, this, kkVar));
            q2.j(h, j5Var, kkVar, 1);
            q2.j(h10, j5Var, kkVar, 2);
            q2.j(h11, j5Var, kkVar, 4);
            q2.j(h12, j5Var, kkVar, 8);
            if (canUserDoAction) {
                q2.j(f1Var, j5Var, kkVar, 256);
                q2.j(f1Var2, j5Var, kkVar, 512);
            }
            F.Y = true;
            F.J = false;
            F.f28660s = 0;
            F.Z();
        } else if (i10 == -1) {
            k4Var.dismiss();
        }
    }
}
