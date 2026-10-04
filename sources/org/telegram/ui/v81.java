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
public final class v81 extends LinearLayout implements org.telegram.ui.ActionBar.y5 {
    public final org.telegram.ui.ActionBar.d6 f41598a;
    public final org.telegram.ui.Components.h9 f41599b;
    public final org.telegram.ui.Components.w9 f41600c;
    public final org.telegram.ui.ActionBar.i5 d;
    public final TextView f41601e;
    public final ImageView f41602f;
    public final org.telegram.ui.Components.o5 h;
    public final org.telegram.ui.Components.o5 f41603n;

    public v81(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f41598a = d6Var;
        setOrientation(0);
        this.f41599b = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.f41600c = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        org.telegram.ui.ActionBar.i5 i5Var = new org.telegram.ui.ActionBar.i5(context);
        this.d = i5Var;
        i5Var.setTextSize(15);
        i5Var.setTypeface(AndroidUtilities.bold());
        i5Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G6, d6Var));
        this.h = new org.telegram.ui.Components.o5(AndroidUtilities.dp(24.0f), 7, i5Var, false);
        this.f41603n = new org.telegram.ui.Components.o5(AndroidUtilities.dp(24.0f), 7, i5Var, false);
        i5Var.addOnAttachStateChangeListener(new g5(this, 4));
        TextView textView = new TextView(context);
        this.f41601e = textView;
        textView.setPadding(AndroidUtilities.dp(6.66f), 0, AndroidUtilities.dp(6.66f), 0);
        textView.setTextSize(1, 11.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Sh, d6Var));
        textView.setBackground(org.telegram.ui.ActionBar.i6.b0(AndroidUtilities.dp(10.0f), org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Oh, d6Var)));
        ImageView imageView = new ImageView(context);
        this.f41602f = imageView;
        imageView.setImageResource(R.drawable.msg_arrowright);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20984m6, d6Var), PorterDuff.Mode.SRC_IN));
        if (LocaleController.isRTL) {
            i5Var.setGravity(21);
            imageView.setScaleX(-1.0f);
            addView(imageView, w7.z5.p(24, 24, 0.0f, 19, 12, 0, 0, 0));
            addView(textView, w7.z5.p(-2, 20, 0.0f, 16, 0, 0, 0, 0));
            addView(i5Var, w7.z5.p(0, -1, 1.0f, 119, 18, 0, 0, 0));
            addView(w9Var, w7.z5.t(28, 28, 21, 18, 0, 18, 0));
            return;
        }
        i5Var.setGravity(19);
        addView(w9Var, w7.z5.t(28, 28, 19, 18, 0, 18, 0));
        addView(i5Var, w7.z5.p(0, -1, 1.0f, 119, 0, 0, 18, 0));
        addView(textView, w7.z5.p(-2, 20, 0.0f, 16, 0, 0, 0, 0));
        addView(imageView, w7.z5.p(24, 24, 0.0f, 21, 0, 0, 12, 0));
    }

    @Override
    public final void e() {
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        org.telegram.ui.ActionBar.d6 d6Var = this.f41598a;
        this.d.setTextColor(org.telegram.ui.ActionBar.i6.v0(i10, d6Var));
        this.f41601e.setBackground(org.telegram.ui.ActionBar.i6.b0(AndroidUtilities.dp(10.0f), org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Oh, d6Var)));
        this.f41602f.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20984m6, d6Var), PorterDuff.Mode.SRC_IN));
        this.f41603n.k(Integer.valueOf(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21235zh, d6Var)));
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }

    public void set(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.v81.set(int):void");
    }
}
