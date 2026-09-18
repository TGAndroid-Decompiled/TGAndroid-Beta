package xh;

import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.kk;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.n70;
import org.telegram.ui.xy0;
import yh.n5;
public final class i4 extends org.telegram.ui.ActionBar.j {
    public final org.telegram.ui.ActionBar.w0 f45955a;
    public final long f45956b;
    public final l4 f45957c;

    public i4(l4 l4Var, org.telegram.ui.ActionBar.w0 w0Var, long j3) {
        this.f45957c = l4Var;
        this.f45955a = w0Var;
        this.f45956b = j3;
    }

    @Override
    public final void b(int i10) {
        f6 f6Var;
        int i11;
        int i12;
        boolean canUserDoAction;
        org.telegram.ui.ActionBar.g1 g1Var;
        org.telegram.ui.ActionBar.g1 g1Var2;
        l4 l4Var = this.f45957c;
        n5 n5Var = l4Var.Y;
        if (i10 == 1) {
            n70 n70Var = l4Var.f46009d0;
            if (n70Var != null) {
                n70Var.u();
            }
            org.telegram.ui.ActionBar.e3 e3Var = l4Var.container;
            f6Var = ((org.telegram.ui.ActionBar.g3) l4Var).resourcesProvider;
            n70 F = n70.F(e3Var, f6Var, this.f45955a);
            l4Var.f46009d0 = F;
            i11 = ((org.telegram.ui.ActionBar.g3) l4Var).currentAccount;
            long clientUserId = UserConfig.getInstance(i11).getClientUserId();
            long j3 = this.f45956b;
            if (j3 == clientUserId) {
                canUserDoAction = true;
            } else if (j3 < 0) {
                i12 = ((org.telegram.ui.ActionBar.g3) l4Var).currentAccount;
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
            kk kkVar = new kk(this, g1Var3, h, h10, h11, h12, canUserDoAction, g1Var, g1Var2, 4);
            kkVar.run();
            g1Var3.setOnClickListener(new xy0(28, this, kkVar));
            r2.j(h, n5Var, kkVar, 1);
            r2.j(h10, n5Var, kkVar, 2);
            r2.j(h11, n5Var, kkVar, 4);
            r2.j(h12, n5Var, kkVar, 8);
            if (canUserDoAction) {
                r2.j(g1Var, n5Var, kkVar, 256);
                r2.j(g1Var2, n5Var, kkVar, 512);
            }
            F.Y = true;
            F.J = false;
            F.f26387s = 0;
            F.Z();
        } else if (i10 == -1) {
            l4Var.dismiss();
        }
    }
}
