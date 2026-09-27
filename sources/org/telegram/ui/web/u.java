package org.telegram.ui.web;

import ai.da;
import ai.e4;
import android.content.Context;
import android.os.Bundle;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.qk;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.nj0;
public final class u implements Utilities.Callback2 {
    public final int f39165a;
    public final c1 f39166b;
    public final da f39167c;
    public final String d;

    public u(c1 c1Var, da daVar, String str, int i10) {
        this.f39165a = i10;
        this.f39166b = c1Var;
        this.f39167c = daVar;
        this.d = str;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10;
        nj0 nj0Var;
        int i11 = this.f39165a;
        String str = this.d;
        da daVar = this.f39167c;
        c1 c1Var = this.f39166b;
        switch (i11) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                c1 c1Var2 = this.f39166b;
                e6 e6Var = c1Var2.e;
                TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) zf.c.a((TL_keyboard.KeyboardButton) obj, TL_keyboard.TL_buttonTypeRequestPeer.class);
                da daVar2 = this.f39167c;
                String str2 = this.d;
                if (tL_buttonTypeRequestPeer != null) {
                    TLRPC.RequestPeerType requestPeerType = tL_buttonTypeRequestPeer.peer_type;
                    if (requestPeerType instanceof TLRPC.TL_requestPeerTypeCreateBot) {
                        Context context = c1Var2.getContext();
                        int i12 = c1Var2.M;
                        TLRPC.User user = c1Var2.U;
                        e4 e4Var = new e4(c1Var2, daVar2, str2, tL_buttonTypeRequestPeer, 14);
                        e6 e6Var2 = c1Var2.e;
                        er.a(context, i12, user, (TLRPC.TL_requestPeerTypeCreateBot) requestPeerType, false, e4Var, e6Var2, new xc(c1Var2, e6Var2));
                        return;
                    } else if ((requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) && (i10 = tL_buttonTypeRequestPeer.max_quantity) > 1) {
                        TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) requestPeerType;
                        boolean[] zArr = new boolean[1];
                        Boolean bool = tL_requestPeerTypeUser.bot;
                        Boolean bool2 = tL_requestPeerTypeUser.premium;
                        b0 b0Var = new b0(c1Var2, zArr, str2, tL_buttonTypeRequestPeer, daVar2);
                        nj0 nj0Var2 = nj0.f36022u0;
                        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                        if (R == null) {
                            nj0Var = null;
                        } else {
                            nj0Var = nj0.f36022u0;
                            if (nj0Var == null) {
                                nj0 nj0Var3 = new nj0(R, i10, bool, bool2, b0Var);
                                nj0Var3.show();
                                nj0.f36022u0 = nj0Var3;
                                nj0Var = nj0Var3;
                            }
                        }
                        if (nj0Var != null) {
                            nj0Var.setOnDismissListener(new c0(c1Var2, zArr, daVar2, str2));
                            return;
                        }
                        return;
                    } else {
                        Bundle e = qk.e(15, "onlySelect", "dialogsType", true);
                        e.putLong("requestPeerBotId", c1Var2.U.f18476id);
                        try {
                            SerializedData serializedData = new SerializedData(tL_buttonTypeRequestPeer.peer_type.getObjectSize());
                            tL_buttonTypeRequestPeer.peer_type.serializeToStream(serializedData);
                            e.putByteArray("requestPeerType", serializedData.toByteArray());
                            serializedData.cleanup();
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                        boolean[] zArr2 = new boolean[1];
                        g0 g0Var = new g0(c1Var2, e, zArr2, daVar2);
                        g0Var.C2 = new b0(c1Var2, zArr2, str2, tL_buttonTypeRequestPeer, daVar2);
                        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                        if (U != 0) {
                            ?? obj3 = new Object();
                            obj3.f19631a = true;
                            U.showAsSheet(g0Var, obj3);
                            return;
                        }
                        return;
                    }
                } else if (tL_error != null) {
                    new xc(c1Var2, e6Var).d0(tL_error, false);
                    c1Var2.y(daVar2, "requested_chat_failed", c1.B(str2, "req_id"));
                    return;
                } else {
                    new xc(c1Var2, e6Var).c0("UNKNOWN_BUTTON", false);
                    c1Var2.y(daVar2, "requested_chat_failed", c1.B(str2, "req_id"));
                    return;
                }
            case 1:
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                e6 e6Var3 = c1Var.e;
                if (updates != null) {
                    MessagesController.getInstance(c1Var.M).processUpdates(updates, false);
                    c1Var.y(daVar, "requested_chat_sent", c1.B(str, "req_id"));
                    return;
                } else if (tL_error2 != null) {
                    new xc(c1Var, e6Var3).d0(tL_error2, false);
                    c1Var.y(daVar, "requested_chat_failed", c1.B(str, "req_id"));
                    return;
                } else {
                    new xc(c1Var, e6Var3).c0("UNKNOWN_BUTTON", false);
                    c1Var.y(daVar, "requested_chat_failed", c1.B(str, "req_id"));
                    return;
                }
            default:
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                e6 e6Var4 = c1Var.e;
                if (updates2 != null) {
                    MessagesController.getInstance(c1Var.M).processUpdates(updates2, false);
                    c1Var.y(daVar, "requested_chat_sent", c1.B(str, "req_id"));
                    return;
                } else if (tL_error3 != null) {
                    new xc(c1Var, e6Var4).d0(tL_error3, false);
                    c1Var.y(daVar, "requested_chat_failed", c1.B(str, "req_id"));
                    return;
                } else {
                    new xc(c1Var, e6Var4).c0("UNKNOWN_BUTTON", false);
                    c1Var.y(daVar, "requested_chat_failed", c1.B(str, "req_id"));
                    return;
                }
        }
    }
}
