package org.telegram.ui;

import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class yf implements Utilities.Callback2 {
    public final int f44857a;
    public final int f44858b;
    public final Object f44859c;
    public final Object d;

    public yf(org.telegram.ui.ActionBar.o2 o2Var, int i10, TLObject tLObject, int i11) {
        this.f44857a = i11;
        this.f44859c = o2Var;
        this.f44858b = i10;
        this.d = tLObject;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        TLRPC.Updates updates;
        int i10 = this.f44857a;
        Object obj3 = this.d;
        Object obj4 = this.f44859c;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new bg.j3((tn) obj4, this.f44858b, (Boolean) obj, (TLRPC.WebPage) obj2, (TL_account.getWebPagePreview) obj3, 12));
                return;
            case 1:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                x60 x60Var = (x60) obj3;
                TLRPC.ChatInviteJoinResult chatInviteJoinResult = (TLRPC.ChatInviteJoinResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                Pattern pattern = LaunchActivity.f35560x1;
                if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
                    TLRPC.Updates updates2 = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
                    MessagesController.getInstance(launchActivity.K).processUpdates(updates2, false);
                    updates = updates2;
                } else {
                    if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                        AndroidUtilities.runOnUIThread(new x60(6, launchActivity, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult));
                    }
                    updates = null;
                }
                AndroidUtilities.runOnUIThread(new bg.j3(launchActivity, x60Var, tL_error, updates, this.f44858b, 22));
                return;
            default:
                PasskeysActivity passkeysActivity = (PasskeysActivity) obj4;
                TL_account.Passkey passkey = (TL_account.Passkey) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                ArrayList arrayList = passkeysActivity.f35644b;
                boolean z10 = ((TLRPC.Bool) obj) instanceof TLRPC.TL_boolFalse;
                int i11 = this.f44858b;
                if (z10) {
                    org.telegram.ui.Components.tc.a0(passkeysActivity).c0("FALSE", false);
                    arrayList.add(Utilities.clamp(i11, arrayList.size(), 0), passkey);
                    passkeysActivity.f35643a.U2.N(true);
                    return;
                } else if (tL_error2 != null) {
                    org.telegram.ui.Components.tc.a0(passkeysActivity).d0(tL_error2, false);
                    arrayList.add(Utilities.clamp(i11, arrayList.size(), 0), passkey);
                    passkeysActivity.f35643a.U2.N(true);
                    return;
                } else {
                    return;
                }
        }
    }

    public yf(LaunchActivity launchActivity, x60 x60Var, int i10) {
        this.f44857a = 1;
        this.f44859c = launchActivity;
        this.d = x60Var;
        this.f44858b = i10;
    }
}
