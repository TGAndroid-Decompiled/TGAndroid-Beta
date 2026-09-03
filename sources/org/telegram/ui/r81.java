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
public final class r81 extends LinearLayout implements org.telegram.ui.ActionBar.a6 {
    public final org.telegram.ui.ActionBar.f6 f37740a;
    public final org.telegram.ui.Components.z8 f37741b;
    public final org.telegram.ui.Components.p9 f37742c;
    public final org.telegram.ui.ActionBar.k5 d;
    public final TextView e;
    public final ImageView f37743f;
    public final org.telegram.ui.Components.j5 h;
    public final org.telegram.ui.Components.j5 f37744n;

    public r81(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f37740a = f6Var;
        setOrientation(0);
        this.f37741b = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.f6) null);
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.f37742c = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.d = k5Var;
        k5Var.setTextSize(15);
        k5Var.setTypeface(AndroidUtilities.bold());
        k5Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        this.h = new org.telegram.ui.Components.j5(AndroidUtilities.dp(24.0f), 7, k5Var, false);
        this.f37744n = new org.telegram.ui.Components.j5(AndroidUtilities.dp(24.0f), 7, k5Var, false);
        k5Var.addOnAttachStateChangeListener(new j5(this, 4));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setPadding(AndroidUtilities.dp(6.66f), 0, AndroidUtilities.dp(6.66f), 0);
        textView.setTextSize(1, 11.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Sh, f6Var));
        textView.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(10.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var)));
        ImageView imageView = new ImageView(context);
        this.f37743f = imageView;
        imageView.setImageResource(R.drawable.msg_arrowright);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20042m6, f6Var), PorterDuff.Mode.SRC_IN));
        if (LocaleController.isRTL) {
            k5Var.setGravity(21);
            imageView.setScaleX(-1.0f);
            addView(imageView, k7.b6.p(24, 24, 0.0f, 19, 12, 0, 0, 0));
            addView(textView, k7.b6.p(-2, 20, 0.0f, 16, 0, 0, 0, 0));
            addView(k5Var, k7.b6.p(0, -1, 1.0f, 119, 18, 0, 0, 0));
            addView(p9Var, k7.b6.t(28, 28, 21, 18, 0, 18, 0));
            return;
        }
        k5Var.setGravity(19);
        addView(p9Var, k7.b6.t(28, 28, 19, 18, 0, 18, 0));
        addView(k5Var, k7.b6.p(0, -1, 1.0f, 119, 0, 0, 18, 0));
        addView(textView, k7.b6.p(-2, 20, 0.0f, 16, 0, 0, 0, 0));
        addView(imageView, k7.b6.p(24, 24, 0.0f, 21, 0, 0, 12, 0));
    }

    @Override
    public final void e() {
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.f6 f6Var = this.f37740a;
        this.d.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        this.e.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(10.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var)));
        this.f37743f.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20042m6, f6Var), PorterDuff.Mode.SRC_IN));
        this.f37744n.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zh, f6Var)));
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }

    public void set(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.r81.set(int):void");
    }
}
