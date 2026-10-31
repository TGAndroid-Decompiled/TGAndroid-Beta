package zf;

import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.cd;
import org.telegram.messenger.i5;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.Components.ik0;
import org.telegram.ui.ay;
import org.telegram.ui.mx;
public final class q implements x, ik0 {
    public final z f55613a;

    public q(z zVar) {
        this.f55613a = zVar;
    }

    @Override
    public void a(a0.h hVar, ArrayList arrayList) {
        z zVar = this.f55613a;
        int i10 = zVar.f55704s0;
        zVar.f55705t0 = arrayList;
        zVar.f55711x0 = hVar;
        for (int i11 = 0; i11 < zVar.f55705t0.size(); i11++) {
            y yVar = (y) zVar.f55705t0.get(i11);
            TLObject tLObject = yVar.f55678a;
            if (tLObject instanceof TLRPC.User) {
                vp.r1(i10).U3((TLRPC.User) yVar.f55678a, true, false);
            } else if (tLObject instanceof TLRPC.Chat) {
                vp.r1(i10).N3((TLRPC.Chat) yVar.f55678a, true);
            } else if (tLObject instanceof TLRPC.EncryptedChat) {
                vp.r1(i10).R3((TLRPC.EncryptedChat) yVar.f55678a, true);
            }
        }
        zVar.G(null);
        zVar.f();
    }

    @Override
    public boolean f(int i10, View view) {
        TLRPC.User Z1;
        mx mxVar = this.f55613a.U;
        if (mxVar != null) {
            Long l4 = (Long) view.getTag();
            long longValue = l4.longValue();
            ay ayVar = mxVar.f39787a;
            if (ayVar.getParentActivity() != null && (Z1 = ayVar.getMessagesController().Z1(l4)) != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ayVar.getParentActivity());
                String L0 = cd.L0(2131752234, null);
                x1 x1Var = alertDialog$Builder.f20134a;
                x1Var.R = L0;
                x1Var.T = org.telegram.messenger.i0.W2(cd.a0("ChatHintsDeleteAlert", null, 2131752235, i5.m(0, Z1.first_name, Z1.last_name)));
                alertDialog$Builder.k(cd.L0(2131744873, null), new m4.x0(mxVar, longValue, 7));
                alertDialog$Builder.h(cd.L0(2131752589, null), null);
                ayVar.showDialog(x1Var);
                TextView textView = (TextView) x1Var.d(-1);
                if (textView != null) {
                    a7.V(textView, t6.f21170q7, ayVar.getResourceProvider());
                }
            }
        }
        return true;
    }
}
