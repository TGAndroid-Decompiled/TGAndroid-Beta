package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zg0 implements RequestDelegate {
    public final int f40797a;
    public final ph0 f40798b;
    public final TLRPC.TL_chatInviteExported f40799c;

    public zg0(ph0 ph0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, int i10) {
        this.f40797a = i10;
        this.f40798b = ph0Var;
        this.f40799c = tL_chatInviteExported;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f40797a) {
            case 0:
                final ph0 ph0Var = this.f40798b;
                final TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f40799c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                if (tL_error == null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) tLObject;
                                    ph0 ph0Var2 = ph0Var;
                                    ph0Var2.e = tL_chatInviteExported2;
                                    TLRPC.ChatFull chatFull = ph0Var2.d;
                                    if (chatFull != null) {
                                        chatFull.exported_invite = tL_chatInviteExported2;
                                    }
                                    if (ph0Var2.getParentActivity() != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported3 = tL_chatInviteExported;
                                        tL_chatInviteExported3.revoked = true;
                                        gh0 f02 = ph0Var2.f0();
                                        ph0Var2.f37327g0.add(0, tL_chatInviteExported3);
                                        ph0Var2.h0(f02);
                                        kh.a2.v(R.string.InviteRevokedHint, org.telegram.ui.Components.qc.a0(ph0Var2), R.raw.linkbroken, 36);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                ph0 ph0Var3 = ph0Var;
                                ArrayList arrayList = ph0Var3.f37326f0;
                                if (tL_error == null) {
                                    TLObject tLObject2 = tLObject;
                                    boolean z4 = tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced;
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported4 = tL_chatInviteExported;
                                    if (z4) {
                                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                                        if (!ph0Var3.f37332l0) {
                                            ph0Var3.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        tL_chatInviteExported4.revoked = true;
                                        gh0 f03 = ph0Var3.f0();
                                        if (ph0Var3.f37332l0 && ph0Var3.f37325f == ph0Var3.getAccountInstance().getUserConfig().getClientUserId()) {
                                            arrayList.remove(tL_chatInviteExported4);
                                            arrayList.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                                        } else if (ph0Var3.e != null) {
                                            ph0Var3.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        ph0Var3.f37327g0.add(0, tL_chatInviteExported4);
                                        ph0Var3.h0(f03);
                                    } else {
                                        ph0Var3.f37336p0.b(tL_chatInviteExported4, tLObject2);
                                        TLRPC.ChatFull chatFull2 = ph0Var3.d;
                                        if (chatFull2 != null) {
                                            int i10 = chatFull2.invitesCount - 1;
                                            chatFull2.invitesCount = i10;
                                            if (i10 < 0) {
                                                chatFull2.invitesCount = 0;
                                            }
                                            ph0Var3.getMessagesStorage().saveChatLinksCount(ph0Var3.f37333n, ph0Var3.d.invitesCount);
                                        }
                                    }
                                    if (ph0Var3.getParentActivity() != null) {
                                        kh.a2.v(R.string.InviteRevokedHint, org.telegram.ui.Components.qc.a0(ph0Var3), R.raw.linkbroken, 36);
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
                ph0 ph0Var2 = this.f40798b;
                ph0Var2.getClass();
                AndroidUtilities.runOnUIThread(new hf0(ph0Var2, tL_error, this.f40799c, 5));
                return;
            default:
                final ph0 ph0Var3 = this.f40798b;
                final TLRPC.TL_chatInviteExported tL_chatInviteExported2 = this.f40799c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                if (tL_error == null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported22 = (TLRPC.TL_chatInviteExported) tLObject;
                                    ph0 ph0Var22 = ph0Var3;
                                    ph0Var22.e = tL_chatInviteExported22;
                                    TLRPC.ChatFull chatFull = ph0Var22.d;
                                    if (chatFull != null) {
                                        chatFull.exported_invite = tL_chatInviteExported22;
                                    }
                                    if (ph0Var22.getParentActivity() != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported3 = tL_chatInviteExported2;
                                        tL_chatInviteExported3.revoked = true;
                                        gh0 f02 = ph0Var22.f0();
                                        ph0Var22.f37327g0.add(0, tL_chatInviteExported3);
                                        ph0Var22.h0(f02);
                                        kh.a2.v(R.string.InviteRevokedHint, org.telegram.ui.Components.qc.a0(ph0Var22), R.raw.linkbroken, 36);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                ph0 ph0Var32 = ph0Var3;
                                ArrayList arrayList = ph0Var32.f37326f0;
                                if (tL_error == null) {
                                    TLObject tLObject2 = tLObject;
                                    boolean z4 = tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced;
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported4 = tL_chatInviteExported2;
                                    if (z4) {
                                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                                        if (!ph0Var32.f37332l0) {
                                            ph0Var32.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        tL_chatInviteExported4.revoked = true;
                                        gh0 f03 = ph0Var32.f0();
                                        if (ph0Var32.f37332l0 && ph0Var32.f37325f == ph0Var32.getAccountInstance().getUserConfig().getClientUserId()) {
                                            arrayList.remove(tL_chatInviteExported4);
                                            arrayList.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                                        } else if (ph0Var32.e != null) {
                                            ph0Var32.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        ph0Var32.f37327g0.add(0, tL_chatInviteExported4);
                                        ph0Var32.h0(f03);
                                    } else {
                                        ph0Var32.f37336p0.b(tL_chatInviteExported4, tLObject2);
                                        TLRPC.ChatFull chatFull2 = ph0Var32.d;
                                        if (chatFull2 != null) {
                                            int i10 = chatFull2.invitesCount - 1;
                                            chatFull2.invitesCount = i10;
                                            if (i10 < 0) {
                                                chatFull2.invitesCount = 0;
                                            }
                                            ph0Var32.getMessagesStorage().saveChatLinksCount(ph0Var32.f37333n, ph0Var32.d.invitesCount);
                                        }
                                    }
                                    if (ph0Var32.getParentActivity() != null) {
                                        kh.a2.v(R.string.InviteRevokedHint, org.telegram.ui.Components.qc.a0(ph0Var32), R.raw.linkbroken, 36);
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
