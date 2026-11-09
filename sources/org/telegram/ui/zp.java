package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zp implements jp {
    public final int f52639a;
    public final long f52640b;
    public final int f52641c;
    public final boolean d;
    public final boolean[] f52642e;
    public final qq f52643f;

    public zp(qq qqVar, int i7, long j3, int i10, boolean z9, boolean[] zArr) {
        this.f52643f = qqVar;
        this.f52639a = i7;
        this.f52640b = j3;
        this.f52641c = i10;
        this.d = z9;
        this.f52642e = zArr;
    }

    @Override
    public final void a(TLRPC.User user) {
        qq.h0(this.f52643f, user);
    }

    @Override
    public final void b(int i7, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.ChatParticipant tL_chatParticipant;
        TLRPC.ChannelParticipant tL_channelParticipant;
        qq qqVar = this.f52643f;
        ArrayList arrayList = qqVar.E;
        long j3 = this.f52640b;
        int i10 = this.f52639a;
        if (i10 == 0) {
            int i11 = 0;
            while (true) {
                if (i11 >= arrayList.size()) {
                    break;
                }
                TLObject tLObject = (TLObject) arrayList.get(i11);
                if (tLObject instanceof TLRPC.ChannelParticipant) {
                    if (org.telegram.messenger.ij.B1(((TLRPC.ChannelParticipant) tLObject).peer) == j3) {
                        if (i7 == 1) {
                            tL_channelParticipant = new TLRPC.TL_channelParticipantAdmin();
                        } else {
                            tL_channelParticipant = new TLRPC.TL_channelParticipant();
                        }
                        tL_channelParticipant.admin_rights = tL_chatAdminRights;
                        tL_channelParticipant.banned_rights = tL_chatBannedRights;
                        tL_channelParticipant.inviter_id = qqVar.getUserConfig().e();
                        if (j3 > 0) {
                            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                            tL_channelParticipant.peer = tL_peerUser;
                            tL_peerUser.user_id = j3;
                        } else {
                            TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                            tL_channelParticipant.peer = tL_peerChannel;
                            tL_peerChannel.channel_id = -j3;
                        }
                        tL_channelParticipant.date = this.f52641c;
                        tL_channelParticipant.flags |= 4;
                        tL_channelParticipant.rank = str;
                        arrayList.set(i11, tL_channelParticipant);
                    }
                } else if (tLObject instanceof TLRPC.ChatParticipant) {
                    TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) tLObject;
                    if (i7 == 1) {
                        tL_chatParticipant = new TLRPC.TL_chatParticipantAdmin();
                    } else {
                        tL_chatParticipant = new TLRPC.TL_chatParticipant();
                    }
                    tL_chatParticipant.user_id = chatParticipant.user_id;
                    tL_chatParticipant.date = chatParticipant.date;
                    tL_chatParticipant.inviter_id = chatParticipant.inviter_id;
                    int indexOf = qqVar.f49152r.participants.participants.indexOf(chatParticipant);
                    if (indexOf >= 0) {
                        qqVar.f49152r.participants.participants.set(indexOf, tL_chatParticipant);
                    }
                    qqVar.w0();
                }
                i11++;
            }
            if (i7 == 1 && !this.d) {
                this.f52642e[0] = true;
            }
        } else if (i10 == 1 && i7 == 0) {
            qqVar.A0(j3);
        }
    }
}
