package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class qw0 implements ViewTreeObserver.OnPreDrawListener {
    public final int f39994a;
    public final PopupNotificationActivity f39995b;

    public qw0(PopupNotificationActivity popupNotificationActivity, int i10) {
        this.f39994a = i10;
        this.f39995b = popupNotificationActivity;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f39994a) {
            case 0:
                PopupNotificationActivity popupNotificationActivity = this.f39995b;
                FrameLayout frameLayout = popupNotificationActivity.f33764f;
                if (frameLayout != null) {
                    frameLayout.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                int y3 = org.telegram.messenger.vl.y(48.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 2);
                FrameLayout frameLayout2 = popupNotificationActivity.f33764f;
                frameLayout2.setPadding(frameLayout2.getPaddingLeft(), y3, popupNotificationActivity.f33764f.getPaddingRight(), y3);
                return true;
            default:
                PopupNotificationActivity popupNotificationActivity2 = this.f39995b;
                popupNotificationActivity2.f33765n.getViewTreeObserver().removeOnPreDrawListener(this);
                if (!popupNotificationActivity2.c() && !popupNotificationActivity2.X) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) popupNotificationActivity2.f33765n.getLayoutParams();
                    marginLayoutParams.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    marginLayoutParams.bottomMargin = AndroidUtilities.dp(48.0f);
                    marginLayoutParams.width = -1;
                    marginLayoutParams.height = -1;
                    popupNotificationActivity2.f33765n.setLayoutParams(marginLayoutParams);
                    popupNotificationActivity2.a(0);
                    return true;
                }
                return true;
        }
    }
}
