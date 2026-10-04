package org.telegram.ui.web;

import ai.da;
import ai.e4;
import android.content.Context;
import android.os.Bundle;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ok;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.fr;
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.oj0;
public final class u implements Utilities.Callback2 {
    public final int f42346a;
    public final c1 f42347b;
    public final da f42348c;
    public final String d;

    public u(c1 c1Var, da daVar, String str, int i10) {
        this.f42346a = i10;
        this.f42347b = c1Var;
        this.f42348c = daVar;
        this.d = str;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10;
        oj0 oj0Var;
        int i11 = this.f42346a;
        String str = this.d;
        da daVar = this.f42348c;
        c1 c1Var = this.f42347b;
        switch (i11) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                c1 c1Var2 = this.f42347b;
                d6 d6Var = c1Var2.f42125e;
                TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) zf.c.a((TL_keyboard.KeyboardButton) obj, TL_keyboard.TL_buttonTypeRequestPeer.class);
                da daVar2 = this.f42348c;
                String str2 = this.d;
                if (tL_buttonTypeRequestPeer != null) {
                    TLRPC.RequestPeerType requestPeerType = tL_buttonTypeRequestPeer.peer_type;
                    if (requestPeerType instanceof TLRPC.TL_requestPeerTypeCreateBot) {
                        Context context = c1Var2.getContext();
                        int i12 = c1Var2.M;
                        TLRPC.User user = c1Var2.U;
                        e4 e4Var = new e4(c1Var2, daVar2, str2, tL_buttonTypeRequestPeer, 14);
                        d6 d6Var2 = c1Var2.f42125e;
                        fr.a(context, i12, user, (TLRPC.TL_requestPeerTypeCreateBot) requestPeerType, false, e4Var, d6Var2, new yc(c1Var2, d6Var2));
                        return;
                    } else if ((requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) && (i10 = tL_buttonTypeRequestPeer.max_quantity) > 1) {
                        TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) requestPeerType;
                        boolean[] zArr = new boolean[1];
                        Boolean bool = tL_requestPeerTypeUser.bot;
                        Boolean bool2 = tL_requestPeerTypeUser.premium;
                        c0 c0Var = new c0(c1Var2, zArr, str2, tL_buttonTypeRequestPeer, daVar2);
                        oj0 oj0Var2 = oj0.f39204u0;
                        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                        if (R == null) {
                            oj0Var = null;
                        } else {
                            oj0Var = oj0.f39204u0;
                            if (oj0Var == null) {
                                oj0 oj0Var3 = new oj0(R, i10, bool, bool2, c0Var);
                                oj0Var3.show();
                                oj0.f39204u0 = oj0Var3;
                                oj0Var = oj0Var3;
                            }
                        }
                        if (oj0Var != null) {
                            oj0Var.setOnDismissListener(new d0(c1Var2, zArr, daVar2, str2));
                            return;
                        }
                        return;
                    } else {
                        Bundle e7 = ok.e(15, "onlySelect", "dialogsType", true);
                        e7.putLong("requestPeerBotId", c1Var2.U.f20184id);
                        try {
                            SerializedData serializedData = new SerializedData(tL_buttonTypeRequestPeer.peer_type.getObjectSize());
                            tL_buttonTypeRequestPeer.peer_type.serializeToStream(serializedData);
                            e7.putByteArray("requestPeerType", serializedData.toByteArray());
                            serializedData.cleanup();
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                        boolean[] zArr2 = new boolean[1];
                        g0 g0Var = new g0(c1Var2, e7, zArr2, daVar2);
                        g0Var.C2 = new c0(c1Var2, zArr2, str2, tL_buttonTypeRequestPeer, daVar2);
                        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                        if (U != 0) {
                            ?? obj3 = new Object();
                            obj3.f21349a = true;
                            U.showAsSheet(g0Var, obj3);
                            return;
                        }
                        return;
                    }
                } else if (tL_error != null) {
                    new yc(c1Var2, d6Var).d0(tL_error, false);
                    c1Var2.y(daVar2, "requested_chat_failed", c1.B(str2, "req_id"));
                    return;
                } else {
                    new yc(c1Var2, d6Var).c0("UNKNOWN_BUTTON", false);
                    c1Var2.y(daVar2, "requested_chat_failed", c1.B(str2, "req_id"));
                    return;
                }
            case 1:
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                d6 d6Var3 = c1Var.f42125e;
                if (updates != null) {
                    MessagesController.getInstance(c1Var.M).processUpdates(updates, false);
                    c1Var.y(daVar, "requested_chat_sent", c1.B(str, "req_id"));
                    return;
                } else if (tL_error2 != null) {
                    new yc(c1Var, d6Var3).d0(tL_error2, false);
                    c1Var.y(daVar, "requested_chat_failed", c1.B(str, "req_id"));
                    return;
                } else {
                    new yc(c1Var, d6Var3).c0("UNKNOWN_BUTTON", false);
                    c1Var.y(daVar, "requested_chat_failed", c1.B(str, "req_id"));
                    return;
                }
            default:
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                d6 d6Var4 = c1Var.f42125e;
                if (updates2 != null) {
                    MessagesController.getInstance(c1Var.M).processUpdates(updates2, false);
                    c1Var.y(daVar, "requested_chat_sent", c1.B(str, "req_id"));
                    return;
                } else if (tL_error3 != null) {
                    new yc(c1Var, d6Var4).d0(tL_error3, false);
                    c1Var.y(daVar, "requested_chat_failed", c1.B(str, "req_id"));
                    return;
                } else {
                    new yc(c1Var, d6Var4).c0("UNKNOWN_BUTTON", false);
                    c1Var.y(daVar, "requested_chat_failed", c1.B(str, "req_id"));
                    return;
                }
        }
    }
}
