package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sf0 implements RequestDelegate {
    public final int f41364a;
    public final ig0 f41365b;
    public final TLRPC.TL_chatInviteExported f41366c;

    public sf0(ig0 ig0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, int i10) {
        this.f41364a = i10;
        this.f41365b = ig0Var;
        this.f41366c = tL_chatInviteExported;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f41364a) {
            case 0:
                final ig0 ig0Var = this.f41365b;
                final TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f41366c;
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i10 = r5;
                        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = tL_chatInviteExported;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        ig0 ig0Var2 = ig0Var;
                        switch (i10) {
                            case 0:
                                if (tL_error2 == null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tLObject2;
                                    ig0Var2.e = tL_chatInviteExported3;
                                    TLRPC.ChatFull chatFull = ig0Var2.d;
                                    if (chatFull != null) {
                                        chatFull.exported_invite = tL_chatInviteExported3;
                                    }
                                    if (ig0Var2.getParentActivity() != null) {
                                        tL_chatInviteExported2.revoked = true;
                                        zf0 l02 = ig0Var2.l0();
                                        ig0Var2.f38039j0.add(0, tL_chatInviteExported2);
                                        ig0Var2.n0(l02);
                                        org.telegram.messenger.m5.n(null, 2131749127, org.telegram.ui.Components.cc.a0(ig0Var2), 2131624078, 36);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                ArrayList arrayList = ig0Var2.f38038i0;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced) {
                                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                                        if (!ig0Var2.f38044o0) {
                                            ig0Var2.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        tL_chatInviteExported2.revoked = true;
                                        zf0 l03 = ig0Var2.l0();
                                        if (ig0Var2.f38044o0 && ig0Var2.f38034f == org.telegram.messenger.e20.i(ig0Var2.getAccountInstance().f15043a).e()) {
                                            arrayList.remove(tL_chatInviteExported2);
                                            arrayList.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                                        } else if (ig0Var2.e != null) {
                                            ig0Var2.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        ig0Var2.f38039j0.add(0, tL_chatInviteExported2);
                                        ig0Var2.n0(l03);
                                    } else {
                                        ig0Var2.f38050s0.b(tL_chatInviteExported2, tLObject2);
                                        TLRPC.ChatFull chatFull2 = ig0Var2.d;
                                        if (chatFull2 != null) {
                                            int i11 = chatFull2.invitesCount - 1;
                                            chatFull2.invitesCount = i11;
                                            if (i11 < 0) {
                                                chatFull2.invitesCount = 0;
                                            }
                                            ig0Var2.getMessagesStorage().w1(ig0Var2.d.invitesCount, ig0Var2.f38042n);
                                        }
                                    }
                                    if (ig0Var2.getParentActivity() != null) {
                                        org.telegram.messenger.m5.n(null, 2131749127, org.telegram.ui.Components.cc.a0(ig0Var2), 2131624078, 36);
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
                ig0 ig0Var2 = this.f41365b;
                ig0Var2.getClass();
                org.telegram.messenger.i0.g3(new pd0(ig0Var2, tL_error, this.f41366c, false, 8));
                return;
            default:
                final ig0 ig0Var3 = this.f41365b;
                final TLRPC.TL_chatInviteExported tL_chatInviteExported2 = this.f41366c;
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i10 = r5;
                        TLRPC.TL_chatInviteExported tL_chatInviteExported22 = tL_chatInviteExported2;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        ig0 ig0Var22 = ig0Var3;
                        switch (i10) {
                            case 0:
                                if (tL_error2 == null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tLObject2;
                                    ig0Var22.e = tL_chatInviteExported3;
                                    TLRPC.ChatFull chatFull = ig0Var22.d;
                                    if (chatFull != null) {
                                        chatFull.exported_invite = tL_chatInviteExported3;
                                    }
                                    if (ig0Var22.getParentActivity() != null) {
                                        tL_chatInviteExported22.revoked = true;
                                        zf0 l02 = ig0Var22.l0();
                                        ig0Var22.f38039j0.add(0, tL_chatInviteExported22);
                                        ig0Var22.n0(l02);
                                        org.telegram.messenger.m5.n(null, 2131749127, org.telegram.ui.Components.cc.a0(ig0Var22), 2131624078, 36);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                ArrayList arrayList = ig0Var22.f38038i0;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced) {
                                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                                        if (!ig0Var22.f38044o0) {
                                            ig0Var22.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        tL_chatInviteExported22.revoked = true;
                                        zf0 l03 = ig0Var22.l0();
                                        if (ig0Var22.f38044o0 && ig0Var22.f38034f == org.telegram.messenger.e20.i(ig0Var22.getAccountInstance().f15043a).e()) {
                                            arrayList.remove(tL_chatInviteExported22);
                                            arrayList.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                                        } else if (ig0Var22.e != null) {
                                            ig0Var22.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        ig0Var22.f38039j0.add(0, tL_chatInviteExported22);
                                        ig0Var22.n0(l03);
                                    } else {
                                        ig0Var22.f38050s0.b(tL_chatInviteExported22, tLObject2);
                                        TLRPC.ChatFull chatFull2 = ig0Var22.d;
                                        if (chatFull2 != null) {
                                            int i11 = chatFull2.invitesCount - 1;
                                            chatFull2.invitesCount = i11;
                                            if (i11 < 0) {
                                                chatFull2.invitesCount = 0;
                                            }
                                            ig0Var22.getMessagesStorage().w1(ig0Var22.d.invitesCount, ig0Var22.f38042n);
                                        }
                                    }
                                    if (ig0Var22.getParentActivity() != null) {
                                        org.telegram.messenger.m5.n(null, 2131749127, org.telegram.ui.Components.cc.a0(ig0Var22), 2131624078, 36);
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
