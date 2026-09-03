package org.telegram.ui.web;

import android.content.Context;
import android.os.Bundle;
import lh.p5;
import nh.j7;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.y3;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.zq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.jj0;
public final class v implements Utilities.Callback2 {
    public final int f39626a;
    public final c1 f39627b;
    public final j7 f39628c;
    public final String d;

    public v(c1 c1Var, j7 j7Var, String str, int i10) {
        this.f39626a = i10;
        this.f39627b = c1Var;
        this.f39628c = j7Var;
        this.d = str;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10;
        jj0 jj0Var;
        int i11 = this.f39626a;
        String str = this.d;
        j7 j7Var = this.f39628c;
        c1 c1Var = this.f39627b;
        switch (i11) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                c1 c1Var2 = this.f39627b;
                f6 f6Var = c1Var2.e;
                TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) lf.c.a((TL_keyboard.KeyboardButton) obj, TL_keyboard.TL_buttonTypeRequestPeer.class);
                j7 j7Var2 = this.f39628c;
                String str2 = this.d;
                if (tL_buttonTypeRequestPeer != null) {
                    TLRPC.RequestPeerType requestPeerType = tL_buttonTypeRequestPeer.peer_type;
                    if (requestPeerType instanceof TLRPC.TL_requestPeerTypeCreateBot) {
                        Context context = c1Var2.getContext();
                        int i12 = c1Var2.J;
                        TLRPC.User user = c1Var2.R;
                        gg.c1 c1Var3 = new gg.c1(c1Var2, j7Var2, str2, tL_buttonTypeRequestPeer, 15);
                        f6 f6Var2 = c1Var2.e;
                        zq.a(context, i12, user, (TLRPC.TL_requestPeerTypeCreateBot) requestPeerType, false, c1Var3, f6Var2, new qc(c1Var2, f6Var2));
                        return;
                    } else if ((requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) && (i10 = tL_buttonTypeRequestPeer.max_quantity) > 1) {
                        TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) requestPeerType;
                        boolean[] zArr = new boolean[1];
                        Boolean bool = tL_requestPeerTypeUser.bot;
                        Boolean bool2 = tL_requestPeerTypeUser.premium;
                        c0 c0Var = new c0(c1Var2, zArr, str2, tL_buttonTypeRequestPeer, j7Var2);
                        jj0 jj0Var2 = jj0.f35297r0;
                        p2 R = LaunchActivity.R();
                        if (R == null) {
                            jj0Var = null;
                        } else {
                            jj0Var = jj0.f35297r0;
                            if (jj0Var == null) {
                                jj0 jj0Var3 = new jj0(R, i10, bool, bool2, c0Var);
                                jj0Var3.show();
                                jj0.f35297r0 = jj0Var3;
                                jj0Var = jj0Var3;
                            }
                        }
                        if (jj0Var != null) {
                            jj0Var.setOnDismissListener(new p5(c1Var2, zArr, j7Var2, str2));
                            return;
                        }
                        return;
                    } else {
                        Bundle e = y3.e(15, "onlySelect", "dialogsType", true);
                        e.putLong("requestPeerBotId", c1Var2.R.f19306id);
                        try {
                            SerializedData serializedData = new SerializedData(tL_buttonTypeRequestPeer.peer_type.getObjectSize());
                            tL_buttonTypeRequestPeer.peer_type.serializeToStream(serializedData);
                            e.putByteArray("requestPeerType", serializedData.toByteArray());
                            serializedData.cleanup();
                        } catch (Exception e6) {
                            FileLog.e(e6);
                        }
                        boolean[] zArr2 = new boolean[1];
                        f0 f0Var = new f0(c1Var2, e, zArr2, j7Var2);
                        f0Var.f37649z2 = new c0(c1Var2, zArr2, str2, tL_buttonTypeRequestPeer, j7Var2);
                        p2 U = LaunchActivity.U();
                        if (U != 0) {
                            ?? obj3 = new Object();
                            obj3.f20453a = true;
                            U.showAsSheet(f0Var, obj3);
                            return;
                        }
                        return;
                    }
                } else if (tL_error != null) {
                    new qc(c1Var2, f6Var).d0(tL_error, false);
                    c1Var2.z(j7Var2, "requested_chat_failed", c1.B(str2, "req_id"));
                    return;
                } else {
                    new qc(c1Var2, f6Var).c0("UNKNOWN_BUTTON", false);
                    c1Var2.z(j7Var2, "requested_chat_failed", c1.B(str2, "req_id"));
                    return;
                }
            case 1:
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                f6 f6Var3 = c1Var.e;
                if (updates != null) {
                    MessagesController.getInstance(c1Var.J).processUpdates(updates, false);
                    c1Var.z(j7Var, "requested_chat_sent", c1.B(str, "req_id"));
                    return;
                } else if (tL_error2 != null) {
                    new qc(c1Var, f6Var3).d0(tL_error2, false);
                    c1Var.z(j7Var, "requested_chat_failed", c1.B(str, "req_id"));
                    return;
                } else {
                    new qc(c1Var, f6Var3).c0("UNKNOWN_BUTTON", false);
                    c1Var.z(j7Var, "requested_chat_failed", c1.B(str, "req_id"));
                    return;
                }
            default:
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                f6 f6Var4 = c1Var.e;
                if (updates2 != null) {
                    MessagesController.getInstance(c1Var.J).processUpdates(updates2, false);
                    c1Var.z(j7Var, "requested_chat_sent", c1.B(str, "req_id"));
                    return;
                } else if (tL_error3 != null) {
                    new qc(c1Var, f6Var4).d0(tL_error3, false);
                    c1Var.z(j7Var, "requested_chat_failed", c1.B(str, "req_id"));
                    return;
                } else {
                    new qc(c1Var, f6Var4).c0("UNKNOWN_BUTTON", false);
                    c1Var.z(j7Var, "requested_chat_failed", c1.B(str, "req_id"));
                    return;
                }
        }
    }
}
