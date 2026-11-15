package org.telegram.ui.web;

import android.content.Context;
import android.os.Bundle;
import di.k6;
import fi.i7;
import org.telegram.messenger.a8;
import org.telegram.messenger.np;
import org.telegram.messenger.s10;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.sq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.qg0;
public final class s implements s10 {
    public final int f52766a;
    public final v0 f52767b;
    public final i7 f52768c;
    public final String d;

    public s(v0 v0Var, i7 i7Var, String str, int i7) {
        this.f52766a = i7;
        this.f52767b = v0Var;
        this.f52768c = i7Var;
        this.d = str;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i7;
        qg0 qg0Var;
        int i10 = this.f52766a;
        String str = this.d;
        i7 i7Var = this.f52768c;
        v0 v0Var = this.f52767b;
        switch (i10) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                v0 v0Var2 = this.f52767b;
                e6 e6Var = v0Var2.f52821e;
                TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) cg.c.a((TL_keyboard.KeyboardButton) obj, TL_keyboard.TL_buttonTypeRequestPeer.class);
                i7 i7Var2 = this.f52768c;
                String str2 = this.d;
                if (tL_buttonTypeRequestPeer != null) {
                    TLRPC.RequestPeerType requestPeerType = tL_buttonTypeRequestPeer.peer_type;
                    if (requestPeerType instanceof TLRPC.TL_requestPeerTypeCreateBot) {
                        Context context = v0Var2.getContext();
                        int i11 = v0Var2.N;
                        TLRPC.User user = v0Var2.V;
                        bi.o1 o1Var = new bi.o1(v0Var2, i7Var2, str2, tL_buttonTypeRequestPeer, 15);
                        e6 e6Var2 = v0Var2.f52821e;
                        sq.e(context, i11, user, (TLRPC.TL_requestPeerTypeCreateBot) requestPeerType, false, o1Var, e6Var2, new cc(v0Var2, e6Var2));
                        return;
                    } else if ((requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) && (i7 = tL_buttonTypeRequestPeer.max_quantity) > 1) {
                        TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) requestPeerType;
                        boolean[] zArr = new boolean[1];
                        Boolean bool = tL_requestPeerTypeUser.bot;
                        Boolean bool2 = tL_requestPeerTypeUser.premium;
                        y yVar = new y(v0Var2, zArr, str2, tL_buttonTypeRequestPeer, i7Var2);
                        qg0 qg0Var2 = qg0.f50597q2;
                        e2 Q = LaunchActivity.Q();
                        if (Q == null) {
                            qg0Var = null;
                        } else {
                            qg0Var = qg0.f50597q2;
                            if (qg0Var == null) {
                                qg0 qg0Var3 = new qg0(Q, i7, bool, bool2, yVar);
                                qg0Var3.show();
                                qg0.f50597q2 = qg0Var3;
                                qg0Var = qg0Var3;
                            }
                        }
                        if (qg0Var != null) {
                            qg0Var.setOnDismissListener(new k6(v0Var2, zArr, i7Var2, str2));
                            return;
                        }
                        return;
                    } else {
                        Bundle j3 = org.telegram.ui.Cells.y0.j(15, "onlySelect", "dialogsType", true);
                        j3.putLong("requestPeerBotId", v0Var2.V.f28200id);
                        try {
                            SerializedData serializedData = new SerializedData(tL_buttonTypeRequestPeer.peer_type.getObjectSize());
                            tL_buttonTypeRequestPeer.peer_type.serializeToStream(serializedData);
                            j3.putByteArray("requestPeerType", serializedData.toByteArray());
                            serializedData.cleanup();
                        } catch (Exception e10) {
                            a8.g(e10, true);
                        }
                        boolean[] zArr2 = new boolean[1];
                        b0 b0Var = new b0(v0Var2, j3, zArr2, i7Var2);
                        b0Var.E2 = new y(v0Var2, zArr2, str2, tL_buttonTypeRequestPeer, i7Var2);
                        e2 T = LaunchActivity.T();
                        if (T != 0) {
                            ?? obj3 = new Object();
                            obj3.f28476a = true;
                            T.showAsSheet(b0Var, obj3);
                            return;
                        }
                        return;
                    }
                } else if (tL_error != null) {
                    new cc(v0Var2, e6Var).f0(tL_error, false);
                    v0Var2.x(i7Var2, "requested_chat_failed", v0.A(str2, "req_id"));
                    return;
                } else {
                    new cc(v0Var2, e6Var).e0("UNKNOWN_BUTTON", false);
                    v0Var2.x(i7Var2, "requested_chat_failed", v0.A(str2, "req_id"));
                    return;
                }
            case 1:
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                e6 e6Var3 = v0Var.f52821e;
                if (updates != null) {
                    np.s1(v0Var.N).O3(updates, false);
                    v0Var.x(i7Var, "requested_chat_sent", v0.A(str, "req_id"));
                    return;
                } else if (tL_error2 != null) {
                    new cc(v0Var, e6Var3).f0(tL_error2, false);
                    v0Var.x(i7Var, "requested_chat_failed", v0.A(str, "req_id"));
                    return;
                } else {
                    new cc(v0Var, e6Var3).e0("UNKNOWN_BUTTON", false);
                    v0Var.x(i7Var, "requested_chat_failed", v0.A(str, "req_id"));
                    return;
                }
            default:
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                e6 e6Var4 = v0Var.f52821e;
                if (updates2 != null) {
                    np.s1(v0Var.N).O3(updates2, false);
                    v0Var.x(i7Var, "requested_chat_sent", v0.A(str, "req_id"));
                    return;
                } else if (tL_error3 != null) {
                    new cc(v0Var, e6Var4).f0(tL_error3, false);
                    v0Var.x(i7Var, "requested_chat_failed", v0.A(str, "req_id"));
                    return;
                } else {
                    new cc(v0Var, e6Var4).e0("UNKNOWN_BUTTON", false);
                    v0Var.x(i7Var, "requested_chat_failed", v0.A(str, "req_id"));
                    return;
                }
        }
    }
}
