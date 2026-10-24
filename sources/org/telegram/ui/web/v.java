package org.telegram.ui.web;

import ai.w7;
import android.content.Context;
import android.os.Bundle;
import ci.y2;
import ci.y7;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.vc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ej0;
public final class v implements Utilities.Callback2 {
    public final int f43292a;
    public final b1 f43293b;
    public final y7 f43294c;
    public final String d;

    public v(b1 b1Var, y7 y7Var, String str, int i10) {
        this.f43292a = i10;
        this.f43293b = b1Var;
        this.f43294c = y7Var;
        this.d = str;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10;
        ej0 ej0Var;
        int i11 = this.f43292a;
        String str = this.d;
        y7 y7Var = this.f43294c;
        b1 b1Var = this.f43293b;
        switch (i11) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                b1 b1Var2 = this.f43293b;
                g6 g6Var = b1Var2.e;
                TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) ag.c.a((TL_keyboard.KeyboardButton) obj, TL_keyboard.TL_buttonTypeRequestPeer.class);
                y7 y7Var2 = this.f43294c;
                String str2 = this.d;
                if (tL_buttonTypeRequestPeer != null) {
                    TLRPC.RequestPeerType requestPeerType = tL_buttonTypeRequestPeer.peer_type;
                    if (requestPeerType instanceof TLRPC.TL_requestPeerTypeCreateBot) {
                        Context context = b1Var2.getContext();
                        int i12 = b1Var2.M;
                        TLRPC.User user = b1Var2.U;
                        y2 y2Var = new y2(b1Var2, y7Var2, str2, tL_buttonTypeRequestPeer, 14);
                        g6 g6Var2 = b1Var2.e;
                        lr.e(context, i12, user, (TLRPC.TL_requestPeerTypeCreateBot) requestPeerType, false, y2Var, g6Var2, new vc(b1Var2, g6Var2));
                        return;
                    } else if ((requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) && (i10 = tL_buttonTypeRequestPeer.max_quantity) > 1) {
                        TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) requestPeerType;
                        boolean[] zArr = new boolean[1];
                        Boolean bool = tL_requestPeerTypeUser.bot;
                        Boolean bool2 = tL_requestPeerTypeUser.premium;
                        c0 c0Var = new c0(b1Var2, zArr, str2, tL_buttonTypeRequestPeer, y7Var2);
                        ej0 ej0Var2 = ej0.f36921u0;
                        o2 R = LaunchActivity.R();
                        if (R == null) {
                            ej0Var = null;
                        } else {
                            ej0Var = ej0.f36921u0;
                            if (ej0Var == null) {
                                ej0 ej0Var3 = new ej0(R, i10, bool, bool2, c0Var);
                                ej0Var3.show();
                                ej0.f36921u0 = ej0Var3;
                                ej0Var = ej0Var3;
                            }
                        }
                        if (ej0Var != null) {
                            ej0Var.setOnDismissListener(new w7(b1Var2, zArr, y7Var2, str2));
                            return;
                        }
                        return;
                    } else {
                        Bundle e = org.telegram.messenger.v0.e(15, "onlySelect", "dialogsType", true);
                        e.putLong("requestPeerBotId", b1Var2.U.f20491id);
                        try {
                            SerializedData serializedData = new SerializedData(tL_buttonTypeRequestPeer.peer_type.getObjectSize());
                            tL_buttonTypeRequestPeer.peer_type.serializeToStream(serializedData);
                            e.putByteArray("requestPeerType", serializedData.toByteArray());
                            serializedData.cleanup();
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                        boolean[] zArr2 = new boolean[1];
                        g0 g0Var = new g0(b1Var2, e, zArr2, y7Var2);
                        g0Var.C2 = new c0(b1Var2, zArr2, str2, tL_buttonTypeRequestPeer, y7Var2);
                        o2 U = LaunchActivity.U();
                        if (U != 0) {
                            ?? obj3 = new Object();
                            obj3.f21637a = true;
                            U.showAsSheet(g0Var, obj3);
                            return;
                        }
                        return;
                    }
                } else if (tL_error != null) {
                    new vc(b1Var2, g6Var).f0(tL_error, false);
                    b1Var2.x(y7Var2, "requested_chat_failed", b1.A(str2, "req_id"));
                    return;
                } else {
                    new vc(b1Var2, g6Var).e0("UNKNOWN_BUTTON", false);
                    b1Var2.x(y7Var2, "requested_chat_failed", b1.A(str2, "req_id"));
                    return;
                }
            case 1:
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                g6 g6Var3 = b1Var.e;
                if (updates != null) {
                    MessagesController.getInstance(b1Var.M).lambda$processUpdates$377(updates, false);
                    b1Var.x(y7Var, "requested_chat_sent", b1.A(str, "req_id"));
                    return;
                } else if (tL_error2 != null) {
                    new vc(b1Var, g6Var3).f0(tL_error2, false);
                    b1Var.x(y7Var, "requested_chat_failed", b1.A(str, "req_id"));
                    return;
                } else {
                    new vc(b1Var, g6Var3).e0("UNKNOWN_BUTTON", false);
                    b1Var.x(y7Var, "requested_chat_failed", b1.A(str, "req_id"));
                    return;
                }
            default:
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                g6 g6Var4 = b1Var.e;
                if (updates2 != null) {
                    MessagesController.getInstance(b1Var.M).lambda$processUpdates$377(updates2, false);
                    b1Var.x(y7Var, "requested_chat_sent", b1.A(str, "req_id"));
                    return;
                } else if (tL_error3 != null) {
                    new vc(b1Var, g6Var4).f0(tL_error3, false);
                    b1Var.x(y7Var, "requested_chat_failed", b1.A(str, "req_id"));
                    return;
                } else {
                    new vc(b1Var, g6Var4).e0("UNKNOWN_BUTTON", false);
                    b1Var.x(y7Var, "requested_chat_failed", b1.A(str, "req_id"));
                    return;
                }
        }
    }
}
