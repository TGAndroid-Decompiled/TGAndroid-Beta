package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class xn implements View.OnClickListener {
    public final int f53905a;
    public final jo f53906b;

    public xn(jo joVar, int i7) {
        this.f53905a = i7;
        this.f53906b = joVar;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f53905a;
        jo joVar = this.f53906b;
        switch (i7) {
            case 0:
                TLRPC.Chat currentChannel = ((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(joVar.getParentActivity());
                String N0 = org.telegram.messenger.hd.N0(2131689472, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
                t1Var.S = N0;
                if (joVar.f49035b0) {
                    t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0("RevokeLinkAlertChannel", null, 2131745825, joVar.getMessagesController().X2 + "/" + org.telegram.messenger.v3.K(currentChannel, false), currentChannel.title));
                } else {
                    t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0("RevokeLinkAlert", null, 2131745826, joVar.getMessagesController().X2 + "/" + org.telegram.messenger.v3.K(currentChannel, false), currentChannel.title));
                }
                alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131745828, null), new oi.f0(20, joVar, currentChannel));
                joVar.showDialog(t1Var);
                return;
            case 1:
                if (!joVar.W) {
                    joVar.W = true;
                    joVar.h0();
                    return;
                }
                return;
            case 2:
                if (joVar.W) {
                    if (!joVar.f49038d0) {
                        joVar.f0();
                        return;
                    }
                    joVar.W = false;
                    joVar.h0();
                    return;
                }
                return;
            case 3:
                ff0 ff0Var = new ff0(joVar.f49033a0, 0, 0L);
                ff0Var.m0(joVar.Z, joVar.m0);
                joVar.presentFragment(ff0Var);
                return;
            default:
                boolean z10 = !joVar.f49037c0;
                joVar.f49037c0 = z10;
                ((org.telegram.ui.Cells.s8) view).setChecked(z10);
                return;
        }
    }
}
