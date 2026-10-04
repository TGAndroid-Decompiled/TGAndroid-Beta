package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class x81 extends LinearLayout implements org.telegram.ui.ActionBar.y5 {
    public final org.telegram.ui.ActionBar.d6 f42779a;
    public final org.telegram.ui.Components.dc0 f42780b;
    public final FrameLayout f42781c;
    public final ImageView d;
    public final TextView f42782e;
    public final TextView f42783f;
    public final TextView h;
    public boolean f42784n;

    public x81(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f42779a = d6Var;
        setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f42781c = frameLayout;
        org.telegram.ui.Components.dc0 dc0Var = new org.telegram.ui.Components.dc0(1);
        this.f42780b = dc0Var;
        frameLayout.setBackground(dc0Var);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        frameLayout.addView(imageView, w7.z5.e(24, 24, 17));
        LinearLayout e7 = org.telegram.messenger.bi.e(context, 1);
        TextView textView = new TextView(context);
        this.f42782e = textView;
        textView.setTextSize(1, 16.0f);
        TextView h = com.google.android.gms.internal.vision.e2.h(e7, textView, w7.z5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2), context);
        this.f42783f = h;
        h.setTextSize(1, 13.0f);
        TextView h10 = com.google.android.gms.internal.vision.e2.h(e7, h, w7.z5.k(0.0f, 4.0f, 0.0f, 0.0f, -1, -2), context);
        this.h = h10;
        h10.setTextSize(1, 16.0f);
        if (LocaleController.isRTL) {
            addView(h10, w7.z5.t(-2, -2, 16, 20, 0, 0, 0));
            addView(e7, w7.z5.p(0, -2, 1.0f, 23, 20, 0, 18, 0));
            addView(frameLayout, w7.z5.t(28, 28, 21, 0, 0, 18, 0));
        } else {
            addView(frameLayout, w7.z5.t(28, 28, 19, 18, 0, 0, 0));
            addView(e7, w7.z5.p(0, -2, 1.0f, 23, 18, 0, 20, 0));
            addView(h10, w7.z5.t(-2, -2, 16, 0, 0, 20, 0));
        }
        e();
    }

    @Override
    public final void e() {
        boolean q6;
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        org.telegram.ui.ActionBar.d6 d6Var = this.f42779a;
        this.f42782e.setTextColor(org.telegram.ui.ActionBar.i6.v0(i10, d6Var));
        this.f42783f.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21209y6, d6Var));
        this.h.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21008n6, d6Var));
        if (d6Var != null) {
            q6 = d6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.i6.I.q();
        }
        this.f42780b.f25699b = q6;
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        if (this.f42784n) {
            f7 = 60.0f;
        } else {
            f7 = 50.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f7), 1073741824));
    }

    public void setValue(CharSequence charSequence) {
        int i10;
        if (!TextUtils.isEmpty(charSequence)) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        TextView textView = this.h;
        textView.setVisibility(i10);
        textView.setText(charSequence);
    }
}
