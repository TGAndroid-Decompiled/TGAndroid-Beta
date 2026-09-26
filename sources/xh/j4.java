package xh;

import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.ik;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.y70;
import org.telegram.ui.ny0;
import yh.k5;
public final class j4 extends org.telegram.ui.ActionBar.j {
    public final org.telegram.ui.ActionBar.u0 f46225a;
    public final long f46226b;
    public final m4 f46227c;

    public j4(m4 m4Var, org.telegram.ui.ActionBar.u0 u0Var, long j3) {
        this.f46227c = m4Var;
        this.f46225a = u0Var;
        this.f46226b = j3;
    }

    @Override
    public final void b(int i10) {
        d6 d6Var;
        int i11;
        int i12;
        boolean canUserDoAction;
        org.telegram.ui.ActionBar.e1 e1Var;
        org.telegram.ui.ActionBar.e1 e1Var2;
        m4 m4Var = this.f46227c;
        k5 k5Var = m4Var.Y;
        if (i10 == 1) {
            y70 y70Var = m4Var.f46296d0;
            if (y70Var != null) {
                y70Var.u();
            }
            org.telegram.ui.ActionBar.c3 c3Var = m4Var.container;
            d6Var = ((org.telegram.ui.ActionBar.e3) m4Var).resourcesProvider;
            y70 F = y70.F(c3Var, d6Var, this.f46225a);
            m4Var.f46296d0 = F;
            i11 = ((org.telegram.ui.ActionBar.e3) m4Var).currentAccount;
            long clientUserId = UserConfig.getInstance(i11).getClientUserId();
            long j3 = this.f46226b;
            if (j3 == clientUserId) {
                canUserDoAction = true;
            } else if (j3 < 0) {
                i12 = ((org.telegram.ui.ActionBar.e3) m4Var).currentAccount;
                canUserDoAction = ChatObject.canUserDoAction(MessagesController.getInstance(i12).getChat(Long.valueOf(-j3)), 5);
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
            ik ikVar = new ik(this, e1Var3, h, h10, h11, h12, canUserDoAction, e1Var, e1Var2, 4);
            ikVar.run();
            e1Var3.setOnClickListener(new ny0(28, this, ikVar));
            s2.j(h, k5Var, ikVar, 1);
            s2.j(h10, k5Var, ikVar, 2);
            s2.j(h11, k5Var, ikVar, 4);
            s2.j(h12, k5Var, ikVar, 8);
            if (canUserDoAction) {
                s2.j(e1Var, k5Var, ikVar, 256);
                s2.j(e1Var2, k5Var, ikVar, 512);
            }
            F.Y = true;
            F.J = false;
            F.f30554s = 0;
            F.Z();
        } else if (i10 == -1) {
            m4Var.dismiss();
        }
    }
}
