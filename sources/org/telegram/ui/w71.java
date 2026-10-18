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
public final class w71 extends LinearLayout implements org.telegram.ui.ActionBar.y5 {
    public final org.telegram.ui.ActionBar.d6 f42405a;
    public final org.telegram.ui.Components.jc0 f42406b;
    public final FrameLayout f42407c;
    public final ImageView d;
    public final TextView e;
    public final TextView f42408f;
    public final TextView h;
    public boolean f42409n;
    public boolean f42410r;

    public w71(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f42409n = true;
        this.f42405a = d6Var;
        setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f42407c = frameLayout;
        org.telegram.ui.Components.jc0 jc0Var = new org.telegram.ui.Components.jc0(1);
        this.f42406b = jc0Var;
        frameLayout.setBackground(jc0Var);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        frameLayout.addView(imageView, w7.z5.e(24, 24, 17));
        LinearLayout e = org.telegram.messenger.kk.e(context, 1);
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 16.0f);
        TextView i10 = com.google.android.gms.internal.play_billing.k3.i(e, textView, w7.z5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2), context);
        this.f42408f = i10;
        i10.setTextSize(1, 13.0f);
        TextView i11 = com.google.android.gms.internal.play_billing.k3.i(e, i10, w7.z5.k(0.0f, 4.0f, 0.0f, 0.0f, -1, -2), context);
        this.h = i11;
        i11.setTextSize(1, 16.0f);
        if (LocaleController.isRTL) {
            addView(i11, w7.z5.t(-2, -2, 16, 20, 0, 0, 0));
            addView(e, w7.z5.p(0, -2, 1.0f, 23, 20, 0, 18, 0));
            addView(frameLayout, w7.z5.t(28, 28, 21, 0, 0, 18, 0));
        } else {
            addView(frameLayout, w7.z5.t(28, 28, 19, 18, 0, 0, 0));
            addView(e, w7.z5.p(0, -2, 1.0f, 23, 18, 0, 20, 0));
            addView(i11, w7.z5.t(-2, -2, 16, 0, 0, 20, 0));
        }
        d();
    }

    @Override
    public final void d() {
        boolean z10;
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        org.telegram.ui.ActionBar.d6 d6Var = this.f42405a;
        this.e.setTextColor(org.telegram.ui.ActionBar.h6.w0(i10, d6Var));
        this.f42408f.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21381y6, d6Var));
        this.h.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21176n6, d6Var));
        if (this.f42409n && (d6Var == null ? org.telegram.ui.ActionBar.h6.I.q() : d6Var.a())) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f42406b.f27510b = z10;
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        if (this.f42410r) {
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
