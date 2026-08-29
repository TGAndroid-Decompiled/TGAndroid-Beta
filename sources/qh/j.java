package qh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.w41;
public final class j implements Utilities.Callback2 {
    public final int f46723a;
    public final n f46724b;

    public j(n nVar, int i10) {
        this.f46723a = i10;
        this.f46724b = nVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        ArrayList<TL_communities.CommunityPeer> arrayList;
        String str;
        String str2;
        int i10;
        switch (this.f46723a) {
            case 0:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                n nVar = this.f46724b;
                nVar.getClass();
                if (tL_error != null) {
                    tc.a0(nVar).d0(tL_error, false);
                    return;
                }
                return;
            default:
                ArrayList arrayList2 = (ArrayList) obj;
                k51 k51Var = (k51) obj2;
                n nVar2 = this.f46724b;
                m mVar = nVar2.f46742r;
                w41 w41Var = new w41(-4);
                w41Var.d = 140;
                w41Var.f34293c = mVar;
                w41Var.f34313z = -1;
                arrayList2.add(w41Var);
                int i11 = 0;
                if (ChatObject.canUserDoAdminAction(nVar2.D, 1)) {
                    int i12 = R.drawable.outline_profile_photo;
                    if (ChatObject.hasPhoto(nVar2.D)) {
                        i10 = R.string.CommunitySettingsChangePhoto;
                    } else {
                        i10 = R.string.CommunitySettingsSetPhoto;
                    }
                    w41 c3 = w41.c(141, i12, LocaleController.getString(i10));
                    c3.f34305q = true;
                    arrayList2.add(c3);
                    arrayList2.add(w41.D(2, AndroidUtilities.dp(14.0f)));
                    arrayList2.add(w41.s(0, LocaleController.getString(R.string.CommunitySectionCommunityName)));
                    arrayList2.add(w41.j(7, nVar2.f46741n));
                    arrayList2.add(w41.D(1, AndroidUtilities.dp(14.0f)));
                }
                if (ChatObject.canBlockUsers(nVar2.D)) {
                    arrayList2.add(w41.s(3, LocaleController.getString(R.string.CommunitySectionWhoCanAddChats)));
                    w41 x4 = w41.x(150, LocaleController.getString(R.string.CommunityWhoCanAddChatsAllMembers), LocaleController.getString(R.string.CommunityWhoCanAddChatsAllMembersInfo));
                    x4.K(nVar2.h);
                    arrayList2.add(x4);
                    w41 x10 = w41.x(151, LocaleController.getString(R.string.CommunityWhoCanAddChatsOnlyAdmins), LocaleController.getString(R.string.CommunityWhoCanAddChatsOnlyAdminsInfo));
                    x10.K(!nVar2.h);
                    arrayList2.add(x10);
                    arrayList2.add(w41.D(4, AndroidUtilities.dp(14.0f)));
                }
                if (ChatObject.hasAdminRights(nVar2.D)) {
                    int i13 = R.drawable.msg_admins;
                    String string = LocaleController.getString(R.string.CommunityAdministrators);
                    TLRPC.ChatFull chatFull = nVar2.E;
                    String str3 = "";
                    if (chatFull == null) {
                        str = "";
                    } else {
                        str = Integer.toString(chatFull.admins_count);
                    }
                    arrayList2.add(w41.d(142, i13, string, str));
                    int i14 = R.drawable.community_requests_outline_24;
                    String string2 = LocaleController.getString(R.string.CommunityPendingRequests);
                    TLRPC.ChatFull chatFull2 = nVar2.E;
                    if (chatFull2 == null) {
                        str2 = "";
                    } else {
                        str2 = Integer.toString(chatFull2.requests_pending);
                    }
                    arrayList2.add(w41.d(143, i14, string2, str2));
                    int i15 = R.drawable.msg_user_remove;
                    String string3 = LocaleController.getString(R.string.CommunityRemovedUsers);
                    TLRPC.ChatFull chatFull3 = nVar2.E;
                    if (chatFull3 != null) {
                        str3 = Integer.toString(chatFull3.kicked_count);
                    }
                    arrayList2.add(w41.d(144, i15, string3, str3));
                }
                arrayList2.add(w41.D(5, AndroidUtilities.dp(14.0f)));
                w41 c6 = w41.c(146, R.drawable.msg_groups_create, LocaleController.getString(R.string.CommunityMenuAddChat));
                c6.f34305q = true;
                arrayList2.add(c6);
                TLRPC.ChatFull chatFull4 = nVar2.E;
                if (chatFull4 != null && (arrayList = chatFull4.linked_peers) != null) {
                    int size = arrayList.size();
                    while (i11 < size) {
                        TL_communities.CommunityPeer communityPeer = arrayList.get(i11);
                        i11++;
                        arrayList2.add(w41.v(nVar2.getMessagesController().getUserOrChat(DialogObject.getPeerDialogId(communityPeer.peer))));
                    }
                    return;
                }
                return;
        }
    }
}
