package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class ua0 implements MessagesController.MessagesLoadedCallback {
    public final n80 f38381a;
    public final String f38382b;
    public final org.telegram.ui.ActionBar.m2 f38383c;
    public final long d;
    public final Integer e;
    public final Bundle f38384f;
    public final LaunchActivity f38385g;

    public ua0(LaunchActivity launchActivity, n80 n80Var, String str, org.telegram.ui.ActionBar.m2 m2Var, long j3, Integer num, Bundle bundle) {
        this.f38385g = launchActivity;
        this.f38381a = n80Var;
        this.f38382b = str;
        this.f38383c = m2Var;
        this.d = j3;
        this.e = num;
        this.f38384f = bundle;
    }

    @Override
    public final void onError() {
        LaunchActivity launchActivity = this.f38385g;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.e5.u0((org.telegram.ui.ActionBar.m2) hg.c.g(1, launchActivity.f31107d0), null, LocaleController.getString(R.string.JoinToGroupErrorNotExist), null);
        }
        try {
            this.f38381a.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        try {
            this.f38381a.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
        LaunchActivity launchActivity = this.f38385g;
        if (!launchActivity.isFinishing()) {
            String str = this.f38382b;
            long j3 = this.d;
            org.telegram.ui.ActionBar.m2 m2Var = this.f38383c;
            if (str == null || !(m2Var instanceof wn) || ((wn) m2Var).a() != j3) {
                if (m2Var instanceof wn) {
                    wn wnVar = (wn) m2Var;
                    if (wnVar.a() == j3 && this.e == null) {
                        AndroidUtilities.shakeViewSpring(wnVar.f39696x0, 5.0f);
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        jk jkVar = wnVar.Y;
                        for (int i10 = 0; i10 < jkVar.getChildCount(); i10++) {
                            AndroidUtilities.shakeViewSpring(jkVar.getChildAt(i10), 5.0f);
                        }
                        org.telegram.ui.ActionBar.k actionBar = wnVar.getActionBar();
                        for (int i11 = 0; i11 < actionBar.getChildCount(); i11++) {
                            AndroidUtilities.shakeViewSpring(actionBar.getChildAt(i11), 5.0f);
                        }
                    }
                }
                m2Var = new wn(this.f38384f);
                ((ActionBarLayout) launchActivity.O()).P(m2Var);
            }
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.w21(this, this.f38382b, this.d, m2Var, 4), 150L);
        }
    }
}
