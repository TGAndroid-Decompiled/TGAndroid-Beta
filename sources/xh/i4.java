package xh;

import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.fk;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.s80;
import yh.f5;
public final class i4 extends org.telegram.ui.ActionBar.j {
    public final org.telegram.ui.ActionBar.u0 f51540a;
    public final long f51541b;
    public final l4 f51542c;

    public i4(l4 l4Var, org.telegram.ui.ActionBar.u0 u0Var, long j3) {
        this.f51542c = l4Var;
        this.f51540a = u0Var;
        this.f51541b = j3;
    }

    @Override
    public final void b(int i10) {
        c6 c6Var;
        int i11;
        int i12;
        boolean canUserDoAction;
        org.telegram.ui.ActionBar.e1 e1Var;
        org.telegram.ui.ActionBar.e1 e1Var2;
        l4 l4Var = this.f51542c;
        f5 f5Var = l4Var.Y;
        if (i10 == 1) {
            s80 s80Var = l4Var.f51581d0;
            if (s80Var != null) {
                s80Var.u();
            }
            org.telegram.ui.ActionBar.c3 c3Var = l4Var.container;
            c6Var = ((org.telegram.ui.ActionBar.e3) l4Var).resourcesProvider;
            s80 F = s80.F(c3Var, c6Var, this.f51540a);
            l4Var.f51581d0 = F;
            i11 = ((org.telegram.ui.ActionBar.e3) l4Var).currentAccount;
            long clientUserId = UserConfig.getInstance(i11).getClientUserId();
            long j3 = this.f51541b;
            if (j3 == clientUserId) {
                canUserDoAction = true;
            } else if (j3 < 0) {
                i12 = ((org.telegram.ui.ActionBar.e3) l4Var).currentAccount;
                canUserDoAction = ChatObject.canUserDoAction(MessagesController.getInstance(i12).getChat(Long.valueOf(-j3)), 5);
            } else {
                canUserDoAction = false;
            }
            org.telegram.ui.ActionBar.e1 e1Var3 = new org.telegram.ui.ActionBar.e1(0, F.f30443e, F.d, false, false);
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
            fk fkVar = new fk(this, e1Var3, h, h10, h11, h12, canUserDoAction, e1Var, e1Var2, 4);
            fkVar.run();
            e1Var3.setOnClickListener(new a(4, this, fkVar));
            r2.j(h, f5Var, fkVar, 1);
            r2.j(h10, f5Var, fkVar, 2);
            r2.j(h11, f5Var, fkVar, 4);
            r2.j(h12, f5Var, fkVar, 8);
            if (canUserDoAction) {
                r2.j(e1Var, f5Var, fkVar, 256);
                r2.j(e1Var2, f5Var, fkVar, 512);
            }
            F.Y = true;
            F.J = false;
            F.f30468s = 0;
            F.Z();
        } else if (i10 == -1) {
            l4Var.dismiss();
        }
    }
}
