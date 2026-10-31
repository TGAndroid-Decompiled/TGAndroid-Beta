package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
public final class sz extends FrameLayout {
    public final TextView f41669a;
    public final ImageView f41670b;
    public boolean f41671c;

    public sz(Context context) {
        super(context);
        int i10;
        int i11;
        int i12;
        float f7;
        float f10;
        float f11;
        float f12;
        TextView textView = new TextView(context);
        this.f41669a = textView;
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q6, null);
        sc.e.u(textView, 1, 16.0f, null, 2131751714);
        if (org.telegram.messenger.cd.X) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10);
        boolean z10 = org.telegram.messenger.cd.X;
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
        boolean z11 = org.telegram.messenger.cd.X;
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
        addView(textView, w7.b6.d(-1, -2.0f, 23, f7, 0.0f, f10, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f41670b = imageView;
        Drawable drawable = context.getResources().getDrawable(2131232556);
        Drawable drawable2 = context.getResources().getDrawable(2131232557);
        int i13 = org.telegram.ui.ActionBar.t6.Ci;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.a7.y(this, drawable, i13, null, mode);
        org.telegram.ui.ActionBar.a7.y(this, drawable2, org.telegram.ui.ActionBar.t6.f21059k7, null, mode);
        imageView.setImageDrawable(new org.telegram.ui.Components.eq(drawable, drawable2));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        boolean z12 = org.telegram.messenger.cd.X;
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
        addView(imageView, w7.b6.d(32, 32.0f, i14, f11, 0.0f, f12, 0.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f41671c) {
            TextView textView = this.f41669a;
            canvas.drawRect(textView.getLeft(), getMeasuredHeight() - 1, textView.getRight(), getMeasuredHeight(), org.telegram.ui.ActionBar.t6.f21052k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(45.0f), 1073741824));
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
        this.f41669a.setAlpha(f7);
        if (z10) {
            f10 = 1.0f;
        }
        this.f41670b.setAlpha(f10);
    }
}
