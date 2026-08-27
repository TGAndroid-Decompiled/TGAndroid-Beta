package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

public final class uy0 implements aq {

    public final int f43309a;

    public final TLRPC.ChatParticipant f43310b;

    public final boolean f43311c;
    public final boolean[] d;

    public final ProfileActivity f43312e;

    public uy0(ProfileActivity profileActivity, int i10, TLRPC.ChatParticipant chatParticipant, boolean z10, boolean[] zArr) {
        this.f43312e = profileActivity;
        this.f43309a = i10;
        this.f43310b = chatParticipant;
        this.f43311c = z10;
        this.d = zArr;
    }

    @Override
    public final void a(TLRPC.User user) {
        ProfileActivity profileActivity = this.f43312e;
        profileActivity.I.m(-profileActivity.f35929b1, user, profileActivity.A2.megagroup ? 10 : 9);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.ChatFull chatFull;
        boolean z10;
        TLRPC.ChatParticipant chatParticipant = this.f43310b;
        ProfileActivity profileActivity = this.f43312e;
        int i11 = this.f43309a;
        if (i11 == 0) {
            if (chatParticipant instanceof TLRPC.TL_chatChannelParticipant) {
                TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = (TLRPC.TL_chatChannelParticipant) chatParticipant;
                if (i10 == 1) {
                    TLRPC.TL_channelParticipantAdmin tL_channelParticipantAdmin = new TLRPC.TL_channelParticipantAdmin();
                    tL_chatChannelParticipant.channelParticipant = tL_channelParticipantAdmin;
                    tL_channelParticipantAdmin.flags |= 4;
                } else {
                    tL_chatChannelParticipant.channelParticipant = new TLRPC.TL_channelParticipant();
                }
                tL_chatChannelParticipant.channelParticipant.inviter_id = profileActivity.getUserConfig().getClientUserId();
                tL_chatChannelParticipant.channelParticipant.peer = new TLRPC.TL_peerUser();
                TLRPC.ChannelParticipant channelParticipant = tL_chatChannelParticipant.channelParticipant;
                channelParticipant.peer.user_id = chatParticipant.user_id;
                channelParticipant.date = chatParticipant.date;
                channelParticipant.banned_rights = tL_chatBannedRights;
                channelParticipant.admin_rights = tL_chatAdminRights;
                channelParticipant.rank = str;
            } else if (chatParticipant != null) {
                TLRPC.ChatParticipant tL_chatParticipantAdmin = i10 == 1 ? new TLRPC.TL_chatParticipantAdmin() : new TLRPC.TL_chatParticipant();
                tL_chatParticipantAdmin.user_id = chatParticipant.user_id;
                tL_chatParticipantAdmin.date = chatParticipant.date;
                tL_chatParticipantAdmin.inviter_id = chatParticipant.inviter_id;
                int iIndexOf = profileActivity.f36036q2.participants.participants.indexOf(chatParticipant);
                if (iIndexOf >= 0) {
                    profileActivity.f36036q2.participants.participants.set(iIndexOf, tL_chatParticipantAdmin);
                }
            }
            if (i10 != 1 || this.f43311c) {
                return;
            }
            this.d[0] = true;
            return;
        }
        if (i11 == 1 && i10 == 0 && profileActivity.A2.megagroup && (chatFull = profileActivity.f36036q2) != null && chatFull.participants != null) {
            int i12 = 0;
            while (true) {
                if (i12 >= profileActivity.f36036q2.participants.participants.size()) {
                    z10 = false;
                    break;
                } else {
                    if (MessageObject.getPeerId(((TLRPC.TL_chatChannelParticipant) profileActivity.f36036q2.participants.participants.get(i12)).channelParticipant.peer) == chatParticipant.user_id) {
                        TLRPC.ChatFull chatFull2 = profileActivity.f36036q2;
                        chatFull2.participants_count--;
                        chatFull2.participants.participants.remove(i12);
                        z10 = true;
                        break;
                    }
                    i12++;
                }
            }
            TLRPC.ChatFull chatFull3 = profileActivity.f36036q2;
            if (chatFull3 != null && chatFull3.participants != null) {
                for (int i13 = 0; i13 < profileActivity.f36036q2.participants.participants.size(); i13++) {
                    if (profileActivity.f36036q2.participants.participants.get(i13).user_id == chatParticipant.user_id) {
                        profileActivity.f36036q2.participants.participants.remove(i13);
                        z10 = true;
                        break;
                    }
                }
            }
            if (z10) {
                profileActivity.h5(true);
                profileActivity.j5();
                profileActivity.d.l();
            }
        }
    }
}
