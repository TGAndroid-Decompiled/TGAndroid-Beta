package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class tf0 implements RequestDelegate {
    public final int f41834a;
    public final kg0 f41835b;
    public final TLRPC.TL_chatInviteExported f41836c;

    public tf0(kg0 kg0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, int i10) {
        this.f41834a = i10;
        this.f41835b = kg0Var;
        this.f41836c = tL_chatInviteExported;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f41834a) {
            case 0:
                final kg0 kg0Var = this.f41835b;
                final TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f41836c;
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i10 = r5;
                        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = tL_chatInviteExported;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        kg0 kg0Var2 = kg0Var;
                        switch (i10) {
                            case 0:
                                if (tL_error2 == null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tLObject2;
                                    kg0Var2.e = tL_chatInviteExported3;
                                    TLRPC.ChatFull chatFull = kg0Var2.d;
                                    if (chatFull != null) {
                                        chatFull.exported_invite = tL_chatInviteExported3;
                                    }
                                    if (kg0Var2.getParentActivity() != null) {
                                        tL_chatInviteExported2.revoked = true;
                                        bg0 k02 = kg0Var2.k0();
                                        kg0Var2.f38807j0.add(0, tL_chatInviteExported2);
                                        kg0Var2.m0(k02);
                                        org.telegram.messenger.m5.n(null, 2131749127, org.telegram.ui.Components.cc.a0(kg0Var2), 2131624078, 36);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                ArrayList arrayList = kg0Var2.f38806i0;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced) {
                                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                                        if (!kg0Var2.f38812o0) {
                                            kg0Var2.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        tL_chatInviteExported2.revoked = true;
                                        bg0 k03 = kg0Var2.k0();
                                        if (kg0Var2.f38812o0 && kg0Var2.f38802f == org.telegram.messenger.d20.i(kg0Var2.getAccountInstance().f14863a).e()) {
                                            arrayList.remove(tL_chatInviteExported2);
                                            arrayList.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                                        } else if (kg0Var2.e != null) {
                                            kg0Var2.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        kg0Var2.f38807j0.add(0, tL_chatInviteExported2);
                                        kg0Var2.m0(k03);
                                    } else {
                                        kg0Var2.f38818s0.b(tL_chatInviteExported2, tLObject2);
                                        TLRPC.ChatFull chatFull2 = kg0Var2.d;
                                        if (chatFull2 != null) {
                                            int i11 = chatFull2.invitesCount - 1;
                                            chatFull2.invitesCount = i11;
                                            if (i11 < 0) {
                                                chatFull2.invitesCount = 0;
                                            }
                                            kg0Var2.getMessagesStorage().w1(kg0Var2.d.invitesCount, kg0Var2.f38810n);
                                        }
                                    }
                                    if (kg0Var2.getParentActivity() != null) {
                                        org.telegram.messenger.m5.n(null, 2131749127, org.telegram.ui.Components.cc.a0(kg0Var2), 2131624078, 36);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 1:
                kg0 kg0Var2 = this.f41835b;
                kg0Var2.getClass();
                org.telegram.messenger.i0.g3(new qd0(kg0Var2, tL_error, this.f41836c, false, 8));
                return;
            default:
                final kg0 kg0Var3 = this.f41835b;
                final TLRPC.TL_chatInviteExported tL_chatInviteExported2 = this.f41836c;
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i10 = r5;
                        TLRPC.TL_chatInviteExported tL_chatInviteExported22 = tL_chatInviteExported2;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        kg0 kg0Var22 = kg0Var3;
                        switch (i10) {
                            case 0:
                                if (tL_error2 == null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tLObject2;
                                    kg0Var22.e = tL_chatInviteExported3;
                                    TLRPC.ChatFull chatFull = kg0Var22.d;
                                    if (chatFull != null) {
                                        chatFull.exported_invite = tL_chatInviteExported3;
                                    }
                                    if (kg0Var22.getParentActivity() != null) {
                                        tL_chatInviteExported22.revoked = true;
                                        bg0 k02 = kg0Var22.k0();
                                        kg0Var22.f38807j0.add(0, tL_chatInviteExported22);
                                        kg0Var22.m0(k02);
                                        org.telegram.messenger.m5.n(null, 2131749127, org.telegram.ui.Components.cc.a0(kg0Var22), 2131624078, 36);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                ArrayList arrayList = kg0Var22.f38806i0;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced) {
                                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                                        if (!kg0Var22.f38812o0) {
                                            kg0Var22.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        tL_chatInviteExported22.revoked = true;
                                        bg0 k03 = kg0Var22.k0();
                                        if (kg0Var22.f38812o0 && kg0Var22.f38802f == org.telegram.messenger.d20.i(kg0Var22.getAccountInstance().f14863a).e()) {
                                            arrayList.remove(tL_chatInviteExported22);
                                            arrayList.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                                        } else if (kg0Var22.e != null) {
                                            kg0Var22.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        kg0Var22.f38807j0.add(0, tL_chatInviteExported22);
                                        kg0Var22.m0(k03);
                                    } else {
                                        kg0Var22.f38818s0.b(tL_chatInviteExported22, tLObject2);
                                        TLRPC.ChatFull chatFull2 = kg0Var22.d;
                                        if (chatFull2 != null) {
                                            int i11 = chatFull2.invitesCount - 1;
                                            chatFull2.invitesCount = i11;
                                            if (i11 < 0) {
                                                chatFull2.invitesCount = 0;
                                            }
                                            kg0Var22.getMessagesStorage().w1(kg0Var22.d.invitesCount, kg0Var22.f38810n);
                                        }
                                    }
                                    if (kg0Var22.getParentActivity() != null) {
                                        org.telegram.messenger.m5.n(null, 2131749127, org.telegram.ui.Components.cc.a0(kg0Var22), 2131624078, 36);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
        }
    }
}
