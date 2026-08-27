package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

public final class z71 extends FrameLayout {

    public final int f45068a;

    public z71(Context context, int i10) {
        super(context);
        this.f45068a = i10;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f45068a) {
            case 5:
                org.telegram.ui.ActionBar.g6.f23141i3.setBounds(0, 0, getMeasuredWidth(), org.telegram.ui.ActionBar.g6.f23141i3.getIntrinsicHeight());
                org.telegram.ui.ActionBar.g6.f23141i3.draw(canvas);
                super.dispatchDraw(canvas);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f45068a) {
            case 11:
                return super.drawChild(canvas, view, j10);
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public boolean hasOverlappingRendering() {
        switch (this.f45068a) {
            case 10:
                return false;
            default:
                return super.hasOverlappingRendering();
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f45068a) {
            case 4:
                super.onDraw(canvas);
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, org.telegram.ui.ActionBar.g6.f23175k0);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f45068a) {
            case 1:
                int childCount = getChildCount();
                int measuredWidth = 0;
                int measuredHeight = 0;
                for (int i14 = 0; i14 < childCount; i14++) {
                    if (getChildAt(i14).getMeasuredWidth() + measuredWidth > getMeasuredWidth()) {
                        measuredHeight += getChildAt(i14).getMeasuredHeight();
                        measuredWidth = 0;
                    }
                    getChildAt(i14).layout(measuredWidth, measuredHeight, getChildAt(i14).getMeasuredWidth() + measuredWidth, getChildAt(i14).getMeasuredHeight() + measuredHeight);
                    measuredWidth += getChildAt(i14).getMeasuredWidth();
                }
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f45068a) {
            case 0:
                super.onMeasure(i10, i11);
                break;
            case 1:
                int size = View.MeasureSpec.getSize(i10);
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i11);
                int childCount = getChildCount();
                int measuredHeight = childCount > 0 ? getChildAt(0).getMeasuredHeight() : 0;
                int measuredWidth = 0;
                int measuredHeight2 = 0;
                for (int i12 = 0; i12 < childCount; i12++) {
                    if (getChildAt(i12).getMeasuredWidth() + measuredWidth > size) {
                        measuredHeight2 += getChildAt(i12).getMeasuredHeight();
                        measuredWidth = 0;
                    }
                    measuredWidth += getChildAt(i12).getMeasuredWidth();
                }
                setMeasuredDimension(getMeasuredWidth(), getChildCount() != 0 ? AndroidUtilities.dp(16.0f) + measuredHeight + measuredHeight2 : 0);
                break;
            case 2:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), 1073741824));
                break;
            case 3:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), 1073741824));
                break;
            case 4:
            case 5:
            case 6:
            default:
                super.onMeasure(i10, i11);
                break;
            case 7:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(12.0f), 1073741824));
                break;
            case 8:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(58.0f), 1073741824));
                break;
            case 9:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i11), AndroidUtilities.dp(60.0f)), View.MeasureSpec.getMode(i11)));
                break;
        }
    }
}
