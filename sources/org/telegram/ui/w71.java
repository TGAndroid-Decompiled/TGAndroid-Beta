package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class w71 extends LinearLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.g6 f42935a;
    public final org.telegram.ui.Components.f9 f42936b;
    public final org.telegram.ui.Components.u9 f42937c;
    public final org.telegram.ui.ActionBar.n5 d;
    public final TextView e;
    public final ImageView f42938f;
    public final org.telegram.ui.Components.n5 h;
    public final org.telegram.ui.Components.n5 f42939n;
    public int f42940r;

    public w71(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f42935a = g6Var;
        setOrientation(0);
        this.f42936b = new org.telegram.ui.Components.f9((org.telegram.ui.ActionBar.g6) null);
        org.telegram.ui.Components.u9 u9Var = new org.telegram.ui.Components.u9(context);
        this.f42937c = u9Var;
        u9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.d = n5Var;
        n5Var.setTextSize(15);
        n5Var.setTypeface(AndroidUtilities.bold());
        org.telegram.ui.ActionBar.r6.Z(n5Var, org.telegram.ui.ActionBar.k6.G6, g6Var);
        this.h = new org.telegram.ui.Components.n5(AndroidUtilities.dp(24.0f), 7, n5Var, false);
        this.f42939n = new org.telegram.ui.Components.n5(AndroidUtilities.dp(24.0f), 7, n5Var, false);
        n5Var.addOnAttachStateChangeListener(new j5(this, 4));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setPadding(AndroidUtilities.dp(6.66f), 0, AndroidUtilities.dp(6.66f), 0);
        textView.setTextSize(1, 11.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.Sh, g6Var);
        int dp = AndroidUtilities.dp(10.0f);
        int i10 = org.telegram.ui.ActionBar.k6.Oh;
        ShapeDrawable c02 = org.telegram.ui.ActionBar.k6.c0(dp, org.telegram.ui.ActionBar.k6.w0(i10, g6Var));
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i10);
        textView.setBackground(c02);
        org.telegram.ui.ActionBar.r6.k(textView, c02, O, null, g6Var);
        ImageView imageView = new ImageView(context);
        this.f42938f = imageView;
        imageView.setImageResource(R.drawable.msg_arrowright);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.f21347m6, g6Var, PorterDuff.Mode.SRC_IN);
        if (LocaleController.isRTL) {
            n5Var.setGravity(21);
            imageView.setScaleX(-1.0f);
            addView(imageView, w7.z5.p(24, 24, 0.0f, 19, 12, 0, 0, 0));
            addView(textView, w7.z5.p(-2, 20, 0.0f, 16, 0, 0, 0, 0));
            addView(n5Var, w7.z5.p(0, -1, 1.0f, 119, 18, 0, 0, 0));
            addView(u9Var, w7.z5.t(28, 28, 21, 18, 0, 18, 0));
            return;
        }
        n5Var.setGravity(19);
        addView(u9Var, w7.z5.t(28, 28, 19, 18, 0, 18, 0));
        addView(n5Var, w7.z5.p(0, -1, 1.0f, 119, 0, 0, 18, 0));
        addView(textView, w7.z5.p(-2, 20, 0.0f, 16, 0, 0, 0, 0));
        addView(imageView, w7.z5.p(24, 24, 0.0f, 21, 0, 0, 12, 0));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21599zh));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }

    public void set(int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.w71.set(int):void");
    }

    @Override
    public final void updateColors() {
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.g6 g6Var = this.f42935a;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i10, g6Var);
        org.telegram.ui.ActionBar.n5 n5Var = this.d;
        n5Var.setTextColor(w02);
        TextView textView = this.e;
        org.telegram.ui.ActionBar.k6.z1(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Oh, g6Var), textView.getBackground());
        textView.invalidate();
        int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21347m6, g6Var);
        int i11 = this.f42940r;
        ImageView imageView = this.f42938f;
        if (w03 != i11 || imageView.getColorFilter() == null) {
            this.f42940r = w03;
            imageView.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
        }
        int i12 = org.telegram.ui.ActionBar.k6.f21599zh;
        this.f42939n.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(i12, g6Var)));
        try {
            org.telegram.ui.Components.n5 n5Var2 = this.h;
            if (n5Var2 != null) {
                n5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(i12, g6Var)));
                if (n5Var != null) {
                    n5Var.invalidate();
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
