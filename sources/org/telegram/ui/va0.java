package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class va0 implements MessagesController.MessagesLoadedCallback {
    public final ia0 f38336a;
    public final String f38337b;
    public final org.telegram.ui.ActionBar.n2 f38338c;
    public final long d;
    public final Integer e;
    public final Bundle f38339f;
    public final LaunchActivity f38340g;

    public va0(LaunchActivity launchActivity, ia0 ia0Var, String str, org.telegram.ui.ActionBar.n2 n2Var, long j3, Integer num, Bundle bundle) {
        this.f38340g = launchActivity;
        this.f38336a = ia0Var;
        this.f38337b = str;
        this.f38338c = n2Var;
        this.d = j3;
        this.e = num;
        this.f38339f = bundle;
    }

    @Override
    public final void onError() {
        LaunchActivity launchActivity = this.f38340g;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.e5.u0((org.telegram.ui.ActionBar.n2) hg.c.h(1, launchActivity.f30791d0), null, LocaleController.getString(R.string.JoinToGroupErrorNotExist), null);
        }
        try {
            this.f38336a.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        try {
            this.f38336a.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
        LaunchActivity launchActivity = this.f38340g;
        if (!launchActivity.isFinishing()) {
            String str = this.f38337b;
            long j3 = this.d;
            org.telegram.ui.ActionBar.n2 n2Var = this.f38338c;
            if (str == null || !(n2Var instanceof xn) || ((xn) n2Var).a() != j3) {
                if (n2Var instanceof xn) {
                    xn xnVar = (xn) n2Var;
                    if (xnVar.a() == j3 && this.e == null) {
                        AndroidUtilities.shakeViewSpring(xnVar.f39596x0, 5.0f);
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        jk jkVar = xnVar.Y;
                        for (int i10 = 0; i10 < jkVar.getChildCount(); i10++) {
                            AndroidUtilities.shakeViewSpring(jkVar.getChildAt(i10), 5.0f);
                        }
                        org.telegram.ui.ActionBar.k actionBar = xnVar.getActionBar();
                        for (int i11 = 0; i11 < actionBar.getChildCount(); i11++) {
                            AndroidUtilities.shakeViewSpring(actionBar.getChildAt(i11), 5.0f);
                        }
                    }
                }
                n2Var = new xn(this.f38339f);
                ((ActionBarLayout) launchActivity.O()).P(n2Var);
            }
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i21(this, this.f38337b, this.d, n2Var, 4), 150L);
        }
    }
}
