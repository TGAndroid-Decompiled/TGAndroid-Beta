package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class vq0 extends FrameLayout {
    public final int f50781a;

    public vq0(Context context, int i7) {
        super(context);
        this.f50781a = i7;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f50781a) {
            case 12:
                org.telegram.ui.ActionBar.m6.f27979i3.setBounds(0, 0, getMeasuredWidth(), org.telegram.ui.ActionBar.m6.f27979i3.getIntrinsicHeight());
                org.telegram.ui.ActionBar.m6.f27979i3.draw(canvas);
                super.dispatchDraw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f50781a) {
            case 14:
                return false;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.f50781a) {
            case 14:
                return false;
            case 16:
                return super.drawChild(canvas, view, j3);
            case 20:
                return false;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public boolean hasOverlappingRendering() {
        switch (this.f50781a) {
            case 15:
                return false;
            default:
                return super.hasOverlappingRendering();
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f50781a) {
            case 1:
                int intrinsicHeight = org.telegram.ui.ActionBar.m6.f27979i3.getIntrinsicHeight();
                org.telegram.ui.ActionBar.m6.f27979i3.setBounds(0, 0, getMeasuredWidth(), intrinsicHeight);
                org.telegram.ui.ActionBar.m6.f27979i3.draw(canvas);
                canvas.drawRect(0.0f, intrinsicHeight, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.m6.f27996j2);
                return;
            case 11:
                super.onDraw(canvas);
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, org.telegram.ui.ActionBar.m6.f28013k0);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        switch (this.f50781a) {
            case 8:
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
                super.onLayout(z9, i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        int i11;
        switch (this.f50781a) {
            case 0:
                super.onMeasure(i7, i10);
                setPivotY(getMeasuredHeight());
                return;
            case 5:
                super.onMeasure(i7, org.telegram.messenger.camera.q.B(36.0f, View.MeasureSpec.getSize(i10), 1073741824));
                return;
            case 6:
                super.onMeasure(i7, i10);
                return;
            case 8:
                int size = View.MeasureSpec.getSize(i7);
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
            case 9:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(60.0f), 1073741824));
                return;
            case 10:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(60.0f), 1073741824));
                return;
            case 14:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(500.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(500.0f), 1073741824));
                return;
            case 18:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(86.0f), 1073741824));
                return;
            case 21:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(120.0f), 1073741824));
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f50781a) {
            case 14:
                return false;
            case 17:
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public vq0(org.telegram.ui.Components.m20 m20Var, Context context, int i7, String str, CharSequence charSequence) {
        super(context);
        this.f50781a = 4;
        boolean z9 = org.telegram.messenger.id.f23161a0;
        ImageView imageView = new ImageView(getContext());
        Drawable mutate = getContext().getResources().getDrawable(i7).mutate();
        int i10 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.t6.x(this, mutate, i10, m20Var.I0, PorterDuff.Mode.MULTIPLY);
        imageView.setImageDrawable(mutate);
        addView(imageView, c8.ha.d(24, 24.0f, z9 ? 5 : 3, z9 ? 0.0f : 27.0f, 6.0f, z9 ? 27.0f : 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        textView.setText(str);
        org.telegram.messenger.k5.n(textView, i10, m20Var.I0, 1, 14.0f);
        addView(textView, c8.ha.d(-2, -2.0f, z9 ? 5 : 3, z9 ? 27.0f : 68.0f, 0.0f, z9 ? 68.0f : 27.0f, 0.0f));
        org.telegram.ui.Components.w70 w70Var = new org.telegram.ui.Components.w70(getContext(), null);
        w70Var.setText(charSequence);
        w70Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.t6.U(w70Var, org.telegram.ui.ActionBar.m6.Dj, m20Var.I0);
        org.telegram.ui.ActionBar.t6.G(w70Var, org.telegram.ui.ActionBar.m6.Uc, m20Var.I0);
        w70Var.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        w70Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        addView(w70Var, c8.ha.d(-2, -2.0f, z9 ? 5 : 3, (z9 ? 27 : 68) - 4, 18.0f, (z9 ? 68 : 27) - 4, 0.0f));
    }

    public vq0(wy0 wy0Var, Context context, int i7, String str, CharSequence charSequence) {
        super(context);
        this.f50781a = 3;
        boolean z9 = org.telegram.messenger.id.f23161a0;
        ImageView imageView = new ImageView(getContext());
        Drawable mutate = getContext().getResources().getDrawable(i7).mutate();
        int i10 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.t6.x(this, mutate, i10, wy0Var.I0, PorterDuff.Mode.MULTIPLY);
        imageView.setImageDrawable(mutate);
        addView(imageView, c8.ha.d(24, 24.0f, z9 ? 5 : 3, z9 ? 0.0f : 27.0f, 6.0f, z9 ? 27.0f : 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        textView.setText(str);
        org.telegram.messenger.k5.n(textView, i10, wy0Var.I0, 1, 14.0f);
        addView(textView, c8.ha.d(-2, -2.0f, z9 ? 5 : 3, z9 ? 27.0f : 68.0f, 0.0f, z9 ? 68.0f : 27.0f, 0.0f));
        org.telegram.ui.Components.w70 w70Var = new org.telegram.ui.Components.w70(getContext(), null);
        w70Var.setText(charSequence);
        w70Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.t6.U(w70Var, org.telegram.ui.ActionBar.m6.Dj, wy0Var.I0);
        org.telegram.ui.ActionBar.t6.G(w70Var, org.telegram.ui.ActionBar.m6.Uc, wy0Var.I0);
        w70Var.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        addView(w70Var, c8.ha.d(-2, -2.0f, z9 ? 5 : 3, z9 ? 27.0f : 68.0f, 18.0f, z9 ? 68.0f : 27.0f, 0.0f));
    }

    public vq0(Context context, zh.f2 f2Var, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f50781a = 22;
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        addView(f10, c8.ha.e(-1, -2, 23));
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        k9Var.setImageDrawable(new org.telegram.ui.Components.zg0(2131624319, org.telegram.messenger.g0.L(130.0f), org.telegram.messenger.g0.L(130.0f)));
        f10.addView(k9Var, c8.ha.r(130, 130, 17));
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.G6, h6Var);
        textView.setTextSize(1, 17.0f);
        textView.setGravity(17);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(org.telegram.messenger.id.M0(2131750011, null));
        f10.addView(textView, c8.ha.t(-2, -2, 17, 32, 12, 32, 9));
        org.telegram.ui.Components.w70 w70Var = new org.telegram.ui.Components.w70(context, null);
        org.telegram.ui.ActionBar.t6.U(w70Var, org.telegram.ui.ActionBar.m6.A6, h6Var);
        w70Var.setTextSize(1, 14.0f);
        w70Var.setGravity(17);
        w70Var.setText(org.telegram.messenger.id.M0(2131750012, null));
        w70Var.setMaxWidth(org.telegram.messenger.g0.L(200.0f));
        f10.addView(w70Var, c8.ha.t(-2, -2, 17, 32, 0, 32, 12));
        TextView textView2 = new TextView(context);
        int i7 = org.telegram.ui.ActionBar.m6.Ci;
        org.telegram.ui.ActionBar.t6.U(textView2, i7, h6Var);
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.m6.a0(org.telegram.ui.ActionBar.m6.r1(0.1f, org.telegram.ui.ActionBar.m6.w0(i7, h6Var)), 6, 6);
        org.telegram.ui.ActionBar.p6 K = org.telegram.ui.ActionBar.t6.K(0.1f, i7);
        textView2.setBackground(a02);
        org.telegram.ui.ActionBar.t6.j(textView2, a02, null, K, h6Var);
        textView2.setGravity(17);
        textView2.setText(org.telegram.messenger.id.M0(2131750013, null));
        textView2.setPadding(org.telegram.messenger.g0.L(13.0f), 0, org.telegram.messenger.g0.L(13.0f), 0);
        c8.ka.a(textView2);
        f10.addView(textView2, c8.ha.t(-2, 27, 17, 32, 0, 32, 12));
        textView2.setOnClickListener(f2Var);
    }

    public vq0(Context context) {
        super(context);
        this.f50781a = 2;
        setPadding(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(11.0f));
    }
}
