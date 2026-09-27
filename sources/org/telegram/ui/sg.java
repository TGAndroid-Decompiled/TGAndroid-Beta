package org.telegram.ui;

import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class sg implements Utilities.Callback2 {
    public final int f37445a;
    public final int f37446b;
    public final Object f37447c;
    public final Object d;

    public sg(org.telegram.ui.ActionBar.o2 o2Var, int i10, TLObject tLObject, int i11) {
        this.f37445a = i11;
        this.f37447c = o2Var;
        this.f37446b = i10;
        this.d = tLObject;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        TLRPC.Updates updates;
        int i10 = this.f37445a;
        Object obj3 = this.d;
        Object obj4 = this.f37447c;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new ei.l3((xn) obj4, this.f37446b, (Boolean) obj, (TLRPC.WebPage) obj2, (TL_account.getWebPagePreview) obj3, 16));
                return;
            case 1:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                ea0 ea0Var = (ea0) obj3;
                TLRPC.ChatInviteJoinResult chatInviteJoinResult = (TLRPC.ChatInviteJoinResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                Pattern pattern = LaunchActivity.B1;
                if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
                    TLRPC.Updates updates2 = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
                    MessagesController.getInstance(launchActivity.O).processUpdates(updates2, false);
                    updates = updates2;
                } else {
                    if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                        AndroidUtilities.runOnUIThread(new tv(28, launchActivity, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult));
                    }
                    updates = null;
                }
                AndroidUtilities.runOnUIThread(new ei.l3(launchActivity, ea0Var, tL_error, updates, this.f37446b, 26));
                return;
            default:
                PasskeysActivity passkeysActivity = (PasskeysActivity) obj4;
                TL_account.Passkey passkey = (TL_account.Passkey) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                ArrayList arrayList = passkeysActivity.f31183b;
                boolean z10 = ((TLRPC.Bool) obj) instanceof TLRPC.TL_boolFalse;
                int i11 = this.f37446b;
                if (z10) {
                    org.telegram.ui.Components.xc.a0(passkeysActivity).c0("FALSE", false);
                    arrayList.add(Utilities.clamp(i11, arrayList.size(), 0), passkey);
                    passkeysActivity.f31182a.Y2.N(true);
                    return;
                } else if (tL_error2 != null) {
                    org.telegram.ui.Components.xc.a0(passkeysActivity).d0(tL_error2, false);
                    arrayList.add(Utilities.clamp(i11, arrayList.size(), 0), passkey);
                    passkeysActivity.f31182a.Y2.N(true);
                    return;
                } else {
                    return;
                }
        }
    }

    public sg(LaunchActivity launchActivity, ea0 ea0Var, int i10) {
        this.f37445a = 1;
        this.f37447c = launchActivity;
        this.d = ea0Var;
        this.f37446b = i10;
    }
}
