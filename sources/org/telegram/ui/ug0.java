package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class ug0 implements RequestDelegate {

    public final int f43222a;

    public final kh0 f43223b;

    public final TLRPC.TL_chatInviteExported f43224c;

    public ug0(kh0 kh0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, int i10) {
        this.f43222a = i10;
        this.f43223b = kh0Var;
        this.f43224c = tL_chatInviteExported;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f43222a) {
            case 0:
                final int i10 = 0;
                final kh0 kh0Var = this.f43223b;
                final TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f43224c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i10) {
                            case 0:
                                if (tL_error == null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) tLObject;
                                    kh0 kh0Var2 = kh0Var;
                                    kh0Var2.f39743e = tL_chatInviteExported2;
                                    TLRPC.ChatFull chatFull = kh0Var2.d;
                                    if (chatFull != null) {
                                        chatFull.exported_invite = tL_chatInviteExported2;
                                    }
                                    if (kh0Var2.getParentActivity() != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported3 = tL_chatInviteExported;
                                        tL_chatInviteExported3.revoked = true;
                                        bh0 bh0VarF0 = kh0Var2.f0();
                                        kh0Var2.f39746f0.add(0, tL_chatInviteExported3);
                                        kh0Var2.h0(bh0VarF0);
                                        org.telegram.messenger.y1.q(R.string.InviteRevokedHint, org.telegram.ui.Components.mc.a0(kh0Var2), R.raw.linkbroken, 36);
                                        break;
                                    }
                                }
                                break;
                            default:
                                kh0 kh0Var3 = kh0Var;
                                ArrayList arrayList = kh0Var3.f39744e0;
                                if (tL_error == null) {
                                    TLObject tLObject2 = tLObject;
                                    boolean z10 = tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced;
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported4 = tL_chatInviteExported;
                                    if (z10) {
                                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                                        if (!kh0Var3.f39751k0) {
                                            kh0Var3.f39743e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        tL_chatInviteExported4.revoked = true;
                                        bh0 bh0VarF1 = kh0Var3.f0();
                                        if (kh0Var3.f39751k0 && kh0Var3.f39745f == kh0Var3.getAccountInstance().getUserConfig().getClientUserId()) {
                                            arrayList.remove(tL_chatInviteExported4);
                                            arrayList.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                                        } else if (kh0Var3.f39743e != null) {
                                            kh0Var3.f39743e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        kh0Var3.f39746f0.add(0, tL_chatInviteExported4);
                                        kh0Var3.h0(bh0VarF1);
                                    } else {
                                        kh0Var3.f39755o0.b(tL_chatInviteExported4, tLObject2);
                                        TLRPC.ChatFull chatFull2 = kh0Var3.d;
                                        if (chatFull2 != null) {
                                            int i11 = chatFull2.invitesCount - 1;
                                            chatFull2.invitesCount = i11;
                                            if (i11 < 0) {
                                                chatFull2.invitesCount = 0;
                                            }
                                            kh0Var3.getMessagesStorage().saveChatLinksCount(kh0Var3.f39753n, kh0Var3.d.invitesCount);
                                        }
                                    }
                                    if (kh0Var3.getParentActivity() != null) {
                                        org.telegram.messenger.y1.q(R.string.InviteRevokedHint, org.telegram.ui.Components.mc.a0(kh0Var3), R.raw.linkbroken, 36);
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            case 1:
                kh0 kh0Var2 = this.f43223b;
                kh0Var2.getClass();
                AndroidUtilities.runOnUIThread(new bf0(kh0Var2, tL_error, this.f43224c, 5));
                break;
            default:
                final int i11 = 1;
                final kh0 kh0Var3 = this.f43223b;
                final TLRPC.TL_chatInviteExported tL_chatInviteExported2 = this.f43224c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i11) {
                            case 0:
                                if (tL_error == null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tLObject;
                                    kh0 kh0Var4 = kh0Var3;
                                    kh0Var4.f39743e = tL_chatInviteExported3;
                                    TLRPC.ChatFull chatFull = kh0Var4.d;
                                    if (chatFull != null) {
                                        chatFull.exported_invite = tL_chatInviteExported3;
                                    }
                                    if (kh0Var4.getParentActivity() != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported4 = tL_chatInviteExported2;
                                        tL_chatInviteExported4.revoked = true;
                                        bh0 bh0VarF0 = kh0Var4.f0();
                                        kh0Var4.f39746f0.add(0, tL_chatInviteExported4);
                                        kh0Var4.h0(bh0VarF0);
                                        org.telegram.messenger.y1.q(R.string.InviteRevokedHint, org.telegram.ui.Components.mc.a0(kh0Var4), R.raw.linkbroken, 36);
                                        break;
                                    }
                                }
                                break;
                            default:
                                kh0 kh0Var5 = kh0Var3;
                                ArrayList arrayList = kh0Var5.f39744e0;
                                if (tL_error == null) {
                                    TLObject tLObject2 = tLObject;
                                    boolean z10 = tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced;
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported5 = tL_chatInviteExported2;
                                    if (z10) {
                                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                                        if (!kh0Var5.f39751k0) {
                                            kh0Var5.f39743e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        tL_chatInviteExported5.revoked = true;
                                        bh0 bh0VarF1 = kh0Var5.f0();
                                        if (kh0Var5.f39751k0 && kh0Var5.f39745f == kh0Var5.getAccountInstance().getUserConfig().getClientUserId()) {
                                            arrayList.remove(tL_chatInviteExported5);
                                            arrayList.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                                        } else if (kh0Var5.f39743e != null) {
                                            kh0Var5.f39743e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        kh0Var5.f39746f0.add(0, tL_chatInviteExported5);
                                        kh0Var5.h0(bh0VarF1);
                                    } else {
                                        kh0Var5.f39755o0.b(tL_chatInviteExported5, tLObject2);
                                        TLRPC.ChatFull chatFull2 = kh0Var5.d;
                                        if (chatFull2 != null) {
                                            int i12 = chatFull2.invitesCount - 1;
                                            chatFull2.invitesCount = i12;
                                            if (i12 < 0) {
                                                chatFull2.invitesCount = 0;
                                            }
                                            kh0Var5.getMessagesStorage().saveChatLinksCount(kh0Var5.f39753n, kh0Var5.d.invitesCount);
                                        }
                                    }
                                    if (kh0Var5.getParentActivity() != null) {
                                        org.telegram.messenger.y1.q(R.string.InviteRevokedHint, org.telegram.ui.Components.mc.a0(kh0Var5), R.raw.linkbroken, 36);
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
        }
    }
}
