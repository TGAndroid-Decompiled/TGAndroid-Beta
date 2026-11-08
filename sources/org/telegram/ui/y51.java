package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
public final class y51 extends View {
    public static final int f52089c = 0;
    public final Paint f52090a;
    public int[] f52091b;

    public y51(Context context) {
        super(context);
        this.f52090a = new Paint(1);
        this.f52091b = new int[7];
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float measuredWidth = getMeasuredWidth() * 0.5f;
        float measuredHeight = getMeasuredHeight() * 0.5f;
        float L = org.telegram.messenger.g0.L(5.0f);
        float L2 = org.telegram.messenger.g0.L(20.0f) - L;
        Paint.Style style = Paint.Style.FILL;
        Paint paint = this.f52090a;
        paint.setStyle(style);
        int i7 = 0;
        paint.setColor(this.f52091b[0]);
        canvas.drawCircle(measuredWidth, measuredHeight, L, paint);
        double d = 0.0d;
        while (i7 < 6) {
            i7++;
            paint.setColor(this.f52091b[i7]);
            canvas.drawCircle((((float) Math.sin(d)) * L2) + measuredWidth, measuredHeight - (((float) Math.cos(d)) * L2), L, paint);
            d += 1.0471975511965976d;
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(org.telegram.messenger.id.M0(2131752015, "ColorPickerMainColor"));
        accessibilityNodeInfo.setClassName(Button.class.getName());
        accessibilityNodeInfo.setEnabled(true);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(62.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(62.0f), 1073741824));
    }
}
