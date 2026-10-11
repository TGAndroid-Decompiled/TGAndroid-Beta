package xh;

import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.zj;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.q80;
import yh.f5;
public final class j4 extends org.telegram.ui.ActionBar.j {
    public final org.telegram.ui.ActionBar.u0 f51406a;
    public final long f51407b;
    public final m4 f51408c;

    public j4(m4 m4Var, org.telegram.ui.ActionBar.u0 u0Var, long j3) {
        this.f51408c = m4Var;
        this.f51406a = u0Var;
        this.f51407b = j3;
    }

    @Override
    public final void b(int i10) {
        d6 d6Var;
        int i11;
        int i12;
        boolean canUserDoAction;
        org.telegram.ui.ActionBar.e1 e1Var;
        org.telegram.ui.ActionBar.e1 e1Var2;
        m4 m4Var = this.f51408c;
        f5 f5Var = m4Var.Y;
        if (i10 == 1) {
            q80 q80Var = m4Var.f51467d0;
            if (q80Var != null) {
                q80Var.u();
            }
            org.telegram.ui.ActionBar.c3 c3Var = m4Var.container;
            d6Var = ((org.telegram.ui.ActionBar.e3) m4Var).resourcesProvider;
            q80 F = q80.F(c3Var, d6Var, this.f51406a);
            m4Var.f51467d0 = F;
            i11 = ((org.telegram.ui.ActionBar.e3) m4Var).currentAccount;
            long clientUserId = UserConfig.getInstance(i11).getClientUserId();
            long j3 = this.f51407b;
            if (j3 == clientUserId) {
                canUserDoAction = true;
            } else if (j3 < 0) {
                i12 = ((org.telegram.ui.ActionBar.e3) m4Var).currentAccount;
                canUserDoAction = ChatObject.canUserDoAction(MessagesController.getInstance(i12).getChat(Long.valueOf(-j3)), 5);
            } else {
                canUserDoAction = false;
            }
            org.telegram.ui.ActionBar.e1 e1Var3 = new org.telegram.ui.ActionBar.e1(0, F.f30058e, F.d, false, false);
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
            zj zjVar = new zj(this, e1Var3, h, h10, h11, h12, canUserDoAction, e1Var, e1Var2, 4);
            zjVar.run();
            e1Var3.setOnClickListener(new a(4, this, zjVar));
            s2.j(h, f5Var, zjVar, 1);
            s2.j(h10, f5Var, zjVar, 2);
            s2.j(h11, f5Var, zjVar, 4);
            s2.j(h12, f5Var, zjVar, 8);
            if (canUserDoAction) {
                s2.j(e1Var, f5Var, zjVar, 256);
                s2.j(e1Var2, f5Var, zjVar, 512);
            }
            F.Y = true;
            F.J = false;
            F.f30083s = 0;
            F.Z();
        } else if (i10 == -1) {
            m4Var.dismiss();
        }
    }
}
