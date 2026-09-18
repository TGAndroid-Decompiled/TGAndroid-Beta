package org.telegram.ui.web;

import ai.da;
import ai.e4;
import android.content.Context;
import android.os.Bundle;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.cr;
import org.telegram.ui.Components.vc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.tj0;
public final class v implements Utilities.Callback2 {
    public final int f38949a;
    public final d1 f38950b;
    public final da f38951c;
    public final String d;

    public v(d1 d1Var, da daVar, String str, int i10) {
        this.f38949a = i10;
        this.f38950b = d1Var;
        this.f38951c = daVar;
        this.d = str;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10;
        tj0 tj0Var;
        int i11 = this.f38949a;
        String str = this.d;
        da daVar = this.f38951c;
        d1 d1Var = this.f38950b;
        switch (i11) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                d1 d1Var2 = this.f38950b;
                f6 f6Var = d1Var2.e;
                TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) zf.c.a((TL_keyboard.KeyboardButton) obj, TL_keyboard.TL_buttonTypeRequestPeer.class);
                da daVar2 = this.f38951c;
                String str2 = this.d;
                if (tL_buttonTypeRequestPeer != null) {
                    TLRPC.RequestPeerType requestPeerType = tL_buttonTypeRequestPeer.peer_type;
                    if (requestPeerType instanceof TLRPC.TL_requestPeerTypeCreateBot) {
                        Context context = d1Var2.getContext();
                        int i12 = d1Var2.M;
                        TLRPC.User user = d1Var2.U;
                        e4 e4Var = new e4(d1Var2, daVar2, str2, tL_buttonTypeRequestPeer, 13);
                        f6 f6Var2 = d1Var2.e;
                        cr.a(context, i12, user, (TLRPC.TL_requestPeerTypeCreateBot) requestPeerType, false, e4Var, f6Var2, new vc(d1Var2, f6Var2));
                        return;
                    } else if ((requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) && (i10 = tL_buttonTypeRequestPeer.max_quantity) > 1) {
                        TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) requestPeerType;
                        boolean[] zArr = new boolean[1];
                        Boolean bool = tL_requestPeerTypeUser.bot;
                        Boolean bool2 = tL_requestPeerTypeUser.premium;
                        c0 c0Var = new c0(d1Var2, zArr, str2, tL_buttonTypeRequestPeer, daVar2);
                        tj0 tj0Var2 = tj0.f37810u0;
                        o2 R = LaunchActivity.R();
                        if (R == null) {
                            tj0Var = null;
                        } else {
                            tj0Var = tj0.f37810u0;
                            if (tj0Var == null) {
                                tj0 tj0Var3 = new tj0(R, i10, bool, bool2, c0Var);
                                tj0Var3.show();
                                tj0.f37810u0 = tj0Var3;
                                tj0Var = tj0Var3;
                            }
                        }
                        if (tj0Var != null) {
                            tj0Var.setOnDismissListener(new d0(d1Var2, zArr, daVar2, str2));
                            return;
                        }
                        return;
                    } else {
                        Bundle e = org.telegram.messenger.w1.e(15, "onlySelect", "dialogsType", true);
                        e.putLong("requestPeerBotId", d1Var2.U.f18268id);
                        try {
                            SerializedData serializedData = new SerializedData(tL_buttonTypeRequestPeer.peer_type.getObjectSize());
                            tL_buttonTypeRequestPeer.peer_type.serializeToStream(serializedData);
                            e.putByteArray("requestPeerType", serializedData.toByteArray());
                            serializedData.cleanup();
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                        boolean[] zArr2 = new boolean[1];
                        g0 g0Var = new g0(d1Var2, e, zArr2, daVar2);
                        g0Var.C2 = new c0(d1Var2, zArr2, str2, tL_buttonTypeRequestPeer, daVar2);
                        o2 U = LaunchActivity.U();
                        if (U != 0) {
                            ?? obj3 = new Object();
                            obj3.f19398a = true;
                            U.showAsSheet(g0Var, obj3);
                            return;
                        }
                        return;
                    }
                } else if (tL_error != null) {
                    new vc(d1Var2, f6Var).d0(tL_error, false);
                    d1Var2.y(daVar2, "requested_chat_failed", d1.B(str2, "req_id"));
                    return;
                } else {
                    new vc(d1Var2, f6Var).c0("UNKNOWN_BUTTON", false);
                    d1Var2.y(daVar2, "requested_chat_failed", d1.B(str2, "req_id"));
                    return;
                }
            case 1:
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                f6 f6Var3 = d1Var.e;
                if (updates != null) {
                    MessagesController.getInstance(d1Var.M).processUpdates(updates, false);
                    d1Var.y(daVar, "requested_chat_sent", d1.B(str, "req_id"));
                    return;
                } else if (tL_error2 != null) {
                    new vc(d1Var, f6Var3).d0(tL_error2, false);
                    d1Var.y(daVar, "requested_chat_failed", d1.B(str, "req_id"));
                    return;
                } else {
                    new vc(d1Var, f6Var3).c0("UNKNOWN_BUTTON", false);
                    d1Var.y(daVar, "requested_chat_failed", d1.B(str, "req_id"));
                    return;
                }
            default:
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                f6 f6Var4 = d1Var.e;
                if (updates2 != null) {
                    MessagesController.getInstance(d1Var.M).processUpdates(updates2, false);
                    d1Var.y(daVar, "requested_chat_sent", d1.B(str, "req_id"));
                    return;
                } else if (tL_error3 != null) {
                    new vc(d1Var, f6Var4).d0(tL_error3, false);
                    d1Var.y(daVar, "requested_chat_failed", d1.B(str, "req_id"));
                    return;
                } else {
                    new vc(d1Var, f6Var4).c0("UNKNOWN_BUTTON", false);
                    d1Var.y(daVar, "requested_chat_failed", d1.B(str, "req_id"));
                    return;
                }
        }
    }
}
