package org.telegram.ui.web;

import ai.r2;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import c8.cb;
import c8.ma;
import di.ic;
import di.ta;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bz;
import org.telegram.messenger.gd;
import org.telegram.messenger.j6;
import org.telegram.messenger.n10;
import org.telegram.messenger.x10;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.w4;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.v70;
import org.telegram.ui.Components.y60;
import org.telegram.ui.Wallet.c5;
import org.telegram.ui.Wallet.i9;
import org.telegram.ui.Wallet.m6;
import org.telegram.ui.c30;
import org.telegram.ui.dd0;
import org.telegram.ui.g4;
import org.telegram.ui.k3;
import org.telegram.ui.t3;
public abstract class j1 extends FrameLayout {
    public final g1 A0;
    public boolean B0;
    public int E;
    public final TextPaint F;
    public int G;
    public float H;
    public final r2 I;
    public final r2 J;
    public final ImageView K;
    public final org.telegram.ui.Cells.y L;
    public final ImageView M;
    public final org.telegram.ui.ActionBar.y1 N;
    public final org.telegram.ui.Cells.y O;
    public final ImageView P;
    public final m6 Q;
    public final org.telegram.ui.Cells.y R;
    public final ImageView S;
    public final org.telegram.ui.Cells.y T;
    public boolean U;
    public float V;
    public final di.q W;
    public final RectF f53127a;
    public boolean f53128a0;
    public final lg.f[] f53129b;
    public float f53130b0;
    public float f53131c;
    public final di.q f53132c0;
    public final float[] d;
    public int f53133d0;
    public final boolean[] f53134e;
    public final v70 f53135e0;
    public final Paint[] f53136f;
    public boolean f53137f0;
    public x10 f53138g0;
    public final Paint[] h;
    public int f53139h0;
    public int f53140i0;
    public int f53141j0;
    public int f53142k0;
    public ValueAnimator f53143l0;
    public int m0;
    public final Paint[] f53144n;
    public int f53145n0;
    public int f53146o0;
    public boolean f53147p0;
    public boolean f53148q0;
    public final Paint f53149r;
    public boolean f53150r0;
    public final Paint f53151s;
    public final h6.m f53152s0;
    public boolean f53153t0;
    public ValueAnimator f53154u0;
    public boolean f53155v0;
    public final Paint f53156w;
    public li.d f53157w0;
    public int f53158x;
    public ValueAnimator f53159x0;
    public int f53160y;
    public float f53161y0;
    public long f53162z0;

    public j1(Context context) {
        super(context);
        this.f53127a = new RectF();
        this.f53129b = new lg.f[2];
        this.f53131c = 0.0f;
        this.d = new float[2];
        this.f53134e = new boolean[3];
        this.f53136f = new Paint[2];
        this.h = new Paint[2];
        this.f53144n = new Paint[2];
        this.f53149r = new Paint(1);
        this.f53151s = new Paint(1);
        this.f53156w = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.F = textPaint;
        this.G = org.telegram.messenger.g0.L(56.0f);
        this.H = 1.0f;
        this.V = 0.0f;
        this.f53130b0 = 0.0f;
        this.f53139h0 = -1;
        this.f53152s0 = new h6.m(29);
        final org.telegram.ui.l0 l0Var = (org.telegram.ui.l0) this;
        this.A0 = new g1(l0Var, 0);
        this.B0 = false;
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.L(18.33f));
        for (int i7 = 0; i7 < 2; i7++) {
            this.f53136f[i7] = new Paint(1);
            this.h[i7] = new Paint(1);
            this.f53144n[i7] = new Paint(1);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, ma.e(-1, 56, 87));
        FrameLayout frameLayout2 = new FrameLayout(context);
        addView(frameLayout2, ma.e(-1, 56, 87));
        r2 r2Var = new r2(context, 9);
        this.I = r2Var;
        r2Var.setOrientation(0);
        addView(r2Var, ma.e(-2, 56, 83));
        ImageView imageView = new ImageView(context);
        this.M = imageView;
        imageView.setContentDescription(gd.M0(2131754878, null));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        org.telegram.ui.ActionBar.y1 y1Var = new org.telegram.ui.ActionBar.y1(false);
        this.N = y1Var;
        y1Var.f30269k = 200.0f;
        y1Var.c(false, 1.0f);
        imageView.setImageDrawable(y1Var);
        org.telegram.ui.Cells.y h02 = n6.h0(1090519039, 1, -1);
        this.O = h02;
        imageView.setBackground(h02);
        r2Var.addView(imageView, ma.o(54, 56));
        r2 r2Var2 = new r2(context, 10);
        this.J = r2Var2;
        r2Var2.setOrientation(0);
        addView(r2Var2, ma.e(-2, 56, 85));
        ImageView imageView2 = new ImageView(context);
        this.P = imageView2;
        imageView2.setScaleType(scaleType);
        m6 m6Var = new m6(l0Var);
        this.Q = m6Var;
        imageView2.setImageDrawable(m6Var);
        m6Var.c();
        org.telegram.ui.Cells.y h03 = n6.h0(1090519039, 1, -1);
        this.R = h03;
        imageView2.setBackground(h03);
        r2Var2.addView(imageView2, ma.o(54, 56));
        ImageView imageView3 = new ImageView(context);
        this.S = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(2131231244);
        imageView3.setColorFilter(new PorterDuffColorFilter(0, PorterDuff.Mode.SRC_IN));
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                float f10;
                View childAt;
                int i10;
                int i11 = r2;
                org.telegram.ui.l0 l0Var2 = l0Var;
                switch (i11) {
                    case 0:
                        int i12 = 1;
                        if (l0Var2.getParent() instanceof ViewGroup) {
                            ta taVar = new ta(l0Var2, 3);
                            y60 G = y60.G((ViewGroup) l0Var2.getParent(), null, l0Var2.S);
                            G.f42375s = 0;
                            G.T(l0Var2.f53145n0, l0Var2.f53146o0);
                            G.b0(0.0f, -org.telegram.messenger.g0.L(52.0f));
                            G.V = 200;
                            int w10 = n6.w(l0Var2.m0, n6.r1(0.1f, l0Var2.f53145n0));
                            G.f42368o0 = Integer.valueOf(w10);
                            int i13 = 0;
                            while (i13 < G.A.getChildCount()) {
                                if (i13 == G.A.getChildCount() - i12) {
                                    childAt = G.D;
                                } else {
                                    childAt = G.A.getChildAt(i13);
                                }
                                if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                                    int i14 = 0;
                                    while (i14 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount()) {
                                        View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i14);
                                        int i15 = i12;
                                        if (childAt2 instanceof org.telegram.ui.ActionBar.z0) {
                                            ((org.telegram.ui.ActionBar.z0) childAt2).setSelectorColor(w10);
                                        }
                                        i14++;
                                        i12 = i15;
                                    }
                                    i10 = i12;
                                } else {
                                    i10 = i12;
                                    if (childAt instanceof org.telegram.ui.ActionBar.z0) {
                                        ((org.telegram.ui.ActionBar.z0) childAt).setSelectorColor(w10);
                                    }
                                }
                                i13++;
                                i12 = i10;
                            }
                            int i16 = i12;
                            if (org.telegram.messenger.g0.B(l0Var2.m0) > 0.721f) {
                                G.Q(-1);
                                G.U(-986896);
                            } else {
                                G.Q(-14737633);
                                G.U(-15592942);
                            }
                            int i17 = l0Var2.f53139h0;
                            if (i17 == 0) {
                                G.c(2131232267, gd.M0(2131747603, null), (Runnable) taVar.a(3), false);
                                G.c(2131232356, gd.M0(2131745641, null), (Runnable) taVar.a(1), false);
                                G.l(2131232365, gd.M0(2131745264, null), (Runnable) taVar.a(2), !l0Var2.f53150r0);
                                G.c(2131232363, gd.M0(2131745300, null), (Runnable) taVar.a(4), false);
                            } else {
                                int i18 = i16;
                                if (i17 == i18) {
                                    if (!l0Var2.f53148q0) {
                                        G.c(2131232267, gd.M0(2131747603, null), (Runnable) taVar.a(3), false);
                                        G.k();
                                    }
                                    if (l0Var2.f53147p0) {
                                        G.c(2131232060, gd.M0(2131742663, null), (Runnable) taVar.a(9), false);
                                    }
                                    t1 instantViewLoader = l0Var2.getInstantViewLoader();
                                    if (instantViewLoader != null && (((!instantViewLoader.f53275g || !instantViewLoader.f53276i) && instantViewLoader.h == null && instantViewLoader.f53277j == null && !instantViewLoader.f53272c) || instantViewLoader.b() != null)) {
                                        G.c(2131231835, gd.M0(2131747595, null), (Runnable) taVar.a(10), false);
                                        org.telegram.ui.ActionBar.z0 z10 = G.z();
                                        boolean z11 = i18;
                                        if (instantViewLoader.b() == null) {
                                            z11 = 0;
                                        }
                                        z10.setEnabled(z11);
                                        if (z10.isEnabled()) {
                                            f10 = 1.0f;
                                        } else {
                                            f10 = 0.5f;
                                        }
                                        z10.setAlpha(f10);
                                        c5 c5Var = new c5(21, z10, instantViewLoader);
                                        instantViewLoader.f53280m.add(c5Var);
                                        G.f42369p = new c5(25, instantViewLoader, c5Var);
                                    }
                                    G.c(2131232343, gd.M0(2131746145, null), (Runnable) taVar.a(5), false);
                                    G.c(2131232356, gd.M0(2131745641, null), (Runnable) taVar.a(1), false);
                                    G.c(2131232353, gd.M0(2131742684, null), (Runnable) taVar.a(6), false);
                                    G.c(2131232365, gd.M0(2131745264, null), (Runnable) taVar.a(2), false);
                                    G.k();
                                    if (!cb.a(null).isEmpty()) {
                                        G.c(2131231920, gd.M0(2131742662, null), (Runnable) taVar.a(8), false);
                                    }
                                    G.c(2131231770, gd.M0(2131742681, null), (Runnable) taVar.a(7), false);
                                    G.c(2131232363, gd.M0(2131745300, null), (Runnable) taVar.a(4), false);
                                }
                            }
                            G.f42369p = new dd0(l0Var2);
                            G.a0();
                            return;
                        }
                        return;
                    default:
                        l0Var2.W.setText("");
                        return;
                }
            }
        });
        org.telegram.ui.Cells.y h04 = n6.h0(1090519039, 1, -1);
        this.T = h04;
        imageView3.setBackground(h04);
        imageView3.setContentDescription(gd.M0(2131754839, "AccDescrMoreOptions"));
        r2Var2.addView(imageView3, ma.o(54, 56));
        di.q qVar = new di.q(context, 5);
        this.W = qVar;
        qVar.setVisibility(8);
        qVar.setAlpha(0.0f);
        qVar.setTextSize(1, 18.0f);
        qVar.setSingleLine(true);
        qVar.setHint(gd.M0(2131745641, null));
        qVar.setBackgroundResource(0);
        qVar.setCursorWidth(1.5f);
        qVar.setGravity(112);
        qVar.setClipToPadding(true);
        qVar.setPadding(org.telegram.messenger.g0.L(58.0f), 0, org.telegram.messenger.g0.L(112.0f), 0);
        qVar.setTranslationY(-org.telegram.messenger.g0.L(0.66f));
        qVar.setInputType(qVar.getInputType() | 524288);
        qVar.setImeOptions(33554435);
        qVar.setTextIsSelectable(false);
        qVar.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (keyEvent != null) {
                            if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                                org.telegram.messenger.g0.v1(l0Var.W);
                                return false;
                            }
                            return false;
                        }
                        return false;
                    default:
                        if (i10 == 2) {
                            org.telegram.ui.l0 l0Var2 = l0Var;
                            li.d dVar = l0Var2.f53157w0;
                            if (dVar != null) {
                                dVar.a(l0Var2.f53132c0.getText().toString());
                            }
                            l0Var2.k(false);
                        }
                        return false;
                }
            }
        });
        qVar.addTextChangedListener(new i9(l0Var, 4));
        frameLayout.addView(qVar, ma.e(-1, -1, 119));
        di.q qVar2 = new di.q(context, 6);
        this.f53132c0 = qVar2;
        qVar2.setVisibility(8);
        qVar2.setAlpha(0.0f);
        qVar2.setTextSize(1, 15.66f);
        qVar2.setSingleLine(true);
        this.f53133d0 = bz.f23186p0;
        qVar2.setHint(gd.a0(null, null, 2131754349, e1.a().f53079a));
        qVar2.setBackgroundResource(0);
        qVar2.setCursorWidth(1.5f);
        qVar2.setGravity(112);
        qVar2.setInputType(qVar2.getInputType() | 524288);
        qVar2.setImeOptions(33554434);
        qVar2.setTextIsSelectable(false);
        qVar2.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (keyEvent != null) {
                            if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                                org.telegram.messenger.g0.v1(l0Var.W);
                                return false;
                            }
                            return false;
                        }
                        return false;
                    default:
                        if (i10 == 2) {
                            org.telegram.ui.l0 l0Var2 = l0Var;
                            li.d dVar = l0Var2.f53157w0;
                            if (dVar != null) {
                                dVar.a(l0Var2.f53132c0.getText().toString());
                            }
                            l0Var2.k(false);
                        }
                        return false;
                }
            }
        });
        frameLayout2.addView(qVar2, ma.d(-1, -1.0f, 119, 48.0f, 0.0f, 12.0f, 0.0f));
        ImageView imageView4 = new ImageView(context);
        this.K = imageView4;
        imageView4.setScaleType(scaleType);
        imageView4.setImageResource(2131231269);
        org.telegram.ui.Cells.y h05 = n6.h0(1090519039, 1, -1);
        this.L = h05;
        imageView4.setBackground(h05);
        imageView4.setVisibility(8);
        imageView4.setAlpha(0.0f);
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                float f10;
                View childAt;
                int i10;
                int i11 = r2;
                org.telegram.ui.l0 l0Var2 = l0Var;
                switch (i11) {
                    case 0:
                        int i12 = 1;
                        if (l0Var2.getParent() instanceof ViewGroup) {
                            ta taVar = new ta(l0Var2, 3);
                            y60 G = y60.G((ViewGroup) l0Var2.getParent(), null, l0Var2.S);
                            G.f42375s = 0;
                            G.T(l0Var2.f53145n0, l0Var2.f53146o0);
                            G.b0(0.0f, -org.telegram.messenger.g0.L(52.0f));
                            G.V = 200;
                            int w10 = n6.w(l0Var2.m0, n6.r1(0.1f, l0Var2.f53145n0));
                            G.f42368o0 = Integer.valueOf(w10);
                            int i13 = 0;
                            while (i13 < G.A.getChildCount()) {
                                if (i13 == G.A.getChildCount() - i12) {
                                    childAt = G.D;
                                } else {
                                    childAt = G.A.getChildAt(i13);
                                }
                                if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                                    int i14 = 0;
                                    while (i14 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount()) {
                                        View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i14);
                                        int i15 = i12;
                                        if (childAt2 instanceof org.telegram.ui.ActionBar.z0) {
                                            ((org.telegram.ui.ActionBar.z0) childAt2).setSelectorColor(w10);
                                        }
                                        i14++;
                                        i12 = i15;
                                    }
                                    i10 = i12;
                                } else {
                                    i10 = i12;
                                    if (childAt instanceof org.telegram.ui.ActionBar.z0) {
                                        ((org.telegram.ui.ActionBar.z0) childAt).setSelectorColor(w10);
                                    }
                                }
                                i13++;
                                i12 = i10;
                            }
                            int i16 = i12;
                            if (org.telegram.messenger.g0.B(l0Var2.m0) > 0.721f) {
                                G.Q(-1);
                                G.U(-986896);
                            } else {
                                G.Q(-14737633);
                                G.U(-15592942);
                            }
                            int i17 = l0Var2.f53139h0;
                            if (i17 == 0) {
                                G.c(2131232267, gd.M0(2131747603, null), (Runnable) taVar.a(3), false);
                                G.c(2131232356, gd.M0(2131745641, null), (Runnable) taVar.a(1), false);
                                G.l(2131232365, gd.M0(2131745264, null), (Runnable) taVar.a(2), !l0Var2.f53150r0);
                                G.c(2131232363, gd.M0(2131745300, null), (Runnable) taVar.a(4), false);
                            } else {
                                int i18 = i16;
                                if (i17 == i18) {
                                    if (!l0Var2.f53148q0) {
                                        G.c(2131232267, gd.M0(2131747603, null), (Runnable) taVar.a(3), false);
                                        G.k();
                                    }
                                    if (l0Var2.f53147p0) {
                                        G.c(2131232060, gd.M0(2131742663, null), (Runnable) taVar.a(9), false);
                                    }
                                    t1 instantViewLoader = l0Var2.getInstantViewLoader();
                                    if (instantViewLoader != null && (((!instantViewLoader.f53275g || !instantViewLoader.f53276i) && instantViewLoader.h == null && instantViewLoader.f53277j == null && !instantViewLoader.f53272c) || instantViewLoader.b() != null)) {
                                        G.c(2131231835, gd.M0(2131747595, null), (Runnable) taVar.a(10), false);
                                        org.telegram.ui.ActionBar.z0 z10 = G.z();
                                        boolean z11 = i18;
                                        if (instantViewLoader.b() == null) {
                                            z11 = 0;
                                        }
                                        z10.setEnabled(z11);
                                        if (z10.isEnabled()) {
                                            f10 = 1.0f;
                                        } else {
                                            f10 = 0.5f;
                                        }
                                        z10.setAlpha(f10);
                                        c5 c5Var = new c5(21, z10, instantViewLoader);
                                        instantViewLoader.f53280m.add(c5Var);
                                        G.f42369p = new c5(25, instantViewLoader, c5Var);
                                    }
                                    G.c(2131232343, gd.M0(2131746145, null), (Runnable) taVar.a(5), false);
                                    G.c(2131232356, gd.M0(2131745641, null), (Runnable) taVar.a(1), false);
                                    G.c(2131232353, gd.M0(2131742684, null), (Runnable) taVar.a(6), false);
                                    G.c(2131232365, gd.M0(2131745264, null), (Runnable) taVar.a(2), false);
                                    G.k();
                                    if (!cb.a(null).isEmpty()) {
                                        G.c(2131231920, gd.M0(2131742662, null), (Runnable) taVar.a(8), false);
                                    }
                                    G.c(2131231770, gd.M0(2131742681, null), (Runnable) taVar.a(7), false);
                                    G.c(2131232363, gd.M0(2131745300, null), (Runnable) taVar.a(4), false);
                                }
                            }
                            G.f42369p = new dd0(l0Var2);
                            G.a0();
                            return;
                        }
                        return;
                    default:
                        l0Var2.W.setText("");
                        return;
                }
            }
        });
        addView(imageView4, ma.e(54, 56, 85));
        v70 v70Var = new v70(context);
        this.f53135e0 = v70Var;
        v70Var.setPivotX(0.0f);
        v70Var.setPivotY(org.telegram.messenger.g0.L(2.0f));
        addView(v70Var, ma.e(-1, 2, 87));
        setWillNotDraw(false);
        this.f53129b[0] = new lg.f(l0Var);
        this.f53129b[1] = new lg.f(l0Var);
        int i10 = n6.Gl;
        d(n6.v0(i10), false);
        setMenuColors(n6.v0(i10));
    }

    public final void a(Canvas canvas, float f10, float f11, boolean z10) {
        float f12;
        float max = Math.max(org.telegram.messenger.g0.L(0.66f), 1);
        float f13 = f10 - max;
        float width = getWidth() * this.f53131c;
        RectF rectF = this.f53127a;
        rectF.set(0.0f, 0.0f, getWidth(), f10);
        Paint[] paintArr = this.f53136f;
        int alpha = paintArr[1].getAlpha();
        paintArr[1].setAlpha((int) (alpha * 1.0f));
        canvas.drawRect(rectF, paintArr[1]);
        paintArr[1].setAlpha(alpha);
        int i7 = (this.f53131c > 0.0f ? 1 : (this.f53131c == 0.0f ? 0 : -1));
        float[] fArr = this.d;
        Paint[] paintArr2 = this.f53144n;
        Paint[] paintArr3 = this.h;
        if (i7 > 0) {
            rectF.set(0.0f, 0.0f, fArr[1] * getWidth(), f10);
            int alpha2 = paintArr3[1].getAlpha();
            f12 = 1.0f;
            paintArr3[1].setAlpha((int) ((1.0f - this.f53130b0) * (1.0f - this.V) * alpha2 * 1.0f));
            canvas.drawRect(rectF, paintArr3[1]);
            paintArr3[1].setAlpha(alpha2);
            if (z10) {
                rectF.set(0.0f, f13, width, f13 + max);
                int alpha3 = paintArr2[1].getAlpha();
                paintArr2[1].setAlpha((int) ((1.0f - this.f53130b0) * alpha3 * 1.0f * f11));
                canvas.drawRect(rectF, paintArr2[1]);
                paintArr2[1].setAlpha(alpha3);
            }
        } else {
            f12 = 1.0f;
        }
        float f14 = this.f53131c;
        if (f14 < f12) {
            int r12 = n6.r1((f12 - f14) * f12, 1610612736);
            Paint paint = this.f53149r;
            paint.setColor(r12);
            rectF.set(0.0f, 0.0f, width, f10);
            canvas.drawRect(rectF, paint);
            rectF.set(width, 0.0f, getWidth(), f10);
            int alpha4 = paintArr[0].getAlpha();
            paintArr[0].setAlpha((int) (alpha4 * f12));
            canvas.drawRect(rectF, paintArr[0]);
            paintArr[0].setAlpha(alpha4);
        }
        rectF.set(width, 0.0f, (fArr[0] * getWidth()) + width, f10);
        int alpha5 = paintArr3[0].getAlpha();
        paintArr3[0].setAlpha((int) ((f12 - this.f53130b0) * (f12 - this.V) * (f12 - Utilities.l(this.f53131c * 4.0f)) * alpha5 * f12));
        canvas.drawRect(rectF, paintArr3[0]);
        paintArr3[0].setAlpha(alpha5);
        if (z10) {
            rectF.set(width, f13, getWidth() + width, max + f13);
            int alpha6 = paintArr2[0].getAlpha();
            paintArr2[0].setAlpha((int) ((f12 - this.f53130b0) * alpha6 * f12 * f11));
            canvas.drawRect(rectF, paintArr2[0]);
            paintArr2[0].setAlpha(alpha6);
        }
    }

    public final void b(int i7, int i10) {
        float f10;
        boolean[] zArr = this.f53134e;
        boolean z10 = zArr[i7];
        Paint[] paintArr = this.f53136f;
        if (z10 && paintArr[i7].getColor() == i10) {
            return;
        }
        zArr[i7] = true;
        paintArr[i7].setColor(i10);
        if (org.telegram.messenger.g0.B(i10) <= 0.721f) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        int f11 = i0.a.f(f10, -16777216, -1);
        this.h[i7].setColor(n6.w(i10, n6.r1(org.telegram.messenger.g0.T1(0.07f, 0.2f, f10), f11)));
        this.f53144n[i7].setColor(n6.w(i10, n6.r1(org.telegram.messenger.g0.T1(0.14f, 0.24f, f10), f11)));
        lg.f[] fVarArr = this.f53129b;
        ((org.telegram.ui.Components.m6) fVarArr[i7].d).u(f11);
        fVarArr[i7].f19763a = n6.w(i10, n6.r1(0.6f, f11));
        lg.f fVar = fVarArr[i7];
        ((org.telegram.ui.Components.m6) fVar.f19766e).u(i0.a.f(((c6) fVarArr[i7].f19767f).f33892c, fVar.f19763a, n6.x0(null, n6.f29635q7, false)));
        invalidate();
    }

    public final void c(final int i7, float f10, boolean z10) {
        final float f11;
        boolean[] zArr = this.f53134e;
        if (zArr[2] && this.f53141j0 == i7) {
            return;
        }
        final float f12 = 1.0f;
        if (!z10) {
            zArr[2] = true;
            if (f10 < 0.0f) {
                if (org.telegram.messenger.g0.B(i7) <= 0.721f) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
            }
            int f13 = i0.a.f(f10, -16777216, -1);
            this.f53158x = f13;
            n6.r1(0.55f, f13);
            this.f53141j0 = i7;
            this.f53160y = i0.a.f(f10, -1, -16777216);
            int f14 = i0.a.f(1.0f - f10, -1, -16777216);
            this.E = f14;
            int i10 = this.f53160y;
            g4 g4Var = ((org.telegram.ui.l0) this).C0;
            k kVar = g4Var.f47888j0;
            if (kVar != null) {
                kVar.c(i10, f14);
            }
            this.f53151s.setColor(this.f53160y);
            this.f53156w.setColor(n6.w(this.f53160y, n6.r1(org.telegram.messenger.g0.T1(0.07f, 0.2f, f10), this.f53158x)));
            int r12 = n6.r1(0.6f, this.E);
            di.q qVar = this.f53132c0;
            qVar.setHintTextColor(r12);
            qVar.setTextColor(this.E);
            qVar.setCursorColor(this.E);
            qVar.setHandlesColor(this.E);
            this.f53135e0.setProgressColor(n6.v0(n6.Il));
            int f15 = i0.a.f(this.f53130b0, this.f53158x, this.E);
            org.telegram.ui.ActionBar.y1 y1Var = this.N;
            y1Var.a(f15);
            y1Var.b(i0.a.f(this.f53130b0, this.f53158x, this.E));
            int i11 = this.f53158x;
            m6 m6Var = this.Q;
            m6Var.f44566c.setColor(i11);
            m6Var.invalidateSelf();
            int i12 = this.f53158x;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            this.S.setColorFilter(new PorterDuffColorFilter(i12, mode));
            this.P.setColorFilter(new PorterDuffColorFilter(this.f53158x, mode));
            this.K.setColorFilter(new PorterDuffColorFilter(this.f53158x, mode));
            int w10 = n6.w(i7, n6.r1(0.22f, this.f53158x));
            this.f53142k0 = w10;
            n6.H1(this.O, w10, true);
            n6.H1(this.R, this.f53142k0, true);
            n6.H1(this.T, this.f53142k0, true);
            n6.H1(this.L, this.f53142k0, true);
            int r13 = n6.r1(0.6f, this.f53158x);
            di.q qVar2 = this.W;
            qVar2.setHintTextColor(r13);
            qVar2.setTextColor(this.f53158x);
            qVar2.setCursorColor(this.f53158x);
            qVar2.setHandlesColor(this.f53158x);
            t3 t3Var = g4Var.L;
            if (t3Var != null) {
                t3Var.u();
            }
            invalidate();
            return;
        }
        ValueAnimator valueAnimator = this.f53143l0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i13 = this.f53141j0;
        this.f53140i0 = i13;
        if (org.telegram.messenger.g0.B(i13) <= 0.721f) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        if (org.telegram.messenger.g0.B(i7) > 0.721f) {
            f12 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f53143l0 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                j1 j1Var = j1.this;
                j1Var.getClass();
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                j1Var.c(i0.a.f(floatValue, j1Var.f53140i0, i7), org.telegram.messenger.g0.T1(f11, f12, floatValue), false);
            }
        });
        this.f53143l0.addListener(new ic(this, i7, f12, 2));
        this.f53143l0.start();
    }

    public final void d(int i7, boolean z10) {
        c(i7, -1.0f, z10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i7;
        int i10;
        int i11;
        int i12 = 0;
        if (this.f53137f0) {
            i7 = org.telegram.messenger.g0.f24112m;
        } else {
            i7 = 0;
        }
        a(canvas, i7 + this.G, 1.0f, this.f53153t0);
        float right = this.I.getRight();
        float left = this.J.getLeft();
        boolean z10 = this.f53137f0;
        if (z10) {
            i10 = org.telegram.messenger.g0.f24112m;
        } else {
            i10 = 0;
        }
        float f10 = i10;
        if (z10) {
            i11 = org.telegram.messenger.g0.f24112m;
        } else {
            i11 = 0;
        }
        float f11 = i11 + this.G;
        int i13 = (this.f53131c > 1.0f ? 1 : (this.f53131c == 1.0f ? 0 : -1));
        lg.f[] fVarArr = this.f53129b;
        if (i13 < 0) {
            canvas.save();
            float width = (getWidth() * this.f53131c) - (Utilities.l(this.f53131c * 2.0f) * org.telegram.messenger.g0.L(30.0f));
            canvas.translate(right + width, f10);
            fVarArr[0].c(canvas, (left - right) - width, f11 - f10, (1.0f - this.V) * (1.0f - this.f53131c));
            canvas.restore();
        }
        if (this.f53131c > 0.0f) {
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, getWidth() * this.f53131c, getHeight());
            canvas.translate(right, f10);
            canvas.translate((1.0f - this.f53131c) * org.telegram.messenger.g0.L(-12.0f), 0.0f);
            float T1 = org.telegram.messenger.g0.T1(1.0f, 0.5f, 1.0f - this.f53131c);
            float f12 = f11 - f10;
            canvas.scale(T1, T1, 0.0f, f12 / 2.0f);
            fVarArr[1].c(canvas, left - right, f12, (1.0f - this.f53130b0) * (1.0f - this.V) * this.f53131c);
            canvas.restore();
        }
        int i14 = (this.f53130b0 > 0.0f ? 1 : (this.f53130b0 == 0.0f ? 0 : -1));
        RectF rectF = this.f53127a;
        if (i14 > 0) {
            Paint paint = this.f53151s;
            int alpha = paint.getAlpha();
            paint.setAlpha((int) (alpha * this.f53130b0));
            float width2 = getWidth();
            if (this.f53137f0) {
                i12 = org.telegram.messenger.g0.f24112m;
            }
            canvas.drawRect(0.0f, 0.0f, width2, i12 + this.G, paint);
            paint.setAlpha(alpha);
            float f13 = (f10 + f11) / 2.0f;
            float L = org.telegram.messenger.g0.L(42.0f) / 2.0f;
            rectF.set(org.telegram.messenger.g0.L(6.0f), f13 - L, org.telegram.messenger.g0.T1(left, getWidth() - org.telegram.messenger.g0.L(6.0f), this.f53130b0), f13 + L);
            Paint paint2 = this.f53156w;
            int alpha2 = paint2.getAlpha();
            paint2.setAlpha((int) (alpha2 * this.f53130b0));
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f), paint2);
            paint2.setAlpha(alpha2);
        }
        rectF.set(0.0f, f10, getWidth(), f11);
        canvas.save();
        canvas.clipRect(rectF);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        s0 webView;
        int action = motionEvent.getAction();
        g1 g1Var = this.A0;
        if (action == 0) {
            this.B0 = false;
            org.telegram.messenger.g0.r(g1Var);
            if (motionEvent.getX() > this.I.getRight() && motionEvent.getX() < this.J.getLeft() && !this.U && !this.f53128a0) {
                this.f53161y0 = motionEvent.getX();
                motionEvent.getY();
                this.f53162z0 = System.currentTimeMillis();
                org.telegram.messenger.g0.h3(g1Var, ViewConfiguration.getLongPressTimeout() * 0.8f);
            }
        } else if (motionEvent.getAction() == 2 && ((float) (System.currentTimeMillis() - this.f53162z0)) > ViewConfiguration.getLongPressTimeout() * 0.8f) {
            org.telegram.messenger.g0.r(g1Var);
            this.B0 = true;
            k3 k3Var = ((org.telegram.ui.l0) this).C0.f47899v0[0];
            float l10 = Utilities.l(k3Var.getProgress() + ((motionEvent.getX() - this.f53161y0) / (getWidth() * 0.8f)));
            if (!k3Var.c() && k3Var.f() && (webView = k3Var.f49138f.getWebView()) != null) {
                webView.setScrollProgress(l10);
                k3Var.M.d0();
            }
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            org.telegram.messenger.g0.r(g1Var);
            this.f53162z0 = 0L;
        }
        this.f53161y0 = motionEvent.getX();
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e(int i7, boolean z10) {
        float f10;
        lg.f fVar = this.f53129b[i7];
        if (fVar.f19765c != z10) {
            fVar.f19765c = z10;
            c6 c6Var = (c6) fVar.f19767f;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            c6Var.e(true, f10);
            invalidate();
        }
    }

    public final void f(int i7, String str) {
        lg.f[] fVarArr = this.f53129b;
        CharSequence charSequence = ((org.telegram.ui.Components.m6) fVarArr[i7].f19766e).f37384i;
        if (charSequence != null && TextUtils.equals(charSequence.toString(), str)) {
            return;
        }
        ((org.telegram.ui.Components.m6) fVarArr[i7].f19766e).t(j6.m(str, ((org.telegram.ui.Components.m6) fVarArr[i7].f19766e).f37375a.getFontMetricsInt(), false, null, 0), false, true);
    }

    public final void g(int i7, String str, boolean z10) {
        lg.f[] fVarArr = this.f53129b;
        CharSequence charSequence = ((org.telegram.ui.Components.m6) fVarArr[i7].d).f37384i;
        if (charSequence != null && TextUtils.equals(charSequence.toString(), str)) {
            return;
        }
        ((org.telegram.ui.Components.m6) fVarArr[i7].d).t(j6.m(str, ((org.telegram.ui.Components.m6) fVarArr[i7].d).f37375a.getFontMetricsInt(), false, null, 0), z10, true);
    }

    public int getBackgroundColor() {
        return this.f53141j0;
    }

    public t1 getInstantViewLoader() {
        return null;
    }

    public int getTextColor() {
        return this.f53158x;
    }

    public String getTitle() {
        CharSequence charSequence = ((org.telegram.ui.Components.m6) this.f53129b[0].d).f37384i;
        if (charSequence == null) {
            return "";
        }
        return charSequence.toString();
    }

    public final void h(boolean z10) {
        float f10;
        if (this.U == z10) {
            return;
        }
        ValueAnimator valueAnimator = this.f53154u0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.U = z10;
        di.q qVar = this.W;
        boolean z11 = false;
        qVar.setVisibility(0);
        float f11 = 0.0f;
        if (!this.f53155v0 && !z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.N.c(true, f10);
        float f12 = this.V;
        if (z10) {
            f11 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f11);
        this.f53154u0 = ofFloat;
        ofFloat.addUpdateListener(new hi.k3(this, 23));
        this.f53154u0.addListener(new c30(13, this, z10));
        this.f53154u0.setInterpolator(lr.h);
        this.f53154u0.setDuration(320L);
        this.f53154u0.start();
        boolean z12 = !z10;
        org.telegram.messenger.g0.T3(this.P, z12, true);
        org.telegram.messenger.g0.T3(this.S, z12, true);
        if (qVar.length() > 0 && this.U) {
            z11 = true;
        }
        org.telegram.messenger.g0.T3(this.K, z11, true);
    }

    public final void i() {
        lg.f[] fVarArr = this.f53129b;
        lg.f fVar = fVarArr[0];
        fVarArr[0] = fVarArr[1];
        fVarArr[1] = fVar;
        float[] fArr = this.d;
        float f10 = fArr[0];
        fArr[0] = fArr[1];
        fArr[1] = f10;
        Paint[] paintArr = this.f53136f;
        int color = paintArr[0].getColor();
        b(0, paintArr[1].getColor());
        b(1, color);
        invalidate();
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
    }

    @Override
    public void onMeasure(int i7, int i10) {
        int i11;
        if (this.f53137f0) {
            i11 = org.telegram.messenger.g0.f24112m;
        } else {
            i11 = 0;
        }
        super.onMeasure(i7, n10.C(56.0f, i11, 1073741824));
    }

    public void setBackButton(boolean z10) {
        float f10;
        this.f53155v0 = z10;
        if (!this.U && !this.f53128a0) {
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            this.N.c(true, f10);
        }
    }

    public void setBackButtonCached(boolean z10) {
        this.f53155v0 = z10;
    }

    public void setHasForward(boolean z10) {
        this.f53147p0 = z10;
    }

    public void setHeight(int i7) {
        if (this.G != i7) {
            this.G = i7;
            float pow = (float) Math.pow(i7 / org.telegram.messenger.g0.L(56.0f), 0.5d);
            this.H = pow;
            r2 r2Var = this.I;
            r2Var.setScaleX(pow);
            r2Var.setScaleY(this.H);
            r2Var.setTranslationX((1.0f - this.H) * org.telegram.messenger.g0.L(42.0f));
            r2Var.setTranslationY((1.0f - this.H) * org.telegram.messenger.g0.L(-12.0f));
            float f10 = this.H;
            r2 r2Var2 = this.J;
            r2Var2.setScaleX(f10);
            r2Var2.setScaleY(this.H);
            r2Var2.setTranslationX((1.0f - this.H) * (-org.telegram.messenger.g0.L(42.0f)));
            r2Var2.setTranslationY((1.0f - this.H) * org.telegram.messenger.g0.L(-12.0f));
            this.f53135e0.setTranslationY(this.G - org.telegram.messenger.g0.L(56.0f));
            invalidate();
        }
    }

    public void setIsLocal(boolean z10) {
        this.f53150r0 = z10;
    }

    public void setIsTonsite(boolean z10) {
        this.f53148q0 = z10;
    }

    public void setMenuColors(int i7) {
        int i10;
        boolean z10 = false;
        if (w4.f(w4.e(i7))[0] < 0.5d) {
            z10 = true;
        }
        int i11 = -1;
        if (z10) {
            i10 = -16777216;
        } else {
            i10 = -1;
        }
        this.m0 = i10;
        if (!z10) {
            i11 = -16777216;
        }
        this.f53145n0 = i11;
        this.f53146o0 = n6.r1(0.6f, i11);
    }

    public void setMenuListener(x10 x10Var) {
        this.f53138g0 = x10Var;
    }

    public void setMenuType(int i7) {
        if (this.f53139h0 != i7) {
            this.f53139h0 = i7;
        }
    }

    public void setProgress(float f10) {
        this.d[0] = f10;
        invalidate();
    }

    public void setTransitionProgress(float f10) {
        this.f53131c = f10;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return true;
    }

    public void setIsLoaded(boolean z10) {
    }
}
