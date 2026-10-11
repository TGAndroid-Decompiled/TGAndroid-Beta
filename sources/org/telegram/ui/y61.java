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
public abstract class y61 extends FrameLayout implements org.telegram.ui.ActionBar.x5 {
    public final FrameLayout f44296a;
    public final ImageView f44297b;
    public final ImageView f44298c;
    public final org.telegram.ui.Components.lh0 d;
    public final View f44299e;
    public final org.telegram.ui.Components.eo0 f44300f;
    public final org.telegram.ui.Cells.c6 h;
    public x61 f44301n;
    public float f44302r;
    public ValueAnimator f44303s;
    public mz0 v;
    public boolean f44304w;
    public boolean f44305x;
    public final j71 f44306y;

    public y61(j71 j71Var, Context context, boolean z10) {
        super(context);
        org.telegram.ui.ActionBar.d6 d6Var = j71Var.Z0;
        this.f44306y = j71Var;
        this.f44304w = false;
        setClickable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f44296a = frameLayout;
        if (z10) {
            setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G8, d6Var));
        }
        int dp = AndroidUtilities.dp(18.0f);
        int i10 = org.telegram.ui.ActionBar.h6.He;
        frameLayout.setBackground(org.telegram.ui.ActionBar.h6.c0(dp, org.telegram.ui.ActionBar.h6.w0(i10, d6Var)));
        frameLayout.setClipToOutline(true);
        ai.l2 l2Var = yf.i0.f52292a;
        frameLayout.setOutlineProvider(new yf.h0(0, AndroidUtilities.dp(18.0f)));
        addView(frameLayout, w7.x5.a(36.0f, 8.0f, 12.0f, 8.0f, 8.0f, -1, 55));
        ImageView imageView = new ImageView(context);
        this.f44297b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        org.telegram.ui.Components.eo0 eo0Var = new org.telegram.ui.Components.eo0();
        this.f44300f = eo0Var;
        eo0Var.c(0, false, false);
        int i11 = org.telegram.ui.ActionBar.h6.Je;
        eo0Var.a(org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
        imageView.setImageDrawable(eo0Var);
        final a61 a61Var = (a61) this;
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        a61 a61Var2 = a61Var;
                        org.telegram.ui.Cells.c6 c6Var = a61Var2.h;
                        if (a61Var2.f44300f.f26156k == 1) {
                            c6Var.setText("");
                            a61Var2.f44306y.v(null, true, false);
                            x61 x61Var = a61Var2.f44301n;
                            if (x61Var != null) {
                                x61Var.G1(null);
                                a61Var2.f44301n.H1(true, true);
                                a61Var2.f44301n.E1();
                            }
                            c6Var.clearAnimation();
                            c6Var.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.is.h).start();
                            a61Var2.c(false);
                            return;
                        }
                        return;
                    case 1:
                        a61 a61Var3 = a61Var;
                        j71 j71Var2 = a61Var3.f44306y;
                        if (!j71Var2.u()) {
                            j71Var2.q();
                            a61Var3.h.requestFocus();
                            j71.a(j71Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        a61 a61Var4 = a61Var;
                        org.telegram.ui.Cells.c6 c6Var2 = a61Var4.h;
                        c6Var2.setText("");
                        a61Var4.f44306y.v(null, true, false);
                        x61 x61Var2 = a61Var4.f44301n;
                        if (x61Var2 != null) {
                            x61Var2.G1(null);
                            a61Var4.f44301n.H1(true, true);
                        }
                        c6Var2.clearAnimation();
                        c6Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.is.h).start();
                        a61Var4.c(false);
                        return;
                }
            }
        });
        imageView.setClickable(false);
        imageView.setImportantForAccessibility(2);
        frameLayout.addView(imageView, w7.x5.e(36, 36, 51));
        org.telegram.ui.Components.lh0 lh0Var = new org.telegram.ui.Components.lh0(a61Var, context, z10);
        this.d = lh0Var;
        frameLayout.addView(lh0Var, w7.x5.a(-1.0f, 36.0f, 0.0f, 0.0f, 0.0f, -1, 119));
        org.telegram.ui.Cells.c6 c6Var = new org.telegram.ui.Cells.c6(a61Var, context, d6Var, 1);
        this.h = c6Var;
        c6Var.addTextChangedListener(new l0(a61Var, 15));
        c6Var.setBackground(null);
        c6Var.setPadding(0, 0, AndroidUtilities.dp(4.0f), 0);
        c6Var.setTextSize(1, 16.0f);
        c6Var.setHint(LocaleController.getString(R.string.Search));
        c6Var.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
        c6Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, d6Var));
        c6Var.setImeOptions(268435459);
        c6Var.setCursorColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Mh, d6Var));
        c6Var.setCursorSize(AndroidUtilities.dp(20.0f));
        c6Var.setGravity(19);
        c6Var.setCursorWidth(1.5f);
        c6Var.setMaxLines(1);
        c6Var.setSingleLine(true);
        c6Var.setLines(1);
        c6Var.setTranslationY(AndroidUtilities.dp(-1.0f));
        lh0Var.addView(c6Var, w7.x5.a(-1.0f, 0.0f, 0.0f, 32.0f, 0.0f, -1, 119));
        if (z10) {
            View view = new View(context);
            this.f44299e = view;
            Drawable mutate = context.getResources().getDrawable(R.drawable.gradient_right).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i10, d6Var), PorterDuff.Mode.MULTIPLY));
            view.setBackground(mutate);
            view.setAlpha(0.0f);
            lh0Var.addView(view, w7.x5.e(18, -1, 3));
        }
        setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        a61 a61Var2 = a61Var;
                        org.telegram.ui.Cells.c6 c6Var2 = a61Var2.h;
                        if (a61Var2.f44300f.f26156k == 1) {
                            c6Var2.setText("");
                            a61Var2.f44306y.v(null, true, false);
                            x61 x61Var = a61Var2.f44301n;
                            if (x61Var != null) {
                                x61Var.G1(null);
                                a61Var2.f44301n.H1(true, true);
                                a61Var2.f44301n.E1();
                            }
                            c6Var2.clearAnimation();
                            c6Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.is.h).start();
                            a61Var2.c(false);
                            return;
                        }
                        return;
                    case 1:
                        a61 a61Var3 = a61Var;
                        j71 j71Var2 = a61Var3.f44306y;
                        if (!j71Var2.u()) {
                            j71Var2.q();
                            a61Var3.h.requestFocus();
                            j71.a(j71Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        a61 a61Var4 = a61Var;
                        org.telegram.ui.Cells.c6 c6Var22 = a61Var4.h;
                        c6Var22.setText("");
                        a61Var4.f44306y.v(null, true, false);
                        x61 x61Var2 = a61Var4.f44301n;
                        if (x61Var2 != null) {
                            x61Var2.G1(null);
                            a61Var4.f44301n.H1(true, true);
                        }
                        c6Var22.clearAnimation();
                        c6Var22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.is.h).start();
                        a61Var4.c(false);
                        return;
                }
            }
        });
        ImageView imageView2 = new ImageView(context);
        this.f44298c = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new ci.i2(a61Var));
        imageView2.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20913i6, d6Var), 1, AndroidUtilities.dp(15.0f)));
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        a61 a61Var2 = a61Var;
                        org.telegram.ui.Cells.c6 c6Var2 = a61Var2.h;
                        if (a61Var2.f44300f.f26156k == 1) {
                            c6Var2.setText("");
                            a61Var2.f44306y.v(null, true, false);
                            x61 x61Var = a61Var2.f44301n;
                            if (x61Var != null) {
                                x61Var.G1(null);
                                a61Var2.f44301n.H1(true, true);
                                a61Var2.f44301n.E1();
                            }
                            c6Var2.clearAnimation();
                            c6Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.is.h).start();
                            a61Var2.c(false);
                            return;
                        }
                        return;
                    case 1:
                        a61 a61Var3 = a61Var;
                        j71 j71Var2 = a61Var3.f44306y;
                        if (!j71Var2.u()) {
                            j71Var2.q();
                            a61Var3.h.requestFocus();
                            j71.a(j71Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        a61 a61Var4 = a61Var;
                        org.telegram.ui.Cells.c6 c6Var22 = a61Var4.h;
                        c6Var22.setText("");
                        a61Var4.f44306y.v(null, true, false);
                        x61 x61Var2 = a61Var4.f44301n;
                        if (x61Var2 != null) {
                            x61Var2.G1(null);
                            a61Var4.f44301n.H1(true, true);
                        }
                        c6Var22.clearAnimation();
                        c6Var22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.is.h).start();
                        a61Var4.c(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView2, w7.x5.e(36, 36, 53));
        if (!zg.d0.d) {
            b();
        }
    }

    public static void a(a61 a61Var, boolean z10) {
        if (z10) {
            if (a61Var.v == null) {
                mz0 mz0Var = new mz0(a61Var, 15);
                a61Var.v = mz0Var;
                AndroidUtilities.runOnUIThread(mz0Var, 340L);
                return;
            }
            return;
        }
        mz0 mz0Var2 = a61Var.v;
        if (mz0Var2 != null) {
            AndroidUtilities.cancelRunOnUIThread(mz0Var2);
            a61Var.v = null;
        }
        AndroidUtilities.updateViewShow(a61Var.f44298c, false);
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.y61.b():void");
    }

    public final void c(boolean z10) {
        float f7;
        if (z10 == this.f44304w) {
            return;
        }
        this.f44304w = z10;
        ValueAnimator valueAnimator = this.f44303s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.f44302r;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f44303s = ofFloat;
        ofFloat.addUpdateListener(new x11(this, 9));
        this.f44303s.setDuration(120L);
        this.f44303s.setInterpolator(org.telegram.ui.Components.is.h);
        this.f44303s.start();
    }

    public final void d(boolean z10) {
        ?? r62;
        String str;
        x61 x61Var;
        x61 x61Var2;
        org.telegram.ui.Components.eo0 eo0Var = this.f44300f;
        int i10 = eo0Var.f26156k;
        org.telegram.ui.Cells.c6 c6Var = this.h;
        int i11 = 2;
        if (i10 == 2 && ((c6Var.length() != 0 || ((x61Var2 = this.f44301n) != null && x61Var2.getSelectedCategory() != null)) && !z10)) {
            return;
        }
        if (c6Var.length() <= 0 && ((x61Var = this.f44301n) == null || x61Var.f33741m3 <= 0.5f || (!x61Var.f33737h3 && x61Var.getSelectedCategory() == null))) {
            r62 = 0;
        } else {
            r62 = 1;
        }
        eo0Var.b(r62);
        ImageView imageView = this.f44297b;
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
        if (this.f44305x) {
            this.f44296a.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.h6.m1(0.06f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.E8, this.f44306y.Z0))));
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
