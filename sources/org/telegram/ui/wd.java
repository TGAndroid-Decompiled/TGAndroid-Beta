package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wd implements RequestDelegate {
    public final int f42759a;
    public final boolean f42760b;
    public final Object f42761c;
    public final Object d;

    public wd(Object obj, Object obj2, boolean z10, int i10) {
        this.f42759a = i10;
        this.f42761c = obj;
        this.d = obj2;
        this.f42760b = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        switch (this.f42759a) {
            case 0:
                org.telegram.messenger.i0.g3(new ag.n0((le) this.f42761c, tL_error, tLObject, (TwoStepVerificationActivity) this.d, this.f42760b, 5));
                return;
            case 1:
                org.telegram.messenger.i0.g3(new kp((org.telegram.ui.Components.sw0) this.f42761c, tLObject, this.f42760b, (org.telegram.ui.ActionBar.x1) this.d, 4));
                return;
            case 2:
                org.telegram.messenger.i0.g3(new ag.n0((nx) this.f42761c, tL_error, tLObject, (String) this.d, this.f42760b, 11));
                return;
            case 3:
                org.telegram.messenger.i0.g3(new kp((a50) this.f42761c, tLObject, (TLRPC.ChatFull) this.d, this.f42760b, 6));
                return;
            case 4:
                ig0 ig0Var = (ig0) this.f42761c;
                TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.d;
                if (tL_error == null) {
                    TLRPC.TL_messages_exportedChatInvites tL_messages_exportedChatInvites = (TLRPC.TL_messages_exportedChatInvites) tLObject;
                    if (tL_messages_exportedChatInvites.invites.size() > 0 && tL_chatInviteExported2 != null) {
                        for (int i10 = 0; i10 < tL_messages_exportedChatInvites.invites.size(); i10++) {
                            if (((TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.get(i10)).link.equals(tL_chatInviteExported2.link)) {
                                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.remove(i10);
                                org.telegram.messenger.i0.g3(new vf0(ig0Var, tL_chatInviteExported, tL_error, tLObject, this.f42760b, 0));
                                return;
                            }
                        }
                    }
                }
                tL_chatInviteExported = null;
                org.telegram.messenger.i0.g3(new vf0(ig0Var, tL_chatInviteExported, tL_error, tLObject, this.f42760b, 0));
                return;
            case 5:
                org.telegram.messenger.i0.g3(new ag.n0((qm0) this.f42761c, tL_error, this.f42760b, tLObject, (String) this.d, 13));
                return;
            case 6:
                org.telegram.messenger.i0.g3(new kp((rh.v5) this.f42761c, (int[]) this.d, tLObject, this.f42760b, 13));
                return;
            case 7:
                org.telegram.messenger.i0.g3(new kp((vh.e1) this.f42761c, tLObject, (String) this.d, this.f42760b, 15));
                return;
            default:
                zf.m1 m1Var = (zf.m1) this.f42761c;
                String str = (String) this.d;
                a0.h hVar = m1Var.h;
                ArrayList arrayList = m1Var.f55597g;
                int i11 = m1Var.f55602m;
                if (tL_error == null) {
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
                    m1Var.f55603n = str.toLowerCase();
                    org.telegram.messenger.wp.r1(i11).V3(tL_channels_channelParticipants.users, false);
                    org.telegram.messenger.wp.r1(i11).P3(tL_channels_channelParticipants.chats, false);
                    arrayList.clear();
                    hVar.b();
                    arrayList.addAll(tL_channels_channelParticipants.participants);
                    long e = org.telegram.messenger.e20.i(i11).e();
                    int size = tL_channels_channelParticipants.participants.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i12);
                        long C1 = org.telegram.messenger.kj.C1(channelParticipant.peer);
                        if (!this.f42760b && C1 == e) {
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
        this.f42759a = i10;
        this.f42761c = obj;
        this.f42760b = z10;
        this.d = obj2;
    }
}
