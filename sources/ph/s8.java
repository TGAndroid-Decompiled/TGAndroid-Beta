package ph;

import android.content.Context;
import android.view.View;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.qc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.zn;
public final class s8 implements View.OnClickListener {
    public final int f42375a;
    public final Object f42376b;
    public final Object f42377c;

    public s8(int i10, Object obj, Object obj2) {
        this.f42375a = i10;
        this.f42377c = obj;
        this.f42376b = obj2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f42375a) {
            case 0:
                da daVar = (da) this.f42377c;
                new l7((Context) this.f42376b, daVar.f41517c, true, daVar.f41574u0, new h8(daVar, 20), daVar.f41510a).show();
                return;
            case 1:
                rh.j.x0((rh.j) this.f42377c, (Context) this.f42376b);
                return;
            case 2:
                rh.p2 p2Var = (rh.p2) this.f42377c;
                rh.g0 g0Var = (rh.g0) this.f42376b;
                if (g0Var.c()) {
                    g0Var.a();
                } else {
                    File file = g0Var.d;
                    if (file != null && file.exists()) {
                        File file2 = g0Var.d;
                        AndroidUtilities.openForView(file2, file2.getName(), null, LaunchActivity.D1, null, true);
                    }
                }
                p70 p70Var = p2Var.H0;
                if (p70Var != null) {
                    p70Var.u();
                    p2Var.H0 = null;
                    return;
                }
                return;
            case 3:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.f42376b;
                ((org.telegram.ui.ActionBar.g3) this.f42377c).dismiss();
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(ProfileActivity.m4(connectedbotstarref.bot_id));
                    return;
                }
                return;
            case 4:
                AndroidUtilities.addToClipboard(((TL_account.TL_businessChatLink) this.f42377c).link);
                qc.a0((zn) this.f42376b).k(false).j();
                return;
            case 5:
                uf.f0.Q((uf.f0) this.f42377c, (TL_account.TL_connectedBot) this.f42376b);
                return;
            case 6:
                uh.b bVar = (uh.b) this.f42377c;
                bVar.getClass();
                ((Runnable) this.f42376b).run();
                bVar.dismiss();
                return;
            default:
                vh.y1.Y((vh.y1) this.f42377c, (Context) this.f42376b, view);
                return;
        }
    }
}
