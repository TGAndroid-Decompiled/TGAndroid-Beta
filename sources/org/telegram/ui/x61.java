package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public abstract class x61 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final FrameLayout f39395a;
    public final ImageView f39396b;
    public final ImageView f39397c;
    public final org.telegram.ui.Components.jg0 d;
    public final View e;
    public final org.telegram.ui.Components.ym0 f39398f;
    public final org.telegram.ui.Cells.b6 h;
    public w61 f39399n;
    public float f39400r;
    public ValueAnimator f39401s;
    public g01 v;
    public boolean f39402w;
    public boolean f39403x;
    public final i71 f39404y;

    public x61(i71 i71Var, Context context, boolean z10) {
        super(context);
        org.telegram.ui.ActionBar.f6 f6Var = i71Var.Z0;
        this.f39404y = i71Var;
        this.f39402w = false;
        setClickable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f39395a = frameLayout;
        if (z10) {
            setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, f6Var));
        }
        int dp = AndroidUtilities.dp(18.0f);
        int i10 = org.telegram.ui.ActionBar.j6.He;
        frameLayout.setBackground(org.telegram.ui.ActionBar.j6.b0(dp, org.telegram.ui.ActionBar.j6.v0(i10, f6Var)));
        frameLayout.setClipToOutline(true);
        ai.k2 k2Var = yf.j0.f46866a;
        frameLayout.setOutlineProvider(new yf.h0(0, AndroidUtilities.dp(18.0f)));
        addView(frameLayout, w7.x5.d(-1, 36.0f, 55, 8.0f, 12.0f, 8.0f, 8.0f));
        ImageView imageView = new ImageView(context);
        this.f39396b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        org.telegram.ui.Components.ym0 ym0Var = new org.telegram.ui.Components.ym0();
        this.f39398f = ym0Var;
        ym0Var.c(0, false, false);
        int i11 = org.telegram.ui.ActionBar.j6.Je;
        ym0Var.a(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        imageView.setImageDrawable(ym0Var);
        final z51 z51Var = (z51) this;
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        z51 z51Var2 = z51Var;
                        org.telegram.ui.Cells.b6 b6Var = z51Var2.h;
                        if (z51Var2.f39398f.f30284k == 1) {
                            b6Var.setText("");
                            z51Var2.f39404y.v(null, true, false);
                            w61 w61Var = z51Var2.f39399n;
                            if (w61Var != null) {
                                w61Var.G1(null);
                                z51Var2.f39399n.H1(true, true);
                                z51Var2.f39399n.E1();
                            }
                            b6Var.clearAnimation();
                            b6Var.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.qr.h).start();
                            z51Var2.c(false);
                            return;
                        }
                        return;
                    case 1:
                        z51 z51Var3 = z51Var;
                        i71 i71Var2 = z51Var3.f39404y;
                        if (!i71Var2.u()) {
                            i71Var2.q();
                            z51Var3.h.requestFocus();
                            i71.a(i71Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        z51 z51Var4 = z51Var;
                        org.telegram.ui.Cells.b6 b6Var2 = z51Var4.h;
                        b6Var2.setText("");
                        z51Var4.f39404y.v(null, true, false);
                        w61 w61Var2 = z51Var4.f39399n;
                        if (w61Var2 != null) {
                            w61Var2.G1(null);
                            z51Var4.f39399n.H1(true, true);
                        }
                        b6Var2.clearAnimation();
                        b6Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.qr.h).start();
                        z51Var4.c(false);
                        return;
                }
            }
        });
        imageView.setClickable(false);
        imageView.setImportantForAccessibility(2);
        frameLayout.addView(imageView, w7.x5.e(36, 36, 51));
        org.telegram.ui.Components.jg0 jg0Var = new org.telegram.ui.Components.jg0(z51Var, context, z10);
        this.d = jg0Var;
        frameLayout.addView(jg0Var, w7.x5.d(-1, -1.0f, 119, 36.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Cells.b6 b6Var = new org.telegram.ui.Cells.b6(z51Var, context, f6Var, 1);
        this.h = b6Var;
        b6Var.addTextChangedListener(new l0(z51Var, 15));
        b6Var.setBackground(null);
        b6Var.setPadding(0, 0, AndroidUtilities.dp(4.0f), 0);
        b6Var.setTextSize(1, 16.0f);
        b6Var.setHint(LocaleController.getString(R.string.Search));
        b6Var.setHintTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        b6Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        b6Var.setImeOptions(268435459);
        b6Var.setCursorColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Mh, f6Var));
        b6Var.setCursorSize(AndroidUtilities.dp(20.0f));
        b6Var.setGravity(19);
        b6Var.setCursorWidth(1.5f);
        b6Var.setMaxLines(1);
        b6Var.setSingleLine(true);
        b6Var.setLines(1);
        b6Var.setTranslationY(AndroidUtilities.dp(-1.0f));
        jg0Var.addView(b6Var, w7.x5.d(-1, -1.0f, 119, 0.0f, 0.0f, 32.0f, 0.0f));
        if (z10) {
            View view = new View(context);
            this.e = view;
            Drawable mutate = context.getResources().getDrawable(R.drawable.gradient_right).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), PorterDuff.Mode.MULTIPLY));
            view.setBackground(mutate);
            view.setAlpha(0.0f);
            jg0Var.addView(view, w7.x5.e(18, -1, 3));
        }
        setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        z51 z51Var2 = z51Var;
                        org.telegram.ui.Cells.b6 b6Var2 = z51Var2.h;
                        if (z51Var2.f39398f.f30284k == 1) {
                            b6Var2.setText("");
                            z51Var2.f39404y.v(null, true, false);
                            w61 w61Var = z51Var2.f39399n;
                            if (w61Var != null) {
                                w61Var.G1(null);
                                z51Var2.f39399n.H1(true, true);
                                z51Var2.f39399n.E1();
                            }
                            b6Var2.clearAnimation();
                            b6Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.qr.h).start();
                            z51Var2.c(false);
                            return;
                        }
                        return;
                    case 1:
                        z51 z51Var3 = z51Var;
                        i71 i71Var2 = z51Var3.f39404y;
                        if (!i71Var2.u()) {
                            i71Var2.q();
                            z51Var3.h.requestFocus();
                            i71.a(i71Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        z51 z51Var4 = z51Var;
                        org.telegram.ui.Cells.b6 b6Var22 = z51Var4.h;
                        b6Var22.setText("");
                        z51Var4.f39404y.v(null, true, false);
                        w61 w61Var2 = z51Var4.f39399n;
                        if (w61Var2 != null) {
                            w61Var2.G1(null);
                            z51Var4.f39399n.H1(true, true);
                        }
                        b6Var22.clearAnimation();
                        b6Var22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.qr.h).start();
                        z51Var4.c(false);
                        return;
                }
            }
        });
        ImageView imageView2 = new ImageView(context);
        this.f39397c = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new ci.j2(z51Var));
        imageView2.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18953i6, f6Var), 1, AndroidUtilities.dp(15.0f)));
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        z51 z51Var2 = z51Var;
                        org.telegram.ui.Cells.b6 b6Var2 = z51Var2.h;
                        if (z51Var2.f39398f.f30284k == 1) {
                            b6Var2.setText("");
                            z51Var2.f39404y.v(null, true, false);
                            w61 w61Var = z51Var2.f39399n;
                            if (w61Var != null) {
                                w61Var.G1(null);
                                z51Var2.f39399n.H1(true, true);
                                z51Var2.f39399n.E1();
                            }
                            b6Var2.clearAnimation();
                            b6Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.qr.h).start();
                            z51Var2.c(false);
                            return;
                        }
                        return;
                    case 1:
                        z51 z51Var3 = z51Var;
                        i71 i71Var2 = z51Var3.f39404y;
                        if (!i71Var2.u()) {
                            i71Var2.q();
                            z51Var3.h.requestFocus();
                            i71.a(i71Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        z51 z51Var4 = z51Var;
                        org.telegram.ui.Cells.b6 b6Var22 = z51Var4.h;
                        b6Var22.setText("");
                        z51Var4.f39404y.v(null, true, false);
                        w61 w61Var2 = z51Var4.f39399n;
                        if (w61Var2 != null) {
                            w61Var2.G1(null);
                            z51Var4.f39399n.H1(true, true);
                        }
                        b6Var22.clearAnimation();
                        b6Var22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.qr.h).start();
                        z51Var4.c(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView2, w7.x5.e(36, 36, 53));
        if (!zg.f0.d) {
            b();
        }
    }

    public static void a(z51 z51Var, boolean z10) {
        if (z10) {
            if (z51Var.v == null) {
                g01 g01Var = new g01(z51Var, 14);
                z51Var.v = g01Var;
                AndroidUtilities.runOnUIThread(g01Var, 340L);
                return;
            }
            return;
        }
        g01 g01Var2 = z51Var.v;
        if (g01Var2 != null) {
            AndroidUtilities.cancelRunOnUIThread(g01Var2);
            z51Var.v = null;
        }
        AndroidUtilities.updateViewShow(z51Var.f39397c, false);
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.x61.b():void");
    }

    public final void c(boolean z10) {
        float f7;
        if (z10 == this.f39402w) {
            return;
        }
        this.f39402w = z10;
        ValueAnimator valueAnimator = this.f39401s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.f39400r;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f39401s = ofFloat;
        ofFloat.addUpdateListener(new k21(this, 8));
        this.f39401s.setDuration(120L);
        this.f39401s.setInterpolator(org.telegram.ui.Components.qr.h);
        this.f39401s.start();
    }

    public final void d(boolean z10) {
        ?? r62;
        String str;
        w61 w61Var;
        w61 w61Var2;
        org.telegram.ui.Components.ym0 ym0Var = this.f39398f;
        int i10 = ym0Var.f30284k;
        org.telegram.ui.Cells.b6 b6Var = this.h;
        int i11 = 2;
        if (i10 == 2 && ((b6Var.length() != 0 || ((w61Var2 = this.f39399n) != null && w61Var2.getSelectedCategory() != null)) && !z10)) {
            return;
        }
        if (b6Var.length() <= 0 && ((w61Var = this.f39399n) == null || w61Var.f30017o3 <= 0.5f || (!w61Var.j3 && w61Var.getSelectedCategory() == null))) {
            r62 = 0;
        } else {
            r62 = 1;
        }
        ym0Var.b(r62);
        ImageView imageView = this.f39396b;
        imageView.setClickable(r62);
        if (r62 != 0) {
            str = LocaleController.getString(R.string.AccDescrGoBack);
        } else {
            str = null;
        }
        imageView.setContentDescription(str);
        if (r62 != 0) {
            i11 = 1;
        }
        imageView.setImportantForAccessibility(i11);
    }

    @Override
    public final void e() {
        if (this.f39403x) {
            this.f39395a.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, this.f39404y.Z0))));
        }
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void invalidate() {
        if (zg.f0.b(this)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(52.0f), 1073741824));
    }
}
