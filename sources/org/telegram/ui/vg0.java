package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vg0 implements RequestDelegate {
    public final int f42767a;
    public final mh0 f42768b;
    public final TLRPC.TL_chatInviteExported f42769c;

    public vg0(mh0 mh0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, int i10) {
        this.f42767a = i10;
        this.f42768b = mh0Var;
        this.f42769c = tL_chatInviteExported;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f42767a) {
            case 0:
                final mh0 mh0Var = this.f42768b;
                final TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f42769c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                if (tL_error == null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) tLObject;
                                    mh0 mh0Var2 = mh0Var;
                                    mh0Var2.e = tL_chatInviteExported2;
                                    TLRPC.ChatFull chatFull = mh0Var2.d;
                                    if (chatFull != null) {
                                        chatFull.exported_invite = tL_chatInviteExported2;
                                    }
                                    if (mh0Var2.getParentActivity() != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported3 = tL_chatInviteExported;
                                        tL_chatInviteExported3.revoked = true;
                                        dh0 g02 = mh0Var2.g0();
                                        mh0Var2.f39589j0.add(0, tL_chatInviteExported3);
                                        mh0Var2.i0(g02);
                                        org.telegram.messenger.v0.p(R.string.InviteRevokedHint, org.telegram.ui.Components.xc.a0(mh0Var2), R.raw.linkbroken, 36);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                mh0 mh0Var3 = mh0Var;
                                ArrayList arrayList = mh0Var3.f39588i0;
                                if (tL_error == null) {
                                    TLObject tLObject2 = tLObject;
                                    boolean z10 = tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced;
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported4 = tL_chatInviteExported;
                                    if (z10) {
                                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                                        if (!mh0Var3.f39594o0) {
                                            mh0Var3.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        tL_chatInviteExported4.revoked = true;
                                        dh0 g03 = mh0Var3.g0();
                                        if (mh0Var3.f39594o0 && mh0Var3.f39584f == mh0Var3.getAccountInstance().getUserConfig().getClientUserId()) {
                                            arrayList.remove(tL_chatInviteExported4);
                                            arrayList.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                                        } else if (mh0Var3.e != null) {
                                            mh0Var3.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        mh0Var3.f39589j0.add(0, tL_chatInviteExported4);
                                        mh0Var3.i0(g03);
                                    } else {
                                        mh0Var3.f39600s0.b(tL_chatInviteExported4, tLObject2);
                                        TLRPC.ChatFull chatFull2 = mh0Var3.d;
                                        if (chatFull2 != null) {
                                            int i10 = chatFull2.invitesCount - 1;
                                            chatFull2.invitesCount = i10;
                                            if (i10 < 0) {
                                                chatFull2.invitesCount = 0;
                                            }
                                            mh0Var3.getMessagesStorage().saveChatLinksCount(mh0Var3.f39592n, mh0Var3.d.invitesCount);
                                        }
                                    }
                                    if (mh0Var3.getParentActivity() != null) {
                                        org.telegram.messenger.v0.p(R.string.InviteRevokedHint, org.telegram.ui.Components.xc.a0(mh0Var3), R.raw.linkbroken, 36);
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
                mh0 mh0Var2 = this.f42768b;
                mh0Var2.getClass();
                AndroidUtilities.runOnUIThread(new re0(mh0Var2, tL_error, this.f42769c, 7));
                return;
            default:
                final mh0 mh0Var3 = this.f42768b;
                final TLRPC.TL_chatInviteExported tL_chatInviteExported2 = this.f42769c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                if (tL_error == null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported22 = (TLRPC.TL_chatInviteExported) tLObject;
                                    mh0 mh0Var22 = mh0Var3;
                                    mh0Var22.e = tL_chatInviteExported22;
                                    TLRPC.ChatFull chatFull = mh0Var22.d;
                                    if (chatFull != null) {
                                        chatFull.exported_invite = tL_chatInviteExported22;
                                    }
                                    if (mh0Var22.getParentActivity() != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported3 = tL_chatInviteExported2;
                                        tL_chatInviteExported3.revoked = true;
                                        dh0 g02 = mh0Var22.g0();
                                        mh0Var22.f39589j0.add(0, tL_chatInviteExported3);
                                        mh0Var22.i0(g02);
                                        org.telegram.messenger.v0.p(R.string.InviteRevokedHint, org.telegram.ui.Components.xc.a0(mh0Var22), R.raw.linkbroken, 36);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                mh0 mh0Var32 = mh0Var3;
                                ArrayList arrayList = mh0Var32.f39588i0;
                                if (tL_error == null) {
                                    TLObject tLObject2 = tLObject;
                                    boolean z10 = tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced;
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported4 = tL_chatInviteExported2;
                                    if (z10) {
                                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                                        if (!mh0Var32.f39594o0) {
                                            mh0Var32.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        tL_chatInviteExported4.revoked = true;
                                        dh0 g03 = mh0Var32.g0();
                                        if (mh0Var32.f39594o0 && mh0Var32.f39584f == mh0Var32.getAccountInstance().getUserConfig().getClientUserId()) {
                                            arrayList.remove(tL_chatInviteExported4);
                                            arrayList.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                                        } else if (mh0Var32.e != null) {
                                            mh0Var32.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        mh0Var32.f39589j0.add(0, tL_chatInviteExported4);
                                        mh0Var32.i0(g03);
                                    } else {
                                        mh0Var32.f39600s0.b(tL_chatInviteExported4, tLObject2);
                                        TLRPC.ChatFull chatFull2 = mh0Var32.d;
                                        if (chatFull2 != null) {
                                            int i10 = chatFull2.invitesCount - 1;
                                            chatFull2.invitesCount = i10;
                                            if (i10 < 0) {
                                                chatFull2.invitesCount = 0;
                                            }
                                            mh0Var32.getMessagesStorage().saveChatLinksCount(mh0Var32.f39592n, mh0Var32.d.invitesCount);
                                        }
                                    }
                                    if (mh0Var32.getParentActivity() != null) {
                                        org.telegram.messenger.v0.p(R.string.InviteRevokedHint, org.telegram.ui.Components.xc.a0(mh0Var32), R.raw.linkbroken, 36);
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
