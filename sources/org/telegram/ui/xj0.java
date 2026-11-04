package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
public final class xj0 extends FrameLayout {
    public TextView f52033a;
    public TextView f52034b;
    public ImageView f52035c;
    public boolean d;

    public final void a(String str, boolean z10) {
        this.f52033a.setText(str);
        this.f52034b.setText("");
        this.d = z10;
        setWillNotDraw(!z10);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i3;
        if (this.d) {
            if (org.telegram.messenger.bd.f21784a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(20.0f);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (org.telegram.messenger.bd.f21784a0) {
                i3 = org.telegram.messenger.g0.L(20.0f);
            } else {
                i3 = 0;
            }
            canvas.drawLine(f10, measuredHeight, measuredWidth - i3, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f28002k0);
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(64.0f) + (this.d ? 1 : 0), 1073741824));
    }

    public void setChecked(boolean z10) {
        int i3;
        ImageView imageView = this.f52035c;
        if (z10) {
            i3 = 0;
        } else {
            i3 = 4;
        }
        imageView.setVisibility(i3);
    }

    public void setNeedDivider(boolean z10) {
        this.d = z10;
        setWillNotDraw(!z10);
        invalidate();
    }

    public void setValue(CharSequence charSequence) {
        this.f52034b.setText(charSequence);
    }
}
