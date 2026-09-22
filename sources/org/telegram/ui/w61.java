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
public abstract class w61 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final FrameLayout f38702a;
    public final ImageView f38703b;
    public final ImageView f38704c;
    public final org.telegram.ui.Components.ig0 d;
    public final View e;
    public final org.telegram.ui.Components.xm0 f38705f;
    public final org.telegram.ui.Cells.c6 h;
    public v61 f38706n;
    public float f38707r;
    public ValueAnimator f38708s;
    public f01 v;
    public boolean f38709w;
    public boolean f38710x;
    public final h71 f38711y;

    public w61(h71 h71Var, Context context, boolean z10) {
        super(context);
        org.telegram.ui.ActionBar.e6 e6Var = h71Var.Z0;
        this.f38711y = h71Var;
        this.f38709w = false;
        setClickable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f38702a = frameLayout;
        if (z10) {
            setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G8, e6Var));
        }
        int dp = AndroidUtilities.dp(18.0f);
        int i10 = org.telegram.ui.ActionBar.i6.He;
        frameLayout.setBackground(org.telegram.ui.ActionBar.i6.b0(dp, org.telegram.ui.ActionBar.i6.v0(i10, e6Var)));
        frameLayout.setClipToOutline(true);
        ai.k2 k2Var = yf.i0.f46828a;
        frameLayout.setOutlineProvider(new yf.h0(0, AndroidUtilities.dp(18.0f)));
        addView(frameLayout, w7.x5.d(-1, 36.0f, 55, 8.0f, 12.0f, 8.0f, 8.0f));
        ImageView imageView = new ImageView(context);
        this.f38703b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        org.telegram.ui.Components.xm0 xm0Var = new org.telegram.ui.Components.xm0();
        this.f38705f = xm0Var;
        xm0Var.c(0, false, false);
        int i11 = org.telegram.ui.ActionBar.i6.Je;
        xm0Var.a(org.telegram.ui.ActionBar.i6.v0(i11, e6Var));
        imageView.setImageDrawable(xm0Var);
        final y51 y51Var = (y51) this;
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        y51 y51Var2 = y51Var;
                        org.telegram.ui.Cells.c6 c6Var = y51Var2.h;
                        if (y51Var2.f38705f.f30008k == 1) {
                            c6Var.setText("");
                            y51Var2.f38711y.v(null, true, false);
                            v61 v61Var = y51Var2.f38706n;
                            if (v61Var != null) {
                                v61Var.F1(null);
                                y51Var2.f38706n.G1(true, true);
                                y51Var2.f38706n.D1();
                            }
                            c6Var.clearAnimation();
                            c6Var.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.qr.h).start();
                            y51Var2.c(false);
                            return;
                        }
                        return;
                    case 1:
                        y51 y51Var3 = y51Var;
                        h71 h71Var2 = y51Var3.f38711y;
                        if (!h71Var2.u()) {
                            h71Var2.q();
                            y51Var3.h.requestFocus();
                            h71.a(h71Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        y51 y51Var4 = y51Var;
                        org.telegram.ui.Cells.c6 c6Var2 = y51Var4.h;
                        c6Var2.setText("");
                        y51Var4.f38711y.v(null, true, false);
                        v61 v61Var2 = y51Var4.f38706n;
                        if (v61Var2 != null) {
                            v61Var2.F1(null);
                            y51Var4.f38706n.G1(true, true);
                        }
                        c6Var2.clearAnimation();
                        c6Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.qr.h).start();
                        y51Var4.c(false);
                        return;
                }
            }
        });
        imageView.setClickable(false);
        imageView.setImportantForAccessibility(2);
        frameLayout.addView(imageView, w7.x5.e(36, 36, 51));
        org.telegram.ui.Components.ig0 ig0Var = new org.telegram.ui.Components.ig0(y51Var, context, z10);
        this.d = ig0Var;
        frameLayout.addView(ig0Var, w7.x5.d(-1, -1.0f, 119, 36.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Cells.c6 c6Var = new org.telegram.ui.Cells.c6(y51Var, context, e6Var, 1);
        this.h = c6Var;
        c6Var.addTextChangedListener(new l0(y51Var, 15));
        c6Var.setBackground(null);
        c6Var.setPadding(0, 0, AndroidUtilities.dp(4.0f), 0);
        c6Var.setTextSize(1, 16.0f);
        c6Var.setHint(LocaleController.getString(R.string.Search));
        c6Var.setHintTextColor(org.telegram.ui.ActionBar.i6.v0(i11, e6Var));
        c6Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G6, e6Var));
        c6Var.setImeOptions(268435459);
        c6Var.setCursorColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Mh, e6Var));
        c6Var.setCursorSize(AndroidUtilities.dp(20.0f));
        c6Var.setGravity(19);
        c6Var.setCursorWidth(1.5f);
        c6Var.setMaxLines(1);
        c6Var.setSingleLine(true);
        c6Var.setLines(1);
        c6Var.setTranslationY(AndroidUtilities.dp(-1.0f));
        ig0Var.addView(c6Var, w7.x5.d(-1, -1.0f, 119, 0.0f, 0.0f, 32.0f, 0.0f));
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
                        y51 y51Var2 = y51Var;
                        org.telegram.ui.Cells.c6 c6Var2 = y51Var2.h;
                        if (y51Var2.f38705f.f30008k == 1) {
                            c6Var2.setText("");
                            y51Var2.f38711y.v(null, true, false);
                            v61 v61Var = y51Var2.f38706n;
                            if (v61Var != null) {
                                v61Var.F1(null);
                                y51Var2.f38706n.G1(true, true);
                                y51Var2.f38706n.D1();
                            }
                            c6Var2.clearAnimation();
                            c6Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.qr.h).start();
                            y51Var2.c(false);
                            return;
                        }
                        return;
                    case 1:
                        y51 y51Var3 = y51Var;
                        h71 h71Var2 = y51Var3.f38711y;
                        if (!h71Var2.u()) {
                            h71Var2.q();
                            y51Var3.h.requestFocus();
                            h71.a(h71Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        y51 y51Var4 = y51Var;
                        org.telegram.ui.Cells.c6 c6Var22 = y51Var4.h;
                        c6Var22.setText("");
                        y51Var4.f38711y.v(null, true, false);
                        v61 v61Var2 = y51Var4.f38706n;
                        if (v61Var2 != null) {
                            v61Var2.F1(null);
                            y51Var4.f38706n.G1(true, true);
                        }
                        c6Var22.clearAnimation();
                        c6Var22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.qr.h).start();
                        y51Var4.c(false);
                        return;
                }
            }
        });
        ImageView imageView2 = new ImageView(context);
        this.f38704c = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new ci.j2(y51Var));
        imageView2.setBackground(org.telegram.ui.ActionBar.i6.f0(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f18923i6, e6Var), 1, AndroidUtilities.dp(15.0f)));
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        y51 y51Var2 = y51Var;
                        org.telegram.ui.Cells.c6 c6Var2 = y51Var2.h;
                        if (y51Var2.f38705f.f30008k == 1) {
                            c6Var2.setText("");
                            y51Var2.f38711y.v(null, true, false);
                            v61 v61Var = y51Var2.f38706n;
                            if (v61Var != null) {
                                v61Var.F1(null);
                                y51Var2.f38706n.G1(true, true);
                                y51Var2.f38706n.D1();
                            }
                            c6Var2.clearAnimation();
                            c6Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.qr.h).start();
                            y51Var2.c(false);
                            return;
                        }
                        return;
                    case 1:
                        y51 y51Var3 = y51Var;
                        h71 h71Var2 = y51Var3.f38711y;
                        if (!h71Var2.u()) {
                            h71Var2.q();
                            y51Var3.h.requestFocus();
                            h71.a(h71Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        y51 y51Var4 = y51Var;
                        org.telegram.ui.Cells.c6 c6Var22 = y51Var4.h;
                        c6Var22.setText("");
                        y51Var4.f38711y.v(null, true, false);
                        v61 v61Var2 = y51Var4.f38706n;
                        if (v61Var2 != null) {
                            v61Var2.F1(null);
                            y51Var4.f38706n.G1(true, true);
                        }
                        c6Var22.clearAnimation();
                        c6Var22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.qr.h).start();
                        y51Var4.c(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView2, w7.x5.e(36, 36, 53));
        if (!zg.f0.d) {
            b();
        }
    }

    public static void a(y51 y51Var, boolean z10) {
        if (z10) {
            if (y51Var.v == null) {
                f01 f01Var = new f01(y51Var, 14);
                y51Var.v = f01Var;
                AndroidUtilities.runOnUIThread(f01Var, 340L);
                return;
            }
            return;
        }
        f01 f01Var2 = y51Var.v;
        if (f01Var2 != null) {
            AndroidUtilities.cancelRunOnUIThread(f01Var2);
            y51Var.v = null;
        }
        AndroidUtilities.updateViewShow(y51Var.f38704c, false);
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.w61.b():void");
    }

    public final void c(boolean z10) {
        float f7;
        if (z10 == this.f38709w) {
            return;
        }
        this.f38709w = z10;
        ValueAnimator valueAnimator = this.f38708s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.f38707r;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f38708s = ofFloat;
        ofFloat.addUpdateListener(new a21(this, 9));
        this.f38708s.setDuration(120L);
        this.f38708s.setInterpolator(org.telegram.ui.Components.qr.h);
        this.f38708s.start();
    }

    public final void d(boolean z10) {
        ?? r62;
        String str;
        v61 v61Var;
        v61 v61Var2;
        org.telegram.ui.Components.xm0 xm0Var = this.f38705f;
        int i10 = xm0Var.f30008k;
        org.telegram.ui.Cells.c6 c6Var = this.h;
        int i11 = 2;
        if (i10 == 2 && ((c6Var.length() != 0 || ((v61Var2 = this.f38706n) != null && v61Var2.getSelectedCategory() != null)) && !z10)) {
            return;
        }
        if (c6Var.length() <= 0 && ((v61Var = this.f38706n) == null || v61Var.f29810o3 <= 0.5f || (!v61Var.j3 && v61Var.getSelectedCategory() == null))) {
            r62 = 0;
        } else {
            r62 = 1;
        }
        xm0Var.b(r62);
        ImageView imageView = this.f38703b;
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
        if (this.f38710x) {
            this.f38702a.setBackground(org.telegram.ui.ActionBar.i6.b0(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.i6.l1(0.06f, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.E8, this.f38711y.Z0))));
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
