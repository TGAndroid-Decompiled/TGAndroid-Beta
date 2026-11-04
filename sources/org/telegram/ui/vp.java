package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vp implements fp {
    public final int f50571a;
    public final long f50572b;
    public final int f50573c;
    public final boolean d;
    public final boolean[] f50574e;
    public final nq f50575f;

    public vp(nq nqVar, int i3, long j10, int i10, boolean z10, boolean[] zArr) {
        this.f50575f = nqVar;
        this.f50571a = i3;
        this.f50572b = j10;
        this.f50573c = i10;
        this.d = z10;
        this.f50574e = zArr;
    }

    @Override
    public final void a(TLRPC.User user) {
        nq.h0(this.f50575f, user);
    }

    @Override
    public final void b(int i3, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.ChatParticipant tL_chatParticipant;
        TLRPC.ChannelParticipant tL_channelParticipant;
        nq nqVar = this.f50575f;
        ArrayList arrayList = nqVar.F;
        long j10 = this.f50572b;
        int i10 = this.f50571a;
        if (i10 == 0) {
            int i11 = 0;
            while (true) {
                if (i11 >= arrayList.size()) {
                    break;
                }
                TLObject tLObject = (TLObject) arrayList.get(i11);
                if (tLObject instanceof TLRPC.ChannelParticipant) {
                    if (org.telegram.messenger.zi.C1(((TLRPC.ChannelParticipant) tLObject).peer) == j10) {
                        if (i3 == 1) {
                            tL_channelParticipant = new TLRPC.TL_channelParticipantAdmin();
                        } else {
                            tL_channelParticipant = new TLRPC.TL_channelParticipant();
                        }
                        tL_channelParticipant.admin_rights = tL_chatAdminRights;
                        tL_channelParticipant.banned_rights = tL_chatBannedRights;
                        tL_channelParticipant.inviter_id = nqVar.getUserConfig().e();
                        if (j10 > 0) {
                            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                            tL_channelParticipant.peer = tL_peerUser;
                            tL_peerUser.user_id = j10;
                        } else {
                            TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                            tL_channelParticipant.peer = tL_peerChannel;
                            tL_peerChannel.channel_id = -j10;
                        }
                        tL_channelParticipant.date = this.f50573c;
                        tL_channelParticipant.flags |= 4;
                        tL_channelParticipant.rank = str;
                        arrayList.set(i11, tL_channelParticipant);
                    }
                } else if (tLObject instanceof TLRPC.ChatParticipant) {
                    TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) tLObject;
                    if (i3 == 1) {
                        tL_chatParticipant = new TLRPC.TL_chatParticipantAdmin();
                    } else {
                        tL_chatParticipant = new TLRPC.TL_chatParticipant();
                    }
                    tL_chatParticipant.user_id = chatParticipant.user_id;
                    tL_chatParticipant.date = chatParticipant.date;
                    tL_chatParticipant.inviter_id = chatParticipant.inviter_id;
                    int indexOf = nqVar.f48083r.participants.participants.indexOf(chatParticipant);
                    if (indexOf >= 0) {
                        nqVar.f48083r.participants.participants.set(indexOf, tL_chatParticipant);
                    }
                    nqVar.w0();
                }
                i11++;
            }
            if (i3 == 1 && !this.d) {
                this.f50574e[0] = true;
            }
        } else if (i10 == 1 && i3 == 0) {
            nqVar.A0(j10);
        }
    }
}
