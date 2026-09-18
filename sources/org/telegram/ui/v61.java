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
public abstract class v61 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final FrameLayout f38313a;
    public final ImageView f38314b;
    public final ImageView f38315c;
    public final org.telegram.ui.Components.tg0 d;
    public final View e;
    public final org.telegram.ui.Components.ln0 f38316f;
    public final org.telegram.ui.Cells.c6 h;
    public u61 f38317n;
    public float f38318r;
    public ValueAnimator f38319s;
    public e01 v;
    public boolean f38320w;
    public boolean f38321x;
    public final g71 f38322y;

    public v61(g71 g71Var, Context context, boolean z10) {
        super(context);
        org.telegram.ui.ActionBar.e6 e6Var = g71Var.Z0;
        this.f38322y = g71Var;
        this.f38320w = false;
        setClickable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f38313a = frameLayout;
        if (z10) {
            setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, e6Var));
        }
        int dp = AndroidUtilities.dp(18.0f);
        int i10 = org.telegram.ui.ActionBar.j6.He;
        frameLayout.setBackground(org.telegram.ui.ActionBar.j6.b0(dp, org.telegram.ui.ActionBar.j6.v0(i10, e6Var)));
        frameLayout.setClipToOutline(true);
        ai.k2 k2Var = yf.k0.f47097a;
        frameLayout.setOutlineProvider(new yf.i0(0, AndroidUtilities.dp(18.0f)));
        addView(frameLayout, w7.y5.d(-1, 36.0f, 55, 8.0f, 12.0f, 8.0f, 8.0f));
        ImageView imageView = new ImageView(context);
        this.f38314b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        org.telegram.ui.Components.ln0 ln0Var = new org.telegram.ui.Components.ln0();
        this.f38316f = ln0Var;
        ln0Var.c(0, false, false);
        int i11 = org.telegram.ui.ActionBar.j6.Je;
        ln0Var.a(org.telegram.ui.ActionBar.j6.v0(i11, e6Var));
        imageView.setImageDrawable(ln0Var);
        final x51 x51Var = (x51) this;
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        x51 x51Var2 = x51Var;
                        org.telegram.ui.Cells.c6 c6Var = x51Var2.h;
                        if (x51Var2.f38316f.f26194k == 1) {
                            c6Var.setText("");
                            x51Var2.f38322y.v(null, true, false);
                            u61 u61Var = x51Var2.f38317n;
                            if (u61Var != null) {
                                u61Var.G1(null);
                                x51Var2.f38317n.H1(true, true);
                                x51Var2.f38317n.E1();
                            }
                            c6Var.clearAnimation();
                            c6Var.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.qr.h).start();
                            x51Var2.c(false);
                            return;
                        }
                        return;
                    case 1:
                        x51 x51Var3 = x51Var;
                        g71 g71Var2 = x51Var3.f38322y;
                        if (!g71Var2.u()) {
                            g71Var2.q();
                            x51Var3.h.requestFocus();
                            g71.a(g71Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        x51 x51Var4 = x51Var;
                        org.telegram.ui.Cells.c6 c6Var2 = x51Var4.h;
                        c6Var2.setText("");
                        x51Var4.f38322y.v(null, true, false);
                        u61 u61Var2 = x51Var4.f38317n;
                        if (u61Var2 != null) {
                            u61Var2.G1(null);
                            x51Var4.f38317n.H1(true, true);
                        }
                        c6Var2.clearAnimation();
                        c6Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.qr.h).start();
                        x51Var4.c(false);
                        return;
                }
            }
        });
        imageView.setClickable(false);
        imageView.setImportantForAccessibility(2);
        frameLayout.addView(imageView, w7.y5.e(36, 36, 51));
        org.telegram.ui.Components.tg0 tg0Var = new org.telegram.ui.Components.tg0(x51Var, context, z10);
        this.d = tg0Var;
        frameLayout.addView(tg0Var, w7.y5.d(-1, -1.0f, 119, 36.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Cells.c6 c6Var = new org.telegram.ui.Cells.c6(x51Var, context, e6Var, 1);
        this.h = c6Var;
        c6Var.addTextChangedListener(new l0(x51Var, 15));
        c6Var.setBackground(null);
        c6Var.setPadding(0, 0, AndroidUtilities.dp(4.0f), 0);
        c6Var.setTextSize(1, 16.0f);
        c6Var.setHint(LocaleController.getString(R.string.Search));
        c6Var.setHintTextColor(org.telegram.ui.ActionBar.j6.v0(i11, e6Var));
        c6Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, e6Var));
        c6Var.setImeOptions(268435459);
        c6Var.setCursorColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Mh, e6Var));
        c6Var.setCursorSize(AndroidUtilities.dp(20.0f));
        c6Var.setGravity(19);
        c6Var.setCursorWidth(1.5f);
        c6Var.setMaxLines(1);
        c6Var.setSingleLine(true);
        c6Var.setLines(1);
        c6Var.setTranslationY(AndroidUtilities.dp(-1.0f));
        tg0Var.addView(c6Var, w7.y5.d(-1, -1.0f, 119, 0.0f, 0.0f, 32.0f, 0.0f));
        if (z10) {
            View view = new View(context);
            this.e = view;
            Drawable mutate = context.getResources().getDrawable(R.drawable.gradient_right).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i10, e6Var), PorterDuff.Mode.MULTIPLY));
            view.setBackground(mutate);
            view.setAlpha(0.0f);
            tg0Var.addView(view, w7.y5.e(18, -1, 3));
        }
        setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        x51 x51Var2 = x51Var;
                        org.telegram.ui.Cells.c6 c6Var2 = x51Var2.h;
                        if (x51Var2.f38316f.f26194k == 1) {
                            c6Var2.setText("");
                            x51Var2.f38322y.v(null, true, false);
                            u61 u61Var = x51Var2.f38317n;
                            if (u61Var != null) {
                                u61Var.G1(null);
                                x51Var2.f38317n.H1(true, true);
                                x51Var2.f38317n.E1();
                            }
                            c6Var2.clearAnimation();
                            c6Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.qr.h).start();
                            x51Var2.c(false);
                            return;
                        }
                        return;
                    case 1:
                        x51 x51Var3 = x51Var;
                        g71 g71Var2 = x51Var3.f38322y;
                        if (!g71Var2.u()) {
                            g71Var2.q();
                            x51Var3.h.requestFocus();
                            g71.a(g71Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        x51 x51Var4 = x51Var;
                        org.telegram.ui.Cells.c6 c6Var22 = x51Var4.h;
                        c6Var22.setText("");
                        x51Var4.f38322y.v(null, true, false);
                        u61 u61Var2 = x51Var4.f38317n;
                        if (u61Var2 != null) {
                            u61Var2.G1(null);
                            x51Var4.f38317n.H1(true, true);
                        }
                        c6Var22.clearAnimation();
                        c6Var22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.qr.h).start();
                        x51Var4.c(false);
                        return;
                }
            }
        });
        ImageView imageView2 = new ImageView(context);
        this.f38315c = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new ci.j2(x51Var));
        imageView2.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19152i6, e6Var), 1, AndroidUtilities.dp(15.0f)));
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        x51 x51Var2 = x51Var;
                        org.telegram.ui.Cells.c6 c6Var2 = x51Var2.h;
                        if (x51Var2.f38316f.f26194k == 1) {
                            c6Var2.setText("");
                            x51Var2.f38322y.v(null, true, false);
                            u61 u61Var = x51Var2.f38317n;
                            if (u61Var != null) {
                                u61Var.G1(null);
                                x51Var2.f38317n.H1(true, true);
                                x51Var2.f38317n.E1();
                            }
                            c6Var2.clearAnimation();
                            c6Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.qr.h).start();
                            x51Var2.c(false);
                            return;
                        }
                        return;
                    case 1:
                        x51 x51Var3 = x51Var;
                        g71 g71Var2 = x51Var3.f38322y;
                        if (!g71Var2.u()) {
                            g71Var2.q();
                            x51Var3.h.requestFocus();
                            g71.a(g71Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        x51 x51Var4 = x51Var;
                        org.telegram.ui.Cells.c6 c6Var22 = x51Var4.h;
                        c6Var22.setText("");
                        x51Var4.f38322y.v(null, true, false);
                        u61 u61Var2 = x51Var4.f38317n;
                        if (u61Var2 != null) {
                            u61Var2.G1(null);
                            x51Var4.f38317n.H1(true, true);
                        }
                        c6Var22.clearAnimation();
                        c6Var22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.qr.h).start();
                        x51Var4.c(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView2, w7.y5.e(36, 36, 53));
        if (!zg.e0.d) {
            b();
        }
    }

    public static void a(x51 x51Var, boolean z10) {
        if (z10) {
            if (x51Var.v == null) {
                e01 e01Var = new e01(x51Var, 14);
                x51Var.v = e01Var;
                AndroidUtilities.runOnUIThread(e01Var, 340L);
                return;
            }
            return;
        }
        e01 e01Var2 = x51Var.v;
        if (e01Var2 != null) {
            AndroidUtilities.cancelRunOnUIThread(e01Var2);
            x51Var.v = null;
        }
        AndroidUtilities.updateViewShow(x51Var.f38315c, false);
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.v61.b():void");
    }

    public final void c(boolean z10) {
        float f7;
        if (z10 == this.f38320w) {
            return;
        }
        this.f38320w = z10;
        ValueAnimator valueAnimator = this.f38319s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.f38318r;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f38319s = ofFloat;
        ofFloat.addUpdateListener(new i21(this, 8));
        this.f38319s.setDuration(120L);
        this.f38319s.setInterpolator(org.telegram.ui.Components.qr.h);
        this.f38319s.start();
    }

    public final void d(boolean z10) {
        ?? r62;
        String str;
        u61 u61Var;
        u61 u61Var2;
        org.telegram.ui.Components.ln0 ln0Var = this.f38316f;
        int i10 = ln0Var.f26194k;
        org.telegram.ui.Cells.c6 c6Var = this.h;
        int i11 = 2;
        if (i10 == 2 && ((c6Var.length() != 0 || ((u61Var2 = this.f38317n) != null && u61Var2.getSelectedCategory() != null)) && !z10)) {
            return;
        }
        if (c6Var.length() <= 0 && ((u61Var = this.f38317n) == null || u61Var.f25078o3 <= 0.5f || (!u61Var.j3 && u61Var.getSelectedCategory() == null))) {
            r62 = 0;
        } else {
            r62 = 1;
        }
        ln0Var.b(r62);
        ImageView imageView = this.f38314b;
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
        if (this.f38321x) {
            this.f38313a.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, this.f38322y.Z0))));
        }
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void invalidate() {
        if (zg.e0.b(this)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(52.0f), 1073741824));
    }
}
