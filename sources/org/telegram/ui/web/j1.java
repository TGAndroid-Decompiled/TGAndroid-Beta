package org.telegram.ui.web;

import ai.q2;
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
import c8.ja;
import c8.za;
import di.fc;
import di.qa;
import hi.j3;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gz;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.z10;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.s4;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.k70;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Wallet.i9;
import org.telegram.ui.Wallet.x5;
import org.telegram.ui.ah0;
import org.telegram.ui.g4;
import org.telegram.ui.k3;
import org.telegram.ui.t3;
import org.telegram.ui.z20;
public abstract class j1 extends FrameLayout {
    public final g1 A0;
    public boolean B0;
    public int E;
    public final TextPaint F;
    public int G;
    public float H;
    public final q2 I;
    public final q2 J;
    public final ImageView K;
    public final org.telegram.ui.Cells.y L;
    public final ImageView M;
    public final org.telegram.ui.ActionBar.x1 N;
    public final org.telegram.ui.Cells.y O;
    public final ImageView P;
    public final x5 Q;
    public final org.telegram.ui.Cells.y R;
    public final ImageView S;
    public final org.telegram.ui.Cells.y T;
    public boolean U;
    public float V;
    public final di.q W;
    public final RectF f52644a;
    public boolean f52645a0;
    public final lg.f[] f52646b;
    public float f52647b0;
    public float f52648c;
    public final di.q f52649c0;
    public final float[] d;
    public int f52650d0;
    public final boolean[] f52651e;
    public final k70 f52652e0;
    public final Paint[] f52653f;
    public boolean f52654f0;
    public z10 f52655g0;
    public final Paint[] h;
    public int f52656h0;
    public int f52657i0;
    public int f52658j0;
    public int f52659k0;
    public ValueAnimator f52660l0;
    public int m0;
    public final Paint[] f52661n;
    public int f52662n0;
    public int f52663o0;
    public boolean f52664p0;
    public boolean f52665q0;
    public final Paint f52666r;
    public boolean f52667r0;
    public final Paint f52668s;
    public final h6.m f52669s0;
    public boolean f52670t0;
    public ValueAnimator f52671u0;
    public boolean f52672v0;
    public final Paint f52673w;
    public li.v f52674w0;
    public int f52675x;
    public ValueAnimator f52676x0;
    public int f52677y;
    public float f52678y0;
    public long f52679z0;

    public j1(Context context) {
        super(context);
        this.f52644a = new RectF();
        this.f52646b = new lg.f[2];
        this.f52648c = 0.0f;
        this.d = new float[2];
        this.f52651e = new boolean[3];
        this.f52653f = new Paint[2];
        this.h = new Paint[2];
        this.f52661n = new Paint[2];
        this.f52666r = new Paint(1);
        this.f52668s = new Paint(1);
        this.f52673w = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.F = textPaint;
        this.G = org.telegram.messenger.g0.L(56.0f);
        this.H = 1.0f;
        this.V = 0.0f;
        this.f52647b0 = 0.0f;
        this.f52656h0 = -1;
        this.f52669s0 = new h6.m(29);
        final org.telegram.ui.l0 l0Var = (org.telegram.ui.l0) this;
        this.A0 = new g1(l0Var, 0);
        this.B0 = false;
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.L(18.33f));
        for (int i7 = 0; i7 < 2; i7++) {
            this.f52653f[i7] = new Paint(1);
            this.h[i7] = new Paint(1);
            this.f52661n[i7] = new Paint(1);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, ja.e(-1, 56, 87));
        FrameLayout frameLayout2 = new FrameLayout(context);
        addView(frameLayout2, ja.e(-1, 56, 87));
        q2 q2Var = new q2(context, 10);
        this.I = q2Var;
        q2Var.setOrientation(0);
        addView(q2Var, ja.e(-2, 56, 83));
        ImageView imageView = new ImageView(context);
        this.M = imageView;
        imageView.setContentDescription(hd.M0(2131754878, null));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(false);
        this.N = x1Var;
        x1Var.f29864k = 200.0f;
        x1Var.c(false, 1.0f);
        imageView.setImageDrawable(x1Var);
        org.telegram.ui.Cells.y h02 = j6.h0(1090519039, 1, -1);
        this.O = h02;
        imageView.setBackground(h02);
        q2Var.addView(imageView, ja.o(54, 56));
        q2 q2Var2 = new q2(context, 11);
        this.J = q2Var2;
        q2Var2.setOrientation(0);
        addView(q2Var2, ja.e(-2, 56, 85));
        ImageView imageView2 = new ImageView(context);
        this.P = imageView2;
        imageView2.setScaleType(scaleType);
        x5 x5Var = new x5(l0Var);
        this.Q = x5Var;
        imageView2.setImageDrawable(x5Var);
        x5Var.c();
        org.telegram.ui.Cells.y h03 = j6.h0(1090519039, 1, -1);
        this.R = h03;
        imageView2.setBackground(h03);
        q2Var2.addView(imageView2, ja.o(54, 56));
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
                org.telegram.ui.l0 l0Var2 = l0Var;
                switch (i11) {
                    case 0:
                        int i12 = 1;
                        if (l0Var2.getParent() instanceof ViewGroup) {
                            qa qaVar = new qa(l0Var2, 3);
                            m60 F = m60.F((ViewGroup) l0Var2.getParent(), null, l0Var2.S);
                            F.f37111s = 0;
                            F.S(l0Var2.f52662n0, l0Var2.f52663o0);
                            F.a0(0.0f, -org.telegram.messenger.g0.L(52.0f));
                            F.S = 200;
                            int w10 = j6.w(l0Var2.m0, j6.r1(0.1f, l0Var2.f52662n0));
                            F.f37100l0 = Integer.valueOf(w10);
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
                                F.P(-1);
                                F.T(-986896);
                            } else {
                                F.P(-14737633);
                                F.T(-15592942);
                            }
                            int i17 = l0Var2.f52656h0;
                            if (i17 == 0) {
                                F.c(2131232266, hd.M0(2131747796, null), (Runnable) qaVar.a(3), false);
                                F.c(2131232355, hd.M0(2131745836, null), (Runnable) qaVar.a(1), false);
                                F.l(2131232364, hd.M0(2131745459, null), (Runnable) qaVar.a(2), !l0Var2.f52667r0);
                                F.c(2131232362, hd.M0(2131745495, null), (Runnable) qaVar.a(4), false);
                            } else if (i17 == i16) {
                                if (!l0Var2.f52665q0) {
                                    F.c(2131232266, hd.M0(2131747796, null), (Runnable) qaVar.a(3), false);
                                    F.k();
                                }
                                if (l0Var2.f52664p0) {
                                    F.c(2131232059, hd.M0(2131742921, null), (Runnable) qaVar.a(9), false);
                                }
                                t1 instantViewLoader = l0Var2.getInstantViewLoader();
                                if (instantViewLoader != null && (((!instantViewLoader.f52792g || !instantViewLoader.f52793i) && instantViewLoader.h == null && instantViewLoader.f52794j == null && !instantViewLoader.f52789c) || instantViewLoader.b() != null)) {
                                    F.c(2131231834, hd.M0(2131747788, null), (Runnable) qaVar.a(10), false);
                                    org.telegram.ui.ActionBar.z0 y10 = F.y();
                                    if (instantViewLoader.b() != null) {
                                        z10 = i16;
                                    } else {
                                        z10 = false;
                                    }
                                    y10.setEnabled(z10);
                                    if (y10.isEnabled()) {
                                        f10 = 1.0f;
                                    } else {
                                        f10 = 0.5f;
                                    }
                                    y10.setAlpha(f10);
                                    org.telegram.ui.Wallet.r rVar = new org.telegram.ui.Wallet.r(29, y10, instantViewLoader);
                                    instantViewLoader.f52797m.add(rVar);
                                    F.f37106p = new e1(3, instantViewLoader, rVar);
                                }
                                F.c(2131232342, hd.M0(2131746340, null), (Runnable) qaVar.a(5), false);
                                F.c(2131232355, hd.M0(2131745836, null), (Runnable) qaVar.a(1), false);
                                F.c(2131232352, hd.M0(2131742942, null), (Runnable) qaVar.a(6), false);
                                F.c(2131232364, hd.M0(2131745459, null), (Runnable) qaVar.a(2), false);
                                F.k();
                                if (!za.a(null).isEmpty()) {
                                    F.c(2131231919, hd.M0(2131742920, null), (Runnable) qaVar.a(8), false);
                                }
                                F.c(2131231769, hd.M0(2131742939, null), (Runnable) qaVar.a(7), false);
                                F.c(2131232362, hd.M0(2131745495, null), (Runnable) qaVar.a(4), false);
                            }
                            F.f37106p = new ah0(l0Var2);
                            F.Z();
                            return;
                        }
                        return;
                    default:
                        l0Var2.W.setText("");
                        return;
                }
            }
        });
        org.telegram.ui.Cells.y h04 = j6.h0(1090519039, 1, -1);
        this.T = h04;
        imageView3.setBackground(h04);
        imageView3.setContentDescription(hd.M0(2131754839, "AccDescrMoreOptions"));
        q2Var2.addView(imageView3, ja.o(54, 56));
        di.q qVar = new di.q(context, 5);
        this.W = qVar;
        qVar.setVisibility(8);
        qVar.setAlpha(0.0f);
        qVar.setTextSize(1, 18.0f);
        qVar.setSingleLine(true);
        qVar.setHint(hd.M0(2131745836, null));
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
                            li.v vVar = l0Var2.f52674w0;
                            if (vVar != null) {
                                vVar.a(l0Var2.f52649c0.getText().toString());
                            }
                            l0Var2.k(false);
                        }
                        return false;
                }
            }
        });
        qVar.addTextChangedListener(new i9(l0Var, 3));
        frameLayout.addView(qVar, ja.e(-1, -1, 119));
        di.q qVar2 = new di.q(context, 6);
        this.f52649c0 = qVar2;
        qVar2.setVisibility(8);
        qVar2.setAlpha(0.0f);
        qVar2.setTextSize(1, 15.66f);
        qVar2.setSingleLine(true);
        this.f52650d0 = gz.f23970p0;
        qVar2.setHint(hd.a0(null, null, 2131754351, d1.a().f52586a));
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
                            li.v vVar = l0Var2.f52674w0;
                            if (vVar != null) {
                                vVar.a(l0Var2.f52649c0.getText().toString());
                            }
                            l0Var2.k(false);
                        }
                        return false;
                }
            }
        });
        frameLayout2.addView(qVar2, ja.d(-1, -1.0f, 119, 48.0f, 0.0f, 12.0f, 0.0f));
        ImageView imageView4 = new ImageView(context);
        this.K = imageView4;
        imageView4.setScaleType(scaleType);
        imageView4.setImageResource(2131231269);
        org.telegram.ui.Cells.y h05 = j6.h0(1090519039, 1, -1);
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
                org.telegram.ui.l0 l0Var2 = l0Var;
                switch (i11) {
                    case 0:
                        int i12 = 1;
                        if (l0Var2.getParent() instanceof ViewGroup) {
                            qa qaVar = new qa(l0Var2, 3);
                            m60 F = m60.F((ViewGroup) l0Var2.getParent(), null, l0Var2.S);
                            F.f37111s = 0;
                            F.S(l0Var2.f52662n0, l0Var2.f52663o0);
                            F.a0(0.0f, -org.telegram.messenger.g0.L(52.0f));
                            F.S = 200;
                            int w10 = j6.w(l0Var2.m0, j6.r1(0.1f, l0Var2.f52662n0));
                            F.f37100l0 = Integer.valueOf(w10);
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
                                F.P(-1);
                                F.T(-986896);
                            } else {
                                F.P(-14737633);
                                F.T(-15592942);
                            }
                            int i17 = l0Var2.f52656h0;
                            if (i17 == 0) {
                                F.c(2131232266, hd.M0(2131747796, null), (Runnable) qaVar.a(3), false);
                                F.c(2131232355, hd.M0(2131745836, null), (Runnable) qaVar.a(1), false);
                                F.l(2131232364, hd.M0(2131745459, null), (Runnable) qaVar.a(2), !l0Var2.f52667r0);
                                F.c(2131232362, hd.M0(2131745495, null), (Runnable) qaVar.a(4), false);
                            } else if (i17 == i16) {
                                if (!l0Var2.f52665q0) {
                                    F.c(2131232266, hd.M0(2131747796, null), (Runnable) qaVar.a(3), false);
                                    F.k();
                                }
                                if (l0Var2.f52664p0) {
                                    F.c(2131232059, hd.M0(2131742921, null), (Runnable) qaVar.a(9), false);
                                }
                                t1 instantViewLoader = l0Var2.getInstantViewLoader();
                                if (instantViewLoader != null && (((!instantViewLoader.f52792g || !instantViewLoader.f52793i) && instantViewLoader.h == null && instantViewLoader.f52794j == null && !instantViewLoader.f52789c) || instantViewLoader.b() != null)) {
                                    F.c(2131231834, hd.M0(2131747788, null), (Runnable) qaVar.a(10), false);
                                    org.telegram.ui.ActionBar.z0 y10 = F.y();
                                    if (instantViewLoader.b() != null) {
                                        z10 = i16;
                                    } else {
                                        z10 = false;
                                    }
                                    y10.setEnabled(z10);
                                    if (y10.isEnabled()) {
                                        f10 = 1.0f;
                                    } else {
                                        f10 = 0.5f;
                                    }
                                    y10.setAlpha(f10);
                                    org.telegram.ui.Wallet.r rVar = new org.telegram.ui.Wallet.r(29, y10, instantViewLoader);
                                    instantViewLoader.f52797m.add(rVar);
                                    F.f37106p = new e1(3, instantViewLoader, rVar);
                                }
                                F.c(2131232342, hd.M0(2131746340, null), (Runnable) qaVar.a(5), false);
                                F.c(2131232355, hd.M0(2131745836, null), (Runnable) qaVar.a(1), false);
                                F.c(2131232352, hd.M0(2131742942, null), (Runnable) qaVar.a(6), false);
                                F.c(2131232364, hd.M0(2131745459, null), (Runnable) qaVar.a(2), false);
                                F.k();
                                if (!za.a(null).isEmpty()) {
                                    F.c(2131231919, hd.M0(2131742920, null), (Runnable) qaVar.a(8), false);
                                }
                                F.c(2131231769, hd.M0(2131742939, null), (Runnable) qaVar.a(7), false);
                                F.c(2131232362, hd.M0(2131745495, null), (Runnable) qaVar.a(4), false);
                            }
                            F.f37106p = new ah0(l0Var2);
                            F.Z();
                            return;
                        }
                        return;
                    default:
                        l0Var2.W.setText("");
                        return;
                }
            }
        });
        addView(imageView4, ja.e(54, 56, 85));
        k70 k70Var = new k70(context);
        this.f52652e0 = k70Var;
        k70Var.setPivotX(0.0f);
        k70Var.setPivotY(org.telegram.messenger.g0.L(2.0f));
        addView(k70Var, ja.e(-1, 2, 87));
        setWillNotDraw(false);
        this.f52646b[0] = new lg.f(l0Var);
        this.f52646b[1] = new lg.f(l0Var);
        int i10 = j6.Gl;
        d(j6.v0(i10), false);
        setMenuColors(j6.v0(i10));
    }

    public final void a(Canvas canvas, float f10, float f11, boolean z10) {
        float f12;
        float max = Math.max(org.telegram.messenger.g0.L(0.66f), 1);
        float f13 = f10 - max;
        float width = getWidth() * this.f52648c;
        RectF rectF = this.f52644a;
        rectF.set(0.0f, 0.0f, getWidth(), f10);
        Paint[] paintArr = this.f52653f;
        int alpha = paintArr[1].getAlpha();
        paintArr[1].setAlpha((int) (alpha * 1.0f));
        canvas.drawRect(rectF, paintArr[1]);
        paintArr[1].setAlpha(alpha);
        int i7 = (this.f52648c > 0.0f ? 1 : (this.f52648c == 0.0f ? 0 : -1));
        float[] fArr = this.d;
        Paint[] paintArr2 = this.f52661n;
        Paint[] paintArr3 = this.h;
        if (i7 > 0) {
            rectF.set(0.0f, 0.0f, fArr[1] * getWidth(), f10);
            int alpha2 = paintArr3[1].getAlpha();
            f12 = 1.0f;
            paintArr3[1].setAlpha((int) ((1.0f - this.f52647b0) * (1.0f - this.V) * alpha2 * 1.0f));
            canvas.drawRect(rectF, paintArr3[1]);
            paintArr3[1].setAlpha(alpha2);
            if (z10) {
                rectF.set(0.0f, f13, width, f13 + max);
                int alpha3 = paintArr2[1].getAlpha();
                paintArr2[1].setAlpha((int) ((1.0f - this.f52647b0) * alpha3 * 1.0f * f11));
                canvas.drawRect(rectF, paintArr2[1]);
                paintArr2[1].setAlpha(alpha3);
            }
        } else {
            f12 = 1.0f;
        }
        float f14 = this.f52648c;
        if (f14 < f12) {
            int r12 = j6.r1((f12 - f14) * f12, 1610612736);
            Paint paint = this.f52666r;
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
        paintArr3[0].setAlpha((int) ((f12 - this.f52647b0) * (f12 - this.V) * (f12 - Utilities.l(this.f52648c * 4.0f)) * alpha5 * f12));
        canvas.drawRect(rectF, paintArr3[0]);
        paintArr3[0].setAlpha(alpha5);
        if (z10) {
            rectF.set(width, f13, getWidth() + width, max + f13);
            int alpha6 = paintArr2[0].getAlpha();
            paintArr2[0].setAlpha((int) ((f12 - this.f52647b0) * alpha6 * f12 * f11));
            canvas.drawRect(rectF, paintArr2[0]);
            paintArr2[0].setAlpha(alpha6);
        }
    }

    public final void b(int i7, int i10) {
        float f10;
        boolean[] zArr = this.f52651e;
        boolean z10 = zArr[i7];
        Paint[] paintArr = this.f52653f;
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
        this.h[i7].setColor(j6.w(i10, j6.r1(org.telegram.messenger.g0.T1(0.07f, 0.2f, f10), f11)));
        this.f52661n[i7].setColor(j6.w(i10, j6.r1(org.telegram.messenger.g0.T1(0.14f, 0.24f, f10), f11)));
        lg.f[] fVarArr = this.f52646b;
        ((g6) fVarArr[i7].d).u(f11);
        fVarArr[i7].f19399a = j6.w(i10, j6.r1(0.6f, f11));
        lg.f fVar = fVarArr[i7];
        ((g6) fVar.f19402e).u(i0.a.f(((u5) fVarArr[i7].f19403f).f39903c, fVar.f19399a, j6.x0(null, j6.f29090q7, false)));
        invalidate();
    }

    public final void c(final int i7, float f10, boolean z10) {
        final float f11;
        boolean[] zArr = this.f52651e;
        if (zArr[2] && this.f52658j0 == i7) {
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
            this.f52675x = f13;
            j6.r1(0.55f, f13);
            this.f52658j0 = i7;
            this.f52677y = i0.a.f(f10, -1, -16777216);
            int f14 = i0.a.f(1.0f - f10, -1, -16777216);
            this.E = f14;
            int i10 = this.f52677y;
            g4 g4Var = ((org.telegram.ui.l0) this).C0;
            k kVar = g4Var.f47325j0;
            if (kVar != null) {
                kVar.c(i10, f14);
            }
            this.f52668s.setColor(this.f52677y);
            this.f52673w.setColor(j6.w(this.f52677y, j6.r1(org.telegram.messenger.g0.T1(0.07f, 0.2f, f10), this.f52675x)));
            int r12 = j6.r1(0.6f, this.E);
            di.q qVar = this.f52649c0;
            qVar.setHintTextColor(r12);
            qVar.setTextColor(this.E);
            qVar.setCursorColor(this.E);
            qVar.setHandlesColor(this.E);
            this.f52652e0.setProgressColor(j6.v0(j6.Il));
            int f15 = i0.a.f(this.f52647b0, this.f52675x, this.E);
            org.telegram.ui.ActionBar.x1 x1Var = this.N;
            x1Var.a(f15);
            x1Var.b(i0.a.f(this.f52647b0, this.f52675x, this.E));
            int i11 = this.f52675x;
            x5 x5Var = this.Q;
            x5Var.f44681c.setColor(i11);
            x5Var.invalidateSelf();
            int i12 = this.f52675x;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            this.S.setColorFilter(new PorterDuffColorFilter(i12, mode));
            this.P.setColorFilter(new PorterDuffColorFilter(this.f52675x, mode));
            this.K.setColorFilter(new PorterDuffColorFilter(this.f52675x, mode));
            int w10 = j6.w(i7, j6.r1(0.22f, this.f52675x));
            this.f52659k0 = w10;
            j6.H1(this.O, w10, true);
            j6.H1(this.R, this.f52659k0, true);
            j6.H1(this.T, this.f52659k0, true);
            j6.H1(this.L, this.f52659k0, true);
            int r13 = j6.r1(0.6f, this.f52675x);
            di.q qVar2 = this.W;
            qVar2.setHintTextColor(r13);
            qVar2.setTextColor(this.f52675x);
            qVar2.setCursorColor(this.f52675x);
            qVar2.setHandlesColor(this.f52675x);
            t3 t3Var = g4Var.L;
            if (t3Var != null) {
                t3Var.u();
            }
            invalidate();
            return;
        }
        ValueAnimator valueAnimator = this.f52660l0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i13 = this.f52658j0;
        this.f52657i0 = i13;
        if (org.telegram.messenger.g0.B(i13) <= 0.721f) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        if (org.telegram.messenger.g0.B(i7) > 0.721f) {
            f12 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f52660l0 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                j1 j1Var = j1.this;
                j1Var.getClass();
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                j1Var.c(i0.a.f(floatValue, j1Var.f52657i0, i7), org.telegram.messenger.g0.T1(f11, f12, floatValue), false);
            }
        });
        this.f52660l0.addListener(new fc(this, i7, f12, 2));
        this.f52660l0.start();
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
        if (this.f52654f0) {
            i7 = org.telegram.messenger.g0.f23603m;
        } else {
            i7 = 0;
        }
        a(canvas, i7 + this.G, 1.0f, this.f52670t0);
        float right = this.I.getRight();
        float left = this.J.getLeft();
        boolean z10 = this.f52654f0;
        if (z10) {
            i10 = org.telegram.messenger.g0.f23603m;
        } else {
            i10 = 0;
        }
        float f10 = i10;
        if (z10) {
            i11 = org.telegram.messenger.g0.f23603m;
        } else {
            i11 = 0;
        }
        float f11 = i11 + this.G;
        int i13 = (this.f52648c > 1.0f ? 1 : (this.f52648c == 1.0f ? 0 : -1));
        lg.f[] fVarArr = this.f52646b;
        if (i13 < 0) {
            canvas.save();
            float width = (getWidth() * this.f52648c) - (Utilities.l(this.f52648c * 2.0f) * org.telegram.messenger.g0.L(30.0f));
            canvas.translate(right + width, f10);
            fVarArr[0].c(canvas, (left - right) - width, f11 - f10, (1.0f - this.V) * (1.0f - this.f52648c));
            canvas.restore();
        }
        if (this.f52648c > 0.0f) {
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, getWidth() * this.f52648c, getHeight());
            canvas.translate(right, f10);
            canvas.translate((1.0f - this.f52648c) * org.telegram.messenger.g0.L(-12.0f), 0.0f);
            float T1 = org.telegram.messenger.g0.T1(1.0f, 0.5f, 1.0f - this.f52648c);
            float f12 = f11 - f10;
            canvas.scale(T1, T1, 0.0f, f12 / 2.0f);
            fVarArr[1].c(canvas, left - right, f12, (1.0f - this.f52647b0) * (1.0f - this.V) * this.f52648c);
            canvas.restore();
        }
        int i14 = (this.f52647b0 > 0.0f ? 1 : (this.f52647b0 == 0.0f ? 0 : -1));
        RectF rectF = this.f52644a;
        if (i14 > 0) {
            Paint paint = this.f52668s;
            int alpha = paint.getAlpha();
            paint.setAlpha((int) (alpha * this.f52647b0));
            float width2 = getWidth();
            if (this.f52654f0) {
                i12 = org.telegram.messenger.g0.f23603m;
            }
            canvas.drawRect(0.0f, 0.0f, width2, i12 + this.G, paint);
            paint.setAlpha(alpha);
            float f13 = (f10 + f11) / 2.0f;
            float L = org.telegram.messenger.g0.L(42.0f) / 2.0f;
            rectF.set(org.telegram.messenger.g0.L(6.0f), f13 - L, org.telegram.messenger.g0.T1(left, getWidth() - org.telegram.messenger.g0.L(6.0f), this.f52647b0), f13 + L);
            Paint paint2 = this.f52673w;
            int alpha2 = paint2.getAlpha();
            paint2.setAlpha((int) (alpha2 * this.f52647b0));
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
            if (motionEvent.getX() > this.I.getRight() && motionEvent.getX() < this.J.getLeft() && !this.U && !this.f52645a0) {
                this.f52678y0 = motionEvent.getX();
                motionEvent.getY();
                this.f52679z0 = System.currentTimeMillis();
                org.telegram.messenger.g0.i3(g1Var, ViewConfiguration.getLongPressTimeout() * 0.8f);
            }
        } else if (motionEvent.getAction() == 2 && ((float) (System.currentTimeMillis() - this.f52679z0)) > ViewConfiguration.getLongPressTimeout() * 0.8f) {
            org.telegram.messenger.g0.r(g1Var);
            this.B0 = true;
            k3 k3Var = ((org.telegram.ui.l0) this).C0.f47336v0[0];
            float l10 = Utilities.l(k3Var.getProgress() + ((motionEvent.getX() - this.f52678y0) / (getWidth() * 0.8f)));
            if (!k3Var.c() && k3Var.f() && (webView = k3Var.f48552f.getWebView()) != null) {
                webView.setScrollProgress(l10);
                k3Var.M.d0();
            }
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            org.telegram.messenger.g0.r(g1Var);
            this.f52679z0 = 0L;
        }
        this.f52678y0 = motionEvent.getX();
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e(int i7, boolean z10) {
        float f10;
        lg.f fVar = this.f52646b[i7];
        if (fVar.f19401c != z10) {
            fVar.f19401c = z10;
            u5 u5Var = (u5) fVar.f19403f;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            u5Var.e(true, f10);
            invalidate();
        }
    }

    public final void f(int i7, String str) {
        lg.f[] fVarArr = this.f52646b;
        CharSequence charSequence = ((g6) fVarArr[i7].f19402e).f34836i;
        if (charSequence != null && TextUtils.equals(charSequence.toString(), str)) {
            return;
        }
        ((g6) fVarArr[i7].f19402e).t(org.telegram.messenger.j6.m(str, ((g6) fVarArr[i7].f19402e).f34827a.getFontMetricsInt(), false, null, 0), false, true);
    }

    public final void g(int i7, String str, boolean z10) {
        lg.f[] fVarArr = this.f52646b;
        CharSequence charSequence = ((g6) fVarArr[i7].d).f34836i;
        if (charSequence != null && TextUtils.equals(charSequence.toString(), str)) {
            return;
        }
        ((g6) fVarArr[i7].d).t(org.telegram.messenger.j6.m(str, ((g6) fVarArr[i7].d).f34827a.getFontMetricsInt(), false, null, 0), z10, true);
    }

    public int getBackgroundColor() {
        return this.f52658j0;
    }

    public t1 getInstantViewLoader() {
        return null;
    }

    public int getTextColor() {
        return this.f52675x;
    }

    public String getTitle() {
        CharSequence charSequence = ((g6) this.f52646b[0].d).f34836i;
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
        ValueAnimator valueAnimator = this.f52671u0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.U = z10;
        di.q qVar = this.W;
        boolean z11 = false;
        qVar.setVisibility(0);
        float f11 = 0.0f;
        if (!this.f52672v0 && !z10) {
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
        this.f52671u0 = ofFloat;
        ofFloat.addUpdateListener(new j3(this, 23));
        this.f52671u0.addListener(new z20(13, this, z10));
        this.f52671u0.setInterpolator(er.h);
        this.f52671u0.setDuration(320L);
        this.f52671u0.start();
        boolean z12 = !z10;
        org.telegram.messenger.g0.U3(this.P, z12, true);
        org.telegram.messenger.g0.U3(this.S, z12, true);
        if (qVar.length() > 0 && this.U) {
            z11 = true;
        }
        org.telegram.messenger.g0.U3(this.K, z11, true);
    }

    public final void i() {
        lg.f[] fVarArr = this.f52646b;
        lg.f fVar = fVarArr[0];
        fVarArr[0] = fVarArr[1];
        fVarArr[1] = fVar;
        float[] fArr = this.d;
        float f10 = fArr[0];
        fArr[0] = fArr[1];
        fArr[1] = f10;
        Paint[] paintArr = this.f52653f;
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
        if (this.f52654f0) {
            i11 = org.telegram.messenger.g0.f23603m;
        } else {
            i11 = 0;
        }
        super.onMeasure(i7, i20.B(56.0f, i11, 1073741824));
    }

    public void setBackButton(boolean z10) {
        float f10;
        this.f52672v0 = z10;
        if (!this.U && !this.f52645a0) {
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            this.N.c(true, f10);
        }
    }

    public void setBackButtonCached(boolean z10) {
        this.f52672v0 = z10;
    }

    public void setHasForward(boolean z10) {
        this.f52664p0 = z10;
    }

    public void setHeight(int i7) {
        if (this.G != i7) {
            this.G = i7;
            float pow = (float) Math.pow(i7 / org.telegram.messenger.g0.L(56.0f), 0.5d);
            this.H = pow;
            q2 q2Var = this.I;
            q2Var.setScaleX(pow);
            q2Var.setScaleY(this.H);
            q2Var.setTranslationX((1.0f - this.H) * org.telegram.messenger.g0.L(42.0f));
            q2Var.setTranslationY((1.0f - this.H) * org.telegram.messenger.g0.L(-12.0f));
            float f10 = this.H;
            q2 q2Var2 = this.J;
            q2Var2.setScaleX(f10);
            q2Var2.setScaleY(this.H);
            q2Var2.setTranslationX((1.0f - this.H) * (-org.telegram.messenger.g0.L(42.0f)));
            q2Var2.setTranslationY((1.0f - this.H) * org.telegram.messenger.g0.L(-12.0f));
            this.f52652e0.setTranslationY(this.G - org.telegram.messenger.g0.L(56.0f));
            invalidate();
        }
    }

    public void setIsLocal(boolean z10) {
        this.f52667r0 = z10;
    }

    public void setIsTonsite(boolean z10) {
        this.f52665q0 = z10;
    }

    public void setMenuColors(int i7) {
        int i10;
        boolean z10 = false;
        if (s4.f(s4.e(i7))[0] < 0.5d) {
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
        this.f52662n0 = i11;
        this.f52663o0 = j6.r1(0.6f, i11);
    }

    public void setMenuListener(z10 z10Var) {
        this.f52655g0 = z10Var;
    }

    public void setMenuType(int i7) {
        if (this.f52656h0 != i7) {
            this.f52656h0 = i7;
        }
    }

    public void setProgress(float f10) {
        this.d[0] = f10;
        invalidate();
    }

    public void setTransitionProgress(float f10) {
        this.f52648c = f10;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return true;
    }

    public void setIsLoaded(boolean z10) {
    }
}
