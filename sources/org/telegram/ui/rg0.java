package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rg0 implements RequestDelegate {
    public final int f42418a;
    public final hh0 f42419b;
    public final TLRPC.TL_chatInviteExported f42420c;

    public rg0(hh0 hh0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, int i9) {
        this.f42418a = i9;
        this.f42419b = hh0Var;
        this.f42420c = tL_chatInviteExported;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f42418a) {
            case 0:
                final hh0 hh0Var = this.f42419b;
                final TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f42420c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                if (tL_error == null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) tLObject;
                                    hh0 hh0Var2 = hh0Var;
                                    hh0Var2.f38798e = tL_chatInviteExported2;
                                    TLRPC.ChatFull chatFull = hh0Var2.d;
                                    if (chatFull != null) {
                                        chatFull.exported_invite = tL_chatInviteExported2;
                                    }
                                    if (hh0Var2.getParentActivity() != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported3 = tL_chatInviteExported;
                                        tL_chatInviteExported3.revoked = true;
                                        yg0 e02 = hh0Var2.e0();
                                        hh0Var2.f38801f0.add(0, tL_chatInviteExported3);
                                        hh0Var2.g0(e02);
                                        org.telegram.messenger.l0.p(R.string.InviteRevokedHint, org.telegram.ui.Components.oc.a0(hh0Var2), R.raw.linkbroken, 36);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                hh0 hh0Var3 = hh0Var;
                                ArrayList arrayList = hh0Var3.f38799e0;
                                if (tL_error == null) {
                                    TLObject tLObject2 = tLObject;
                                    boolean z10 = tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced;
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported4 = tL_chatInviteExported;
                                    if (z10) {
                                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                                        if (!hh0Var3.f38806k0) {
                                            hh0Var3.f38798e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        tL_chatInviteExported4.revoked = true;
                                        yg0 e03 = hh0Var3.e0();
                                        if (hh0Var3.f38806k0 && hh0Var3.f38800f == hh0Var3.getAccountInstance().getUserConfig().getClientUserId()) {
                                            arrayList.remove(tL_chatInviteExported4);
                                            arrayList.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                                        } else if (hh0Var3.f38798e != null) {
                                            hh0Var3.f38798e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        hh0Var3.f38801f0.add(0, tL_chatInviteExported4);
                                        hh0Var3.g0(e03);
                                    } else {
                                        hh0Var3.f38810o0.b(tL_chatInviteExported4, tLObject2);
                                        TLRPC.ChatFull chatFull2 = hh0Var3.d;
                                        if (chatFull2 != null) {
                                            int i9 = chatFull2.invitesCount - 1;
                                            chatFull2.invitesCount = i9;
                                            if (i9 < 0) {
                                                chatFull2.invitesCount = 0;
                                            }
                                            hh0Var3.getMessagesStorage().saveChatLinksCount(hh0Var3.f38808n, hh0Var3.d.invitesCount);
                                        }
                                    }
                                    if (hh0Var3.getParentActivity() != null) {
                                        org.telegram.messenger.l0.p(R.string.InviteRevokedHint, org.telegram.ui.Components.oc.a0(hh0Var3), R.raw.linkbroken, 36);
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
                hh0 hh0Var2 = this.f42419b;
                hh0Var2.getClass();
                AndroidUtilities.runOnUIThread(new ye0(hh0Var2, tL_error, this.f42420c, 5));
                return;
            default:
                final hh0 hh0Var3 = this.f42419b;
                final TLRPC.TL_chatInviteExported tL_chatInviteExported2 = this.f42420c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                if (tL_error == null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported22 = (TLRPC.TL_chatInviteExported) tLObject;
                                    hh0 hh0Var22 = hh0Var3;
                                    hh0Var22.f38798e = tL_chatInviteExported22;
                                    TLRPC.ChatFull chatFull = hh0Var22.d;
                                    if (chatFull != null) {
                                        chatFull.exported_invite = tL_chatInviteExported22;
                                    }
                                    if (hh0Var22.getParentActivity() != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported3 = tL_chatInviteExported2;
                                        tL_chatInviteExported3.revoked = true;
                                        yg0 e02 = hh0Var22.e0();
                                        hh0Var22.f38801f0.add(0, tL_chatInviteExported3);
                                        hh0Var22.g0(e02);
                                        org.telegram.messenger.l0.p(R.string.InviteRevokedHint, org.telegram.ui.Components.oc.a0(hh0Var22), R.raw.linkbroken, 36);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                hh0 hh0Var32 = hh0Var3;
                                ArrayList arrayList = hh0Var32.f38799e0;
                                if (tL_error == null) {
                                    TLObject tLObject2 = tLObject;
                                    boolean z10 = tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced;
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported4 = tL_chatInviteExported2;
                                    if (z10) {
                                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                                        if (!hh0Var32.f38806k0) {
                                            hh0Var32.f38798e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        tL_chatInviteExported4.revoked = true;
                                        yg0 e03 = hh0Var32.e0();
                                        if (hh0Var32.f38806k0 && hh0Var32.f38800f == hh0Var32.getAccountInstance().getUserConfig().getClientUserId()) {
                                            arrayList.remove(tL_chatInviteExported4);
                                            arrayList.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                                        } else if (hh0Var32.f38798e != null) {
                                            hh0Var32.f38798e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        hh0Var32.f38801f0.add(0, tL_chatInviteExported4);
                                        hh0Var32.g0(e03);
                                    } else {
                                        hh0Var32.f38810o0.b(tL_chatInviteExported4, tLObject2);
                                        TLRPC.ChatFull chatFull2 = hh0Var32.d;
                                        if (chatFull2 != null) {
                                            int i9 = chatFull2.invitesCount - 1;
                                            chatFull2.invitesCount = i9;
                                            if (i9 < 0) {
                                                chatFull2.invitesCount = 0;
                                            }
                                            hh0Var32.getMessagesStorage().saveChatLinksCount(hh0Var32.f38808n, hh0Var32.d.invitesCount);
                                        }
                                    }
                                    if (hh0Var32.getParentActivity() != null) {
                                        org.telegram.messenger.l0.p(R.string.InviteRevokedHint, org.telegram.ui.Components.oc.a0(hh0Var32), R.raw.linkbroken, 36);
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
