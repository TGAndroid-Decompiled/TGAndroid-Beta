package org.telegram.ui.web;

import ag.m2;
import android.content.Context;
import android.os.Bundle;
import org.telegram.messenger.f8;
import org.telegram.messenger.j20;
import org.telegram.messenger.vp;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.vq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.aj0;
import org.telegram.ui.wh0;
public final class s implements j20 {
    public final int f43184a;
    public final z0 f43185b;
    public final x0 f43186c;
    public final String d;

    public s(z0 z0Var, x0 x0Var, String str, int i10) {
        this.f43184a = i10;
        this.f43185b = z0Var;
        this.f43186c = x0Var;
        this.d = str;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i10;
        wh0 wh0Var;
        int i11 = this.f43184a;
        String str = this.d;
        x0 x0Var = this.f43186c;
        z0 z0Var = this.f43185b;
        switch (i11) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                z0 z0Var2 = this.f43185b;
                p6 p6Var = z0Var2.e;
                TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) sf.c.a((TL_keyboard.KeyboardButton) obj, TL_keyboard.TL_buttonTypeRequestPeer.class);
                x0 x0Var2 = this.f43186c;
                String str2 = this.d;
                if (tL_buttonTypeRequestPeer != null) {
                    TLRPC.RequestPeerType requestPeerType = tL_buttonTypeRequestPeer.peer_type;
                    if (requestPeerType instanceof TLRPC.TL_requestPeerTypeCreateBot) {
                        Context context = z0Var2.getContext();
                        int i12 = z0Var2.M;
                        TLRPC.User user = z0Var2.U;
                        m2 m2Var = new m2(z0Var2, x0Var2, str2, tL_buttonTypeRequestPeer, 14);
                        p6 p6Var2 = z0Var2.e;
                        vq.e(context, i12, user, (TLRPC.TL_requestPeerTypeCreateBot) requestPeerType, false, m2Var, p6Var2, new cc(z0Var2, p6Var2));
                        return;
                    } else if ((requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) && (i10 = tL_buttonTypeRequestPeer.max_quantity) > 1) {
                        TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) requestPeerType;
                        boolean[] zArr = new boolean[1];
                        Boolean bool = tL_requestPeerTypeUser.bot;
                        Boolean bool2 = tL_requestPeerTypeUser.premium;
                        y yVar = new y(z0Var2, zArr, str2, tL_buttonTypeRequestPeer, x0Var2);
                        wh0 wh0Var2 = wh0.f43305m2;
                        k2 Q = LaunchActivity.Q();
                        if (Q == null) {
                            wh0Var = null;
                        } else {
                            wh0Var = wh0.f43305m2;
                            if (wh0Var == null) {
                                wh0 wh0Var3 = new wh0(Q, i10, bool, bool2, yVar);
                                wh0Var3.show();
                                wh0.f43305m2 = wh0Var3;
                                wh0Var = wh0Var3;
                            }
                        }
                        if (wh0Var != null) {
                            wh0Var.setOnDismissListener(new aj0(z0Var2, zArr, x0Var2, str2));
                            return;
                        }
                        return;
                    } else {
                        Bundle j10 = org.telegram.ui.Cells.f1.j(15, "onlySelect", "dialogsType", true);
                        j10.putLong("requestPeerBotId", z0Var2.U.f19942id);
                        try {
                            SerializedData serializedData = new SerializedData(tL_buttonTypeRequestPeer.peer_type.getObjectSize());
                            tL_buttonTypeRequestPeer.peer_type.serializeToStream(serializedData);
                            j10.putByteArray("requestPeerType", serializedData.toByteArray());
                            serializedData.cleanup();
                        } catch (Exception e) {
                            f8.g(e, true);
                        }
                        boolean[] zArr2 = new boolean[1];
                        c0 c0Var = new c0(z0Var2, j10, zArr2, x0Var2);
                        c0Var.C2 = new y(z0Var2, zArr2, str2, tL_buttonTypeRequestPeer, x0Var2);
                        k2 T = LaunchActivity.T();
                        if (T != 0) {
                            ?? obj3 = new Object();
                            obj3.f20389a = true;
                            T.showAsSheet(c0Var, obj3);
                            return;
                        }
                        return;
                    }
                } else if (tL_error != null) {
                    new cc(z0Var2, p6Var).f0(tL_error, false);
                    z0Var2.y(x0Var2, "requested_chat_failed", z0.A(str2, "req_id"));
                    return;
                } else {
                    new cc(z0Var2, p6Var).e0("UNKNOWN_BUTTON", false);
                    z0Var2.y(x0Var2, "requested_chat_failed", z0.A(str2, "req_id"));
                    return;
                }
            case 1:
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                p6 p6Var3 = z0Var.e;
                if (updates != null) {
                    vp.r1(z0Var.M).L3(updates, false);
                    z0Var.y(x0Var, "requested_chat_sent", z0.A(str, "req_id"));
                    return;
                } else if (tL_error2 != null) {
                    new cc(z0Var, p6Var3).f0(tL_error2, false);
                    z0Var.y(x0Var, "requested_chat_failed", z0.A(str, "req_id"));
                    return;
                } else {
                    new cc(z0Var, p6Var3).e0("UNKNOWN_BUTTON", false);
                    z0Var.y(x0Var, "requested_chat_failed", z0.A(str, "req_id"));
                    return;
                }
            default:
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                p6 p6Var4 = z0Var.e;
                if (updates2 != null) {
                    vp.r1(z0Var.M).L3(updates2, false);
                    z0Var.y(x0Var, "requested_chat_sent", z0.A(str, "req_id"));
                    return;
                } else if (tL_error3 != null) {
                    new cc(z0Var, p6Var4).f0(tL_error3, false);
                    z0Var.y(x0Var, "requested_chat_failed", z0.A(str, "req_id"));
                    return;
                } else {
                    new cc(z0Var, p6Var4).e0("UNKNOWN_BUTTON", false);
                    z0Var.y(x0Var, "requested_chat_failed", z0.A(str, "req_id"));
                    return;
                }
        }
    }
}
