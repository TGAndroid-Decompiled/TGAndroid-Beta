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
import org.telegram.ui.cd0;
public final class q0 implements Utilities.Callback5, c2 {
    public final int f45485a;
    public final v0 f45486b;

    public q0(v0 v0Var, int i10) {
        this.f45485a = i10;
        this.f45486b = v0Var;
    }

    @Override
    public void l(d2 d2Var, int i10) {
        switch (this.f45485a) {
            case 1:
                this.f45486b.W();
                return;
            case 2:
                this.f45486b.finishFragment();
                return;
            default:
                v0 v0Var = this.f45486b;
                v0Var.f45524b.a(1.0f);
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
        v0 v0Var = this.f45486b;
        i51 i51Var = (i51) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = i51Var.d;
        if (i10 != 1 && i51Var.f25579c != v0Var.h) {
            if (i10 == 2) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(v0Var.getParentActivity());
                alertDialog$Builder.f19478a.O = LocaleController.getString(R.string.BusinessLocationClearTitle);
                alertDialog$Builder.f19478a.Q = LocaleController.getString(R.string.BusinessLocationClearMessage);
                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new q0(v0Var, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                v0Var.showDialog(alertDialog$Builder.f19478a);
            }
        } else if (v0Var.f45531x != null && i51Var.f25579c != v0Var.h) {
            v0Var.f45531x = null;
            v0Var.f45523a.V2.N(true);
        } else {
            cd0 cd0Var = new cd0(8);
            if (v0Var.f45531x != null) {
                TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
                tL_channelLocation.address = v0Var.f45532y;
                tL_channelLocation.geo_point = v0Var.f45531x;
                cd0Var.f33114x0 = tL_channelLocation;
            }
            cd0Var.C0 = new org.telegram.ui.web.m(9, v0Var, cd0Var);
            if (v0Var.f45531x == null && !TextUtils.isEmpty(v0Var.f45532y)) {
                d2 d2Var = new d2(v0Var.getParentActivity(), 3, null);
                d2Var.f19565d0 = false;
                d2Var.q(200L);
                Utilities.searchQueue.postRunnable(new o0(v0Var, cd0Var, d2Var));
                return;
            }
            v0Var.presentFragment(cd0Var);
        }
    }
}
