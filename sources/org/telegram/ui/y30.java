package org.telegram.ui;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class y30 implements org.telegram.ui.ActionBar.u1, org.telegram.ui.Components.i70 {
    public final e40 f43551a;

    public y30(e40 e40Var) {
        this.f43551a = e40Var;
    }

    @Override
    public void a(TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12) {
        TLObject L0;
        a50 a50Var = this.f43551a.f36726b;
        org.telegram.messenger.u3 u3Var = a50Var.R2;
        org.telegram.messenger.c cVar = a50Var.f35620k1;
        if (u3Var != null) {
            boolean z13 = inputPeer instanceof TLRPC.TL_inputPeerUser;
            if (z13) {
                L0 = org.telegram.messenger.wp.r1(cVar.f15043a).Z1(Long.valueOf(inputPeer.user_id));
            } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                L0 = org.telegram.messenger.wp.r1(cVar.f15043a).L0(Long.valueOf(inputPeer.chat_id));
            } else {
                L0 = org.telegram.messenger.wp.r1(cVar.f15043a).L0(Long.valueOf(inputPeer.channel_id));
            }
            TLObject tLObject = L0;
            if (a50Var.R2.j()) {
                a50Var.m1().k(0L, 37, tLObject, a50Var.Q2, null, null);
                if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                    TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                    a50Var.f35653r2 = tL_peerChannel;
                    tL_peerChannel.channel_id = inputPeer.channel_id;
                } else if (z13) {
                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                    a50Var.f35653r2 = tL_peerUser;
                    tL_peerUser.user_id = inputPeer.user_id;
                } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                    TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                    a50Var.f35653r2 = tL_peerChat;
                    tL_peerChat.chat_id = inputPeer.chat_id;
                }
                a50Var.P2 = inputPeer;
                TLRPC.ChatFull M0 = org.telegram.messenger.wp.r1(cVar.f15043a).M0(a50Var.k1());
                if (M0 != null) {
                    M0.groupcall_default_join_as = a50Var.f35653r2;
                    if (M0 instanceof TLRPC.TL_chatFull) {
                        M0.flags |= 32768;
                    } else {
                        M0.flags |= 67108864;
                    }
                }
                TL_phone.saveDefaultGroupCallJoinAs savedefaultgroupcalljoinas = new TL_phone.saveDefaultGroupCallJoinAs();
                savedefaultgroupcalljoinas.peer = org.telegram.messenger.wp.k1(a50Var.Q2);
                savedefaultgroupcalljoinas.join_as = inputPeer;
                ConnectionsManager.getInstance(cVar.f15043a).sendRequest(savedefaultgroupcalljoinas, new ag.c3(4));
                a50Var.L1();
            } else if (VoIPService.getSharedInstance() != null && z10) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) a50Var.R2.d.f(org.telegram.messenger.kj.C1(a50Var.f35653r2));
                VoIPService.getSharedInstance().setGroupCallPeer(inputPeer);
                a50Var.f35658s2 = tLObject;
            }
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        e40 e40Var = this.f43551a;
        a50 a50Var = e40Var.f36726b;
        org.telegram.messenger.u3 u3Var = a50Var.R2;
        org.telegram.messenger.c cVar = a50Var.f35620k1;
        if (u3Var.j()) {
            int i11 = cVar.f15043a;
            TLRPC.ChatFull M0 = org.telegram.messenger.wp.r1(i11).M0(a50Var.k1());
            if (M0 != null) {
                M0.flags &= -2097153;
                M0.call = null;
                org.telegram.messenger.at.f(i11).k(org.telegram.messenger.at.f14809w2, Long.valueOf(a50Var.k1()), Long.valueOf(a50Var.R2.f18361b.f19804id), Boolean.FALSE);
            }
            TL_phone.discardGroupCall discardgroupcall = new TL_phone.discardGroupCall();
            org.telegram.messenger.u3 u3Var2 = a50Var.R2;
            discardgroupcall.call = u3Var2.g(u3Var2.f18360a);
            ConnectionsManager.getInstance(i11).sendRequest(discardgroupcall, new k(e40Var, 9));
        } else if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().hangUp(1);
        }
        a50Var.dismiss();
        org.telegram.messenger.at.e().k(org.telegram.messenger.at.f14802v2, new Object[0]);
    }
}
