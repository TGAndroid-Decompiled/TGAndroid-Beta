package sf;

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
import org.telegram.ui.Components.w41;
import org.telegram.ui.fi1;
import org.telegram.ui.rc0;
public final class q0 implements Utilities.Callback5, b2 {
    public final int f47928a;
    public final v0 f47929b;

    public q0(v0 v0Var, int i10) {
        this.f47928a = i10;
        this.f47929b = v0Var;
    }

    @Override
    public void g(c2 c2Var, int i10) {
        switch (this.f47928a) {
            case 1:
                this.f47929b.W();
                return;
            case 2:
                this.f47929b.finishFragment();
                return;
            default:
                v0 v0Var = this.f47929b;
                v0Var.f47970b.a(1.0f);
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
    public void mo19run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        v0 v0Var = this.f47929b;
        w41 w41Var = (w41) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = w41Var.d;
        if (i10 != 1 && w41Var.f34293c != v0Var.h) {
            if (i10 == 2) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(v0Var.getParentActivity());
                alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.BusinessLocationClearTitle);
                alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.BusinessLocationClearMessage);
                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new q0(v0Var, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                v0Var.showDialog(alertDialog$Builder.f22714a);
            }
        } else if (v0Var.f47978x != null && w41Var.f34293c != v0Var.h) {
            v0Var.f47978x = null;
            v0Var.f47969a.U2.N(true);
        } else {
            rc0 rc0Var = new rc0(8);
            if (v0Var.f47978x != null) {
                TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
                tL_channelLocation.address = v0Var.f47979y;
                tL_channelLocation.geo_point = v0Var.f47978x;
                rc0Var.f42062w0 = tL_channelLocation;
            }
            rc0Var.B0 = new fi1(9, v0Var, rc0Var);
            if (v0Var.f47978x == null && !TextUtils.isEmpty(v0Var.f47979y)) {
                c2 c2Var = new c2(v0Var.getParentActivity(), 3, null);
                c2Var.f22783c0 = false;
                c2Var.q(200L);
                Utilities.searchQueue.postRunnable(new o0(v0Var, rc0Var, c2Var));
                return;
            }
            v0Var.presentFragment(rc0Var);
        }
    }
}
