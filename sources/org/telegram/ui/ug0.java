package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ug0 implements RequestDelegate {
    public final int f42425a;
    public final lh0 f42426b;
    public final TLRPC.TL_chatInviteExported f42427c;

    public ug0(lh0 lh0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, int i10) {
        this.f42425a = i10;
        this.f42426b = lh0Var;
        this.f42427c = tL_chatInviteExported;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f42425a) {
            case 0:
                final lh0 lh0Var = this.f42426b;
                final TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f42427c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                if (tL_error == null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) tLObject;
                                    lh0 lh0Var2 = lh0Var;
                                    lh0Var2.e = tL_chatInviteExported2;
                                    TLRPC.ChatFull chatFull = lh0Var2.d;
                                    if (chatFull != null) {
                                        chatFull.exported_invite = tL_chatInviteExported2;
                                    }
                                    if (lh0Var2.getParentActivity() != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported3 = tL_chatInviteExported;
                                        tL_chatInviteExported3.revoked = true;
                                        ch0 g02 = lh0Var2.g0();
                                        lh0Var2.f39284j0.add(0, tL_chatInviteExported3);
                                        lh0Var2.i0(g02);
                                        org.telegram.messenger.v0.p(R.string.InviteRevokedHint, org.telegram.ui.Components.vc.a0(lh0Var2), R.raw.linkbroken, 36);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                lh0 lh0Var3 = lh0Var;
                                ArrayList arrayList = lh0Var3.f39283i0;
                                if (tL_error == null) {
                                    TLObject tLObject2 = tLObject;
                                    boolean z10 = tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced;
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported4 = tL_chatInviteExported;
                                    if (z10) {
                                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                                        if (!lh0Var3.f39289o0) {
                                            lh0Var3.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        tL_chatInviteExported4.revoked = true;
                                        ch0 g03 = lh0Var3.g0();
                                        if (lh0Var3.f39289o0 && lh0Var3.f39279f == lh0Var3.getAccountInstance().getUserConfig().getClientUserId()) {
                                            arrayList.remove(tL_chatInviteExported4);
                                            arrayList.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                                        } else if (lh0Var3.e != null) {
                                            lh0Var3.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        lh0Var3.f39284j0.add(0, tL_chatInviteExported4);
                                        lh0Var3.i0(g03);
                                    } else {
                                        lh0Var3.f39295s0.b(tL_chatInviteExported4, tLObject2);
                                        TLRPC.ChatFull chatFull2 = lh0Var3.d;
                                        if (chatFull2 != null) {
                                            int i10 = chatFull2.invitesCount - 1;
                                            chatFull2.invitesCount = i10;
                                            if (i10 < 0) {
                                                chatFull2.invitesCount = 0;
                                            }
                                            lh0Var3.getMessagesStorage().saveChatLinksCount(lh0Var3.f39287n, lh0Var3.d.invitesCount);
                                        }
                                    }
                                    if (lh0Var3.getParentActivity() != null) {
                                        org.telegram.messenger.v0.p(R.string.InviteRevokedHint, org.telegram.ui.Components.vc.a0(lh0Var3), R.raw.linkbroken, 36);
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
                lh0 lh0Var2 = this.f42426b;
                lh0Var2.getClass();
                AndroidUtilities.runOnUIThread(new qe0(lh0Var2, tL_error, this.f42427c, 7));
                return;
            default:
                final lh0 lh0Var3 = this.f42426b;
                final TLRPC.TL_chatInviteExported tL_chatInviteExported2 = this.f42427c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                if (tL_error == null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported22 = (TLRPC.TL_chatInviteExported) tLObject;
                                    lh0 lh0Var22 = lh0Var3;
                                    lh0Var22.e = tL_chatInviteExported22;
                                    TLRPC.ChatFull chatFull = lh0Var22.d;
                                    if (chatFull != null) {
                                        chatFull.exported_invite = tL_chatInviteExported22;
                                    }
                                    if (lh0Var22.getParentActivity() != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported3 = tL_chatInviteExported2;
                                        tL_chatInviteExported3.revoked = true;
                                        ch0 g02 = lh0Var22.g0();
                                        lh0Var22.f39284j0.add(0, tL_chatInviteExported3);
                                        lh0Var22.i0(g02);
                                        org.telegram.messenger.v0.p(R.string.InviteRevokedHint, org.telegram.ui.Components.vc.a0(lh0Var22), R.raw.linkbroken, 36);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                lh0 lh0Var32 = lh0Var3;
                                ArrayList arrayList = lh0Var32.f39283i0;
                                if (tL_error == null) {
                                    TLObject tLObject2 = tLObject;
                                    boolean z10 = tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced;
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported4 = tL_chatInviteExported2;
                                    if (z10) {
                                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                                        if (!lh0Var32.f39289o0) {
                                            lh0Var32.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        tL_chatInviteExported4.revoked = true;
                                        ch0 g03 = lh0Var32.g0();
                                        if (lh0Var32.f39289o0 && lh0Var32.f39279f == lh0Var32.getAccountInstance().getUserConfig().getClientUserId()) {
                                            arrayList.remove(tL_chatInviteExported4);
                                            arrayList.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                                        } else if (lh0Var32.e != null) {
                                            lh0Var32.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        lh0Var32.f39284j0.add(0, tL_chatInviteExported4);
                                        lh0Var32.i0(g03);
                                    } else {
                                        lh0Var32.f39295s0.b(tL_chatInviteExported4, tLObject2);
                                        TLRPC.ChatFull chatFull2 = lh0Var32.d;
                                        if (chatFull2 != null) {
                                            int i10 = chatFull2.invitesCount - 1;
                                            chatFull2.invitesCount = i10;
                                            if (i10 < 0) {
                                                chatFull2.invitesCount = 0;
                                            }
                                            lh0Var32.getMessagesStorage().saveChatLinksCount(lh0Var32.f39287n, lh0Var32.d.invitesCount);
                                        }
                                    }
                                    if (lh0Var32.getParentActivity() != null) {
                                        org.telegram.messenger.v0.p(R.string.InviteRevokedHint, org.telegram.ui.Components.vc.a0(lh0Var32), R.raw.linkbroken, 36);
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
