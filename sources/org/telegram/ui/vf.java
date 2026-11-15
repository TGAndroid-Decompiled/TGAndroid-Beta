package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
public final class vf implements org.telegram.messenger.s10 {
    public final int f52208a;
    public final int f52209b;
    public final Object f52210c;
    public final Object d;

    public vf(Object obj, int i7, TLObject tLObject, int i10) {
        this.f52208a = i10;
        this.f52210c = obj;
        this.f52209b = i7;
        this.d = tLObject;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        TLRPC.Updates updates;
        int i7 = this.f52208a;
        int i10 = this.f52209b;
        Object obj3 = this.d;
        Object obj4 = this.f52210c;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.h3(new ai.g1((an) obj4, this.f52209b, (Boolean) obj, (TLRPC.WebPage) obj2, (TL_account.getWebPagePreview) obj3, 12));
                return;
            case 1:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                g50 g50Var = (g50) obj3;
                TLRPC.ChatInviteJoinResult chatInviteJoinResult = (TLRPC.ChatInviteJoinResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                String str = LaunchActivity.C1;
                if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
                    TLRPC.Updates updates2 = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
                    org.telegram.messenger.np.s1(launchActivity.P).O3(updates2, false);
                    updates = updates2;
                } else {
                    if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                        org.telegram.messenger.g0.h3(new g50(6, launchActivity, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult));
                    }
                    updates = null;
                }
                org.telegram.messenger.g0.h3(new ai.g1(launchActivity, g50Var, tL_error, updates, this.f52209b, 21));
                return;
            case 2:
                PasskeysActivity passkeysActivity = (PasskeysActivity) obj4;
                TL_account.Passkey passkey = (TL_account.Passkey) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                ArrayList arrayList = passkeysActivity.f42705b;
                if (((TLRPC.Bool) obj) instanceof TLRPC.TL_boolFalse) {
                    org.telegram.ui.Components.cc.a0(passkeysActivity).e0("FALSE", false);
                    arrayList.add(Utilities.j(i10, arrayList.size(), 0), passkey);
                    passkeysActivity.f42704a.f39892g3.O(true);
                    return;
                } else if (tL_error2 != null) {
                    org.telegram.ui.Components.cc.a0(passkeysActivity).f0(tL_error2, false);
                    arrayList.add(Utilities.j(i10, arrayList.size(), 0), passkey);
                    passkeysActivity.f42704a.f39892g3.O(true);
                    return;
                } else {
                    return;
                }
            default:
                org.telegram.ui.Wallet.c8 c8Var = (org.telegram.ui.Wallet.c8) obj4;
                TL_wallet.card cardVar = (TL_wallet.card) obj3;
                TL_wallet.card cardVar2 = (TL_wallet.card) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                c8Var.f43663g1 = 0;
                if (cardVar2 != null) {
                    org.telegram.ui.Wallet.c8.e0(i10, cardVar2);
                    if (!c8Var.f43650b1) {
                        if (c8Var.f43658e1) {
                            c8Var.f43653c1 = cardVar2;
                            c8Var.f43655d1 = org.telegram.ui.Wallet.c8.T(cardVar2);
                            c8Var.Q();
                            return;
                        }
                        c8Var.d(cardVar2);
                        return;
                    }
                    return;
                }
                if (cardVar != null) {
                    org.telegram.ui.Wallet.c8.e0(i10, cardVar);
                }
                if (!c8Var.f43650b1) {
                    if (tL_error3 != null) {
                        org.telegram.ui.Components.cc.a0(c8Var.f43645a).f0(tL_error3, false);
                    }
                    c8Var.f43658e1 = false;
                    TL_wallet.card cardVar3 = c8Var.f43653c1;
                    if (cardVar3 != null) {
                        c8Var.d(cardVar3);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public vf(LaunchActivity launchActivity, g50 g50Var, int i7) {
        this.f52208a = 1;
        this.f52210c = launchActivity;
        this.d = g50Var;
        this.f52209b = i7;
    }
}
