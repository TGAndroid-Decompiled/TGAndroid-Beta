package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
public final class ry extends FrameLayout {
    public ImageView f49630a;
    public TextView f49631b;
    public int f49632c;
    public boolean d;
    public Boolean f49633e;

    @Override
    public final void onDraw(Canvas canvas) {
        TextView textView = this.f49631b;
        super.onDraw(canvas);
        if (this.d) {
            canvas.drawRect(textView.getLeft(), getMeasuredHeight() - 1, textView.getRight(), getMeasuredHeight(), org.telegram.ui.ActionBar.l6.f27988k0);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
    }
}
