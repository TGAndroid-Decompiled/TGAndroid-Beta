package org.telegram.ui.web;

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
import b8.mf;
import b8.xf;
import ci.ab;
import ci.pc;
import gi.j3;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.messenger.i6;
import org.telegram.messenger.u10;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.u4;
import org.telegram.ui.Components.d70;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Wallet.ma;
import org.telegram.ui.Wallet.v5;
import org.telegram.ui.hb1;
import org.telegram.ui.hc1;
import org.telegram.ui.i4;
import org.telegram.ui.l3;
import org.telegram.ui.u3;
import org.telegram.ui.u40;
public abstract class i1 extends FrameLayout {
    public final f1 A0;
    public boolean B0;
    public int E;
    public final TextPaint F;
    public int G;
    public float H;
    public final ci.q I;
    public final ci.q J;
    public final ImageView K;
    public final org.telegram.ui.Cells.y L;
    public final ImageView M;
    public final org.telegram.ui.ActionBar.w1 N;
    public final org.telegram.ui.Cells.y O;
    public final ImageView P;
    public final v5 Q;
    public final org.telegram.ui.Cells.y R;
    public final ImageView S;
    public final org.telegram.ui.Cells.y T;
    public boolean U;
    public float V;
    public final ci.s W;
    public final RectF f50870a;
    public boolean f50871a0;
    public final mg.f[] f50872b;
    public float f50873b0;
    public float f50874c;
    public final ci.s f50875c0;
    public final float[] d;
    public int f50876d0;
    public final boolean[] f50877e;
    public final d70 f50878e0;
    public final Paint[] f50879f;
    public boolean f50880f0;
    public u10 f50881g0;
    public final Paint[] h;
    public int f50882h0;
    public int f50883i0;
    public int f50884j0;
    public int f50885k0;
    public ValueAnimator f50886l0;
    public int m0;
    public final Paint[] f50887n;
    public int f50888n0;
    public int f50889o0;
    public boolean f50890p0;
    public boolean f50891q0;
    public final Paint f50892r;
    public boolean f50893r0;
    public final Paint f50894s;
    public final k4.j f50895s0;
    public boolean f50896t0;
    public ValueAnimator f50897u0;
    public boolean f50898v0;
    public final Paint f50899w;
    public mi.f f50900w0;
    public int f50901x;
    public ValueAnimator f50902x0;
    public int f50903y;
    public float f50904y0;
    public long f50905z0;

    public i1(Context context) {
        super(context);
        this.f50870a = new RectF();
        this.f50872b = new mg.f[2];
        this.f50874c = 0.0f;
        this.d = new float[2];
        this.f50877e = new boolean[3];
        this.f50879f = new Paint[2];
        this.h = new Paint[2];
        this.f50887n = new Paint[2];
        this.f50892r = new Paint(1);
        this.f50894s = new Paint(1);
        this.f50899w = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.F = textPaint;
        this.G = org.telegram.messenger.g0.L(56.0f);
        this.H = 1.0f;
        this.V = 0.0f;
        this.f50873b0 = 0.0f;
        this.f50882h0 = -1;
        this.f50895s0 = new k4.j(24);
        final org.telegram.ui.m0 m0Var = (org.telegram.ui.m0) this;
        this.A0 = new f1(m0Var, 0);
        this.B0 = false;
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.L(18.33f));
        for (int i3 = 0; i3 < 2; i3++) {
            this.f50879f[i3] = new Paint(1);
            this.h[i3] = new Paint(1);
            this.f50887n[i3] = new Paint(1);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, mf.e(-1, 56, 87));
        FrameLayout frameLayout2 = new FrameLayout(context);
        addView(frameLayout2, mf.e(-1, 56, 87));
        ci.q qVar = new ci.q(context, 10);
        this.I = qVar;
        qVar.setOrientation(0);
        addView(qVar, mf.e(-2, 56, 83));
        ImageView imageView = new ImageView(context);
        this.M = imageView;
        imageView.setContentDescription(bd.M0(2131754878, null));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        org.telegram.ui.ActionBar.w1 w1Var = new org.telegram.ui.ActionBar.w1(false);
        this.N = w1Var;
        w1Var.f28772k = 200.0f;
        w1Var.c(false, 1.0f);
        imageView.setImageDrawable(w1Var);
        org.telegram.ui.Cells.y h02 = k6.h0(1090519039, 1, -1);
        this.O = h02;
        imageView.setBackground(h02);
        qVar.addView(imageView, mf.o(54, 56));
        ci.q qVar2 = new ci.q(context, 11);
        this.J = qVar2;
        qVar2.setOrientation(0);
        addView(qVar2, mf.e(-2, 56, 85));
        ImageView imageView2 = new ImageView(context);
        this.P = imageView2;
        imageView2.setScaleType(scaleType);
        v5 v5Var = new v5(m0Var);
        this.Q = v5Var;
        imageView2.setImageDrawable(v5Var);
        v5Var.c();
        org.telegram.ui.Cells.y h03 = k6.h0(1090519039, 1, -1);
        this.R = h03;
        imageView2.setBackground(h03);
        qVar2.addView(imageView2, mf.o(54, 56));
        ImageView imageView3 = new ImageView(context);
        this.S = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(2131231244);
        imageView3.setColorFilter(new PorterDuffColorFilter(0, PorterDuff.Mode.SRC_IN));
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                boolean z10;
                float f10;
                View childAt;
                int i10;
                int i11 = r2;
                org.telegram.ui.m0 m0Var2 = m0Var;
                switch (i11) {
                    case 0:
                        int i12 = 1;
                        if (m0Var2.getParent() instanceof ViewGroup) {
                            ab abVar = new ab(m0Var2, 3);
                            f60 F = f60.F((ViewGroup) m0Var2.getParent(), null, m0Var2.S);
                            F.f33747s = 0;
                            F.S(m0Var2.f50888n0, m0Var2.f50889o0);
                            F.a0(0.0f, -org.telegram.messenger.g0.L(52.0f));
                            F.S = 200;
                            int w10 = k6.w(m0Var2.m0, k6.r1(0.1f, m0Var2.f50888n0));
                            F.f33736l0 = Integer.valueOf(w10);
                            int i13 = 0;
                            while (i13 < F.A.getChildCount()) {
                                if (i13 == F.A.getChildCount() - i12) {
                                    childAt = F.D;
                                } else {
                                    childAt = F.A.getChildAt(i13);
                                }
                                if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                                    int i14 = 0;
                                    while (i14 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount()) {
                                        View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i14);
                                        int i15 = i12;
                                        if (childAt2 instanceof org.telegram.ui.ActionBar.y0) {
                                            ((org.telegram.ui.ActionBar.y0) childAt2).setSelectorColor(w10);
                                        }
                                        i14++;
                                        i12 = i15;
                                    }
                                    i10 = i12;
                                } else {
                                    i10 = i12;
                                    if (childAt instanceof org.telegram.ui.ActionBar.y0) {
                                        ((org.telegram.ui.ActionBar.y0) childAt).setSelectorColor(w10);
                                    }
                                }
                                i13++;
                                i12 = i10;
                            }
                            int i16 = i12;
                            if (org.telegram.messenger.g0.B(m0Var2.m0) > 0.721f) {
                                F.P(-1);
                                F.T(-986896);
                            } else {
                                F.P(-14737633);
                                F.T(-15592942);
                            }
                            int i17 = m0Var2.f50882h0;
                            if (i17 == 0) {
                                F.c(2131232265, bd.M0(2131747804, null), (Runnable) abVar.a(3), false);
                                F.c(2131232354, bd.M0(2131745846, null), (Runnable) abVar.a(1), false);
                                F.l(2131232363, bd.M0(2131745469, null), (Runnable) abVar.a(2), !m0Var2.f50893r0);
                                F.c(2131232361, bd.M0(2131745505, null), (Runnable) abVar.a(4), false);
                            } else if (i17 == i16) {
                                if (!m0Var2.f50891q0) {
                                    F.c(2131232265, bd.M0(2131747804, null), (Runnable) abVar.a(3), false);
                                    F.k();
                                }
                                if (m0Var2.f50890p0) {
                                    F.c(2131232058, bd.M0(2131742931, null), (Runnable) abVar.a(9), false);
                                }
                                s1 instantViewLoader = m0Var2.getInstantViewLoader();
                                if (instantViewLoader != null && (((!instantViewLoader.f51012g || !instantViewLoader.f51013i) && instantViewLoader.h == null && instantViewLoader.f51014j == null && !instantViewLoader.f51009c) || instantViewLoader.b() != null)) {
                                    F.c(2131231834, bd.M0(2131747796, null), (Runnable) abVar.a(10), false);
                                    org.telegram.ui.ActionBar.y0 y9 = F.y();
                                    if (instantViewLoader.b() != null) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    y9.setEnabled(z10);
                                    if (y9.isEnabled()) {
                                        f10 = 1.0f;
                                    } else {
                                        f10 = 0.5f;
                                    }
                                    y9.setAlpha(f10);
                                    hc1 hc1Var = new hc1(8, y9, instantViewLoader);
                                    instantViewLoader.f51017m.add(hc1Var);
                                    F.f33742p = new hc1(12, instantViewLoader, hc1Var);
                                }
                                F.c(2131232341, bd.M0(2131746348, null), (Runnable) abVar.a(5), false);
                                F.c(2131232354, bd.M0(2131745846, null), (Runnable) abVar.a(1), false);
                                F.c(2131232351, bd.M0(2131742952, null), (Runnable) abVar.a(6), false);
                                F.c(2131232363, bd.M0(2131745469, null), (Runnable) abVar.a(2), false);
                                F.k();
                                if (!xf.a(null).isEmpty()) {
                                    F.c(2131231919, bd.M0(2131742930, null), (Runnable) abVar.a(8), false);
                                }
                                F.c(2131231769, bd.M0(2131742949, null), (Runnable) abVar.a(7), false);
                                F.c(2131232361, bd.M0(2131745505, null), (Runnable) abVar.a(4), false);
                            }
                            F.f33742p = new hb1(m0Var2);
                            F.Z();
                            return;
                        }
                        return;
                    default:
                        m0Var2.W.setText("");
                        return;
                }
            }
        });
        org.telegram.ui.Cells.y h04 = k6.h0(1090519039, 1, -1);
        this.T = h04;
        imageView3.setBackground(h04);
        imageView3.setContentDescription(bd.M0(2131754839, "AccDescrMoreOptions"));
        qVar2.addView(imageView3, mf.o(54, 56));
        ci.s sVar = new ci.s(context, 5);
        this.W = sVar;
        sVar.setVisibility(8);
        sVar.setAlpha(0.0f);
        sVar.setTextSize(1, 18.0f);
        sVar.setSingleLine(true);
        sVar.setHint(bd.M0(2131745846, null));
        sVar.setBackgroundResource(0);
        sVar.setCursorWidth(1.5f);
        sVar.setGravity(112);
        sVar.setClipToPadding(true);
        sVar.setPadding(org.telegram.messenger.g0.L(58.0f), 0, org.telegram.messenger.g0.L(112.0f), 0);
        sVar.setTranslationY(-org.telegram.messenger.g0.L(0.66f));
        sVar.setInputType(sVar.getInputType() | 524288);
        sVar.setImeOptions(33554435);
        sVar.setTextIsSelectable(false);
        sVar.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (keyEvent != null) {
                            if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                                org.telegram.messenger.g0.v1(m0Var.W);
                                return false;
                            }
                            return false;
                        }
                        return false;
                    default:
                        if (i10 == 2) {
                            org.telegram.ui.m0 m0Var2 = m0Var;
                            mi.f fVar = m0Var2.f50900w0;
                            if (fVar != null) {
                                fVar.a(m0Var2.f50875c0.getText().toString());
                            }
                            m0Var2.k(false);
                        }
                        return false;
                }
            }
        });
        sVar.addTextChangedListener(new ma(m0Var, 1));
        frameLayout.addView(sVar, mf.e(-1, -1, 119));
        ci.s sVar2 = new ci.s(context, 6);
        this.f50875c0 = sVar2;
        sVar2.setVisibility(8);
        sVar2.setAlpha(0.0f);
        sVar2.setTextSize(1, 15.66f);
        sVar2.setSingleLine(true);
        this.f50876d0 = az.f21653p0;
        sVar2.setHint(bd.a0(null, null, 2131754351, d1.a().f50829a));
        sVar2.setBackgroundResource(0);
        sVar2.setCursorWidth(1.5f);
        sVar2.setGravity(112);
        sVar2.setInputType(sVar2.getInputType() | 524288);
        sVar2.setImeOptions(33554434);
        sVar2.setTextIsSelectable(false);
        sVar2.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (keyEvent != null) {
                            if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                                org.telegram.messenger.g0.v1(m0Var.W);
                                return false;
                            }
                            return false;
                        }
                        return false;
                    default:
                        if (i10 == 2) {
                            org.telegram.ui.m0 m0Var2 = m0Var;
                            mi.f fVar = m0Var2.f50900w0;
                            if (fVar != null) {
                                fVar.a(m0Var2.f50875c0.getText().toString());
                            }
                            m0Var2.k(false);
                        }
                        return false;
                }
            }
        });
        frameLayout2.addView(sVar2, mf.d(-1, -1.0f, 119, 48.0f, 0.0f, 12.0f, 0.0f));
        ImageView imageView4 = new ImageView(context);
        this.K = imageView4;
        imageView4.setScaleType(scaleType);
        imageView4.setImageResource(2131231269);
        org.telegram.ui.Cells.y h05 = k6.h0(1090519039, 1, -1);
        this.L = h05;
        imageView4.setBackground(h05);
        imageView4.setVisibility(8);
        imageView4.setAlpha(0.0f);
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                boolean z10;
                float f10;
                View childAt;
                int i10;
                int i11 = r2;
                org.telegram.ui.m0 m0Var2 = m0Var;
                switch (i11) {
                    case 0:
                        int i12 = 1;
                        if (m0Var2.getParent() instanceof ViewGroup) {
                            ab abVar = new ab(m0Var2, 3);
                            f60 F = f60.F((ViewGroup) m0Var2.getParent(), null, m0Var2.S);
                            F.f33747s = 0;
                            F.S(m0Var2.f50888n0, m0Var2.f50889o0);
                            F.a0(0.0f, -org.telegram.messenger.g0.L(52.0f));
                            F.S = 200;
                            int w10 = k6.w(m0Var2.m0, k6.r1(0.1f, m0Var2.f50888n0));
                            F.f33736l0 = Integer.valueOf(w10);
                            int i13 = 0;
                            while (i13 < F.A.getChildCount()) {
                                if (i13 == F.A.getChildCount() - i12) {
                                    childAt = F.D;
                                } else {
                                    childAt = F.A.getChildAt(i13);
                                }
                                if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                                    int i14 = 0;
                                    while (i14 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount()) {
                                        View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i14);
                                        int i15 = i12;
                                        if (childAt2 instanceof org.telegram.ui.ActionBar.y0) {
                                            ((org.telegram.ui.ActionBar.y0) childAt2).setSelectorColor(w10);
                                        }
                                        i14++;
                                        i12 = i15;
                                    }
                                    i10 = i12;
                                } else {
                                    i10 = i12;
                                    if (childAt instanceof org.telegram.ui.ActionBar.y0) {
                                        ((org.telegram.ui.ActionBar.y0) childAt).setSelectorColor(w10);
                                    }
                                }
                                i13++;
                                i12 = i10;
                            }
                            int i16 = i12;
                            if (org.telegram.messenger.g0.B(m0Var2.m0) > 0.721f) {
                                F.P(-1);
                                F.T(-986896);
                            } else {
                                F.P(-14737633);
                                F.T(-15592942);
                            }
                            int i17 = m0Var2.f50882h0;
                            if (i17 == 0) {
                                F.c(2131232265, bd.M0(2131747804, null), (Runnable) abVar.a(3), false);
                                F.c(2131232354, bd.M0(2131745846, null), (Runnable) abVar.a(1), false);
                                F.l(2131232363, bd.M0(2131745469, null), (Runnable) abVar.a(2), !m0Var2.f50893r0);
                                F.c(2131232361, bd.M0(2131745505, null), (Runnable) abVar.a(4), false);
                            } else if (i17 == i16) {
                                if (!m0Var2.f50891q0) {
                                    F.c(2131232265, bd.M0(2131747804, null), (Runnable) abVar.a(3), false);
                                    F.k();
                                }
                                if (m0Var2.f50890p0) {
                                    F.c(2131232058, bd.M0(2131742931, null), (Runnable) abVar.a(9), false);
                                }
                                s1 instantViewLoader = m0Var2.getInstantViewLoader();
                                if (instantViewLoader != null && (((!instantViewLoader.f51012g || !instantViewLoader.f51013i) && instantViewLoader.h == null && instantViewLoader.f51014j == null && !instantViewLoader.f51009c) || instantViewLoader.b() != null)) {
                                    F.c(2131231834, bd.M0(2131747796, null), (Runnable) abVar.a(10), false);
                                    org.telegram.ui.ActionBar.y0 y9 = F.y();
                                    if (instantViewLoader.b() != null) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    y9.setEnabled(z10);
                                    if (y9.isEnabled()) {
                                        f10 = 1.0f;
                                    } else {
                                        f10 = 0.5f;
                                    }
                                    y9.setAlpha(f10);
                                    hc1 hc1Var = new hc1(8, y9, instantViewLoader);
                                    instantViewLoader.f51017m.add(hc1Var);
                                    F.f33742p = new hc1(12, instantViewLoader, hc1Var);
                                }
                                F.c(2131232341, bd.M0(2131746348, null), (Runnable) abVar.a(5), false);
                                F.c(2131232354, bd.M0(2131745846, null), (Runnable) abVar.a(1), false);
                                F.c(2131232351, bd.M0(2131742952, null), (Runnable) abVar.a(6), false);
                                F.c(2131232363, bd.M0(2131745469, null), (Runnable) abVar.a(2), false);
                                F.k();
                                if (!xf.a(null).isEmpty()) {
                                    F.c(2131231919, bd.M0(2131742930, null), (Runnable) abVar.a(8), false);
                                }
                                F.c(2131231769, bd.M0(2131742949, null), (Runnable) abVar.a(7), false);
                                F.c(2131232361, bd.M0(2131745505, null), (Runnable) abVar.a(4), false);
                            }
                            F.f33742p = new hb1(m0Var2);
                            F.Z();
                            return;
                        }
                        return;
                    default:
                        m0Var2.W.setText("");
                        return;
                }
            }
        });
        addView(imageView4, mf.e(54, 56, 85));
        d70 d70Var = new d70(context);
        this.f50878e0 = d70Var;
        d70Var.setPivotX(0.0f);
        d70Var.setPivotY(org.telegram.messenger.g0.L(2.0f));
        addView(d70Var, mf.e(-1, 2, 87));
        setWillNotDraw(false);
        this.f50872b[0] = new mg.f(m0Var);
        this.f50872b[1] = new mg.f(m0Var);
        int i10 = k6.Dl;
        d(k6.v0(i10), false);
        setMenuColors(k6.v0(i10));
    }

    public final void a(Canvas canvas, float f10, float f11, boolean z10) {
        float f12;
        float max = Math.max(org.telegram.messenger.g0.L(0.66f), 1);
        float f13 = f10 - max;
        float width = getWidth() * this.f50874c;
        RectF rectF = this.f50870a;
        rectF.set(0.0f, 0.0f, getWidth(), f10);
        Paint[] paintArr = this.f50879f;
        int alpha = paintArr[1].getAlpha();
        paintArr[1].setAlpha((int) (alpha * 1.0f));
        canvas.drawRect(rectF, paintArr[1]);
        paintArr[1].setAlpha(alpha);
        int i3 = (this.f50874c > 0.0f ? 1 : (this.f50874c == 0.0f ? 0 : -1));
        float[] fArr = this.d;
        Paint[] paintArr2 = this.f50887n;
        Paint[] paintArr3 = this.h;
        if (i3 > 0) {
            rectF.set(0.0f, 0.0f, fArr[1] * getWidth(), f10);
            int alpha2 = paintArr3[1].getAlpha();
            f12 = 1.0f;
            paintArr3[1].setAlpha((int) ((1.0f - this.f50873b0) * (1.0f - this.V) * alpha2 * 1.0f));
            canvas.drawRect(rectF, paintArr3[1]);
            paintArr3[1].setAlpha(alpha2);
            if (z10) {
                rectF.set(0.0f, f13, width, f13 + max);
                int alpha3 = paintArr2[1].getAlpha();
                paintArr2[1].setAlpha((int) ((1.0f - this.f50873b0) * alpha3 * 1.0f * f11));
                canvas.drawRect(rectF, paintArr2[1]);
                paintArr2[1].setAlpha(alpha3);
            }
        } else {
            f12 = 1.0f;
        }
        float f14 = this.f50874c;
        if (f14 < f12) {
            int r12 = k6.r1((f12 - f14) * f12, 1610612736);
            Paint paint = this.f50892r;
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
        paintArr3[0].setAlpha((int) ((f12 - this.f50873b0) * (f12 - this.V) * (f12 - Utilities.l(this.f50874c * 4.0f)) * alpha5 * f12));
        canvas.drawRect(rectF, paintArr3[0]);
        paintArr3[0].setAlpha(alpha5);
        if (z10) {
            rectF.set(width, f13, getWidth() + width, max + f13);
            int alpha6 = paintArr2[0].getAlpha();
            paintArr2[0].setAlpha((int) ((f12 - this.f50873b0) * alpha6 * f12 * f11));
            canvas.drawRect(rectF, paintArr2[0]);
            paintArr2[0].setAlpha(alpha6);
        }
    }

    public final void b(int i3, int i10) {
        float f10;
        boolean[] zArr = this.f50877e;
        boolean z10 = zArr[i3];
        Paint[] paintArr = this.f50879f;
        if (z10 && paintArr[i3].getColor() == i10) {
            return;
        }
        zArr[i3] = true;
        paintArr[i3].setColor(i10);
        if (org.telegram.messenger.g0.B(i10) <= 0.721f) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        int f11 = i0.a.f(f10, -16777216, -1);
        this.h[i3].setColor(k6.w(i10, k6.r1(org.telegram.messenger.g0.T1(0.07f, 0.2f, f10), f11)));
        this.f50887n[i3].setColor(k6.w(i10, k6.r1(org.telegram.messenger.g0.T1(0.14f, 0.24f, f10), f11)));
        mg.f[] fVarArr = this.f50872b;
        ((g6) fVarArr[i3].d).u(f11);
        fVarArr[i3].f19305a = k6.w(i10, k6.r1(0.6f, f11));
        mg.f fVar = fVarArr[i3];
        ((g6) fVar.f19308e).u(i0.a.f(((u5) fVarArr[i3].f19309f).f38645c, fVar.f19305a, k6.x0(null, k6.f28122q7, false)));
        invalidate();
    }

    public final void c(final int i3, float f10, boolean z10) {
        final float f11;
        boolean[] zArr = this.f50877e;
        if (zArr[2] && this.f50884j0 == i3) {
            return;
        }
        final float f12 = 1.0f;
        if (!z10) {
            zArr[2] = true;
            if (f10 < 0.0f) {
                if (org.telegram.messenger.g0.B(i3) <= 0.721f) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
            }
            int f13 = i0.a.f(f10, -16777216, -1);
            this.f50901x = f13;
            k6.r1(0.55f, f13);
            this.f50884j0 = i3;
            this.f50903y = i0.a.f(f10, -1, -16777216);
            int f14 = i0.a.f(1.0f - f10, -1, -16777216);
            this.E = f14;
            int i10 = this.f50903y;
            i4 i4Var = ((org.telegram.ui.m0) this).C0;
            l lVar = i4Var.f46089j0;
            if (lVar != null) {
                lVar.c(i10, f14);
            }
            this.f50894s.setColor(this.f50903y);
            this.f50899w.setColor(k6.w(this.f50903y, k6.r1(org.telegram.messenger.g0.T1(0.07f, 0.2f, f10), this.f50901x)));
            int r12 = k6.r1(0.6f, this.E);
            ci.s sVar = this.f50875c0;
            sVar.setHintTextColor(r12);
            sVar.setTextColor(this.E);
            sVar.setCursorColor(this.E);
            sVar.setHandlesColor(this.E);
            this.f50878e0.setProgressColor(k6.v0(k6.Fl));
            int f15 = i0.a.f(this.f50873b0, this.f50901x, this.E);
            org.telegram.ui.ActionBar.w1 w1Var = this.N;
            w1Var.a(f15);
            w1Var.b(i0.a.f(this.f50873b0, this.f50901x, this.E));
            int i11 = this.f50901x;
            v5 v5Var = this.Q;
            v5Var.f43289c.setColor(i11);
            v5Var.invalidateSelf();
            int i12 = this.f50901x;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            this.S.setColorFilter(new PorterDuffColorFilter(i12, mode));
            this.P.setColorFilter(new PorterDuffColorFilter(this.f50901x, mode));
            this.K.setColorFilter(new PorterDuffColorFilter(this.f50901x, mode));
            int w10 = k6.w(i3, k6.r1(0.22f, this.f50901x));
            this.f50885k0 = w10;
            k6.H1(this.O, w10, true);
            k6.H1(this.R, this.f50885k0, true);
            k6.H1(this.T, this.f50885k0, true);
            k6.H1(this.L, this.f50885k0, true);
            int r13 = k6.r1(0.6f, this.f50901x);
            ci.s sVar2 = this.W;
            sVar2.setHintTextColor(r13);
            sVar2.setTextColor(this.f50901x);
            sVar2.setCursorColor(this.f50901x);
            sVar2.setHandlesColor(this.f50901x);
            u3 u3Var = i4Var.L;
            if (u3Var != null) {
                u3Var.u();
            }
            invalidate();
            return;
        }
        ValueAnimator valueAnimator = this.f50886l0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i13 = this.f50884j0;
        this.f50883i0 = i13;
        if (org.telegram.messenger.g0.B(i13) <= 0.721f) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        if (org.telegram.messenger.g0.B(i3) > 0.721f) {
            f12 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f50886l0 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                i1 i1Var = i1.this;
                i1Var.getClass();
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                i1Var.c(i0.a.f(floatValue, i1Var.f50883i0, i3), org.telegram.messenger.g0.T1(f11, f12, floatValue), false);
            }
        });
        this.f50886l0.addListener(new pc(this, i3, f12, 2));
        this.f50886l0.start();
    }

    public final void d(int i3, boolean z10) {
        c(i3, -1.0f, z10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i3;
        int i10;
        int i11;
        int i12 = 0;
        if (this.f50880f0) {
            i3 = org.telegram.messenger.g0.f22602m;
        } else {
            i3 = 0;
        }
        a(canvas, i3 + this.G, 1.0f, this.f50896t0);
        float right = this.I.getRight();
        float left = this.J.getLeft();
        boolean z10 = this.f50880f0;
        if (z10) {
            i10 = org.telegram.messenger.g0.f22602m;
        } else {
            i10 = 0;
        }
        float f10 = i10;
        if (z10) {
            i11 = org.telegram.messenger.g0.f22602m;
        } else {
            i11 = 0;
        }
        float f11 = i11 + this.G;
        int i13 = (this.f50874c > 1.0f ? 1 : (this.f50874c == 1.0f ? 0 : -1));
        mg.f[] fVarArr = this.f50872b;
        if (i13 < 0) {
            canvas.save();
            float width = (getWidth() * this.f50874c) - (Utilities.l(this.f50874c * 2.0f) * org.telegram.messenger.g0.L(30.0f));
            canvas.translate(right + width, f10);
            fVarArr[0].c(canvas, (left - right) - width, f11 - f10, (1.0f - this.V) * (1.0f - this.f50874c));
            canvas.restore();
        }
        if (this.f50874c > 0.0f) {
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, getWidth() * this.f50874c, getHeight());
            canvas.translate(right, f10);
            canvas.translate((1.0f - this.f50874c) * org.telegram.messenger.g0.L(-12.0f), 0.0f);
            float T1 = org.telegram.messenger.g0.T1(1.0f, 0.5f, 1.0f - this.f50874c);
            float f12 = f11 - f10;
            canvas.scale(T1, T1, 0.0f, f12 / 2.0f);
            fVarArr[1].c(canvas, left - right, f12, (1.0f - this.f50873b0) * (1.0f - this.V) * this.f50874c);
            canvas.restore();
        }
        int i14 = (this.f50873b0 > 0.0f ? 1 : (this.f50873b0 == 0.0f ? 0 : -1));
        RectF rectF = this.f50870a;
        if (i14 > 0) {
            Paint paint = this.f50894s;
            int alpha = paint.getAlpha();
            paint.setAlpha((int) (alpha * this.f50873b0));
            float width2 = getWidth();
            if (this.f50880f0) {
                i12 = org.telegram.messenger.g0.f22602m;
            }
            canvas.drawRect(0.0f, 0.0f, width2, i12 + this.G, paint);
            paint.setAlpha(alpha);
            float f13 = (f10 + f11) / 2.0f;
            float L = org.telegram.messenger.g0.L(42.0f) / 2.0f;
            rectF.set(org.telegram.messenger.g0.L(6.0f), f13 - L, org.telegram.messenger.g0.T1(left, getWidth() - org.telegram.messenger.g0.L(6.0f), this.f50873b0), f13 + L);
            Paint paint2 = this.f50899w;
            int alpha2 = paint2.getAlpha();
            paint2.setAlpha((int) (alpha2 * this.f50873b0));
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
        t0 webView;
        int action = motionEvent.getAction();
        f1 f1Var = this.A0;
        if (action == 0) {
            this.B0 = false;
            org.telegram.messenger.g0.r(f1Var);
            if (motionEvent.getX() > this.I.getRight() && motionEvent.getX() < this.J.getLeft() && !this.U && !this.f50871a0) {
                this.f50904y0 = motionEvent.getX();
                motionEvent.getY();
                this.f50905z0 = System.currentTimeMillis();
                org.telegram.messenger.g0.i3(f1Var, ViewConfiguration.getLongPressTimeout() * 0.8f);
            }
        } else if (motionEvent.getAction() == 2 && ((float) (System.currentTimeMillis() - this.f50905z0)) > ViewConfiguration.getLongPressTimeout() * 0.8f) {
            org.telegram.messenger.g0.r(f1Var);
            this.B0 = true;
            l3 l3Var = ((org.telegram.ui.m0) this).C0.f46100v0[0];
            float l10 = Utilities.l(l3Var.getProgress() + ((motionEvent.getX() - this.f50904y0) / (getWidth() * 0.8f)));
            if (!l3Var.c() && l3Var.f() && (webView = l3Var.f47086f.getWebView()) != null) {
                webView.setScrollProgress(l10);
                l3Var.M.d0();
            }
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            org.telegram.messenger.g0.r(f1Var);
            this.f50905z0 = 0L;
        }
        this.f50904y0 = motionEvent.getX();
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e(int i3, boolean z10) {
        float f10;
        mg.f fVar = this.f50872b[i3];
        if (fVar.f19307c != z10) {
            fVar.f19307c = z10;
            u5 u5Var = (u5) fVar.f19309f;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            u5Var.e(true, f10);
            invalidate();
        }
    }

    public final void f(int i3, String str) {
        mg.f[] fVarArr = this.f50872b;
        CharSequence charSequence = ((g6) fVarArr[i3].f19308e).f33989i;
        if (charSequence != null && TextUtils.equals(charSequence.toString(), str)) {
            return;
        }
        ((g6) fVarArr[i3].f19308e).t(i6.m(str, ((g6) fVarArr[i3].f19308e).f33981a.getFontMetricsInt(), false, null, 0), false, true);
    }

    public final void g(int i3, String str, boolean z10) {
        mg.f[] fVarArr = this.f50872b;
        CharSequence charSequence = ((g6) fVarArr[i3].d).f33989i;
        if (charSequence != null && TextUtils.equals(charSequence.toString(), str)) {
            return;
        }
        ((g6) fVarArr[i3].d).t(i6.m(str, ((g6) fVarArr[i3].d).f33981a.getFontMetricsInt(), false, null, 0), z10, true);
    }

    public int getBackgroundColor() {
        return this.f50884j0;
    }

    public s1 getInstantViewLoader() {
        return null;
    }

    public int getTextColor() {
        return this.f50901x;
    }

    public String getTitle() {
        CharSequence charSequence = ((g6) this.f50872b[0].d).f33989i;
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
        ValueAnimator valueAnimator = this.f50897u0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.U = z10;
        ci.s sVar = this.W;
        boolean z11 = false;
        sVar.setVisibility(0);
        float f11 = 0.0f;
        if (!this.f50898v0 && !z10) {
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
        this.f50897u0 = ofFloat;
        ofFloat.addUpdateListener(new j3(this, 23));
        this.f50897u0.addListener(new u40(12, this, z10));
        this.f50897u0.setInterpolator(xq.h);
        this.f50897u0.setDuration(320L);
        this.f50897u0.start();
        boolean z12 = !z10;
        org.telegram.messenger.g0.V3(this.P, z12, true);
        org.telegram.messenger.g0.V3(this.S, z12, true);
        if (sVar.length() > 0 && this.U) {
            z11 = true;
        }
        org.telegram.messenger.g0.V3(this.K, z11, true);
    }

    public final void i() {
        mg.f[] fVarArr = this.f50872b;
        mg.f fVar = fVarArr[0];
        fVarArr[0] = fVarArr[1];
        fVarArr[1] = fVar;
        float[] fArr = this.d;
        float f10 = fArr[0];
        fArr[0] = fArr[1];
        fArr[1] = f10;
        Paint[] paintArr = this.f50879f;
        int color = paintArr[0].getColor();
        b(0, paintArr[1].getColor());
        b(1, color);
        invalidate();
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
    }

    @Override
    public void onMeasure(int i3, int i10) {
        int i11;
        if (this.f50880f0) {
            i11 = org.telegram.messenger.g0.f22602m;
        } else {
            i11 = 0;
        }
        super.onMeasure(i3, org.telegram.messenger.camera.q.B(56.0f, i11, 1073741824));
    }

    public void setBackButton(boolean z10) {
        float f10;
        this.f50898v0 = z10;
        if (!this.U && !this.f50871a0) {
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            this.N.c(true, f10);
        }
    }

    public void setBackButtonCached(boolean z10) {
        this.f50898v0 = z10;
    }

    public void setHasForward(boolean z10) {
        this.f50890p0 = z10;
    }

    public void setHeight(int i3) {
        if (this.G != i3) {
            this.G = i3;
            float pow = (float) Math.pow(i3 / org.telegram.messenger.g0.L(56.0f), 0.5d);
            this.H = pow;
            ci.q qVar = this.I;
            qVar.setScaleX(pow);
            qVar.setScaleY(this.H);
            qVar.setTranslationX((1.0f - this.H) * org.telegram.messenger.g0.L(42.0f));
            qVar.setTranslationY((1.0f - this.H) * org.telegram.messenger.g0.L(-12.0f));
            float f10 = this.H;
            ci.q qVar2 = this.J;
            qVar2.setScaleX(f10);
            qVar2.setScaleY(this.H);
            qVar2.setTranslationX((1.0f - this.H) * (-org.telegram.messenger.g0.L(42.0f)));
            qVar2.setTranslationY((1.0f - this.H) * org.telegram.messenger.g0.L(-12.0f));
            this.f50878e0.setTranslationY(this.G - org.telegram.messenger.g0.L(56.0f));
            invalidate();
        }
    }

    public void setIsLocal(boolean z10) {
        this.f50893r0 = z10;
    }

    public void setIsTonsite(boolean z10) {
        this.f50891q0 = z10;
    }

    public void setMenuColors(int i3) {
        int i10;
        boolean z10 = false;
        if (u4.f(u4.e(i3))[0] < 0.5d) {
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
        this.f50888n0 = i11;
        this.f50889o0 = k6.r1(0.6f, i11);
    }

    public void setMenuListener(u10 u10Var) {
        this.f50881g0 = u10Var;
    }

    public void setMenuType(int i3) {
        if (this.f50882h0 != i3) {
            this.f50882h0 = i3;
        }
    }

    public void setProgress(float f10) {
        this.d[0] = f10;
        invalidate();
    }

    public void setTransitionProgress(float f10) {
        this.f50874c = f10;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return true;
    }

    public void setIsLoaded(boolean z10) {
    }
}
