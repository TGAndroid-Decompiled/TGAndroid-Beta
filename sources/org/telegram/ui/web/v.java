package org.telegram.ui.web;

import android.content.Context;
import android.os.Bundle;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.sq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bj0;
public final class v implements Utilities.Callback2 {
    public final int f44033a;
    public final y0 f44034b;
    public final String f44035c;

    public v(y0 y0Var, String str, int i9) {
        this.f44033a = i9;
        this.f44034b = y0Var;
        this.f44035c = str;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i9;
        bj0 bj0Var;
        int i10 = this.f44033a;
        String str = this.f44035c;
        y0 y0Var = this.f44034b;
        switch (i10) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                b6 b6Var = y0Var.f44077e;
                TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) gf.c.a((TL_keyboard.KeyboardButton) obj, TL_keyboard.TL_buttonTypeRequestPeer.class);
                if (tL_buttonTypeRequestPeer != null) {
                    TLRPC.RequestPeerType requestPeerType = tL_buttonTypeRequestPeer.peer_type;
                    if (requestPeerType instanceof TLRPC.TL_requestPeerTypeCreateBot) {
                        TLRPC.TL_requestPeerTypeCreateBot tL_requestPeerTypeCreateBot = (TLRPC.TL_requestPeerTypeCreateBot) requestPeerType;
                        Context context = y0Var.getContext();
                        int i11 = y0Var.I;
                        TLRPC.User user = y0Var.Q;
                        fh.i iVar = new fh.i(y0Var, str, tL_buttonTypeRequestPeer, 11);
                        b6 b6Var2 = y0Var.f44077e;
                        sq.a(context, i11, user, tL_requestPeerTypeCreateBot, false, iVar, b6Var2, new oc(y0Var, b6Var2));
                        return;
                    } else if ((requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) && (i9 = tL_buttonTypeRequestPeer.max_quantity) > 1) {
                        TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) requestPeerType;
                        boolean[] zArr = new boolean[1];
                        Boolean bool = tL_requestPeerTypeUser.bot;
                        Boolean bool2 = tL_requestPeerTypeUser.premium;
                        x xVar = new x(y0Var, zArr, str, tL_buttonTypeRequestPeer);
                        bj0 bj0Var2 = bj0.f36878q0;
                        o2 R = LaunchActivity.R();
                        if (R == null) {
                            bj0Var = null;
                        } else {
                            bj0 bj0Var3 = bj0.f36878q0;
                            if (bj0Var3 != null) {
                                bj0Var = bj0Var3;
                            } else {
                                bj0 bj0Var4 = new bj0(R, i9, bool, bool2, xVar);
                                bj0Var4.show();
                                bj0.f36878q0 = bj0Var4;
                                bj0Var = bj0Var4;
                            }
                        }
                        if (bj0Var != null) {
                            bj0Var.setOnDismissListener(new fh.j(y0Var, zArr, str, 6));
                            return;
                        }
                        return;
                    } else {
                        Bundle e10 = org.telegram.messenger.l0.e(15, "onlySelect", "dialogsType", true);
                        e10.putLong("requestPeerBotId", y0Var.Q.f22527id);
                        try {
                            SerializedData serializedData = new SerializedData(tL_buttonTypeRequestPeer.peer_type.getObjectSize());
                            tL_buttonTypeRequestPeer.peer_type.serializeToStream(serializedData);
                            e10.putByteArray("requestPeerType", serializedData.toByteArray());
                            serializedData.cleanup();
                        } catch (Exception e11) {
                            FileLog.e(e11);
                        }
                        boolean[] zArr2 = new boolean[1];
                        d0 d0Var = new d0(y0Var, e10, zArr2);
                        d0Var.f37752y2 = new x(y0Var, zArr2, str, tL_buttonTypeRequestPeer);
                        o2 U = LaunchActivity.U();
                        if (U != 0) {
                            ?? obj3 = new Object();
                            obj3.f23653a = true;
                            U.showAsSheet(d0Var, obj3);
                            return;
                        }
                        return;
                    }
                } else if (tL_error != null) {
                    new oc(y0Var, b6Var).d0(tL_error, false);
                    y0Var.v("requested_chat_failed", y0.x(str, "req_id"));
                    return;
                } else {
                    new oc(y0Var, b6Var).c0("UNKNOWN_BUTTON", false);
                    y0Var.v("requested_chat_failed", y0.x(str, "req_id"));
                    return;
                }
            case 1:
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                b6 b6Var3 = y0Var.f44077e;
                if (updates != null) {
                    MessagesController.getInstance(y0Var.I).processUpdates(updates, false);
                    y0Var.v("requested_chat_sent", y0.x(str, "req_id"));
                    return;
                } else if (tL_error2 != null) {
                    new oc(y0Var, b6Var3).d0(tL_error2, false);
                    y0Var.v("requested_chat_failed", y0.x(str, "req_id"));
                    return;
                } else {
                    new oc(y0Var, b6Var3).c0("UNKNOWN_BUTTON", false);
                    y0Var.v("requested_chat_failed", y0.x(str, "req_id"));
                    return;
                }
            default:
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                b6 b6Var4 = y0Var.f44077e;
                if (updates2 != null) {
                    MessagesController.getInstance(y0Var.I).processUpdates(updates2, false);
                    y0Var.v("requested_chat_sent", y0.x(str, "req_id"));
                    return;
                } else if (tL_error3 != null) {
                    new oc(y0Var, b6Var4).d0(tL_error3, false);
                    y0Var.v("requested_chat_failed", y0.x(str, "req_id"));
                    return;
                } else {
                    new oc(y0Var, b6Var4).c0("UNKNOWN_BUTTON", false);
                    y0Var.v("requested_chat_failed", y0.x(str, "req_id"));
                    return;
                }
        }
    }
}
