package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class ya1 extends LinearLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 f52239a;
    public final ImageView f52240b;
    public final LinearLayout f52241c;
    public final TextView d;
    public final TextView f52242e;
    public final ImageView f52243f;
    public boolean h;
    public boolean f52244n;
    public int f52245r;

    public ya1(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        setOrientation(0);
        this.f52239a = e6Var;
        ImageView imageView = new ImageView(context);
        this.f52240b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        addView(imageView, b8.mf.t(40, 40, 19, 12, 0, 12, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f52241c = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f));
        addView(linearLayout, b8.mf.q(0, -2, 1.0f, 23, 0, 0, 32, 0));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 16.0f);
        TextView f10 = org.telegram.messenger.camera.q.f(linearLayout, textView, b8.mf.t(-1, -2, 7, 0, 0, 0, 0), context);
        this.f52242e = f10;
        f10.setTextSize(1, 13.0f);
        linearLayout.addView(f10, b8.mf.s(-1, -2, 7, 0.0f, 4.33f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f52243f = imageView2;
        imageView2.setScaleType(scaleType);
        addView(imageView2, b8.mf.t(40, 40, 21, 12, 0, 12, 0));
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), i10);
    }

    @Override
    public final void updateColors() {
        int i3;
        int i10;
        int i11;
        if (this.f52244n) {
            i3 = org.telegram.ui.ActionBar.k6.f28122q7;
        } else if (this.h) {
            i3 = org.telegram.ui.ActionBar.k6.f28062n6;
        } else {
            i3 = org.telegram.ui.ActionBar.k6.G6;
        }
        org.telegram.ui.ActionBar.e6 e6Var = this.f52239a;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i3, e6Var);
        int i12 = this.f52245r;
        ImageView imageView = this.f52243f;
        ImageView imageView2 = this.f52240b;
        if (w02 != i12 || imageView2.getColorFilter() == null || imageView.getColorFilter() == null) {
            this.f52245r = w02;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            imageView2.setColorFilter(new PorterDuffColorFilter(w02, mode));
            imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
        }
        if (this.f52244n) {
            i10 = org.telegram.ui.ActionBar.k6.f28102p7;
        } else if (this.h) {
            i10 = org.telegram.ui.ActionBar.k6.f28062n6;
        } else {
            i10 = org.telegram.ui.ActionBar.k6.G6;
        }
        this.d.setTextColor(org.telegram.ui.ActionBar.k6.w0(i10, e6Var));
        if (this.f52244n) {
            i11 = org.telegram.ui.ActionBar.k6.f28102p7;
        } else if (this.h) {
            i11 = org.telegram.ui.ActionBar.k6.f28062n6;
        } else {
            i11 = org.telegram.ui.ActionBar.k6.f28273y6;
        }
        this.f52242e.setTextColor(org.telegram.ui.ActionBar.k6.w0(i11, e6Var));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
