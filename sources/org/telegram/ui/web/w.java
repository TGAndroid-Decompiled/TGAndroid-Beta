package org.telegram.ui.web;

import android.content.Context;
import android.os.Bundle;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.y3;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.ar;
import org.telegram.ui.Components.qc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.hj0;
public final class w implements Utilities.Callback2 {
    public final int f39679a;
    public final a1 f39680b;
    public final String f39681c;

    public w(a1 a1Var, String str, int i10) {
        this.f39679a = i10;
        this.f39680b = a1Var;
        this.f39681c = str;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10;
        hj0 hj0Var;
        int i11 = this.f39679a;
        String str = this.f39681c;
        a1 a1Var = this.f39680b;
        switch (i11) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                f6 f6Var = a1Var.e;
                TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) mf.c.a((TL_keyboard.KeyboardButton) obj, TL_keyboard.TL_buttonTypeRequestPeer.class);
                if (tL_buttonTypeRequestPeer != null) {
                    TLRPC.RequestPeerType requestPeerType = tL_buttonTypeRequestPeer.peer_type;
                    if (requestPeerType instanceof TLRPC.TL_requestPeerTypeCreateBot) {
                        TLRPC.TL_requestPeerTypeCreateBot tL_requestPeerTypeCreateBot = (TLRPC.TL_requestPeerTypeCreateBot) requestPeerType;
                        Context context = a1Var.getContext();
                        int i12 = a1Var.J;
                        TLRPC.User user = a1Var.R;
                        kh.h hVar = new kh.h(a1Var, str, tL_buttonTypeRequestPeer, 11);
                        f6 f6Var2 = a1Var.e;
                        ar.a(context, i12, user, tL_requestPeerTypeCreateBot, false, hVar, f6Var2, new qc(a1Var, f6Var2));
                        return;
                    } else if ((requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) && (i10 = tL_buttonTypeRequestPeer.max_quantity) > 1) {
                        TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) requestPeerType;
                        boolean[] zArr = new boolean[1];
                        Boolean bool = tL_requestPeerTypeUser.bot;
                        Boolean bool2 = tL_requestPeerTypeUser.premium;
                        y yVar = new y(a1Var, zArr, str, tL_buttonTypeRequestPeer);
                        hj0 hj0Var2 = hj0.f34890r0;
                        p2 R = LaunchActivity.R();
                        if (R == null) {
                            hj0Var = null;
                        } else {
                            hj0 hj0Var3 = hj0.f34890r0;
                            if (hj0Var3 != null) {
                                hj0Var = hj0Var3;
                            } else {
                                hj0 hj0Var4 = new hj0(R, i10, bool, bool2, yVar);
                                hj0Var4.show();
                                hj0.f34890r0 = hj0Var4;
                                hj0Var = hj0Var4;
                            }
                        }
                        if (hj0Var != null) {
                            hj0Var.setOnDismissListener(new kh.i(a1Var, zArr, str, 4));
                            return;
                        }
                        return;
                    } else {
                        Bundle e = y3.e(15, "onlySelect", "dialogsType", true);
                        e.putLong("requestPeerBotId", a1Var.R.f19331id);
                        try {
                            SerializedData serializedData = new SerializedData(tL_buttonTypeRequestPeer.peer_type.getObjectSize());
                            tL_buttonTypeRequestPeer.peer_type.serializeToStream(serializedData);
                            e.putByteArray("requestPeerType", serializedData.toByteArray());
                            serializedData.cleanup();
                        } catch (Exception e6) {
                            FileLog.e(e6);
                        }
                        boolean[] zArr2 = new boolean[1];
                        d0 d0Var = new d0(a1Var, e, zArr2);
                        d0Var.f37131z2 = new y(a1Var, zArr2, str, tL_buttonTypeRequestPeer);
                        p2 U = LaunchActivity.U();
                        if (U != 0) {
                            ?? obj3 = new Object();
                            obj3.f20478a = true;
                            U.showAsSheet(d0Var, obj3);
                            return;
                        }
                        return;
                    }
                } else if (tL_error != null) {
                    new qc(a1Var, f6Var).d0(tL_error, false);
                    a1Var.v("requested_chat_failed", a1.x(str, "req_id"));
                    return;
                } else {
                    new qc(a1Var, f6Var).c0("UNKNOWN_BUTTON", false);
                    a1Var.v("requested_chat_failed", a1.x(str, "req_id"));
                    return;
                }
            case 1:
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                f6 f6Var3 = a1Var.e;
                if (updates != null) {
                    MessagesController.getInstance(a1Var.J).processUpdates(updates, false);
                    a1Var.v("requested_chat_sent", a1.x(str, "req_id"));
                    return;
                } else if (tL_error2 != null) {
                    new qc(a1Var, f6Var3).d0(tL_error2, false);
                    a1Var.v("requested_chat_failed", a1.x(str, "req_id"));
                    return;
                } else {
                    new qc(a1Var, f6Var3).c0("UNKNOWN_BUTTON", false);
                    a1Var.v("requested_chat_failed", a1.x(str, "req_id"));
                    return;
                }
            default:
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                f6 f6Var4 = a1Var.e;
                if (updates2 != null) {
                    MessagesController.getInstance(a1Var.J).processUpdates(updates2, false);
                    a1Var.v("requested_chat_sent", a1.x(str, "req_id"));
                    return;
                } else if (tL_error3 != null) {
                    new qc(a1Var, f6Var4).d0(tL_error3, false);
                    a1Var.v("requested_chat_failed", a1.x(str, "req_id"));
                    return;
                } else {
                    new qc(a1Var, f6Var4).c0("UNKNOWN_BUTTON", false);
                    a1Var.v("requested_chat_failed", a1.x(str, "req_id"));
                    return;
                }
        }
    }
}
