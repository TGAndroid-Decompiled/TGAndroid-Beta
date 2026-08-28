package pf;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.Components.l41;
import org.telegram.ui.ei1;
import org.telegram.ui.pc0;
public final class r0 implements Utilities.Callback5, b2 {
    public final int f45762a;
    public final w0 f45763b;

    public r0(w0 w0Var, int i9) {
        this.f45762a = i9;
        this.f45763b = w0Var;
    }

    @Override
    public void f(c2 c2Var, int i9) {
        switch (this.f45762a) {
            case 1:
                this.f45763b.V();
                return;
            case 2:
                this.f45763b.finishFragment();
                return;
            default:
                w0 w0Var = this.f45763b;
                w0Var.f45803b.a(1.0f);
                TLRPC.UserFull userFull = w0Var.getMessagesController().getUserFull(w0Var.getUserConfig().getClientUserId());
                TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                if (userFull != null) {
                    userFull.business_location = null;
                    userFull.flags2 &= -3;
                }
                w0Var.getConnectionsManager().sendRequest(updatebusinesslocation, new s0(w0Var, 1));
                return;
        }
    }

    @Override
    public void mo18run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        w0 w0Var = this.f45763b;
        l41 l41Var = (l41) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i9 = l41Var.d;
        if (i9 != 1 && l41Var.f30332c != w0Var.h) {
            if (i9 == 2) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(w0Var.getParentActivity());
                alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.BusinessLocationClearTitle);
                alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.BusinessLocationClearMessage);
                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new r0(w0Var, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                w0Var.showDialog(alertDialog$Builder.f22702a);
            }
        } else if (w0Var.f45811x != null && l41Var.f30332c != w0Var.h) {
            w0Var.f45811x = null;
            w0Var.f45802a.U2.N(true);
        } else {
            pc0 pc0Var = new pc0(8);
            if (w0Var.f45811x != null) {
                TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
                tL_channelLocation.address = w0Var.f45812y;
                tL_channelLocation.geo_point = w0Var.f45811x;
                pc0Var.f41471w0 = tL_channelLocation;
            }
            pc0Var.B0 = new ei1(6, w0Var, pc0Var);
            if (w0Var.f45811x == null && !TextUtils.isEmpty(w0Var.f45812y)) {
                c2 c2Var = new c2(w0Var.getParentActivity(), 3, null);
                c2Var.f22766c0 = false;
                c2Var.q(200L);
                Utilities.searchQueue.postRunnable(new p0(w0Var, pc0Var, c2Var));
                return;
            }
            w0Var.presentFragment(pc0Var);
        }
    }
}
