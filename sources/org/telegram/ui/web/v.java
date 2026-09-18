package org.telegram.ui.web;

import ai.da;
import ai.e4;
import android.content.Context;
import android.os.Bundle;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.wh;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.cr;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.sj0;
public final class v implements Utilities.Callback2 {
    public final int f39057a;
    public final d1 f39058b;
    public final da f39059c;
    public final String d;

    public v(d1 d1Var, da daVar, String str, int i10) {
        this.f39057a = i10;
        this.f39058b = d1Var;
        this.f39059c = daVar;
        this.d = str;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10;
        sj0 sj0Var;
        int i11 = this.f39057a;
        String str = this.d;
        da daVar = this.f39059c;
        d1 d1Var = this.f39058b;
        switch (i11) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                d1 d1Var2 = this.f39058b;
                e6 e6Var = d1Var2.e;
                TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) zf.c.a((TL_keyboard.KeyboardButton) obj, TL_keyboard.TL_buttonTypeRequestPeer.class);
                da daVar2 = this.f39059c;
                String str2 = this.d;
                if (tL_buttonTypeRequestPeer != null) {
                    TLRPC.RequestPeerType requestPeerType = tL_buttonTypeRequestPeer.peer_type;
                    if (requestPeerType instanceof TLRPC.TL_requestPeerTypeCreateBot) {
                        Context context = d1Var2.getContext();
                        int i12 = d1Var2.M;
                        TLRPC.User user = d1Var2.U;
                        e4 e4Var = new e4(d1Var2, daVar2, str2, tL_buttonTypeRequestPeer, 13);
                        e6 e6Var2 = d1Var2.e;
                        cr.a(context, i12, user, (TLRPC.TL_requestPeerTypeCreateBot) requestPeerType, false, e4Var, e6Var2, new xc(d1Var2, e6Var2));
                        return;
                    } else if ((requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) && (i10 = tL_buttonTypeRequestPeer.max_quantity) > 1) {
                        TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) requestPeerType;
                        boolean[] zArr = new boolean[1];
                        Boolean bool = tL_requestPeerTypeUser.bot;
                        Boolean bool2 = tL_requestPeerTypeUser.premium;
                        c0 c0Var = new c0(d1Var2, zArr, str2, tL_buttonTypeRequestPeer, daVar2);
                        sj0 sj0Var2 = sj0.f37344u0;
                        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                        if (R == null) {
                            sj0Var = null;
                        } else {
                            sj0Var = sj0.f37344u0;
                            if (sj0Var == null) {
                                sj0 sj0Var3 = new sj0(R, i10, bool, bool2, c0Var);
                                sj0Var3.show();
                                sj0.f37344u0 = sj0Var3;
                                sj0Var = sj0Var3;
                            }
                        }
                        if (sj0Var != null) {
                            sj0Var.setOnDismissListener(new d0(d1Var2, zArr, daVar2, str2));
                            return;
                        }
                        return;
                    } else {
                        Bundle d = wh.d(15, "onlySelect", "dialogsType", true);
                        d.putLong("requestPeerBotId", d1Var2.U.f18443id);
                        try {
                            SerializedData serializedData = new SerializedData(tL_buttonTypeRequestPeer.peer_type.getObjectSize());
                            tL_buttonTypeRequestPeer.peer_type.serializeToStream(serializedData);
                            d.putByteArray("requestPeerType", serializedData.toByteArray());
                            serializedData.cleanup();
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        boolean[] zArr2 = new boolean[1];
                        g0 g0Var = new g0(d1Var2, d, zArr2, daVar2);
                        g0Var.C2 = new c0(d1Var2, zArr2, str2, tL_buttonTypeRequestPeer, daVar2);
                        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                        if (U != 0) {
                            ?? obj3 = new Object();
                            obj3.f19545a = true;
                            U.showAsSheet(g0Var, obj3);
                            return;
                        }
                        return;
                    }
                } else if (tL_error != null) {
                    new xc(d1Var2, e6Var).d0(tL_error, false);
                    d1Var2.y(daVar2, "requested_chat_failed", d1.B(str2, "req_id"));
                    return;
                } else {
                    new xc(d1Var2, e6Var).c0("UNKNOWN_BUTTON", false);
                    d1Var2.y(daVar2, "requested_chat_failed", d1.B(str2, "req_id"));
                    return;
                }
            case 1:
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                e6 e6Var3 = d1Var.e;
                if (updates != null) {
                    MessagesController.getInstance(d1Var.M).processUpdates(updates, false);
                    d1Var.y(daVar, "requested_chat_sent", d1.B(str, "req_id"));
                    return;
                } else if (tL_error2 != null) {
                    new xc(d1Var, e6Var3).d0(tL_error2, false);
                    d1Var.y(daVar, "requested_chat_failed", d1.B(str, "req_id"));
                    return;
                } else {
                    new xc(d1Var, e6Var3).c0("UNKNOWN_BUTTON", false);
                    d1Var.y(daVar, "requested_chat_failed", d1.B(str, "req_id"));
                    return;
                }
            default:
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                e6 e6Var4 = d1Var.e;
                if (updates2 != null) {
                    MessagesController.getInstance(d1Var.M).processUpdates(updates2, false);
                    d1Var.y(daVar, "requested_chat_sent", d1.B(str, "req_id"));
                    return;
                } else if (tL_error3 != null) {
                    new xc(d1Var, e6Var4).d0(tL_error3, false);
                    d1Var.y(daVar, "requested_chat_failed", d1.B(str, "req_id"));
                    return;
                } else {
                    new xc(d1Var, e6Var4).c0("UNKNOWN_BUTTON", false);
                    d1Var.y(daVar, "requested_chat_failed", d1.B(str, "req_id"));
                    return;
                }
        }
    }
}
