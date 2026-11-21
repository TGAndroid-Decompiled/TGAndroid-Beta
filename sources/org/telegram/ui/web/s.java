package org.telegram.ui.web;

import android.content.Context;
import android.os.Bundle;
import bi.m2;
import di.n6;
import fi.f7;
import org.telegram.messenger.a8;
import org.telegram.messenger.mp;
import org.telegram.messenger.q10;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.br;
import org.telegram.ui.Components.lc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.vg0;
public final class s implements q10 {
    public final int f53289a;
    public final v0 f53290b;
    public final f7 f53291c;
    public final String d;

    public s(v0 v0Var, f7 f7Var, String str, int i7) {
        this.f53289a = i7;
        this.f53290b = v0Var;
        this.f53291c = f7Var;
        this.d = str;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i7;
        vg0 vg0Var;
        int i10 = this.f53289a;
        String str = this.d;
        f7 f7Var = this.f53291c;
        v0 v0Var = this.f53290b;
        switch (i10) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                v0 v0Var2 = this.f53290b;
                h6 h6Var = v0Var2.f53344e;
                TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) cg.c.a((TL_keyboard.KeyboardButton) obj, TL_keyboard.TL_buttonTypeRequestPeer.class);
                f7 f7Var2 = this.f53291c;
                String str2 = this.d;
                if (tL_buttonTypeRequestPeer != null) {
                    TLRPC.RequestPeerType requestPeerType = tL_buttonTypeRequestPeer.peer_type;
                    if (requestPeerType instanceof TLRPC.TL_requestPeerTypeCreateBot) {
                        Context context = v0Var2.getContext();
                        int i11 = v0Var2.N;
                        TLRPC.User user = v0Var2.V;
                        m2 m2Var = new m2(v0Var2, f7Var2, str2, tL_buttonTypeRequestPeer, 15);
                        h6 h6Var2 = v0Var2.f53344e;
                        br.e(context, i11, user, (TLRPC.TL_requestPeerTypeCreateBot) requestPeerType, false, m2Var, h6Var2, new lc(v0Var2, h6Var2));
                        return;
                    } else if ((requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) && (i7 = tL_buttonTypeRequestPeer.max_quantity) > 1) {
                        TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) requestPeerType;
                        boolean[] zArr = new boolean[1];
                        Boolean bool = tL_requestPeerTypeUser.bot;
                        Boolean bool2 = tL_requestPeerTypeUser.premium;
                        y yVar = new y(v0Var2, zArr, str2, tL_buttonTypeRequestPeer, f7Var2);
                        vg0 vg0Var2 = vg0.f52812q2;
                        g2 Q = LaunchActivity.Q();
                        if (Q == null) {
                            vg0Var = null;
                        } else {
                            vg0Var = vg0.f52812q2;
                            if (vg0Var == null) {
                                vg0 vg0Var3 = new vg0(Q, i7, bool, bool2, yVar);
                                vg0Var3.show();
                                vg0.f52812q2 = vg0Var3;
                                vg0Var = vg0Var3;
                            }
                        }
                        if (vg0Var != null) {
                            vg0Var.setOnDismissListener(new n6(v0Var2, zArr, f7Var2, str2));
                            return;
                        }
                        return;
                    } else {
                        Bundle l10 = org.telegram.ui.Cells.c0.l(15, "onlySelect", "dialogsType", true);
                        l10.putLong("requestPeerBotId", v0Var2.V.f28580id);
                        try {
                            SerializedData serializedData = new SerializedData(tL_buttonTypeRequestPeer.peer_type.getObjectSize());
                            tL_buttonTypeRequestPeer.peer_type.serializeToStream(serializedData);
                            l10.putByteArray("requestPeerType", serializedData.toByteArray());
                            serializedData.cleanup();
                        } catch (Exception e10) {
                            a8.g(e10, true);
                        }
                        boolean[] zArr2 = new boolean[1];
                        b0 b0Var = new b0(v0Var2, l10, zArr2, f7Var2);
                        b0Var.E2 = new y(v0Var2, zArr2, str2, tL_buttonTypeRequestPeer, f7Var2);
                        g2 T = LaunchActivity.T();
                        if (T != 0) {
                            ?? obj3 = new Object();
                            obj3.f28902a = true;
                            T.showAsSheet(b0Var, obj3);
                            return;
                        }
                        return;
                    }
                } else if (tL_error != null) {
                    new lc(v0Var2, h6Var).g0(tL_error, false);
                    v0Var2.x(f7Var2, "requested_chat_failed", v0.A(str2, "req_id"));
                    return;
                } else {
                    new lc(v0Var2, h6Var).f0("UNKNOWN_BUTTON", false);
                    v0Var2.x(f7Var2, "requested_chat_failed", v0.A(str2, "req_id"));
                    return;
                }
            case 1:
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                h6 h6Var3 = v0Var.f53344e;
                if (updates != null) {
                    mp.u1(v0Var.N).V3(updates, false);
                    v0Var.x(f7Var, "requested_chat_sent", v0.A(str, "req_id"));
                    return;
                } else if (tL_error2 != null) {
                    new lc(v0Var, h6Var3).g0(tL_error2, false);
                    v0Var.x(f7Var, "requested_chat_failed", v0.A(str, "req_id"));
                    return;
                } else {
                    new lc(v0Var, h6Var3).f0("UNKNOWN_BUTTON", false);
                    v0Var.x(f7Var, "requested_chat_failed", v0.A(str, "req_id"));
                    return;
                }
            default:
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                h6 h6Var4 = v0Var.f53344e;
                if (updates2 != null) {
                    mp.u1(v0Var.N).V3(updates2, false);
                    v0Var.x(f7Var, "requested_chat_sent", v0.A(str, "req_id"));
                    return;
                } else if (tL_error3 != null) {
                    new lc(v0Var, h6Var4).g0(tL_error3, false);
                    v0Var.x(f7Var, "requested_chat_failed", v0.A(str, "req_id"));
                    return;
                } else {
                    new lc(v0Var, h6Var4).f0("UNKNOWN_BUTTON", false);
                    v0Var.x(f7Var, "requested_chat_failed", v0.A(str, "req_id"));
                    return;
                }
        }
    }
}
