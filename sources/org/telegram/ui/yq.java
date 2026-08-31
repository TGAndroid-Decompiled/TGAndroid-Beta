package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yq implements hq {
    public final int f43686a;
    public final long f43687b;
    public final int f43688c;
    public final boolean d;
    public final boolean[] f43689e;
    public final qr f43690f;

    public yq(qr qrVar, int i10, long j10, int i11, boolean z4, boolean[] zArr) {
        this.f43690f = qrVar;
        this.f43686a = i10;
        this.f43687b = j10;
        this.f43688c = i11;
        this.d = z4;
        this.f43689e = zArr;
    }

    @Override
    public final void a(TLRPC.User user) {
        qr.c0(this.f43690f, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.ChatParticipant tL_chatParticipant;
        TLRPC.ChannelParticipant tL_channelParticipant;
        qr qrVar = this.f43690f;
        ArrayList arrayList = qrVar.C;
        long j10 = this.f43687b;
        int i11 = this.f43686a;
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
                        tL_channelParticipant.inviter_id = qrVar.getUserConfig().getClientUserId();
                        if (j10 > 0) {
                            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                            tL_channelParticipant.peer = tL_peerUser;
                            tL_peerUser.user_id = j10;
                        } else {
                            TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                            tL_channelParticipant.peer = tL_peerChannel;
                            tL_peerChannel.channel_id = -j10;
                        }
                        tL_channelParticipant.date = this.f43688c;
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
                    int indexOf = qrVar.f40640s.participants.participants.indexOf(chatParticipant);
                    if (indexOf >= 0) {
                        qrVar.f40640s.participants.participants.set(indexOf, tL_chatParticipant);
                    }
                    qrVar.r0();
                }
                i12++;
            }
            if (i10 == 1 && !this.d) {
                this.f43689e[0] = true;
            }
        } else if (i11 == 1 && i10 == 0) {
            qrVar.v0(j10);
        }
    }
}
