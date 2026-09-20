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
    public final int f37396a;
    public final int f37397b;
    public final Object f37398c;
    public final Object d;

    public sg(org.telegram.ui.ActionBar.n2 n2Var, int i10, TLObject tLObject, int i11) {
        this.f37396a = i11;
        this.f37398c = n2Var;
        this.f37397b = i10;
        this.d = tLObject;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        TLRPC.Updates updates;
        int i10 = this.f37396a;
        Object obj3 = this.d;
        Object obj4 = this.f37398c;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new ei.l3((zn) obj4, this.f37397b, (Boolean) obj, (TLRPC.WebPage) obj2, (TL_account.getWebPagePreview) obj3, 16));
                return;
            case 1:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                r80 r80Var = (r80) obj3;
                TLRPC.ChatInviteJoinResult chatInviteJoinResult = (TLRPC.ChatInviteJoinResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                Pattern pattern = LaunchActivity.B1;
                if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
                    TLRPC.Updates updates2 = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
                    MessagesController.getInstance(launchActivity.O).processUpdates(updates2, false);
                    updates = updates2;
                } else {
                    if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                        AndroidUtilities.runOnUIThread(new r80(3, launchActivity, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult));
                    }
                    updates = null;
                }
                AndroidUtilities.runOnUIThread(new ei.l3(launchActivity, r80Var, tL_error, updates, this.f37397b, 26));
                return;
            default:
                PasskeysActivity passkeysActivity = (PasskeysActivity) obj4;
                TL_account.Passkey passkey = (TL_account.Passkey) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                ArrayList arrayList = passkeysActivity.f31179b;
                boolean z10 = ((TLRPC.Bool) obj) instanceof TLRPC.TL_boolFalse;
                int i11 = this.f37397b;
                if (z10) {
                    org.telegram.ui.Components.xc.a0(passkeysActivity).c0("FALSE", false);
                    arrayList.add(Utilities.clamp(i11, arrayList.size(), 0), passkey);
                    passkeysActivity.f31178a.Y2.N(true);
                    return;
                } else if (tL_error2 != null) {
                    org.telegram.ui.Components.xc.a0(passkeysActivity).d0(tL_error2, false);
                    arrayList.add(Utilities.clamp(i11, arrayList.size(), 0), passkey);
                    passkeysActivity.f31178a.Y2.N(true);
                    return;
                } else {
                    return;
                }
        }
    }

    public sg(LaunchActivity launchActivity, r80 r80Var, int i10) {
        this.f37396a = 1;
        this.f37398c = launchActivity;
        this.d = r80Var;
        this.f37397b = i10;
    }
}
