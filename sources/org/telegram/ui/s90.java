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
public final class s90 implements org.telegram.ui.Components.xc0, org.telegram.ui.ActionBar.b2 {
    public final LaunchActivity f42605a;

    public s90(LaunchActivity launchActivity) {
        this.f42605a = launchActivity;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        Pattern pattern = LaunchActivity.f35493x1;
        MessagesController.getInstance(this.f42605a.K).performLogout(2);
    }

    @Override
    public void i(org.telegram.ui.Components.yc0 yc0Var) {
        Pattern pattern = LaunchActivity.f35493x1;
        SharedConfig.isWaitingForPasscodeEnter = false;
        LaunchActivity launchActivity = this.f42605a;
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
            launchActivity.f35520n0.U(true, true);
            launchActivity.f35522o0.U(true, true);
            if (launchActivity.f35520n0.getView().getVisibility() == 4) {
                launchActivity.f35520n0.getView().setVisibility(0);
            }
            launchActivity.f35522o0.getView().setVisibility(0);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, yc0Var);
        try {
            NotificationsController.getInstance(UserConfig.selectedAccount).showNotifications();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }
}
