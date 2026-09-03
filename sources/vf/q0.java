package vf;

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
import org.telegram.ui.Components.h51;
import org.telegram.ui.bd0;
public final class q0 implements Utilities.Callback5, c2 {
    public final int f49212a;
    public final v0 f49213b;

    public q0(v0 v0Var, int i10) {
        this.f49212a = i10;
        this.f49213b = v0Var;
    }

    @Override
    public void j(d2 d2Var, int i10) {
        switch (this.f49212a) {
            case 1:
                this.f49213b.W();
                return;
            case 2:
                this.f49213b.finishFragment();
                return;
            default:
                v0 v0Var = this.f49213b;
                v0Var.f49256b.a(1.0f);
                TLRPC.UserFull userFull = v0Var.getMessagesController().getUserFull(v0Var.getUserConfig().getClientUserId());
                TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                if (userFull != null) {
                    userFull.business_location = null;
                    userFull.flags2 &= -3;
                }
                v0Var.getConnectionsManager().sendRequest(updatebusinesslocation, new r0(v0Var, 1));
                return;
        }
    }

    @Override
    public void mo27run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        v0 v0Var = this.f49213b;
        h51 h51Var = (h51) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = h51Var.d;
        if (i10 != 1 && h51Var.f27368c != v0Var.h) {
            if (i10 == 2) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(v0Var.getParentActivity());
                alertDialog$Builder.f21168a.O = LocaleController.getString(R.string.BusinessLocationClearTitle);
                alertDialog$Builder.f21168a.Q = LocaleController.getString(R.string.BusinessLocationClearMessage);
                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new q0(v0Var, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                v0Var.showDialog(alertDialog$Builder.f21168a);
            }
        } else if (v0Var.f49264x != null && h51Var.f27368c != v0Var.h) {
            v0Var.f49264x = null;
            v0Var.f49255a.V2.N(true);
        } else {
            bd0 bd0Var = new bd0(8);
            if (v0Var.f49264x != null) {
                TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
                tL_channelLocation.address = v0Var.f49265y;
                tL_channelLocation.geo_point = v0Var.f49264x;
                bd0Var.f35500x0 = tL_channelLocation;
            }
            bd0Var.C0 = new org.telegram.ui.web.m(10, v0Var, bd0Var);
            if (v0Var.f49264x == null && !TextUtils.isEmpty(v0Var.f49265y)) {
                d2 d2Var = new d2(v0Var.getParentActivity(), 3, null);
                d2Var.f21243d0 = false;
                d2Var.q(200L);
                Utilities.searchQueue.postRunnable(new o0(v0Var, bd0Var, d2Var));
                return;
            }
            v0Var.presentFragment(bd0Var);
        }
    }
}
