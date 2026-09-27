package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class xa0 implements MessagesController.MessagesLoadedCallback {
    public final ea0 f39590a;
    public final String f39591b;
    public final org.telegram.ui.ActionBar.o2 f39592c;
    public final long d;
    public final Integer e;
    public final Bundle f39593f;
    public final LaunchActivity f39594g;

    public xa0(LaunchActivity launchActivity, ea0 ea0Var, String str, org.telegram.ui.ActionBar.o2 o2Var, long j3, Integer num, Bundle bundle) {
        this.f39594g = launchActivity;
        this.f39590a = ea0Var;
        this.f39591b = str;
        this.f39592c = o2Var;
        this.d = j3;
        this.e = num;
        this.f39593f = bundle;
    }

    @Override
    public final void onError() {
        LaunchActivity launchActivity = this.f39594g;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.e5.u0((org.telegram.ui.ActionBar.o2) hg.k0.g(1, launchActivity.f31108d0), null, LocaleController.getString(R.string.JoinToGroupErrorNotExist), null);
        }
        try {
            this.f39590a.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        try {
            this.f39590a.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
        LaunchActivity launchActivity = this.f39594g;
        if (!launchActivity.isFinishing()) {
            String str = this.f39591b;
            long j3 = this.d;
            org.telegram.ui.ActionBar.o2 o2Var = this.f39592c;
            if (str == null || !(o2Var instanceof xn) || ((xn) o2Var).a() != j3) {
                if (o2Var instanceof xn) {
                    xn xnVar = (xn) o2Var;
                    if (xnVar.a() == j3 && this.e == null) {
                        AndroidUtilities.shakeViewSpring(xnVar.f39977x0, 5.0f);
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        lk lkVar = xnVar.Y;
                        for (int i10 = 0; i10 < lkVar.getChildCount(); i10++) {
                            AndroidUtilities.shakeViewSpring(lkVar.getChildAt(i10), 5.0f);
                        }
                        org.telegram.ui.ActionBar.l actionBar = xnVar.getActionBar();
                        for (int i11 = 0; i11 < actionBar.getChildCount(); i11++) {
                            AndroidUtilities.shakeViewSpring(actionBar.getChildAt(i11), 5.0f);
                        }
                    }
                }
                o2Var = new xn(this.f39593f);
                ((ActionBarLayout) launchActivity.O()).P(o2Var);
            }
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.y21(this, this.f39591b, this.d, o2Var, 4), 150L);
        }
    }
}
