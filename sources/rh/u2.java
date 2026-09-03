package rh;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import lh.u6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.p70;
import org.telegram.ui.dy0;
public final class u2 implements View.OnClickListener {
    public final int f43864a = 1;
    public final int f43865b;
    public final org.telegram.ui.ActionBar.g3 f43866c;
    public final f6 d;
    public final long e;
    public final Context f43867f;
    public final TL_payments.connectedBotStarRef h;
    public final Object f43868n;

    public u2(int i10, org.telegram.ui.ActionBar.g3 g3Var, f6 f6Var, LinearLayout linearLayout, long j10, Context context, TL_payments.connectedBotStarRef connectedbotstarref) {
        this.f43865b = i10;
        this.f43866c = g3Var;
        this.d = f6Var;
        this.f43868n = linearLayout;
        this.e = j10;
        this.f43867f = context;
        this.h = connectedbotstarref;
    }

    @Override
    public final void onClick(View view) {
        long j10;
        boolean z4;
        switch (this.f43864a) {
            case 0:
                dy0 dy0Var = (dy0) this.f43868n;
                TL_payments.connectedBotStarRef connectedbotstarref = this.h;
                if (connectedbotstarref.revoked) {
                    int i10 = this.f43865b;
                    TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(connectedbotstarref.bot_id));
                    if (user != null) {
                        MessagesController.getInstance(i10).loadFullUser(user, 0, true, new s2(this.f43866c, this.f43867f, i10, this.e, this.d, 0));
                        return;
                    }
                    return;
                }
                dy0Var.run();
                return;
            default:
                LinearLayout linearLayout = (LinearLayout) this.f43868n;
                int i11 = this.f43865b;
                lh.b0 g10 = lh.b0.g(i11);
                g10.n();
                g10.o();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = g10.f12121j;
                if (arrayList2 != null) {
                    arrayList.addAll(arrayList2);
                }
                ArrayList arrayList3 = g10.f12123l;
                if (arrayList3 != null) {
                    arrayList.addAll(arrayList3);
                }
                arrayList.add(0, UserConfig.getInstance(i11).getCurrentUser());
                org.telegram.ui.ActionBar.g3 g3Var = this.f43866c;
                ViewGroup containerView = g3Var.getContainerView();
                f6 f6Var = this.d;
                p70 F = p70.F(containerView, f6Var, linearLayout);
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    int i13 = i12 + 1;
                    TLObject tLObject = (TLObject) arrayList.get(i12);
                    if (tLObject instanceof TLRPC.User) {
                        j10 = ((TLRPC.User) tLObject).f19306id;
                    } else {
                        if (tLObject instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                            if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                                j10 = -chat.f19159id;
                            }
                        }
                        i12 = i13;
                    }
                    if (j10 == this.e) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    F.g(tLObject, z4, new u6(i11, j10, this.f43867f, this.h, g3Var, f6Var));
                    i12 = i13;
                }
                F.f27778t = false;
                F.f27777s = 0;
                F.V(5);
                F.a0(AndroidUtilities.dp(24.0f), 0.0f);
                F.Z();
                return;
        }
    }

    public u2(TL_payments.connectedBotStarRef connectedbotstarref, int i10, org.telegram.ui.ActionBar.g3 g3Var, Context context, long j10, f6 f6Var, dy0 dy0Var) {
        this.h = connectedbotstarref;
        this.f43865b = i10;
        this.f43866c = g3Var;
        this.f43867f = context;
        this.e = j10;
        this.d = f6Var;
        this.f43868n = dy0Var;
    }
}
