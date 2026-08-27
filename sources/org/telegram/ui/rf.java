package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class rf implements org.telegram.ui.Components.fj0 {

    public final int f41915a;

    public final rn f41916b;

    public final boolean f41917c;
    public final MessageObject d;

    public rf(rn rnVar, boolean z10, MessageObject messageObject, int i10) {
        this.f41915a = i10;
        this.f41916b = rnVar;
        this.f41917c = z10;
        this.d = messageObject;
    }

    @Override
    public final void e(long j10, TLRPC.MessagePeerReaction messagePeerReaction) {
        switch (this.f41915a) {
            case 0:
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    final rn rnVar = this.f41916b;
                    if (j10 != rnVar.getUserConfig().getClientUserId() && this.f41917c) {
                        final ArrayList arrayList = new ArrayList(1);
                        arrayList.add(this.d);
                        TLObject userOrChat = rnVar.getMessagesController().getUserOrChat(j10);
                        final ArrayList arrayList2 = new ArrayList(1);
                        arrayList2.add(userOrChat);
                        final TLRPC.ChannelParticipant[] channelParticipantArr = new TLRPC.ChannelParticipant[1];
                        TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                        tL_channels_getParticipant.channel = MessagesController.getInputChannel(rnVar.f42026e);
                        tL_channels_getParticipant.participant = MessagesController.getInputPeer(userOrChat);
                        final int i10 = 1;
                        rnVar.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new org.telegram.messenger.a(), new Utilities.Callback2() {
                            @Override
                            public final void run(Object obj, Object obj2) {
                                TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                                switch (i10) {
                                    case 0:
                                        rn rnVar2 = rnVar;
                                        TLRPC.ChannelParticipant[] channelParticipantArr2 = channelParticipantArr;
                                        if (tL_channels_channelParticipant != null) {
                                            rnVar2.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                            rnVar2.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                            channelParticipantArr2[0] = tL_channels_channelParticipant.participant;
                                        } else {
                                            rnVar2.getClass();
                                        }
                                        new org.telegram.ui.Components.ur(rnVar2, rnVar2.f42026e, arrayList, arrayList2, channelParticipantArr2, rnVar2.H6, (int) rnVar2.b(), rnVar2.N3, true, new ag.l3(21)).show();
                                        break;
                                    default:
                                        rn rnVar3 = rnVar;
                                        TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr;
                                        if (tL_channels_channelParticipant != null) {
                                            rnVar3.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                            rnVar3.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                            channelParticipantArr3[0] = tL_channels_channelParticipant.participant;
                                        } else {
                                            rnVar3.getClass();
                                        }
                                        new org.telegram.ui.Components.ur(rnVar3, rnVar3.f42026e, arrayList, arrayList2, channelParticipantArr3, rnVar3.H6, (int) rnVar3.b(), rnVar3.N3, true, new ag.l3(21)).show();
                                        break;
                                }
                            }
                        });
                        rnVar.A7(true);
                        break;
                    }
                }
                break;
            default:
                final rn rnVar2 = this.f41916b;
                rnVar2.getClass();
                if (messagePeerReaction != null && messagePeerReaction.reaction != null && j10 != rnVar2.getUserConfig().getClientUserId() && this.f41917c) {
                    final ArrayList arrayList3 = new ArrayList(1);
                    arrayList3.add(this.d);
                    TLObject userOrChat2 = rnVar2.getMessagesController().getUserOrChat(j10);
                    final ArrayList arrayList4 = new ArrayList(1);
                    arrayList4.add(userOrChat2);
                    final TLRPC.ChannelParticipant[] channelParticipantArr2 = new TLRPC.ChannelParticipant[1];
                    TLRPC.TL_channels_getParticipant tL_channels_getParticipant2 = new TLRPC.TL_channels_getParticipant();
                    tL_channels_getParticipant2.channel = MessagesController.getInputChannel(rnVar2.f42026e);
                    tL_channels_getParticipant2.participant = MessagesController.getInputPeer(userOrChat2);
                    final int i11 = 0;
                    rnVar2.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant2, new org.telegram.messenger.a(), new Utilities.Callback2() {
                        @Override
                        public final void run(Object obj, Object obj2) {
                            TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                            switch (i11) {
                                case 0:
                                    rn rnVar3 = rnVar2;
                                    TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr2;
                                    if (tL_channels_channelParticipant != null) {
                                        rnVar3.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                        rnVar3.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                        channelParticipantArr3[0] = tL_channels_channelParticipant.participant;
                                    } else {
                                        rnVar3.getClass();
                                    }
                                    new org.telegram.ui.Components.ur(rnVar3, rnVar3.f42026e, arrayList3, arrayList4, channelParticipantArr3, rnVar3.H6, (int) rnVar3.b(), rnVar3.N3, true, new ag.l3(21)).show();
                                    break;
                                default:
                                    rn rnVar4 = rnVar2;
                                    TLRPC.ChannelParticipant[] channelParticipantArr4 = channelParticipantArr2;
                                    if (tL_channels_channelParticipant != null) {
                                        rnVar4.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                        rnVar4.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                        channelParticipantArr4[0] = tL_channels_channelParticipant.participant;
                                    } else {
                                        rnVar4.getClass();
                                    }
                                    new org.telegram.ui.Components.ur(rnVar4, rnVar4.f42026e, arrayList3, arrayList4, channelParticipantArr4, rnVar4.H6, (int) rnVar4.b(), rnVar4.N3, true, new ag.l3(21)).show();
                                    break;
                            }
                        }
                    });
                    rnVar2.A7(true);
                    break;
                }
                break;
        }
    }
}
