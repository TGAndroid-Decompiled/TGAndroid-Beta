package org.telegram.ui.web;

import android.content.Context;
import android.os.Bundle;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.ir;
import org.telegram.ui.Components.wc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.sj0;
public final class v implements Utilities.Callback2 {
    public final int f38094a;
    public final c1 f38095b;
    public final a1 f38096c;
    public final String d;

    public v(c1 c1Var, a1 a1Var, String str, int i10) {
        this.f38094a = i10;
        this.f38095b = c1Var;
        this.f38096c = a1Var;
        this.d = str;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10;
        sj0 sj0Var;
        int i11 = this.f38094a;
        String str = this.d;
        a1 a1Var = this.f38096c;
        c1 c1Var = this.f38095b;
        switch (i11) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                c1 c1Var2 = this.f38095b;
                f6 f6Var = c1Var2.e;
                TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) yf.c.a((TL_keyboard.KeyboardButton) obj, TL_keyboard.TL_buttonTypeRequestPeer.class);
                a1 a1Var2 = this.f38096c;
                String str2 = this.d;
                if (tL_buttonTypeRequestPeer != null) {
                    TLRPC.RequestPeerType requestPeerType = tL_buttonTypeRequestPeer.peer_type;
                    if (requestPeerType instanceof TLRPC.TL_requestPeerTypeCreateBot) {
                        Context context = c1Var2.getContext();
                        int i12 = c1Var2.M;
                        TLRPC.User user = c1Var2.U;
                        gg.u1 u1Var = new gg.u1(c1Var2, a1Var2, str2, tL_buttonTypeRequestPeer, 11);
                        f6 f6Var2 = c1Var2.e;
                        ir.a(context, i12, user, (TLRPC.TL_requestPeerTypeCreateBot) requestPeerType, false, u1Var, f6Var2, new wc(c1Var2, f6Var2));
                        return;
                    } else if ((requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) && (i10 = tL_buttonTypeRequestPeer.max_quantity) > 1) {
                        TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) requestPeerType;
                        boolean[] zArr = new boolean[1];
                        Boolean bool = tL_requestPeerTypeUser.bot;
                        Boolean bool2 = tL_requestPeerTypeUser.premium;
                        c0 c0Var = new c0(c1Var2, zArr, str2, tL_buttonTypeRequestPeer, a1Var2);
                        sj0 sj0Var2 = sj0.f36693u0;
                        org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                        if (R == null) {
                            sj0Var = null;
                        } else {
                            sj0Var = sj0.f36693u0;
                            if (sj0Var == null) {
                                sj0 sj0Var3 = new sj0(R, i10, bool, bool2, c0Var);
                                sj0Var3.show();
                                sj0.f36693u0 = sj0Var3;
                                sj0Var = sj0Var3;
                            }
                        }
                        if (sj0Var != null) {
                            sj0Var.setOnDismissListener(new d0(c1Var2, zArr, a1Var2, str2));
                            return;
                        }
                        return;
                    } else {
                        Bundle e = org.telegram.messenger.a2.e(15, "onlySelect", "dialogsType", true);
                        e.putLong("requestPeerBotId", c1Var2.U.f17342id);
                        try {
                            SerializedData serializedData = new SerializedData(tL_buttonTypeRequestPeer.peer_type.getObjectSize());
                            tL_buttonTypeRequestPeer.peer_type.serializeToStream(serializedData);
                            e.putByteArray("requestPeerType", serializedData.toByteArray());
                            serializedData.cleanup();
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                        boolean[] zArr2 = new boolean[1];
                        g0 g0Var = new g0(c1Var2, e, zArr2, a1Var2);
                        g0Var.C2 = new c0(c1Var2, zArr2, str2, tL_buttonTypeRequestPeer, a1Var2);
                        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                        if (U != 0) {
                            ?? obj3 = new Object();
                            obj3.f18485a = true;
                            U.showAsSheet(g0Var, obj3);
                            return;
                        }
                        return;
                    }
                } else if (tL_error != null) {
                    new wc(c1Var2, f6Var).d0(tL_error, false);
                    c1Var2.z(a1Var2, "requested_chat_failed", c1.B(str2, "req_id"));
                    return;
                } else {
                    new wc(c1Var2, f6Var).c0("UNKNOWN_BUTTON", false);
                    c1Var2.z(a1Var2, "requested_chat_failed", c1.B(str2, "req_id"));
                    return;
                }
            case 1:
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                f6 f6Var3 = c1Var.e;
                if (updates != null) {
                    MessagesController.getInstance(c1Var.M).processUpdates(updates, false);
                    c1Var.z(a1Var, "requested_chat_sent", c1.B(str, "req_id"));
                    return;
                } else if (tL_error2 != null) {
                    new wc(c1Var, f6Var3).d0(tL_error2, false);
                    c1Var.z(a1Var, "requested_chat_failed", c1.B(str, "req_id"));
                    return;
                } else {
                    new wc(c1Var, f6Var3).c0("UNKNOWN_BUTTON", false);
                    c1Var.z(a1Var, "requested_chat_failed", c1.B(str, "req_id"));
                    return;
                }
            default:
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                f6 f6Var4 = c1Var.e;
                if (updates2 != null) {
                    MessagesController.getInstance(c1Var.M).processUpdates(updates2, false);
                    c1Var.z(a1Var, "requested_chat_sent", c1.B(str, "req_id"));
                    return;
                } else if (tL_error3 != null) {
                    new wc(c1Var, f6Var4).d0(tL_error3, false);
                    c1Var.z(a1Var, "requested_chat_failed", c1.B(str, "req_id"));
                    return;
                } else {
                    new wc(c1Var, f6Var4).c0("UNKNOWN_BUTTON", false);
                    c1Var.z(a1Var, "requested_chat_failed", c1.B(str, "req_id"));
                    return;
                }
        }
    }
}
