package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sq implements aq {
    public final int f41783a;
    public final long f41784b;
    public final int f41785c;
    public final boolean d;
    public final boolean[] e;
    public final jr f41786f;

    public sq(jr jrVar, int i10, long j10, int i11, boolean z10, boolean[] zArr) {
        this.f41786f = jrVar;
        this.f41783a = i10;
        this.f41784b = j10;
        this.f41785c = i11;
        this.d = z10;
        this.e = zArr;
    }

    @Override
    public final void a(TLRPC.User user) {
        jr.c0(this.f41786f, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.ChatParticipant tL_chatParticipant;
        TLRPC.ChannelParticipant tL_channelParticipant;
        jr jrVar = this.f41786f;
        ArrayList arrayList = jrVar.F;
        long j10 = this.f41784b;
        int i11 = this.f41783a;
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
                        tL_channelParticipant.date = this.f41785c;
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
                    int indexOf = jrVar.f38656s.participants.participants.indexOf(chatParticipant);
                    if (indexOf >= 0) {
                        jrVar.f38656s.participants.participants.set(indexOf, tL_chatParticipant);
                    }
                    jrVar.r0();
                }
                i12++;
            }
            if (i10 == 1 && !this.d) {
                this.e[0] = true;
            }
        } else if (i11 == 1 && i10 == 0) {
            jrVar.v0(j10);
        }
    }
}
