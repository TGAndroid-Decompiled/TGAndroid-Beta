package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public class vf0 extends Dialog implements org.telegram.messenger.cs {
    public float E;
    public final jf0 F;
    public final qf0 G;
    public final jf0 H;
    public long I;
    public org.telegram.ui.Components.e5 J;
    public final rf0 K;
    public final gi.w L;
    public final org.telegram.ui.Components.p90 M;
    public final ArrayList N;
    public int O;
    public final a0.h P;
    public org.telegram.ui.Cells.q1 Q;
    public int R;
    public org.telegram.ui.Components.ve S;
    public final Paint T;
    public org.telegram.ui.Components.e U;
    public org.telegram.ui.Components.jd V;
    public org.telegram.ui.Components.bg W;
    public lf0 X;
    public int Y;
    public ViewGroup Z;
    public final Context f50472a;
    public final kf0 f50473a0;
    public final org.telegram.ui.ActionBar.e6 f50474b;
    public boolean f50475b0;
    public final int f50476c;
    public float f50477c0;
    public i0.b d;
    public FrameLayout f50478d0;
    public Bitmap f50479e;
    public mf0 f50480e0;
    public BitmapShader f50481f;
    public boolean f50482f0;
    public boolean f50483g0;
    public Paint h;
    public boolean f50484h0;
    public final yh.e f50485i0;
    public final si.b f50486j0;
    public final eh.c f50487k0;
    public RectF f50488l0;
    public boolean m0;
    public Matrix f50489n;
    public boolean f50490n0;
    public final int[] f50491o0;
    public boolean f50492p0;
    public boolean f50493q0;
    public boolean f50494r;
    public org.telegram.ui.Cells.q1 f50495r0;
    public boolean f50496s;
    public float f50497s0;
    public float f50498t0;
    public final Rect f50499u0;
    public ValueAnimator f50500v0;
    public boolean f50501w;
    public boolean f50502w0;
    public boolean f50503x;
    public org.telegram.ui.Cells.q1 f50504x0;
    public boolean f50505y;
    public org.telegram.ui.Components.ly0 f50506y0;
    public Paint f50507z0;

    public vf0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, 2131755352);
        int i3 = org.telegram.messenger.h10.f22829t0;
        this.f50476c = i3;
        this.d = i0.b.f14494e;
        this.N = new ArrayList();
        this.P = new a0.h();
        this.T = new Paint(1);
        this.f50491o0 = new int[2];
        this.f50493q0 = false;
        this.f50499u0 = new Rect();
        this.f50472a = context;
        this.f50474b = e6Var;
        org.telegram.messenger.g0.S(getWindow());
        jf0 jf0Var = new jf0(this, context, 1);
        this.F = jf0Var;
        this.f50485i0 = yh.e.d(1, jf0Var, jf0Var);
        jf0Var.setOnClickListener(new View.OnClickListener(this) {
            public final vf0 f45917b;

            {
                this.f45917b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f45917b.onBackPressed();
                        return;
                    default:
                        this.f45917b.onBackPressed();
                        return;
                }
            }
        });
        jf0Var.getViewTreeObserver().addOnGlobalFocusChangeListener(new ViewTreeObserver.OnGlobalFocusChangeListener() {
            @Override
            public final void onGlobalFocusChanged(View view, View view2) {
                vf0 vf0Var = vf0.this;
                if (!vf0Var.f50492p0 && (view2 instanceof EditText)) {
                    org.telegram.messenger.g0.v1(vf0Var.S);
                    org.telegram.messenger.g0.i3(new ff0(vf0Var, (EditText) view2, 0), 200L);
                }
            }
        });
        si.b bVar = new si.b();
        this.f50486j0 = bVar;
        eh.c cVar = new eh.c(bVar, bVar, bVar);
        this.f50487k0 = cVar;
        cVar.h = new kh.k(jf0Var);
        cVar.f9986i = jf0Var;
        qf0 qf0Var = new qf0(this, context, e6Var);
        this.G = qf0Var;
        qf0Var.setClipToPadding(false);
        jf0Var.addView(qf0Var, b8.mf.e(-1, -1, 119));
        f fVar = new f(this, 25);
        WeakHashMap weakHashMap = r0.i0.f54015a;
        r0.a0.i(jf0Var, fVar);
        rf0 rf0Var = new rf0(this, context, e6Var);
        this.K = rf0Var;
        rf0Var.setOnClickListener(new View.OnClickListener(this) {
            public final vf0 f45917b;

            {
                this.f45917b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f45917b.onBackPressed();
                        return;
                    default:
                        this.f45917b.onBackPressed();
                        return;
                }
            }
        });
        rf0Var.setOnItemClickListener(new h(this, 17));
        rf0Var.setOnScrollListener(new h3(this, 19));
        rf0Var.setItemAnimator(new ni.l(null, rf0Var, e6Var));
        org.telegram.ui.Components.p90 p90Var = new org.telegram.ui.Components.p90(this, 1);
        this.M = p90Var;
        p90Var.O = new ai.g2(this, 14);
        rf0Var.setLayoutManager(p90Var);
        rf0Var.i(new ei.l(13));
        gi.w wVar = new gi.w(this, context, e6Var, 1);
        this.L = wVar;
        rf0Var.setAdapter(wVar);
        rf0Var.setVerticalScrollBarEnabled(false);
        rf0Var.setOverScrollMode(2);
        qf0Var.addView(rf0Var, b8.mf.c(-2.0f, -1));
        jf0 jf0Var2 = new jf0(this, context, 0);
        this.H = jf0Var2;
        jf0Var.addView(jf0Var2, b8.mf.c(-1.0f, -1));
        this.f50473a0 = new kf0(this, jf0Var2, i3);
    }

    public final void c(org.telegram.ui.ActionBar.d2 d2Var) {
        dh.v vVar;
        if (this.f50480e0 == null && d2Var != null) {
            int i3 = this.f50476c;
            org.telegram.messenger.hp.s1(i3).E0();
            FrameLayout frameLayout = new FrameLayout(this.f50472a);
            this.f50478d0 = frameLayout;
            frameLayout.setClipChildren(false);
            this.f50478d0.setClipToPadding(false);
            this.f50478d0.setPadding(0, 0, 0, org.telegram.messenger.g0.L(24.0f));
            ?? li0Var = new org.telegram.ui.Components.li0(5, this.f50476c, getContext(), null, this.f50474b);
            this.f50480e0 = li0Var;
            li0Var.setClipChildren(false);
            this.f50480e0.setClipToPadding(false);
            this.f50480e0.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(22.0f));
            this.f50480e0.setDelegate(new of0(this, d2Var));
            this.f50480e0.setTop(false);
            this.f50480e0.setClipChildren(false);
            this.f50480e0.setClipToPadding(false);
            this.f50480e0.setVisibility(0);
            this.f50480e0.setHint(org.telegram.messenger.bd.M0(2131754443, null));
            this.f50480e0.setBubbleOffset(org.telegram.messenger.g0.L(-25.0f));
            this.f50480e0.setMiniBubblesOffset(org.telegram.messenger.g0.L(2.0f));
            this.G.addView(this.f50478d0, b8.mf.d(-2, 300.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
            this.f50478d0.addView(this.f50480e0, b8.mf.d(-1, 116.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
            this.f50480e0.setScaleY(0.4f);
            this.f50480e0.setScaleX(0.4f);
            this.f50480e0.setAlpha(0.0f);
            TLRPC.messages_AvailableEffects messages_availableeffects = org.telegram.messenger.hp.s1(i3).f23026h8;
            if (messages_availableeffects != null && !messages_availableeffects.effects.isEmpty()) {
                s();
            } else {
                org.telegram.messenger.hs.f(i3).c(this, org.telegram.messenger.hs.f23316u3);
            }
            mf0 mf0Var = this.f50480e0;
            if (mf0Var != null && !mf0Var.f35753h1) {
                mf0Var.f35753h1 = true;
                mf0Var.f35755i1 = true;
                dh.a0 a0Var = mf0Var.f35778y0;
                if (a0Var != null && (vVar = a0Var.f8941m) != null && !vVar.M1) {
                    vVar.M1 = true;
                    vVar.N1 = true;
                    e01 e01Var = vVar.f45456i0;
                    if (e01Var != null) {
                        e01Var.invalidate();
                    }
                    uz0 uz0Var = vVar.f45458j0;
                    if (uz0Var != null) {
                        uz0Var.invalidate();
                    }
                }
            }
            new gi.p3(this.F, false, new s3(this, 12));
        }
    }

    public final void d(Runnable runnable, boolean z10) {
        boolean z11;
        mf0 mf0Var;
        ViewGroup viewGroup;
        ValueAnimator valueAnimator = this.f50500v0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (z10 && (viewGroup = this.Z) != null && (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            org.telegram.ui.ActionBar.f1.i((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.Z);
        }
        float f10 = 0.0f;
        if (!z10 && (mf0Var = this.f50480e0) != null && this.f50482f0) {
            mf0Var.e();
            if (this.f50480e0.getReactionsWindow() != null && this.f50480e0.getReactionsWindow().f8931a != null) {
                this.f50480e0.getReactionsWindow().f8931a.animate().alpha(0.0f).setDuration(180L).start();
            }
            this.f50480e0.animate().alpha(0.01f).translationY(-org.telegram.messenger.g0.L(12.0f)).scaleX(0.6f).scaleY(0.6f).setDuration(180L).start();
        }
        this.f50501w = true;
        this.f50496s = !z10;
        this.K.invalidate();
        this.f50503x = true;
        this.f50505y = true;
        float f11 = this.E;
        if (z10) {
            f10 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f50500v0 = ofFloat;
        ofFloat.addUpdateListener(new dh.u(10, this, z11));
        this.f50500v0.addListener(new org.telegram.ui.ActionBar.f(this, z10, z11, runnable));
        this.f50500v0.setInterpolator(org.telegram.ui.Components.xq.h);
        this.f50500v0.setDuration(350L);
        this.f50500v0.start();
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        TLRPC.messages_AvailableEffects messages_availableeffects;
        if (i3 == org.telegram.messenger.hs.f23316u3 && (messages_availableeffects = org.telegram.messenger.hp.s1(this.f50476c).f23026h8) != null && !messages_availableeffects.effects.isEmpty()) {
            s();
        }
    }

    @Override
    public final void dismiss() {
        if (this.f50493q0) {
            return;
        }
        this.f50493q0 = true;
        lf0 lf0Var = this.X;
        if (lf0Var != null) {
            lf0Var.invalidate();
        }
        org.telegram.ui.Components.bg bgVar = this.W;
        if (bgVar != null) {
            bgVar.invalidate();
        }
        d(new ef0(this, 2), false);
        this.F.invalidate();
        org.telegram.messenger.hs.f(this.f50476c).n(this, org.telegram.messenger.hs.f23316u3);
    }

    public final void e(org.telegram.messenger.zi ziVar) {
        org.telegram.messenger.ui k10 = k(ziVar);
        if (k10 != null) {
            k10.a();
            ArrayList arrayList = k10.d;
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                f((org.telegram.messenger.zi) obj);
            }
            return;
        }
        f(ziVar);
    }

    public final void f(org.telegram.messenger.zi ziVar) {
        org.telegram.ui.Cells.q1 q1Var;
        rf0 rf0Var = this.K;
        if (rf0Var == null) {
            return;
        }
        int i3 = 0;
        int i10 = 0;
        while (true) {
            if (i10 < rf0Var.getChildCount()) {
                View childAt = rf0Var.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.q1) {
                    q1Var = (org.telegram.ui.Cells.q1) childAt;
                    if (q1Var.getMessageObject() == ziVar) {
                        break;
                    }
                }
                i10++;
            } else {
                q1Var = null;
                break;
            }
        }
        org.telegram.ui.Cells.q1 q1Var2 = q1Var;
        int i11 = -1;
        while (true) {
            ArrayList arrayList = this.N;
            if (i3 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i3) == ziVar) {
                i11 = (arrayList.size() - 1) - i3;
            }
            i3++;
        }
        if (q1Var2 == null) {
            rf0Var.getAdapter().g(i11);
            return;
        }
        ziVar.K1 = true;
        q1Var2.u3(ziVar, q1Var2.getCurrentMessagesGroup(), q1Var2.G2(), q1Var2.H2(), q1Var2.z2(), false);
        rf0Var.getAdapter().g(i11);
    }

    public final void g(boolean z10) {
        this.f50494r = z10;
        dismiss();
    }

    public final void h() {
        if (this.f50493q0) {
            return;
        }
        this.f50493q0 = true;
        yh.e.f(false);
        yh.e eVar = this.f50485i0;
        if (eVar != null) {
            eVar.b(this.F);
        }
        super.dismiss();
        org.telegram.messenger.hs.f(this.f50476c).n(this, org.telegram.messenger.hs.f23316u3);
    }

    public final void i(Canvas canvas, float f10, float f11, float f12, float f13) {
        if (this.f50506y0 != null && this.f50507z0 != null) {
            float f14 = (f10 + f12) / 2.0f;
            float f15 = (f11 + f13) / 2.0f;
            float L = org.telegram.messenger.g0.L(28.0f) + this.f50506y0.f35918c;
            RectF rectF = org.telegram.messenger.g0.P;
            float f16 = L / 2.0f;
            float f17 = f14 - f16;
            float L2 = org.telegram.messenger.g0.L(32.0f) / 2.0f;
            rectF.set(f17, f15 - L2, f14 + f16, f15 + L2);
            canvas.save();
            canvas.drawRoundRect(rectF, L2, L2, this.f50507z0);
            this.f50506y0.c(f17 + org.telegram.messenger.g0.L(14.0f), f15, 1.0f, -1, canvas);
            canvas.restore();
        }
    }

    @Override
    public final boolean isShowing() {
        return !this.f50493q0;
    }

    public final long j() {
        org.telegram.messenger.zi messageObject;
        if (!this.f50490n0 && this.f50480e0 != null) {
            if (this.f50488l0 != null) {
                this.f50490n0 = true;
                return this.I;
            }
            org.telegram.ui.Cells.q1 q1Var = this.Q;
            if (q1Var != null && (messageObject = q1Var.getMessageObject()) != null) {
                TLRPC.Message message = messageObject.f26868k;
                if ((message.flags2 & 4) != 0) {
                    this.f50490n0 = true;
                    return message.effect;
                }
                return 0L;
            }
            return 0L;
        }
        return 0L;
    }

    public final org.telegram.messenger.ui k(org.telegram.messenger.zi ziVar) {
        if (ziVar.d1() == 0) {
            return null;
        }
        org.telegram.messenger.ui uiVar = (org.telegram.messenger.ui) this.P.f(ziVar.d1());
        if (uiVar != null && (uiVar.d.size() <= 1 || uiVar.d(ziVar) == null)) {
            return null;
        }
        return uiVar;
    }

    public final void m(boolean z10) {
        org.telegram.ui.Components.p90 p90Var;
        int i3;
        rf0 rf0Var = this.K;
        if (rf0Var != null && rf0Var.getAdapter() != null && (p90Var = this.M) != null) {
            int b10 = rf0Var.getAdapter().b();
            if (z10) {
                if (b10 > 10) {
                    i3 = b10 % 10;
                } else {
                    i3 = 0;
                }
            } else {
                i3 = b10 - 1;
            }
            p90Var.i1(i3, org.telegram.messenger.g0.L(12.0f), z10);
            this.f50502w0 = z10;
        }
    }

    public final void n(long j10) {
        int i3;
        org.telegram.messenger.zi ziVar;
        TLRPC.TL_availableEffect Z0;
        this.I = j10;
        boolean i10 = this.P.i();
        ArrayList arrayList = this.N;
        if (!i10 && arrayList.size() >= 10) {
            i3 = arrayList.size() % 10;
        } else {
            i3 = 0;
        }
        if (i3 >= 0 && i3 < arrayList.size()) {
            ziVar = (org.telegram.messenger.zi) arrayList.get(i3);
        } else {
            ziVar = null;
        }
        if (ziVar != null) {
            TLRPC.Message message = ziVar.f26868k;
            message.flags2 |= 4;
            message.effect = j10;
        }
        if (this.f50480e0 != null && (Z0 = org.telegram.messenger.hp.s1(this.f50476c).Z0(j10)) != null) {
            this.f50480e0.setSelectedReactionAnimated(dh.n0.e(Z0));
        }
    }

    public final void o(org.telegram.ui.Components.f60 f60Var) {
        int i3 = org.telegram.ui.ActionBar.k6.E8;
        org.telegram.ui.ActionBar.e6 e6Var = this.f50474b;
        f60Var.T(org.telegram.ui.ActionBar.k6.r1(0.06f, org.telegram.ui.ActionBar.k6.w0(i3, e6Var)));
        f60Var.Q(this.f50487k0, b8.cd.k(e6Var), false);
        ViewGroup viewGroup = f60Var.A;
        this.Z = viewGroup;
        this.G.addView(viewGroup, b8.mf.c(-2.0f, -2));
    }

    @Override
    public final void onBackPressed() {
        if (this.f50475b0) {
            org.telegram.messenger.g0.v1(getCurrentFocus());
            this.f50475b0 = false;
            return;
        }
        mf0 mf0Var = this.f50480e0;
        if (mf0Var != null && mf0Var.getReactionsWindow() != null) {
            if (!this.f50480e0.getReactionsWindow().C) {
                this.f50480e0.getReactionsWindow().d();
                return;
            }
            return;
        }
        this.f50490n0 = true;
        super.onBackPressed();
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(2131755178);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        jf0 jf0Var = this.F;
        setContentView(jf0Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.softInputMode = 16;
        attributes.flags = (attributes.flags & (-3)) | (-1945959040);
        window.setAttributes(attributes);
        jf0Var.setSystemUiVisibility(256);
        org.telegram.messenger.g0.o3(jf0Var, !org.telegram.ui.ActionBar.k6.I.q());
    }

    public final void p(ArrayList arrayList) {
        a0.h hVar;
        int i3;
        int i10;
        org.telegram.ui.Cells.q1 q1Var;
        ArrayList arrayList2;
        org.telegram.messenger.ui uiVar;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int size = arrayList.size();
            hVar = this.P;
            if (i12 >= size) {
                break;
            }
            org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) arrayList.get(i12);
            if (ziVar.A2()) {
                org.telegram.messenger.ui uiVar2 = (org.telegram.messenger.ui) hVar.f(ziVar.e1());
                if (uiVar2 == null) {
                    uiVar2 = new org.telegram.messenger.ui();
                    uiVar2.f25710n = false;
                    long d12 = ziVar.d1();
                    uiVar2.f25699a = d12;
                    hVar.k(uiVar2, d12);
                }
                ArrayList arrayList3 = uiVar2.d;
                if (uiVar2.d(ziVar) == null) {
                    int i13 = 0;
                    while (true) {
                        if (i13 < arrayList3.size()) {
                            if (((org.telegram.messenger.zi) arrayList3.get(i13)).f1() == ziVar.f1()) {
                                break;
                            }
                            i13++;
                        } else {
                            arrayList3.add(ziVar);
                            break;
                        }
                    }
                }
            } else if (ziVar.e1() != 0) {
                ziVar.f26868k.grouped_id = 0L;
                ziVar.f26840e = 0L;
            }
            i12++;
        }
        for (int i14 = 0; i14 < hVar.m(); i14++) {
            ((org.telegram.messenger.ui) hVar.n(i14)).a();
        }
        ArrayList arrayList4 = this.N;
        arrayList4.addAll(arrayList);
        int i15 = 0;
        while (i15 < arrayList4.size()) {
            int i16 = this.O;
            org.telegram.messenger.zi ziVar2 = (org.telegram.messenger.zi) arrayList4.get(i15);
            if (getContext() == null) {
                i3 = i15;
                i10 = 0;
            } else {
                if (this.f50504x0 == null) {
                    this.f50504x0 = new org.telegram.ui.Cells.q1(getContext(), this.f50476c, true, null, this.f50474b);
                }
                org.telegram.ui.Cells.q1 q1Var2 = this.f50504x0;
                q1Var2.f29900e6 = false;
                q1Var2.f29928g6 = false;
                q1Var2.f29941h6 = false;
                q1Var2.f29951i6 = false;
                q1Var2.f29964j6 = false;
                org.telegram.messenger.ui uiVar3 = (org.telegram.messenger.ui) hVar.f(ziVar2.d1());
                ei.c3 c3Var = q1Var2.U0;
                c3Var.f21260p0 = true;
                ImageReceiver imageReceiver = q1Var2.f30165z7;
                imageReceiver.f21260p0 = true;
                ImageReceiver imageReceiver2 = q1Var2.S7;
                imageReceiver2.f21260p0 = true;
                ImageReceiver imageReceiver3 = q1Var2.E7;
                imageReceiver3.f21260p0 = true;
                if (uiVar3 != null) {
                    ArrayList arrayList5 = uiVar3.d;
                    if (arrayList5.size() != 1) {
                        if (arrayList5.size() != uiVar3.f25703f.size()) {
                            uiVar3.a();
                        }
                        q1Var2.Sc = 0;
                        int i17 = 0;
                        i10 = 0;
                        while (i17 < arrayList5.size()) {
                            org.telegram.messenger.zi ziVar3 = (org.telegram.messenger.zi) arrayList5.get(i17);
                            org.telegram.messenger.ri d = uiVar3.d(ziVar3);
                            if (d != null && (d.f25149l & 4) != 0) {
                                org.telegram.ui.Cells.q1 q1Var3 = q1Var2;
                                arrayList2 = arrayList5;
                                uiVar = uiVar3;
                                q1Var3.t3(ziVar3, uiVar, false, false, false, false);
                                q1Var = q1Var3;
                                i10 += q1Var.f29848a7;
                            } else {
                                org.telegram.messenger.ui uiVar4 = uiVar3;
                                q1Var = q1Var2;
                                arrayList2 = arrayList5;
                                uiVar = uiVar4;
                            }
                            i17++;
                            org.telegram.messenger.ui uiVar5 = uiVar;
                            arrayList5 = arrayList2;
                            q1Var2 = q1Var;
                            uiVar3 = uiVar5;
                        }
                        i3 = i15;
                    }
                }
                i3 = i15;
                q1Var2.t3(ziVar2, uiVar3, false, false, false, false);
                c3Var.f21260p0 = false;
                imageReceiver.f21260p0 = false;
                imageReceiver2.f21260p0 = false;
                imageReceiver3.f21260p0 = false;
                q1Var2.N3();
                i10 = q1Var2.f29848a7;
            }
            this.O = Math.max(i16, i10);
            i15 = i3 + 1;
        }
        rf0 rf0Var = this.K;
        rf0Var.getAdapter().f();
        int b10 = rf0Var.getAdapter().b();
        if (b10 > 10) {
            i11 = b10 % 10;
        }
        this.M.i1(i11, org.telegram.messenger.g0.L(12.0f), true);
    }

    public final org.telegram.ui.Components.bg q(org.telegram.ui.Components.bg bgVar, boolean z10, View.OnClickListener onClickListener) {
        this.W = bgVar;
        int[] iArr = this.f50491o0;
        bgVar.getLocationOnScreen(iArr);
        lf0 lf0Var = new lf0(this, getContext(), bgVar.f32181b, this.f50474b, bgVar, z10);
        this.X = lf0Var;
        lf0Var.setScaleX(this.W.getScaleX());
        this.X.setScaleY(this.W.getScaleY());
        org.telegram.ui.Components.bg bgVar2 = this.W;
        lf0 lf0Var2 = this.X;
        lf0Var2.F = bgVar2.F;
        lf0Var2.f32192i0 = bgVar2.f32192i0;
        lf0Var2.f32185d0.t(bgVar2.f32185d0.f33989i, false, true);
        lf0Var2.f32187e0 = bgVar2.f32187e0;
        lf0Var2.setEmoji(bgVar2.f32188f.f33286f[0]);
        lf0Var2.i(bgVar2.f32199s, bgVar2.f32198r, true);
        lf0Var2.Q.e(true, bgVar2.Q.f38645c);
        lf0Var2.f32202y.e(true, bgVar2.f32202y.f38645c);
        int i3 = bgVar2.J;
        int i10 = bgVar2.K;
        lf0Var2.J = i3;
        lf0Var2.K = i10;
        float f10 = bgVar2.N;
        float f11 = bgVar2.O;
        lf0Var2.N = f10;
        lf0Var2.O = f11;
        this.X.Q.e(true, bgVar.Q.f38645c);
        this.X.setOnClickListener(onClickListener);
        this.G.addView(this.X, new ViewGroup.LayoutParams(bgVar.getWidth(), bgVar.getHeight()));
        org.telegram.ui.Components.bg bgVar3 = this.W;
        bgVar.getHeight();
        this.Y = bgVar3.m();
        int i11 = iArr[0];
        int width = this.W.getWidth();
        org.telegram.ui.Components.bg bgVar4 = this.W;
        bgVar.getHeight();
        iArr[0] = org.telegram.messenger.camera.q.D(6.0f, width - bgVar4.m(), i11);
        return this.X;
    }

    public final void r(long j10) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        boolean z10;
        int i3 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        org.telegram.ui.Components.ly0 ly0Var = null;
        if (i3 > 0) {
            ly0Var = new org.telegram.ui.Components.ly0(ci.wb.a1(false, org.telegram.messenger.bd.H(',', "UnlockPaidContent", (int) j10), 0.7f, null), 14.0f, org.telegram.messenger.g0.o());
        }
        this.f50506y0 = ly0Var;
        if (this.f50507z0 == null) {
            Paint paint = new Paint(1);
            this.f50507z0 = paint;
            paint.setColor(1073741824);
        }
        this.K.invalidate();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.N;
            if (i10 < arrayList.size()) {
                org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) arrayList.get(i10);
                if (ziVar != null && (message = ziVar.f26868k) != null && (messageMedia = message.media) != null) {
                    if (i3 > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    messageMedia.spoiler = z10;
                }
                i10++;
            } else {
                this.L.f();
                return;
            }
        }
    }

    public final void s() {
        if (this.f50482f0) {
            return;
        }
        this.f50483g0 = false;
        this.f50482f0 = true;
        this.f50480e0.p(null, null, true);
        this.f50480e0.animate().scaleY(1.0f).scaleX(1.0f).alpha(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.xq.h).start();
        this.f50480e0.r(false);
    }

    @Override
    public final void show() {
        if (!org.telegram.messenger.g0.M1(getContext())) {
            return;
        }
        yh.e.f(true);
        super.show();
        final float alpha = this.W.getAlpha();
        org.telegram.ui.Components.bg bgVar = this.W;
        if (bgVar != null) {
            bgVar.setAlpha(0.0f);
        }
        org.telegram.ui.Components.nk0.d(new org.telegram.messenger.n10() {
            @Override
            public final void a(Object obj, Object obj2) {
                vf0 vf0Var = vf0.this;
                si.b bVar = vf0Var.f50486j0;
                Bitmap bitmap = (Bitmap) obj;
                Bitmap bitmap2 = (Bitmap) obj2;
                org.telegram.ui.Components.bg bgVar2 = vf0Var.W;
                if (bgVar2 != null) {
                    bgVar2.setAlpha(alpha);
                }
                vf0Var.f50479e = bitmap;
                Paint paint = new Paint(1);
                vf0Var.h = paint;
                Bitmap bitmap3 = vf0Var.f50479e;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                vf0Var.f50481f = bitmapShader;
                paint.setShader(bitmapShader);
                vf0Var.f50489n = new Matrix();
                bVar.a(bitmap2);
                jh.d.c(bVar, vf0Var.F);
                ViewGroup viewGroup = vf0Var.Z;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        });
        jf0 jf0Var = this.H;
        if (jf0Var != null) {
            jf0Var.bringToFront();
        }
        d(null, true);
    }

    public void l(long j10) {
    }
}
