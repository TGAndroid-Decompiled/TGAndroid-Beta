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
public abstract class z61 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final FrameLayout f44492a;
    public final ImageView f44493b;
    public final ImageView f44494c;
    public final org.telegram.ui.Components.kh0 d;
    public final View f44495e;
    public final org.telegram.ui.Components.do0 f44496f;
    public final org.telegram.ui.Cells.c6 h;
    public y61 f44497n;
    public float f44498r;
    public ValueAnimator f44499s;
    public nz0 v;
    public boolean f44500w;
    public boolean f44501x;
    public final k71 f44502y;

    public z61(k71 k71Var, Context context, boolean z10) {
        super(context);
        org.telegram.ui.ActionBar.e6 e6Var = k71Var.Z0;
        this.f44502y = k71Var;
        this.f44500w = false;
        setClickable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f44492a = frameLayout;
        if (z10) {
            setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G8, e6Var));
        }
        int dp = AndroidUtilities.dp(18.0f);
        int i10 = org.telegram.ui.ActionBar.i6.He;
        frameLayout.setBackground(org.telegram.ui.ActionBar.i6.c0(dp, org.telegram.ui.ActionBar.i6.w0(i10, e6Var)));
        frameLayout.setClipToOutline(true);
        ai.l2 l2Var = yf.i0.f52171a;
        frameLayout.setOutlineProvider(new yf.h0(0, AndroidUtilities.dp(18.0f)));
        addView(frameLayout, w7.x5.a(36.0f, 8.0f, 12.0f, 8.0f, 8.0f, -1, 55));
        ImageView imageView = new ImageView(context);
        this.f44493b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        org.telegram.ui.Components.do0 do0Var = new org.telegram.ui.Components.do0();
        this.f44496f = do0Var;
        do0Var.c(0, false, false);
        int i11 = org.telegram.ui.ActionBar.i6.Je;
        do0Var.a(org.telegram.ui.ActionBar.i6.w0(i11, e6Var));
        imageView.setImageDrawable(do0Var);
        final b61 b61Var = (b61) this;
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        b61 b61Var2 = b61Var;
                        org.telegram.ui.Cells.c6 c6Var = b61Var2.h;
                        if (b61Var2.f44496f.f25757k == 1) {
                            c6Var.setText("");
                            b61Var2.f44502y.v(null, true, false);
                            y61 y61Var = b61Var2.f44497n;
                            if (y61Var != null) {
                                y61Var.G1(null);
                                b61Var2.f44497n.H1(true, true);
                                b61Var2.f44497n.E1();
                            }
                            c6Var.clearAnimation();
                            c6Var.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.hs.h).start();
                            b61Var2.c(false);
                            return;
                        }
                        return;
                    case 1:
                        b61 b61Var3 = b61Var;
                        k71 k71Var2 = b61Var3.f44502y;
                        if (!k71Var2.u()) {
                            k71Var2.q();
                            b61Var3.h.requestFocus();
                            k71.a(k71Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        b61 b61Var4 = b61Var;
                        org.telegram.ui.Cells.c6 c6Var2 = b61Var4.h;
                        c6Var2.setText("");
                        b61Var4.f44502y.v(null, true, false);
                        y61 y61Var2 = b61Var4.f44497n;
                        if (y61Var2 != null) {
                            y61Var2.G1(null);
                            b61Var4.f44497n.H1(true, true);
                        }
                        c6Var2.clearAnimation();
                        c6Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.hs.h).start();
                        b61Var4.c(false);
                        return;
                }
            }
        });
        imageView.setClickable(false);
        imageView.setImportantForAccessibility(2);
        frameLayout.addView(imageView, w7.x5.e(36, 36, 51));
        org.telegram.ui.Components.kh0 kh0Var = new org.telegram.ui.Components.kh0(b61Var, context, z10);
        this.d = kh0Var;
        frameLayout.addView(kh0Var, w7.x5.a(-1.0f, 36.0f, 0.0f, 0.0f, 0.0f, -1, 119));
        org.telegram.ui.Cells.c6 c6Var = new org.telegram.ui.Cells.c6(b61Var, context, e6Var, 1);
        this.h = c6Var;
        c6Var.addTextChangedListener(new m0(b61Var, 15));
        c6Var.setBackground(null);
        c6Var.setPadding(0, 0, AndroidUtilities.dp(4.0f), 0);
        c6Var.setTextSize(1, 16.0f);
        c6Var.setHint(LocaleController.getString(R.string.Search));
        c6Var.setHintTextColor(org.telegram.ui.ActionBar.i6.w0(i11, e6Var));
        c6Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G6, e6Var));
        c6Var.setImeOptions(268435459);
        c6Var.setCursorColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Mh, e6Var));
        c6Var.setCursorSize(AndroidUtilities.dp(20.0f));
        c6Var.setGravity(19);
        c6Var.setCursorWidth(1.5f);
        c6Var.setMaxLines(1);
        c6Var.setSingleLine(true);
        c6Var.setLines(1);
        c6Var.setTranslationY(AndroidUtilities.dp(-1.0f));
        kh0Var.addView(c6Var, w7.x5.a(-1.0f, 0.0f, 0.0f, 32.0f, 0.0f, -1, 119));
        if (z10) {
            View view = new View(context);
            this.f44495e = view;
            Drawable mutate = context.getResources().getDrawable(R.drawable.gradient_right).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(i10, e6Var), PorterDuff.Mode.MULTIPLY));
            view.setBackground(mutate);
            view.setAlpha(0.0f);
            kh0Var.addView(view, w7.x5.e(18, -1, 3));
        }
        setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        b61 b61Var2 = b61Var;
                        org.telegram.ui.Cells.c6 c6Var2 = b61Var2.h;
                        if (b61Var2.f44496f.f25757k == 1) {
                            c6Var2.setText("");
                            b61Var2.f44502y.v(null, true, false);
                            y61 y61Var = b61Var2.f44497n;
                            if (y61Var != null) {
                                y61Var.G1(null);
                                b61Var2.f44497n.H1(true, true);
                                b61Var2.f44497n.E1();
                            }
                            c6Var2.clearAnimation();
                            c6Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.hs.h).start();
                            b61Var2.c(false);
                            return;
                        }
                        return;
                    case 1:
                        b61 b61Var3 = b61Var;
                        k71 k71Var2 = b61Var3.f44502y;
                        if (!k71Var2.u()) {
                            k71Var2.q();
                            b61Var3.h.requestFocus();
                            k71.a(k71Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        b61 b61Var4 = b61Var;
                        org.telegram.ui.Cells.c6 c6Var22 = b61Var4.h;
                        c6Var22.setText("");
                        b61Var4.f44502y.v(null, true, false);
                        y61 y61Var2 = b61Var4.f44497n;
                        if (y61Var2 != null) {
                            y61Var2.G1(null);
                            b61Var4.f44497n.H1(true, true);
                        }
                        c6Var22.clearAnimation();
                        c6Var22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.hs.h).start();
                        b61Var4.c(false);
                        return;
                }
            }
        });
        ImageView imageView2 = new ImageView(context);
        this.f44494c = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new ci.i2(b61Var));
        imageView2.setBackground(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20888i6, e6Var), 1, AndroidUtilities.dp(15.0f)));
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        b61 b61Var2 = b61Var;
                        org.telegram.ui.Cells.c6 c6Var2 = b61Var2.h;
                        if (b61Var2.f44496f.f25757k == 1) {
                            c6Var2.setText("");
                            b61Var2.f44502y.v(null, true, false);
                            y61 y61Var = b61Var2.f44497n;
                            if (y61Var != null) {
                                y61Var.G1(null);
                                b61Var2.f44497n.H1(true, true);
                                b61Var2.f44497n.E1();
                            }
                            c6Var2.clearAnimation();
                            c6Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.hs.h).start();
                            b61Var2.c(false);
                            return;
                        }
                        return;
                    case 1:
                        b61 b61Var3 = b61Var;
                        k71 k71Var2 = b61Var3.f44502y;
                        if (!k71Var2.u()) {
                            k71Var2.q();
                            b61Var3.h.requestFocus();
                            k71.a(k71Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        b61 b61Var4 = b61Var;
                        org.telegram.ui.Cells.c6 c6Var22 = b61Var4.h;
                        c6Var22.setText("");
                        b61Var4.f44502y.v(null, true, false);
                        y61 y61Var2 = b61Var4.f44497n;
                        if (y61Var2 != null) {
                            y61Var2.G1(null);
                            b61Var4.f44497n.H1(true, true);
                        }
                        c6Var22.clearAnimation();
                        c6Var22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.hs.h).start();
                        b61Var4.c(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView2, w7.x5.e(36, 36, 53));
        if (!zg.d0.d) {
            b();
        }
    }

    public static void a(b61 b61Var, boolean z10) {
        if (z10) {
            if (b61Var.v == null) {
                nz0 nz0Var = new nz0(b61Var, 15);
                b61Var.v = nz0Var;
                AndroidUtilities.runOnUIThread(nz0Var, 340L);
                return;
            }
            return;
        }
        nz0 nz0Var2 = b61Var.v;
        if (nz0Var2 != null) {
            AndroidUtilities.cancelRunOnUIThread(nz0Var2);
            b61Var.v = null;
        }
        AndroidUtilities.updateViewShow(b61Var.f44494c, false);
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.z61.b():void");
    }

    public final void c(boolean z10) {
        float f7;
        if (z10 == this.f44500w) {
            return;
        }
        this.f44500w = z10;
        ValueAnimator valueAnimator = this.f44499s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.f44498r;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f44499s = ofFloat;
        ofFloat.addUpdateListener(new y11(this, 9));
        this.f44499s.setDuration(120L);
        this.f44499s.setInterpolator(org.telegram.ui.Components.hs.h);
        this.f44499s.start();
    }

    public final void d(boolean z10) {
        ?? r62;
        String str;
        y61 y61Var;
        y61 y61Var2;
        org.telegram.ui.Components.do0 do0Var = this.f44496f;
        int i10 = do0Var.f25757k;
        org.telegram.ui.Cells.c6 c6Var = this.h;
        int i11 = 2;
        if (i10 == 2 && ((c6Var.length() != 0 || ((y61Var2 = this.f44497n) != null && y61Var2.getSelectedCategory() != null)) && !z10)) {
            return;
        }
        if (c6Var.length() <= 0 && ((y61Var = this.f44497n) == null || y61Var.f33394m3 <= 0.5f || (!y61Var.f33390h3 && y61Var.getSelectedCategory() == null))) {
            r62 = 0;
        } else {
            r62 = 1;
        }
        do0Var.b(r62);
        ImageView imageView = this.f44493b;
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
        if (this.f44501x) {
            this.f44492a.setBackground(org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.i6.m1(0.06f, org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.E8, this.f44502y.Z0))));
        }
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void invalidate() {
        if (zg.d0.b(this)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(52.0f), 1073741824));
    }
}
