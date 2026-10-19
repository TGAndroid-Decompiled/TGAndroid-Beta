package yh;

import ai.y9;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.uj;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.i80;
public final class h4 extends org.telegram.ui.ActionBar.j {
    public final org.telegram.ui.ActionBar.u0 f50285a;
    public final long f50286b;
    public final k4 f50287c;

    public h4(k4 k4Var, org.telegram.ui.ActionBar.u0 u0Var, long j10) {
        this.f50287c = k4Var;
        this.f50285a = u0Var;
        this.f50286b = j10;
    }

    @Override
    public final void b(int i10) {
        d6 d6Var;
        int i11;
        int i12;
        boolean canUserDoAction;
        org.telegram.ui.ActionBar.e1 e1Var;
        org.telegram.ui.ActionBar.e1 e1Var2;
        k4 k4Var = this.f50287c;
        y9 y9Var = k4Var.Y;
        if (i10 == 1) {
            i80 i80Var = k4Var.f50345d0;
            if (i80Var != null) {
                i80Var.u();
            }
            org.telegram.ui.ActionBar.d3 d3Var = k4Var.container;
            d6Var = ((org.telegram.ui.ActionBar.f3) k4Var).resourcesProvider;
            i80 F = i80.F(d3Var, d6Var, this.f50285a);
            k4Var.f50345d0 = F;
            i11 = ((org.telegram.ui.ActionBar.f3) k4Var).currentAccount;
            long clientUserId = UserConfig.getInstance(i11).getClientUserId();
            long j10 = this.f50286b;
            if (j10 == clientUserId) {
                canUserDoAction = true;
            } else if (j10 < 0) {
                i12 = ((org.telegram.ui.ActionBar.f3) k4Var).currentAccount;
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
            uj ujVar = new uj(this, e1Var3, h, h10, h11, h12, canUserDoAction, e1Var, e1Var2, 4);
            ujVar.run();
            e1Var3.setOnClickListener(new qg.n(15, this, ujVar));
            p2.j(h, y9Var, ujVar, 1);
            p2.j(h10, y9Var, ujVar, 2);
            p2.j(h11, y9Var, ujVar, 4);
            p2.j(h12, y9Var, ujVar, 8);
            if (canUserDoAction) {
                p2.j(e1Var, y9Var, ujVar, 256);
                p2.j(e1Var2, y9Var, ujVar, 512);
            }
            F.Y = true;
            F.J = false;
            F.f27134s = 0;
            F.Z();
        } else if (i10 == -1) {
            k4Var.dismiss();
        }
    }
}
