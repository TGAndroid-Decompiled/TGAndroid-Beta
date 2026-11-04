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
public final class yz0 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public ShapeDrawable E;
    public int F;
    public final g11 G;
    public final g11 H;
    public final FrameLayout f52465a;
    public final ImageView f52466b;
    public final ImageView f52467c;
    public final gi.q3 d;
    public final View f52468e;
    public final org.telegram.ui.Components.jl0 f52469f;
    public final ai.z h;
    public v01 f52470n;
    public float f52471r;
    public ValueAnimator f52472s;
    public pu0 f52473w;
    public boolean f52474x;
    public boolean f52475y;

    public yz0(g11 g11Var, Context context, boolean z10) {
        super(context);
        org.telegram.ui.ActionBar.e6 e6Var = g11Var.f45436a1;
        this.H = g11Var;
        this.G = g11Var;
        this.f52474x = false;
        setClickable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f52465a = frameLayout;
        if (z10) {
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.G8, this, e6Var);
        }
        int L = org.telegram.messenger.g0.L(18.0f);
        int i3 = org.telegram.ui.ActionBar.k6.f28243wf;
        Drawable d02 = org.telegram.ui.ActionBar.k6.d0(L, org.telegram.ui.ActionBar.k6.w0(i3, e6Var));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i3);
        frameLayout.setBackground(d02);
        org.telegram.ui.ActionBar.r6.k(frameLayout, d02, N, null, e6Var);
        frameLayout.setClipToOutline(true);
        cg.p0 p0Var = cg.t0.f4745a;
        frameLayout.setOutlineProvider(new cg.r0(0, org.telegram.messenger.g0.L(18.0f)));
        addView(frameLayout, b8.mf.d(-1, 36.0f, 55, 8.0f, 12.0f, 8.0f, 8.0f));
        ImageView imageView = new ImageView(context);
        this.f52466b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        org.telegram.ui.Components.jl0 jl0Var = new org.telegram.ui.Components.jl0();
        this.f52469f = jl0Var;
        jl0Var.c(0, false, false);
        int i10 = org.telegram.ui.ActionBar.k6.f28280yf;
        jl0Var.a(org.telegram.ui.ActionBar.k6.w0(i10, e6Var));
        imageView.setImageDrawable(jl0Var);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final yz0 f49321b;

            {
                this.f49321b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        yz0 yz0Var = this.f49321b;
                        ai.z zVar = yz0Var.h;
                        if (yz0Var.f52469f.f35109k == 1) {
                            zVar.setText("");
                            yz0Var.G.v(null, true, false);
                            v01 v01Var = yz0Var.f52470n;
                            if (v01Var != null) {
                                v01Var.I1(null);
                                yz0Var.f52470n.J1(true, true);
                                yz0Var.f52470n.G1();
                            }
                            zVar.clearAnimation();
                            zVar.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.xq.h).start();
                            yz0Var.c(false);
                            return;
                        }
                        return;
                    case 1:
                        yz0 yz0Var2 = this.f49321b;
                        g11 g11Var2 = yz0Var2.G;
                        if (!g11Var2.u()) {
                            g11Var2.q();
                            yz0Var2.h.requestFocus();
                            g11.a(g11Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        yz0 yz0Var3 = this.f49321b;
                        ai.z zVar2 = yz0Var3.h;
                        zVar2.setText("");
                        yz0Var3.G.v(null, true, false);
                        v01 v01Var2 = yz0Var3.f52470n;
                        if (v01Var2 != null) {
                            v01Var2.I1(null);
                            yz0Var3.f52470n.J1(true, true);
                        }
                        zVar2.clearAnimation();
                        zVar2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.xq.h).start();
                        yz0Var3.c(false);
                        return;
                }
            }
        });
        imageView.setClickable(false);
        imageView.setImportantForAccessibility(2);
        frameLayout.addView(imageView, b8.mf.e(36, 36, 51));
        gi.q3 q3Var = new gi.q3(this, context, z10);
        this.d = q3Var;
        frameLayout.addView(q3Var, b8.mf.d(-1, -1.0f, 119, 36.0f, 0.0f, 0.0f, 0.0f));
        ai.z zVar = new ai.z(this, context, e6Var, 2);
        this.h = zVar;
        zVar.addTextChangedListener(new n0(this, 15));
        zVar.setBackground(null);
        zVar.setPadding(0, 0, org.telegram.messenger.g0.L(4.0f), 0);
        zVar.setTextSize(1, 16.0f);
        zVar.setHint(org.telegram.messenger.bd.M0(2131745846, null));
        org.telegram.ui.ActionBar.r6.E(zVar, i10, e6Var);
        org.telegram.ui.ActionBar.r6.V(zVar, org.telegram.ui.ActionBar.k6.G6, e6Var);
        zVar.setImeOptions(268435459);
        org.telegram.ui.ActionBar.r6.m(zVar, 30, org.telegram.ui.ActionBar.k6.Ai, e6Var);
        zVar.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        zVar.setGravity(19);
        zVar.setCursorWidth(1.5f);
        zVar.setMaxLines(1);
        zVar.setSingleLine(true);
        zVar.setLines(1);
        zVar.setTranslationY(org.telegram.messenger.g0.L(-1.0f));
        q3Var.addView(zVar, b8.mf.d(-1, -1.0f, 119, 0.0f, 0.0f, 32.0f, 0.0f));
        if (z10) {
            View view = new View(context);
            this.f52468e = view;
            Drawable g7 = k2.p1.g(context, 2131231227);
            org.telegram.ui.ActionBar.r6.y(this, g7, i3, e6Var, PorterDuff.Mode.MULTIPLY);
            view.setBackground(g7);
            view.setAlpha(0.0f);
            q3Var.addView(view, b8.mf.e(18, -1, 3));
        }
        setOnClickListener(new View.OnClickListener(this) {
            public final yz0 f49321b;

            {
                this.f49321b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        yz0 yz0Var = this.f49321b;
                        ai.z zVar2 = yz0Var.h;
                        if (yz0Var.f52469f.f35109k == 1) {
                            zVar2.setText("");
                            yz0Var.G.v(null, true, false);
                            v01 v01Var = yz0Var.f52470n;
                            if (v01Var != null) {
                                v01Var.I1(null);
                                yz0Var.f52470n.J1(true, true);
                                yz0Var.f52470n.G1();
                            }
                            zVar2.clearAnimation();
                            zVar2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.xq.h).start();
                            yz0Var.c(false);
                            return;
                        }
                        return;
                    case 1:
                        yz0 yz0Var2 = this.f49321b;
                        g11 g11Var2 = yz0Var2.G;
                        if (!g11Var2.u()) {
                            g11Var2.q();
                            yz0Var2.h.requestFocus();
                            g11.a(g11Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        yz0 yz0Var3 = this.f49321b;
                        ai.z zVar22 = yz0Var3.h;
                        zVar22.setText("");
                        yz0Var3.G.v(null, true, false);
                        v01 v01Var2 = yz0Var3.f52470n;
                        if (v01Var2 != null) {
                            v01Var2.I1(null);
                            yz0Var3.f52470n.J1(true, true);
                        }
                        zVar22.clearAnimation();
                        zVar22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.xq.h).start();
                        yz0Var3.c(false);
                        return;
                }
            }
        });
        ImageView imageView2 = new ImageView(context);
        this.f52467c = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new gi.b2(this));
        int i11 = org.telegram.ui.ActionBar.k6.f27972i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i11, e6Var), 1, org.telegram.messenger.g0.L(15.0f));
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i11);
        imageView2.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(imageView2, h02, null, N2, e6Var);
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final yz0 f49321b;

            {
                this.f49321b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        yz0 yz0Var = this.f49321b;
                        ai.z zVar2 = yz0Var.h;
                        if (yz0Var.f52469f.f35109k == 1) {
                            zVar2.setText("");
                            yz0Var.G.v(null, true, false);
                            v01 v01Var = yz0Var.f52470n;
                            if (v01Var != null) {
                                v01Var.I1(null);
                                yz0Var.f52470n.J1(true, true);
                                yz0Var.f52470n.G1();
                            }
                            zVar2.clearAnimation();
                            zVar2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.xq.h).start();
                            yz0Var.c(false);
                            return;
                        }
                        return;
                    case 1:
                        yz0 yz0Var2 = this.f49321b;
                        g11 g11Var2 = yz0Var2.G;
                        if (!g11Var2.u()) {
                            g11Var2.q();
                            yz0Var2.h.requestFocus();
                            g11.a(g11Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        yz0 yz0Var3 = this.f49321b;
                        ai.z zVar22 = yz0Var3.h;
                        zVar22.setText("");
                        yz0Var3.G.v(null, true, false);
                        v01 v01Var2 = yz0Var3.f52470n;
                        if (v01Var2 != null) {
                            v01Var2.I1(null);
                            yz0Var3.f52470n.J1(true, true);
                        }
                        zVar22.clearAnimation();
                        zVar22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.xq.h).start();
                        yz0Var3.c(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView2, b8.mf.e(36, 36, 53));
        if (!dh.d0.d) {
            b();
        }
    }

    public static void a(yz0 yz0Var, boolean z10) {
        if (z10) {
            if (yz0Var.f52473w == null) {
                pu0 pu0Var = new pu0(yz0Var, 15);
                yz0Var.f52473w = pu0Var;
                org.telegram.messenger.g0.i3(pu0Var, 340L);
                return;
            }
            return;
        }
        pu0 pu0Var2 = yz0Var.f52473w;
        if (pu0Var2 != null) {
            org.telegram.messenger.g0.r(pu0Var2);
            yz0Var.f52473w = null;
        }
        org.telegram.messenger.g0.V3(yz0Var.f52467c, false, true);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.E8));
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yz0.b():void");
    }

    public final void c(boolean z10) {
        float f10;
        if (z10 == this.f52474x) {
            return;
        }
        this.f52474x = z10;
        ValueAnimator valueAnimator = this.f52472s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = this.f52471r;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f52472s = ofFloat;
        ofFloat.addUpdateListener(new xy0(this, 5));
        this.f52472s.setDuration(120L);
        this.f52472s.setInterpolator(org.telegram.ui.Components.xq.h);
        this.f52472s.start();
    }

    public final void d(boolean z10) {
        ?? r62;
        v01 v01Var;
        v01 v01Var2;
        org.telegram.ui.Components.jl0 jl0Var = this.f52469f;
        int i3 = jl0Var.f35109k;
        ai.z zVar = this.h;
        int i10 = 2;
        if (i3 == 2 && ((zVar.length() != 0 || ((v01Var2 = this.f52470n) != null && v01Var2.getSelectedCategory() != null)) && !z10)) {
            return;
        }
        if (zVar.length() <= 0 && ((v01Var = this.f52470n) == null || v01Var.f40499w3 <= 0.5f || (!v01Var.f40494r3 && v01Var.getSelectedCategory() == null))) {
            r62 = 0;
        } else {
            r62 = 1;
        }
        jl0Var.b(r62);
        ImageView imageView = this.f52466b;
        imageView.setClickable(r62);
        String str = null;
        if (r62 != 0) {
            str = org.telegram.messenger.bd.M0(2131754878, null);
        }
        imageView.setContentDescription(str);
        if (r62 != 0) {
            i10 = 1;
        }
        imageView.setImportantForAccessibility(i10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float y9;
        g11 g11Var = this.H;
        yg0 yg0Var = g11Var.f45454h0;
        yz0 yz0Var = g11Var.f45452g0;
        h01 h01Var = g11Var.V;
        if (h01Var != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float x10 = yg0Var.getX() + yz0Var.getX();
            float y10 = yg0Var.getY() + yz0Var.getY();
            ai.n nVar = (ai.n) h01Var;
            dh.a0 a0Var = (dh.a0) nVar.f829b;
            dh.z zVar = a0Var.f8931a;
            RectF rectF = org.telegram.messenger.g0.P;
            float f10 = 0;
            rectF.set(f10, f10, measuredWidth, measuredHeight);
            org.telegram.ui.Components.ki0 delegate = ((org.telegram.ui.Components.li0) nVar.f830c).getDelegate();
            float x11 = zVar.getX() + x10;
            if (a0Var.f8952y == 1) {
                y9 = zVar.getY() - org.telegram.messenger.g0.f22602m;
            } else {
                y9 = zVar.getY() + a0Var.f8933c.getY();
            }
            delegate.E(canvas, rectF, 0.0f, x11, y9 + y10, 255, true);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void invalidate() {
        if (dh.d0.b(this)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(52.0f), 1073741824));
    }

    @Override
    public final void setTranslationY(float f10) {
        if (f10 != getTranslationY()) {
            super.setTranslationY(f10);
            if (this.H.V != null) {
                invalidate();
            }
        }
    }

    @Override
    public final void updateColors() {
        FrameLayout frameLayout;
        org.telegram.ui.ActionBar.e6 e6Var = this.G.f45436a1;
        try {
            org.telegram.ui.Components.jl0 jl0Var = this.f52469f;
            if (jl0Var != null) {
                jl0Var.a(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28280yf, e6Var));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (this.f52475y && (frameLayout = this.f52465a) != null) {
            int r12 = org.telegram.ui.ActionBar.k6.r1(0.06f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.E8, e6Var));
            if (this.E != null) {
                Drawable background = frameLayout.getBackground();
                ShapeDrawable shapeDrawable = this.E;
                if (background == shapeDrawable) {
                    if (r12 != this.F) {
                        org.telegram.ui.ActionBar.k6.C1(r12, shapeDrawable);
                        frameLayout.invalidate();
                    }
                    this.F = r12;
                }
            }
            ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(18.0f), r12);
            this.E = d02;
            frameLayout.setBackground(d02);
            this.F = r12;
        }
    }
}
