package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class yy0 extends wz0 {
    public yy0(Context context) {
        super(context);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        di.f3 f3Var;
        super.dispatchDraw(canvas);
        org.telegram.ui.Components.t5 t5Var = this.e;
        if (t5Var != null && (f3Var = t5Var.f32852k) != null) {
            f3Var.startAnimation();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (getImageReceiver().hasNotThumb()) {
            accessibilityNodeInfo.setText(LocaleController.getString(R.string.AccDescrProfilePicture));
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, LocaleController.getString(R.string.Open)));
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, LocaleController.getString(R.string.AccDescrOpenInPhotoViewer)));
            return;
        }
        accessibilityNodeInfo.setVisibleToUser(false);
    }
}
