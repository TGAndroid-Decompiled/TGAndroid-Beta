package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
public final class y11 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public ShapeDrawable D;
    public int E;
    public final g31 F;
    public final g31 G;
    public final FrameLayout f43532a;
    public final ImageView f43533b;
    public final ImageView f43534c;
    public final kg.x d;
    public final View e;
    public final org.telegram.ui.Components.jm0 f43535f;
    public final ih.b h;
    public v21 f43536n;
    public float f43537r;
    public ValueAnimator f43538s;
    public vv0 f43539w;
    public boolean f43540x;
    public boolean f43541y;

    public y11(g31 g31Var, Context context, boolean z10) {
        super(context);
        org.telegram.ui.ActionBar.p6 p6Var = g31Var.Z0;
        this.G = g31Var;
        this.F = g31Var;
        this.f43540x = false;
        setClickable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f43532a = frameLayout;
        if (z10) {
            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.G8, this, p6Var);
        }
        int L = org.telegram.messenger.i0.L(18.0f);
        int i10 = org.telegram.ui.ActionBar.t6.f21286wf;
        Drawable d02 = org.telegram.ui.ActionBar.t6.d0(L, org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i10);
        frameLayout.setBackground(d02);
        org.telegram.ui.ActionBar.a7.k(frameLayout, d02, N, null, p6Var);
        frameLayout.setClipToOutline(true);
        bi.d2 d2Var = rf.e0.f46537a;
        frameLayout.setOutlineProvider(new rf.c0(0, org.telegram.messenger.i0.L(18.0f)));
        addView(frameLayout, w7.b6.d(-1, 36.0f, 55, 8.0f, 12.0f, 8.0f, 8.0f));
        ImageView imageView = new ImageView(context);
        this.f43533b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        org.telegram.ui.Components.jm0 jm0Var = new org.telegram.ui.Components.jm0();
        this.f43535f = jm0Var;
        jm0Var.c(0, false, false);
        int i11 = org.telegram.ui.ActionBar.t6.f21321yf;
        jm0Var.a(org.telegram.ui.ActionBar.t6.w0(i11, p6Var));
        imageView.setImageDrawable(jm0Var);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final y11 f41208b;

            {
                this.f41208b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        y11 y11Var = this.f41208b;
                        ih.b bVar = y11Var.h;
                        if (y11Var.f43535f.f27467k == 1) {
                            bVar.setText("");
                            y11Var.F.v(null, true, false);
                            v21 v21Var = y11Var.f43536n;
                            if (v21Var != null) {
                                v21Var.I1(null);
                                y11Var.f43536n.J1(true, true);
                                y11Var.f43536n.G1();
                            }
                            bVar.clearAnimation();
                            bVar.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.gr.h).start();
                            y11Var.c(false);
                            return;
                        }
                        return;
                    case 1:
                        y11 y11Var2 = this.f41208b;
                        g31 g31Var2 = y11Var2.F;
                        if (!g31Var2.u()) {
                            g31Var2.q();
                            y11Var2.h.requestFocus();
                            g31.a(g31Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        y11 y11Var3 = this.f41208b;
                        ih.b bVar2 = y11Var3.h;
                        bVar2.setText("");
                        y11Var3.F.v(null, true, false);
                        v21 v21Var2 = y11Var3.f43536n;
                        if (v21Var2 != null) {
                            v21Var2.I1(null);
                            y11Var3.f43536n.J1(true, true);
                        }
                        bVar2.clearAnimation();
                        bVar2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.gr.h).start();
                        y11Var3.c(false);
                        return;
                }
            }
        });
        imageView.setClickable(false);
        imageView.setImportantForAccessibility(2);
        frameLayout.addView(imageView, w7.b6.e(36, 36, 51));
        kg.x xVar = new kg.x(this, context, z10);
        this.d = xVar;
        frameLayout.addView(xVar, w7.b6.d(-1, -1.0f, 119, 36.0f, 0.0f, 0.0f, 0.0f));
        ih.b bVar = new ih.b(this, context, p6Var, 2);
        this.h = bVar;
        bVar.addTextChangedListener(new n0(this, 15));
        bVar.setBackground(null);
        bVar.setPadding(0, 0, org.telegram.messenger.i0.L(4.0f), 0);
        bVar.setTextSize(1, 16.0f);
        bVar.setHint(org.telegram.messenger.dd.L0(2131745853, null));
        org.telegram.ui.ActionBar.a7.E(bVar, i11, p6Var);
        org.telegram.ui.ActionBar.a7.V(bVar, org.telegram.ui.ActionBar.t6.G6, p6Var);
        bVar.setImeOptions(268435459);
        org.telegram.ui.ActionBar.a7.m(bVar, 30, org.telegram.ui.ActionBar.t6.Ai, p6Var);
        bVar.setCursorSize(org.telegram.messenger.i0.L(20.0f));
        bVar.setGravity(19);
        bVar.setCursorWidth(1.5f);
        bVar.setMaxLines(1);
        bVar.setSingleLine(true);
        bVar.setLines(1);
        bVar.setTranslationY(org.telegram.messenger.i0.L(-1.0f));
        xVar.addView(bVar, w7.b6.d(-1, -1.0f, 119, 0.0f, 0.0f, 32.0f, 0.0f));
        if (z10) {
            View view = new View(context);
            this.e = view;
            Drawable f7 = i0.a.f(context, 2131231228);
            org.telegram.ui.ActionBar.a7.y(this, f7, i10, p6Var, PorterDuff.Mode.MULTIPLY);
            view.setBackground(f7);
            view.setAlpha(0.0f);
            xVar.addView(view, w7.b6.e(18, -1, 3));
        }
        setOnClickListener(new View.OnClickListener(this) {
            public final y11 f41208b;

            {
                this.f41208b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        y11 y11Var = this.f41208b;
                        ih.b bVar2 = y11Var.h;
                        if (y11Var.f43535f.f27467k == 1) {
                            bVar2.setText("");
                            y11Var.F.v(null, true, false);
                            v21 v21Var = y11Var.f43536n;
                            if (v21Var != null) {
                                v21Var.I1(null);
                                y11Var.f43536n.J1(true, true);
                                y11Var.f43536n.G1();
                            }
                            bVar2.clearAnimation();
                            bVar2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.gr.h).start();
                            y11Var.c(false);
                            return;
                        }
                        return;
                    case 1:
                        y11 y11Var2 = this.f41208b;
                        g31 g31Var2 = y11Var2.F;
                        if (!g31Var2.u()) {
                            g31Var2.q();
                            y11Var2.h.requestFocus();
                            g31.a(g31Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        y11 y11Var3 = this.f41208b;
                        ih.b bVar22 = y11Var3.h;
                        bVar22.setText("");
                        y11Var3.F.v(null, true, false);
                        v21 v21Var2 = y11Var3.f43536n;
                        if (v21Var2 != null) {
                            v21Var2.I1(null);
                            y11Var3.f43536n.J1(true, true);
                        }
                        bVar22.clearAnimation();
                        bVar22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.gr.h).start();
                        y11Var3.c(false);
                        return;
                }
            }
        });
        ImageView imageView2 = new ImageView(context);
        this.f43534c = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new org.telegram.ui.ActionBar.h0(this));
        int i12 = org.telegram.ui.ActionBar.t6.f21021i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i12, p6Var), 1, org.telegram.messenger.i0.L(15.0f));
        org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i12);
        imageView2.setBackground(h02);
        org.telegram.ui.ActionBar.a7.k(imageView2, h02, null, N2, p6Var);
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final y11 f41208b;

            {
                this.f41208b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        y11 y11Var = this.f41208b;
                        ih.b bVar2 = y11Var.h;
                        if (y11Var.f43535f.f27467k == 1) {
                            bVar2.setText("");
                            y11Var.F.v(null, true, false);
                            v21 v21Var = y11Var.f43536n;
                            if (v21Var != null) {
                                v21Var.I1(null);
                                y11Var.f43536n.J1(true, true);
                                y11Var.f43536n.G1();
                            }
                            bVar2.clearAnimation();
                            bVar2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.gr.h).start();
                            y11Var.c(false);
                            return;
                        }
                        return;
                    case 1:
                        y11 y11Var2 = this.f41208b;
                        g31 g31Var2 = y11Var2.F;
                        if (!g31Var2.u()) {
                            g31Var2.q();
                            y11Var2.h.requestFocus();
                            g31.a(g31Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        y11 y11Var3 = this.f41208b;
                        ih.b bVar22 = y11Var3.h;
                        bVar22.setText("");
                        y11Var3.F.v(null, true, false);
                        v21 v21Var2 = y11Var3.f43536n;
                        if (v21Var2 != null) {
                            v21Var2.I1(null);
                            y11Var3.f43536n.J1(true, true);
                        }
                        bVar22.clearAnimation();
                        bVar22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.gr.h).start();
                        y11Var3.c(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView2, w7.b6.e(36, 36, 53));
        if (!sg.e0.d) {
            b();
        }
    }

    public static void a(y11 y11Var, boolean z10) {
        if (z10) {
            if (y11Var.f43539w == null) {
                vv0 vv0Var = new vv0(y11Var, 18);
                y11Var.f43539w = vv0Var;
                org.telegram.messenger.i0.h3(vv0Var, 340L);
                return;
            }
            return;
        }
        vv0 vv0Var2 = y11Var.f43539w;
        if (vv0Var2 != null) {
            org.telegram.messenger.i0.r(vv0Var2);
            y11Var.f43539w = null;
        }
        org.telegram.messenger.i0.U3(y11Var.f43534c, false, true);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.E8));
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.y11.b():void");
    }

    public final void c(boolean z10) {
        float f7;
        if (z10 == this.f43540x) {
            return;
        }
        this.f43540x = z10;
        ValueAnimator valueAnimator = this.f43538s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.f43537r;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f43538s = ofFloat;
        ofFloat.addUpdateListener(new u01(this, 5));
        this.f43538s.setDuration(120L);
        this.f43538s.setInterpolator(org.telegram.ui.Components.gr.h);
        this.f43538s.start();
    }

    public final void d(boolean z10) {
        ?? r62;
        v21 v21Var;
        v21 v21Var2;
        org.telegram.ui.Components.jm0 jm0Var = this.f43535f;
        int i10 = jm0Var.f27467k;
        ih.b bVar = this.h;
        int i11 = 2;
        if (i10 == 2 && ((bVar.length() != 0 || ((v21Var2 = this.f43536n) != null && v21Var2.getSelectedCategory() != null)) && !z10)) {
            return;
        }
        if (bVar.length() <= 0 && ((v21Var = this.f43536n) == null || v21Var.f25280v3 <= 0.5f || (!v21Var.f25275q3 && v21Var.getSelectedCategory() == null))) {
            r62 = 0;
        } else {
            r62 = 1;
        }
        jm0Var.b(r62);
        ImageView imageView = this.f43533b;
        imageView.setClickable(r62);
        String str = null;
        if (r62 != 0) {
            str = org.telegram.messenger.dd.L0(2131754878, null);
        }
        imageView.setContentDescription(str);
        if (r62 != 0) {
            i11 = 1;
        }
        imageView.setImportantForAccessibility(i11);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float y3;
        g31 g31Var = this.G;
        bg0 bg0Var = g31Var.f37303g0;
        y11 y11Var = g31Var.f37301f0;
        h21 h21Var = g31Var.U;
        if (h21Var != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float x10 = bg0Var.getX() + y11Var.getX();
            float y10 = bg0Var.getY() + y11Var.getY();
            org.telegram.ui.web.k0 k0Var = (org.telegram.ui.web.k0) h21Var;
            sg.b0 b0Var = (sg.b0) k0Var.f42884b;
            sg.a0 a0Var = b0Var.f48286a;
            RectF rectF = org.telegram.messenger.i0.P;
            float f7 = 0;
            rectF.set(f7, f7, measuredWidth, measuredHeight);
            org.telegram.ui.Components.mj0 delegate = ((org.telegram.ui.Components.nj0) k0Var.f42885c).getDelegate();
            float x11 = a0Var.getX() + x10;
            if (b0Var.f48306y == 1) {
                y3 = a0Var.getY() - org.telegram.messenger.i0.f16166m;
            } else {
                y3 = a0Var.getY() + b0Var.f48288c.getY();
            }
            delegate.r(canvas, rectF, 0.0f, x11, y3 + y10, 255, true);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void invalidate() {
        if (sg.e0.b(this)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(52.0f), 1073741824));
    }

    @Override
    public final void setTranslationY(float f7) {
        if (f7 != getTranslationY()) {
            super.setTranslationY(f7);
            if (this.G.U != null) {
                invalidate();
            }
        }
    }

    @Override
    public final void updateColors() {
        FrameLayout frameLayout;
        org.telegram.ui.ActionBar.p6 p6Var = this.F.Z0;
        try {
            org.telegram.ui.Components.jm0 jm0Var = this.f43535f;
            if (jm0Var != null) {
                jm0Var.a(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21321yf, p6Var));
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        if (this.f43541y && (frameLayout = this.f43532a) != null) {
            int r12 = org.telegram.ui.ActionBar.t6.r1(0.06f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.E8, p6Var));
            if (this.D != null) {
                Drawable background = frameLayout.getBackground();
                ShapeDrawable shapeDrawable = this.D;
                if (background == shapeDrawable) {
                    if (r12 != this.E) {
                        org.telegram.ui.ActionBar.t6.C1(r12, shapeDrawable);
                        frameLayout.invalidate();
                    }
                    this.E = r12;
                }
            }
            ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(18.0f), r12);
            this.D = d02;
            frameLayout.setBackground(d02);
            this.E = r12;
        }
    }
}
