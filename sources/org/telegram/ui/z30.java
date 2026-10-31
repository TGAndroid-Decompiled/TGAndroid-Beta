package org.telegram.ui;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class z30 implements org.telegram.ui.ActionBar.u1, org.telegram.ui.Components.i70 {
    public final f40 f44003a;

    public z30(f40 f40Var) {
        this.f44003a = f40Var;
    }

    @Override
    public void a(TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12) {
        TLObject L0;
        b50 b50Var = this.f44003a.f37176b;
        org.telegram.messenger.u3 u3Var = b50Var.R2;
        org.telegram.messenger.c cVar = b50Var.f36036k1;
        if (u3Var != null) {
            boolean z13 = inputPeer instanceof TLRPC.TL_inputPeerUser;
            if (z13) {
                L0 = org.telegram.messenger.vp.r1(cVar.f14863a).Z1(Long.valueOf(inputPeer.user_id));
            } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                L0 = org.telegram.messenger.vp.r1(cVar.f14863a).L0(Long.valueOf(inputPeer.chat_id));
            } else {
                L0 = org.telegram.messenger.vp.r1(cVar.f14863a).L0(Long.valueOf(inputPeer.channel_id));
            }
            TLObject tLObject = L0;
            if (b50Var.R2.j()) {
                b50Var.m1().k(0L, 37, tLObject, b50Var.Q2, null, null);
                if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                    TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                    b50Var.f36069r2 = tL_peerChannel;
                    tL_peerChannel.channel_id = inputPeer.channel_id;
                } else if (z13) {
                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                    b50Var.f36069r2 = tL_peerUser;
                    tL_peerUser.user_id = inputPeer.user_id;
                } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                    TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                    b50Var.f36069r2 = tL_peerChat;
                    tL_peerChat.chat_id = inputPeer.chat_id;
                }
                b50Var.P2 = inputPeer;
                TLRPC.ChatFull M0 = org.telegram.messenger.vp.r1(cVar.f14863a).M0(b50Var.k1());
                if (M0 != null) {
                    M0.groupcall_default_join_as = b50Var.f36069r2;
                    if (M0 instanceof TLRPC.TL_chatFull) {
                        M0.flags |= 32768;
                    } else {
                        M0.flags |= 67108864;
                    }
                }
                TL_phone.saveDefaultGroupCallJoinAs savedefaultgroupcalljoinas = new TL_phone.saveDefaultGroupCallJoinAs();
                savedefaultgroupcalljoinas.peer = org.telegram.messenger.vp.k1(b50Var.Q2);
                savedefaultgroupcalljoinas.join_as = inputPeer;
                ConnectionsManager.getInstance(cVar.f14863a).sendRequest(savedefaultgroupcalljoinas, new ag.c3(4));
                b50Var.L1();
            } else if (VoIPService.getSharedInstance() != null && z10) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) b50Var.R2.d.f(org.telegram.messenger.jj.C1(b50Var.f36069r2));
                VoIPService.getSharedInstance().setGroupCallPeer(inputPeer);
                b50Var.f36074s2 = tLObject;
            }
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        f40 f40Var = this.f44003a;
        b50 b50Var = f40Var.f37176b;
        org.telegram.messenger.u3 u3Var = b50Var.R2;
        org.telegram.messenger.c cVar = b50Var.f36036k1;
        if (u3Var.j()) {
            int i11 = cVar.f14863a;
            TLRPC.ChatFull M0 = org.telegram.messenger.vp.r1(i11).M0(b50Var.k1());
            if (M0 != null) {
                M0.flags &= -2097153;
                M0.call = null;
                org.telegram.messenger.zs.f(i11).k(org.telegram.messenger.zs.f19713w2, Long.valueOf(b50Var.k1()), Long.valueOf(b50Var.R2.f18228b.f19803id), Boolean.FALSE);
            }
            TL_phone.discardGroupCall discardgroupcall = new TL_phone.discardGroupCall();
            org.telegram.messenger.u3 u3Var2 = b50Var.R2;
            discardgroupcall.call = u3Var2.g(u3Var2.f18227a);
            ConnectionsManager.getInstance(i11).sendRequest(discardgroupcall, new k(f40Var, 9));
        } else if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().hangUp(1);
        }
        b50Var.dismiss();
        org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.f19706v2, new Object[0]);
    }
}
