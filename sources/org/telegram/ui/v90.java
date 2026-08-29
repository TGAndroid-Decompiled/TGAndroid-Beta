package org.telegram.ui;

import android.content.Intent;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class v90 implements org.telegram.ui.Components.md0, org.telegram.ui.ActionBar.b2 {
    public final LaunchActivity f43486a;

    public v90(LaunchActivity launchActivity) {
        this.f43486a = launchActivity;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        Pattern pattern = LaunchActivity.f35560x1;
        MessagesController.getInstance(this.f43486a.K).performLogout(2);
    }

    @Override
    public void i(org.telegram.ui.Components.nd0 nd0Var) {
        Pattern pattern = LaunchActivity.f35560x1;
        SharedConfig.isWaitingForPasscodeEnter = false;
        LaunchActivity launchActivity = this.f43486a;
        Intent intent = launchActivity.H0;
        if (intent != null) {
            launchActivity.X(intent, launchActivity.I0, launchActivity.J0, true, null, false, true);
            launchActivity.H0 = null;
        }
        launchActivity.m0.getView().setVisibility(0);
        launchActivity.m0.U(true, true);
        ActionBarLayout actionBarLayout = launchActivity.m0;
        org.telegram.ui.ActionBar.o2 lastFragment = actionBarLayout.getLastFragment();
        if (lastFragment != null) {
            lastFragment.setTitleOverlayText(actionBarLayout.C0, actionBarLayout.D0, actionBarLayout.E0);
        }
        if (AndroidUtilities.isTablet()) {
            launchActivity.f35587n0.U(true, true);
            launchActivity.f35589o0.U(true, true);
            if (launchActivity.f35587n0.getView().getVisibility() == 4) {
                launchActivity.f35587n0.getView().setVisibility(0);
            }
            launchActivity.f35589o0.getView().setVisibility(0);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, nd0Var);
        try {
            NotificationsController.getInstance(UserConfig.selectedAccount).showNotifications();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }
}
