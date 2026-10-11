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
    public final n70 f44025a;
    public final String f44026b;
    public final org.telegram.ui.ActionBar.m2 f44027c;
    public final long d;
    public final Integer f44028e;
    public final Bundle f44029f;
    public final LaunchActivity f44030g;

    public xa0(LaunchActivity launchActivity, n70 n70Var, String str, org.telegram.ui.ActionBar.m2 m2Var, long j3, Integer num, Bundle bundle) {
        this.f44030g = launchActivity;
        this.f44025a = n70Var;
        this.f44026b = str;
        this.f44027c = m2Var;
        this.d = j3;
        this.f44028e = num;
        this.f44029f = bundle;
    }

    @Override
    public final void onError() {
        LaunchActivity launchActivity = this.f44030g;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.g5.t0((org.telegram.ui.ActionBar.m2) hg.c.g(1, launchActivity.f33811d0), null, LocaleController.getString(R.string.JoinToGroupErrorNotExist), null);
        }
        try {
            this.f44025a.run();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        try {
            this.f44025a.run();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        LaunchActivity launchActivity = this.f44030g;
        if (!launchActivity.isFinishing()) {
            String str = this.f44026b;
            long j3 = this.d;
            org.telegram.ui.ActionBar.m2 m2Var = this.f44027c;
            if (str == null || !(m2Var instanceof zn) || ((zn) m2Var).a() != j3) {
                if (m2Var instanceof zn) {
                    zn znVar = (zn) m2Var;
                    if (znVar.a() == j3 && this.f44028e == null) {
                        AndroidUtilities.shakeViewSpring(znVar.f44989x0, 5.0f);
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        ok okVar = znVar.Y;
                        for (int i10 = 0; i10 < okVar.getChildCount(); i10++) {
                            AndroidUtilities.shakeViewSpring(okVar.getChildAt(i10), 5.0f);
                        }
                        org.telegram.ui.ActionBar.k actionBar = znVar.getActionBar();
                        for (int i11 = 0; i11 < actionBar.getChildCount(); i11++) {
                            AndroidUtilities.shakeViewSpring(actionBar.getChildAt(i11), 5.0f);
                        }
                    }
                }
                m2Var = new zn(this.f44029f);
                ((ActionBarLayout) launchActivity.O()).P(m2Var);
            }
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.q31(this, this.f44026b, this.d, m2Var, 4), 150L);
        }
    }
}
