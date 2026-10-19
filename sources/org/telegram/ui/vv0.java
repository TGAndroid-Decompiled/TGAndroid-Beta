package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class vv0 implements ViewTreeObserver.OnPreDrawListener {
    public final int f42397a;
    public final PopupNotificationActivity f42398b;

    public vv0(PopupNotificationActivity popupNotificationActivity, int i10) {
        this.f42397a = i10;
        this.f42398b = popupNotificationActivity;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f42397a) {
            case 0:
                PopupNotificationActivity popupNotificationActivity = this.f42398b;
                FrameLayout frameLayout = popupNotificationActivity.f33484f;
                if (frameLayout != null) {
                    frameLayout.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                int A = org.telegram.messenger.kk.A(48.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 2);
                FrameLayout frameLayout2 = popupNotificationActivity.f33484f;
                frameLayout2.setPadding(frameLayout2.getPaddingLeft(), A, popupNotificationActivity.f33484f.getPaddingRight(), A);
                return true;
            default:
                PopupNotificationActivity popupNotificationActivity2 = this.f42398b;
                popupNotificationActivity2.f33485n.getViewTreeObserver().removeOnPreDrawListener(this);
                if (!popupNotificationActivity2.c() && !popupNotificationActivity2.X) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) popupNotificationActivity2.f33485n.getLayoutParams();
                    marginLayoutParams.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    marginLayoutParams.bottomMargin = AndroidUtilities.dp(48.0f);
                    marginLayoutParams.width = -1;
                    marginLayoutParams.height = -1;
                    popupNotificationActivity2.f33485n.setLayoutParams(marginLayoutParams);
                    popupNotificationActivity2.a(0);
                    return true;
                }
                return true;
        }
    }
}
