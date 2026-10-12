package org.telegram.ui.web;

import android.content.Context;
import android.os.Bundle;
import bi.n9;
import bi.u3;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.yh;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.zc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.hl0;
import org.telegram.ui.xj0;
public final class u implements Utilities.Callback2 {
    public final int f41495a;
    public final b1 f41496b;
    public final n9 f41497c;
    public final String d;

    public u(b1 b1Var, n9 n9Var, String str, int i10) {
        this.f41495a = i10;
        this.f41496b = b1Var;
        this.f41497c = n9Var;
        this.d = str;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10;
        xj0 xj0Var;
        int i11 = this.f41495a;
        String str = this.d;
        n9 n9Var = this.f41497c;
        b1 b1Var = this.f41496b;
        switch (i11) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                b1 b1Var2 = this.f41496b;
                c6 c6Var = b1Var2.e;
                TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) ag.c.a((TL_keyboard.KeyboardButton) obj, TL_keyboard.TL_buttonTypeRequestPeer.class);
                n9 n9Var2 = this.f41497c;
                String str2 = this.d;
                if (tL_buttonTypeRequestPeer != null) {
                    TLRPC.RequestPeerType requestPeerType = tL_buttonTypeRequestPeer.peer_type;
                    if (requestPeerType instanceof TLRPC.TL_requestPeerTypeCreateBot) {
                        Context context = b1Var2.getContext();
                        int i12 = b1Var2.M;
                        TLRPC.User user = b1Var2.U;
                        u3 u3Var = new u3(b1Var2, n9Var2, str2, tL_buttonTypeRequestPeer, 14);
                        c6 c6Var2 = b1Var2.e;
                        qr.e(context, i12, user, (TLRPC.TL_requestPeerTypeCreateBot) requestPeerType, false, u3Var, c6Var2, new zc(b1Var2, c6Var2));
                        return;
                    } else if ((requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) && (i10 = tL_buttonTypeRequestPeer.max_quantity) > 1) {
                        TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) requestPeerType;
                        boolean[] zArr = new boolean[1];
                        Boolean bool = tL_requestPeerTypeUser.bot;
                        Boolean bool2 = tL_requestPeerTypeUser.premium;
                        b0 b0Var = new b0(b1Var2, zArr, str2, tL_buttonTypeRequestPeer, n9Var2);
                        xj0 xj0Var2 = xj0.f41869u0;
                        org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
                        if (R == null) {
                            xj0Var = null;
                        } else {
                            xj0Var = xj0.f41869u0;
                            if (xj0Var == null) {
                                xj0 xj0Var3 = new xj0(R, i10, bool, bool2, b0Var);
                                xj0Var3.show();
                                xj0.f41869u0 = xj0Var3;
                                xj0Var = xj0Var3;
                            }
                        }
                        if (xj0Var != null) {
                            xj0Var.setOnDismissListener(new hl0(b1Var2, zArr, n9Var2, str2));
                            return;
                        }
                        return;
                    } else {
                        Bundle d = yh.d(15, "onlySelect", "dialogsType", true);
                        d.putLong("requestPeerBotId", b1Var2.U.f19363id);
                        try {
                            SerializedData serializedData = new SerializedData(tL_buttonTypeRequestPeer.peer_type.getObjectSize());
                            tL_buttonTypeRequestPeer.peer_type.serializeToStream(serializedData);
                            d.putByteArray("requestPeerType", serializedData.toByteArray());
                            serializedData.cleanup();
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        boolean[] zArr2 = new boolean[1];
                        g0 g0Var = new g0(b1Var2, d, zArr2, n9Var2);
                        g0Var.C2 = new b0(b1Var2, zArr2, str2, tL_buttonTypeRequestPeer, n9Var2);
                        org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                        if (U != 0) {
                            ?? obj3 = new Object();
                            obj3.f20469a = true;
                            U.showAsSheet(g0Var, obj3);
                            return;
                        }
                        return;
                    }
                } else if (tL_error != null) {
                    new zc(b1Var2, c6Var).f0(tL_error, false);
                    b1Var2.x(n9Var2, "requested_chat_failed", b1.A(str2, "req_id"));
                    return;
                } else {
                    new zc(b1Var2, c6Var).e0("UNKNOWN_BUTTON", false);
                    b1Var2.x(n9Var2, "requested_chat_failed", b1.A(str2, "req_id"));
                    return;
                }
            case 1:
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                c6 c6Var3 = b1Var.e;
                if (updates != null) {
                    MessagesController.getInstance(b1Var.M).lambda$processUpdates$377(updates, false);
                    b1Var.x(n9Var, "requested_chat_sent", b1.A(str, "req_id"));
                    return;
                } else if (tL_error2 != null) {
                    new zc(b1Var, c6Var3).f0(tL_error2, false);
                    b1Var.x(n9Var, "requested_chat_failed", b1.A(str, "req_id"));
                    return;
                } else {
                    new zc(b1Var, c6Var3).e0("UNKNOWN_BUTTON", false);
                    b1Var.x(n9Var, "requested_chat_failed", b1.A(str, "req_id"));
                    return;
                }
            default:
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                c6 c6Var4 = b1Var.e;
                if (updates2 != null) {
                    MessagesController.getInstance(b1Var.M).lambda$processUpdates$377(updates2, false);
                    b1Var.x(n9Var, "requested_chat_sent", b1.A(str, "req_id"));
                    return;
                } else if (tL_error3 != null) {
                    new zc(b1Var, c6Var4).f0(tL_error3, false);
                    b1Var.x(n9Var, "requested_chat_failed", b1.A(str, "req_id"));
                    return;
                } else {
                    new zc(b1Var, c6Var4).e0("UNKNOWN_BUTTON", false);
                    b1Var.x(n9Var, "requested_chat_failed", b1.A(str, "req_id"));
                    return;
                }
        }
    }
}
