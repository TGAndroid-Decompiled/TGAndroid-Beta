package th;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.x51;
public final class j implements Utilities.Callback2 {
    public final int f48142a;
    public final n f48143b;

    public j(n nVar, int i10) {
        this.f48142a = i10;
        this.f48143b = nVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        ArrayList<TL_communities.CommunityPeer> arrayList;
        String str;
        String str2;
        int i10;
        switch (this.f48142a) {
            case 0:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                n nVar = this.f48143b;
                nVar.getClass();
                if (tL_error != null) {
                    qc.a0(nVar).d0(tL_error, false);
                    return;
                }
                return;
            default:
                ArrayList arrayList2 = (ArrayList) obj;
                x51 x51Var = (x51) obj2;
                n nVar2 = this.f48143b;
                m mVar = nVar2.f48158r;
                j51 j51Var = new j51(-4);
                j51Var.d = 140;
                j51Var.f28007c = mVar;
                j51Var.f28027z = -1;
                arrayList2.add(j51Var);
                int i11 = 0;
                if (ChatObject.canUserDoAdminAction(nVar2.E, 1)) {
                    int i12 = R.drawable.outline_profile_photo;
                    if (ChatObject.hasPhoto(nVar2.E)) {
                        i10 = R.string.CommunitySettingsChangePhoto;
                    } else {
                        i10 = R.string.CommunitySettingsSetPhoto;
                    }
                    j51 c3 = j51.c(141, i12, LocaleController.getString(i10));
                    c3.f28019q = true;
                    arrayList2.add(c3);
                    arrayList2.add(j51.D(2, AndroidUtilities.dp(14.0f)));
                    arrayList2.add(j51.s(0, LocaleController.getString(R.string.CommunitySectionCommunityName)));
                    arrayList2.add(j51.j(7, nVar2.f48157n));
                    arrayList2.add(j51.D(1, AndroidUtilities.dp(14.0f)));
                }
                if (ChatObject.canBlockUsers(nVar2.E)) {
                    arrayList2.add(j51.s(3, LocaleController.getString(R.string.CommunitySectionWhoCanAddChats)));
                    j51 x10 = j51.x(150, LocaleController.getString(R.string.CommunityWhoCanAddChatsAllMembers), LocaleController.getString(R.string.CommunityWhoCanAddChatsAllMembersInfo));
                    x10.K(nVar2.h);
                    arrayList2.add(x10);
                    j51 x11 = j51.x(151, LocaleController.getString(R.string.CommunityWhoCanAddChatsOnlyAdmins), LocaleController.getString(R.string.CommunityWhoCanAddChatsOnlyAdminsInfo));
                    x11.K(!nVar2.h);
                    arrayList2.add(x11);
                    arrayList2.add(j51.D(4, AndroidUtilities.dp(14.0f)));
                }
                if (ChatObject.hasAdminRights(nVar2.E)) {
                    int i13 = R.drawable.msg_admins;
                    String string = LocaleController.getString(R.string.CommunityAdministrators);
                    TLRPC.ChatFull chatFull = nVar2.F;
                    String str3 = "";
                    if (chatFull == null) {
                        str = "";
                    } else {
                        str = Integer.toString(chatFull.admins_count);
                    }
                    arrayList2.add(j51.d(142, i13, string, str));
                    int i14 = R.drawable.community_requests_outline_24;
                    String string2 = LocaleController.getString(R.string.CommunityPendingRequests);
                    TLRPC.ChatFull chatFull2 = nVar2.F;
                    if (chatFull2 == null) {
                        str2 = "";
                    } else {
                        str2 = Integer.toString(chatFull2.requests_pending);
                    }
                    arrayList2.add(j51.d(143, i14, string2, str2));
                    int i15 = R.drawable.msg_user_remove;
                    String string3 = LocaleController.getString(R.string.CommunityRemovedUsers);
                    TLRPC.ChatFull chatFull3 = nVar2.F;
                    if (chatFull3 != null) {
                        str3 = Integer.toString(chatFull3.kicked_count);
                    }
                    arrayList2.add(j51.d(144, i15, string3, str3));
                }
                arrayList2.add(j51.D(5, AndroidUtilities.dp(14.0f)));
                j51 c10 = j51.c(146, R.drawable.msg_groups_create, LocaleController.getString(R.string.CommunityMenuAddChat));
                c10.f28019q = true;
                arrayList2.add(c10);
                TLRPC.ChatFull chatFull4 = nVar2.F;
                if (chatFull4 != null && (arrayList = chatFull4.linked_peers) != null) {
                    int size = arrayList.size();
                    while (i11 < size) {
                        TL_communities.CommunityPeer communityPeer = arrayList.get(i11);
                        i11++;
                        arrayList2.add(j51.v(nVar2.getMessagesController().getUserOrChat(DialogObject.getPeerDialogId(communityPeer.peer))));
                    }
                    return;
                }
                return;
        }
    }
}
