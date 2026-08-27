package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class rq implements aq {

    public final int f42309a;

    public final long f42310b;

    public final int f42311c;
    public final boolean d;

    public final boolean[] f42312e;

    public final lr f42313f;

    public rq(lr lrVar, int i10, long j10, int i11, boolean z10, boolean[] zArr) {
        this.f42313f = lrVar;
        this.f42309a = i10;
        this.f42310b = j10;
        this.f42311c = i11;
        this.d = z10;
        this.f42312e = zArr;
    }

    @Override
    public final void a(TLRPC.User user) {
        lr.c0(this.f42313f, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        lr lrVar = this.f42313f;
        ArrayList arrayList = lrVar.B;
        long j10 = this.f42310b;
        int i11 = this.f42309a;
        if (i11 != 0) {
            if (i11 == 1 && i10 == 0) {
                lrVar.v0(j10);
                return;
            }
            return;
        }
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            TLObject tLObject = (TLObject) arrayList.get(i12);
            if (tLObject instanceof TLRPC.ChannelParticipant) {
                if (MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer) == j10) {
                    TLRPC.ChannelParticipant tL_channelParticipantAdmin = i10 == 1 ? new TLRPC.TL_channelParticipantAdmin() : new TLRPC.TL_channelParticipant();
                    tL_channelParticipantAdmin.admin_rights = tL_chatAdminRights;
                    tL_channelParticipantAdmin.banned_rights = tL_chatBannedRights;
                    tL_channelParticipantAdmin.inviter_id = lrVar.getUserConfig().getClientUserId();
                    if (j10 > 0) {
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        tL_channelParticipantAdmin.peer = tL_peerUser;
                        tL_peerUser.user_id = j10;
                    } else {
                        TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                        tL_channelParticipantAdmin.peer = tL_peerChannel;
                        tL_peerChannel.channel_id = -j10;
                    }
                    tL_channelParticipantAdmin.date = this.f42311c;
                    tL_channelParticipantAdmin.flags |= 4;
                    tL_channelParticipantAdmin.rank = str;
                    arrayList.set(i12, tL_channelParticipantAdmin);
                    break;
                }
            } else if (tLObject instanceof TLRPC.ChatParticipant) {
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) tLObject;
                TLRPC.ChatParticipant tL_chatParticipantAdmin = i10 == 1 ? new TLRPC.TL_chatParticipantAdmin() : new TLRPC.TL_chatParticipant();
                tL_chatParticipantAdmin.user_id = chatParticipant.user_id;
                tL_chatParticipantAdmin.date = chatParticipant.date;
                tL_chatParticipantAdmin.inviter_id = chatParticipant.inviter_id;
                int iIndexOf = lrVar.f40220s.participants.participants.indexOf(chatParticipant);
                if (iIndexOf >= 0) {
                    lrVar.f40220s.participants.participants.set(iIndexOf, tL_chatParticipantAdmin);
                }
                lrVar.r0();
            }
        }
        if (i10 != 1 || this.d) {
            return;
        }
        this.f42312e[0] = true;
    }
}
