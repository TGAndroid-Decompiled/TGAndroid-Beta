package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class u71 extends LinearLayout implements org.telegram.ui.ActionBar.w5 {
    public final org.telegram.ui.ActionBar.b6 f43156a;
    public final org.telegram.ui.Components.z8 f43157b;
    public final org.telegram.ui.Components.o9 f43158c;
    public final org.telegram.ui.ActionBar.h5 d;
    public final TextView f43159e;
    public final ImageView f43160f;
    public final org.telegram.ui.Components.i5 h;
    public final org.telegram.ui.Components.i5 f43161n;

    public u71(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.f43156a = b6Var;
        setOrientation(0);
        this.f43157b = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
        org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
        this.f43158c = o9Var;
        o9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.d = h5Var;
        h5Var.setTextSize(15);
        h5Var.setTypeface(AndroidUtilities.bold());
        h5Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, b6Var));
        this.h = new org.telegram.ui.Components.i5(AndroidUtilities.dp(24.0f), 7, h5Var, false);
        this.f43161n = new org.telegram.ui.Components.i5(AndroidUtilities.dp(24.0f), 7, h5Var, false);
        h5Var.addOnAttachStateChangeListener(new e5(this, 4));
        TextView textView = new TextView(context);
        this.f43159e = textView;
        textView.setPadding(AndroidUtilities.dp(6.66f), 0, AndroidUtilities.dp(6.66f), 0);
        textView.setTextSize(1, 11.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Sh, b6Var));
        textView.setBackground(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(10.0f), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oh, b6Var)));
        ImageView imageView = new ImageView(context);
        this.f43160f = imageView;
        imageView.setImageResource(R.drawable.msg_arrowright);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23162m6, b6Var), PorterDuff.Mode.SRC_IN));
        if (LocaleController.isRTL) {
            h5Var.setGravity(21);
            imageView.setScaleX(-1.0f);
            addView(imageView, g7.e6.p(24, 24, 0.0f, 19, 12, 0, 0, 0));
            addView(textView, g7.e6.p(-2, 20, 0.0f, 16, 0, 0, 0, 0));
            addView(h5Var, g7.e6.p(0, -1, 1.0f, 119, 18, 0, 0, 0));
            addView(o9Var, g7.e6.t(28, 28, 21, 18, 0, 18, 0));
            return;
        }
        h5Var.setGravity(19);
        addView(o9Var, g7.e6.t(28, 28, 19, 18, 0, 18, 0));
        addView(h5Var, g7.e6.p(0, -1, 1.0f, 119, 0, 0, 18, 0));
        addView(textView, g7.e6.p(-2, 20, 0.0f, 16, 0, 0, 0, 0));
        addView(imageView, g7.e6.p(24, 24, 0.0f, 21, 0, 0, 12, 0));
    }

    @Override
    public final void d() {
        int i9 = org.telegram.ui.ActionBar.f6.G6;
        org.telegram.ui.ActionBar.b6 b6Var = this.f43156a;
        this.d.setTextColor(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        this.f43159e.setBackground(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(10.0f), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oh, b6Var)));
        this.f43160f.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23162m6, b6Var), PorterDuff.Mode.SRC_IN));
        this.f43161n.k(Integer.valueOf(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.zh, b6Var)));
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }

    public void set(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.u71.set(int):void");
    }
}
