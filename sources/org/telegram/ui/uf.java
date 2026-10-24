package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class uf implements org.telegram.ui.Components.ok0 {
    public final int f42411a;
    public final sn f42412b;
    public final boolean f42413c;
    public final MessageObject d;

    public uf(sn snVar, boolean z10, MessageObject messageObject, int i10) {
        this.f42411a = i10;
        this.f42412b = snVar;
        this.f42413c = z10;
        this.d = messageObject;
    }

    @Override
    public final void e(long j10, TLRPC.MessagePeerReaction messagePeerReaction) {
        switch (this.f42411a) {
            case 0:
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    final sn snVar = this.f42412b;
                    if (j10 != snVar.getUserConfig().getClientUserId() && this.f42413c) {
                        final ArrayList arrayList = new ArrayList(1);
                        arrayList.add(this.d);
                        TLObject userOrChat = snVar.getMessagesController().getUserOrChat(j10);
                        final ArrayList arrayList2 = new ArrayList(1);
                        arrayList2.add(userOrChat);
                        final TLRPC.ChannelParticipant[] channelParticipantArr = new TLRPC.ChannelParticipant[1];
                        TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                        tL_channels_getParticipant.channel = MessagesController.getInputChannel(snVar.e);
                        tL_channels_getParticipant.participant = MessagesController.getInputPeer(userOrChat);
                        snVar.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new Object(), new Utilities.Callback2() {
                            @Override
                            public final void run(Object obj, Object obj2) {
                                TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                switch (r5) {
                                    case 0:
                                        sn snVar2 = snVar;
                                        TLRPC.ChannelParticipant[] channelParticipantArr2 = channelParticipantArr;
                                        if (tL_channels_channelParticipant != null) {
                                            snVar2.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                            snVar2.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                            channelParticipantArr2[0] = tL_channels_channelParticipant.participant;
                                        } else {
                                            snVar2.getClass();
                                        }
                                        int i10 = snVar2.f41489d4;
                                        ah.j jVar = new ah.j(22);
                                        new org.telegram.ui.Components.ns(snVar2, snVar2.e, arrayList, arrayList2, channelParticipantArr2, snVar2.X6, (int) snVar2.d(), i10, true, jVar).show();
                                        return;
                                    default:
                                        sn snVar3 = snVar;
                                        TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr;
                                        if (tL_channels_channelParticipant != null) {
                                            snVar3.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                            snVar3.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                            channelParticipantArr3[0] = tL_channels_channelParticipant.participant;
                                        } else {
                                            snVar3.getClass();
                                        }
                                        int i11 = snVar3.f41489d4;
                                        ah.j jVar2 = new ah.j(22);
                                        new org.telegram.ui.Components.ns(snVar3, snVar3.e, arrayList, arrayList2, channelParticipantArr3, snVar3.X6, (int) snVar3.d(), i11, true, jVar2).show();
                                        return;
                                }
                            }
                        });
                        snVar.D7(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                final sn snVar2 = this.f42412b;
                snVar2.getClass();
                if (messagePeerReaction != null && messagePeerReaction.reaction != null && j10 != snVar2.getUserConfig().getClientUserId() && this.f42413c) {
                    final ArrayList arrayList3 = new ArrayList(1);
                    arrayList3.add(this.d);
                    TLObject userOrChat2 = snVar2.getMessagesController().getUserOrChat(j10);
                    final ArrayList arrayList4 = new ArrayList(1);
                    arrayList4.add(userOrChat2);
                    final TLRPC.ChannelParticipant[] channelParticipantArr2 = new TLRPC.ChannelParticipant[1];
                    TLRPC.TL_channels_getParticipant tL_channels_getParticipant2 = new TLRPC.TL_channels_getParticipant();
                    tL_channels_getParticipant2.channel = MessagesController.getInputChannel(snVar2.e);
                    tL_channels_getParticipant2.participant = MessagesController.getInputPeer(userOrChat2);
                    snVar2.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant2, new Object(), new Utilities.Callback2() {
                        @Override
                        public final void run(Object obj, Object obj2) {
                            TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                            switch (r5) {
                                case 0:
                                    sn snVar22 = snVar2;
                                    TLRPC.ChannelParticipant[] channelParticipantArr22 = channelParticipantArr2;
                                    if (tL_channels_channelParticipant != null) {
                                        snVar22.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                        snVar22.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                        channelParticipantArr22[0] = tL_channels_channelParticipant.participant;
                                    } else {
                                        snVar22.getClass();
                                    }
                                    int i10 = snVar22.f41489d4;
                                    ah.j jVar = new ah.j(22);
                                    new org.telegram.ui.Components.ns(snVar22, snVar22.e, arrayList3, arrayList4, channelParticipantArr22, snVar22.X6, (int) snVar22.d(), i10, true, jVar).show();
                                    return;
                                default:
                                    sn snVar3 = snVar2;
                                    TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr2;
                                    if (tL_channels_channelParticipant != null) {
                                        snVar3.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                        snVar3.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                        channelParticipantArr3[0] = tL_channels_channelParticipant.participant;
                                    } else {
                                        snVar3.getClass();
                                    }
                                    int i11 = snVar3.f41489d4;
                                    ah.j jVar2 = new ah.j(22);
                                    new org.telegram.ui.Components.ns(snVar3, snVar3.e, arrayList3, arrayList4, channelParticipantArr3, snVar3.X6, (int) snVar3.d(), i11, true, jVar2).show();
                                    return;
                            }
                        }
                    });
                    snVar2.D7(true);
                    return;
                }
                return;
        }
    }
}
