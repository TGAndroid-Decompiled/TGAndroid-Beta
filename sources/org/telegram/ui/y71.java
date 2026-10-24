package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class y71 extends LinearLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.g6 f43776a;
    public final org.telegram.ui.Components.kc0 f43777b;
    public final FrameLayout f43778c;
    public final ImageView d;
    public final TextView e;
    public final TextView f43779f;
    public final TextView h;
    public boolean f43780n;
    public boolean f43781r;

    public y71(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f43780n = true;
        this.f43776a = g6Var;
        setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f43778c = frameLayout;
        org.telegram.ui.Components.kc0 kc0Var = new org.telegram.ui.Components.kc0(1);
        this.f43777b = kc0Var;
        frameLayout.setBackground(kc0Var);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        frameLayout.addView(imageView, w7.z5.e(24, 24, 17));
        LinearLayout e = org.telegram.messenger.tl.e(context, 1);
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 16.0f);
        TextView f7 = org.telegram.messenger.tl.f(e, textView, w7.z5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2), context);
        this.f43779f = f7;
        f7.setTextSize(1, 13.0f);
        TextView f10 = org.telegram.messenger.tl.f(e, f7, w7.z5.k(0.0f, 4.0f, 0.0f, 0.0f, -1, -2), context);
        this.h = f10;
        f10.setTextSize(1, 16.0f);
        if (LocaleController.isRTL) {
            addView(f10, w7.z5.t(-2, -2, 16, 20, 0, 0, 0));
            addView(e, w7.z5.p(0, -2, 1.0f, 23, 20, 0, 18, 0));
            addView(frameLayout, w7.z5.t(28, 28, 21, 0, 0, 18, 0));
        } else {
            addView(frameLayout, w7.z5.t(28, 28, 19, 18, 0, 0, 0));
            addView(e, w7.z5.p(0, -2, 1.0f, 23, 18, 0, 20, 0));
            addView(f10, w7.z5.t(-2, -2, 16, 0, 0, 20, 0));
        }
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21572y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21367n6));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        if (this.f43781r) {
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

    @Override
    public final void updateColors() {
        boolean z10;
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.g6 g6Var = this.f43776a;
        this.e.setTextColor(org.telegram.ui.ActionBar.k6.w0(i10, g6Var));
        this.f43779f.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21572y6, g6Var));
        this.h.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21367n6, g6Var));
        if (this.f43780n && (g6Var == null ? org.telegram.ui.ActionBar.k6.I.q() : g6Var.a())) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f43777b.f28004b = z10;
    }
}
