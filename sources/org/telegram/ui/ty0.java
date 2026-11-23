package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class ty0 extends org.telegram.ui.Components.ra {
    public final LinearLayout T1;
    public final org.telegram.ui.Components.kq U1;
    public final org.telegram.ui.Components.j80 V1;
    public org.telegram.ui.Components.b51 W1;

    public ty0(Context context, boolean z10, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.messenger.w10 w10Var) {
        super(context, null, false, false, i6Var);
        org.telegram.ui.ActionBar.i6 i6Var2;
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        O();
        this.f39253v1 = 0.2f;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        int i16 = org.telegram.ui.ActionBar.n6.Fi;
        paint.setColor(org.telegram.ui.ActionBar.n6.w0(i16, i6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        this.T1 = linearLayout;
        linearLayout.setPadding(org.telegram.messenger.g0.L(6.0f) + this.f30261u0, 0, org.telegram.messenger.g0.L(6.0f) + this.f30261u0, 0);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(getContext());
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131231604);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        ShapeDrawable L = org.telegram.ui.ActionBar.n6.L(org.telegram.messenger.g0.L(80.0f), org.telegram.ui.ActionBar.n6.w0(i16, i6Var));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i16);
        imageView.setBackground(L);
        org.telegram.ui.ActionBar.u6.j(imageView, L, M, null, i6Var);
        frameLayout.addView(imageView, c8.na.d(80, 80.0f, 1, 0.0f, 20.0f, 0.0f, 0.0f));
        if (w10Var != null) {
            ImageView imageView2 = new ImageView(context);
            imageView2.setImageDrawable(context.getDrawable(2131231247));
            imageView2.setContentDescription(org.telegram.messenger.gd.N0(2131754838, null));
            imageView2.setScaleType(scaleType);
            org.telegram.ui.ActionBar.u6.s(imageView2, org.telegram.ui.ActionBar.n6.f29709r5, null, PorterDuff.Mode.SRC_ATOP);
            int i17 = org.telegram.ui.ActionBar.n6.f29543i6;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.x0(null, i17, false), 1, -1);
            org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i17);
            imageView2.setBackground(h02);
            org.telegram.ui.ActionBar.u6.j(imageView2, h02, null, M2, null);
            i6Var2 = i6Var;
            imageView2.setOnClickListener(new bi.s6(this, w10Var, i6Var, imageView2, 16));
            frameLayout.addView(imageView2, c8.na.d(24, 24.0f, 53, 12.0f, 14.0f, 14.0f, 12.0f));
        } else {
            i6Var2 = i6Var;
        }
        linearLayout.addView(frameLayout, c8.na.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 100));
        TextView textView = new TextView(context);
        textView.setText(org.telegram.messenger.gd.N0(2131754943, null));
        textView.setTypeface(org.telegram.messenger.g0.o());
        int i18 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.u6.U(textView, i18, i6Var2);
        textView.setTextSize(1, 20.0f);
        textView.setGravity(1);
        TextView f10 = org.telegram.messenger.m10.f(linearLayout, textView, c8.na.t(-2, -2, 1, 22, 14, 22, 0), context);
        f10.setText(org.telegram.messenger.gd.N0(2131745848, null));
        org.telegram.ui.ActionBar.u6.U(f10, i18, i6Var2);
        f10.setTextSize(1, 14.0f);
        f10.setGravity(1);
        linearLayout.addView(f10, c8.na.t(-2, -2, 1, 22, 8, 22, 0));
        if (z10) {
            i7 = 2131745844;
        } else {
            i7 = 2131745845;
        }
        String N0 = org.telegram.messenger.gd.N0(i7, null);
        if (z10) {
            i10 = 2131745846;
        } else {
            i10 = 2131745847;
        }
        linearLayout.addView(new gh0(this, context, 2131231864, N0, org.telegram.messenger.gd.N0(i10, null)), c8.na.q(-1, -2, 0.0f, 0, 0, 20, 0, 0));
        if (z10) {
            i11 = 2131745840;
        } else {
            i11 = 2131745841;
        }
        String N02 = org.telegram.messenger.gd.N0(i11, null);
        if (z10) {
            i12 = 2131745842;
        } else {
            i12 = 2131745843;
        }
        linearLayout.addView(new gh0(this, context, 2131231818, N02, org.telegram.messenger.gd.N0(i12, null)), c8.na.q(-1, -2, 0.0f, 0, 0, 16, 0, 0));
        if (z10) {
            i13 = 2131745838;
        } else {
            i13 = 2131745839;
        }
        String a02 = org.telegram.messenger.gd.a0(null, null, i13, Integer.valueOf(org.telegram.messenger.mp.u1(org.telegram.messenger.i10.f24637t0).C4));
        int i19 = org.telegram.ui.ActionBar.n6.Xc;
        linearLayout.addView(new gh0(this, context, 2131231811, org.telegram.messenger.gd.N0(2131745837, null), org.telegram.messenger.g0.R2(a02, i19, 0, new Runnable(this) {
            public final ty0 f52175b;

            {
                this.f52175b = this;
            }

            @Override
            public final void run() {
                int i20 = r2;
                ty0 ty0Var = this.f52175b;
                switch (i20) {
                    case 0:
                        ty0Var.getClass();
                        org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                        if (T != null) {
                            T.presentFragment(new PremiumPreviewFragment(0, PremiumPreviewFragment.q0(3)));
                            ty0Var.dismiss();
                            return;
                        }
                        return;
                    default:
                        ty0Var.dismiss();
                        vf.c.t(ty0Var.getContext(), org.telegram.messenger.gd.N0(2131746422, null));
                        return;
                }
            }
        }, null)), c8.na.q(-1, -2, 0.0f, 0, 0, 16, 0, 0));
        View view = new View(getContext());
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29452d7, view, i6Var2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 1);
        layoutParams.setMargins(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(20.0f));
        linearLayout.addView(view, layoutParams);
        TextView textView2 = new TextView(context);
        if (z10) {
            i14 = 2131745832;
        } else {
            i14 = 2131745833;
        }
        textView2.setText(org.telegram.messenger.gd.N0(i14, null));
        textView2.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.u6.U(textView2, i18, i6Var2);
        textView2.setTextSize(1, 20.0f);
        textView2.setTextAlignment(4);
        textView2.setGravity(17);
        linearLayout.addView(textView2, c8.na.t(-2, -2, 1, 22, 0, 22, 0));
        if (z10) {
            i15 = 2131745835;
        } else {
            i15 = 2131745836;
        }
        SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(i15, null));
        SpannableStringBuilder R2 = org.telegram.messenger.g0.R2(org.telegram.messenger.gd.N0(2131745834, null), i19, 0, new Runnable(this) {
            public final ty0 f52175b;

            {
                this.f52175b = this;
            }

            @Override
            public final void run() {
                int i20 = r2;
                ty0 ty0Var = this.f52175b;
                switch (i20) {
                    case 0:
                        ty0Var.getClass();
                        org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                        if (T != null) {
                            T.presentFragment(new PremiumPreviewFragment(0, PremiumPreviewFragment.q0(3)));
                            ty0Var.dismiss();
                            return;
                        }
                        return;
                    default:
                        ty0Var.dismiss();
                        vf.c.t(ty0Var.getContext(), org.telegram.messenger.gd.N0(2131746422, null));
                        return;
                }
            }
        }, null);
        SpannableString spannableString = new SpannableString(">");
        org.telegram.ui.Components.kq kqVar = new org.telegram.ui.Components.kq(2131230875, 0);
        this.U1 = kqVar;
        kqVar.f36857y = org.telegram.ui.ActionBar.n6.x0(null, i19, false);
        kqVar.I = 0.7f;
        kqVar.J = 0.7f;
        kqVar.F = org.telegram.messenger.g0.L(12.0f);
        kqVar.f36854s = 1.0f;
        spannableString.setSpan(kqVar, 0, spannableString.length(), 33);
        SpannableStringBuilder K2 = org.telegram.messenger.g0.K2(org.telegram.messenger.g0.K2(W2, R2, "%1$s"), spannableString, ">");
        org.telegram.ui.Components.j80 j80Var = new org.telegram.ui.Components.j80(context, null);
        this.V1 = j80Var;
        j80Var.setText(K2);
        org.telegram.ui.ActionBar.u6.U(j80Var, i18, i6Var2);
        j80Var.setTextSize(1, 14.0f);
        j80Var.setGravity(1);
        j80Var.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        linearLayout.addView(j80Var, c8.na.t(-2, -2, 1, 26, 8, 26, 0));
        TextView textView3 = new TextView(context);
        textView3.setLines(1);
        textView3.setSingleLine(true);
        textView3.setGravity(17);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        org.telegram.ui.ActionBar.u6.U(textView3, org.telegram.ui.ActionBar.n6.Ji, i6Var2);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setTextSize(1, 14.0f);
        textView3.setText(org.telegram.messenger.gd.N0(2131745849, null));
        org.telegram.ui.Cells.y e10 = org.telegram.ui.ActionBar.b6.e(org.telegram.ui.ActionBar.n6.w0(i16, i6Var2), 6.0f);
        org.telegram.ui.ActionBar.q6 M3 = org.telegram.ui.ActionBar.u6.M(i16);
        org.telegram.ui.ActionBar.q6 e11 = org.telegram.ui.ActionBar.u6.e(i16);
        textView3.setBackground(e10);
        org.telegram.ui.ActionBar.u6.j(textView3, e10, M3, e11, i6Var2);
        textView3.setOnClickListener(new ny0(this, 1));
        linearLayout.addView(textView3, c8.na.t(-1, 48, 0, 14, 22, 14, 14));
        this.W1.O(false);
    }

    public static ty0 e1(Context context, org.telegram.ui.ActionBar.g2 g2Var, boolean z10, org.telegram.ui.ActionBar.i6 i6Var, ki.n2 n2Var) {
        ty0 ty0Var = new ty0(context, z10, i6Var, n2Var);
        if (g2Var != null) {
            if (g2Var.getParentActivity() != null) {
                g2Var.showDialog(ty0Var);
            }
            return ty0Var;
        }
        ty0Var.show();
        return ty0Var;
    }

    public static void f1(Context context, org.telegram.ui.ActionBar.i6 i6Var, bn bnVar) {
        e1(context, bnVar, false, i6Var, null);
    }

    @Override
    public final org.telegram.ui.Components.dk0 M0(org.telegram.ui.Components.ek0 ek0Var) {
        org.telegram.ui.Components.b51 b51Var = new org.telegram.ui.Components.b51(ek0Var, getContext(), this.f30223a, 0, true, new a5(this, 21), this.J0);
        this.W1 = b51Var;
        return b51Var;
    }

    @Override
    public final CharSequence P0() {
        return org.telegram.messenger.gd.N0(2131754943, null);
    }

    @Override
    public final void s0() {
        super.s0();
        try {
            org.telegram.ui.Components.kq kqVar = this.U1;
            if (kqVar != null) {
                kqVar.f36857y = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Xc, false);
                org.telegram.ui.Components.j80 j80Var = this.V1;
                if (j80Var != null) {
                    j80Var.invalidate();
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
