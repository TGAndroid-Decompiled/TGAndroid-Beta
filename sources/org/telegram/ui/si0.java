package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
public final class si0 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public boolean f52051a;
    public int f52052b;
    public final int f52053c;
    public final org.telegram.ui.ActionBar.h6 d;
    public final FrameLayout f52054e;
    public final org.telegram.ui.Components.q9 f52055f;
    public final TextView h;
    public final TextView f52056n;
    public final ImageView f52057r;
    public boolean f52058s;
    public String f52059w;

    public si0(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f52053c = i7;
        this.d = h6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f52054e = frameLayout;
        addView(frameLayout, c8.ma.d(36, 36.0f, 19, 18.5f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        this.f52055f = q9Var;
        q9Var.setImageResource(2131232034);
        a();
        frameLayout.addView(q9Var, c8.ma.e(36, 36, 17));
        TextView b10 = c8.va.b(context, 15.0f, org.telegram.ui.ActionBar.m6.G6, true, null);
        this.h = b10;
        b10.setSingleLine();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        b10.setEllipsize(truncateAt);
        addView(b10, c8.ma.d(-1, -2.0f, 55, 72.0f, 8.0f, 46.0f, 0.0f));
        int i10 = org.telegram.ui.ActionBar.m6.f29773y6;
        TextView b11 = c8.va.b(context, 13.0f, i10, false, null);
        this.f52056n = b11;
        b11.setSingleLine();
        b11.setEllipsize(truncateAt);
        addView(b11, c8.ma.d(-1, -2.0f, 55, 72.0f, 31.0f, 46.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f52057r = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231244);
        org.telegram.ui.ActionBar.t6.s(imageView, i10, null, PorterDuff.Mode.SRC_IN);
        int i11 = org.telegram.ui.ActionBar.m6.f29473i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i11, h6Var), 1, -1);
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i11);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.t6.j(imageView, h02, null, M, h6Var);
        addView(imageView, c8.ma.d(32, 32.0f, 21, 0.0f, 0.0f, 13.0f, 0.0f));
    }

    public final void a() {
        this.f52052b = org.telegram.ui.ActionBar.m6.r1(0.3f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G6, this.d));
        this.f52051a = true;
        this.f52055f.setColorFilter(new PorterDuffColorFilter(this.f52052b, PorterDuff.Mode.SRC_IN));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        super.onDraw(canvas);
        if (this.f52058s) {
            Paint W0 = org.telegram.ui.ActionBar.m6.W0("paintDivider", this.d);
            if (W0 == null) {
                W0 = org.telegram.ui.ActionBar.m6.f29504k0;
            }
            Paint paint = W0;
            float f11 = 72.0f;
            if (org.telegram.messenger.hd.f24444a0) {
                f10 = 0.0f;
            } else {
                f10 = 72.0f;
            }
            float L = org.telegram.messenger.g0.L(f10);
            float measuredHeight = getMeasuredHeight() - 1;
            int width = getWidth();
            if (!org.telegram.messenger.hd.f24444a0) {
                f11 = 0.0f;
            }
            canvas.drawRect(L, measuredHeight, width - org.telegram.messenger.g0.L(f11), getMeasuredHeight(), paint);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(56.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Components.q9 q9Var;
        int r12;
        try {
            if (this.f52051a && (q9Var = this.f52055f) != null && (r12 = org.telegram.ui.ActionBar.m6.r1(0.3f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G6, this.d))) != this.f52052b) {
                this.f52052b = r12;
                q9Var.setColorFilter(new PorterDuffColorFilter(r12, PorterDuff.Mode.SRC_IN));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
