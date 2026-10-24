package yh;

import ai.y9;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.yj;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.h80;
public final class h4 extends org.telegram.ui.ActionBar.j {
    public final org.telegram.ui.ActionBar.u0 f50745a;
    public final long f50746b;
    public final k4 f50747c;

    public h4(k4 k4Var, org.telegram.ui.ActionBar.u0 u0Var, long j10) {
        this.f50747c = k4Var;
        this.f50745a = u0Var;
        this.f50746b = j10;
    }

    @Override
    public final void b(int i10) {
        g6 g6Var;
        int i11;
        int i12;
        boolean canUserDoAction;
        org.telegram.ui.ActionBar.e1 e1Var;
        org.telegram.ui.ActionBar.e1 e1Var2;
        k4 k4Var = this.f50747c;
        y9 y9Var = k4Var.Y;
        if (i10 == 1) {
            h80 h80Var = k4Var.f50805d0;
            if (h80Var != null) {
                h80Var.u();
            }
            org.telegram.ui.ActionBar.e3 e3Var = k4Var.container;
            g6Var = ((org.telegram.ui.ActionBar.h3) k4Var).resourcesProvider;
            h80 F = h80.F(e3Var, g6Var, this.f50745a);
            k4Var.f50805d0 = F;
            i11 = ((org.telegram.ui.ActionBar.h3) k4Var).currentAccount;
            long clientUserId = UserConfig.getInstance(i11).getClientUserId();
            long j10 = this.f50746b;
            if (j10 == clientUserId) {
                canUserDoAction = true;
            } else if (j10 < 0) {
                i12 = ((org.telegram.ui.ActionBar.h3) k4Var).currentAccount;
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
            yj yjVar = new yj(this, e1Var3, h, h10, h11, h12, canUserDoAction, e1Var, e1Var2, 4);
            yjVar.run();
            e1Var3.setOnClickListener(new org.telegram.ui.web.c(16, this, yjVar));
            p2.j(h, y9Var, yjVar, 1);
            p2.j(h10, y9Var, yjVar, 2);
            p2.j(h11, y9Var, yjVar, 4);
            p2.j(h12, y9Var, yjVar, 8);
            if (canUserDoAction) {
                p2.j(e1Var, y9Var, yjVar, 256);
                p2.j(e1Var2, y9Var, yjVar, 512);
            }
            F.Y = true;
            F.J = false;
            F.f26929s = 0;
            F.Z();
        } else if (i10 == -1) {
            k4Var.dismiss();
        }
    }
}
