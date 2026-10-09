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
    public final m70 f44299a;
    public final String f44300b;
    public final org.telegram.ui.ActionBar.n2 f44301c;
    public final long d;
    public final Integer f44302e;
    public final Bundle f44303f;
    public final LaunchActivity f44304g;

    public ya0(LaunchActivity launchActivity, m70 m70Var, String str, org.telegram.ui.ActionBar.n2 n2Var, long j3, Integer num, Bundle bundle) {
        this.f44304g = launchActivity;
        this.f44299a = m70Var;
        this.f44300b = str;
        this.f44301c = n2Var;
        this.d = j3;
        this.f44302e = num;
        this.f44303f = bundle;
    }

    @Override
    public final void onError() {
        LaunchActivity launchActivity = this.f44304g;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.g5.t0((org.telegram.ui.ActionBar.n2) hg.c.g(1, launchActivity.f33783d0), null, LocaleController.getString(R.string.JoinToGroupErrorNotExist), null);
        }
        try {
            this.f44299a.run();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        try {
            this.f44299a.run();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        LaunchActivity launchActivity = this.f44304g;
        if (!launchActivity.isFinishing()) {
            String str = this.f44300b;
            long j3 = this.d;
            org.telegram.ui.ActionBar.n2 n2Var = this.f44301c;
            if (str == null || !(n2Var instanceof zn) || ((zn) n2Var).a() != j3) {
                if (n2Var instanceof zn) {
                    zn znVar = (zn) n2Var;
                    if (znVar.a() == j3 && this.f44302e == null) {
                        AndroidUtilities.shakeViewSpring(znVar.f44990x0, 5.0f);
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
                n2Var = new zn(this.f44303f);
                ((ActionBarLayout) launchActivity.O()).P(n2Var);
            }
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.o31(this, this.f44300b, this.d, n2Var, 4), 150L);
        }
    }
}
