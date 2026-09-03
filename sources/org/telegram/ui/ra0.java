package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class ra0 implements MessagesController.MessagesLoadedCallback {
    public final z10 f40793a;
    public final String f40794b;
    public final org.telegram.ui.ActionBar.p2 f40795c;
    public final long d;
    public final Integer f40796e;
    public final Bundle f40797f;
    public final LaunchActivity f40798g;

    public ra0(LaunchActivity launchActivity, z10 z10Var, String str, org.telegram.ui.ActionBar.p2 p2Var, long j10, Integer num, Bundle bundle) {
        this.f40798g = launchActivity;
        this.f40793a = z10Var;
        this.f40794b = str;
        this.f40795c = p2Var;
        this.d = j10;
        this.f40796e = num;
        this.f40797f = bundle;
    }

    @Override
    public final void onError() {
        LaunchActivity launchActivity = this.f40798g;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.z4.u0((org.telegram.ui.ActionBar.p2) l.d.i(1, launchActivity.f34136a0), null, LocaleController.getString(R.string.JoinToGroupErrorNotExist), null);
        }
        try {
            this.f40793a.run();
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    @Override
    public final void onMessagesLoaded(boolean z4) {
        try {
            this.f40793a.run();
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        LaunchActivity launchActivity = this.f40798g;
        if (!launchActivity.isFinishing()) {
            String str = this.f40794b;
            long j10 = this.d;
            org.telegram.ui.ActionBar.p2 p2Var = this.f40795c;
            if (str == null || !(p2Var instanceof xn) || ((xn) p2Var).a() != j10) {
                if (p2Var instanceof xn) {
                    xn xnVar = (xn) p2Var;
                    if (xnVar.a() == j10 && this.f40796e == null) {
                        AndroidUtilities.shakeViewSpring(xnVar.f43340u0, 5.0f);
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        jk jkVar = xnVar.V;
                        for (int i10 = 0; i10 < jkVar.getChildCount(); i10++) {
                            AndroidUtilities.shakeViewSpring(jkVar.getChildAt(i10), 5.0f);
                        }
                        org.telegram.ui.ActionBar.k actionBar = xnVar.getActionBar();
                        for (int i11 = 0; i11 < actionBar.getChildCount(); i11++) {
                            AndroidUtilities.shakeViewSpring(actionBar.getChildAt(i11), 5.0f);
                        }
                    }
                }
                p2Var = new xn(this.f40797f);
                ((ActionBarLayout) launchActivity.O()).P(p2Var);
            }
            AndroidUtilities.runOnUIThread(new org.telegram.messenger.di(this, this.f40794b, this.d, p2Var, 9), 150L);
        }
    }
}
