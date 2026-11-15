package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class y70 implements RequestDelegate {
    public final int f53466a;
    public final LaunchActivity f53467b;

    public y70(LaunchActivity launchActivity, int i7) {
        this.f53466a = i7;
        this.f53467b = launchActivity;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.f53466a;
        LaunchActivity launchActivity = this.f53467b;
        switch (i7) {
            case 0:
                String str = LaunchActivity.C1;
                if (tLObject != null) {
                    org.telegram.messenger.g0.h3(new g50(9, launchActivity, (TL_account.Password) tLObject));
                    return;
                }
                return;
            default:
                String str2 = LaunchActivity.C1;
                org.telegram.messenger.g0.h3(new g50(5, launchActivity, tLObject));
                return;
        }
    }
}
