package th;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.x51;
public final class b implements Utilities.Callback2 {
    public final int f48100a;
    public final g f48101b;

    public b(g gVar, int i10) {
        this.f48100a = i10;
        this.f48101b = gVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        String string;
        int i10;
        switch (this.f48100a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                x51 x51Var = (x51) obj2;
                g gVar = this.f48101b;
                f fVar = gVar.f48123f;
                j51 j51Var = new j51(-4);
                j51Var.d = 0;
                j51Var.f28007c = fVar;
                j51Var.f28027z = -1;
                arrayList.add(j51Var);
                j51 c3 = j51.c(1, R.drawable.msg_groups_create, LocaleController.getString(R.string.CommunityCreateCommunity));
                c3.f28019q = true;
                arrayList.add(c3);
                arrayList.add(j51.D(2, AndroidUtilities.dp(14.0f)));
                ArrayList arrayList2 = gVar.h;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    arrayList.add(j51.s(3, LocaleController.getString(R.string.CommunityAddToExistingCommunity)));
                    ArrayList arrayList3 = gVar.h;
                    int size = arrayList3.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj3 = arrayList3.get(i11);
                        i11++;
                        TLRPC.Chat chat = (TLRPC.Chat) obj3;
                        TLRPC.ChatFull chatFull = gVar.getMessagesController().getChatFull(chat.f20843id);
                        j51 v = j51.v(chat);
                        long j10 = chat.f20843id;
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
                        v.f28015m = string;
                        arrayList.add(v);
                    }
                    return;
                }
                return;
            default:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                g gVar2 = this.f48101b;
                if (tL_error != null) {
                    gVar2.getClass();
                    qc.a0(gVar2).d0(tL_error, false);
                    return;
                }
                o0.d(gVar2, gVar2.f48119a, 0);
                return;
        }
    }
}
