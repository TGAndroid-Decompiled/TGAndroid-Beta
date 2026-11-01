package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class zc1 extends LinearLayout implements org.telegram.ui.ActionBar.k6 {
    public final org.telegram.ui.ActionBar.p6 f43926a;
    public final ImageView f43927b;
    public final LinearLayout f43928c;
    public final TextView d;
    public final TextView e;
    public final ImageView f43929f;
    public boolean h;
    public boolean f43930n;
    public int f43931r;

    public zc1(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        setOrientation(0);
        this.f43926a = p6Var;
        ImageView imageView = new ImageView(context);
        this.f43927b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        addView(imageView, w7.b6.t(40, 40, 19, 12, 0, 12, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f43928c = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, org.telegram.messenger.i0.L(10.0f), 0, org.telegram.messenger.i0.L(10.0f));
        addView(linearLayout, w7.b6.q(0, -2, 1.0f, 23, 0, 0, 32, 0));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 16.0f);
        TextView f7 = org.telegram.messenger.a30.f(linearLayout, textView, w7.b6.t(-1, -2, 7, 0, 0, 0, 0), context);
        this.e = f7;
        f7.setTextSize(1, 13.0f);
        linearLayout.addView(f7, w7.b6.s(-1, -2, 7, 0.0f, 4.33f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f43929f = imageView2;
        imageView2.setScaleType(scaleType);
        addView(imageView2, w7.b6.t(40, 40, 21, 12, 0, 12, 0));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    @Override
    public final void updateColors() {
        int i10;
        int i11;
        int i12;
        if (this.f43930n) {
            i10 = org.telegram.ui.ActionBar.t6.f21171q7;
        } else if (this.h) {
            i10 = org.telegram.ui.ActionBar.t6.f21116n6;
        } else {
            i10 = org.telegram.ui.ActionBar.t6.G6;
        }
        org.telegram.ui.ActionBar.p6 p6Var = this.f43926a;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i10, p6Var);
        int i13 = this.f43931r;
        ImageView imageView = this.f43929f;
        ImageView imageView2 = this.f43927b;
        if (w02 != i13 || imageView2.getColorFilter() == null || imageView.getColorFilter() == null) {
            this.f43931r = w02;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            imageView2.setColorFilter(new PorterDuffColorFilter(w02, mode));
            imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
        }
        if (this.f43930n) {
            i11 = org.telegram.ui.ActionBar.t6.f21154p7;
        } else if (this.h) {
            i11 = org.telegram.ui.ActionBar.t6.f21116n6;
        } else {
            i11 = org.telegram.ui.ActionBar.t6.G6;
        }
        this.d.setTextColor(org.telegram.ui.ActionBar.t6.w0(i11, p6Var));
        if (this.f43930n) {
            i12 = org.telegram.ui.ActionBar.t6.f21154p7;
        } else if (this.h) {
            i12 = org.telegram.ui.ActionBar.t6.f21116n6;
        } else {
            i12 = org.telegram.ui.ActionBar.t6.f21312y6;
        }
        this.e.setTextColor(org.telegram.ui.ActionBar.t6.w0(i12, p6Var));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
