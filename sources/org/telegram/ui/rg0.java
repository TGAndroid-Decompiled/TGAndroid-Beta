package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rg0 implements RequestDelegate {
    public final int f41219a;
    public final ih0 f41220b;
    public final TLRPC.TL_chatInviteExported f41221c;

    public rg0(ih0 ih0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, int i10) {
        this.f41219a = i10;
        this.f41220b = ih0Var;
        this.f41221c = tL_chatInviteExported;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f41219a) {
            case 0:
                final ih0 ih0Var = this.f41220b;
                final TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f41221c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                if (tL_error == null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) tLObject;
                                    ih0 ih0Var2 = ih0Var;
                                    ih0Var2.e = tL_chatInviteExported2;
                                    TLRPC.ChatFull chatFull = ih0Var2.d;
                                    if (chatFull != null) {
                                        chatFull.exported_invite = tL_chatInviteExported2;
                                    }
                                    if (ih0Var2.getParentActivity() != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported3 = tL_chatInviteExported;
                                        tL_chatInviteExported3.revoked = true;
                                        zg0 f02 = ih0Var2.f0();
                                        ih0Var2.f37994j0.add(0, tL_chatInviteExported3);
                                        ih0Var2.h0(f02);
                                        org.telegram.messenger.g0.q(R.string.InviteRevokedHint, org.telegram.ui.Components.xc.a0(ih0Var2), R.raw.linkbroken, 36);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                ih0 ih0Var3 = ih0Var;
                                ArrayList arrayList = ih0Var3.f37993i0;
                                if (tL_error == null) {
                                    TLObject tLObject2 = tLObject;
                                    boolean z10 = tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced;
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported4 = tL_chatInviteExported;
                                    if (z10) {
                                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                                        if (!ih0Var3.f37999o0) {
                                            ih0Var3.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        tL_chatInviteExported4.revoked = true;
                                        zg0 f03 = ih0Var3.f0();
                                        if (ih0Var3.f37999o0 && ih0Var3.f37989f == ih0Var3.getAccountInstance().getUserConfig().getClientUserId()) {
                                            arrayList.remove(tL_chatInviteExported4);
                                            arrayList.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                                        } else if (ih0Var3.e != null) {
                                            ih0Var3.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        ih0Var3.f37994j0.add(0, tL_chatInviteExported4);
                                        ih0Var3.h0(f03);
                                    } else {
                                        ih0Var3.f38005s0.b(tL_chatInviteExported4, tLObject2);
                                        TLRPC.ChatFull chatFull2 = ih0Var3.d;
                                        if (chatFull2 != null) {
                                            int i10 = chatFull2.invitesCount - 1;
                                            chatFull2.invitesCount = i10;
                                            if (i10 < 0) {
                                                chatFull2.invitesCount = 0;
                                            }
                                            ih0Var3.getMessagesStorage().saveChatLinksCount(ih0Var3.f37997n, ih0Var3.d.invitesCount);
                                        }
                                    }
                                    if (ih0Var3.getParentActivity() != null) {
                                        org.telegram.messenger.g0.q(R.string.InviteRevokedHint, org.telegram.ui.Components.xc.a0(ih0Var3), R.raw.linkbroken, 36);
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
                ih0 ih0Var2 = this.f41220b;
                ih0Var2.getClass();
                AndroidUtilities.runOnUIThread(new ve0(ih0Var2, tL_error, this.f41221c, 6));
                return;
            default:
                final ih0 ih0Var3 = this.f41220b;
                final TLRPC.TL_chatInviteExported tL_chatInviteExported2 = this.f41221c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                if (tL_error == null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported22 = (TLRPC.TL_chatInviteExported) tLObject;
                                    ih0 ih0Var22 = ih0Var3;
                                    ih0Var22.e = tL_chatInviteExported22;
                                    TLRPC.ChatFull chatFull = ih0Var22.d;
                                    if (chatFull != null) {
                                        chatFull.exported_invite = tL_chatInviteExported22;
                                    }
                                    if (ih0Var22.getParentActivity() != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported3 = tL_chatInviteExported2;
                                        tL_chatInviteExported3.revoked = true;
                                        zg0 f02 = ih0Var22.f0();
                                        ih0Var22.f37994j0.add(0, tL_chatInviteExported3);
                                        ih0Var22.h0(f02);
                                        org.telegram.messenger.g0.q(R.string.InviteRevokedHint, org.telegram.ui.Components.xc.a0(ih0Var22), R.raw.linkbroken, 36);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                ih0 ih0Var32 = ih0Var3;
                                ArrayList arrayList = ih0Var32.f37993i0;
                                if (tL_error == null) {
                                    TLObject tLObject2 = tLObject;
                                    boolean z10 = tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced;
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported4 = tL_chatInviteExported2;
                                    if (z10) {
                                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                                        if (!ih0Var32.f37999o0) {
                                            ih0Var32.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        tL_chatInviteExported4.revoked = true;
                                        zg0 f03 = ih0Var32.f0();
                                        if (ih0Var32.f37999o0 && ih0Var32.f37989f == ih0Var32.getAccountInstance().getUserConfig().getClientUserId()) {
                                            arrayList.remove(tL_chatInviteExported4);
                                            arrayList.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                                        } else if (ih0Var32.e != null) {
                                            ih0Var32.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        ih0Var32.f37994j0.add(0, tL_chatInviteExported4);
                                        ih0Var32.h0(f03);
                                    } else {
                                        ih0Var32.f38005s0.b(tL_chatInviteExported4, tLObject2);
                                        TLRPC.ChatFull chatFull2 = ih0Var32.d;
                                        if (chatFull2 != null) {
                                            int i10 = chatFull2.invitesCount - 1;
                                            chatFull2.invitesCount = i10;
                                            if (i10 < 0) {
                                                chatFull2.invitesCount = 0;
                                            }
                                            ih0Var32.getMessagesStorage().saveChatLinksCount(ih0Var32.f37997n, ih0Var32.d.invitesCount);
                                        }
                                    }
                                    if (ih0Var32.getParentActivity() != null) {
                                        org.telegram.messenger.g0.q(R.string.InviteRevokedHint, org.telegram.ui.Components.xc.a0(ih0Var32), R.raw.linkbroken, 36);
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
