package ph;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import jh.t6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.j70;
import org.telegram.ui.lx0;
public final class u2 implements View.OnClickListener {
    public final int f46102a = 1;
    public final int f46103b;
    public final org.telegram.ui.ActionBar.f3 f46104c;
    public final c6 d;
    public final long f46105e;
    public final Context f46106f;
    public final TL_payments.connectedBotStarRef h;
    public final Object f46107n;

    public u2(int i10, org.telegram.ui.ActionBar.f3 f3Var, c6 c6Var, LinearLayout linearLayout, long j10, Context context, TL_payments.connectedBotStarRef connectedbotstarref) {
        this.f46103b = i10;
        this.f46104c = f3Var;
        this.d = c6Var;
        this.f46107n = linearLayout;
        this.f46105e = j10;
        this.f46106f = context;
        this.h = connectedbotstarref;
    }

    @Override
    public final void onClick(View view) {
        long j10;
        boolean z10;
        switch (this.f46102a) {
            case 0:
                lx0 lx0Var = (lx0) this.f46107n;
                TL_payments.connectedBotStarRef connectedbotstarref = this.h;
                if (connectedbotstarref.revoked) {
                    int i10 = this.f46103b;
                    TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(connectedbotstarref.bot_id));
                    if (user != null) {
                        MessagesController.getInstance(i10).loadFullUser(user, 0, true, new s2(this.f46104c, this.f46106f, i10, this.f46105e, this.d, 0));
                        return;
                    }
                    return;
                }
                lx0Var.run();
                return;
            default:
                LinearLayout linearLayout = (LinearLayout) this.f46107n;
                int i11 = this.f46103b;
                jh.b0 g10 = jh.b0.g(i11);
                g10.n();
                g10.o();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = g10.f11781j;
                if (arrayList2 != null) {
                    arrayList.addAll(arrayList2);
                }
                ArrayList arrayList3 = g10.f11783l;
                if (arrayList3 != null) {
                    arrayList.addAll(arrayList3);
                }
                arrayList.add(0, UserConfig.getInstance(i11).getCurrentUser());
                org.telegram.ui.ActionBar.f3 f3Var = this.f46104c;
                ViewGroup containerView = f3Var.getContainerView();
                c6 c6Var = this.d;
                j70 F = j70.F(containerView, c6Var, linearLayout);
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    int i13 = i12 + 1;
                    TLObject tLObject = (TLObject) arrayList.get(i12);
                    if (tLObject instanceof TLRPC.User) {
                        j10 = ((TLRPC.User) tLObject).f22539id;
                    } else {
                        if (tLObject instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                            if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                                j10 = -chat.f22392id;
                            }
                        }
                        i12 = i13;
                    }
                    if (j10 == this.f46105e) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    F.g(tLObject, z10, new t6(i11, j10, this.f46106f, this.h, f3Var, c6Var));
                    i12 = i13;
                }
                F.f29601t = false;
                F.f29600s = 0;
                F.V(5);
                F.a0(AndroidUtilities.dp(24.0f), 0.0f);
                F.Z();
                return;
        }
    }

    public u2(TL_payments.connectedBotStarRef connectedbotstarref, int i10, org.telegram.ui.ActionBar.f3 f3Var, Context context, long j10, c6 c6Var, lx0 lx0Var) {
        this.h = connectedbotstarref;
        this.f46103b = i10;
        this.f46104c = f3Var;
        this.f46106f = context;
        this.f46105e = j10;
        this.d = c6Var;
        this.f46107n = lx0Var;
    }
}
