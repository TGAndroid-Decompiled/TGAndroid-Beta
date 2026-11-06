package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
public final class ry extends FrameLayout {
    public final TextView f49564a;
    public final ImageView f49565b;
    public boolean f49566c;

    public ry(Context context) {
        super(context);
        int i7;
        int i10;
        int i11;
        float f10;
        float f11;
        float f12;
        float f13;
        TextView textView = new TextView(context);
        this.f49564a = textView;
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28088q6, null);
        jg.g.v(textView, 1, 16.0f, null, 2131751714);
        if (org.telegram.messenger.hd.f22871a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        textView.setGravity(i7);
        boolean z9 = org.telegram.messenger.hd.f22871a0;
        if (z9) {
            i10 = 16;
        } else {
            i10 = 0;
        }
        if (z9) {
            i11 = 0;
        } else {
            i11 = 16;
        }
        textView.setPadding(i10, 0, i11, 0);
        boolean z10 = org.telegram.messenger.hd.f22871a0;
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 64.0f;
        }
        if (z10) {
            f11 = 64.0f;
        } else {
            f11 = 0.0f;
        }
        addView(textView, c8.ha.d(-1, -2.0f, 23, f10, 0.0f, f11, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f49565b = imageView;
        Drawable drawable = context.getResources().getDrawable(2131232559);
        Drawable drawable2 = context.getResources().getDrawable(2131232560);
        int i12 = org.telegram.ui.ActionBar.k6.Ci;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.r6.y(this, drawable, i12, null, mode);
        org.telegram.ui.ActionBar.r6.y(this, drawable2, org.telegram.ui.ActionBar.k6.f27978k7, null, mode);
        imageView.setImageDrawable(new org.telegram.ui.Components.xp(drawable, drawable2));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        boolean z11 = org.telegram.messenger.hd.f22871a0;
        int i13 = (z11 ? 5 : 3) | 16;
        if (z11) {
            f12 = 0.0f;
        } else {
            f12 = 16.0f;
        }
        if (z11) {
            f13 = 16.0f;
        } else {
            f13 = 0.0f;
        }
        addView(imageView, c8.ha.d(32, 32.0f, i13, f12, 0.0f, f13, 0.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f49566c) {
            TextView textView = this.f49564a;
            canvas.drawRect(textView.getLeft(), getMeasuredHeight() - 1, textView.getRight(), getMeasuredHeight(), org.telegram.ui.ActionBar.k6.f27971k0);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(45.0f), 1073741824));
    }

    @Override
    public final void setEnabled(boolean z9) {
        float f10;
        super.setEnabled(z9);
        float f11 = 0.5f;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        this.f49564a.setAlpha(f10);
        if (z9) {
            f11 = 1.0f;
        }
        this.f49565b.setAlpha(f11);
    }
}
