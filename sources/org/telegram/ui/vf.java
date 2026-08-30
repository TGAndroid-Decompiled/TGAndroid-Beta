package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vf implements org.telegram.ui.Components.xj0 {
    public final int f39157a;
    public final xn f39158b;
    public final boolean f39159c;
    public final MessageObject d;

    public vf(xn xnVar, boolean z4, MessageObject messageObject, int i10) {
        this.f39157a = i10;
        this.f39158b = xnVar;
        this.f39159c = z4;
        this.d = messageObject;
    }

    @Override
    public final void a(long j10, TLRPC.MessagePeerReaction messagePeerReaction) {
        switch (this.f39157a) {
            case 0:
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    final xn xnVar = this.f39158b;
                    if (j10 != xnVar.getUserConfig().getClientUserId() && this.f39159c) {
                        final ArrayList arrayList = new ArrayList(1);
                        arrayList.add(this.d);
                        TLObject userOrChat = xnVar.getMessagesController().getUserOrChat(j10);
                        final ArrayList arrayList2 = new ArrayList(1);
                        arrayList2.add(userOrChat);
                        final TLRPC.ChannelParticipant[] channelParticipantArr = new TLRPC.ChannelParticipant[1];
                        TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                        tL_channels_getParticipant.channel = MessagesController.getInputChannel(xnVar.e);
                        tL_channels_getParticipant.participant = MessagesController.getInputPeer(userOrChat);
                        xnVar.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new Object(), new Utilities.Callback2() {
                            @Override
                            public final void run(Object obj, Object obj2) {
                                TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                switch (r5) {
                                    case 0:
                                        xn xnVar2 = xnVar;
                                        TLRPC.ChannelParticipant[] channelParticipantArr2 = channelParticipantArr;
                                        if (tL_channels_channelParticipant != null) {
                                            xnVar2.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                            xnVar2.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                            channelParticipantArr2[0] = tL_channels_channelParticipant.participant;
                                        } else {
                                            xnVar2.getClass();
                                        }
                                        int i10 = xnVar2.O3;
                                        cg.n0 n0Var = new cg.n0(20);
                                        new org.telegram.ui.Components.es(xnVar2, xnVar2.e, arrayList, arrayList2, channelParticipantArr2, xnVar2.I6, (int) xnVar2.b(), i10, true, n0Var).show();
                                        return;
                                    default:
                                        xn xnVar3 = xnVar;
                                        TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr;
                                        if (tL_channels_channelParticipant != null) {
                                            xnVar3.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                            xnVar3.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                            channelParticipantArr3[0] = tL_channels_channelParticipant.participant;
                                        } else {
                                            xnVar3.getClass();
                                        }
                                        int i11 = xnVar3.O3;
                                        cg.n0 n0Var2 = new cg.n0(20);
                                        new org.telegram.ui.Components.es(xnVar3, xnVar3.e, arrayList, arrayList2, channelParticipantArr3, xnVar3.I6, (int) xnVar3.b(), i11, true, n0Var2).show();
                                        return;
                                }
                            }
                        });
                        xnVar.A7(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                final xn xnVar2 = this.f39158b;
                xnVar2.getClass();
                if (messagePeerReaction != null && messagePeerReaction.reaction != null && j10 != xnVar2.getUserConfig().getClientUserId() && this.f39159c) {
                    final ArrayList arrayList3 = new ArrayList(1);
                    arrayList3.add(this.d);
                    TLObject userOrChat2 = xnVar2.getMessagesController().getUserOrChat(j10);
                    final ArrayList arrayList4 = new ArrayList(1);
                    arrayList4.add(userOrChat2);
                    final TLRPC.ChannelParticipant[] channelParticipantArr2 = new TLRPC.ChannelParticipant[1];
                    TLRPC.TL_channels_getParticipant tL_channels_getParticipant2 = new TLRPC.TL_channels_getParticipant();
                    tL_channels_getParticipant2.channel = MessagesController.getInputChannel(xnVar2.e);
                    tL_channels_getParticipant2.participant = MessagesController.getInputPeer(userOrChat2);
                    xnVar2.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant2, new Object(), new Utilities.Callback2() {
                        @Override
                        public final void run(Object obj, Object obj2) {
                            TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                            switch (r5) {
                                case 0:
                                    xn xnVar22 = xnVar2;
                                    TLRPC.ChannelParticipant[] channelParticipantArr22 = channelParticipantArr2;
                                    if (tL_channels_channelParticipant != null) {
                                        xnVar22.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                        xnVar22.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                        channelParticipantArr22[0] = tL_channels_channelParticipant.participant;
                                    } else {
                                        xnVar22.getClass();
                                    }
                                    int i10 = xnVar22.O3;
                                    cg.n0 n0Var = new cg.n0(20);
                                    new org.telegram.ui.Components.es(xnVar22, xnVar22.e, arrayList3, arrayList4, channelParticipantArr22, xnVar22.I6, (int) xnVar22.b(), i10, true, n0Var).show();
                                    return;
                                default:
                                    xn xnVar3 = xnVar2;
                                    TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr2;
                                    if (tL_channels_channelParticipant != null) {
                                        xnVar3.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                        xnVar3.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                        channelParticipantArr3[0] = tL_channels_channelParticipant.participant;
                                    } else {
                                        xnVar3.getClass();
                                    }
                                    int i11 = xnVar3.O3;
                                    cg.n0 n0Var2 = new cg.n0(20);
                                    new org.telegram.ui.Components.es(xnVar3, xnVar3.e, arrayList3, arrayList4, channelParticipantArr3, xnVar3.I6, (int) xnVar3.b(), i11, true, n0Var2).show();
                                    return;
                            }
                        }
                    });
                    xnVar2.A7(true);
                    return;
                }
                return;
        }
    }
}
