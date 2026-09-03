package sh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.w51;
public final class b implements Utilities.Callback2 {
    public final int f44387a;
    public final g f44388b;

    public b(g gVar, int i10) {
        this.f44387a = i10;
        this.f44388b = gVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        String string;
        int i10;
        switch (this.f44387a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                w51 w51Var = (w51) obj2;
                g gVar = this.f44388b;
                f fVar = gVar.f44407f;
                i51 i51Var = new i51(-4);
                i51Var.d = 0;
                i51Var.f25579c = fVar;
                i51Var.f25598z = -1;
                arrayList.add(i51Var);
                i51 c3 = i51.c(1, R.drawable.msg_groups_create, LocaleController.getString(R.string.CommunityCreateCommunity));
                c3.f25590q = true;
                arrayList.add(c3);
                arrayList.add(i51.D(2, AndroidUtilities.dp(14.0f)));
                ArrayList arrayList2 = gVar.h;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    arrayList.add(i51.s(3, LocaleController.getString(R.string.CommunityAddToExistingCommunity)));
                    ArrayList arrayList3 = gVar.h;
                    int size = arrayList3.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj3 = arrayList3.get(i11);
                        i11++;
                        TLRPC.Chat chat = (TLRPC.Chat) obj3;
                        TLRPC.ChatFull chatFull = gVar.getMessagesController().getChatFull(chat.f19159id);
                        i51 v = i51.v(chat);
                        long j10 = chat.f19159id;
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
                        v.f25586m = string;
                        arrayList.add(v);
                    }
                    return;
                }
                return;
            default:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                g gVar2 = this.f44388b;
                if (tL_error != null) {
                    gVar2.getClass();
                    qc.a0(gVar2).d0(tL_error, false);
                    return;
                }
                o0.d(gVar2, gVar2.f44404a, 0);
                return;
        }
    }
}
