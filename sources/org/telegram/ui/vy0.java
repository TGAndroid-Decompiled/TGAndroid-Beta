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
public final class vy0 extends org.telegram.ui.Components.na {
    public final LinearLayout P1;
    public final org.telegram.ui.Components.wp Q1;
    public final org.telegram.ui.Components.x70 R1;
    public org.telegram.ui.Components.m41 S1;

    public vy0(Context context, boolean z9, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.messenger.c20 c20Var) {
        super(context, null, false, false, g6Var);
        org.telegram.ui.ActionBar.g6 g6Var2;
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        N();
        this.f36308r1 = 0.2f;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        int i16 = org.telegram.ui.ActionBar.l6.Ci;
        paint.setColor(org.telegram.ui.ActionBar.l6.w0(i16, g6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        this.P1 = linearLayout;
        linearLayout.setPadding(org.telegram.messenger.g0.L(6.0f) + this.f28654t0, 0, org.telegram.messenger.g0.L(6.0f) + this.f28654t0, 0);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(getContext());
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131231600);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        ShapeDrawable L = org.telegram.ui.ActionBar.l6.L(org.telegram.messenger.g0.L(80.0f), org.telegram.ui.ActionBar.l6.w0(i16, g6Var));
        org.telegram.ui.ActionBar.o6 M = org.telegram.ui.ActionBar.s6.M(i16);
        imageView.setBackground(L);
        org.telegram.ui.ActionBar.s6.j(imageView, L, M, null, g6Var);
        frameLayout.addView(imageView, c8.ha.d(80, 80.0f, 1, 0.0f, 20.0f, 0.0f, 0.0f));
        if (c20Var != null) {
            ImageView imageView2 = new ImageView(context);
            imageView2.setImageDrawable(context.getDrawable(2131231244));
            imageView2.setContentDescription(org.telegram.messenger.id.M0(2131754839, null));
            imageView2.setScaleType(scaleType);
            org.telegram.ui.ActionBar.s6.s(imageView2, org.telegram.ui.ActionBar.l6.f28123r5, null, PorterDuff.Mode.SRC_ATOP);
            int i17 = org.telegram.ui.ActionBar.l6.f27957i6;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.l6.h0(org.telegram.ui.ActionBar.l6.x0(null, i17, false), 1, -1);
            org.telegram.ui.ActionBar.o6 M2 = org.telegram.ui.ActionBar.s6.M(i17);
            imageView2.setBackground(h02);
            org.telegram.ui.ActionBar.s6.j(imageView2, h02, null, M2, null);
            g6Var2 = g6Var;
            imageView2.setOnClickListener(new di.v3(this, c20Var, g6Var, imageView2, 15));
            frameLayout.addView(imageView2, c8.ha.d(24, 24.0f, 53, 12.0f, 14.0f, 14.0f, 12.0f));
        } else {
            g6Var2 = g6Var;
        }
        linearLayout.addView(frameLayout, c8.ha.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 100));
        TextView textView = new TextView(context);
        textView.setText(org.telegram.messenger.id.M0(2131754943, null));
        textView.setTypeface(org.telegram.messenger.g0.o());
        int i18 = org.telegram.ui.ActionBar.l6.G6;
        org.telegram.ui.ActionBar.s6.U(textView, i18, g6Var2);
        textView.setTextSize(1, 20.0f);
        textView.setGravity(1);
        TextView f10 = org.telegram.messenger.camera.q.f(linearLayout, textView, c8.ha.t(-2, -2, 1, 22, 14, 22, 0), context);
        f10.setText(org.telegram.messenger.id.M0(2131746044, null));
        org.telegram.ui.ActionBar.s6.U(f10, i18, g6Var2);
        f10.setTextSize(1, 14.0f);
        f10.setGravity(1);
        linearLayout.addView(f10, c8.ha.t(-2, -2, 1, 22, 8, 22, 0));
        if (z9) {
            i7 = 2131746040;
        } else {
            i7 = 2131746041;
        }
        String M0 = org.telegram.messenger.id.M0(i7, null);
        if (z9) {
            i10 = 2131746042;
        } else {
            i10 = 2131746043;
        }
        linearLayout.addView(new uq0(this, context, 2131231860, M0, org.telegram.messenger.id.M0(i10, null)), c8.ha.q(-1, -2, 0.0f, 0, 0, 20, 0, 0));
        if (z9) {
            i11 = 2131746036;
        } else {
            i11 = 2131746037;
        }
        String M02 = org.telegram.messenger.id.M0(i11, null);
        if (z9) {
            i12 = 2131746038;
        } else {
            i12 = 2131746039;
        }
        linearLayout.addView(new uq0(this, context, 2131231814, M02, org.telegram.messenger.id.M0(i12, null)), c8.ha.q(-1, -2, 0.0f, 0, 0, 16, 0, 0));
        if (z9) {
            i13 = 2131746034;
        } else {
            i13 = 2131746035;
        }
        String a02 = org.telegram.messenger.id.a0(null, null, i13, Integer.valueOf(org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24470s0).f24958z4));
        int i19 = org.telegram.ui.ActionBar.l6.Uc;
        linearLayout.addView(new uq0(this, context, 2131231807, org.telegram.messenger.id.M0(2131746033, null), org.telegram.messenger.g0.S2(a02, i19, 0, new Runnable(this) {
            public final vy0 f50498b;

            {
                this.f50498b = this;
            }

            @Override
            public final void run() {
                int i20 = r2;
                vy0 vy0Var = this.f50498b;
                switch (i20) {
                    case 0:
                        vy0Var.getClass();
                        org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                        if (T != null) {
                            T.presentFragment(new PremiumPreviewFragment(0, PremiumPreviewFragment.q0(3)));
                            vy0Var.dismiss();
                            return;
                        }
                        return;
                    default:
                        vy0Var.dismiss();
                        vf.c.t(vy0Var.getContext(), org.telegram.messenger.id.M0(2131746618, null));
                        return;
                }
            }
        }, null)), c8.ha.q(-1, -2, 0.0f, 0, 0, 16, 0, 0));
        View view = new View(getContext());
        org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27866d7, view, g6Var2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 1);
        layoutParams.setMargins(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(20.0f));
        linearLayout.addView(view, layoutParams);
        TextView textView2 = new TextView(context);
        if (z9) {
            i14 = 2131746028;
        } else {
            i14 = 2131746029;
        }
        textView2.setText(org.telegram.messenger.id.M0(i14, null));
        textView2.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.s6.U(textView2, i18, g6Var2);
        textView2.setTextSize(1, 20.0f);
        textView2.setTextAlignment(4);
        textView2.setGravity(17);
        linearLayout.addView(textView2, c8.ha.t(-2, -2, 1, 22, 0, 22, 0));
        if (z9) {
            i15 = 2131746031;
        } else {
            i15 = 2131746032;
        }
        SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(i15, null));
        SpannableStringBuilder S2 = org.telegram.messenger.g0.S2(org.telegram.messenger.id.M0(2131746030, null), i19, 0, new Runnable(this) {
            public final vy0 f50498b;

            {
                this.f50498b = this;
            }

            @Override
            public final void run() {
                int i20 = r2;
                vy0 vy0Var = this.f50498b;
                switch (i20) {
                    case 0:
                        vy0Var.getClass();
                        org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                        if (T != null) {
                            T.presentFragment(new PremiumPreviewFragment(0, PremiumPreviewFragment.q0(3)));
                            vy0Var.dismiss();
                            return;
                        }
                        return;
                    default:
                        vy0Var.dismiss();
                        vf.c.t(vy0Var.getContext(), org.telegram.messenger.id.M0(2131746618, null));
                        return;
                }
            }
        }, null);
        SpannableString spannableString = new SpannableString(">");
        org.telegram.ui.Components.wp wpVar = new org.telegram.ui.Components.wp(2131230875, 0);
        this.Q1 = wpVar;
        wpVar.f40124y = org.telegram.ui.ActionBar.l6.x0(null, i19, false);
        wpVar.H = 0.7f;
        wpVar.I = 0.7f;
        wpVar.E = org.telegram.messenger.g0.L(12.0f);
        wpVar.f40121s = 1.0f;
        spannableString.setSpan(wpVar, 0, spannableString.length(), 33);
        SpannableStringBuilder K2 = org.telegram.messenger.g0.K2(org.telegram.messenger.g0.K2(X2, S2, "%1$s"), spannableString, ">");
        org.telegram.ui.Components.x70 x70Var = new org.telegram.ui.Components.x70(context, null);
        this.R1 = x70Var;
        x70Var.setText(K2);
        org.telegram.ui.ActionBar.s6.U(x70Var, i18, g6Var2);
        x70Var.setTextSize(1, 14.0f);
        x70Var.setGravity(1);
        x70Var.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        linearLayout.addView(x70Var, c8.ha.t(-2, -2, 1, 26, 8, 26, 0));
        TextView textView3 = new TextView(context);
        textView3.setLines(1);
        textView3.setSingleLine(true);
        textView3.setGravity(17);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        org.telegram.ui.ActionBar.s6.U(textView3, org.telegram.ui.ActionBar.l6.Gi, g6Var2);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setTextSize(1, 14.0f);
        textView3.setText(org.telegram.messenger.id.M0(2131746045, null));
        org.telegram.ui.Cells.y e10 = org.telegram.ui.ActionBar.a6.e(org.telegram.ui.ActionBar.l6.w0(i16, g6Var2), 6.0f);
        org.telegram.ui.ActionBar.o6 M3 = org.telegram.ui.ActionBar.s6.M(i16);
        org.telegram.ui.ActionBar.o6 e11 = org.telegram.ui.ActionBar.s6.e(i16);
        textView3.setBackground(e10);
        org.telegram.ui.ActionBar.s6.j(textView3, e10, M3, e11, g6Var2);
        textView3.setOnClickListener(new py0(this, 1));
        linearLayout.addView(textView3, c8.ha.t(-1, 48, 0, 14, 22, 14, 14));
        this.S1.O(false);
    }

    public static vy0 d1(Context context, org.telegram.ui.ActionBar.f2 f2Var, boolean z9, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.messenger.voip.k kVar) {
        vy0 vy0Var = new vy0(context, z9, g6Var, kVar);
        if (f2Var != null) {
            if (f2Var.getParentActivity() != null) {
                f2Var.showDialog(vy0Var);
            }
            return vy0Var;
        }
        vy0Var.show();
        return vy0Var;
    }

    public static void e1(Context context, org.telegram.ui.ActionBar.g6 g6Var, cn cnVar) {
        d1(context, cnVar, false, g6Var, null);
    }

    @Override
    public final org.telegram.ui.Components.pj0 L0(org.telegram.ui.Components.qj0 qj0Var) {
        org.telegram.ui.Components.m41 m41Var = new org.telegram.ui.Components.m41(qj0Var, getContext(), this.f28621a, 0, true, new a5(this, 21), this.I0);
        this.S1 = m41Var;
        return m41Var;
    }

    @Override
    public final CharSequence O0() {
        return org.telegram.messenger.id.M0(2131754943, null);
    }

    @Override
    public final void s0() {
        super.s0();
        try {
            org.telegram.ui.Components.wp wpVar = this.Q1;
            if (wpVar != null) {
                wpVar.f40124y = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Uc, false);
                org.telegram.ui.Components.x70 x70Var = this.R1;
                if (x70Var != null) {
                    x70Var.invalidate();
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
