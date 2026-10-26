package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class wz extends FrameLayout {
    public final TextView f45591a;
    public final ImageView f45592b;
    public boolean f45593c;

    public wz(Context context) {
        super(context);
        int i10;
        int i11;
        int i12;
        float f7;
        float f10;
        float f11;
        float f12;
        TextView textView = new TextView(context);
        this.f45591a = textView;
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23597q6, null);
        textView.setTextSize(1, 16.0f);
        textView.setText(LocaleController.getString(R.string.CreateNewLink));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10);
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i11 = 16;
        } else {
            i11 = 0;
        }
        if (z10) {
            i12 = 0;
        } else {
            i12 = 16;
        }
        textView.setPadding(i11, 0, i12, 0);
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            f7 = 0.0f;
        } else {
            f7 = 64.0f;
        }
        if (z11) {
            f10 = 64.0f;
        } else {
            f10 = 0.0f;
        }
        addView(textView, org.telegram.ui.Components.gb1.h(-1, -2.0f, 23, f7, 0.0f, f10, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f45592b = imageView;
        Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
        Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
        int i13 = org.telegram.ui.ActionBar.y6.Oh;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.f7.y(this, drawable, i13, null, mode);
        org.telegram.ui.ActionBar.f7.y(this, drawable2, org.telegram.ui.ActionBar.y6.f23485k7, null, mode);
        imageView.setImageDrawable(new org.telegram.ui.Components.ar(drawable, drawable2));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        boolean z12 = LocaleController.isRTL;
        int i14 = (z12 ? 5 : 3) | 16;
        if (z12) {
            f11 = 0.0f;
        } else {
            f11 = 16.0f;
        }
        if (z12) {
            f12 = 16.0f;
        } else {
            f12 = 0.0f;
        }
        addView(imageView, org.telegram.ui.Components.gb1.h(32, 32.0f, i14, f11, 0.0f, f12, 0.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f45593c) {
            TextView textView = this.f45591a;
            canvas.drawRect(textView.getLeft(), getMeasuredHeight() - 1, textView.getRight(), getMeasuredHeight(), org.telegram.ui.ActionBar.y6.f23478k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(45.0f), 1073741824));
    }

    @Override
    public final void setEnabled(boolean z10) {
        float f7;
        super.setEnabled(z10);
        float f10 = 0.5f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.5f;
        }
        this.f45591a.setAlpha(f7);
        if (z10) {
            f10 = 1.0f;
        }
        this.f45592b.setAlpha(f10);
    }
}
