package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class za0 implements MessagesController.MessagesLoadedCallback {
    public final q70 f44686a;
    public final String f44687b;
    public final org.telegram.ui.ActionBar.m2 f44688c;
    public final long d;
    public final Integer f44689e;
    public final Bundle f44690f;
    public final LaunchActivity f44691g;

    public za0(LaunchActivity launchActivity, q70 q70Var, String str, org.telegram.ui.ActionBar.m2 m2Var, long j3, Integer num, Bundle bundle) {
        this.f44691g = launchActivity;
        this.f44686a = q70Var;
        this.f44687b = str;
        this.f44688c = m2Var;
        this.d = j3;
        this.f44689e = num;
        this.f44690f = bundle;
    }

    @Override
    public final void onError() {
        LaunchActivity launchActivity = this.f44691g;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.g5.t0((org.telegram.ui.ActionBar.m2) hg.c.h(1, launchActivity.f33622d0), null, LocaleController.getString(R.string.JoinToGroupErrorNotExist), null);
        }
        try {
            this.f44686a.run();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        try {
            this.f44686a.run();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        LaunchActivity launchActivity = this.f44691g;
        if (!launchActivity.isFinishing()) {
            String str = this.f44687b;
            long j3 = this.d;
            org.telegram.ui.ActionBar.m2 m2Var = this.f44688c;
            if (str == null || !(m2Var instanceof eo) || ((eo) m2Var).a() != j3) {
                if (m2Var instanceof eo) {
                    eo eoVar = (eo) m2Var;
                    if (eoVar.a() == j3 && this.f44689e == null) {
                        AndroidUtilities.shakeViewSpring(eoVar.f37483x0, 5.0f);
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        sk skVar = eoVar.Y;
                        for (int i10 = 0; i10 < skVar.getChildCount(); i10++) {
                            AndroidUtilities.shakeViewSpring(skVar.getChildAt(i10), 5.0f);
                        }
                        org.telegram.ui.ActionBar.k actionBar = eoVar.getActionBar();
                        for (int i11 = 0; i11 < actionBar.getChildCount(); i11++) {
                            AndroidUtilities.shakeViewSpring(actionBar.getChildAt(i11), 5.0f);
                        }
                    }
                }
                m2Var = new eo(this.f44690f);
                ((ActionBarLayout) launchActivity.O()).P(m2Var);
            }
            AndroidUtilities.runOnUIThread(new ai.r8(this, this.f44687b, this.d, m2Var, 14), 150L);
        }
    }
}
