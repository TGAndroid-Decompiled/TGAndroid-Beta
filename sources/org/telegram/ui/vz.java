package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class vz extends FrameLayout {
    public final TextView f43612a;
    public final ImageView f43613b;
    public boolean f43614c;

    public vz(Context context) {
        super(context);
        int i9;
        int i10;
        int i11;
        float f10;
        float f11;
        float f12;
        float f13;
        TextView textView = new TextView(context);
        this.f43612a = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23229q6, false));
        textView.setTextSize(1, 16.0f);
        textView.setText(LocaleController.getString(R.string.CreateNewLink));
        if (LocaleController.isRTL) {
            i9 = 5;
        } else {
            i9 = 3;
        }
        textView.setGravity(i9);
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i10 = 16;
        } else {
            i10 = 0;
        }
        if (z10) {
            i11 = 0;
        } else {
            i11 = 16;
        }
        textView.setPadding(i10, 0, i11, 0);
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            f10 = 0.0f;
        } else {
            f10 = 64.0f;
        }
        if (z11) {
            f11 = 64.0f;
        } else {
            f11 = 0.0f;
        }
        addView(textView, g7.e6.d(-1, -2.0f, 23, f10, 0.0f, f11, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f43613b = imageView;
        Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
        Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Oh, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23128k7, false), mode));
        imageView.setImageDrawable(new org.telegram.ui.Components.fq(drawable, drawable2));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        boolean z12 = LocaleController.isRTL;
        int i12 = (z12 ? 5 : 3) | 16;
        if (z12) {
            f12 = 0.0f;
        } else {
            f12 = 16.0f;
        }
        if (z12) {
            f13 = 16.0f;
        } else {
            f13 = 0.0f;
        }
        addView(imageView, g7.e6.d(32, 32.0f, i12, f12, 0.0f, f13, 0.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f43614c) {
            TextView textView = this.f43612a;
            canvas.drawRect(textView.getLeft(), getMeasuredHeight() - 1, textView.getRight(), getMeasuredHeight(), org.telegram.ui.ActionBar.f6.f23121k0);
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(45.0f), 1073741824));
    }

    @Override
    public final void setEnabled(boolean z10) {
        float f10;
        super.setEnabled(z10);
        float f11 = 0.5f;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        this.f43612a.setAlpha(f10);
        if (z10) {
            f11 = 1.0f;
        }
        this.f43613b.setAlpha(f11);
    }
}
