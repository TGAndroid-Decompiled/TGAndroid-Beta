package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class uy0 implements aq {
    public final int f43369a;
    public final TLRPC.ChatParticipant f43370b;
    public final boolean f43371c;
    public final boolean[] d;
    public final ProfileActivity f43372e;

    public uy0(ProfileActivity profileActivity, int i10, TLRPC.ChatParticipant chatParticipant, boolean z10, boolean[] zArr) {
        this.f43372e = profileActivity;
        this.f43369a = i10;
        this.f43370b = chatParticipant;
        this.f43371c = z10;
        this.d = zArr;
    }

    @Override
    public final void a(TLRPC.User user) {
        int i10;
        ProfileActivity profileActivity = this.f43372e;
        UndoView undoView = profileActivity.I;
        long j10 = -profileActivity.f35993b1;
        if (profileActivity.A2.megagroup) {
            i10 = 10;
        } else {
            i10 = 9;
        }
        undoView.m(j10, user, i10);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.ChatFull chatFull;
        boolean z10;
        TLRPC.ChatParticipant tL_chatParticipant;
        int i11 = 0;
        TLRPC.ChatParticipant chatParticipant = this.f43370b;
        ProfileActivity profileActivity = this.f43372e;
        int i12 = this.f43369a;
        if (i12 == 0) {
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
                if (i10 == 1) {
                    tL_chatParticipant = new TLRPC.TL_chatParticipantAdmin();
                } else {
                    tL_chatParticipant = new TLRPC.TL_chatParticipant();
                }
                tL_chatParticipant.user_id = chatParticipant.user_id;
                tL_chatParticipant.date = chatParticipant.date;
                tL_chatParticipant.inviter_id = chatParticipant.inviter_id;
                int indexOf = profileActivity.f36099q2.participants.participants.indexOf(chatParticipant);
                if (indexOf >= 0) {
                    profileActivity.f36099q2.participants.participants.set(indexOf, tL_chatParticipant);
                }
            }
            if (i10 == 1 && !this.f43371c) {
                this.d[0] = true;
            }
        } else if (i12 == 1 && i10 == 0 && profileActivity.A2.megagroup && (chatFull = profileActivity.f36099q2) != null && chatFull.participants != null) {
            int i13 = 0;
            while (true) {
                if (i13 < profileActivity.f36099q2.participants.participants.size()) {
                    if (MessageObject.getPeerId(((TLRPC.TL_chatChannelParticipant) profileActivity.f36099q2.participants.participants.get(i13)).channelParticipant.peer) == chatParticipant.user_id) {
                        TLRPC.ChatFull chatFull2 = profileActivity.f36099q2;
                        chatFull2.participants_count--;
                        chatFull2.participants.participants.remove(i13);
                        z10 = true;
                        break;
                    }
                    i13++;
                } else {
                    z10 = false;
                    break;
                }
            }
            TLRPC.ChatFull chatFull3 = profileActivity.f36099q2;
            if (chatFull3 != null && chatFull3.participants != null) {
                while (true) {
                    if (i11 >= profileActivity.f36099q2.participants.participants.size()) {
                        break;
                    } else if (profileActivity.f36099q2.participants.participants.get(i11).user_id == chatParticipant.user_id) {
                        profileActivity.f36099q2.participants.participants.remove(i11);
                        z10 = true;
                        break;
                    } else {
                        i11++;
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
