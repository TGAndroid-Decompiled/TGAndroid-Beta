package xh;

import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.zj;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.q80;
import yh.e5;
public final class j4 extends org.telegram.ui.ActionBar.j {
    public final org.telegram.ui.ActionBar.v0 f51363a;
    public final long f51364b;
    public final m4 f51365c;

    public j4(m4 m4Var, org.telegram.ui.ActionBar.v0 v0Var, long j3) {
        this.f51365c = m4Var;
        this.f51363a = v0Var;
        this.f51364b = j3;
    }

    @Override
    public final void b(int i10) {
        e6 e6Var;
        int i11;
        int i12;
        boolean canUserDoAction;
        org.telegram.ui.ActionBar.f1 f1Var;
        org.telegram.ui.ActionBar.f1 f1Var2;
        m4 m4Var = this.f51365c;
        e5 e5Var = m4Var.Y;
        if (i10 == 1) {
            q80 q80Var = m4Var.f51424d0;
            if (q80Var != null) {
                q80Var.u();
            }
            org.telegram.ui.ActionBar.d3 d3Var = m4Var.container;
            e6Var = ((org.telegram.ui.ActionBar.f3) m4Var).resourcesProvider;
            q80 F = q80.F(d3Var, e6Var, this.f51363a);
            m4Var.f51424d0 = F;
            i11 = ((org.telegram.ui.ActionBar.f3) m4Var).currentAccount;
            long clientUserId = UserConfig.getInstance(i11).getClientUserId();
            long j3 = this.f51364b;
            if (j3 == clientUserId) {
                canUserDoAction = true;
            } else if (j3 < 0) {
                i12 = ((org.telegram.ui.ActionBar.f3) m4Var).currentAccount;
                canUserDoAction = ChatObject.canUserDoAction(MessagesController.getInstance(i12).getChat(Long.valueOf(-j3)), 5);
            } else {
                canUserDoAction = false;
            }
            org.telegram.ui.ActionBar.f1 f1Var3 = new org.telegram.ui.ActionBar.f1(0, F.f30095e, F.d, false, false);
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
            zj zjVar = new zj(this, f1Var3, h, h10, h11, h12, canUserDoAction, f1Var, f1Var2, 4);
            zjVar.run();
            f1Var3.setOnClickListener(new a(4, this, zjVar));
            s2.j(h, e5Var, zjVar, 1);
            s2.j(h10, e5Var, zjVar, 2);
            s2.j(h11, e5Var, zjVar, 4);
            s2.j(h12, e5Var, zjVar, 8);
            if (canUserDoAction) {
                s2.j(f1Var, e5Var, zjVar, 256);
                s2.j(f1Var2, e5Var, zjVar, 512);
            }
            F.Y = true;
            F.J = false;
            F.f30120s = 0;
            F.Z();
        } else if (i10 == -1) {
            m4Var.dismiss();
        }
    }
}
