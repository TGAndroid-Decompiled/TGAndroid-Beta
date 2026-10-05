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
    public final h90 f43173a;
    public final String f43174b;
    public final org.telegram.ui.ActionBar.n2 f43175c;
    public final long d;
    public final Integer f43176e;
    public final Bundle f43177f;
    public final LaunchActivity f43178g;

    public ya0(LaunchActivity launchActivity, h90 h90Var, String str, org.telegram.ui.ActionBar.n2 n2Var, long j3, Integer num, Bundle bundle) {
        this.f43178g = launchActivity;
        this.f43173a = h90Var;
        this.f43174b = str;
        this.f43175c = n2Var;
        this.d = j3;
        this.f43176e = num;
        this.f43177f = bundle;
    }

    @Override
    public final void onError() {
        LaunchActivity launchActivity = this.f43178g;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.e5.u0((org.telegram.ui.ActionBar.n2) hg.c.g(1, launchActivity.f33793d0), null, LocaleController.getString(R.string.JoinToGroupErrorNotExist), null);
        }
        try {
            this.f43173a.run();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        try {
            this.f43173a.run();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        LaunchActivity launchActivity = this.f43178g;
        if (!launchActivity.isFinishing()) {
            String str = this.f43174b;
            long j3 = this.d;
            org.telegram.ui.ActionBar.n2 n2Var = this.f43175c;
            if (str == null || !(n2Var instanceof yn) || ((yn) n2Var).a() != j3) {
                if (n2Var instanceof yn) {
                    yn ynVar = (yn) n2Var;
                    if (ynVar.a() == j3 && this.f43176e == null) {
                        AndroidUtilities.shakeViewSpring(ynVar.f43526v0, 5.0f);
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
                n2Var = new yn(this.f43177f);
                ((ActionBarLayout) launchActivity.O()).P(n2Var);
            }
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i31(this, this.f43174b, this.d, n2Var, 4), 150L);
        }
    }
}
