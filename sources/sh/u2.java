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
import org.telegram.ui.yx0;
public final class u2 implements View.OnClickListener {
    public final int f47727a = 1;
    public final int f47728b;
    public final org.telegram.ui.ActionBar.h3 f47729c;
    public final g6 d;
    public final long f47730e;
    public final Context f47731f;
    public final TL_payments.connectedBotStarRef h;
    public final Object f47732n;

    public u2(int i10, org.telegram.ui.ActionBar.h3 h3Var, g6 g6Var, LinearLayout linearLayout, long j10, Context context, TL_payments.connectedBotStarRef connectedbotstarref) {
        this.f47728b = i10;
        this.f47729c = h3Var;
        this.d = g6Var;
        this.f47732n = linearLayout;
        this.f47730e = j10;
        this.f47731f = context;
        this.h = connectedbotstarref;
    }

    @Override
    public final void onClick(View view) {
        long j10;
        boolean z4;
        switch (this.f47727a) {
            case 0:
                yx0 yx0Var = (yx0) this.f47732n;
                TL_payments.connectedBotStarRef connectedbotstarref = this.h;
                if (connectedbotstarref.revoked) {
                    int i10 = this.f47728b;
                    TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(connectedbotstarref.bot_id));
                    if (user != null) {
                        MessagesController.getInstance(i10).loadFullUser(user, 0, true, new s2(this.f47729c, this.f47731f, i10, this.f47730e, this.d, 0));
                        return;
                    }
                    return;
                }
                yx0Var.run();
                return;
            default:
                LinearLayout linearLayout = (LinearLayout) this.f47732n;
                int i11 = this.f47728b;
                mh.a0 g10 = mh.a0.g(i11);
                g10.n();
                g10.o();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = g10.f13674j;
                if (arrayList2 != null) {
                    arrayList.addAll(arrayList2);
                }
                ArrayList arrayList3 = g10.f13676l;
                if (arrayList3 != null) {
                    arrayList.addAll(arrayList3);
                }
                arrayList.add(0, UserConfig.getInstance(i11).getCurrentUser());
                org.telegram.ui.ActionBar.h3 h3Var = this.f47729c;
                ViewGroup containerView = h3Var.getContainerView();
                g6 g6Var = this.d;
                q70 F = q70.F(containerView, g6Var, linearLayout);
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    int i13 = i12 + 1;
                    TLObject tLObject = (TLObject) arrayList.get(i12);
                    if (tLObject instanceof TLRPC.User) {
                        j10 = ((TLRPC.User) tLObject).f20990id;
                    } else {
                        if (tLObject instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                            if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                                j10 = -chat.f20843id;
                            }
                        }
                        i12 = i13;
                    }
                    if (j10 == this.f47730e) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    F.g(tLObject, z4, new u6(i11, j10, this.f47731f, this.h, h3Var, g6Var));
                    i12 = i13;
                }
                F.f30330t = false;
                F.f30329s = 0;
                F.V(5);
                F.a0(AndroidUtilities.dp(24.0f), 0.0f);
                F.Z();
                return;
        }
    }

    public u2(TL_payments.connectedBotStarRef connectedbotstarref, int i10, org.telegram.ui.ActionBar.h3 h3Var, Context context, long j10, g6 g6Var, yx0 yx0Var) {
        this.h = connectedbotstarref;
        this.f47728b = i10;
        this.f47729c = h3Var;
        this.f47731f = context;
        this.f47730e = j10;
        this.d = g6Var;
        this.f47732n = yx0Var;
    }
}
