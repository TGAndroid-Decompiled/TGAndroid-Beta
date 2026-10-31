package yh;

import java.util.ArrayList;
import org.telegram.messenger.cd;
import org.telegram.messenger.i0;
import org.telegram.messenger.j20;
import org.telegram.messenger.o5;
import org.telegram.messenger.w3;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.p51;
public final class h implements j20 {
    public final int f54493a;
    public final l f54494b;

    public h(l lVar, int i10) {
        this.f54493a = i10;
        this.f54494b = lVar;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        ArrayList<TL_communities.CommunityPeer> arrayList;
        String str;
        String str2;
        int i10;
        TLRPC.ChatPhoto chatPhoto;
        int i11 = this.f54493a;
        int i12 = 0;
        l lVar = this.f54494b;
        switch (i11) {
            case 0:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                lVar.getClass();
                if (tL_error != null) {
                    cc.a0(lVar).f0(tL_error, false);
                    return;
                }
                return;
            default:
                ArrayList arrayList2 = (ArrayList) obj;
                p51 p51Var = (p51) obj2;
                arrayList2.add(a51.l(140, lVar.f54504s));
                if (w3.y(1, lVar.I)) {
                    TLRPC.Chat chat = lVar.I;
                    if (chat != null && (chatPhoto = chat.photo) != null && !(chatPhoto instanceof TLRPC.TL_chatPhotoEmpty)) {
                        i10 = 2131751852;
                    } else {
                        i10 = 2131751851;
                    }
                    a51 c10 = a51.c(141, 2131232495, cd.L0(i10, null));
                    c10.f24297q = true;
                    arrayList2.add(c10);
                    arrayList2.add(a51.E(2, i0.L(14.0f)));
                    arrayList2.add(a51.t(0, cd.L0(2131751874, null)));
                    arrayList2.add(a51.j(7, lVar.f54503r));
                    arrayList2.add(a51.E(1, i0.L(14.0f)));
                }
                if (w3.w(2, lVar.I)) {
                    arrayList2.add(a51.t(3, cd.L0(2131751872, null)));
                    a51 y3 = a51.y(150, cd.L0(2131751843, null), cd.L0(2131751842, null));
                    y3.L(lVar.f54502n);
                    arrayList2.add(y3);
                    a51 y10 = a51.y(151, cd.L0(2131751841, null), cd.L0(2131751840, null));
                    y10.L(!lVar.f54502n);
                    arrayList2.add(y10);
                    arrayList2.add(a51.E(4, i0.L(14.0f)));
                }
                if (w3.N(lVar.I)) {
                    String L0 = cd.L0(2131751965, null);
                    TLRPC.ChatFull chatFull = lVar.J;
                    String str3 = "";
                    if (chatFull == null) {
                        str = "";
                    } else {
                        str = Integer.toString(chatFull.admins_count);
                    }
                    arrayList2.add(a51.d(142, 2131232048, L0, str));
                    String L02 = cd.L0(2131751895, null);
                    TLRPC.ChatFull chatFull2 = lVar.J;
                    if (chatFull2 == null) {
                        str2 = "";
                    } else {
                        str2 = Integer.toString(chatFull2.requests_pending);
                    }
                    arrayList2.add(a51.d(143, 2131231029, L02, str2));
                    String L03 = cd.L0(2131751881, null);
                    TLRPC.ChatFull chatFull3 = lVar.J;
                    if (chatFull3 != null) {
                        str3 = Integer.toString(chatFull3.kicked_count);
                    }
                    arrayList2.add(a51.d(144, 2131232414, L03, str3));
                }
                arrayList2.add(a51.E(5, i0.L(14.0f)));
                a51 c11 = a51.c(146, 2131232175, cd.L0(2131751918, null));
                c11.f24297q = true;
                arrayList2.add(c11);
                TLRPC.ChatFull chatFull4 = lVar.J;
                if (chatFull4 != null && (arrayList = chatFull4.linked_peers) != null) {
                    int size = arrayList.size();
                    while (i12 < size) {
                        TL_communities.CommunityPeer communityPeer = arrayList.get(i12);
                        i12++;
                        arrayList2.add(a51.w(lVar.getMessagesController().d2(o5.o(communityPeer.peer))));
                    }
                    return;
                }
                return;
        }
    }
}
