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

public final class u71 extends LinearLayout implements org.telegram.ui.ActionBar.x5 {

    public final org.telegram.ui.ActionBar.c6 f43153a;

    public final org.telegram.ui.Components.bb0 f43154b;

    public final FrameLayout f43155c;
    public final ImageView d;

    public final TextView f43156e;

    public final TextView f43157f;
    public final TextView h;

    public boolean f43158n;

    public u71(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f43153a = c6Var;
        setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f43155c = frameLayout;
        org.telegram.ui.Components.bb0 bb0Var = new org.telegram.ui.Components.bb0(1);
        this.f43154b = bb0Var;
        frameLayout.setBackground(bb0Var);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        frameLayout.addView(imageView, h7.z5.e(24, 24, 17));
        LinearLayout linearLayoutG = org.telegram.messenger.y1.g(context, 1);
        TextView textView = new TextView(context);
        this.f43156e = textView;
        textView.setTextSize(1, 16.0f);
        TextView textViewI = org.telegram.ui.Cells.pa.i(linearLayoutG, textView, h7.z5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2), context);
        this.f43157f = textViewI;
        textViewI.setTextSize(1, 13.0f);
        TextView textViewI2 = org.telegram.ui.Cells.pa.i(linearLayoutG, textViewI, h7.z5.k(0.0f, 4.0f, 0.0f, 0.0f, -1, -2), context);
        this.h = textViewI2;
        textViewI2.setTextSize(1, 16.0f);
        if (LocaleController.isRTL) {
            addView(textViewI2, h7.z5.t(-2, -2, 16, 20, 0, 0, 0));
            addView(linearLayoutG, h7.z5.p(0, -2, 1.0f, 23, 20, 0, 18, 0));
            addView(frameLayout, h7.z5.t(28, 28, 21, 0, 0, 18, 0));
        } else {
            addView(frameLayout, h7.z5.t(28, 28, 19, 18, 0, 0, 0));
            addView(linearLayoutG, h7.z5.p(0, -2, 1.0f, 23, 18, 0, 20, 0));
            addView(textViewI2, h7.z5.t(-2, -2, 16, 0, 0, 20, 0));
        }
        d();
    }

    @Override
    public final void d() {
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        org.telegram.ui.ActionBar.c6 c6Var = this.f43153a;
        this.f43156e.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        this.f43157f.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23423y6, c6Var));
        this.h.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23234n6, c6Var));
        this.f43154b.f27060b = c6Var != null ? c6Var.a() : org.telegram.ui.ActionBar.g6.I.q();
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.f43158n ? 60.0f : 50.0f), 1073741824));
    }

    public void setValue(CharSequence charSequence) {
        int i10 = !TextUtils.isEmpty(charSequence) ? 0 : 8;
        TextView textView = this.h;
        textView.setVisibility(i10);
        textView.setText(charSequence);
    }
}
