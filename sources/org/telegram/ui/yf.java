package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
public final class yf implements org.telegram.messenger.v10 {
    public final int f52096a;
    public final int f52097b;
    public final Object f52098c;
    public final Object d;

    public yf(Object obj, int i7, TLObject tLObject, int i10) {
        this.f52096a = i10;
        this.f52098c = obj;
        this.f52097b = i7;
        this.d = tLObject;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        TLRPC.Updates updates;
        int i7 = this.f52096a;
        int i10 = this.f52097b;
        Object obj3 = this.d;
        Object obj4 = this.f52098c;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.h3(new bi.ub((cn) obj4, this.f52097b, (Boolean) obj, (TLRPC.WebPage) obj2, (TL_account.getWebPagePreview) obj3, 10));
                return;
            case 1:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                s10 s10Var = (s10) obj3;
                TLRPC.ChatInviteJoinResult chatInviteJoinResult = (TLRPC.ChatInviteJoinResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                String str = LaunchActivity.B1;
                if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
                    TLRPC.Updates updates2 = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
                    org.telegram.messenger.qp.s1(launchActivity.O).O3(updates2, false);
                    updates = updates2;
                } else {
                    if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                        org.telegram.messenger.g0.h3(new s10(10, launchActivity, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult));
                    }
                    updates = null;
                }
                org.telegram.messenger.g0.h3(new bi.ub(launchActivity, s10Var, tL_error, updates, this.f52097b, 19));
                return;
            case 2:
                PasskeysActivity passkeysActivity = (PasskeysActivity) obj4;
                TL_account.Passkey passkey = (TL_account.Passkey) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                ArrayList arrayList = passkeysActivity.f41344b;
                if (((TLRPC.Bool) obj) instanceof TLRPC.TL_boolFalse) {
                    org.telegram.ui.Components.hc.a0(passkeysActivity).e0("FALSE", false);
                    arrayList.add(Utilities.j(i10, arrayList.size(), 0), passkey);
                    passkeysActivity.f41343a.f37556f3.O(true);
                    return;
                } else if (tL_error2 != null) {
                    org.telegram.ui.Components.hc.a0(passkeysActivity).f0(tL_error2, false);
                    arrayList.add(Utilities.j(i10, arrayList.size(), 0), passkey);
                    passkeysActivity.f41343a.f37556f3.O(true);
                    return;
                } else {
                    return;
                }
            default:
                org.telegram.ui.Wallet.a8 a8Var = (org.telegram.ui.Wallet.a8) obj4;
                TL_wallet.card cardVar = (TL_wallet.card) obj3;
                TL_wallet.card cardVar2 = (TL_wallet.card) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                a8Var.f42152f1 = 0;
                if (cardVar2 != null) {
                    org.telegram.ui.Wallet.a8.e0(i10, cardVar2);
                    if (!a8Var.f42138a1) {
                        if (a8Var.f42146d1) {
                            a8Var.f42141b1 = cardVar2;
                            a8Var.f42144c1 = org.telegram.ui.Wallet.a8.T(cardVar2);
                            a8Var.Q();
                            return;
                        }
                        a8Var.d(cardVar2);
                        return;
                    }
                    return;
                }
                if (cardVar != null) {
                    org.telegram.ui.Wallet.a8.e0(i10, cardVar);
                }
                if (!a8Var.f42138a1) {
                    if (tL_error3 != null) {
                        org.telegram.ui.Components.hc.a0(a8Var.f42136a).f0(tL_error3, false);
                    }
                    a8Var.f42146d1 = false;
                    TL_wallet.card cardVar3 = a8Var.f42141b1;
                    if (cardVar3 != null) {
                        a8Var.d(cardVar3);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public yf(LaunchActivity launchActivity, s10 s10Var, int i7) {
        this.f52096a = 1;
        this.f52098c = launchActivity;
        this.d = s10Var;
        this.f52097b = i7;
    }
}
