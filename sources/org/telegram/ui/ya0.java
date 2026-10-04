package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class ya0 implements MessagesController.MessagesLoadedCallback {
    public final h90 f43104a;
    public final String f43105b;
    public final org.telegram.ui.ActionBar.n2 f43106c;
    public final long d;
    public final Integer f43107e;
    public final Bundle f43108f;
    public final LaunchActivity f43109g;

    public ya0(LaunchActivity launchActivity, h90 h90Var, String str, org.telegram.ui.ActionBar.n2 n2Var, long j3, Integer num, Bundle bundle) {
        this.f43109g = launchActivity;
        this.f43104a = h90Var;
        this.f43105b = str;
        this.f43106c = n2Var;
        this.d = j3;
        this.f43107e = num;
        this.f43108f = bundle;
    }

    @Override
    public final void onError() {
        LaunchActivity launchActivity = this.f43109g;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.e5.u0((org.telegram.ui.ActionBar.n2) hg.k0.g(1, launchActivity.f33773d0), null, LocaleController.getString(R.string.JoinToGroupErrorNotExist), null);
        }
        try {
            this.f43104a.run();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        try {
            this.f43104a.run();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        LaunchActivity launchActivity = this.f43109g;
        if (!launchActivity.isFinishing()) {
            String str = this.f43105b;
            long j3 = this.d;
            org.telegram.ui.ActionBar.n2 n2Var = this.f43106c;
            if (str == null || !(n2Var instanceof yn) || ((yn) n2Var).a() != j3) {
                if (n2Var instanceof yn) {
                    yn ynVar = (yn) n2Var;
                    if (ynVar.a() == j3 && this.f43107e == null) {
                        AndroidUtilities.shakeViewSpring(ynVar.f43525v0, 5.0f);
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        jk jkVar = ynVar.W;
                        for (int i10 = 0; i10 < jkVar.getChildCount(); i10++) {
                            AndroidUtilities.shakeViewSpring(jkVar.getChildAt(i10), 5.0f);
                        }
                        org.telegram.ui.ActionBar.k actionBar = ynVar.getActionBar();
                        for (int i11 = 0; i11 < actionBar.getChildCount(); i11++) {
                            AndroidUtilities.shakeViewSpring(actionBar.getChildAt(i11), 5.0f);
                        }
                    }
                }
                n2Var = new yn(this.f43108f);
                ((ActionBarLayout) launchActivity.O()).P(n2Var);
            }
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.h31(this, this.f43105b, this.d, n2Var, 4), 150L);
        }
    }
}
