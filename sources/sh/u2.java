package sh;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import mh.u6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.q70;
import org.telegram.ui.dy0;
public final class u2 implements View.OnClickListener {
    public final int f47763a = 1;
    public final int f47764b;
    public final org.telegram.ui.ActionBar.h3 f47765c;
    public final g6 d;
    public final long f47766e;
    public final Context f47767f;
    public final TL_payments.connectedBotStarRef h;
    public final Object f47768n;

    public u2(int i10, org.telegram.ui.ActionBar.h3 h3Var, g6 g6Var, LinearLayout linearLayout, long j10, Context context, TL_payments.connectedBotStarRef connectedbotstarref) {
        this.f47764b = i10;
        this.f47765c = h3Var;
        this.d = g6Var;
        this.f47768n = linearLayout;
        this.f47766e = j10;
        this.f47767f = context;
        this.h = connectedbotstarref;
    }

    @Override
    public final void onClick(View view) {
        long j10;
        boolean z4;
        switch (this.f47763a) {
            case 0:
                dy0 dy0Var = (dy0) this.f47768n;
                TL_payments.connectedBotStarRef connectedbotstarref = this.h;
                if (connectedbotstarref.revoked) {
                    int i10 = this.f47764b;
                    TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(connectedbotstarref.bot_id));
                    if (user != null) {
                        MessagesController.getInstance(i10).loadFullUser(user, 0, true, new s2(this.f47765c, this.f47767f, i10, this.f47766e, this.d, 0));
                        return;
                    }
                    return;
                }
                dy0Var.run();
                return;
            default:
                LinearLayout linearLayout = (LinearLayout) this.f47768n;
                int i11 = this.f47764b;
                mh.a0 g10 = mh.a0.g(i11);
                g10.n();
                g10.o();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = g10.f13676j;
                if (arrayList2 != null) {
                    arrayList.addAll(arrayList2);
                }
                ArrayList arrayList3 = g10.f13678l;
                if (arrayList3 != null) {
                    arrayList.addAll(arrayList3);
                }
                arrayList.add(0, UserConfig.getInstance(i11).getCurrentUser());
                org.telegram.ui.ActionBar.h3 h3Var = this.f47765c;
                ViewGroup containerView = h3Var.getContainerView();
                g6 g6Var = this.d;
                q70 F = q70.F(containerView, g6Var, linearLayout);
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    int i13 = i12 + 1;
                    TLObject tLObject = (TLObject) arrayList.get(i12);
                    if (tLObject instanceof TLRPC.User) {
                        j10 = ((TLRPC.User) tLObject).f20992id;
                    } else {
                        if (tLObject instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                            if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                                j10 = -chat.f20845id;
                            }
                        }
                        i12 = i13;
                    }
                    if (j10 == this.f47766e) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    F.g(tLObject, z4, new u6(i11, j10, this.f47767f, this.h, h3Var, g6Var));
                    i12 = i13;
                }
                F.f30334t = false;
                F.f30333s = 0;
                F.V(5);
                F.a0(AndroidUtilities.dp(24.0f), 0.0f);
                F.Z();
                return;
        }
    }

    public u2(TL_payments.connectedBotStarRef connectedbotstarref, int i10, org.telegram.ui.ActionBar.h3 h3Var, Context context, long j10, g6 g6Var, dy0 dy0Var) {
        this.h = connectedbotstarref;
        this.f47764b = i10;
        this.f47765c = h3Var;
        this.f47767f = context;
        this.f47766e = j10;
        this.d = g6Var;
        this.f47768n = dy0Var;
    }
}
