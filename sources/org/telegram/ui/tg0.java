package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class tg0 implements RequestDelegate {
    public final int f43836a;
    public final jh0 f43837b;
    public final TLRPC.TL_chatInviteExported f43838c;

    public tg0(jh0 jh0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, int i10) {
        this.f43836a = i10;
        this.f43837b = jh0Var;
        this.f43838c = tL_chatInviteExported;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f43836a) {
            case 0:
                final jh0 jh0Var = this.f43837b;
                final TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f43838c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                if (tL_error == null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) tLObject;
                                    jh0 jh0Var2 = jh0Var;
                                    jh0Var2.e = tL_chatInviteExported2;
                                    TLRPC.ChatFull chatFull = jh0Var2.d;
                                    if (chatFull != null) {
                                        chatFull.exported_invite = tL_chatInviteExported2;
                                    }
                                    if (jh0Var2.getParentActivity() != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported3 = tL_chatInviteExported;
                                        tL_chatInviteExported3.revoked = true;
                                        ah0 h02 = jh0Var2.h0();
                                        jh0Var2.f40658j0.add(0, tL_chatInviteExported3);
                                        jh0Var2.j0(h02);
                                        org.telegram.messenger.t.q(R.string.InviteRevokedHint, org.telegram.ui.Components.wc.b0(jh0Var2), R.raw.linkbroken, 36);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                jh0 jh0Var3 = jh0Var;
                                ArrayList arrayList = jh0Var3.f40657i0;
                                if (tL_error == null) {
                                    TLObject tLObject2 = tLObject;
                                    boolean z10 = tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced;
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported4 = tL_chatInviteExported;
                                    if (z10) {
                                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                                        if (!jh0Var3.f40663o0) {
                                            jh0Var3.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        tL_chatInviteExported4.revoked = true;
                                        ah0 h03 = jh0Var3.h0();
                                        if (jh0Var3.f40663o0 && jh0Var3.f40653f == jh0Var3.getAccountInstance().getUserConfig().getClientUserId()) {
                                            arrayList.remove(tL_chatInviteExported4);
                                            arrayList.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                                        } else if (jh0Var3.e != null) {
                                            jh0Var3.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        jh0Var3.f40658j0.add(0, tL_chatInviteExported4);
                                        jh0Var3.j0(h03);
                                    } else {
                                        jh0Var3.f40669s0.b(tL_chatInviteExported4, tLObject2);
                                        TLRPC.ChatFull chatFull2 = jh0Var3.d;
                                        if (chatFull2 != null) {
                                            int i10 = chatFull2.invitesCount - 1;
                                            chatFull2.invitesCount = i10;
                                            if (i10 < 0) {
                                                chatFull2.invitesCount = 0;
                                            }
                                            jh0Var3.getMessagesStorage().saveChatLinksCount(jh0Var3.f40661n, jh0Var3.d.invitesCount);
                                        }
                                    }
                                    if (jh0Var3.getParentActivity() != null) {
                                        org.telegram.messenger.t.q(R.string.InviteRevokedHint, org.telegram.ui.Components.wc.b0(jh0Var3), R.raw.linkbroken, 36);
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
                jh0 jh0Var2 = this.f43837b;
                jh0Var2.getClass();
                AndroidUtilities.runOnUIThread(new oe0(jh0Var2, tL_error, this.f43838c, 7));
                return;
            default:
                final jh0 jh0Var3 = this.f43837b;
                final TLRPC.TL_chatInviteExported tL_chatInviteExported2 = this.f43838c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                if (tL_error == null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported22 = (TLRPC.TL_chatInviteExported) tLObject;
                                    jh0 jh0Var22 = jh0Var3;
                                    jh0Var22.e = tL_chatInviteExported22;
                                    TLRPC.ChatFull chatFull = jh0Var22.d;
                                    if (chatFull != null) {
                                        chatFull.exported_invite = tL_chatInviteExported22;
                                    }
                                    if (jh0Var22.getParentActivity() != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported3 = tL_chatInviteExported2;
                                        tL_chatInviteExported3.revoked = true;
                                        ah0 h02 = jh0Var22.h0();
                                        jh0Var22.f40658j0.add(0, tL_chatInviteExported3);
                                        jh0Var22.j0(h02);
                                        org.telegram.messenger.t.q(R.string.InviteRevokedHint, org.telegram.ui.Components.wc.b0(jh0Var22), R.raw.linkbroken, 36);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                jh0 jh0Var32 = jh0Var3;
                                ArrayList arrayList = jh0Var32.f40657i0;
                                if (tL_error == null) {
                                    TLObject tLObject2 = tLObject;
                                    boolean z10 = tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced;
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported4 = tL_chatInviteExported2;
                                    if (z10) {
                                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                                        if (!jh0Var32.f40663o0) {
                                            jh0Var32.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        tL_chatInviteExported4.revoked = true;
                                        ah0 h03 = jh0Var32.h0();
                                        if (jh0Var32.f40663o0 && jh0Var32.f40653f == jh0Var32.getAccountInstance().getUserConfig().getClientUserId()) {
                                            arrayList.remove(tL_chatInviteExported4);
                                            arrayList.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                                        } else if (jh0Var32.e != null) {
                                            jh0Var32.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        jh0Var32.f40658j0.add(0, tL_chatInviteExported4);
                                        jh0Var32.j0(h03);
                                    } else {
                                        jh0Var32.f40669s0.b(tL_chatInviteExported4, tLObject2);
                                        TLRPC.ChatFull chatFull2 = jh0Var32.d;
                                        if (chatFull2 != null) {
                                            int i10 = chatFull2.invitesCount - 1;
                                            chatFull2.invitesCount = i10;
                                            if (i10 < 0) {
                                                chatFull2.invitesCount = 0;
                                            }
                                            jh0Var32.getMessagesStorage().saveChatLinksCount(jh0Var32.f40661n, jh0Var32.d.invitesCount);
                                        }
                                    }
                                    if (jh0Var32.getParentActivity() != null) {
                                        org.telegram.messenger.t.q(R.string.InviteRevokedHint, org.telegram.ui.Components.wc.b0(jh0Var32), R.raw.linkbroken, 36);
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
