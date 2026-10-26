package org.telegram.ui;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class s40 implements org.telegram.ui.ActionBar.b2, org.telegram.ui.Components.r80 {
    public final y40 f43353a;

    public s40(y40 y40Var) {
        this.f43353a = y40Var;
    }

    @Override
    public void a(TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12) {
        TLObject chat;
        v50 v50Var = this.f43353a.f45954b;
        ChatObject.Call call = v50Var.f44610a1;
        AccountInstance accountInstance = v50Var.d;
        if (call != null) {
            boolean z13 = inputPeer instanceof TLRPC.TL_inputPeerUser;
            if (z13) {
                chat = accountInstance.getMessagesController().getUser(Long.valueOf(inputPeer.user_id));
            } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                chat = accountInstance.getMessagesController().getChat(Long.valueOf(inputPeer.chat_id));
            } else {
                chat = accountInstance.getMessagesController().getChat(Long.valueOf(inputPeer.channel_id));
            }
            TLObject tLObject = chat;
            if (v50Var.f44610a1.isScheduled()) {
                v50Var.k1().k(0L, 37, tLObject, v50Var.Z0, null, null);
                if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                    TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                    v50Var.A0 = tL_peerChannel;
                    tL_peerChannel.channel_id = inputPeer.channel_id;
                } else if (z13) {
                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                    v50Var.A0 = tL_peerUser;
                    tL_peerUser.user_id = inputPeer.user_id;
                } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                    TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                    v50Var.A0 = tL_peerChat;
                    tL_peerChat.chat_id = inputPeer.chat_id;
                }
                v50Var.Y0 = inputPeer;
                TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(v50Var.i1());
                if (chatFull != null) {
                    chatFull.groupcall_default_join_as = v50Var.A0;
                    if (chatFull instanceof TLRPC.TL_chatFull) {
                        chatFull.flags |= 32768;
                    } else {
                        chatFull.flags |= 67108864;
                    }
                }
                TL_phone.saveDefaultGroupCallJoinAs savedefaultgroupcalljoinas = new TL_phone.saveDefaultGroupCallJoinAs();
                savedefaultgroupcalljoinas.peer = MessagesController.getInputPeer(v50Var.Z0);
                savedefaultgroupcalljoinas.join_as = inputPeer;
                accountInstance.getConnectionsManager().sendRequest(savedefaultgroupcalljoinas, new di.d6(8));
                v50Var.J1();
            } else if (VoIPService.getSharedInstance() != null && z10) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) v50Var.f44610a1.participants.f(MessageObject.getPeerId(v50Var.A0));
                VoIPService.getSharedInstance().setGroupCallPeer(inputPeer);
                v50Var.B0 = tLObject;
            }
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        y40 y40Var = this.f43353a;
        v50 v50Var = y40Var.f45954b;
        ChatObject.Call call = v50Var.f44610a1;
        AccountInstance accountInstance = v50Var.d;
        if (call.isScheduled()) {
            TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(v50Var.i1());
            if (chatFull != null) {
                chatFull.flags &= -2097153;
                chatFull.call = null;
                accountInstance.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallUpdated, Long.valueOf(v50Var.i1()), Long.valueOf(v50Var.f44610a1.call.f22037id), Boolean.FALSE);
            }
            TL_phone.discardGroupCall discardgroupcall = new TL_phone.discardGroupCall();
            discardgroupcall.call = v50Var.f44610a1.getInputGroupCall();
            accountInstance.getConnectionsManager().sendRequest(discardgroupcall, new l(y40Var, 9));
        } else if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().hangUp(1);
        }
        v50Var.dismiss();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didStartedCall, new Object[0]);
    }
}
