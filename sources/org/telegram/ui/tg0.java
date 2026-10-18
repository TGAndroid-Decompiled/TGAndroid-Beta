package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class tg0 implements RequestDelegate {
    public final int f41772a;
    public final kh0 f41773b;
    public final TLRPC.TL_chatInviteExported f41774c;

    public tg0(kh0 kh0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, int i10) {
        this.f41772a = i10;
        this.f41773b = kh0Var;
        this.f41774c = tL_chatInviteExported;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f41772a) {
            case 0:
                final kh0 kh0Var = this.f41773b;
                final TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f41774c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                if (tL_error == null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) tLObject;
                                    kh0 kh0Var2 = kh0Var;
                                    kh0Var2.e = tL_chatInviteExported2;
                                    TLRPC.ChatFull chatFull = kh0Var2.d;
                                    if (chatFull != null) {
                                        chatFull.exported_invite = tL_chatInviteExported2;
                                    }
                                    if (kh0Var2.getParentActivity() != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported3 = tL_chatInviteExported;
                                        tL_chatInviteExported3.revoked = true;
                                        bh0 f02 = kh0Var2.f0();
                                        kh0Var2.f38548j0.add(0, tL_chatInviteExported3);
                                        kh0Var2.h0(f02);
                                        org.telegram.messenger.g0.q(R.string.InviteRevokedHint, org.telegram.ui.Components.xc.a0(kh0Var2), R.raw.linkbroken, 36);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                kh0 kh0Var3 = kh0Var;
                                ArrayList arrayList = kh0Var3.f38547i0;
                                if (tL_error == null) {
                                    TLObject tLObject2 = tLObject;
                                    boolean z10 = tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced;
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported4 = tL_chatInviteExported;
                                    if (z10) {
                                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                                        if (!kh0Var3.f38553o0) {
                                            kh0Var3.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        tL_chatInviteExported4.revoked = true;
                                        bh0 f03 = kh0Var3.f0();
                                        if (kh0Var3.f38553o0 && kh0Var3.f38543f == kh0Var3.getAccountInstance().getUserConfig().getClientUserId()) {
                                            arrayList.remove(tL_chatInviteExported4);
                                            arrayList.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                                        } else if (kh0Var3.e != null) {
                                            kh0Var3.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        kh0Var3.f38548j0.add(0, tL_chatInviteExported4);
                                        kh0Var3.h0(f03);
                                    } else {
                                        kh0Var3.f38559s0.b(tL_chatInviteExported4, tLObject2);
                                        TLRPC.ChatFull chatFull2 = kh0Var3.d;
                                        if (chatFull2 != null) {
                                            int i10 = chatFull2.invitesCount - 1;
                                            chatFull2.invitesCount = i10;
                                            if (i10 < 0) {
                                                chatFull2.invitesCount = 0;
                                            }
                                            kh0Var3.getMessagesStorage().saveChatLinksCount(kh0Var3.f38551n, kh0Var3.d.invitesCount);
                                        }
                                    }
                                    if (kh0Var3.getParentActivity() != null) {
                                        org.telegram.messenger.g0.q(R.string.InviteRevokedHint, org.telegram.ui.Components.xc.a0(kh0Var3), R.raw.linkbroken, 36);
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
                kh0 kh0Var2 = this.f41773b;
                kh0Var2.getClass();
                AndroidUtilities.runOnUIThread(new xe0(kh0Var2, tL_error, this.f41774c, 6));
                return;
            default:
                final kh0 kh0Var3 = this.f41773b;
                final TLRPC.TL_chatInviteExported tL_chatInviteExported2 = this.f41774c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                if (tL_error == null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported22 = (TLRPC.TL_chatInviteExported) tLObject;
                                    kh0 kh0Var22 = kh0Var3;
                                    kh0Var22.e = tL_chatInviteExported22;
                                    TLRPC.ChatFull chatFull = kh0Var22.d;
                                    if (chatFull != null) {
                                        chatFull.exported_invite = tL_chatInviteExported22;
                                    }
                                    if (kh0Var22.getParentActivity() != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported3 = tL_chatInviteExported2;
                                        tL_chatInviteExported3.revoked = true;
                                        bh0 f02 = kh0Var22.f0();
                                        kh0Var22.f38548j0.add(0, tL_chatInviteExported3);
                                        kh0Var22.h0(f02);
                                        org.telegram.messenger.g0.q(R.string.InviteRevokedHint, org.telegram.ui.Components.xc.a0(kh0Var22), R.raw.linkbroken, 36);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                kh0 kh0Var32 = kh0Var3;
                                ArrayList arrayList = kh0Var32.f38547i0;
                                if (tL_error == null) {
                                    TLObject tLObject2 = tLObject;
                                    boolean z10 = tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced;
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported4 = tL_chatInviteExported2;
                                    if (z10) {
                                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                                        if (!kh0Var32.f38553o0) {
                                            kh0Var32.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        tL_chatInviteExported4.revoked = true;
                                        bh0 f03 = kh0Var32.f0();
                                        if (kh0Var32.f38553o0 && kh0Var32.f38543f == kh0Var32.getAccountInstance().getUserConfig().getClientUserId()) {
                                            arrayList.remove(tL_chatInviteExported4);
                                            arrayList.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                                        } else if (kh0Var32.e != null) {
                                            kh0Var32.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        kh0Var32.f38548j0.add(0, tL_chatInviteExported4);
                                        kh0Var32.h0(f03);
                                    } else {
                                        kh0Var32.f38559s0.b(tL_chatInviteExported4, tLObject2);
                                        TLRPC.ChatFull chatFull2 = kh0Var32.d;
                                        if (chatFull2 != null) {
                                            int i10 = chatFull2.invitesCount - 1;
                                            chatFull2.invitesCount = i10;
                                            if (i10 < 0) {
                                                chatFull2.invitesCount = 0;
                                            }
                                            kh0Var32.getMessagesStorage().saveChatLinksCount(kh0Var32.f38551n, kh0Var32.d.invitesCount);
                                        }
                                    }
                                    if (kh0Var32.getParentActivity() != null) {
                                        org.telegram.messenger.g0.q(R.string.InviteRevokedHint, org.telegram.ui.Components.xc.a0(kh0Var32), R.raw.linkbroken, 36);
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
