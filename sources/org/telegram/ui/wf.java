package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
public final class wf implements org.telegram.messenger.n10 {
    public final int f51137a;
    public final int f51138b;
    public final Object f51139c;
    public final Object d;

    public wf(Object obj, int i3, TLObject tLObject, int i10) {
        this.f51137a = i10;
        this.f51139c = obj;
        this.f51138b = i3;
        this.d = tLObject;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        TLRPC.Updates updates;
        int i3 = this.f51137a;
        int i10 = this.f51138b;
        Object obj3 = this.d;
        Object obj4 = this.f51139c;
        switch (i3) {
            case 0:
                org.telegram.messenger.g0.h3(new ai.p1((wm) obj4, this.f51138b, (Boolean) obj, (TLRPC.WebPage) obj2, (TL_account.getWebPagePreview) obj3, 12));
                return;
            case 1:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                ly lyVar = (ly) obj3;
                TLRPC.ChatInviteJoinResult chatInviteJoinResult = (TLRPC.ChatInviteJoinResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                String str = LaunchActivity.E1;
                if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
                    TLRPC.Updates updates2 = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
                    org.telegram.messenger.hp.s1(launchActivity.P).O3(updates2, false);
                    updates = updates2;
                } else {
                    if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                        org.telegram.messenger.g0.h3(new ly(15, launchActivity, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult));
                    }
                    updates = null;
                }
                org.telegram.messenger.g0.h3(new ai.p1(launchActivity, lyVar, tL_error, updates, this.f51138b, 21));
                return;
            case 2:
                PasskeysActivity passkeysActivity = (PasskeysActivity) obj4;
                TL_account.Passkey passkey = (TL_account.Passkey) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                ArrayList arrayList = passkeysActivity.f41366b;
                if (((TLRPC.Bool) obj) instanceof TLRPC.TL_boolFalse) {
                    org.telegram.ui.Components.fc.a0(passkeysActivity).e0("FALSE", false);
                    arrayList.add(Utilities.j(i10, arrayList.size(), 0), passkey);
                    passkeysActivity.f41365a.f35594g3.O(true);
                    return;
                } else if (tL_error2 != null) {
                    org.telegram.ui.Components.fc.a0(passkeysActivity).f0(tL_error2, false);
                    arrayList.add(Utilities.j(i10, arrayList.size(), 0), passkey);
                    passkeysActivity.f41365a.f35594g3.O(true);
                    return;
                } else {
                    return;
                }
            default:
                org.telegram.ui.Wallet.b8 b8Var = (org.telegram.ui.Wallet.b8) obj4;
                TL_wallet.card cardVar = (TL_wallet.card) obj3;
                TL_wallet.card cardVar2 = (TL_wallet.card) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                b8Var.f42306g1 = 0;
                if (cardVar2 != null) {
                    org.telegram.ui.Wallet.b8.e0(i10, cardVar2);
                    if (!b8Var.f42293b1) {
                        if (b8Var.f42301e1) {
                            b8Var.f42296c1 = cardVar2;
                            b8Var.f42298d1 = org.telegram.ui.Wallet.b8.T(cardVar2);
                            b8Var.Q();
                            return;
                        }
                        b8Var.d(cardVar2);
                        return;
                    }
                    return;
                }
                if (cardVar != null) {
                    org.telegram.ui.Wallet.b8.e0(i10, cardVar);
                }
                if (!b8Var.f42293b1) {
                    if (tL_error3 != null) {
                        org.telegram.ui.Components.fc.a0(b8Var.f42288a).f0(tL_error3, false);
                    }
                    b8Var.f42301e1 = false;
                    TL_wallet.card cardVar3 = b8Var.f42296c1;
                    if (cardVar3 != null) {
                        b8Var.d(cardVar3);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public wf(LaunchActivity launchActivity, ly lyVar, int i3) {
        this.f51137a = 1;
        this.f51139c = launchActivity;
        this.d = lyVar;
        this.f51138b = i3;
    }
}
