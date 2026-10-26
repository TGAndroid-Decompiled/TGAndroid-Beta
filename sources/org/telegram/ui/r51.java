package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public abstract class r51 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public int E;
    public final c61 F;
    public final FrameLayout f42999a;
    public final ImageView f43000b;
    public final ImageView f43001c;
    public final org.telegram.ui.Components.gh0 d;
    public final View e;
    public final org.telegram.ui.Components.eo0 f43002f;
    public final org.telegram.ui.Cells.g6 h;
    public q51 f43003n;
    public float f43004r;
    public ValueAnimator f43005s;
    public my0 v;
    public boolean f43006w;
    public boolean f43007x;
    public ShapeDrawable f43008y;

    public r51(c61 c61Var, Context context, boolean z10) {
        super(context);
        org.telegram.ui.ActionBar.u6 u6Var = c61Var.Z0;
        this.F = c61Var;
        this.f43006w = false;
        setClickable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f42999a = frameLayout;
        if (z10) {
            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.G8, this, u6Var);
        }
        int dp = AndroidUtilities.dp(18.0f);
        int i10 = org.telegram.ui.ActionBar.y6.He;
        Drawable c02 = org.telegram.ui.ActionBar.y6.c0(dp, org.telegram.ui.ActionBar.y6.w0(i10, u6Var));
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i10);
        frameLayout.setBackground(c02);
        org.telegram.ui.ActionBar.f7.k(frameLayout, c02, N, null, u6Var);
        frameLayout.setClipToOutline(true);
        ag.v0 v0Var = ag.z0.f1400a;
        frameLayout.setOutlineProvider(new ag.x0(0, AndroidUtilities.dp(18.0f)));
        addView(frameLayout, org.telegram.ui.Components.gb1.h(-1, 36.0f, 55, 8.0f, 12.0f, 8.0f, 8.0f));
        ImageView imageView = new ImageView(context);
        this.f43000b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        org.telegram.ui.Components.eo0 eo0Var = new org.telegram.ui.Components.eo0();
        this.f43002f = eo0Var;
        eo0Var.c(0, false, false);
        int i11 = org.telegram.ui.ActionBar.y6.Je;
        eo0Var.a(org.telegram.ui.ActionBar.y6.w0(i11, u6Var));
        imageView.setImageDrawable(eo0Var);
        final t41 t41Var = (t41) this;
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        t41 t41Var2 = t41Var;
                        org.telegram.ui.Cells.g6 g6Var = t41Var2.h;
                        if (t41Var2.f43002f.f27918k == 1) {
                            g6Var.setText("");
                            t41Var2.F.v(null, true, false);
                            q51 q51Var = t41Var2.f43003n;
                            if (q51Var != null) {
                                q51Var.L1(null);
                                t41Var2.f43003n.M1(true, true);
                                t41Var2.f43003n.J1();
                            }
                            g6Var.clearAnimation();
                            g6Var.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.ds.h).start();
                            t41Var2.c(false);
                            return;
                        }
                        return;
                    case 1:
                        t41 t41Var3 = t41Var;
                        c61 c61Var2 = t41Var3.F;
                        if (!c61Var2.u()) {
                            c61Var2.q();
                            t41Var3.h.requestFocus();
                            c61.a(c61Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        t41 t41Var4 = t41Var;
                        org.telegram.ui.Cells.g6 g6Var2 = t41Var4.h;
                        g6Var2.setText("");
                        t41Var4.F.v(null, true, false);
                        q51 q51Var2 = t41Var4.f43003n;
                        if (q51Var2 != null) {
                            q51Var2.L1(null);
                            t41Var4.f43003n.M1(true, true);
                        }
                        g6Var2.clearAnimation();
                        g6Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.ds.h).start();
                        t41Var4.c(false);
                        return;
                }
            }
        });
        imageView.setClickable(false);
        imageView.setImportantForAccessibility(2);
        frameLayout.addView(imageView, org.telegram.ui.Components.gb1.i(36, 36, 51));
        org.telegram.ui.Components.gh0 gh0Var = new org.telegram.ui.Components.gh0(t41Var, context, z10);
        this.d = gh0Var;
        frameLayout.addView(gh0Var, org.telegram.ui.Components.gb1.h(-1, -1.0f, 119, 36.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Cells.g6 g6Var = new org.telegram.ui.Cells.g6(t41Var, context, u6Var, 1);
        this.h = g6Var;
        g6Var.addTextChangedListener(new m0(t41Var, 15));
        g6Var.setBackground(null);
        g6Var.setPadding(0, 0, AndroidUtilities.dp(4.0f), 0);
        g6Var.setTextSize(1, 16.0f);
        g6Var.setHint(LocaleController.getString(R.string.Search));
        org.telegram.ui.ActionBar.f7.E(g6Var, i11, u6Var);
        org.telegram.ui.ActionBar.f7.V(g6Var, org.telegram.ui.ActionBar.y6.G6, u6Var);
        g6Var.setImeOptions(268435459);
        org.telegram.ui.ActionBar.f7.m(g6Var, 30, org.telegram.ui.ActionBar.y6.Mh, u6Var);
        g6Var.setCursorSize(AndroidUtilities.dp(20.0f));
        g6Var.setGravity(19);
        g6Var.setCursorWidth(1.5f);
        g6Var.setMaxLines(1);
        g6Var.setSingleLine(true);
        g6Var.setLines(1);
        g6Var.setTranslationY(AndroidUtilities.dp(-1.0f));
        gh0Var.addView(g6Var, org.telegram.ui.Components.gb1.h(-1, -1.0f, 119, 0.0f, 0.0f, 32.0f, 0.0f));
        if (z10) {
            View view = new View(context);
            this.e = view;
            Drawable mutate = context.getResources().getDrawable(R.drawable.gradient_right).mutate();
            org.telegram.ui.ActionBar.f7.y(this, mutate, i10, u6Var, PorterDuff.Mode.MULTIPLY);
            view.setBackground(mutate);
            view.setAlpha(0.0f);
            gh0Var.addView(view, org.telegram.ui.Components.gb1.i(18, -1, 3));
        }
        setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        t41 t41Var2 = t41Var;
                        org.telegram.ui.Cells.g6 g6Var2 = t41Var2.h;
                        if (t41Var2.f43002f.f27918k == 1) {
                            g6Var2.setText("");
                            t41Var2.F.v(null, true, false);
                            q51 q51Var = t41Var2.f43003n;
                            if (q51Var != null) {
                                q51Var.L1(null);
                                t41Var2.f43003n.M1(true, true);
                                t41Var2.f43003n.J1();
                            }
                            g6Var2.clearAnimation();
                            g6Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.ds.h).start();
                            t41Var2.c(false);
                            return;
                        }
                        return;
                    case 1:
                        t41 t41Var3 = t41Var;
                        c61 c61Var2 = t41Var3.F;
                        if (!c61Var2.u()) {
                            c61Var2.q();
                            t41Var3.h.requestFocus();
                            c61.a(c61Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        t41 t41Var4 = t41Var;
                        org.telegram.ui.Cells.g6 g6Var22 = t41Var4.h;
                        g6Var22.setText("");
                        t41Var4.F.v(null, true, false);
                        q51 q51Var2 = t41Var4.f43003n;
                        if (q51Var2 != null) {
                            q51Var2.L1(null);
                            t41Var4.f43003n.M1(true, true);
                        }
                        g6Var22.clearAnimation();
                        g6Var22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.ds.h).start();
                        t41Var4.c(false);
                        return;
                }
            }
        });
        ImageView imageView2 = new ImageView(context);
        this.f43001c = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new fi.d2(t41Var));
        int i12 = org.telegram.ui.ActionBar.y6.f23448i6;
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.w0(i12, u6Var), 1, AndroidUtilities.dp(15.0f));
        org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(i12);
        imageView2.setBackground(g02);
        org.telegram.ui.ActionBar.f7.k(imageView2, g02, null, N2, u6Var);
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        t41 t41Var2 = t41Var;
                        org.telegram.ui.Cells.g6 g6Var2 = t41Var2.h;
                        if (t41Var2.f43002f.f27918k == 1) {
                            g6Var2.setText("");
                            t41Var2.F.v(null, true, false);
                            q51 q51Var = t41Var2.f43003n;
                            if (q51Var != null) {
                                q51Var.L1(null);
                                t41Var2.f43003n.M1(true, true);
                                t41Var2.f43003n.J1();
                            }
                            g6Var2.clearAnimation();
                            g6Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.ds.h).start();
                            t41Var2.c(false);
                            return;
                        }
                        return;
                    case 1:
                        t41 t41Var3 = t41Var;
                        c61 c61Var2 = t41Var3.F;
                        if (!c61Var2.u()) {
                            c61Var2.q();
                            t41Var3.h.requestFocus();
                            c61.a(c61Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        t41 t41Var4 = t41Var;
                        org.telegram.ui.Cells.g6 g6Var22 = t41Var4.h;
                        g6Var22.setText("");
                        t41Var4.F.v(null, true, false);
                        q51 q51Var2 = t41Var4.f43003n;
                        if (q51Var2 != null) {
                            q51Var2.L1(null);
                            t41Var4.f43003n.M1(true, true);
                        }
                        g6Var22.clearAnimation();
                        g6Var22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.ds.h).start();
                        t41Var4.c(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView2, org.telegram.ui.Components.gb1.i(36, 36, 53));
        if (!bh.m0.d) {
            b();
        }
    }

    public static void a(t41 t41Var, boolean z10) {
        if (z10) {
            if (t41Var.v == null) {
                my0 my0Var = new my0(t41Var, 17);
                t41Var.v = my0Var;
                AndroidUtilities.runOnUIThread(my0Var, 340L);
                return;
            }
            return;
        }
        my0 my0Var2 = t41Var.v;
        if (my0Var2 != null) {
            AndroidUtilities.cancelRunOnUIThread(my0Var2);
            t41Var.v = null;
        }
        AndroidUtilities.updateViewShow(t41Var.f43001c, false);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.E8));
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.r51.b():void");
    }

    public final void c(boolean z10) {
        float f7;
        if (z10 == this.f43006w) {
            return;
        }
        this.f43006w = z10;
        ValueAnimator valueAnimator = this.f43005s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.f43004r;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f43005s = ofFloat;
        ofFloat.addUpdateListener(new v11(this, 6));
        this.f43005s.setDuration(120L);
        this.f43005s.setInterpolator(org.telegram.ui.Components.ds.h);
        this.f43005s.start();
    }

    public final void d(boolean z10) {
        ?? r6;
        String str;
        q51 q51Var;
        q51 q51Var2;
        org.telegram.ui.Components.eo0 eo0Var = this.f43002f;
        int i10 = eo0Var.f27918k;
        org.telegram.ui.Cells.g6 g6Var = this.h;
        int i11 = 2;
        if (i10 == 2 && ((g6Var.length() != 0 || ((q51Var2 = this.f43003n) != null && q51Var2.getSelectedCategory() != null)) && !z10)) {
            return;
        }
        if (g6Var.length() <= 0 && ((q51Var = this.f43003n) == null || q51Var.f26997w3 <= 0.5f || (!q51Var.f26992r3 && q51Var.getSelectedCategory() == null))) {
            r6 = 0;
        } else {
            r6 = 1;
        }
        eo0Var.b(r6);
        ImageView imageView = this.f43000b;
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
    public final void invalidate() {
        if (bh.m0.b(this)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(52.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        FrameLayout frameLayout;
        org.telegram.ui.ActionBar.u6 u6Var = this.F.Z0;
        try {
            org.telegram.ui.Components.eo0 eo0Var = this.f43002f;
            if (eo0Var != null) {
                eo0Var.a(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Je, u6Var));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (this.f43007x && (frameLayout = this.f42999a) != null) {
            int o12 = org.telegram.ui.ActionBar.y6.o1(0.06f, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.E8, u6Var));
            if (this.f43008y != null) {
                Drawable background = frameLayout.getBackground();
                ShapeDrawable shapeDrawable = this.f43008y;
                if (background == shapeDrawable) {
                    if (o12 != this.E) {
                        org.telegram.ui.ActionBar.y6.z1(o12, shapeDrawable);
                        frameLayout.invalidate();
                    }
                    this.E = o12;
                }
            }
            ShapeDrawable c02 = org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(18.0f), o12);
            this.f43008y = c02;
            frameLayout.setBackground(c02);
            this.E = o12;
        }
    }
}
