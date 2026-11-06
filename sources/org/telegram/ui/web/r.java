package org.telegram.ui.web;

import android.content.Context;
import android.os.Bundle;
import bi.s7;
import di.o7;
import di.s2;
import org.telegram.messenger.a8;
import org.telegram.messenger.qp;
import org.telegram.messenger.v10;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.lq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.qg0;
public final class r implements v10 {
    public final int f51280a;
    public final x0 f51281b;
    public final o7 f51282c;
    public final String d;

    public r(x0 x0Var, o7 o7Var, String str, int i7) {
        this.f51280a = i7;
        this.f51281b = x0Var;
        this.f51282c = o7Var;
        this.d = str;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i7;
        qg0 qg0Var;
        int i10 = this.f51280a;
        String str = this.d;
        o7 o7Var = this.f51282c;
        x0 x0Var = this.f51281b;
        switch (i10) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                x0 x0Var2 = this.f51281b;
                f6 f6Var = x0Var2.f51360e;
                TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) cg.c.a((TL_keyboard.KeyboardButton) obj, TL_keyboard.TL_buttonTypeRequestPeer.class);
                o7 o7Var2 = this.f51282c;
                String str2 = this.d;
                if (tL_buttonTypeRequestPeer != null) {
                    TLRPC.RequestPeerType requestPeerType = tL_buttonTypeRequestPeer.peer_type;
                    if (requestPeerType instanceof TLRPC.TL_requestPeerTypeCreateBot) {
                        Context context = x0Var2.getContext();
                        int i11 = x0Var2.M;
                        TLRPC.User user = x0Var2.U;
                        s2 s2Var = new s2(x0Var2, o7Var2, str2, tL_buttonTypeRequestPeer, 14);
                        f6 f6Var2 = x0Var2.f51360e;
                        lq.e(context, i11, user, (TLRPC.TL_requestPeerTypeCreateBot) requestPeerType, false, s2Var, f6Var2, new hc(x0Var2, f6Var2));
                        return;
                    } else if ((requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) && (i7 = tL_buttonTypeRequestPeer.max_quantity) > 1) {
                        TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) requestPeerType;
                        boolean[] zArr = new boolean[1];
                        Boolean bool = tL_requestPeerTypeUser.bot;
                        Boolean bool2 = tL_requestPeerTypeUser.premium;
                        y yVar = new y(x0Var2, zArr, str2, tL_buttonTypeRequestPeer, o7Var2);
                        qg0 qg0Var2 = qg0.f49220m2;
                        f2 Q = LaunchActivity.Q();
                        if (Q == null) {
                            qg0Var = null;
                        } else {
                            qg0Var = qg0.f49220m2;
                            if (qg0Var == null) {
                                qg0 qg0Var3 = new qg0(Q, i7, bool, bool2, yVar);
                                qg0Var3.show();
                                qg0.f49220m2 = qg0Var3;
                                qg0Var = qg0Var3;
                            }
                        }
                        if (qg0Var != null) {
                            qg0Var.setOnDismissListener(new s7(x0Var2, zArr, o7Var2, str2));
                            return;
                        }
                        return;
                    } else {
                        Bundle h = org.telegram.ui.Cells.f1.h(15, "onlySelect", "dialogsType", true);
                        h.putLong("requestPeerBotId", x0Var2.U.f27102id);
                        try {
                            SerializedData serializedData = new SerializedData(tL_buttonTypeRequestPeer.peer_type.getObjectSize());
                            tL_buttonTypeRequestPeer.peer_type.serializeToStream(serializedData);
                            h.putByteArray("requestPeerType", serializedData.toByteArray());
                            serializedData.cleanup();
                        } catch (Exception e10) {
                            a8.g(e10, true);
                        }
                        boolean[] zArr2 = new boolean[1];
                        c0 c0Var = new c0(x0Var2, h, zArr2, o7Var2);
                        c0Var.C2 = new y(x0Var2, zArr2, str2, tL_buttonTypeRequestPeer, o7Var2);
                        f2 T = LaunchActivity.T();
                        if (T != 0) {
                            ?? obj3 = new Object();
                            obj3.f27421a = true;
                            T.showAsSheet(c0Var, obj3);
                            return;
                        }
                        return;
                    }
                } else if (tL_error != null) {
                    new hc(x0Var2, f6Var).f0(tL_error, false);
                    x0Var2.x(o7Var2, "requested_chat_failed", x0.A(str2, "req_id"));
                    return;
                } else {
                    new hc(x0Var2, f6Var).e0("UNKNOWN_BUTTON", false);
                    x0Var2.x(o7Var2, "requested_chat_failed", x0.A(str2, "req_id"));
                    return;
                }
            case 1:
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                f6 f6Var3 = x0Var.f51360e;
                if (updates != null) {
                    qp.s1(x0Var.M).O3(updates, false);
                    x0Var.x(o7Var, "requested_chat_sent", x0.A(str, "req_id"));
                    return;
                } else if (tL_error2 != null) {
                    new hc(x0Var, f6Var3).f0(tL_error2, false);
                    x0Var.x(o7Var, "requested_chat_failed", x0.A(str, "req_id"));
                    return;
                } else {
                    new hc(x0Var, f6Var3).e0("UNKNOWN_BUTTON", false);
                    x0Var.x(o7Var, "requested_chat_failed", x0.A(str, "req_id"));
                    return;
                }
            default:
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                f6 f6Var4 = x0Var.f51360e;
                if (updates2 != null) {
                    qp.s1(x0Var.M).O3(updates2, false);
                    x0Var.x(o7Var, "requested_chat_sent", x0.A(str, "req_id"));
                    return;
                } else if (tL_error3 != null) {
                    new hc(x0Var, f6Var4).f0(tL_error3, false);
                    x0Var.x(o7Var, "requested_chat_failed", x0.A(str, "req_id"));
                    return;
                } else {
                    new hc(x0Var, f6Var4).e0("UNKNOWN_BUTTON", false);
                    x0Var.x(o7Var, "requested_chat_failed", x0.A(str, "req_id"));
                    return;
                }
        }
    }
}
