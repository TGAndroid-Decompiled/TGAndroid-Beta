package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class yv0 implements ViewTreeObserver.OnPreDrawListener {
    public final int f43718a;
    public final PopupNotificationActivity f43719b;

    public yv0(PopupNotificationActivity popupNotificationActivity, int i10) {
        this.f43718a = i10;
        this.f43719b = popupNotificationActivity;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f43718a) {
            case 0:
                PopupNotificationActivity popupNotificationActivity = this.f43719b;
                FrameLayout frameLayout = popupNotificationActivity.f34473f;
                if (frameLayout != null) {
                    frameLayout.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                int x10 = b.x(48.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 2);
                FrameLayout frameLayout2 = popupNotificationActivity.f34473f;
                frameLayout2.setPadding(frameLayout2.getPaddingLeft(), x10, popupNotificationActivity.f34473f.getPaddingRight(), x10);
                return true;
            default:
                PopupNotificationActivity popupNotificationActivity2 = this.f43719b;
                popupNotificationActivity2.f34474n.getViewTreeObserver().removeOnPreDrawListener(this);
                if (!popupNotificationActivity2.c() && !popupNotificationActivity2.U) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) popupNotificationActivity2.f34474n.getLayoutParams();
                    marginLayoutParams.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    marginLayoutParams.bottomMargin = AndroidUtilities.dp(48.0f);
                    marginLayoutParams.width = -1;
                    marginLayoutParams.height = -1;
                    popupNotificationActivity2.f34474n.setLayoutParams(marginLayoutParams);
                    popupNotificationActivity2.a(0);
                    return true;
                }
                return true;
        }
    }
}
