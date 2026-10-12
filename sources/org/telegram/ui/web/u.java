package org.telegram.ui.web;

import ai.ea;
import ai.f4;
import android.content.Context;
import android.os.Bundle;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.vr;
import org.telegram.ui.Components.zc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.dl0;
import org.telegram.ui.tj0;
public final class u implements Utilities.Callback2 {
    public final int f43409a;
    public final b1 f43410b;
    public final ea f43411c;
    public final String d;

    public u(b1 b1Var, ea eaVar, String str, int i10) {
        this.f43409a = i10;
        this.f43410b = b1Var;
        this.f43411c = eaVar;
        this.d = str;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10;
        tj0 tj0Var;
        int i11 = this.f43409a;
        String str = this.d;
        ea eaVar = this.f43411c;
        b1 b1Var = this.f43410b;
        switch (i11) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                b1 b1Var2 = this.f43410b;
                c6 c6Var = b1Var2.f43186e;
                TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) zf.c.a((TL_keyboard.KeyboardButton) obj, TL_keyboard.TL_buttonTypeRequestPeer.class);
                ea eaVar2 = this.f43411c;
                String str2 = this.d;
                if (tL_buttonTypeRequestPeer != null) {
                    TLRPC.RequestPeerType requestPeerType = tL_buttonTypeRequestPeer.peer_type;
                    if (requestPeerType instanceof TLRPC.TL_requestPeerTypeCreateBot) {
                        Context context = b1Var2.getContext();
                        int i12 = b1Var2.M;
                        TLRPC.User user = b1Var2.U;
                        f4 f4Var = new f4(b1Var2, eaVar2, str2, tL_buttonTypeRequestPeer, 14);
                        c6 c6Var2 = b1Var2.f43186e;
                        vr.e(context, i12, user, (TLRPC.TL_requestPeerTypeCreateBot) requestPeerType, false, f4Var, c6Var2, new zc(b1Var2, c6Var2));
                        return;
                    } else if ((requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) && (i10 = tL_buttonTypeRequestPeer.max_quantity) > 1) {
                        TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) requestPeerType;
                        boolean[] zArr = new boolean[1];
                        Boolean bool = tL_requestPeerTypeUser.bot;
                        Boolean bool2 = tL_requestPeerTypeUser.premium;
                        b0 b0Var = new b0(b1Var2, zArr, str2, tL_buttonTypeRequestPeer, eaVar2);
                        tj0 tj0Var2 = tj0.f42213u0;
                        org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
                        if (R == null) {
                            tj0Var = null;
                        } else {
                            tj0Var = tj0.f42213u0;
                            if (tj0Var == null) {
                                tj0 tj0Var3 = new tj0(R, i10, bool, bool2, b0Var);
                                tj0Var3.show();
                                tj0.f42213u0 = tj0Var3;
                                tj0Var = tj0Var3;
                            }
                        }
                        if (tj0Var != null) {
                            tj0Var.setOnDismissListener(new dl0(b1Var2, zArr, eaVar2, str2));
                            return;
                        }
                        return;
                    } else {
                        Bundle e7 = org.telegram.messenger.v0.e(15, "onlySelect", "dialogsType", true);
                        e7.putLong("requestPeerBotId", b1Var2.U.f19949id);
                        try {
                            SerializedData serializedData = new SerializedData(tL_buttonTypeRequestPeer.peer_type.getObjectSize());
                            tL_buttonTypeRequestPeer.peer_type.serializeToStream(serializedData);
                            e7.putByteArray("requestPeerType", serializedData.toByteArray());
                            serializedData.cleanup();
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                        boolean[] zArr2 = new boolean[1];
                        f0 f0Var = new f0(b1Var2, e7, zArr2, eaVar2);
                        f0Var.C2 = new b0(b1Var2, zArr2, str2, tL_buttonTypeRequestPeer, eaVar2);
                        org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                        if (U != 0) {
                            ?? obj3 = new Object();
                            obj3.f21087a = true;
                            U.showAsSheet(f0Var, obj3);
                            return;
                        }
                        return;
                    }
                } else if (tL_error != null) {
                    new zc(b1Var2, c6Var).f0(tL_error, false);
                    b1Var2.x(eaVar2, "requested_chat_failed", b1.A(str2, "req_id"));
                    return;
                } else {
                    new zc(b1Var2, c6Var).e0("UNKNOWN_BUTTON", false);
                    b1Var2.x(eaVar2, "requested_chat_failed", b1.A(str2, "req_id"));
                    return;
                }
            case 1:
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                c6 c6Var3 = b1Var.f43186e;
                if (updates != null) {
                    MessagesController.getInstance(b1Var.M).lambda$processUpdates$377(updates, false);
                    b1Var.x(eaVar, "requested_chat_sent", b1.A(str, "req_id"));
                    return;
                } else if (tL_error2 != null) {
                    new zc(b1Var, c6Var3).f0(tL_error2, false);
                    b1Var.x(eaVar, "requested_chat_failed", b1.A(str, "req_id"));
                    return;
                } else {
                    new zc(b1Var, c6Var3).e0("UNKNOWN_BUTTON", false);
                    b1Var.x(eaVar, "requested_chat_failed", b1.A(str, "req_id"));
                    return;
                }
            default:
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                c6 c6Var4 = b1Var.f43186e;
                if (updates2 != null) {
                    MessagesController.getInstance(b1Var.M).lambda$processUpdates$377(updates2, false);
                    b1Var.x(eaVar, "requested_chat_sent", b1.A(str, "req_id"));
                    return;
                } else if (tL_error3 != null) {
                    new zc(b1Var, c6Var4).f0(tL_error3, false);
                    b1Var.x(eaVar, "requested_chat_failed", b1.A(str, "req_id"));
                    return;
                } else {
                    new zc(b1Var, c6Var4).e0("UNKNOWN_BUTTON", false);
                    b1Var.x(eaVar, "requested_chat_failed", b1.A(str, "req_id"));
                    return;
                }
        }
    }
}
