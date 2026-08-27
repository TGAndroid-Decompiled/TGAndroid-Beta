package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.ui.ActionBar.ActionBarLayout;

public final class ra0 implements OnBackAnimationCallback {

    public boolean f41882b;

    public boolean f41884e;

    public final LaunchActivity f41885f;

    public final AnimationNotificationsLocker f41881a = new AnimationNotificationsLocker();

    public boolean f41883c = false;
    public boolean d = false;

    public ra0(LaunchActivity launchActivity) {
        this.f41885f = launchActivity;
    }

    @Override
    public final void onBackCancelled() {
        ActionBarLayout actionBarLayout;
        this.f41883c = false;
        this.d = false;
        if (this.f41882b) {
            this.f41881a.unlock();
            this.f41882b = false;
        }
        if (AndroidUtilities.isTablet() || (actionBarLayout = this.f41885f.m0) == null || !actionBarLayout.Y0) {
            return;
        }
        actionBarLayout.Y0 = false;
        actionBarLayout.e(true);
    }

    @Override
    public final void onBackInvoked() {
        this.d = true;
        if (this.f41882b) {
            this.f41881a.unlock();
            this.f41882b = false;
        }
        if (AndroidUtilities.isTablet()) {
            this.f41885f.onBackPressed();
            return;
        }
        if (this.f41885f.c0(true)) {
            LaunchActivity launchActivity = this.f41885f;
            ActionBarLayout actionBarLayout = launchActivity.m0;
            if (actionBarLayout == null) {
                launchActivity.onBackPressed();
            } else if (!actionBarLayout.Y0) {
                actionBarLayout.G();
            } else {
                actionBarLayout.Y0 = false;
                actionBarLayout.e(false);
            }
        }
    }

    @Override
    public final void onBackProgressed(BackEvent backEvent) {
        ActionBarLayout actionBarLayout;
        ActionBarLayout actionBarLayout2;
        org.telegram.ui.ActionBar.r rVar;
        org.telegram.ui.ActionBar.n2 n2Var;
        boolean z10;
        if (this.f41883c && this.d) {
            return;
        }
        float progress = backEvent.getProgress();
        if (!this.f41884e && progress > 0.015f) {
            this.f41884e = true;
            if (!AndroidUtilities.isTablet() && this.f41885f.c0(false) && (actionBarLayout2 = this.f41885f.m0) != null) {
                float touchX = backEvent.getTouchX();
                float touchY = backEvent.getTouchY();
                Activity activity = actionBarLayout2.G0;
                if (actionBarLayout2.P) {
                    AnimatorSet animatorSet = actionBarLayout2.f22654d1;
                    if (animatorSet != null) {
                        animatorSet.end();
                        actionBarLayout2.f22654d1 = null;
                        if (!actionBarLayout2.P) {
                            if (!actionBarLayout2.Z0) {
                                n2Var = (org.telegram.ui.ActionBar.n2) i0.a.j(1, actionBarLayout2.K0);
                                if (n2Var.onBackPressed(false)) {
                                    actionBarLayout2.f22646a1 = false;
                                    actionBarLayout2.Z0 = true;
                                    actionBarLayout2.Y0 = true;
                                    if (touchX < AndroidUtilities.displaySize.x / 2.0f) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    actionBarLayout2.f22652c1 = z10;
                                    actionBarLayout2.f22649b1 = touchY;
                                    actionBarLayout2.O();
                                    if (activity != null) {
                                        AndroidUtilities.hideKeyboard(activity.getCurrentFocus());
                                    }
                                    n2Var.onBeginSlide();
                                    if (!this.f41882b) {
                                        this.f41881a.lock();
                                        this.f41882b = true;
                                    }
                                }
                            }
                        }
                    }
                } else if (!actionBarLayout2.Z0 && !actionBarLayout2.Y0 && !actionBarLayout2.T && !actionBarLayout2.M && !actionBarLayout2.j() && actionBarLayout2.K0.size() > 1 && !actionBarLayout2.y() && ((rVar = actionBarLayout2.C) == null || !rVar.hasShownSheet())) {
                    n2Var = (org.telegram.ui.ActionBar.n2) i0.a.j(1, actionBarLayout2.K0);
                    if (n2Var.onBackPressed(false) && !n2Var.hasShownSheet() && n2Var.canBeginSlide()) {
                        actionBarLayout2.f22646a1 = false;
                        actionBarLayout2.Z0 = true;
                        actionBarLayout2.Y0 = true;
                        if (touchX < AndroidUtilities.displaySize.x / 2.0f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        actionBarLayout2.f22652c1 = z10;
                        actionBarLayout2.f22649b1 = touchY;
                        actionBarLayout2.O();
                        if (activity != null && activity.getCurrentFocus() != null) {
                            AndroidUtilities.hideKeyboard(activity.getCurrentFocus());
                        }
                        n2Var.onBeginSlide();
                        if (!this.f41882b) {
                            this.f41881a.lock();
                            this.f41882b = true;
                        }
                    }
                }
            }
        }
        float fMax = Math.max(0.0f, progress - 0.015f) / 0.985f;
        if (AndroidUtilities.isTablet() || (actionBarLayout = this.f41885f.m0) == null || !actionBarLayout.Y0) {
            return;
        }
        float interpolation = org.telegram.ui.Components.er.f28127l.getInterpolation(fMax) * AndroidUtilities.dp(56.0f);
        actionBarLayout.f22646a1 = fMax > 0.0f;
        actionBarLayout.f22679s.setTranslationX(interpolation);
        actionBarLayout.setInnerTranslationX(interpolation);
    }

    @Override
    public final void onBackStarted(BackEvent backEvent) {
        this.f41883c = true;
        this.d = false;
        this.f41884e = false;
    }
}
