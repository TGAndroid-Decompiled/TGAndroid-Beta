package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class uf implements org.telegram.ui.Components.mk0 {
    public final int f41951a;
    public final qn f41952b;
    public final boolean f41953c;
    public final MessageObject d;

    public uf(qn qnVar, boolean z10, MessageObject messageObject, int i10) {
        this.f41951a = i10;
        this.f41952b = qnVar;
        this.f41953c = z10;
        this.d = messageObject;
    }

    @Override
    public final void c(long j10, TLRPC.MessagePeerReaction messagePeerReaction) {
        switch (this.f41951a) {
            case 0:
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    final qn qnVar = this.f41952b;
                    if (j10 != qnVar.getUserConfig().getClientUserId() && this.f41953c) {
                        final ArrayList arrayList = new ArrayList(1);
                        arrayList.add(this.d);
                        TLObject userOrChat = qnVar.getMessagesController().getUserOrChat(j10);
                        final ArrayList arrayList2 = new ArrayList(1);
                        arrayList2.add(userOrChat);
                        final TLRPC.ChannelParticipant[] channelParticipantArr = new TLRPC.ChannelParticipant[1];
                        TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                        tL_channels_getParticipant.channel = MessagesController.getInputChannel(qnVar.e);
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
                                        int i10 = qnVar2.R3;
                                        ah.j jVar = new ah.j(22);
                                        new org.telegram.ui.Components.ps(qnVar2, qnVar2.e, arrayList, arrayList2, channelParticipantArr2, qnVar2.L6, (int) qnVar2.d(), i10, true, jVar).show();
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
                                        int i11 = qnVar3.R3;
                                        ah.j jVar2 = new ah.j(22);
                                        new org.telegram.ui.Components.ps(qnVar3, qnVar3.e, arrayList, arrayList2, channelParticipantArr3, qnVar3.L6, (int) qnVar3.d(), i11, true, jVar2).show();
                                        return;
                                }
                            }
                        });
                        qnVar.D7(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                final qn qnVar2 = this.f41952b;
                qnVar2.getClass();
                if (messagePeerReaction != null && messagePeerReaction.reaction != null && j10 != qnVar2.getUserConfig().getClientUserId() && this.f41953c) {
                    final ArrayList arrayList3 = new ArrayList(1);
                    arrayList3.add(this.d);
                    TLObject userOrChat2 = qnVar2.getMessagesController().getUserOrChat(j10);
                    final ArrayList arrayList4 = new ArrayList(1);
                    arrayList4.add(userOrChat2);
                    final TLRPC.ChannelParticipant[] channelParticipantArr2 = new TLRPC.ChannelParticipant[1];
                    TLRPC.TL_channels_getParticipant tL_channels_getParticipant2 = new TLRPC.TL_channels_getParticipant();
                    tL_channels_getParticipant2.channel = MessagesController.getInputChannel(qnVar2.e);
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
                                    int i10 = qnVar22.R3;
                                    ah.j jVar = new ah.j(22);
                                    new org.telegram.ui.Components.ps(qnVar22, qnVar22.e, arrayList3, arrayList4, channelParticipantArr22, qnVar22.L6, (int) qnVar22.d(), i10, true, jVar).show();
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
                                    int i11 = qnVar3.R3;
                                    ah.j jVar2 = new ah.j(22);
                                    new org.telegram.ui.Components.ps(qnVar3, qnVar3.e, arrayList3, arrayList4, channelParticipantArr3, qnVar3.L6, (int) qnVar3.d(), i11, true, jVar2).show();
                                    return;
                            }
                        }
                    });
                    qnVar2.D7(true);
                    return;
                }
                return;
        }
    }
}
