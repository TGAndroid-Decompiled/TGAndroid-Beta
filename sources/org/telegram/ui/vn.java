package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class vn implements View.OnClickListener {
    public final int f52249a;
    public final ho f52250b;

    public vn(ho hoVar, int i7) {
        this.f52249a = i7;
        this.f52250b = hoVar;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f52249a;
        ho hoVar = this.f52250b;
        switch (i7) {
            case 0:
                TLRPC.Chat currentChannel = ((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hoVar.getParentActivity());
                String M0 = org.telegram.messenger.hd.M0(2131689472, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                t1Var.S = M0;
                if (hoVar.f47761b0) {
                    t1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("RevokeLinkAlertChannel", null, 2131746021, hoVar.getMessagesController().V2 + "/" + org.telegram.messenger.t3.K(currentChannel, false), currentChannel.title));
                } else {
                    t1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("RevokeLinkAlert", null, 2131746022, hoVar.getMessagesController().V2 + "/" + org.telegram.messenger.t3.K(currentChannel, false), currentChannel.title));
                }
                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131746024, null), new m2.d(22, hoVar, currentChannel));
                hoVar.showDialog(t1Var);
                return;
            case 1:
                if (!hoVar.W) {
                    hoVar.W = true;
                    hoVar.h0();
                    return;
                }
                return;
            case 2:
                if (hoVar.W) {
                    if (!hoVar.f47764d0) {
                        hoVar.f0();
                        return;
                    }
                    hoVar.W = false;
                    hoVar.h0();
                    return;
                }
                return;
            case 3:
                cf0 cf0Var = new cf0(hoVar.f47759a0, 0, 0L);
                cf0Var.m0(hoVar.Z, hoVar.m0);
                hoVar.presentFragment(cf0Var);
                return;
            default:
                boolean z10 = !hoVar.f47763c0;
                hoVar.f47763c0 = z10;
                ((org.telegram.ui.Cells.q8) view).setChecked(z10);
                return;
        }
    }
}
