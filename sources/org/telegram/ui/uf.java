package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class uf implements org.telegram.ui.Components.ok0 {
    public final int f44120a;
    public final un f44121b;
    public final boolean f44122c;
    public final MessageObject d;

    public uf(un unVar, boolean z10, MessageObject messageObject, int i10) {
        this.f44120a = i10;
        this.f44121b = unVar;
        this.f44122c = z10;
        this.d = messageObject;
    }

    @Override
    public final void f(long j10, TLRPC.MessagePeerReaction messagePeerReaction) {
        switch (this.f44120a) {
            case 0:
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    final un unVar = this.f44121b;
                    if (j10 != unVar.getUserConfig().getClientUserId() && this.f44122c) {
                        final ArrayList arrayList = new ArrayList(1);
                        arrayList.add(this.d);
                        TLObject userOrChat = unVar.getMessagesController().getUserOrChat(j10);
                        final ArrayList arrayList2 = new ArrayList(1);
                        arrayList2.add(userOrChat);
                        final TLRPC.ChannelParticipant[] channelParticipantArr = new TLRPC.ChannelParticipant[1];
                        TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                        tL_channels_getParticipant.channel = MessagesController.getInputChannel(unVar.e);
                        tL_channels_getParticipant.participant = MessagesController.getInputPeer(userOrChat);
                        unVar.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new Object(), new Utilities.Callback2() {
                            @Override
                            public final void run(Object obj, Object obj2) {
                                TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                switch (r5) {
                                    case 0:
                                        un unVar2 = unVar;
                                        TLRPC.ChannelParticipant[] channelParticipantArr2 = channelParticipantArr;
                                        if (tL_channels_channelParticipant != null) {
                                            unVar2.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                            unVar2.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                            channelParticipantArr2[0] = tL_channels_channelParticipant.participant;
                                        } else {
                                            unVar2.getClass();
                                        }
                                        int i10 = unVar2.f44224d4;
                                        ag.c cVar = new ag.c(24);
                                        new org.telegram.ui.Components.rs(unVar2, unVar2.e, arrayList, arrayList2, channelParticipantArr2, unVar2.X6, (int) unVar2.b(), i10, true, cVar).show();
                                        return;
                                    default:
                                        un unVar3 = unVar;
                                        TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr;
                                        if (tL_channels_channelParticipant != null) {
                                            unVar3.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                            unVar3.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                            channelParticipantArr3[0] = tL_channels_channelParticipant.participant;
                                        } else {
                                            unVar3.getClass();
                                        }
                                        int i11 = unVar3.f44224d4;
                                        ag.c cVar2 = new ag.c(24);
                                        new org.telegram.ui.Components.rs(unVar3, unVar3.e, arrayList, arrayList2, channelParticipantArr3, unVar3.X6, (int) unVar3.b(), i11, true, cVar2).show();
                                        return;
                                }
                            }
                        });
                        unVar.H7(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                final un unVar2 = this.f44121b;
                unVar2.getClass();
                if (messagePeerReaction != null && messagePeerReaction.reaction != null && j10 != unVar2.getUserConfig().getClientUserId() && this.f44122c) {
                    final ArrayList arrayList3 = new ArrayList(1);
                    arrayList3.add(this.d);
                    TLObject userOrChat2 = unVar2.getMessagesController().getUserOrChat(j10);
                    final ArrayList arrayList4 = new ArrayList(1);
                    arrayList4.add(userOrChat2);
                    final TLRPC.ChannelParticipant[] channelParticipantArr2 = new TLRPC.ChannelParticipant[1];
                    TLRPC.TL_channels_getParticipant tL_channels_getParticipant2 = new TLRPC.TL_channels_getParticipant();
                    tL_channels_getParticipant2.channel = MessagesController.getInputChannel(unVar2.e);
                    tL_channels_getParticipant2.participant = MessagesController.getInputPeer(userOrChat2);
                    unVar2.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant2, new Object(), new Utilities.Callback2() {
                        @Override
                        public final void run(Object obj, Object obj2) {
                            TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                            switch (r5) {
                                case 0:
                                    un unVar22 = unVar2;
                                    TLRPC.ChannelParticipant[] channelParticipantArr22 = channelParticipantArr2;
                                    if (tL_channels_channelParticipant != null) {
                                        unVar22.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                        unVar22.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                        channelParticipantArr22[0] = tL_channels_channelParticipant.participant;
                                    } else {
                                        unVar22.getClass();
                                    }
                                    int i10 = unVar22.f44224d4;
                                    ag.c cVar = new ag.c(24);
                                    new org.telegram.ui.Components.rs(unVar22, unVar22.e, arrayList3, arrayList4, channelParticipantArr22, unVar22.X6, (int) unVar22.b(), i10, true, cVar).show();
                                    return;
                                default:
                                    un unVar3 = unVar2;
                                    TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr2;
                                    if (tL_channels_channelParticipant != null) {
                                        unVar3.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                        unVar3.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                        channelParticipantArr3[0] = tL_channels_channelParticipant.participant;
                                    } else {
                                        unVar3.getClass();
                                    }
                                    int i11 = unVar3.f44224d4;
                                    ag.c cVar2 = new ag.c(24);
                                    new org.telegram.ui.Components.rs(unVar3, unVar3.e, arrayList3, arrayList4, channelParticipantArr3, unVar3.X6, (int) unVar3.b(), i11, true, cVar2).show();
                                    return;
                            }
                        }
                    });
                    unVar2.H7(true);
                    return;
                }
                return;
        }
    }
}
