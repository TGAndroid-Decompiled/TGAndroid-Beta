package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rf implements org.telegram.ui.Components.dj0 {
    public final int f42408a;
    public final qn f42409b;
    public final boolean f42410c;
    public final MessageObject d;

    public rf(qn qnVar, boolean z10, MessageObject messageObject, int i9) {
        this.f42408a = i9;
        this.f42409b = qnVar;
        this.f42410c = z10;
        this.d = messageObject;
    }

    @Override
    public final void e(long j10, TLRPC.MessagePeerReaction messagePeerReaction) {
        switch (this.f42408a) {
            case 0:
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    final qn qnVar = this.f42409b;
                    if (j10 != qnVar.getUserConfig().getClientUserId() && this.f42410c) {
                        final ArrayList arrayList = new ArrayList(1);
                        arrayList.add(this.d);
                        TLObject userOrChat = qnVar.getMessagesController().getUserOrChat(j10);
                        final ArrayList arrayList2 = new ArrayList(1);
                        arrayList2.add(userOrChat);
                        final TLRPC.ChannelParticipant[] channelParticipantArr = new TLRPC.ChannelParticipant[1];
                        TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                        tL_channels_getParticipant.channel = MessagesController.getInputChannel(qnVar.f41890e);
                        tL_channels_getParticipant.participant = MessagesController.getInputPeer(userOrChat);
                        qnVar.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new Object(), new Utilities.Callback2() {
                            @Override
                            public final void run(Object obj, Object obj2) {
                                TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                switch (r5) {
                                    case 0:
                                        qn qnVar2 = qnVar;
                                        TLRPC.ChannelParticipant[] channelParticipantArr2 = channelParticipantArr;
                                        if (tL_channels_channelParticipant != null) {
                                            qnVar2.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                            qnVar2.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                            channelParticipantArr2[0] = tL_channels_channelParticipant.participant;
                                        } else {
                                            qnVar2.getClass();
                                        }
                                        int i9 = qnVar2.N3;
                                        bg.d2 d2Var = new bg.d2(22);
                                        new org.telegram.ui.Components.wr(qnVar2, qnVar2.f41890e, arrayList, arrayList2, channelParticipantArr2, qnVar2.H6, (int) qnVar2.b(), i9, true, d2Var).show();
                                        return;
                                    default:
                                        qn qnVar3 = qnVar;
                                        TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr;
                                        if (tL_channels_channelParticipant != null) {
                                            qnVar3.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                            qnVar3.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                            channelParticipantArr3[0] = tL_channels_channelParticipant.participant;
                                        } else {
                                            qnVar3.getClass();
                                        }
                                        int i10 = qnVar3.N3;
                                        bg.d2 d2Var2 = new bg.d2(22);
                                        new org.telegram.ui.Components.wr(qnVar3, qnVar3.f41890e, arrayList, arrayList2, channelParticipantArr3, qnVar3.H6, (int) qnVar3.b(), i10, true, d2Var2).show();
                                        return;
                                }
                            }
                        });
                        qnVar.A7(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                final qn qnVar2 = this.f42409b;
                qnVar2.getClass();
                if (messagePeerReaction != null && messagePeerReaction.reaction != null && j10 != qnVar2.getUserConfig().getClientUserId() && this.f42410c) {
                    final ArrayList arrayList3 = new ArrayList(1);
                    arrayList3.add(this.d);
                    TLObject userOrChat2 = qnVar2.getMessagesController().getUserOrChat(j10);
                    final ArrayList arrayList4 = new ArrayList(1);
                    arrayList4.add(userOrChat2);
                    final TLRPC.ChannelParticipant[] channelParticipantArr2 = new TLRPC.ChannelParticipant[1];
                    TLRPC.TL_channels_getParticipant tL_channels_getParticipant2 = new TLRPC.TL_channels_getParticipant();
                    tL_channels_getParticipant2.channel = MessagesController.getInputChannel(qnVar2.f41890e);
                    tL_channels_getParticipant2.participant = MessagesController.getInputPeer(userOrChat2);
                    qnVar2.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant2, new Object(), new Utilities.Callback2() {
                        @Override
                        public final void run(Object obj, Object obj2) {
                            TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                            switch (r5) {
                                case 0:
                                    qn qnVar22 = qnVar2;
                                    TLRPC.ChannelParticipant[] channelParticipantArr22 = channelParticipantArr2;
                                    if (tL_channels_channelParticipant != null) {
                                        qnVar22.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                        qnVar22.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                        channelParticipantArr22[0] = tL_channels_channelParticipant.participant;
                                    } else {
                                        qnVar22.getClass();
                                    }
                                    int i9 = qnVar22.N3;
                                    bg.d2 d2Var = new bg.d2(22);
                                    new org.telegram.ui.Components.wr(qnVar22, qnVar22.f41890e, arrayList3, arrayList4, channelParticipantArr22, qnVar22.H6, (int) qnVar22.b(), i9, true, d2Var).show();
                                    return;
                                default:
                                    qn qnVar3 = qnVar2;
                                    TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr2;
                                    if (tL_channels_channelParticipant != null) {
                                        qnVar3.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                        qnVar3.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                        channelParticipantArr3[0] = tL_channels_channelParticipant.participant;
                                    } else {
                                        qnVar3.getClass();
                                    }
                                    int i10 = qnVar3.N3;
                                    bg.d2 d2Var2 = new bg.d2(22);
                                    new org.telegram.ui.Components.wr(qnVar3, qnVar3.f41890e, arrayList3, arrayList4, channelParticipantArr3, qnVar3.H6, (int) qnVar3.b(), i10, true, d2Var2).show();
                                    return;
                            }
                        }
                    });
                    qnVar2.A7(true);
                    return;
                }
                return;
        }
    }
}
