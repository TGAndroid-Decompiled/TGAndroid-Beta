package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.Components.RadioButton;
public final class uh0 extends FrameLayout {
    public TextView f50503a;
    public RadioButton f50504b;
    public org.telegram.ui.Components.wo f50505c;
    public boolean d;
    public th0 f50506e;

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        if (this.d) {
            float f11 = 60.0f;
            if (org.telegram.messenger.id.f23161a0) {
                f10 = 0.0f;
            } else {
                f10 = 60.0f;
            }
            float L = org.telegram.messenger.g0.L(f10);
            float height = getHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (!org.telegram.messenger.id.f23161a0) {
                f11 = 0.0f;
            }
            canvas.drawLine(L, height, measuredWidth - org.telegram.messenger.g0.L(f11), getHeight() - 1, org.telegram.ui.ActionBar.m6.f28013k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.RadioButton");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.f50504b.f31533f);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), 1073741824));
    }
}
