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
    public final FrameLayout f38372a;
    public final ImageView f38373b;
    public final ImageView f38374c;
    public final org.telegram.ui.Components.ig0 d;
    public final View e;
    public final org.telegram.ui.Components.xm0 f38375f;
    public final org.telegram.ui.Cells.b6 h;
    public u61 f38376n;
    public float f38377r;
    public ValueAnimator f38378s;
    public e01 v;
    public boolean f38379w;
    public boolean f38380x;
    public final g71 f38381y;

    public v61(g71 g71Var, Context context, boolean z10) {
        super(context);
        org.telegram.ui.ActionBar.e6 e6Var = g71Var.Z0;
        this.f38381y = g71Var;
        this.f38379w = false;
        setClickable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f38372a = frameLayout;
        if (z10) {
            setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G8, e6Var));
        }
        int dp = AndroidUtilities.dp(18.0f);
        int i10 = org.telegram.ui.ActionBar.i6.He;
        frameLayout.setBackground(org.telegram.ui.ActionBar.i6.b0(dp, org.telegram.ui.ActionBar.i6.v0(i10, e6Var)));
        frameLayout.setClipToOutline(true);
        ai.k2 k2Var = yf.j0.f46838a;
        frameLayout.setOutlineProvider(new yf.h0(0, AndroidUtilities.dp(18.0f)));
        addView(frameLayout, w7.x5.d(-1, 36.0f, 55, 8.0f, 12.0f, 8.0f, 8.0f));
        ImageView imageView = new ImageView(context);
        this.f38373b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        org.telegram.ui.Components.xm0 xm0Var = new org.telegram.ui.Components.xm0();
        this.f38375f = xm0Var;
        xm0Var.c(0, false, false);
        int i11 = org.telegram.ui.ActionBar.i6.Je;
        xm0Var.a(org.telegram.ui.ActionBar.i6.v0(i11, e6Var));
        imageView.setImageDrawable(xm0Var);
        final x51 x51Var = (x51) this;
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        x51 x51Var2 = x51Var;
                        org.telegram.ui.Cells.b6 b6Var = x51Var2.h;
                        if (x51Var2.f38375f.f30011k == 1) {
                            b6Var.setText("");
                            x51Var2.f38381y.v(null, true, false);
                            u61 u61Var = x51Var2.f38376n;
                            if (u61Var != null) {
                                u61Var.F1(null);
                                x51Var2.f38376n.G1(true, true);
                                x51Var2.f38376n.D1();
                            }
                            b6Var.clearAnimation();
                            b6Var.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.qr.h).start();
                            x51Var2.c(false);
                            return;
                        }
                        return;
                    case 1:
                        x51 x51Var3 = x51Var;
                        g71 g71Var2 = x51Var3.f38381y;
                        if (!g71Var2.u()) {
                            g71Var2.q();
                            x51Var3.h.requestFocus();
                            g71.a(g71Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        x51 x51Var4 = x51Var;
                        org.telegram.ui.Cells.b6 b6Var2 = x51Var4.h;
                        b6Var2.setText("");
                        x51Var4.f38381y.v(null, true, false);
                        u61 u61Var2 = x51Var4.f38376n;
                        if (u61Var2 != null) {
                            u61Var2.F1(null);
                            x51Var4.f38376n.G1(true, true);
                        }
                        b6Var2.clearAnimation();
                        b6Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.qr.h).start();
                        x51Var4.c(false);
                        return;
                }
            }
        });
        imageView.setClickable(false);
        imageView.setImportantForAccessibility(2);
        frameLayout.addView(imageView, w7.x5.e(36, 36, 51));
        org.telegram.ui.Components.ig0 ig0Var = new org.telegram.ui.Components.ig0(x51Var, context, z10);
        this.d = ig0Var;
        frameLayout.addView(ig0Var, w7.x5.d(-1, -1.0f, 119, 36.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Cells.b6 b6Var = new org.telegram.ui.Cells.b6(x51Var, context, e6Var, 1);
        this.h = b6Var;
        b6Var.addTextChangedListener(new l0(x51Var, 15));
        b6Var.setBackground(null);
        b6Var.setPadding(0, 0, AndroidUtilities.dp(4.0f), 0);
        b6Var.setTextSize(1, 16.0f);
        b6Var.setHint(LocaleController.getString(R.string.Search));
        b6Var.setHintTextColor(org.telegram.ui.ActionBar.i6.v0(i11, e6Var));
        b6Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G6, e6Var));
        b6Var.setImeOptions(268435459);
        b6Var.setCursorColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Mh, e6Var));
        b6Var.setCursorSize(AndroidUtilities.dp(20.0f));
        b6Var.setGravity(19);
        b6Var.setCursorWidth(1.5f);
        b6Var.setMaxLines(1);
        b6Var.setSingleLine(true);
        b6Var.setLines(1);
        b6Var.setTranslationY(AndroidUtilities.dp(-1.0f));
        ig0Var.addView(b6Var, w7.x5.d(-1, -1.0f, 119, 0.0f, 0.0f, 32.0f, 0.0f));
        if (z10) {
            View view = new View(context);
            this.e = view;
            Drawable mutate = context.getResources().getDrawable(R.drawable.gradient_right).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(i10, e6Var), PorterDuff.Mode.MULTIPLY));
            view.setBackground(mutate);
            view.setAlpha(0.0f);
            ig0Var.addView(view, w7.x5.e(18, -1, 3));
        }
        setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        x51 x51Var2 = x51Var;
                        org.telegram.ui.Cells.b6 b6Var2 = x51Var2.h;
                        if (x51Var2.f38375f.f30011k == 1) {
                            b6Var2.setText("");
                            x51Var2.f38381y.v(null, true, false);
                            u61 u61Var = x51Var2.f38376n;
                            if (u61Var != null) {
                                u61Var.F1(null);
                                x51Var2.f38376n.G1(true, true);
                                x51Var2.f38376n.D1();
                            }
                            b6Var2.clearAnimation();
                            b6Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.qr.h).start();
                            x51Var2.c(false);
                            return;
                        }
                        return;
                    case 1:
                        x51 x51Var3 = x51Var;
                        g71 g71Var2 = x51Var3.f38381y;
                        if (!g71Var2.u()) {
                            g71Var2.q();
                            x51Var3.h.requestFocus();
                            g71.a(g71Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        x51 x51Var4 = x51Var;
                        org.telegram.ui.Cells.b6 b6Var22 = x51Var4.h;
                        b6Var22.setText("");
                        x51Var4.f38381y.v(null, true, false);
                        u61 u61Var2 = x51Var4.f38376n;
                        if (u61Var2 != null) {
                            u61Var2.F1(null);
                            x51Var4.f38376n.G1(true, true);
                        }
                        b6Var22.clearAnimation();
                        b6Var22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.qr.h).start();
                        x51Var4.c(false);
                        return;
                }
            }
        });
        ImageView imageView2 = new ImageView(context);
        this.f38374c = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new ci.j2(x51Var));
        imageView2.setBackground(org.telegram.ui.ActionBar.i6.f0(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f18926i6, e6Var), 1, AndroidUtilities.dp(15.0f)));
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        x51 x51Var2 = x51Var;
                        org.telegram.ui.Cells.b6 b6Var2 = x51Var2.h;
                        if (x51Var2.f38375f.f30011k == 1) {
                            b6Var2.setText("");
                            x51Var2.f38381y.v(null, true, false);
                            u61 u61Var = x51Var2.f38376n;
                            if (u61Var != null) {
                                u61Var.F1(null);
                                x51Var2.f38376n.G1(true, true);
                                x51Var2.f38376n.D1();
                            }
                            b6Var2.clearAnimation();
                            b6Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.qr.h).start();
                            x51Var2.c(false);
                            return;
                        }
                        return;
                    case 1:
                        x51 x51Var3 = x51Var;
                        g71 g71Var2 = x51Var3.f38381y;
                        if (!g71Var2.u()) {
                            g71Var2.q();
                            x51Var3.h.requestFocus();
                            g71.a(g71Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        x51 x51Var4 = x51Var;
                        org.telegram.ui.Cells.b6 b6Var22 = x51Var4.h;
                        b6Var22.setText("");
                        x51Var4.f38381y.v(null, true, false);
                        u61 u61Var2 = x51Var4.f38376n;
                        if (u61Var2 != null) {
                            u61Var2.F1(null);
                            x51Var4.f38376n.G1(true, true);
                        }
                        b6Var22.clearAnimation();
                        b6Var22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.qr.h).start();
                        x51Var4.c(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView2, w7.x5.e(36, 36, 53));
        if (!zg.f0.d) {
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
        AndroidUtilities.updateViewShow(x51Var.f38374c, false);
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.v61.b():void");
    }

    public final void c(boolean z10) {
        float f7;
        if (z10 == this.f38379w) {
            return;
        }
        this.f38379w = z10;
        ValueAnimator valueAnimator = this.f38378s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.f38377r;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f38378s = ofFloat;
        ofFloat.addUpdateListener(new z11(this, 9));
        this.f38378s.setDuration(120L);
        this.f38378s.setInterpolator(org.telegram.ui.Components.qr.h);
        this.f38378s.start();
    }

    public final void d(boolean z10) {
        ?? r62;
        String str;
        u61 u61Var;
        u61 u61Var2;
        org.telegram.ui.Components.xm0 xm0Var = this.f38375f;
        int i10 = xm0Var.f30011k;
        org.telegram.ui.Cells.b6 b6Var = this.h;
        int i11 = 2;
        if (i10 == 2 && ((b6Var.length() != 0 || ((u61Var2 = this.f38376n) != null && u61Var2.getSelectedCategory() != null)) && !z10)) {
            return;
        }
        if (b6Var.length() <= 0 && ((u61Var = this.f38376n) == null || u61Var.f29813o3 <= 0.5f || (!u61Var.j3 && u61Var.getSelectedCategory() == null))) {
            r62 = 0;
        } else {
            r62 = 1;
        }
        xm0Var.b(r62);
        ImageView imageView = this.f38373b;
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
        if (this.f38380x) {
            this.f38372a.setBackground(org.telegram.ui.ActionBar.i6.b0(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.i6.l1(0.06f, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.E8, this.f38381y.Z0))));
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
