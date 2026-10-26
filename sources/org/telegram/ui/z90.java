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
public final class z90 implements org.telegram.ui.Components.je0, org.telegram.ui.ActionBar.b2 {
    public final LaunchActivity f46235a;

    public z90(LaunchActivity launchActivity) {
        this.f46235a = launchActivity;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        Pattern pattern = LaunchActivity.D1;
        MessagesController.getInstance(this.f46235a.O).performLogout(2);
    }

    @Override
    public void l(org.telegram.ui.Components.le0 le0Var) {
        Pattern pattern = LaunchActivity.D1;
        SharedConfig.isWaitingForPasscodeEnter = false;
        LaunchActivity launchActivity = this.f46235a;
        Intent intent = launchActivity.L0;
        if (intent != null) {
            launchActivity.X(intent, launchActivity.M0, launchActivity.N0, true, null, false, true);
            launchActivity.L0 = null;
        }
        launchActivity.f35553q0.getView().setVisibility(0);
        launchActivity.f35553q0.W(true, true);
        ActionBarLayout actionBarLayout = launchActivity.f35553q0;
        org.telegram.ui.ActionBar.r2 lastFragment = actionBarLayout.getLastFragment();
        if (lastFragment != null) {
            lastFragment.setTitleOverlayText(actionBarLayout.M0, actionBarLayout.N0, actionBarLayout.O0);
        }
        if (AndroidUtilities.isTablet()) {
            launchActivity.f35555r0.W(true, true);
            launchActivity.f35557s0.W(true, true);
            if (launchActivity.f35555r0.getView().getVisibility() == 4) {
                launchActivity.f35555r0.getView().setVisibility(0);
            }
            launchActivity.f35557s0.getView().setVisibility(0);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, le0Var);
        try {
            NotificationsController.getInstance(UserConfig.selectedAccount).showNotifications();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
