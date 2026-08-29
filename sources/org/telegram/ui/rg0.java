package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rg0 implements RequestDelegate {
    public final int f42095a;
    public final hh0 f42096b;
    public final TLRPC.TL_chatInviteExported f42097c;

    public rg0(hh0 hh0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, int i10) {
        this.f42095a = i10;
        this.f42096b = hh0Var;
        this.f42097c = tL_chatInviteExported;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f42095a) {
            case 0:
                final hh0 hh0Var = this.f42096b;
                final TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f42097c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                if (tL_error == null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) tLObject;
                                    hh0 hh0Var2 = hh0Var;
                                    hh0Var2.f38919e = tL_chatInviteExported2;
                                    TLRPC.ChatFull chatFull = hh0Var2.d;
                                    if (chatFull != null) {
                                        chatFull.exported_invite = tL_chatInviteExported2;
                                    }
                                    if (hh0Var2.getParentActivity() != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported3 = tL_chatInviteExported;
                                        tL_chatInviteExported3.revoked = true;
                                        yg0 f02 = hh0Var2.f0();
                                        hh0Var2.f38922f0.add(0, tL_chatInviteExported3);
                                        hh0Var2.h0(f02);
                                        j7.l1.v(R.string.InviteRevokedHint, org.telegram.ui.Components.tc.a0(hh0Var2), R.raw.linkbroken, 36);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                hh0 hh0Var3 = hh0Var;
                                ArrayList arrayList = hh0Var3.f38920e0;
                                if (tL_error == null) {
                                    TLObject tLObject2 = tLObject;
                                    boolean z10 = tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced;
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported4 = tL_chatInviteExported;
                                    if (z10) {
                                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                                        if (!hh0Var3.f38927k0) {
                                            hh0Var3.f38919e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        tL_chatInviteExported4.revoked = true;
                                        yg0 f03 = hh0Var3.f0();
                                        if (hh0Var3.f38927k0 && hh0Var3.f38921f == hh0Var3.getAccountInstance().getUserConfig().getClientUserId()) {
                                            arrayList.remove(tL_chatInviteExported4);
                                            arrayList.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                                        } else if (hh0Var3.f38919e != null) {
                                            hh0Var3.f38919e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        hh0Var3.f38922f0.add(0, tL_chatInviteExported4);
                                        hh0Var3.h0(f03);
                                    } else {
                                        hh0Var3.f38931o0.b(tL_chatInviteExported4, tLObject2);
                                        TLRPC.ChatFull chatFull2 = hh0Var3.d;
                                        if (chatFull2 != null) {
                                            int i10 = chatFull2.invitesCount - 1;
                                            chatFull2.invitesCount = i10;
                                            if (i10 < 0) {
                                                chatFull2.invitesCount = 0;
                                            }
                                            hh0Var3.getMessagesStorage().saveChatLinksCount(hh0Var3.f38929n, hh0Var3.d.invitesCount);
                                        }
                                    }
                                    if (hh0Var3.getParentActivity() != null) {
                                        j7.l1.v(R.string.InviteRevokedHint, org.telegram.ui.Components.tc.a0(hh0Var3), R.raw.linkbroken, 36);
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
                hh0 hh0Var2 = this.f42096b;
                hh0Var2.getClass();
                AndroidUtilities.runOnUIThread(new xe0(hh0Var2, tL_error, this.f42097c, 5));
                return;
            default:
                final hh0 hh0Var3 = this.f42096b;
                final TLRPC.TL_chatInviteExported tL_chatInviteExported2 = this.f42097c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                if (tL_error == null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported22 = (TLRPC.TL_chatInviteExported) tLObject;
                                    hh0 hh0Var22 = hh0Var3;
                                    hh0Var22.f38919e = tL_chatInviteExported22;
                                    TLRPC.ChatFull chatFull = hh0Var22.d;
                                    if (chatFull != null) {
                                        chatFull.exported_invite = tL_chatInviteExported22;
                                    }
                                    if (hh0Var22.getParentActivity() != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported3 = tL_chatInviteExported2;
                                        tL_chatInviteExported3.revoked = true;
                                        yg0 f02 = hh0Var22.f0();
                                        hh0Var22.f38922f0.add(0, tL_chatInviteExported3);
                                        hh0Var22.h0(f02);
                                        j7.l1.v(R.string.InviteRevokedHint, org.telegram.ui.Components.tc.a0(hh0Var22), R.raw.linkbroken, 36);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                hh0 hh0Var32 = hh0Var3;
                                ArrayList arrayList = hh0Var32.f38920e0;
                                if (tL_error == null) {
                                    TLObject tLObject2 = tLObject;
                                    boolean z10 = tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced;
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported4 = tL_chatInviteExported2;
                                    if (z10) {
                                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                                        if (!hh0Var32.f38927k0) {
                                            hh0Var32.f38919e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        tL_chatInviteExported4.revoked = true;
                                        yg0 f03 = hh0Var32.f0();
                                        if (hh0Var32.f38927k0 && hh0Var32.f38921f == hh0Var32.getAccountInstance().getUserConfig().getClientUserId()) {
                                            arrayList.remove(tL_chatInviteExported4);
                                            arrayList.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                                        } else if (hh0Var32.f38919e != null) {
                                            hh0Var32.f38919e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        hh0Var32.f38922f0.add(0, tL_chatInviteExported4);
                                        hh0Var32.h0(f03);
                                    } else {
                                        hh0Var32.f38931o0.b(tL_chatInviteExported4, tLObject2);
                                        TLRPC.ChatFull chatFull2 = hh0Var32.d;
                                        if (chatFull2 != null) {
                                            int i10 = chatFull2.invitesCount - 1;
                                            chatFull2.invitesCount = i10;
                                            if (i10 < 0) {
                                                chatFull2.invitesCount = 0;
                                            }
                                            hh0Var32.getMessagesStorage().saveChatLinksCount(hh0Var32.f38929n, hh0Var32.d.invitesCount);
                                        }
                                    }
                                    if (hh0Var32.getParentActivity() != null) {
                                        j7.l1.v(R.string.InviteRevokedHint, org.telegram.ui.Components.tc.a0(hh0Var32), R.raw.linkbroken, 36);
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
