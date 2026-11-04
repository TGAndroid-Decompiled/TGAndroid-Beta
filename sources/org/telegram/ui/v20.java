package org.telegram.ui;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class v20 implements org.telegram.ui.ActionBar.p1, org.telegram.ui.Components.m60 {
    public final c30 f50368a;

    public v20(c30 c30Var) {
        this.f50368a = c30Var;
    }

    @Override
    public void a(TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12) {
        TLObject M0;
        x30 x30Var = this.f50368a.f44213b;
        org.telegram.messenger.r3 r3Var = x30Var.S2;
        org.telegram.messenger.c cVar = x30Var.f51759l1;
        if (r3Var != null) {
            boolean z13 = inputPeer instanceof TLRPC.TL_inputPeerUser;
            if (z13) {
                M0 = org.telegram.messenger.hp.s1(cVar.f21919a).a2(Long.valueOf(inputPeer.user_id));
            } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                M0 = org.telegram.messenger.hp.s1(cVar.f21919a).M0(Long.valueOf(inputPeer.chat_id));
            } else {
                M0 = org.telegram.messenger.hp.s1(cVar.f21919a).M0(Long.valueOf(inputPeer.channel_id));
            }
            TLObject tLObject = M0;
            if (x30Var.S2.j()) {
                x30Var.m1().k(0L, 37, tLObject, x30Var.R2, null, null);
                if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                    TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                    x30Var.f51792s2 = tL_peerChannel;
                    tL_peerChannel.channel_id = inputPeer.channel_id;
                } else if (z13) {
                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                    x30Var.f51792s2 = tL_peerUser;
                    tL_peerUser.user_id = inputPeer.user_id;
                } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                    TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                    x30Var.f51792s2 = tL_peerChat;
                    tL_peerChat.chat_id = inputPeer.chat_id;
                }
                x30Var.Q2 = inputPeer;
                TLRPC.ChatFull N0 = org.telegram.messenger.hp.s1(cVar.f21919a).N0(x30Var.k1());
                if (N0 != null) {
                    N0.groupcall_default_join_as = x30Var.f51792s2;
                    if (N0 instanceof TLRPC.TL_chatFull) {
                        N0.flags |= 32768;
                    } else {
                        N0.flags |= 67108864;
                    }
                }
                TL_phone.saveDefaultGroupCallJoinAs savedefaultgroupcalljoinas = new TL_phone.saveDefaultGroupCallJoinAs();
                savedefaultgroupcalljoinas.peer = org.telegram.messenger.hp.l1(x30Var.R2);
                savedefaultgroupcalljoinas.join_as = inputPeer;
                ConnectionsManager.getInstance(cVar.f21919a).sendRequest(savedefaultgroupcalljoinas, new ei.u5(9));
                x30Var.L1();
            } else if (VoIPService.getSharedInstance() != null && z10) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) x30Var.S2.d.f(org.telegram.messenger.zi.C1(x30Var.f51792s2));
                VoIPService.getSharedInstance().setGroupCallPeer(inputPeer);
                x30Var.f51797t2 = tLObject;
            }
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        c30 c30Var = this.f50368a;
        x30 x30Var = c30Var.f44213b;
        org.telegram.messenger.r3 r3Var = x30Var.S2;
        org.telegram.messenger.c cVar = x30Var.f51759l1;
        if (r3Var.j()) {
            int i10 = cVar.f21919a;
            TLRPC.ChatFull N0 = org.telegram.messenger.hp.s1(i10).N0(x30Var.k1());
            if (N0 != null) {
                N0.flags &= -2097153;
                N0.call = null;
                org.telegram.messenger.hs.f(i10).k(org.telegram.messenger.hs.f23328w2, Long.valueOf(x30Var.k1()), Long.valueOf(x30Var.S2.f25049b.f27011id), Boolean.FALSE);
            }
            TL_phone.discardGroupCall discardgroupcall = new TL_phone.discardGroupCall();
            org.telegram.messenger.r3 r3Var2 = x30Var.S2;
            discardgroupcall.call = r3Var2.g(r3Var2.f25048a);
            ConnectionsManager.getInstance(i10).sendRequest(discardgroupcall, new l(c30Var, 9));
        } else if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().hangUp(1);
        }
        x30Var.dismiss();
        org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.f23321v2, new Object[0]);
    }
}
