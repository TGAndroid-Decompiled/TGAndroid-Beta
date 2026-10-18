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
public final class i4 extends org.telegram.ui.ActionBar.j {
    public final org.telegram.ui.ActionBar.u0 f50344a;
    public final long f50345b;
    public final l4 f50346c;

    public i4(l4 l4Var, org.telegram.ui.ActionBar.u0 u0Var, long j10) {
        this.f50346c = l4Var;
        this.f50344a = u0Var;
        this.f50345b = j10;
    }

    @Override
    public final void b(int i10) {
        d6 d6Var;
        int i11;
        int i12;
        boolean canUserDoAction;
        org.telegram.ui.ActionBar.e1 e1Var;
        org.telegram.ui.ActionBar.e1 e1Var2;
        l4 l4Var = this.f50346c;
        y9 y9Var = l4Var.Y;
        if (i10 == 1) {
            i80 i80Var = l4Var.f50404d0;
            if (i80Var != null) {
                i80Var.u();
            }
            org.telegram.ui.ActionBar.d3 d3Var = l4Var.container;
            d6Var = ((org.telegram.ui.ActionBar.f3) l4Var).resourcesProvider;
            i80 F = i80.F(d3Var, d6Var, this.f50344a);
            l4Var.f50404d0 = F;
            i11 = ((org.telegram.ui.ActionBar.f3) l4Var).currentAccount;
            long clientUserId = UserConfig.getInstance(i11).getClientUserId();
            long j10 = this.f50345b;
            if (j10 == clientUserId) {
                canUserDoAction = true;
            } else if (j10 < 0) {
                i12 = ((org.telegram.ui.ActionBar.f3) l4Var).currentAccount;
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
            q2.j(h, y9Var, ujVar, 1);
            q2.j(h10, y9Var, ujVar, 2);
            q2.j(h11, y9Var, ujVar, 4);
            q2.j(h12, y9Var, ujVar, 8);
            if (canUserDoAction) {
                q2.j(e1Var, y9Var, ujVar, 256);
                q2.j(e1Var2, y9Var, ujVar, 512);
            }
            F.Y = true;
            F.J = false;
            F.f27141s = 0;
            F.Z();
        } else if (i10 == -1) {
            l4Var.dismiss();
        }
    }
}
