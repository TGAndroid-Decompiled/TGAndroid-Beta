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
import org.telegram.ui.Components.dr;
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.lj0;
public final class u implements Utilities.Callback2 {
    public final int f39194a;
    public final b1 f39195b;
    public final da f39196c;
    public final String d;

    public u(b1 b1Var, da daVar, String str, int i10) {
        this.f39194a = i10;
        this.f39195b = b1Var;
        this.f39196c = daVar;
        this.d = str;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10;
        lj0 lj0Var;
        int i11 = this.f39194a;
        String str = this.d;
        da daVar = this.f39196c;
        b1 b1Var = this.f39195b;
        switch (i11) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                b1 b1Var2 = this.f39195b;
                d6 d6Var = b1Var2.e;
                TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) zf.c.a((TL_keyboard.KeyboardButton) obj, TL_keyboard.TL_buttonTypeRequestPeer.class);
                da daVar2 = this.f39196c;
                String str2 = this.d;
                if (tL_buttonTypeRequestPeer != null) {
                    TLRPC.RequestPeerType requestPeerType = tL_buttonTypeRequestPeer.peer_type;
                    if (requestPeerType instanceof TLRPC.TL_requestPeerTypeCreateBot) {
                        Context context = b1Var2.getContext();
                        int i12 = b1Var2.M;
                        TLRPC.User user = b1Var2.U;
                        e4 e4Var = new e4(b1Var2, daVar2, str2, tL_buttonTypeRequestPeer, 14);
                        d6 d6Var2 = b1Var2.e;
                        dr.a(context, i12, user, (TLRPC.TL_requestPeerTypeCreateBot) requestPeerType, false, e4Var, d6Var2, new yc(b1Var2, d6Var2));
                        return;
                    } else if ((requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) && (i10 = tL_buttonTypeRequestPeer.max_quantity) > 1) {
                        TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) requestPeerType;
                        boolean[] zArr = new boolean[1];
                        Boolean bool = tL_requestPeerTypeUser.bot;
                        Boolean bool2 = tL_requestPeerTypeUser.premium;
                        b0 b0Var = new b0(b1Var2, zArr, str2, tL_buttonTypeRequestPeer, daVar2);
                        lj0 lj0Var2 = lj0.f35347u0;
                        org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
                        if (R == null) {
                            lj0Var = null;
                        } else {
                            lj0Var = lj0.f35347u0;
                            if (lj0Var == null) {
                                lj0 lj0Var3 = new lj0(R, i10, bool, bool2, b0Var);
                                lj0Var3.show();
                                lj0.f35347u0 = lj0Var3;
                                lj0Var = lj0Var3;
                            }
                        }
                        if (lj0Var != null) {
                            lj0Var.setOnDismissListener(new c0(b1Var2, zArr, daVar2, str2));
                            return;
                        }
                        return;
                    } else {
                        Bundle e = ok.e(15, "onlySelect", "dialogsType", true);
                        e.putLong("requestPeerBotId", b1Var2.U.f18468id);
                        try {
                            SerializedData serializedData = new SerializedData(tL_buttonTypeRequestPeer.peer_type.getObjectSize());
                            tL_buttonTypeRequestPeer.peer_type.serializeToStream(serializedData);
                            e.putByteArray("requestPeerType", serializedData.toByteArray());
                            serializedData.cleanup();
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                        boolean[] zArr2 = new boolean[1];
                        f0 f0Var = new f0(b1Var2, e, zArr2, daVar2);
                        f0Var.C2 = new b0(b1Var2, zArr2, str2, tL_buttonTypeRequestPeer, daVar2);
                        org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                        if (U != 0) {
                            ?? obj3 = new Object();
                            obj3.f19567a = true;
                            U.showAsSheet(f0Var, obj3);
                            return;
                        }
                        return;
                    }
                } else if (tL_error != null) {
                    new yc(b1Var2, d6Var).d0(tL_error, false);
                    b1Var2.y(daVar2, "requested_chat_failed", b1.B(str2, "req_id"));
                    return;
                } else {
                    new yc(b1Var2, d6Var).c0("UNKNOWN_BUTTON", false);
                    b1Var2.y(daVar2, "requested_chat_failed", b1.B(str2, "req_id"));
                    return;
                }
            case 1:
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                d6 d6Var3 = b1Var.e;
                if (updates != null) {
                    MessagesController.getInstance(b1Var.M).processUpdates(updates, false);
                    b1Var.y(daVar, "requested_chat_sent", b1.B(str, "req_id"));
                    return;
                } else if (tL_error2 != null) {
                    new yc(b1Var, d6Var3).d0(tL_error2, false);
                    b1Var.y(daVar, "requested_chat_failed", b1.B(str, "req_id"));
                    return;
                } else {
                    new yc(b1Var, d6Var3).c0("UNKNOWN_BUTTON", false);
                    b1Var.y(daVar, "requested_chat_failed", b1.B(str, "req_id"));
                    return;
                }
            default:
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                d6 d6Var4 = b1Var.e;
                if (updates2 != null) {
                    MessagesController.getInstance(b1Var.M).processUpdates(updates2, false);
                    b1Var.y(daVar, "requested_chat_sent", b1.B(str, "req_id"));
                    return;
                } else if (tL_error3 != null) {
                    new yc(b1Var, d6Var4).d0(tL_error3, false);
                    b1Var.y(daVar, "requested_chat_failed", b1.B(str, "req_id"));
                    return;
                } else {
                    new yc(b1Var, d6Var4).c0("UNKNOWN_BUTTON", false);
                    b1Var.y(daVar, "requested_chat_failed", b1.B(str, "req_id"));
                    return;
                }
        }
    }
}
