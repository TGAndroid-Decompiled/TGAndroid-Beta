package org.telegram.ui.web;

import android.content.Context;
import android.view.View;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.tc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.tn;
import ph.p2;
public final class c implements View.OnClickListener {
    public final int f43991a;
    public final Object f43992b;
    public final Object f43993c;

    public c(int i10, Object obj, Object obj2) {
        this.f43991a = i10;
        this.f43992b = obj;
        this.f43993c = obj2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f43991a) {
            case 0:
                l lVar = (l) this.f43992b;
                lVar.f44096b = true;
                ((org.telegram.ui.a0) this.f43993c).run();
                lVar.f44103w.U2.N(true);
                return;
            case 1:
                ph.j.x0((ph.j) this.f43992b, (Context) this.f43993c);
                return;
            case 2:
                p2 p2Var = (p2) this.f43992b;
                ph.g0 g0Var = (ph.g0) this.f43993c;
                if (g0Var.c()) {
                    g0Var.a();
                } else {
                    File file = g0Var.d;
                    if (file != null && file.exists()) {
                        File file2 = g0Var.d;
                        AndroidUtilities.openForView(file2, file2.getName(), null, LaunchActivity.C1, null, true);
                    }
                }
                j70 j70Var = p2Var.G0;
                if (j70Var != null) {
                    j70Var.u();
                    p2Var.G0 = null;
                    return;
                }
                return;
            case 3:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.f43993c;
                ((f3) this.f43992b).dismiss();
                o2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(ProfileActivity.m4(connectedbotstarref.bot_id));
                    return;
                }
                return;
            case 4:
                AndroidUtilities.addToClipboard(((TL_account.TL_businessChatLink) this.f43992b).link);
                tc.a0((tn) this.f43993c).k(false).j();
                return;
            case 5:
                sf.f0.Q((sf.f0) this.f43992b, (TL_account.TL_connectedBot) this.f43993c);
                return;
            case 6:
                sh.b bVar = (sh.b) this.f43992b;
                bVar.getClass();
                ((Runnable) this.f43993c).run();
                bVar.dismiss();
                return;
            default:
                th.x1.Y((th.x1) this.f43992b, (Context) this.f43993c, view);
                return;
        }
    }
}
