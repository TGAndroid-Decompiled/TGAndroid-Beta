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

public final class w90 implements org.telegram.ui.Components.cd0, org.telegram.ui.ActionBar.a2 {

    public final LaunchActivity f43674a;

    public w90(LaunchActivity launchActivity) {
        this.f43674a = launchActivity;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        Pattern pattern = LaunchActivity.f35496x1;
        MessagesController.getInstance(this.f43674a.K).performLogout(2);
    }

    @Override
    public void h(org.telegram.ui.Components.dd0 dd0Var) throws Throwable {
        Pattern pattern = LaunchActivity.f35496x1;
        SharedConfig.isWaitingForPasscodeEnter = false;
        LaunchActivity launchActivity = this.f43674a;
        Intent intent = launchActivity.H0;
        if (intent != null) {
            launchActivity.X(intent, launchActivity.I0, launchActivity.J0, true, null, false, true);
            launchActivity.H0 = null;
        }
        launchActivity.m0.getView().setVisibility(0);
        launchActivity.m0.U(true, true);
        ActionBarLayout actionBarLayout = launchActivity.m0;
        org.telegram.ui.ActionBar.n2 lastFragment = actionBarLayout.getLastFragment();
        if (lastFragment != null) {
            lastFragment.setTitleOverlayText(actionBarLayout.C0, actionBarLayout.D0, actionBarLayout.E0);
        }
        if (AndroidUtilities.isTablet()) {
            launchActivity.f35523n0.U(true, true);
            launchActivity.f35525o0.U(true, true);
            if (launchActivity.f35523n0.getView().getVisibility() == 4) {
                launchActivity.f35523n0.getView().setVisibility(0);
            }
            launchActivity.f35525o0.getView().setVisibility(0);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, dd0Var);
        try {
            NotificationsController.getInstance(UserConfig.selectedAccount).showNotifications();
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }
}
