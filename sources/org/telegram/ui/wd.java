package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wd implements RequestDelegate {
    public final int f42939a;
    public final boolean f42940b;
    public final Object f42941c;
    public final Object d;

    public wd(Object obj, Object obj2, boolean z10, int i10) {
        this.f42939a = i10;
        this.f42941c = obj;
        this.d = obj2;
        this.f42940b = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        switch (this.f42939a) {
            case 0:
                org.telegram.messenger.i0.g3(new ag.n0((le) this.f42941c, tL_error, tLObject, (TwoStepVerificationActivity) this.d, this.f42940b, 5));
                return;
            case 1:
                org.telegram.messenger.i0.g3(new kp((org.telegram.ui.Components.rw0) this.f42941c, tLObject, this.f42940b, (org.telegram.ui.ActionBar.x1) this.d, 4));
                return;
            case 2:
                org.telegram.messenger.i0.g3(new ag.n0((ox) this.f42941c, tL_error, tLObject, (String) this.d, this.f42940b, 11));
                return;
            case 3:
                org.telegram.messenger.i0.g3(new kp((b50) this.f42941c, tLObject, (TLRPC.ChatFull) this.d, this.f42940b, 6));
                return;
            case 4:
                kg0 kg0Var = (kg0) this.f42941c;
                TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.d;
                if (tL_error == null) {
                    TLRPC.TL_messages_exportedChatInvites tL_messages_exportedChatInvites = (TLRPC.TL_messages_exportedChatInvites) tLObject;
                    if (tL_messages_exportedChatInvites.invites.size() > 0 && tL_chatInviteExported2 != null) {
                        for (int i10 = 0; i10 < tL_messages_exportedChatInvites.invites.size(); i10++) {
                            if (((TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.get(i10)).link.equals(tL_chatInviteExported2.link)) {
                                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.remove(i10);
                                org.telegram.messenger.i0.g3(new xf0(kg0Var, tL_chatInviteExported, tL_error, tLObject, this.f42940b, 0));
                                return;
                            }
                        }
                    }
                }
                tL_chatInviteExported = null;
                org.telegram.messenger.i0.g3(new xf0(kg0Var, tL_chatInviteExported, tL_error, tLObject, this.f42940b, 0));
                return;
            case 5:
                org.telegram.messenger.i0.g3(new ag.n0((sm0) this.f42941c, tL_error, this.f42940b, tLObject, (String) this.d, 13));
                return;
            case 6:
                org.telegram.messenger.i0.g3(new kp((rh.v5) this.f42941c, (int[]) this.d, tLObject, this.f42940b, 13));
                return;
            case 7:
                org.telegram.messenger.i0.g3(new kp((vh.e1) this.f42941c, tLObject, (String) this.d, this.f42940b, 15));
                return;
            default:
                zf.m1 m1Var = (zf.m1) this.f42941c;
                String str = (String) this.d;
                a0.h hVar = m1Var.h;
                ArrayList arrayList = m1Var.f55579g;
                int i11 = m1Var.f55584m;
                if (tL_error == null) {
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
                    m1Var.f55585n = str.toLowerCase();
                    org.telegram.messenger.vp.r1(i11).V3(tL_channels_channelParticipants.users, false);
                    org.telegram.messenger.vp.r1(i11).P3(tL_channels_channelParticipants.chats, false);
                    arrayList.clear();
                    hVar.b();
                    arrayList.addAll(tL_channels_channelParticipants.participants);
                    long e = org.telegram.messenger.d20.i(i11).e();
                    int size = tL_channels_channelParticipants.participants.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i12);
                        long C1 = org.telegram.messenger.jj.C1(channelParticipant.peer);
                        if (!this.f42940b && C1 == e) {
                            arrayList.remove(channelParticipant);
                        } else {
                            hVar.k(channelParticipant, C1);
                        }
                    }
                    return;
                }
                return;
        }
    }

    public wd(Object obj, boolean z10, Object obj2, int i10) {
        this.f42939a = i10;
        this.f42941c = obj;
        this.f42940b = z10;
        this.d = obj2;
    }
}
