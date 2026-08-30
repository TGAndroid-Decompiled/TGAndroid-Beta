package ph;

import android.content.Context;
import android.view.View;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.qc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.xn;
public final class t8 implements View.OnClickListener {
    public final int f42369a;
    public final Object f42370b;
    public final Object f42371c;

    public t8(int i10, Object obj, Object obj2) {
        this.f42369a = i10;
        this.f42371c = obj;
        this.f42370b = obj2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f42369a) {
            case 0:
                da daVar = (da) this.f42371c;
                new m7((Context) this.f42370b, daVar.f41479c, true, daVar.f41536u0, new i8(daVar, 20), daVar.f41472a).show();
                return;
            case 1:
                rh.k.x0((rh.k) this.f42371c, (Context) this.f42370b);
                return;
            case 2:
                rh.q2 q2Var = (rh.q2) this.f42371c;
                rh.h0 h0Var = (rh.h0) this.f42370b;
                if (h0Var.c()) {
                    h0Var.a();
                } else {
                    File file = h0Var.d;
                    if (file != null && file.exists()) {
                        File file2 = h0Var.d;
                        AndroidUtilities.openForView(file2, file2.getName(), null, LaunchActivity.D1, null, true);
                    }
                }
                o70 o70Var = q2Var.H0;
                if (o70Var != null) {
                    o70Var.u();
                    q2Var.H0 = null;
                    return;
                }
                return;
            case 3:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.f42370b;
                ((org.telegram.ui.ActionBar.g3) this.f42371c).dismiss();
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(ProfileActivity.m4(connectedbotstarref.bot_id));
                    return;
                }
                return;
            case 4:
                AndroidUtilities.addToClipboard(((TL_account.TL_businessChatLink) this.f42371c).link);
                qc.a0((xn) this.f42370b).k(false).j();
                return;
            case 5:
                uf.e0.Q((uf.e0) this.f42371c, (TL_account.TL_connectedBot) this.f42370b);
                return;
            case 6:
                uh.b bVar = (uh.b) this.f42371c;
                bVar.getClass();
                ((Runnable) this.f42370b).run();
                bVar.dismiss();
                return;
            default:
                vh.y1.Y((vh.y1) this.f42371c, (Context) this.f42370b, view);
                return;
        }
    }
}
