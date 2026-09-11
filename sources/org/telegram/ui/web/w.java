package org.telegram.ui.web;

import android.content.Context;
import android.os.Bundle;
import bi.k9;
import bi.r3;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.br;
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.tj0;
public final class w implements Utilities.Callback2 {
    public final int f42267a;
    public final d1 f42268b;
    public final k9 f42269c;
    public final String d;

    public w(d1 d1Var, k9 k9Var, String str, int i10) {
        this.f42267a = i10;
        this.f42268b = d1Var;
        this.f42269c = k9Var;
        this.d = str;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10;
        tj0 tj0Var;
        int i11 = this.f42267a;
        String str = this.d;
        k9 k9Var = this.f42269c;
        d1 d1Var = this.f42268b;
        switch (i11) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                d1 d1Var2 = this.f42268b;
                f6 f6Var = d1Var2.f42042e;
                TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) zf.c.a((TL_keyboard.KeyboardButton) obj, TL_keyboard.TL_buttonTypeRequestPeer.class);
                k9 k9Var2 = this.f42269c;
                String str2 = this.d;
                if (tL_buttonTypeRequestPeer != null) {
                    TLRPC.RequestPeerType requestPeerType = tL_buttonTypeRequestPeer.peer_type;
                    if (requestPeerType instanceof TLRPC.TL_requestPeerTypeCreateBot) {
                        Context context = d1Var2.getContext();
                        int i12 = d1Var2.M;
                        TLRPC.User user = d1Var2.U;
                        r3 r3Var = new r3(d1Var2, k9Var2, str2, tL_buttonTypeRequestPeer, 13);
                        f6 f6Var2 = d1Var2.f42042e;
                        br.a(context, i12, user, (TLRPC.TL_requestPeerTypeCreateBot) requestPeerType, false, r3Var, f6Var2, new yc(d1Var2, f6Var2));
                        return;
                    } else if ((requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) && (i10 = tL_buttonTypeRequestPeer.max_quantity) > 1) {
                        TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) requestPeerType;
                        boolean[] zArr = new boolean[1];
                        Boolean bool = tL_requestPeerTypeUser.bot;
                        Boolean bool2 = tL_requestPeerTypeUser.premium;
                        d0 d0Var = new d0(d1Var2, zArr, str2, tL_buttonTypeRequestPeer, k9Var2);
                        tj0 tj0Var2 = tj0.f40767u0;
                        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                        if (R == null) {
                            tj0Var = null;
                        } else {
                            tj0Var = tj0.f40767u0;
                            if (tj0Var == null) {
                                tj0 tj0Var3 = new tj0(R, i10, bool, bool2, d0Var);
                                tj0Var3.show();
                                tj0.f40767u0 = tj0Var3;
                                tj0Var = tj0Var3;
                            }
                        }
                        if (tj0Var != null) {
                            tj0Var.setOnDismissListener(new e0(d1Var2, zArr, k9Var2, str2));
                            return;
                        }
                        return;
                    } else {
                        Bundle e7 = org.telegram.messenger.w1.e(15, "onlySelect", "dialogsType", true);
                        e7.putLong("requestPeerBotId", d1Var2.U.f20016id);
                        try {
                            SerializedData serializedData = new SerializedData(tL_buttonTypeRequestPeer.peer_type.getObjectSize());
                            tL_buttonTypeRequestPeer.peer_type.serializeToStream(serializedData);
                            e7.putByteArray("requestPeerType", serializedData.toByteArray());
                            serializedData.cleanup();
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                        boolean[] zArr2 = new boolean[1];
                        h0 h0Var = new h0(d1Var2, e7, zArr2, k9Var2);
                        h0Var.C2 = new d0(d1Var2, zArr2, str2, tL_buttonTypeRequestPeer, k9Var2);
                        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                        if (U != 0) {
                            ?? obj3 = new Object();
                            obj3.f21142a = true;
                            U.showAsSheet(h0Var, obj3);
                            return;
                        }
                        return;
                    }
                } else if (tL_error != null) {
                    new yc(d1Var2, f6Var).d0(tL_error, false);
                    d1Var2.y(k9Var2, "requested_chat_failed", d1.B(str2, "req_id"));
                    return;
                } else {
                    new yc(d1Var2, f6Var).c0("UNKNOWN_BUTTON", false);
                    d1Var2.y(k9Var2, "requested_chat_failed", d1.B(str2, "req_id"));
                    return;
                }
            case 1:
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                f6 f6Var3 = d1Var.f42042e;
                if (updates != null) {
                    MessagesController.getInstance(d1Var.M).processUpdates(updates, false);
                    d1Var.y(k9Var, "requested_chat_sent", d1.B(str, "req_id"));
                    return;
                } else if (tL_error2 != null) {
                    new yc(d1Var, f6Var3).d0(tL_error2, false);
                    d1Var.y(k9Var, "requested_chat_failed", d1.B(str, "req_id"));
                    return;
                } else {
                    new yc(d1Var, f6Var3).c0("UNKNOWN_BUTTON", false);
                    d1Var.y(k9Var, "requested_chat_failed", d1.B(str, "req_id"));
                    return;
                }
            default:
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                f6 f6Var4 = d1Var.f42042e;
                if (updates2 != null) {
                    MessagesController.getInstance(d1Var.M).processUpdates(updates2, false);
                    d1Var.y(k9Var, "requested_chat_sent", d1.B(str, "req_id"));
                    return;
                } else if (tL_error3 != null) {
                    new yc(d1Var, f6Var4).d0(tL_error3, false);
                    d1Var.y(k9Var, "requested_chat_failed", d1.B(str, "req_id"));
                    return;
                } else {
                    new yc(d1Var, f6Var4).c0("UNKNOWN_BUTTON", false);
                    d1Var.y(k9Var, "requested_chat_failed", d1.B(str, "req_id"));
                    return;
                }
        }
    }
}
