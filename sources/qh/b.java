package qh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.w41;
public final class b implements Utilities.Callback2 {
    public final int f46681a;
    public final g f46682b;

    public b(g gVar, int i10) {
        this.f46681a = i10;
        this.f46682b = gVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        String string;
        int i10;
        switch (this.f46681a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                k51 k51Var = (k51) obj2;
                g gVar = this.f46682b;
                f fVar = gVar.f46704f;
                w41 w41Var = new w41(-4);
                w41Var.d = 0;
                w41Var.f34293c = fVar;
                w41Var.f34313z = -1;
                arrayList.add(w41Var);
                w41 c3 = w41.c(1, R.drawable.msg_groups_create, LocaleController.getString(R.string.CommunityCreateCommunity));
                c3.f34305q = true;
                arrayList.add(c3);
                arrayList.add(w41.D(2, AndroidUtilities.dp(14.0f)));
                ArrayList arrayList2 = gVar.h;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    arrayList.add(w41.s(3, LocaleController.getString(R.string.CommunityAddToExistingCommunity)));
                    ArrayList arrayList3 = gVar.h;
                    int size = arrayList3.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj3 = arrayList3.get(i11);
                        i11++;
                        TLRPC.Chat chat = (TLRPC.Chat) obj3;
                        TLRPC.ChatFull chatFull = gVar.getMessagesController().getChatFull(chat.f22392id);
                        w41 v = w41.v(chat);
                        long j10 = chat.f22392id;
                        v.d = (int) (j10 ^ (j10 >>> 32));
                        if (chatFull != null) {
                            ArrayList<TL_communities.CommunityPeer> arrayList4 = chatFull.linked_peers;
                            if (arrayList4 != null) {
                                i10 = arrayList4.size();
                            } else {
                                i10 = 0;
                            }
                            string = LocaleController.formatPluralString("Chats", i10, new Object[0]);
                        } else {
                            string = LocaleController.getString(R.string.Loading);
                        }
                        v.f34301m = string;
                        arrayList.add(v);
                    }
                    return;
                }
                return;
            default:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                g gVar2 = this.f46682b;
                if (tL_error != null) {
                    gVar2.getClass();
                    tc.a0(gVar2).d0(tL_error, false);
                    return;
                }
                p0.d(gVar2, gVar2.f46700a, 0);
                return;
        }
    }
}
