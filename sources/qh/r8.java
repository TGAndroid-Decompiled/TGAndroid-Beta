package qh;

import android.content.Context;
import android.view.View;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.qc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.xn;
public final class r8 implements View.OnClickListener {
    public final int f45984a;
    public final Object f45985b;
    public final Object f45986c;

    public r8(int i10, Object obj, Object obj2) {
        this.f45984a = i10;
        this.f45986c = obj;
        this.f45985b = obj2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f45984a) {
            case 0:
                ca caVar = (ca) this.f45986c;
                new k7((Context) this.f45985b, caVar.f45081c, true, caVar.f45139u0, new h8(caVar, 20), caVar.f45074a).show();
                return;
            case 1:
                sh.j.x0((sh.j) this.f45986c, (Context) this.f45985b);
                return;
            case 2:
                sh.p2 p2Var = (sh.p2) this.f45986c;
                sh.g0 g0Var = (sh.g0) this.f45985b;
                if (g0Var.c()) {
                    g0Var.a();
                } else {
                    File file = g0Var.d;
                    if (file != null && file.exists()) {
                        File file2 = g0Var.d;
                        AndroidUtilities.openForView(file2, file2.getName(), null, LaunchActivity.D1, null, true);
                    }
                }
                q70 q70Var = p2Var.H0;
                if (q70Var != null) {
                    q70Var.u();
                    p2Var.H0 = null;
                    return;
                }
                return;
            case 3:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.f45985b;
                ((org.telegram.ui.ActionBar.h3) this.f45986c).dismiss();
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(ProfileActivity.m4(connectedbotstarref.bot_id));
                    return;
                }
                return;
            case 4:
                AndroidUtilities.addToClipboard(((TL_account.TL_businessChatLink) this.f45986c).link);
                qc.a0((xn) this.f45985b).k(false).j();
                return;
            case 5:
                vf.f0.Q((vf.f0) this.f45986c, (TL_account.TL_connectedBot) this.f45985b);
                return;
            case 6:
                vh.b bVar = (vh.b) this.f45986c;
                bVar.getClass();
                ((Runnable) this.f45985b).run();
                bVar.dismiss();
                return;
            default:
                wh.z1.Y((wh.z1) this.f45986c, (Context) this.f45985b, view);
                return;
        }
    }
}
