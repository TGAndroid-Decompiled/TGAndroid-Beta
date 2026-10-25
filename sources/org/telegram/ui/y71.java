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
public final class y71 extends LinearLayout implements org.telegram.ui.ActionBar.p6 {
    public final org.telegram.ui.ActionBar.u6 f45977a;
    public final org.telegram.ui.Components.j9 f45978b;
    public final org.telegram.ui.Components.y9 f45979c;
    public final org.telegram.ui.ActionBar.b6 d;
    public final TextView e;
    public final ImageView f45980f;
    public final org.telegram.ui.Components.r5 h;
    public final org.telegram.ui.Components.r5 f45981n;
    public int f45982r;

    public y71(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.f45977a = u6Var;
        setOrientation(0);
        this.f45978b = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.f45979c = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6(context);
        this.d = b6Var;
        b6Var.setTextSize(15);
        b6Var.setTypeface(AndroidUtilities.bold());
        org.telegram.ui.ActionBar.f7.Y(b6Var, org.telegram.ui.ActionBar.y6.G6, u6Var);
        this.h = new org.telegram.ui.Components.r5(AndroidUtilities.dp(24.0f), 7, b6Var, false);
        this.f45981n = new org.telegram.ui.Components.r5(AndroidUtilities.dp(24.0f), 7, b6Var, false);
        b6Var.addOnAttachStateChangeListener(new i5(this, 4));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setPadding(AndroidUtilities.dp(6.66f), 0, AndroidUtilities.dp(6.66f), 0);
        textView.setTextSize(1, 11.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.Sh, u6Var);
        int dp = AndroidUtilities.dp(10.0f);
        int i10 = org.telegram.ui.ActionBar.y6.Oh;
        ShapeDrawable c02 = org.telegram.ui.ActionBar.y6.c0(dp, org.telegram.ui.ActionBar.y6.w0(i10, u6Var));
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i10);
        textView.setBackground(c02);
        org.telegram.ui.ActionBar.f7.k(textView, c02, N, null, u6Var);
        ImageView imageView = new ImageView(context);
        this.f45980f = imageView;
        imageView.setImageResource(R.drawable.msg_arrowright);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.f7.t(imageView, org.telegram.ui.ActionBar.y6.f23518m6, u6Var, PorterDuff.Mode.SRC_IN);
        if (LocaleController.isRTL) {
            b6Var.setGravity(21);
            imageView.setScaleX(-1.0f);
            addView(imageView, org.telegram.ui.Components.gb1.t(24, 24, 0.0f, 19, 12, 0, 0, 0));
            addView(textView, org.telegram.ui.Components.gb1.t(-2, 20, 0.0f, 16, 0, 0, 0, 0));
            addView(b6Var, org.telegram.ui.Components.gb1.t(0, -1, 1.0f, 119, 18, 0, 0, 0));
            addView(y9Var, org.telegram.ui.Components.gb1.x(28, 28, 21, 18, 0, 18, 0));
            return;
        }
        b6Var.setGravity(19);
        addView(y9Var, org.telegram.ui.Components.gb1.x(28, 28, 19, 18, 0, 18, 0));
        addView(b6Var, org.telegram.ui.Components.gb1.t(0, -1, 1.0f, 119, 0, 0, 18, 0));
        addView(textView, org.telegram.ui.Components.gb1.t(-2, 20, 0.0f, 16, 0, 0, 0, 0));
        addView(imageView, org.telegram.ui.Components.gb1.t(24, 24, 0.0f, 21, 0, 0, 12, 0));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23774zh));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }

    public void set(int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.y71.set(int):void");
    }

    @Override
    public final void updateColors() {
        int i10 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.u6 u6Var = this.f45977a;
        int w02 = org.telegram.ui.ActionBar.y6.w0(i10, u6Var);
        org.telegram.ui.ActionBar.b6 b6Var = this.d;
        b6Var.setTextColor(w02);
        TextView textView = this.e;
        org.telegram.ui.ActionBar.y6.z1(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oh, u6Var), textView.getBackground());
        textView.invalidate();
        int w03 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23518m6, u6Var);
        int i11 = this.f45982r;
        ImageView imageView = this.f45980f;
        if (w03 != i11 || imageView.getColorFilter() == null) {
            this.f45982r = w03;
            imageView.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
        }
        int i12 = org.telegram.ui.ActionBar.y6.f23774zh;
        this.f45981n.k(Integer.valueOf(org.telegram.ui.ActionBar.y6.w0(i12, u6Var)));
        try {
            org.telegram.ui.Components.r5 r5Var = this.h;
            if (r5Var != null) {
                r5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.y6.w0(i12, u6Var)));
                if (b6Var != null) {
                    b6Var.invalidate();
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
