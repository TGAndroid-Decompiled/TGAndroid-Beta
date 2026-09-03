package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class sa0 implements MessagesController.MessagesLoadedCallback {
    public final w10 f38138a;
    public final String f38139b;
    public final org.telegram.ui.ActionBar.p2 f38140c;
    public final long d;
    public final Integer e;
    public final Bundle f38141f;
    public final LaunchActivity f38142g;

    public sa0(LaunchActivity launchActivity, w10 w10Var, String str, org.telegram.ui.ActionBar.p2 p2Var, long j10, Integer num, Bundle bundle) {
        this.f38142g = launchActivity;
        this.f38138a = w10Var;
        this.f38139b = str;
        this.f38140c = p2Var;
        this.d = j10;
        this.e = num;
        this.f38141f = bundle;
    }

    @Override
    public final void onError() {
        LaunchActivity launchActivity = this.f38142g;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.z4.u0((org.telegram.ui.ActionBar.p2) kf.k0.i(1, launchActivity.f31588a0), null, LocaleController.getString(R.string.JoinToGroupErrorNotExist), null);
        }
        try {
            this.f38138a.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void onMessagesLoaded(boolean z4) {
        try {
            this.f38138a.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
        LaunchActivity launchActivity = this.f38142g;
        if (!launchActivity.isFinishing()) {
            String str = this.f38139b;
            long j10 = this.d;
            org.telegram.ui.ActionBar.p2 p2Var = this.f38140c;
            if (str == null || !(p2Var instanceof zn) || ((zn) p2Var).a() != j10) {
                if (p2Var instanceof zn) {
                    zn znVar = (zn) p2Var;
                    if (znVar.a() == j10 && this.e == null) {
                        AndroidUtilities.shakeViewSpring(znVar.f40759u0, 5.0f);
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        lk lkVar = znVar.V;
                        for (int i10 = 0; i10 < lkVar.getChildCount(); i10++) {
                            AndroidUtilities.shakeViewSpring(lkVar.getChildAt(i10), 5.0f);
                        }
                        org.telegram.ui.ActionBar.k actionBar = znVar.getActionBar();
                        for (int i11 = 0; i11 < actionBar.getChildCount(); i11++) {
                            AndroidUtilities.shakeViewSpring(actionBar.getChildAt(i11), 5.0f);
                        }
                    }
                }
                p2Var = new zn(this.f38141f);
                ((ActionBarLayout) launchActivity.O()).P(p2Var);
            }
            AndroidUtilities.runOnUIThread(new org.telegram.messenger.di(this, this.f38139b, this.d, p2Var, 9), 150L);
        }
    }
}
