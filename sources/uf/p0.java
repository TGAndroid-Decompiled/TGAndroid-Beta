package uf;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.Components.i51;
import org.telegram.ui.ad0;
public final class p0 implements Utilities.Callback5, c2 {
    public final int f45413a;
    public final u0 f45414b;

    public p0(u0 u0Var, int i10) {
        this.f45413a = i10;
        this.f45414b = u0Var;
    }

    @Override
    public void i(d2 d2Var, int i10) {
        switch (this.f45413a) {
            case 1:
                this.f45414b.W();
                return;
            case 2:
                this.f45414b.finishFragment();
                return;
            default:
                u0 u0Var = this.f45414b;
                u0Var.f45446b.a(1.0f);
                TLRPC.UserFull userFull = u0Var.getMessagesController().getUserFull(u0Var.getUserConfig().getClientUserId());
                TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                if (userFull != null) {
                    userFull.business_location = null;
                    userFull.flags2 &= -3;
                }
                u0Var.getConnectionsManager().sendRequest(updatebusinesslocation, new q0(u0Var, 1));
                return;
        }
    }

    @Override
    public void mo28run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        u0 u0Var = this.f45414b;
        i51 i51Var = (i51) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = i51Var.d;
        if (i10 != 1 && i51Var.f25559c != u0Var.h) {
            if (i10 == 2) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(u0Var.getParentActivity());
                alertDialog$Builder.f19503a.O = LocaleController.getString(R.string.BusinessLocationClearTitle);
                alertDialog$Builder.f19503a.Q = LocaleController.getString(R.string.BusinessLocationClearMessage);
                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new p0(u0Var, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                u0Var.showDialog(alertDialog$Builder.f19503a);
            }
        } else if (u0Var.f45453x != null && i51Var.f25559c != u0Var.h) {
            u0Var.f45453x = null;
            u0Var.f45445a.V2.N(true);
        } else {
            ad0 ad0Var = new ad0(8);
            if (u0Var.f45453x != null) {
                TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
                tL_channelLocation.address = u0Var.f45454y;
                tL_channelLocation.geo_point = u0Var.f45453x;
                ad0Var.f32552x0 = tL_channelLocation;
            }
            ad0Var.C0 = new org.telegram.ui.web.m(9, u0Var, ad0Var);
            if (u0Var.f45453x == null && !TextUtils.isEmpty(u0Var.f45454y)) {
                d2 d2Var = new d2(u0Var.getParentActivity(), 3, null);
                d2Var.f19590d0 = false;
                d2Var.q(200L);
                Utilities.searchQueue.postRunnable(new n0(u0Var, ad0Var, d2Var));
                return;
            }
            u0Var.presentFragment(ad0Var);
        }
    }
}
