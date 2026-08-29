package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rq implements aq {
    public final int f42182a;
    public final long f42183b;
    public final int f42184c;
    public final boolean d;
    public final boolean[] f42185e;
    public final jr f42186f;

    public rq(jr jrVar, int i10, long j10, int i11, boolean z10, boolean[] zArr) {
        this.f42186f = jrVar;
        this.f42182a = i10;
        this.f42183b = j10;
        this.f42184c = i11;
        this.d = z10;
        this.f42185e = zArr;
    }

    @Override
    public final void a(TLRPC.User user) {
        jr.c0(this.f42186f, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.ChatParticipant tL_chatParticipant;
        TLRPC.ChannelParticipant tL_channelParticipant;
        jr jrVar = this.f42186f;
        ArrayList arrayList = jrVar.B;
        long j10 = this.f42183b;
        int i11 = this.f42182a;
        if (i11 == 0) {
            int i12 = 0;
            while (true) {
                if (i12 >= arrayList.size()) {
                    break;
                }
                TLObject tLObject = (TLObject) arrayList.get(i12);
                if (tLObject instanceof TLRPC.ChannelParticipant) {
                    if (MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer) == j10) {
                        if (i10 == 1) {
                            tL_channelParticipant = new TLRPC.TL_channelParticipantAdmin();
                        } else {
                            tL_channelParticipant = new TLRPC.TL_channelParticipant();
                        }
                        tL_channelParticipant.admin_rights = tL_chatAdminRights;
                        tL_channelParticipant.banned_rights = tL_chatBannedRights;
                        tL_channelParticipant.inviter_id = jrVar.getUserConfig().getClientUserId();
                        if (j10 > 0) {
                            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                            tL_channelParticipant.peer = tL_peerUser;
                            tL_peerUser.user_id = j10;
                        } else {
                            TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                            tL_channelParticipant.peer = tL_peerChannel;
                            tL_peerChannel.channel_id = -j10;
                        }
                        tL_channelParticipant.date = this.f42184c;
                        tL_channelParticipant.flags |= 4;
                        tL_channelParticipant.rank = str;
                        arrayList.set(i12, tL_channelParticipant);
                    }
                } else if (tLObject instanceof TLRPC.ChatParticipant) {
                    TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) tLObject;
                    if (i10 == 1) {
                        tL_chatParticipant = new TLRPC.TL_chatParticipantAdmin();
                    } else {
                        tL_chatParticipant = new TLRPC.TL_chatParticipant();
                    }
                    tL_chatParticipant.user_id = chatParticipant.user_id;
                    tL_chatParticipant.date = chatParticipant.date;
                    tL_chatParticipant.inviter_id = chatParticipant.inviter_id;
                    int indexOf = jrVar.f39659s.participants.participants.indexOf(chatParticipant);
                    if (indexOf >= 0) {
                        jrVar.f39659s.participants.participants.set(indexOf, tL_chatParticipant);
                    }
                    jrVar.r0();
                }
                i12++;
            }
            if (i10 == 1 && !this.d) {
                this.f42185e[0] = true;
            }
        } else if (i11 == 1 && i10 == 0) {
            jrVar.v0(j10);
        }
    }
}
