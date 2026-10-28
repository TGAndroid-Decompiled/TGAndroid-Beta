package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class tf implements org.telegram.ui.Components.pk0 {
    public final int f43621a;
    public final wn f43622b;
    public final boolean f43623c;
    public final MessageObject d;

    public tf(wn wnVar, boolean z10, MessageObject messageObject, int i10) {
        this.f43621a = i10;
        this.f43622b = wnVar;
        this.f43623c = z10;
        this.d = messageObject;
    }

    @Override
    public final void f(long j10, TLRPC.MessagePeerReaction messagePeerReaction) {
        switch (this.f43621a) {
            case 0:
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    final wn wnVar = this.f43622b;
                    if (j10 != wnVar.getUserConfig().getClientUserId() && this.f43623c) {
                        final ArrayList arrayList = new ArrayList(1);
                        arrayList.add(this.d);
                        TLObject userOrChat = wnVar.getMessagesController().getUserOrChat(j10);
                        final ArrayList arrayList2 = new ArrayList(1);
                        arrayList2.add(userOrChat);
                        final TLRPC.ChannelParticipant[] channelParticipantArr = new TLRPC.ChannelParticipant[1];
                        TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                        tL_channels_getParticipant.channel = MessagesController.getInputChannel(wnVar.e);
                        tL_channels_getParticipant.participant = MessagesController.getInputPeer(userOrChat);
                        wnVar.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new Object(), new Utilities.Callback2() {
                            @Override
                            public final void run(Object obj, Object obj2) {
                                TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                switch (r5) {
                                    case 0:
                                        wn wnVar2 = wnVar;
                                        TLRPC.ChannelParticipant[] channelParticipantArr2 = channelParticipantArr;
                                        if (tL_channels_channelParticipant != null) {
                                            wnVar2.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                            wnVar2.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                            channelParticipantArr2[0] = tL_channels_channelParticipant.participant;
                                        } else {
                                            wnVar2.getClass();
                                        }
                                        int i10 = wnVar2.f45091d4;
                                        ag.c cVar = new ag.c(24);
                                        new org.telegram.ui.Components.rs(wnVar2, wnVar2.e, arrayList, arrayList2, channelParticipantArr2, wnVar2.f45065b7, (int) wnVar2.b(), i10, true, cVar).show();
                                        return;
                                    default:
                                        wn wnVar3 = wnVar;
                                        TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr;
                                        if (tL_channels_channelParticipant != null) {
                                            wnVar3.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                            wnVar3.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                            channelParticipantArr3[0] = tL_channels_channelParticipant.participant;
                                        } else {
                                            wnVar3.getClass();
                                        }
                                        int i11 = wnVar3.f45091d4;
                                        ag.c cVar2 = new ag.c(24);
                                        new org.telegram.ui.Components.rs(wnVar3, wnVar3.e, arrayList, arrayList2, channelParticipantArr3, wnVar3.f45065b7, (int) wnVar3.b(), i11, true, cVar2).show();
                                        return;
                                }
                            }
                        });
                        wnVar.J7(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                final wn wnVar2 = this.f43622b;
                wnVar2.getClass();
                if (messagePeerReaction != null && messagePeerReaction.reaction != null && j10 != wnVar2.getUserConfig().getClientUserId() && this.f43623c) {
                    final ArrayList arrayList3 = new ArrayList(1);
                    arrayList3.add(this.d);
                    TLObject userOrChat2 = wnVar2.getMessagesController().getUserOrChat(j10);
                    final ArrayList arrayList4 = new ArrayList(1);
                    arrayList4.add(userOrChat2);
                    final TLRPC.ChannelParticipant[] channelParticipantArr2 = new TLRPC.ChannelParticipant[1];
                    TLRPC.TL_channels_getParticipant tL_channels_getParticipant2 = new TLRPC.TL_channels_getParticipant();
                    tL_channels_getParticipant2.channel = MessagesController.getInputChannel(wnVar2.e);
                    tL_channels_getParticipant2.participant = MessagesController.getInputPeer(userOrChat2);
                    wnVar2.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant2, new Object(), new Utilities.Callback2() {
                        @Override
                        public final void run(Object obj, Object obj2) {
                            TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                            switch (r5) {
                                case 0:
                                    wn wnVar22 = wnVar2;
                                    TLRPC.ChannelParticipant[] channelParticipantArr22 = channelParticipantArr2;
                                    if (tL_channels_channelParticipant != null) {
                                        wnVar22.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                        wnVar22.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                        channelParticipantArr22[0] = tL_channels_channelParticipant.participant;
                                    } else {
                                        wnVar22.getClass();
                                    }
                                    int i10 = wnVar22.f45091d4;
                                    ag.c cVar = new ag.c(24);
                                    new org.telegram.ui.Components.rs(wnVar22, wnVar22.e, arrayList3, arrayList4, channelParticipantArr22, wnVar22.f45065b7, (int) wnVar22.b(), i10, true, cVar).show();
                                    return;
                                default:
                                    wn wnVar3 = wnVar2;
                                    TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr2;
                                    if (tL_channels_channelParticipant != null) {
                                        wnVar3.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                        wnVar3.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                        channelParticipantArr3[0] = tL_channels_channelParticipant.participant;
                                    } else {
                                        wnVar3.getClass();
                                    }
                                    int i11 = wnVar3.f45091d4;
                                    ag.c cVar2 = new ag.c(24);
                                    new org.telegram.ui.Components.rs(wnVar3, wnVar3.e, arrayList3, arrayList4, channelParticipantArr3, wnVar3.f45065b7, (int) wnVar3.b(), i11, true, cVar2).show();
                                    return;
                            }
                        }
                    });
                    wnVar2.J7(true);
                    return;
                }
                return;
        }
    }
}
