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
public final class w71 extends LinearLayout implements org.telegram.ui.ActionBar.x5 {
    public final org.telegram.ui.ActionBar.c6 f43859a;
    public final org.telegram.ui.Components.e9 f43860b;
    public final org.telegram.ui.Components.t9 f43861c;
    public final org.telegram.ui.ActionBar.h5 d;
    public final TextView f43862e;
    public final ImageView f43863f;
    public final org.telegram.ui.Components.n5 h;
    public final org.telegram.ui.Components.n5 f43864n;

    public w71(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f43859a = c6Var;
        setOrientation(0);
        this.f43860b = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
        org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(context);
        this.f43861c = t9Var;
        t9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.d = h5Var;
        h5Var.setTextSize(15);
        h5Var.setTypeface(AndroidUtilities.bold());
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        this.h = new org.telegram.ui.Components.n5(AndroidUtilities.dp(24.0f), 7, h5Var, false);
        this.f43864n = new org.telegram.ui.Components.n5(AndroidUtilities.dp(24.0f), 7, h5Var, false);
        h5Var.addOnAttachStateChangeListener(new f5(this, 4));
        TextView textView = new TextView(context);
        this.f43862e = textView;
        textView.setPadding(AndroidUtilities.dp(6.66f), 0, AndroidUtilities.dp(6.66f), 0);
        textView.setTextSize(1, 11.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Sh, c6Var));
        textView.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(10.0f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var)));
        ImageView imageView = new ImageView(context);
        this.f43863f = imageView;
        imageView.setImageResource(R.drawable.msg_arrowright);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23223m6, c6Var), PorterDuff.Mode.SRC_IN));
        if (LocaleController.isRTL) {
            h5Var.setGravity(21);
            imageView.setScaleX(-1.0f);
            addView(imageView, i7.f6.p(24, 24, 0.0f, 19, 12, 0, 0, 0));
            addView(textView, i7.f6.p(-2, 20, 0.0f, 16, 0, 0, 0, 0));
            addView(h5Var, i7.f6.p(0, -1, 1.0f, 119, 18, 0, 0, 0));
            addView(t9Var, i7.f6.t(28, 28, 21, 18, 0, 18, 0));
            return;
        }
        h5Var.setGravity(19);
        addView(t9Var, i7.f6.t(28, 28, 19, 18, 0, 18, 0));
        addView(h5Var, i7.f6.p(0, -1, 1.0f, 119, 0, 0, 18, 0));
        addView(textView, i7.f6.p(-2, 20, 0.0f, 16, 0, 0, 0, 0));
        addView(imageView, i7.f6.p(24, 24, 0.0f, 21, 0, 0, 12, 0));
    }

    @Override
    public final void e() {
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        org.telegram.ui.ActionBar.c6 c6Var = this.f43859a;
        this.d.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        this.f43862e.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(10.0f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var)));
        this.f43863f.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23223m6, c6Var), PorterDuff.Mode.SRC_IN));
        this.f43864n.k(Integer.valueOf(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.zh, c6Var)));
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }

    public void set(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.w71.set(int):void");
    }
}
