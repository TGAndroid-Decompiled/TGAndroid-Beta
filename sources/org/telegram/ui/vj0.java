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
public final class vj0 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public boolean f42755a;
    public int f42756b;
    public final int f42757c;
    public final org.telegram.ui.ActionBar.p6 d;
    public final FrameLayout e;
    public final org.telegram.ui.Components.g9 f42758f;
    public final TextView h;
    public final TextView f42759n;
    public final ImageView f42760r;
    public boolean f42761s;
    public String f42762w;

    public vj0(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.f42757c = i10;
        this.d = p6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        addView(frameLayout, w7.b6.d(36, 36.0f, 19, 18.5f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
        this.f42758f = g9Var;
        g9Var.setImageResource(2131232032);
        a();
        frameLayout.addView(g9Var, w7.b6.e(36, 36, 17));
        TextView b10 = w7.g6.b(context, 15.0f, org.telegram.ui.ActionBar.t6.G6, true, null);
        this.h = b10;
        b10.setSingleLine();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        b10.setEllipsize(truncateAt);
        addView(b10, w7.b6.d(-1, -2.0f, 55, 72.0f, 8.0f, 46.0f, 0.0f));
        int i11 = org.telegram.ui.ActionBar.t6.f21311y6;
        TextView b11 = w7.g6.b(context, 13.0f, i11, false, null);
        this.f42759n = b11;
        b11.setSingleLine();
        b11.setEllipsize(truncateAt);
        addView(b11, w7.b6.d(-1, -2.0f, 55, 72.0f, 31.0f, 46.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f42760r = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231245);
        org.telegram.ui.ActionBar.a7.t(imageView, i11, null, PorterDuff.Mode.SRC_IN);
        int i12 = org.telegram.ui.ActionBar.t6.f21020i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i12, p6Var), 1, -1);
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i12);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.a7.k(imageView, h02, null, N, p6Var);
        addView(imageView, w7.b6.d(32, 32.0f, 21, 0.0f, 0.0f, 13.0f, 0.0f));
    }

    public final void a() {
        this.f42756b = org.telegram.ui.ActionBar.t6.r1(0.3f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, this.d));
        this.f42755a = true;
        this.f42758f.setColorFilter(new PorterDuffColorFilter(this.f42756b, PorterDuff.Mode.SRC_IN));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        super.onDraw(canvas);
        if (this.f42761s) {
            Paint W0 = org.telegram.ui.ActionBar.t6.W0("paintDivider", this.d);
            if (W0 == null) {
                W0 = org.telegram.ui.ActionBar.t6.f21052k0;
            }
            Paint paint = W0;
            float f10 = 72.0f;
            if (org.telegram.messenger.cd.X) {
                f7 = 0.0f;
            } else {
                f7 = 72.0f;
            }
            float L = org.telegram.messenger.i0.L(f7);
            float measuredHeight = getMeasuredHeight() - 1;
            int width = getWidth();
            if (!org.telegram.messenger.cd.X) {
                f10 = 0.0f;
            }
            canvas.drawRect(L, measuredHeight, width - org.telegram.messenger.i0.L(f10), getMeasuredHeight(), paint);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(56.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Components.g9 g9Var;
        int r12;
        try {
            if (this.f42755a && (g9Var = this.f42758f) != null && (r12 = org.telegram.ui.ActionBar.t6.r1(0.3f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, this.d))) != this.f42756b) {
                this.f42756b = r12;
                g9Var.setColorFilter(new PorterDuffColorFilter(r12, PorterDuff.Mode.SRC_IN));
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
