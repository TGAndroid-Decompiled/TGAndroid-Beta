package xh;

import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.ik;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.a80;
import org.telegram.ui.py0;
import yh.k5;
public final class k4 extends org.telegram.ui.ActionBar.j {
    public final org.telegram.ui.ActionBar.w0 f46320a;
    public final long f46321b;
    public final n4 f46322c;

    public k4(n4 n4Var, org.telegram.ui.ActionBar.w0 w0Var, long j3) {
        this.f46322c = n4Var;
        this.f46320a = w0Var;
        this.f46321b = j3;
    }

    @Override
    public final void b(int i10) {
        e6 e6Var;
        int i11;
        int i12;
        boolean canUserDoAction;
        org.telegram.ui.ActionBar.g1 g1Var;
        org.telegram.ui.ActionBar.g1 g1Var2;
        n4 n4Var = this.f46322c;
        k5 k5Var = n4Var.Y;
        if (i10 == 1) {
            a80 a80Var = n4Var.f46379d0;
            if (a80Var != null) {
                a80Var.u();
            }
            org.telegram.ui.ActionBar.e3 e3Var = n4Var.container;
            e6Var = ((org.telegram.ui.ActionBar.g3) n4Var).resourcesProvider;
            a80 F = a80.F(e3Var, e6Var, this.f46320a);
            n4Var.f46379d0 = F;
            i11 = ((org.telegram.ui.ActionBar.g3) n4Var).currentAccount;
            long clientUserId = UserConfig.getInstance(i11).getClientUserId();
            long j3 = this.f46321b;
            if (j3 == clientUserId) {
                canUserDoAction = true;
            } else if (j3 < 0) {
                i12 = ((org.telegram.ui.ActionBar.g3) n4Var).currentAccount;
                canUserDoAction = ChatObject.canUserDoAction(MessagesController.getInstance(i12).getChat(Long.valueOf(-j3)), 5);
            } else {
                canUserDoAction = false;
            }
            org.telegram.ui.ActionBar.g1 g1Var3 = new org.telegram.ui.ActionBar.g1(0, F.e, F.d, false, false);
            F.d(g1Var3);
            F.k();
            org.telegram.ui.ActionBar.g1 h = F.h();
            h.setText(LocaleController.getString(R.string.Gift2FilterUnlimited));
            org.telegram.ui.ActionBar.g1 h10 = F.h();
            h10.setText(LocaleController.getString(R.string.Gift2FilterLimited));
            org.telegram.ui.ActionBar.g1 h11 = F.h();
            h11.setText(LocaleController.getString(R.string.Gift2FilterUpgradable));
            org.telegram.ui.ActionBar.g1 h12 = F.h();
            h12.setText(LocaleController.getString(R.string.Gift2FilterUnique));
            if (canUserDoAction) {
                F.k();
                org.telegram.ui.ActionBar.g1 h13 = F.h();
                h13.setText(LocaleController.getString(R.string.Gift2FilterDisplayed));
                org.telegram.ui.ActionBar.g1 h14 = F.h();
                h14.setText(LocaleController.getString(R.string.Gift2FilterHidden));
                g1Var = h13;
                g1Var2 = h14;
            } else {
                g1Var = null;
                g1Var2 = null;
            }
            ik ikVar = new ik(this, g1Var3, h, h10, h11, h12, canUserDoAction, g1Var, g1Var2, 4);
            ikVar.run();
            g1Var3.setOnClickListener(new py0(28, this, ikVar));
            t2.j(h, k5Var, ikVar, 1);
            t2.j(h10, k5Var, ikVar, 2);
            t2.j(h11, k5Var, ikVar, 4);
            t2.j(h12, k5Var, ikVar, 8);
            if (canUserDoAction) {
                t2.j(g1Var, k5Var, ikVar, 256);
                t2.j(g1Var2, k5Var, ikVar, 512);
            }
            F.Y = true;
            F.J = false;
            F.f22606s = 0;
            F.Z();
        } else if (i10 == -1) {
            n4Var.dismiss();
        }
    }
}
