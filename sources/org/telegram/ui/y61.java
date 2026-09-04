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
public abstract class y61 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final FrameLayout f43000a;
    public final ImageView f43001b;
    public final ImageView f43002c;
    public final org.telegram.ui.Components.ig0 d;
    public final View f43003e;
    public final org.telegram.ui.Components.xm0 f43004f;
    public final org.telegram.ui.Cells.b6 h;
    public x61 f43005n;
    public float f43006r;
    public ValueAnimator f43007s;
    public f01 v;
    public boolean f43008w;
    public boolean f43009x;
    public final j71 f43010y;

    public y61(j71 j71Var, Context context, boolean z10) {
        super(context);
        org.telegram.ui.ActionBar.f6 f6Var = j71Var.Z0;
        this.f43010y = j71Var;
        this.f43008w = false;
        setClickable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f43000a = frameLayout;
        if (z10) {
            setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, f6Var));
        }
        int dp = AndroidUtilities.dp(18.0f);
        int i10 = org.telegram.ui.ActionBar.j6.He;
        frameLayout.setBackground(org.telegram.ui.ActionBar.j6.b0(dp, org.telegram.ui.ActionBar.j6.v0(i10, f6Var)));
        frameLayout.setClipToOutline(true);
        bi.z1 z1Var = yf.j0.f50112a;
        frameLayout.setOutlineProvider(new yf.i0(0, AndroidUtilities.dp(18.0f)));
        addView(frameLayout, w7.x5.d(-1, 36.0f, 55, 8.0f, 12.0f, 8.0f, 8.0f));
        ImageView imageView = new ImageView(context);
        this.f43001b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        org.telegram.ui.Components.xm0 xm0Var = new org.telegram.ui.Components.xm0();
        this.f43004f = xm0Var;
        xm0Var.c(0, false, false);
        int i11 = org.telegram.ui.ActionBar.j6.Je;
        xm0Var.a(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        imageView.setImageDrawable(xm0Var);
        final a61 a61Var = (a61) this;
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        a61 a61Var2 = a61Var;
                        org.telegram.ui.Cells.b6 b6Var = a61Var2.h;
                        if (a61Var2.f43004f.f32621k == 1) {
                            b6Var.setText("");
                            a61Var2.f43010y.v(null, true, false);
                            x61 x61Var = a61Var2.f43005n;
                            if (x61Var != null) {
                                x61Var.E1(null);
                                a61Var2.f43005n.F1(true, true);
                                a61Var2.f43005n.C1();
                            }
                            b6Var.clearAnimation();
                            b6Var.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.pr.h).start();
                            a61Var2.c(false);
                            return;
                        }
                        return;
                    case 1:
                        a61 a61Var3 = a61Var;
                        j71 j71Var2 = a61Var3.f43010y;
                        if (!j71Var2.u()) {
                            j71Var2.q();
                            a61Var3.h.requestFocus();
                            j71.a(j71Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        a61 a61Var4 = a61Var;
                        org.telegram.ui.Cells.b6 b6Var2 = a61Var4.h;
                        b6Var2.setText("");
                        a61Var4.f43010y.v(null, true, false);
                        x61 x61Var2 = a61Var4.f43005n;
                        if (x61Var2 != null) {
                            x61Var2.E1(null);
                            a61Var4.f43005n.F1(true, true);
                        }
                        b6Var2.clearAnimation();
                        b6Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.pr.h).start();
                        a61Var4.c(false);
                        return;
                }
            }
        });
        imageView.setClickable(false);
        imageView.setImportantForAccessibility(2);
        frameLayout.addView(imageView, w7.x5.e(36, 36, 51));
        org.telegram.ui.Components.ig0 ig0Var = new org.telegram.ui.Components.ig0(a61Var, context, z10);
        this.d = ig0Var;
        frameLayout.addView(ig0Var, w7.x5.d(-1, -1.0f, 119, 36.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Cells.b6 b6Var = new org.telegram.ui.Cells.b6(a61Var, context, f6Var, 1);
        this.h = b6Var;
        b6Var.addTextChangedListener(new l0(a61Var, 15));
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
        ig0Var.addView(b6Var, w7.x5.d(-1, -1.0f, 119, 0.0f, 0.0f, 32.0f, 0.0f));
        if (z10) {
            View view = new View(context);
            this.f43003e = view;
            Drawable mutate = context.getResources().getDrawable(R.drawable.gradient_right).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), PorterDuff.Mode.MULTIPLY));
            view.setBackground(mutate);
            view.setAlpha(0.0f);
            ig0Var.addView(view, w7.x5.e(18, -1, 3));
        }
        setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        a61 a61Var2 = a61Var;
                        org.telegram.ui.Cells.b6 b6Var2 = a61Var2.h;
                        if (a61Var2.f43004f.f32621k == 1) {
                            b6Var2.setText("");
                            a61Var2.f43010y.v(null, true, false);
                            x61 x61Var = a61Var2.f43005n;
                            if (x61Var != null) {
                                x61Var.E1(null);
                                a61Var2.f43005n.F1(true, true);
                                a61Var2.f43005n.C1();
                            }
                            b6Var2.clearAnimation();
                            b6Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.pr.h).start();
                            a61Var2.c(false);
                            return;
                        }
                        return;
                    case 1:
                        a61 a61Var3 = a61Var;
                        j71 j71Var2 = a61Var3.f43010y;
                        if (!j71Var2.u()) {
                            j71Var2.q();
                            a61Var3.h.requestFocus();
                            j71.a(j71Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        a61 a61Var4 = a61Var;
                        org.telegram.ui.Cells.b6 b6Var22 = a61Var4.h;
                        b6Var22.setText("");
                        a61Var4.f43010y.v(null, true, false);
                        x61 x61Var2 = a61Var4.f43005n;
                        if (x61Var2 != null) {
                            x61Var2.E1(null);
                            a61Var4.f43005n.F1(true, true);
                        }
                        b6Var22.clearAnimation();
                        b6Var22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.pr.h).start();
                        a61Var4.c(false);
                        return;
                }
            }
        });
        ImageView imageView2 = new ImageView(context);
        this.f43002c = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new di.j2(a61Var));
        imageView2.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20753i6, f6Var), 1, AndroidUtilities.dp(15.0f)));
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        a61 a61Var2 = a61Var;
                        org.telegram.ui.Cells.b6 b6Var2 = a61Var2.h;
                        if (a61Var2.f43004f.f32621k == 1) {
                            b6Var2.setText("");
                            a61Var2.f43010y.v(null, true, false);
                            x61 x61Var = a61Var2.f43005n;
                            if (x61Var != null) {
                                x61Var.E1(null);
                                a61Var2.f43005n.F1(true, true);
                                a61Var2.f43005n.C1();
                            }
                            b6Var2.clearAnimation();
                            b6Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.pr.h).start();
                            a61Var2.c(false);
                            return;
                        }
                        return;
                    case 1:
                        a61 a61Var3 = a61Var;
                        j71 j71Var2 = a61Var3.f43010y;
                        if (!j71Var2.u()) {
                            j71Var2.q();
                            a61Var3.h.requestFocus();
                            j71.a(j71Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        a61 a61Var4 = a61Var;
                        org.telegram.ui.Cells.b6 b6Var22 = a61Var4.h;
                        b6Var22.setText("");
                        a61Var4.f43010y.v(null, true, false);
                        x61 x61Var2 = a61Var4.f43005n;
                        if (x61Var2 != null) {
                            x61Var2.E1(null);
                            a61Var4.f43005n.F1(true, true);
                        }
                        b6Var22.clearAnimation();
                        b6Var22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.pr.h).start();
                        a61Var4.c(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView2, w7.x5.e(36, 36, 53));
        if (!ah.y0.d) {
            b();
        }
    }

    public static void a(a61 a61Var, boolean z10) {
        if (z10) {
            if (a61Var.v == null) {
                f01 f01Var = new f01(a61Var, 14);
                a61Var.v = f01Var;
                AndroidUtilities.runOnUIThread(f01Var, 340L);
                return;
            }
            return;
        }
        f01 f01Var2 = a61Var.v;
        if (f01Var2 != null) {
            AndroidUtilities.cancelRunOnUIThread(f01Var2);
            a61Var.v = null;
        }
        AndroidUtilities.updateViewShow(a61Var.f43002c, false);
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.y61.b():void");
    }

    public final void c(boolean z10) {
        float f7;
        if (z10 == this.f43008w) {
            return;
        }
        this.f43008w = z10;
        ValueAnimator valueAnimator = this.f43007s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.f43006r;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f43007s = ofFloat;
        ofFloat.addUpdateListener(new b21(this, 9));
        this.f43007s.setDuration(120L);
        this.f43007s.setInterpolator(org.telegram.ui.Components.pr.h);
        this.f43007s.start();
    }

    @Override
    public final void d() {
        if (this.f43009x) {
            this.f43000a.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, this.f43010y.Z0))));
        }
    }

    public final void e(boolean z10) {
        ?? r62;
        String str;
        x61 x61Var;
        x61 x61Var2;
        org.telegram.ui.Components.xm0 xm0Var = this.f43004f;
        int i10 = xm0Var.f32621k;
        org.telegram.ui.Cells.b6 b6Var = this.h;
        int i11 = 2;
        if (i10 == 2 && ((b6Var.length() != 0 || ((x61Var2 = this.f43005n) != null && x61Var2.getSelectedCategory() != null)) && !z10)) {
            return;
        }
        if (b6Var.length() <= 0 && ((x61Var = this.f43005n) == null || x61Var.f32007o3 <= 0.5f || (!x61Var.j3 && x61Var.getSelectedCategory() == null))) {
            r62 = 0;
        } else {
            r62 = 1;
        }
        xm0Var.b(r62);
        ImageView imageView = this.f43001b;
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

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void invalidate() {
        if (ah.y0.b(this)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(52.0f), 1073741824));
    }
}
