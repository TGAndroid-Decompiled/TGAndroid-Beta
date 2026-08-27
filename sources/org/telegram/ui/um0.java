package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

public final class um0 extends View {

    public Paint f43251a;

    public Paint f43252b;

    public float f43253c;

    @Override
    public final void onDraw(Canvas canvas) {
        float measuredWidth = (int) (getMeasuredWidth() * this.f43253c);
        canvas.drawRect(0.0f, 0.0f, measuredWidth, getMeasuredHeight(), this.f43252b);
        canvas.drawRect(measuredWidth, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f43251a);
    }
}
