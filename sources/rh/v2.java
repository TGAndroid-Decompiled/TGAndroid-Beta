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
import org.telegram.ui.Components.o70;
import org.telegram.ui.wx0;
public final class v2 implements View.OnClickListener {
    public final int f43812a = 1;
    public final int f43813b;
    public final org.telegram.ui.ActionBar.g3 f43814c;
    public final f6 d;
    public final long e;
    public final Context f43815f;
    public final TL_payments.connectedBotStarRef h;
    public final Object f43816n;

    public v2(int i10, org.telegram.ui.ActionBar.g3 g3Var, f6 f6Var, LinearLayout linearLayout, long j10, Context context, TL_payments.connectedBotStarRef connectedbotstarref) {
        this.f43813b = i10;
        this.f43814c = g3Var;
        this.d = f6Var;
        this.f43816n = linearLayout;
        this.e = j10;
        this.f43815f = context;
        this.h = connectedbotstarref;
    }

    @Override
    public final void onClick(View view) {
        long j10;
        boolean z4;
        switch (this.f43812a) {
            case 0:
                wx0 wx0Var = (wx0) this.f43816n;
                TL_payments.connectedBotStarRef connectedbotstarref = this.h;
                if (connectedbotstarref.revoked) {
                    int i10 = this.f43813b;
                    TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(connectedbotstarref.bot_id));
                    if (user != null) {
                        MessagesController.getInstance(i10).loadFullUser(user, 0, true, new t2(this.f43814c, this.f43815f, i10, this.e, this.d, 0));
                        return;
                    }
                    return;
                }
                wx0Var.run();
                return;
            default:
                LinearLayout linearLayout = (LinearLayout) this.f43816n;
                int i11 = this.f43813b;
                lh.b0 g10 = lh.b0.g(i11);
                g10.n();
                g10.o();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = g10.f12137j;
                if (arrayList2 != null) {
                    arrayList.addAll(arrayList2);
                }
                ArrayList arrayList3 = g10.f12139l;
                if (arrayList3 != null) {
                    arrayList.addAll(arrayList3);
                }
                arrayList.add(0, UserConfig.getInstance(i11).getCurrentUser());
                org.telegram.ui.ActionBar.g3 g3Var = this.f43814c;
                ViewGroup containerView = g3Var.getContainerView();
                f6 f6Var = this.d;
                o70 F = o70.F(containerView, f6Var, linearLayout);
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    int i13 = i12 + 1;
                    TLObject tLObject = (TLObject) arrayList.get(i12);
                    if (tLObject instanceof TLRPC.User) {
                        j10 = ((TLRPC.User) tLObject).f19331id;
                    } else {
                        if (tLObject instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                            if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                                j10 = -chat.f19184id;
                            }
                        }
                        i12 = i13;
                    }
                    if (j10 == this.e) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    F.g(tLObject, z4, new u6(i11, j10, this.f43815f, this.h, g3Var, f6Var));
                    i12 = i13;
                }
                F.f27490t = false;
                F.f27489s = 0;
                F.V(5);
                F.a0(AndroidUtilities.dp(24.0f), 0.0f);
                F.Z();
                return;
        }
    }

    public v2(TL_payments.connectedBotStarRef connectedbotstarref, int i10, org.telegram.ui.ActionBar.g3 g3Var, Context context, long j10, f6 f6Var, wx0 wx0Var) {
        this.h = connectedbotstarref;
        this.f43813b = i10;
        this.f43814c = g3Var;
        this.f43815f = context;
        this.e = j10;
        this.d = f6Var;
        this.f43816n = wx0Var;
    }
}
