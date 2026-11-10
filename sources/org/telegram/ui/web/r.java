package org.telegram.ui.web;

import android.content.Context;
import android.os.Bundle;
import bi.s7;
import di.p7;
import di.s2;
import org.telegram.messenger.a8;
import org.telegram.messenger.qp;
import org.telegram.messenger.v10;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.kq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.tg0;
public final class r implements v10 {
    public final int f51222a;
    public final x0 f51223b;
    public final p7 f51224c;
    public final String d;

    public r(x0 x0Var, p7 p7Var, String str, int i7) {
        this.f51222a = i7;
        this.f51223b = x0Var;
        this.f51224c = p7Var;
        this.d = str;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i7;
        tg0 tg0Var;
        int i10 = this.f51222a;
        String str = this.d;
        p7 p7Var = this.f51224c;
        x0 x0Var = this.f51223b;
        switch (i10) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                x0 x0Var2 = this.f51223b;
                h6 h6Var = x0Var2.f51302e;
                TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) cg.c.a((TL_keyboard.KeyboardButton) obj, TL_keyboard.TL_buttonTypeRequestPeer.class);
                p7 p7Var2 = this.f51224c;
                String str2 = this.d;
                if (tL_buttonTypeRequestPeer != null) {
                    TLRPC.RequestPeerType requestPeerType = tL_buttonTypeRequestPeer.peer_type;
                    if (requestPeerType instanceof TLRPC.TL_requestPeerTypeCreateBot) {
                        Context context = x0Var2.getContext();
                        int i11 = x0Var2.M;
                        TLRPC.User user = x0Var2.U;
                        s2 s2Var = new s2(x0Var2, p7Var2, str2, tL_buttonTypeRequestPeer, 14);
                        h6 h6Var2 = x0Var2.f51302e;
                        kq.e(context, i11, user, (TLRPC.TL_requestPeerTypeCreateBot) requestPeerType, false, s2Var, h6Var2, new gc(x0Var2, h6Var2));
                        return;
                    } else if ((requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) && (i7 = tL_buttonTypeRequestPeer.max_quantity) > 1) {
                        TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) requestPeerType;
                        boolean[] zArr = new boolean[1];
                        Boolean bool = tL_requestPeerTypeUser.bot;
                        Boolean bool2 = tL_requestPeerTypeUser.premium;
                        y yVar = new y(x0Var2, zArr, str2, tL_buttonTypeRequestPeer, p7Var2);
                        tg0 tg0Var2 = tg0.f50265p2;
                        f2 Q = LaunchActivity.Q();
                        if (Q == null) {
                            tg0Var = null;
                        } else {
                            tg0Var = tg0.f50265p2;
                            if (tg0Var == null) {
                                tg0 tg0Var3 = new tg0(Q, i7, bool, bool2, yVar);
                                tg0Var3.show();
                                tg0.f50265p2 = tg0Var3;
                                tg0Var = tg0Var3;
                            }
                        }
                        if (tg0Var != null) {
                            tg0Var.setOnDismissListener(new s7(x0Var2, zArr, p7Var2, str2));
                            return;
                        }
                        return;
                    } else {
                        Bundle h = org.telegram.ui.Cells.f1.h(15, "onlySelect", "dialogsType", true);
                        h.putLong("requestPeerBotId", x0Var2.U.f27109id);
                        try {
                            SerializedData serializedData = new SerializedData(tL_buttonTypeRequestPeer.peer_type.getObjectSize());
                            tL_buttonTypeRequestPeer.peer_type.serializeToStream(serializedData);
                            h.putByteArray("requestPeerType", serializedData.toByteArray());
                            serializedData.cleanup();
                        } catch (Exception e10) {
                            a8.g(e10, true);
                        }
                        boolean[] zArr2 = new boolean[1];
                        c0 c0Var = new c0(x0Var2, h, zArr2, p7Var2);
                        c0Var.D2 = new y(x0Var2, zArr2, str2, tL_buttonTypeRequestPeer, p7Var2);
                        f2 T = LaunchActivity.T();
                        if (T != 0) {
                            ?? obj3 = new Object();
                            obj3.f27388a = true;
                            T.showAsSheet(c0Var, obj3);
                            return;
                        }
                        return;
                    }
                } else if (tL_error != null) {
                    new gc(x0Var2, h6Var).f0(tL_error, false);
                    x0Var2.x(p7Var2, "requested_chat_failed", x0.A(str2, "req_id"));
                    return;
                } else {
                    new gc(x0Var2, h6Var).e0("UNKNOWN_BUTTON", false);
                    x0Var2.x(p7Var2, "requested_chat_failed", x0.A(str2, "req_id"));
                    return;
                }
            case 1:
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                h6 h6Var3 = x0Var.f51302e;
                if (updates != null) {
                    qp.s1(x0Var.M).O3(updates, false);
                    x0Var.x(p7Var, "requested_chat_sent", x0.A(str, "req_id"));
                    return;
                } else if (tL_error2 != null) {
                    new gc(x0Var, h6Var3).f0(tL_error2, false);
                    x0Var.x(p7Var, "requested_chat_failed", x0.A(str, "req_id"));
                    return;
                } else {
                    new gc(x0Var, h6Var3).e0("UNKNOWN_BUTTON", false);
                    x0Var.x(p7Var, "requested_chat_failed", x0.A(str, "req_id"));
                    return;
                }
            default:
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                h6 h6Var4 = x0Var.f51302e;
                if (updates2 != null) {
                    qp.s1(x0Var.M).O3(updates2, false);
                    x0Var.x(p7Var, "requested_chat_sent", x0.A(str, "req_id"));
                    return;
                } else if (tL_error3 != null) {
                    new gc(x0Var, h6Var4).f0(tL_error3, false);
                    x0Var.x(p7Var, "requested_chat_failed", x0.A(str, "req_id"));
                    return;
                } else {
                    new gc(x0Var, h6Var4).e0("UNKNOWN_BUTTON", false);
                    x0Var.x(p7Var, "requested_chat_failed", x0.A(str, "req_id"));
                    return;
                }
        }
    }
}
