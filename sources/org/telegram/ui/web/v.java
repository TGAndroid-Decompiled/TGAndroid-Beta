package org.telegram.ui.web;

import android.content.Context;
import android.os.Bundle;
import bi.s7;
import di.x7;
import di.y2;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.vh;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.wc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cj0;
public final class v implements Utilities.Callback2 {
    public final int f45427a;
    public final a1 f45428b;
    public final x7 f45429c;
    public final String d;

    public v(a1 a1Var, x7 x7Var, String str, int i10) {
        this.f45427a = i10;
        this.f45428b = a1Var;
        this.f45429c = x7Var;
        this.d = str;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10;
        cj0 cj0Var;
        int i11 = this.f45427a;
        String str = this.d;
        x7 x7Var = this.f45429c;
        a1 a1Var = this.f45428b;
        switch (i11) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                a1 a1Var2 = this.f45428b;
                u6 u6Var = a1Var2.e;
                TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) bg.c.a((TL_keyboard.KeyboardButton) obj, TL_keyboard.TL_buttonTypeRequestPeer.class);
                x7 x7Var2 = this.f45429c;
                String str2 = this.d;
                if (tL_buttonTypeRequestPeer != null) {
                    TLRPC.RequestPeerType requestPeerType = tL_buttonTypeRequestPeer.peer_type;
                    if (requestPeerType instanceof TLRPC.TL_requestPeerTypeCreateBot) {
                        Context context = a1Var2.getContext();
                        int i12 = a1Var2.M;
                        TLRPC.User user = a1Var2.U;
                        y2 y2Var = new y2(a1Var2, x7Var2, str2, tL_buttonTypeRequestPeer, 14);
                        u6 u6Var2 = a1Var2.e;
                        pr.e(context, i12, user, (TLRPC.TL_requestPeerTypeCreateBot) requestPeerType, false, y2Var, u6Var2, new wc(a1Var2, u6Var2));
                        return;
                    } else if ((requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) && (i10 = tL_buttonTypeRequestPeer.max_quantity) > 1) {
                        TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) requestPeerType;
                        boolean[] zArr = new boolean[1];
                        Boolean bool = tL_requestPeerTypeUser.bot;
                        Boolean bool2 = tL_requestPeerTypeUser.premium;
                        c0 c0Var = new c0(a1Var2, zArr, str2, tL_buttonTypeRequestPeer, x7Var2);
                        cj0 cj0Var2 = cj0.f38474u0;
                        r2 R = LaunchActivity.R();
                        if (R == null) {
                            cj0Var = null;
                        } else {
                            cj0Var = cj0.f38474u0;
                            if (cj0Var == null) {
                                cj0 cj0Var3 = new cj0(R, i10, bool, bool2, c0Var);
                                cj0Var3.show();
                                cj0.f38474u0 = cj0Var3;
                                cj0Var = cj0Var3;
                            }
                        }
                        if (cj0Var != null) {
                            cj0Var.setOnDismissListener(new s7(a1Var2, zArr, x7Var2, str2));
                            return;
                        }
                        return;
                    } else {
                        Bundle c10 = vh.c(15, "onlySelect", "dialogsType", true);
                        c10.putLong("requestPeerBotId", a1Var2.U.f22176id);
                        try {
                            SerializedData serializedData = new SerializedData(tL_buttonTypeRequestPeer.peer_type.getObjectSize());
                            tL_buttonTypeRequestPeer.peer_type.serializeToStream(serializedData);
                            c10.putByteArray("requestPeerType", serializedData.toByteArray());
                            serializedData.cleanup();
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        boolean[] zArr2 = new boolean[1];
                        f0 f0Var = new f0(a1Var2, c10, zArr2, x7Var2);
                        f0Var.C2 = new c0(a1Var2, zArr2, str2, tL_buttonTypeRequestPeer, x7Var2);
                        r2 U = LaunchActivity.U();
                        if (U != 0) {
                            ?? obj3 = new Object();
                            obj3.f22928a = true;
                            U.showAsSheet(f0Var, obj3);
                            return;
                        }
                        return;
                    }
                } else if (tL_error != null) {
                    new wc(a1Var2, u6Var).g0(tL_error, false);
                    a1Var2.x(x7Var2, "requested_chat_failed", a1.A(str2, "req_id"));
                    return;
                } else {
                    new wc(a1Var2, u6Var).f0("UNKNOWN_BUTTON", false);
                    a1Var2.x(x7Var2, "requested_chat_failed", a1.A(str2, "req_id"));
                    return;
                }
            case 1:
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                u6 u6Var3 = a1Var.e;
                if (updates != null) {
                    MessagesController.getInstance(a1Var.M).lambda$processUpdates$379(updates, false);
                    a1Var.x(x7Var, "requested_chat_sent", a1.A(str, "req_id"));
                    return;
                } else if (tL_error2 != null) {
                    new wc(a1Var, u6Var3).g0(tL_error2, false);
                    a1Var.x(x7Var, "requested_chat_failed", a1.A(str, "req_id"));
                    return;
                } else {
                    new wc(a1Var, u6Var3).f0("UNKNOWN_BUTTON", false);
                    a1Var.x(x7Var, "requested_chat_failed", a1.A(str, "req_id"));
                    return;
                }
            default:
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                u6 u6Var4 = a1Var.e;
                if (updates2 != null) {
                    MessagesController.getInstance(a1Var.M).lambda$processUpdates$379(updates2, false);
                    a1Var.x(x7Var, "requested_chat_sent", a1.A(str, "req_id"));
                    return;
                } else if (tL_error3 != null) {
                    new wc(a1Var, u6Var4).g0(tL_error3, false);
                    a1Var.x(x7Var, "requested_chat_failed", a1.A(str, "req_id"));
                    return;
                } else {
                    new wc(a1Var, u6Var4).f0("UNKNOWN_BUTTON", false);
                    a1Var.x(x7Var, "requested_chat_failed", a1.A(str, "req_id"));
                    return;
                }
        }
    }
}
