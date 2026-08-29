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
public abstract class s51 extends FrameLayout implements org.telegram.ui.ActionBar.x5 {
    public final FrameLayout f42271a;
    public final ImageView f42272b;
    public final ImageView f42273c;
    public final cg.y d;
    public final View f42274e;
    public final org.telegram.ui.Components.vm0 f42275f;
    public final bh.b h;
    public r51 f42276n;
    public float f42277r;
    public ValueAnimator f42278s;
    public ky0 v;
    public boolean f42279w;
    public boolean f42280x;
    public final d61 f42281y;

    public s51(d61 d61Var, Context context, boolean z10) {
        super(context);
        org.telegram.ui.ActionBar.c6 c6Var = d61Var.V0;
        this.f42281y = d61Var;
        this.f42279w = false;
        setClickable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f42271a = frameLayout;
        if (z10) {
            setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G8, c6Var));
        }
        int dp = AndroidUtilities.dp(18.0f);
        int i10 = org.telegram.ui.ActionBar.g6.He;
        frameLayout.setBackground(org.telegram.ui.ActionBar.g6.b0(dp, org.telegram.ui.ActionBar.g6.v0(i10, c6Var)));
        frameLayout.setClipToOutline(true);
        eg.k1 k1Var = jf.q0.f11668a;
        frameLayout.setOutlineProvider(new jf.p0(0, AndroidUtilities.dp(18.0f)));
        addView(frameLayout, i7.f6.d(-1, 36.0f, 55, 8.0f, 12.0f, 8.0f, 8.0f));
        ImageView imageView = new ImageView(context);
        this.f42272b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        org.telegram.ui.Components.vm0 vm0Var = new org.telegram.ui.Components.vm0();
        this.f42275f = vm0Var;
        vm0Var.c(0, false, false);
        int i11 = org.telegram.ui.ActionBar.g6.Je;
        vm0Var.a(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        imageView.setImageDrawable(vm0Var);
        final u41 u41Var = (u41) this;
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        u41 u41Var2 = u41Var;
                        bh.b bVar = u41Var2.h;
                        if (u41Var2.f42275f.f33585k == 1) {
                            bVar.setText("");
                            u41Var2.f42281y.v(null, true, false);
                            r51 r51Var = u41Var2.f42276n;
                            if (r51Var != null) {
                                r51Var.F1(null);
                                u41Var2.f42276n.G1(true, true);
                                u41Var2.f42276n.D1();
                            }
                            bVar.clearAnimation();
                            bVar.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.jr.h).start();
                            u41Var2.c(false);
                            return;
                        }
                        return;
                    case 1:
                        u41 u41Var3 = u41Var;
                        d61 d61Var2 = u41Var3.f42281y;
                        if (!d61Var2.u()) {
                            d61Var2.q();
                            u41Var3.h.requestFocus();
                            d61.a(d61Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        u41 u41Var4 = u41Var;
                        bh.b bVar2 = u41Var4.h;
                        bVar2.setText("");
                        u41Var4.f42281y.v(null, true, false);
                        r51 r51Var2 = u41Var4.f42276n;
                        if (r51Var2 != null) {
                            r51Var2.F1(null);
                            u41Var4.f42276n.G1(true, true);
                        }
                        bVar2.clearAnimation();
                        bVar2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.jr.h).start();
                        u41Var4.c(false);
                        return;
                }
            }
        });
        imageView.setClickable(false);
        imageView.setImportantForAccessibility(2);
        frameLayout.addView(imageView, i7.f6.e(36, 36, 51));
        cg.y yVar = new cg.y(u41Var, context, z10);
        this.d = yVar;
        frameLayout.addView(yVar, i7.f6.d(-1, -1.0f, 119, 36.0f, 0.0f, 0.0f, 0.0f));
        bh.b bVar = new bh.b(u41Var, context, c6Var, 3);
        this.h = bVar;
        bVar.addTextChangedListener(new p0(u41Var, 15));
        bVar.setBackground(null);
        bVar.setPadding(0, 0, AndroidUtilities.dp(4.0f), 0);
        bVar.setTextSize(1, 16.0f);
        bVar.setHint(LocaleController.getString(R.string.Search));
        bVar.setHintTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        bVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        bVar.setImeOptions(268435459);
        bVar.setCursorColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Mh, c6Var));
        bVar.setCursorSize(AndroidUtilities.dp(20.0f));
        bVar.setGravity(19);
        bVar.setCursorWidth(1.5f);
        bVar.setMaxLines(1);
        bVar.setSingleLine(true);
        bVar.setLines(1);
        bVar.setTranslationY(AndroidUtilities.dp(-1.0f));
        yVar.addView(bVar, i7.f6.d(-1, -1.0f, 119, 0.0f, 0.0f, 32.0f, 0.0f));
        if (z10) {
            View view = new View(context);
            this.f42274e = view;
            Drawable mutate = context.getResources().getDrawable(R.drawable.gradient_right).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), PorterDuff.Mode.MULTIPLY));
            view.setBackground(mutate);
            view.setAlpha(0.0f);
            yVar.addView(view, i7.f6.e(18, -1, 3));
        }
        setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        u41 u41Var2 = u41Var;
                        bh.b bVar2 = u41Var2.h;
                        if (u41Var2.f42275f.f33585k == 1) {
                            bVar2.setText("");
                            u41Var2.f42281y.v(null, true, false);
                            r51 r51Var = u41Var2.f42276n;
                            if (r51Var != null) {
                                r51Var.F1(null);
                                u41Var2.f42276n.G1(true, true);
                                u41Var2.f42276n.D1();
                            }
                            bVar2.clearAnimation();
                            bVar2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.jr.h).start();
                            u41Var2.c(false);
                            return;
                        }
                        return;
                    case 1:
                        u41 u41Var3 = u41Var;
                        d61 d61Var2 = u41Var3.f42281y;
                        if (!d61Var2.u()) {
                            d61Var2.q();
                            u41Var3.h.requestFocus();
                            d61.a(d61Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        u41 u41Var4 = u41Var;
                        bh.b bVar22 = u41Var4.h;
                        bVar22.setText("");
                        u41Var4.f42281y.v(null, true, false);
                        r51 r51Var2 = u41Var4.f42276n;
                        if (r51Var2 != null) {
                            r51Var2.F1(null);
                            u41Var4.f42276n.G1(true, true);
                        }
                        bVar22.clearAnimation();
                        bVar22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.jr.h).start();
                        u41Var4.c(false);
                        return;
                }
            }
        });
        ImageView imageView2 = new ImageView(context);
        this.f42273c = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new nh.b2(u41Var));
        imageView2.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23152i6, c6Var), 1, AndroidUtilities.dp(15.0f)));
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        u41 u41Var2 = u41Var;
                        bh.b bVar2 = u41Var2.h;
                        if (u41Var2.f42275f.f33585k == 1) {
                            bVar2.setText("");
                            u41Var2.f42281y.v(null, true, false);
                            r51 r51Var = u41Var2.f42276n;
                            if (r51Var != null) {
                                r51Var.F1(null);
                                u41Var2.f42276n.G1(true, true);
                                u41Var2.f42276n.D1();
                            }
                            bVar2.clearAnimation();
                            bVar2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.jr.h).start();
                            u41Var2.c(false);
                            return;
                        }
                        return;
                    case 1:
                        u41 u41Var3 = u41Var;
                        d61 d61Var2 = u41Var3.f42281y;
                        if (!d61Var2.u()) {
                            d61Var2.q();
                            u41Var3.h.requestFocus();
                            d61.a(d61Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        u41 u41Var4 = u41Var;
                        bh.b bVar22 = u41Var4.h;
                        bVar22.setText("");
                        u41Var4.f42281y.v(null, true, false);
                        r51 r51Var2 = u41Var4.f42276n;
                        if (r51Var2 != null) {
                            r51Var2.F1(null);
                            u41Var4.f42276n.G1(true, true);
                        }
                        bVar22.clearAnimation();
                        bVar22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.jr.h).start();
                        u41Var4.c(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView2, i7.f6.e(36, 36, 53));
        if (!kg.g0.d) {
            b();
        }
    }

    public static void a(u41 u41Var, boolean z10) {
        if (z10) {
            if (u41Var.v == null) {
                ky0 ky0Var = new ky0(u41Var, 16);
                u41Var.v = ky0Var;
                AndroidUtilities.runOnUIThread(ky0Var, 340L);
                return;
            }
            return;
        }
        ky0 ky0Var2 = u41Var.v;
        if (ky0Var2 != null) {
            AndroidUtilities.cancelRunOnUIThread(ky0Var2);
            u41Var.v = null;
        }
        AndroidUtilities.updateViewShow(u41Var.f42273c, false);
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.s51.b():void");
    }

    public final void c(boolean z10) {
        float f9;
        if (z10 == this.f42279w) {
            return;
        }
        this.f42279w = z10;
        ValueAnimator valueAnimator = this.f42278s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.f42277r;
        if (z10) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f9);
        this.f42278s = ofFloat;
        ofFloat.addUpdateListener(new w01(this, 9));
        this.f42278s.setDuration(120L);
        this.f42278s.setInterpolator(org.telegram.ui.Components.jr.h);
        this.f42278s.start();
    }

    public final void d(boolean z10) {
        ?? r6;
        String str;
        r51 r51Var;
        r51 r51Var2;
        org.telegram.ui.Components.vm0 vm0Var = this.f42275f;
        int i10 = vm0Var.f33585k;
        bh.b bVar = this.h;
        int i11 = 2;
        if (i10 == 2 && ((bVar.length() != 0 || ((r51Var2 = this.f42276n) != null && r51Var2.getSelectedCategory() != null)) && !z10)) {
            return;
        }
        if (bVar.length() <= 0 && ((r51Var = this.f42276n) == null || r51Var.f31499k3 <= 0.5f || (!r51Var.f31494f3 && r51Var.getSelectedCategory() == null))) {
            r6 = 0;
        } else {
            r6 = 1;
        }
        vm0Var.b(r6);
        ImageView imageView = this.f42272b;
        imageView.setClickable(r6);
        if (r6 != 0) {
            str = LocaleController.getString(R.string.AccDescrGoBack);
        } else {
            str = null;
        }
        imageView.setContentDescription(str);
        if (r6 != 0) {
            i11 = 1;
        }
        imageView.setImportantForAccessibility(i11);
    }

    @Override
    public final void e() {
        if (this.f42280x) {
            this.f42271a.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.g6.l1(0.06f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, this.f42281y.V0))));
        }
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void invalidate() {
        if (kg.g0.b(this)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(52.0f), 1073741824));
    }
}
