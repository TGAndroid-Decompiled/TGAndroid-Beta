package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class tw0 implements ViewTreeObserver.OnPreDrawListener {
    public final int f37049a;
    public final PopupNotificationActivity f37050b;

    public tw0(PopupNotificationActivity popupNotificationActivity, int i10) {
        this.f37049a = i10;
        this.f37050b = popupNotificationActivity;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f37049a) {
            case 0:
                PopupNotificationActivity popupNotificationActivity = this.f37050b;
                FrameLayout frameLayout = popupNotificationActivity.f30260f;
                if (frameLayout != null) {
                    frameLayout.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                int y3 = org.telegram.messenger.em.y(48.0f, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight(), 2);
                FrameLayout frameLayout2 = popupNotificationActivity.f30260f;
                frameLayout2.setPadding(frameLayout2.getPaddingLeft(), y3, popupNotificationActivity.f30260f.getPaddingRight(), y3);
                return true;
            default:
                PopupNotificationActivity popupNotificationActivity2 = this.f37050b;
                popupNotificationActivity2.f30261n.getViewTreeObserver().removeOnPreDrawListener(this);
                if (!popupNotificationActivity2.c() && !popupNotificationActivity2.X) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) popupNotificationActivity2.f30261n.getLayoutParams();
                    marginLayoutParams.topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                    marginLayoutParams.bottomMargin = AndroidUtilities.dp(48.0f);
                    marginLayoutParams.width = -1;
                    marginLayoutParams.height = -1;
                    popupNotificationActivity2.f30261n.setLayoutParams(marginLayoutParams);
                    popupNotificationActivity2.a(0);
                    return true;
                }
                return true;
        }
    }
}
