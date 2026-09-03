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
public final class q8 implements View.OnClickListener {
    public final int f45963a;
    public final Object f45964b;
    public final Object f45965c;

    public q8(int i10, Object obj, Object obj2) {
        this.f45963a = i10;
        this.f45965c = obj;
        this.f45964b = obj2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f45963a) {
            case 0:
                ba baVar = (ba) this.f45965c;
                new j7((Context) this.f45964b, baVar.f45047c, true, baVar.f45105u0, new g8(baVar, 20), baVar.f45040a).show();
                return;
            case 1:
                sh.j.x0((sh.j) this.f45965c, (Context) this.f45964b);
                return;
            case 2:
                sh.p2 p2Var = (sh.p2) this.f45965c;
                sh.g0 g0Var = (sh.g0) this.f45964b;
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
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.f45964b;
                ((org.telegram.ui.ActionBar.h3) this.f45965c).dismiss();
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(ProfileActivity.m4(connectedbotstarref.bot_id));
                    return;
                }
                return;
            case 4:
                AndroidUtilities.addToClipboard(((TL_account.TL_businessChatLink) this.f45965c).link);
                qc.a0((xn) this.f45964b).k(false).j();
                return;
            case 5:
                vf.e0.Q((vf.e0) this.f45965c, (TL_account.TL_connectedBot) this.f45964b);
                return;
            case 6:
                vh.b bVar = (vh.b) this.f45965c;
                bVar.getClass();
                ((Runnable) this.f45964b).run();
                bVar.dismiss();
                return;
            default:
                wh.z1.Y((wh.z1) this.f45965c, (Context) this.f45964b, view);
                return;
        }
    }
}
