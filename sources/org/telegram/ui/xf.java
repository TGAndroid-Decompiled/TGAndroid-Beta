package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xf implements org.telegram.ui.Components.vi0 {
    public final int f43364a;
    public final un f43365b;
    public final boolean f43366c;
    public final org.telegram.messenger.kj d;

    public xf(un unVar, boolean z10, org.telegram.messenger.kj kjVar, int i10) {
        this.f43364a = i10;
        this.f43365b = unVar;
        this.f43366c = z10;
        this.d = kjVar;
    }

    @Override
    public final void c(long j10, TLRPC.MessagePeerReaction messagePeerReaction) {
        switch (this.f43364a) {
            case 0:
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    final un unVar = this.f43365b;
                    if (j10 != unVar.getUserConfig().e() && this.f43366c) {
                        final ArrayList arrayList = new ArrayList(1);
                        arrayList.add(this.d);
                        TLObject d22 = unVar.getMessagesController().d2(j10);
                        final ArrayList arrayList2 = new ArrayList(1);
                        arrayList2.add(d22);
                        final TLRPC.ChannelParticipant[] channelParticipantArr = new TLRPC.ChannelParticipant[1];
                        TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                        tL_channels_getParticipant.channel = org.telegram.messenger.wp.h1(unVar.e);
                        tL_channels_getParticipant.participant = org.telegram.messenger.wp.j1(d22);
                        unVar.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new a3.b(1), new org.telegram.messenger.k20() {
                            @Override
                            public final void a(Object obj, Object obj2) {
                                TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                switch (r5) {
                                    case 0:
                                        un unVar2 = unVar;
                                        TLRPC.ChannelParticipant[] channelParticipantArr2 = channelParticipantArr;
                                        if (tL_channels_channelParticipant != null) {
                                            unVar2.getMessagesController().V3(tL_channels_channelParticipant.users, false);
                                            unVar2.getMessagesController().P3(tL_channels_channelParticipant.chats, false);
                                            channelParticipantArr2[0] = tL_channels_channelParticipant.participant;
                                        } else {
                                            unVar2.getClass();
                                        }
                                        int i10 = unVar2.f42059f4;
                                        org.telegram.messenger.sz szVar = new org.telegram.messenger.sz(3);
                                        new org.telegram.ui.Components.vr(unVar2, unVar2.e, arrayList, arrayList2, channelParticipantArr2, unVar2.f42010b7, (int) unVar2.b(), i10, true, szVar).show();
                                        return;
                                    default:
                                        un unVar3 = unVar;
                                        TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr;
                                        if (tL_channels_channelParticipant != null) {
                                            unVar3.getMessagesController().V3(tL_channels_channelParticipant.users, false);
                                            unVar3.getMessagesController().P3(tL_channels_channelParticipant.chats, false);
                                            channelParticipantArr3[0] = tL_channels_channelParticipant.participant;
                                        } else {
                                            unVar3.getClass();
                                        }
                                        int i11 = unVar3.f42059f4;
                                        org.telegram.messenger.sz szVar2 = new org.telegram.messenger.sz(3);
                                        new org.telegram.ui.Components.vr(unVar3, unVar3.e, arrayList, arrayList2, channelParticipantArr3, unVar3.f42010b7, (int) unVar3.b(), i11, true, szVar2).show();
                                        return;
                                }
                            }
                        });
                        unVar.M7(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                final un unVar2 = this.f43365b;
                unVar2.getClass();
                if (messagePeerReaction != null && messagePeerReaction.reaction != null && j10 != unVar2.getUserConfig().e() && this.f43366c) {
                    final ArrayList arrayList3 = new ArrayList(1);
                    arrayList3.add(this.d);
                    TLObject d23 = unVar2.getMessagesController().d2(j10);
                    final ArrayList arrayList4 = new ArrayList(1);
                    arrayList4.add(d23);
                    final TLRPC.ChannelParticipant[] channelParticipantArr2 = new TLRPC.ChannelParticipant[1];
                    TLRPC.TL_channels_getParticipant tL_channels_getParticipant2 = new TLRPC.TL_channels_getParticipant();
                    tL_channels_getParticipant2.channel = org.telegram.messenger.wp.h1(unVar2.e);
                    tL_channels_getParticipant2.participant = org.telegram.messenger.wp.j1(d23);
                    unVar2.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant2, new a3.b(1), new org.telegram.messenger.k20() {
                        @Override
                        public final void a(Object obj, Object obj2) {
                            TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                            switch (r5) {
                                case 0:
                                    un unVar22 = unVar2;
                                    TLRPC.ChannelParticipant[] channelParticipantArr22 = channelParticipantArr2;
                                    if (tL_channels_channelParticipant != null) {
                                        unVar22.getMessagesController().V3(tL_channels_channelParticipant.users, false);
                                        unVar22.getMessagesController().P3(tL_channels_channelParticipant.chats, false);
                                        channelParticipantArr22[0] = tL_channels_channelParticipant.participant;
                                    } else {
                                        unVar22.getClass();
                                    }
                                    int i10 = unVar22.f42059f4;
                                    org.telegram.messenger.sz szVar = new org.telegram.messenger.sz(3);
                                    new org.telegram.ui.Components.vr(unVar22, unVar22.e, arrayList3, arrayList4, channelParticipantArr22, unVar22.f42010b7, (int) unVar22.b(), i10, true, szVar).show();
                                    return;
                                default:
                                    un unVar3 = unVar2;
                                    TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr2;
                                    if (tL_channels_channelParticipant != null) {
                                        unVar3.getMessagesController().V3(tL_channels_channelParticipant.users, false);
                                        unVar3.getMessagesController().P3(tL_channels_channelParticipant.chats, false);
                                        channelParticipantArr3[0] = tL_channels_channelParticipant.participant;
                                    } else {
                                        unVar3.getClass();
                                    }
                                    int i11 = unVar3.f42059f4;
                                    org.telegram.messenger.sz szVar2 = new org.telegram.messenger.sz(3);
                                    new org.telegram.ui.Components.vr(unVar3, unVar3.e, arrayList3, arrayList4, channelParticipantArr3, unVar3.f42010b7, (int) unVar3.b(), i11, true, szVar2).show();
                                    return;
                            }
                        }
                    });
                    unVar2.M7(true);
                    return;
                }
                return;
        }
    }
}
