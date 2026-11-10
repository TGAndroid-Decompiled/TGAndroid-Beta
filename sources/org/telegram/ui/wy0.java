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
public final class wy0 extends org.telegram.ui.Components.ma {
    public final LinearLayout S1;
    public final org.telegram.ui.Components.wp T1;
    public final org.telegram.ui.Components.w70 U1;
    public org.telegram.ui.Components.m41 V1;

    public wy0(Context context, boolean z9, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.messenger.c20 c20Var) {
        super(context, null, false, false, h6Var);
        org.telegram.ui.ActionBar.h6 h6Var2;
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        N();
        this.f35908u1 = 0.2f;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        int i16 = org.telegram.ui.ActionBar.m6.Ci;
        paint.setColor(org.telegram.ui.ActionBar.m6.w0(i16, h6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        this.S1 = linearLayout;
        linearLayout.setPadding(org.telegram.messenger.g0.L(6.0f) + this.f28705t0, 0, org.telegram.messenger.g0.L(6.0f) + this.f28705t0, 0);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(getContext());
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131231600);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        ShapeDrawable L = org.telegram.ui.ActionBar.m6.L(org.telegram.messenger.g0.L(80.0f), org.telegram.ui.ActionBar.m6.w0(i16, h6Var));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i16);
        imageView.setBackground(L);
        org.telegram.ui.ActionBar.t6.j(imageView, L, M, null, h6Var);
        frameLayout.addView(imageView, c8.ha.d(80, 80.0f, 1, 0.0f, 20.0f, 0.0f, 0.0f));
        if (c20Var != null) {
            ImageView imageView2 = new ImageView(context);
            imageView2.setImageDrawable(context.getDrawable(2131231244));
            imageView2.setContentDescription(org.telegram.messenger.id.M0(2131754839, null));
            imageView2.setScaleType(scaleType);
            org.telegram.ui.ActionBar.t6.s(imageView2, org.telegram.ui.ActionBar.m6.f28148r5, null, PorterDuff.Mode.SRC_ATOP);
            int i17 = org.telegram.ui.ActionBar.m6.f27982i6;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.x0(null, i17, false), 1, -1);
            org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i17);
            imageView2.setBackground(h02);
            org.telegram.ui.ActionBar.t6.j(imageView2, h02, null, M2, null);
            h6Var2 = h6Var;
            imageView2.setOnClickListener(new di.v3(this, c20Var, h6Var, imageView2, 15));
            frameLayout.addView(imageView2, c8.ha.d(24, 24.0f, 53, 12.0f, 14.0f, 14.0f, 12.0f));
        } else {
            h6Var2 = h6Var;
        }
        linearLayout.addView(frameLayout, c8.ha.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 100));
        TextView textView = new TextView(context);
        textView.setText(org.telegram.messenger.id.M0(2131754943, null));
        textView.setTypeface(org.telegram.messenger.g0.o());
        int i18 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.t6.U(textView, i18, h6Var2);
        textView.setTextSize(1, 20.0f);
        textView.setGravity(1);
        TextView f10 = org.telegram.messenger.camera.q.f(linearLayout, textView, c8.ha.t(-2, -2, 1, 22, 14, 22, 0), context);
        f10.setText(org.telegram.messenger.id.M0(2131746044, null));
        org.telegram.ui.ActionBar.t6.U(f10, i18, h6Var2);
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
        linearLayout.addView(new vq0(this, context, 2131231860, M0, org.telegram.messenger.id.M0(i10, null)), c8.ha.q(-1, -2, 0.0f, 0, 0, 20, 0, 0));
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
        linearLayout.addView(new vq0(this, context, 2131231814, M02, org.telegram.messenger.id.M0(i12, null)), c8.ha.q(-1, -2, 0.0f, 0, 0, 16, 0, 0));
        if (z9) {
            i13 = 2131746034;
        } else {
            i13 = 2131746035;
        }
        String a02 = org.telegram.messenger.id.a0(null, null, i13, Integer.valueOf(org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24474s0).f24962z4));
        int i19 = org.telegram.ui.ActionBar.m6.Uc;
        linearLayout.addView(new vq0(this, context, 2131231807, org.telegram.messenger.id.M0(2131746033, null), org.telegram.messenger.g0.S2(a02, i19, 0, new Runnable(this) {
            public final wy0 f50827b;

            {
                this.f50827b = this;
            }

            @Override
            public final void run() {
                int i20 = r2;
                wy0 wy0Var = this.f50827b;
                switch (i20) {
                    case 0:
                        wy0Var.getClass();
                        org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                        if (T != null) {
                            T.presentFragment(new PremiumPreviewFragment(0, PremiumPreviewFragment.q0(3)));
                            wy0Var.dismiss();
                            return;
                        }
                        return;
                    default:
                        wy0Var.dismiss();
                        vf.c.t(wy0Var.getContext(), org.telegram.messenger.id.M0(2131746618, null));
                        return;
                }
            }
        }, null)), c8.ha.q(-1, -2, 0.0f, 0, 0, 16, 0, 0));
        View view = new View(getContext());
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f27891d7, view, h6Var2);
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
        org.telegram.ui.ActionBar.t6.U(textView2, i18, h6Var2);
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
            public final wy0 f50827b;

            {
                this.f50827b = this;
            }

            @Override
            public final void run() {
                int i20 = r2;
                wy0 wy0Var = this.f50827b;
                switch (i20) {
                    case 0:
                        wy0Var.getClass();
                        org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                        if (T != null) {
                            T.presentFragment(new PremiumPreviewFragment(0, PremiumPreviewFragment.q0(3)));
                            wy0Var.dismiss();
                            return;
                        }
                        return;
                    default:
                        wy0Var.dismiss();
                        vf.c.t(wy0Var.getContext(), org.telegram.messenger.id.M0(2131746618, null));
                        return;
                }
            }
        }, null);
        SpannableString spannableString = new SpannableString(">");
        org.telegram.ui.Components.wp wpVar = new org.telegram.ui.Components.wp(2131230875, 0);
        this.T1 = wpVar;
        wpVar.f40042y = org.telegram.ui.ActionBar.m6.x0(null, i19, false);
        wpVar.H = 0.7f;
        wpVar.I = 0.7f;
        wpVar.E = org.telegram.messenger.g0.L(12.0f);
        wpVar.f40039s = 1.0f;
        spannableString.setSpan(wpVar, 0, spannableString.length(), 33);
        SpannableStringBuilder K2 = org.telegram.messenger.g0.K2(org.telegram.messenger.g0.K2(X2, S2, "%1$s"), spannableString, ">");
        org.telegram.ui.Components.w70 w70Var = new org.telegram.ui.Components.w70(context, null);
        this.U1 = w70Var;
        w70Var.setText(K2);
        org.telegram.ui.ActionBar.t6.U(w70Var, i18, h6Var2);
        w70Var.setTextSize(1, 14.0f);
        w70Var.setGravity(1);
        w70Var.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        linearLayout.addView(w70Var, c8.ha.t(-2, -2, 1, 26, 8, 26, 0));
        TextView textView3 = new TextView(context);
        textView3.setLines(1);
        textView3.setSingleLine(true);
        textView3.setGravity(17);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        org.telegram.ui.ActionBar.t6.U(textView3, org.telegram.ui.ActionBar.m6.Gi, h6Var2);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setTextSize(1, 14.0f);
        textView3.setText(org.telegram.messenger.id.M0(2131746045, null));
        org.telegram.ui.Cells.y e10 = org.telegram.ui.ActionBar.b6.e(org.telegram.ui.ActionBar.m6.w0(i16, h6Var2), 6.0f);
        org.telegram.ui.ActionBar.p6 M3 = org.telegram.ui.ActionBar.t6.M(i16);
        org.telegram.ui.ActionBar.p6 e11 = org.telegram.ui.ActionBar.t6.e(i16);
        textView3.setBackground(e10);
        org.telegram.ui.ActionBar.t6.j(textView3, e10, M3, e11, h6Var2);
        textView3.setOnClickListener(new qy0(this, 1));
        linearLayout.addView(textView3, c8.ha.t(-1, 48, 0, 14, 22, 14, 14));
        this.V1.O(false);
    }

    public static wy0 d1(Context context, org.telegram.ui.ActionBar.f2 f2Var, boolean z9, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.messenger.voip.k kVar) {
        wy0 wy0Var = new wy0(context, z9, h6Var, kVar);
        if (f2Var != null) {
            if (f2Var.getParentActivity() != null) {
                f2Var.showDialog(wy0Var);
            }
            return wy0Var;
        }
        wy0Var.show();
        return wy0Var;
    }

    public static void e1(Context context, org.telegram.ui.ActionBar.h6 h6Var, cn cnVar) {
        d1(context, cnVar, false, h6Var, null);
    }

    @Override
    public final org.telegram.ui.Components.oj0 L0(org.telegram.ui.Components.pj0 pj0Var) {
        org.telegram.ui.Components.m41 m41Var = new org.telegram.ui.Components.m41(pj0Var, getContext(), this.f28669a, 0, true, new a5(this, 21), this.I0);
        this.V1 = m41Var;
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
            org.telegram.ui.Components.wp wpVar = this.T1;
            if (wpVar != null) {
                wpVar.f40042y = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Uc, false);
                org.telegram.ui.Components.w70 w70Var = this.U1;
                if (w70Var != null) {
                    w70Var.invalidate();
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
