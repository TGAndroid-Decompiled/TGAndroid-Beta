package org.telegram.ui;

import android.os.Bundle;
import android.text.TextUtils;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class xk0 implements Utilities.Callback2 {
    public final int f39940a;
    public final Serializable f39941b;
    public final Object f39942c;
    public final Object d;
    public final Object e;

    public xk0(Object obj, Object obj2, Serializable serializable, Object obj3, int i10) {
        this.f39940a = i10;
        this.f39942c = obj;
        this.d = obj2;
        this.f39941b = serializable;
        this.e = obj3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        CharSequence replaceSingleLinkBold;
        int i10 = this.f39940a;
        Object obj3 = this.e;
        Serializable serializable = this.f39941b;
        Object obj4 = this.d;
        Object obj5 = this.f39942c;
        switch (i10) {
            case 0:
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) obj4;
                String str = (String) serializable;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                ((org.telegram.ui.ActionBar.a2) obj5).dismiss();
                if (((TLRPC.Bool) obj) instanceof TLRPC.TL_boolTrue) {
                    cl0.f32743a = e3Var;
                    e3Var.show();
                    return;
                }
                org.telegram.ui.ActionBar.e3 e3Var2 = cl0.f32743a;
                if (e3Var2 != null) {
                    e3Var2.dismiss();
                    cl0.f32743a = null;
                }
                org.telegram.ui.Components.xc a2 = cl0.a();
                int i11 = R.raw.error;
                String string = LocaleController.getString(R.string.BotAuthLoggedInFailTitle);
                if (TextUtils.isEmpty(str)) {
                    replaceSingleLinkBold = LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain);
                } else {
                    replaceSingleLinkBold = AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.BotAuthLoggedInFail, str), org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Gi, d6Var));
                }
                a2.M(string, replaceSingleLinkBold, i11).j();
                return;
            case 1:
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) obj5;
                ai.da daVar = (ai.da) obj4;
                String str2 = (String) serializable;
                TLRPC.User user = (TLRPC.User) obj3;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                org.telegram.ui.ActionBar.d6 d6Var2 = b1Var.e;
                if (updates != null) {
                    MessagesController.getInstance(b1Var.M).processUpdates(updates, false);
                    b1Var.y(daVar, "requested_chat_sent", org.telegram.ui.web.b1.B(str2, "req_id"));
                    long j3 = b1Var.U.f18482id;
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f18482id);
                    org.telegram.ui.web.e0 e0Var = new org.telegram.ui.web.e0(b1Var, bundle, user, j3);
                    org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                    if (U != null) {
                        U.presentFragment(e0Var);
                    }
                    org.telegram.ui.web.g0 g0Var = b1Var.f39000c;
                    if (g0Var != null) {
                        g0Var.b();
                        return;
                    }
                    return;
                } else if (tL_error2 != null) {
                    new org.telegram.ui.Components.xc(b1Var, d6Var2).d0(tL_error2, false);
                    b1Var.y(daVar, "requested_chat_failed", org.telegram.ui.web.b1.B(str2, "req_id"));
                    return;
                } else {
                    new org.telegram.ui.Components.xc(b1Var, d6Var2).c0("UNKNOWN_BUTTON", false);
                    b1Var.y(daVar, "requested_chat_failed", org.telegram.ui.web.b1.B(str2, "req_id"));
                    return;
                }
            default:
                yh.x3.c0((yh.x3) obj5, (Utilities.Callback2) obj4, (ArrayList) serializable, (Runnable) obj3, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
