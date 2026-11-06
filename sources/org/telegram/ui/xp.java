package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xp implements hp {
    public final int f51953a;
    public final long f51954b;
    public final int f51955c;
    public final boolean d;
    public final boolean[] f51956e;
    public final oq f51957f;

    public xp(oq oqVar, int i7, long j3, int i10, boolean z9, boolean[] zArr) {
        this.f51957f = oqVar;
        this.f51953a = i7;
        this.f51954b = j3;
        this.f51955c = i10;
        this.d = z9;
        this.f51956e = zArr;
    }

    @Override
    public final void a(TLRPC.User user) {
        oq.h0(this.f51957f, user);
    }

    @Override
    public final void b(int i7, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.ChatParticipant tL_chatParticipant;
        TLRPC.ChannelParticipant tL_channelParticipant;
        oq oqVar = this.f51957f;
        ArrayList arrayList = oqVar.E;
        long j3 = this.f51954b;
        int i10 = this.f51953a;
        if (i10 == 0) {
            int i11 = 0;
            while (true) {
                if (i11 >= arrayList.size()) {
                    break;
                }
                TLObject tLObject = (TLObject) arrayList.get(i11);
                if (tLObject instanceof TLRPC.ChannelParticipant) {
                    if (org.telegram.messenger.ij.C1(((TLRPC.ChannelParticipant) tLObject).peer) == j3) {
                        if (i7 == 1) {
                            tL_channelParticipant = new TLRPC.TL_channelParticipantAdmin();
                        } else {
                            tL_channelParticipant = new TLRPC.TL_channelParticipant();
                        }
                        tL_channelParticipant.admin_rights = tL_chatAdminRights;
                        tL_channelParticipant.banned_rights = tL_chatBannedRights;
                        tL_channelParticipant.inviter_id = oqVar.getUserConfig().e();
                        if (j3 > 0) {
                            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                            tL_channelParticipant.peer = tL_peerUser;
                            tL_peerUser.user_id = j3;
                        } else {
                            TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                            tL_channelParticipant.peer = tL_peerChannel;
                            tL_peerChannel.channel_id = -j3;
                        }
                        tL_channelParticipant.date = this.f51955c;
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
                    int indexOf = oqVar.f48506r.participants.participants.indexOf(chatParticipant);
                    if (indexOf >= 0) {
                        oqVar.f48506r.participants.participants.set(indexOf, tL_chatParticipant);
                    }
                    oqVar.w0();
                }
                i11++;
            }
            if (i7 == 1 && !this.d) {
                this.f51956e[0] = true;
            }
        } else if (i10 == 1 && i7 == 0) {
            oqVar.A0(j3);
        }
    }
}
