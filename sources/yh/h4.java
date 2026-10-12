package yh;

import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.ck;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.m80;
import zh.f5;
public final class h4 extends org.telegram.ui.ActionBar.j {
    public final org.telegram.ui.ActionBar.u0 f48914a;
    public final long f48915b;
    public final k4 f48916c;

    public h4(k4 k4Var, org.telegram.ui.ActionBar.u0 u0Var, long j10) {
        this.f48916c = k4Var;
        this.f48914a = u0Var;
        this.f48915b = j10;
    }

    @Override
    public final void b(int i10) {
        c6 c6Var;
        int i11;
        int i12;
        boolean canUserDoAction;
        org.telegram.ui.ActionBar.e1 e1Var;
        org.telegram.ui.ActionBar.e1 e1Var2;
        k4 k4Var = this.f48916c;
        f5 f5Var = k4Var.Y;
        if (i10 == 1) {
            m80 m80Var = k4Var.f48947d0;
            if (m80Var != null) {
                m80Var.u();
            }
            org.telegram.ui.ActionBar.c3 c3Var = k4Var.container;
            c6Var = ((org.telegram.ui.ActionBar.e3) k4Var).resourcesProvider;
            m80 F = m80.F(c3Var, c6Var, this.f48914a);
            k4Var.f48947d0 = F;
            i11 = ((org.telegram.ui.ActionBar.e3) k4Var).currentAccount;
            long clientUserId = UserConfig.getInstance(i11).getClientUserId();
            long j10 = this.f48915b;
            if (j10 == clientUserId) {
                canUserDoAction = true;
            } else if (j10 < 0) {
                i12 = ((org.telegram.ui.ActionBar.e3) k4Var).currentAccount;
                canUserDoAction = ChatObject.canUserDoAction(MessagesController.getInstance(i12).getChat(Long.valueOf(-j10)), 5);
            } else {
                canUserDoAction = false;
            }
            org.telegram.ui.ActionBar.e1 e1Var3 = new org.telegram.ui.ActionBar.e1(0, F.e, F.d, false, false);
            F.d(e1Var3);
            F.k();
            org.telegram.ui.ActionBar.e1 h = F.h();
            h.setText(LocaleController.getString(R.string.Gift2FilterUnlimited));
            org.telegram.ui.ActionBar.e1 h10 = F.h();
            h10.setText(LocaleController.getString(R.string.Gift2FilterLimited));
            org.telegram.ui.ActionBar.e1 h11 = F.h();
            h11.setText(LocaleController.getString(R.string.Gift2FilterUpgradable));
            org.telegram.ui.ActionBar.e1 h12 = F.h();
            h12.setText(LocaleController.getString(R.string.Gift2FilterUnique));
            if (canUserDoAction) {
                F.k();
                org.telegram.ui.ActionBar.e1 h13 = F.h();
                h13.setText(LocaleController.getString(R.string.Gift2FilterDisplayed));
                org.telegram.ui.ActionBar.e1 h14 = F.h();
                h14.setText(LocaleController.getString(R.string.Gift2FilterHidden));
                e1Var = h13;
                e1Var2 = h14;
            } else {
                e1Var = null;
                e1Var2 = null;
            }
            ck ckVar = new ck(this, e1Var3, h, h10, h11, h12, canUserDoAction, e1Var, e1Var2, 4);
            ckVar.run();
            e1Var3.setOnClickListener(new a(4, this, ckVar));
            q2.j(h, f5Var, ckVar, 1);
            q2.j(h10, f5Var, ckVar, 2);
            q2.j(h11, f5Var, ckVar, 4);
            q2.j(h12, f5Var, ckVar, 8);
            if (canUserDoAction) {
                q2.j(e1Var, f5Var, ckVar, 256);
                q2.j(e1Var2, f5Var, ckVar, 512);
            }
            F.Y = true;
            F.J = false;
            F.f27298s = 0;
            F.Z();
        } else if (i10 == -1) {
            k4Var.dismiss();
        }
    }
}
