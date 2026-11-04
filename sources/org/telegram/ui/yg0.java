package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
public final class yg0 extends FrameLayout {
    public final int f52275a;

    public yg0(Context context, int i3) {
        super(context);
        this.f52275a = i3;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f52275a) {
            case 1:
                super.dispatchDraw(canvas);
                return;
            case 14:
                org.telegram.ui.ActionBar.k6.i3.setBounds(0, 0, getMeasuredWidth(), org.telegram.ui.ActionBar.k6.i3.getIntrinsicHeight());
                org.telegram.ui.ActionBar.k6.i3.draw(canvas);
                super.dispatchDraw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f52275a) {
            case 16:
                return false;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f52275a) {
            case 16:
                return false;
            case 18:
                return super.drawChild(canvas, view, j10);
            case 22:
                return false;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public boolean hasOverlappingRendering() {
        switch (this.f52275a) {
            case 17:
                return false;
            default:
                return super.hasOverlappingRendering();
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f52275a) {
            case 3:
                int intrinsicHeight = org.telegram.ui.ActionBar.k6.i3.getIntrinsicHeight();
                org.telegram.ui.ActionBar.k6.i3.setBounds(0, 0, getMeasuredWidth(), intrinsicHeight);
                org.telegram.ui.ActionBar.k6.i3.draw(canvas);
                canvas.drawRect(0.0f, intrinsicHeight, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.k6.f27985j2);
                return;
            case 13:
                super.onDraw(canvas);
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, org.telegram.ui.ActionBar.k6.f28002k0);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        switch (this.f52275a) {
            case 10:
                int childCount = getChildCount();
                int i13 = 0;
                int i14 = 0;
                for (int i15 = 0; i15 < childCount; i15++) {
                    if (getChildAt(i15).getMeasuredWidth() + i13 > getMeasuredWidth()) {
                        i14 += getChildAt(i15).getMeasuredHeight();
                        i13 = 0;
                    }
                    getChildAt(i15).layout(i13, i14, getChildAt(i15).getMeasuredWidth() + i13, getChildAt(i15).getMeasuredHeight() + i14);
                    i13 += getChildAt(i15).getMeasuredWidth();
                }
                return;
            default:
                super.onLayout(z10, i3, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i3, int i10) {
        int i11;
        switch (this.f52275a) {
            case 2:
                super.onMeasure(i3, i10);
                setPivotY(getMeasuredHeight());
                return;
            case 7:
                super.onMeasure(i3, org.telegram.messenger.camera.q.B(36.0f, View.MeasureSpec.getSize(i10), 1073741824));
                return;
            case 8:
                super.onMeasure(i3, i10);
                return;
            case 10:
                int size = View.MeasureSpec.getSize(i3);
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i10);
                int childCount = getChildCount();
                int i12 = 0;
                if (childCount > 0) {
                    i11 = getChildAt(0).getMeasuredHeight();
                } else {
                    i11 = 0;
                }
                int i13 = 0;
                int i14 = 0;
                for (int i15 = 0; i15 < childCount; i15++) {
                    if (getChildAt(i15).getMeasuredWidth() + i13 > size) {
                        i14 += getChildAt(i15).getMeasuredHeight();
                        i13 = 0;
                    }
                    i13 += getChildAt(i15).getMeasuredWidth();
                }
                int measuredWidth = getMeasuredWidth();
                if (getChildCount() != 0) {
                    i12 = org.telegram.messenger.g0.L(16.0f) + i11 + i14;
                }
                setMeasuredDimension(measuredWidth, i12);
                return;
            case 11:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(60.0f), 1073741824));
                return;
            case 12:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(60.0f), 1073741824));
                return;
            case 16:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(500.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(500.0f), 1073741824));
                return;
            case 20:
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(86.0f), 1073741824));
                return;
            default:
                super.onMeasure(i3, i10);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f52275a) {
            case 16:
                return false;
            case 19:
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public yg0(org.telegram.ui.Components.i20 i20Var, Context context, int i3, String str, CharSequence charSequence) {
        super(context);
        this.f52275a = 6;
        boolean z10 = org.telegram.messenger.bd.f21784a0;
        ImageView imageView = new ImageView(getContext());
        Drawable mutate = getContext().getResources().getDrawable(i3).mutate();
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.y(this, mutate, i10, i20Var.J0, PorterDuff.Mode.MULTIPLY);
        imageView.setImageDrawable(mutate);
        addView(imageView, b8.mf.d(24, 24.0f, z10 ? 5 : 3, z10 ? 0.0f : 27.0f, 6.0f, z10 ? 27.0f : 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        textView.setText(str);
        org.telegram.messenger.k5.n(textView, i10, i20Var.J0, 1, 14.0f);
        addView(textView, b8.mf.d(-2, -2.0f, z10 ? 5 : 3, z10 ? 27.0f : 68.0f, 0.0f, z10 ? 68.0f : 27.0f, 0.0f));
        org.telegram.ui.Components.s70 s70Var = new org.telegram.ui.Components.s70(getContext(), null);
        s70Var.setText(charSequence);
        s70Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(s70Var, org.telegram.ui.ActionBar.k6.Dj, i20Var.J0);
        org.telegram.ui.ActionBar.r6.H(s70Var, org.telegram.ui.ActionBar.k6.Uc, i20Var.J0);
        s70Var.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        s70Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        addView(s70Var, b8.mf.d(-2, -2.0f, z10 ? 5 : 3, (z10 ? 27 : 68) - 4, 18.0f, (z10 ? 68 : 27) - 4, 0.0f));
    }

    public yg0(iy0 iy0Var, Context context, int i3, String str, CharSequence charSequence) {
        super(context);
        this.f52275a = 5;
        boolean z10 = org.telegram.messenger.bd.f21784a0;
        ImageView imageView = new ImageView(getContext());
        Drawable mutate = getContext().getResources().getDrawable(i3).mutate();
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.y(this, mutate, i10, iy0Var.J0, PorterDuff.Mode.MULTIPLY);
        imageView.setImageDrawable(mutate);
        addView(imageView, b8.mf.d(24, 24.0f, z10 ? 5 : 3, z10 ? 0.0f : 27.0f, 6.0f, z10 ? 27.0f : 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        textView.setText(str);
        org.telegram.messenger.k5.n(textView, i10, iy0Var.J0, 1, 14.0f);
        addView(textView, b8.mf.d(-2, -2.0f, z10 ? 5 : 3, z10 ? 27.0f : 68.0f, 0.0f, z10 ? 68.0f : 27.0f, 0.0f));
        org.telegram.ui.Components.s70 s70Var = new org.telegram.ui.Components.s70(getContext(), null);
        s70Var.setText(charSequence);
        s70Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(s70Var, org.telegram.ui.ActionBar.k6.Dj, iy0Var.J0);
        org.telegram.ui.ActionBar.r6.H(s70Var, org.telegram.ui.ActionBar.k6.Uc, iy0Var.J0);
        s70Var.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        addView(s70Var, b8.mf.d(-2, -2.0f, z10 ? 5 : 3, z10 ? 27.0f : 68.0f, 18.0f, z10 ? 68.0f : 27.0f, 0.0f));
    }

    public yg0(int i3, Context context, String str) {
        super(context);
        this.f52275a = 0;
        setPadding(0, org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f));
        ImageView e10 = org.telegram.messenger.camera.q.e(context, i3);
        e10.setScaleType(ImageView.ScaleType.CENTER);
        int i10 = org.telegram.ui.ActionBar.k6.f27988j5;
        org.telegram.ui.ActionBar.r6.t(e10, i10, null, PorterDuff.Mode.MULTIPLY);
        boolean z10 = org.telegram.messenger.bd.f21784a0;
        addView(e10, b8.mf.d(24, 24.0f, (z10 ? 5 : 3) | 16, z10 ? 0.0f : 22.0f, 0.0f, z10 ? 22.0f : 0.0f, 0.0f));
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.r6.V(textView, i10, null);
        textView.setTextSize(1, 14.0f);
        textView.setGravity(org.telegram.messenger.bd.f21784a0 ? 5 : 3);
        textView.setText(str);
        boolean z11 = org.telegram.messenger.bd.f21784a0;
        addView(textView, b8.mf.d(-1, -2.0f, 23, z11 ? 0.0f : 61.0f, 0.0f, z11 ? 61.0f : 0.0f, 0.0f));
    }

    public yg0(Context context) {
        super(context);
        this.f52275a = 4;
        setPadding(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(11.0f));
    }
}
