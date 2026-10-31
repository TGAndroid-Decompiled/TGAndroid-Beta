package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class vj extends om {
    public final o1.j A3;
    public boolean B3;
    public final Path C3;
    public boolean D3;
    public int E3;
    public final un F3;
    public int f42735f3;
    public final ArrayList f42736g3;
    public final ArrayList f42737h3;
    public final ArrayList f42738i3;
    public final ArrayList f42739j3;
    public final ArrayList f42740k3;
    public int f42741l3;
    public int f42742m3;
    public int f42743n3;
    public long f42744o3;
    public float f42745p3;
    public float f42746q3;
    public boolean f42747r3;
    public final float f42748s3;
    public final Paint f42749t3;
    public final Paint f42750u3;
    public final o1.i f42751v3;
    public final o1.j f42752w3;
    public final o1.i f42753x3;
    public final o1.j y3;
    public final o1.i f42754z3;

    public vj(un unVar, Context context, sn snVar) {
        super(unVar, context, snVar);
        this.F3 = unVar;
        this.f42736g3 = new ArrayList();
        this.f42737h3 = new ArrayList();
        this.f42738i3 = new ArrayList();
        this.f42739j3 = new ArrayList();
        this.f42740k3 = new ArrayList(10);
        this.f42748s3 = 2000.0f;
        Paint paint = new Paint(1);
        this.f42749t3 = paint;
        Paint paint2 = new Paint(1);
        this.f42750u3 = paint2;
        o1.i iVar = new o1.i(0.0f);
        this.f42751v3 = iVar;
        o1.j jVar = new o1.j(iVar);
        jVar.h = 0.0f;
        jVar.f13952g = 2000.0f;
        jVar.f13957m = org.telegram.ui.Cells.f1.p(0.0f, 1500.0f, 1.0f);
        jVar.b(new o1.g(this) {
            public final vj f41850b;

            {
                this.f41850b = this;
            }

            @Override
            public final void a(o1.j jVar2, float f7, float f10) {
                switch (r2) {
                    case 0:
                        this.f41850b.invalidate();
                        return;
                    case 1:
                        this.f41850b.invalidate();
                        return;
                    default:
                        this.f41850b.invalidate();
                        return;
                }
            }
        });
        this.f42752w3 = jVar;
        o1.i iVar2 = new o1.i(0.0f);
        this.f42753x3 = iVar2;
        o1.j jVar2 = new o1.j(iVar2);
        jVar2.h = 0.0f;
        jVar2.f13957m = org.telegram.ui.Cells.f1.p(0.0f, 400.0f, 0.5f);
        jVar2.b(new o1.g(this) {
            public final vj f41850b;

            {
                this.f41850b = this;
            }

            @Override
            public final void a(o1.j jVar22, float f7, float f10) {
                switch (r2) {
                    case 0:
                        this.f41850b.invalidate();
                        return;
                    case 1:
                        this.f41850b.invalidate();
                        return;
                    default:
                        this.f41850b.invalidate();
                        return;
                }
            }
        });
        this.y3 = jVar2;
        o1.i iVar3 = new o1.i(0.0f);
        this.f42754z3 = iVar3;
        o1.j jVar3 = new o1.j(iVar3);
        jVar3.h = 0.0f;
        jVar3.f13957m = org.telegram.ui.Cells.f1.p(0.0f, 200.0f, 1.0f);
        jVar3.b(new o1.g(this) {
            public final vj f41850b;

            {
                this.f41850b = this;
            }

            @Override
            public final void a(o1.j jVar22, float f7, float f10) {
                switch (r2) {
                    case 0:
                        this.f41850b.invalidate();
                        return;
                    case 1:
                        this.f41850b.invalidate();
                        return;
                    default:
                        this.f41850b.invalidate();
                        return;
                }
            }
        });
        this.A3 = jVar3;
        this.C3 = new Path();
        this.E3 = 0;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
    }

    public final void A1(Canvas canvas, RectF rectF) {
        float f7;
        boolean z10;
        float f10;
        boolean z11;
        float f11;
        ArrayList arrayList;
        float f12;
        float f13;
        ArrayList arrayList2 = this.f42736g3;
        int size = arrayList2.size();
        un unVar = this.F3;
        boolean z12 = true;
        boolean z13 = false;
        if (size > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) arrayList2.get(i10);
                if (!un.k2(unVar, q1Var, rectF)) {
                    canvas.save();
                    canvas.translate(q1Var.P1(false) + q1Var.getLeft(), q1Var.getY() + q1Var.getPaddingTop());
                    if (q1Var.a()) {
                        f13 = q1Var.getAlpha();
                    } else {
                        f13 = 1.0f;
                    }
                    q1Var.v1(f13, canvas, true);
                    canvas.restore();
                }
            }
            arrayList2.clear();
        }
        ArrayList arrayList3 = this.f42737h3;
        int size2 = arrayList3.size();
        if (size2 > 0) {
            for (int i11 = 0; i11 < size2; i11++) {
                org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) arrayList3.get(i11);
                if (!un.k2(unVar, q1Var2, rectF)) {
                    float P1 = q1Var2.P1(false) + q1Var2.getLeft();
                    float y3 = q1Var2.getY() + q1Var2.getPaddingTop();
                    if (q1Var2.a()) {
                        f12 = q1Var2.getAlpha();
                    } else {
                        f12 = 1.0f;
                    }
                    canvas.save();
                    canvas.translate(P1, y3);
                    q1Var2.setInvalidatesParent(true);
                    q1Var2.f1(canvas, f12);
                    q1Var2.setInvalidatesParent(false);
                    canvas.restore();
                }
            }
            arrayList3.clear();
        }
        ArrayList arrayList4 = this.f42738i3;
        int size3 = arrayList4.size();
        if (size3 > 0) {
            int i12 = 0;
            while (i12 < size3) {
                org.telegram.ui.Cells.q1 q1Var3 = (org.telegram.ui.Cells.q1) arrayList4.get(i12);
                if (un.k2(unVar, q1Var3, rectF)) {
                    arrayList = arrayList4;
                } else {
                    if (q1Var3.getCurrentPosition() != null && (q1Var3.getCurrentPosition().f14783l & z12) == 0) {
                        z11 = z12;
                    } else {
                        z11 = z13;
                    }
                    if (q1Var3.a()) {
                        f11 = q1Var3.getAlpha();
                    } else {
                        f11 = 1.0f;
                    }
                    float P12 = q1Var3.P1(z13) + q1Var3.getLeft();
                    float y10 = q1Var3.getY() + q1Var3.getPaddingTop();
                    canvas.save();
                    org.telegram.messenger.ej currentMessagesGroup = q1Var3.getCurrentMessagesGroup();
                    if (currentMessagesGroup != null) {
                        org.telegram.messenger.dj djVar = currentMessagesGroup.f15403m;
                        if (djVar.f15247j) {
                            float P13 = q1Var3.P1(z12);
                            float f14 = djVar.f15241a + P13 + djVar.e;
                            arrayList = arrayList4;
                            float f15 = djVar.f15242b + djVar.f15244f;
                            float f16 = djVar.f15243c + P13 + djVar.f15245g;
                            float f17 = djVar.d + djVar.h;
                            if (!djVar.f15247j) {
                                f15 += q1Var3.getTranslationY();
                                f17 += q1Var3.getTranslationY();
                            }
                            canvas.clipRect(f14 + org.telegram.messenger.i0.L(8.0f), f15 + org.telegram.messenger.i0.L(8.0f), f16 - org.telegram.messenger.i0.L(8.0f), f17 - org.telegram.messenger.i0.L(8.0f));
                        } else {
                            arrayList = arrayList4;
                        }
                    } else {
                        arrayList = arrayList4;
                    }
                    if (q1Var3.getTransitionParams().f23550w0) {
                        canvas.translate(P12, y10);
                        q1Var3.setInvalidatesParent(true);
                        q1Var3.O0(f11, canvas, z11);
                        q1Var3.setInvalidatesParent(false);
                    }
                    canvas.restore();
                }
                i12++;
                arrayList4 = arrayList;
                z12 = true;
                z13 = false;
            }
            f7 = 8.0f;
            arrayList4.clear();
        } else {
            f7 = 8.0f;
        }
        ArrayList arrayList5 = this.f42739j3;
        int size4 = arrayList5.size();
        if (size4 > 0) {
            for (int i13 = 0; i13 < size4; i13++) {
                org.telegram.ui.Cells.q1 q1Var4 = (org.telegram.ui.Cells.q1) arrayList5.get(i13);
                if (!un.k2(unVar, q1Var4, rectF)) {
                    if (q1Var4.getCurrentPosition() != null && (q1Var4.getCurrentPosition().f14783l & 1) == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (q1Var4.a()) {
                        f10 = q1Var4.getAlpha();
                    } else {
                        f10 = 1.0f;
                    }
                    float P14 = q1Var4.P1(false) + q1Var4.getLeft();
                    float y11 = q1Var4.getY() + q1Var4.getPaddingTop();
                    canvas.save();
                    org.telegram.messenger.ej currentMessagesGroup2 = q1Var4.getCurrentMessagesGroup();
                    if (currentMessagesGroup2 != null) {
                        org.telegram.messenger.dj djVar2 = currentMessagesGroup2.f15403m;
                        if (djVar2.f15247j) {
                            float P15 = q1Var4.P1(true);
                            float f18 = djVar2.f15241a + P15 + djVar2.e;
                            float f19 = djVar2.f15242b + djVar2.f15244f;
                            float f20 = djVar2.f15243c + P15 + djVar2.f15245g;
                            float f21 = djVar2.d + djVar2.h;
                            if (!djVar2.f15247j) {
                                f19 += q1Var4.getTranslationY();
                                f21 += q1Var4.getTranslationY();
                            }
                            canvas.clipRect(f18 + org.telegram.messenger.i0.L(f7), f19 + org.telegram.messenger.i0.L(f7), f20 - org.telegram.messenger.i0.L(f7), f21 - org.telegram.messenger.i0.L(f7));
                        }
                    }
                    if (!z10 && q1Var4.getTransitionParams().f23550w0) {
                        canvas.translate(P14, y11);
                        q1Var4.setInvalidatesParent(true);
                        q1Var4.m1(canvas, f10, null);
                        q1Var4.T0(canvas, f10);
                        q1Var4.setInvalidatesParent(false);
                    }
                    canvas.restore();
                }
            }
            arrayList5.clear();
        }
    }

    public final void B1(boolean z10) {
        float f7;
        VelocityTracker velocityTracker;
        un unVar = this.F3;
        if (z10 && (velocityTracker = unVar.f42476x9) != null) {
            velocityTracker.computeCurrentVelocity(1000);
            f7 = unVar.f42476x9.getXVelocity();
        } else {
            f7 = 0.0f;
        }
        VelocityTracker velocityTracker2 = unVar.f42476x9;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            unVar.f42476x9 = null;
        }
        unVar.f42438u9 = false;
        unVar.B0.R = true;
        org.telegram.ui.Components.t11 t11Var = unVar.m0;
        if (t11Var != null) {
            t11Var.settle(f7);
        }
    }

    public final void C1(MotionEvent motionEvent) {
        float f7;
        float f10;
        TLRPC.Chat chat;
        org.telegram.messenger.ej L8;
        org.telegram.messenger.jj jjVar;
        boolean z10;
        ArrayList arrayList;
        TLRPC.Chat chat2;
        boolean z11;
        boolean z12 = true;
        un unVar = this.F3;
        if (motionEvent != null) {
            unVar.P4 = true;
        }
        if (unVar.U9() && unVar.f42399r9 == null) {
            if (motionEvent == null) {
                if (unVar.f42438u9) {
                    B1(false);
                }
                unVar.f42425t9 = false;
                return;
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                z11 = ((org.telegram.ui.ActionBar.k2) unVar).inPreviewMode;
                if (z11 || unVar.o9()) {
                    z12 = false;
                }
                unVar.f42425t9 = z12;
                unVar.f42438u9 = false;
                unVar.f42450v9 = motionEvent.getX();
                unVar.w9 = motionEvent.getY();
                VelocityTracker velocityTracker = unVar.f42476x9;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                }
                VelocityTracker obtain = VelocityTracker.obtain();
                unVar.f42476x9 = obtain;
                obtain.addMovement(motionEvent);
                return;
            } else if (actionMasked == 2) {
                VelocityTracker velocityTracker2 = unVar.f42476x9;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEvent);
                }
                float x10 = motionEvent.getX() - unVar.f42450v9;
                float abs = Math.abs(motionEvent.getY() - unVar.w9);
                if (unVar.f42425t9 && !unVar.f42438u9 && getScrollState() == 0 && x10 <= (-org.telegram.messenger.i0.a1(true, 0.4f)) && Math.abs(x10) / 3.0f > abs && unVar.r8() != null) {
                    MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    super.onInterceptTouchEvent(obtain2);
                    obtain2.recycle();
                    unVar.B0.R = false;
                    unVar.f42425t9 = false;
                    unVar.f42438u9 = true;
                    unVar.f42450v9 = motionEvent.getX();
                    org.telegram.ui.Components.t11 t11Var = unVar.m0;
                    ValueAnimator valueAnimator = t11Var.I;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        t11Var.I = null;
                    }
                    org.telegram.messenger.i0.v1(unVar.l1);
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        return;
                    }
                    return;
                } else if (unVar.f42438u9) {
                    unVar.m0.setProgress((-(motionEvent.getX() - unVar.f42450v9)) / org.telegram.messenger.i0.L(288.0f));
                    return;
                } else {
                    return;
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                if (unVar.f42438u9) {
                    VelocityTracker velocityTracker3 = unVar.f42476x9;
                    if (velocityTracker3 != null) {
                        velocityTracker3.addMovement(motionEvent);
                    }
                    if (actionMasked != 1) {
                        z12 = false;
                    }
                    B1(z12);
                }
                unVar.f42425t9 = false;
                return;
            } else {
                return;
            }
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !unVar.f42488y9 && !unVar.f42412s9 && unVar.f42399r9 == null) {
            z10 = ((org.telegram.ui.ActionBar.k2) unVar).inPreviewMode;
            if (!z10) {
                View pressedChildView = getPressedChildView();
                if (!(pressedChildView instanceof org.telegram.ui.Cells.q1)) {
                    if (pressedChildView instanceof org.telegram.ui.Cells.s0) {
                        org.telegram.ui.Cells.s0 s0Var = (org.telegram.ui.Cells.s0) pressedChildView;
                        float x11 = motionEvent.getX() - pressedChildView.getX();
                        float y3 = motionEvent.getY() - pressedChildView.getY();
                        if (s0Var.T()) {
                            org.telegram.ui.Wallet.d4 d4Var = s0Var.I0;
                            float f11 = (x11 - s0Var.K0) - (s0Var.f22918j0 / 2.0f);
                            float paddingTop = (y3 - s0Var.L0) - s0Var.getPaddingTop();
                            org.telegram.ui.Wallet.c4 c4Var = d4Var.f34398m;
                            if (c4Var != null && c4Var.f11999n && d4Var.f34416w.contains((int) f11, (int) paddingTop)) {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                if (unVar.f42399r9 != null) {
                    un.c2(unVar, 0.0f);
                }
                unVar.f42399r9 = pressedChildView;
                org.telegram.messenger.jj Y1 = un.Y1(unVar);
                boolean N6 = unVar.N6(Y1);
                int i10 = unVar.f42248f4;
                if ((i10 == 0 || i10 == 5 || i10 == 8 || (i10 == 3 && unVar.f42394r4 == unVar.getUserConfig().e())) && (((arrayList = unVar.f42358o4) == null || !arrayList.contains(Y1)) && ((unVar.R8(Y1) != 1 || (org.telegram.messenger.jj.B0(Y1.f16337k) != unVar.f42199b7 && !Y1.m5())) && ((unVar.h != null || Y1.f1() >= 0) && (((chat2 = unVar.e) == null || !org.telegram.messenger.w3.c0(chat2) || N6) && !unVar.o9() && (!org.telegram.messenger.jj.c3(Y1.f16337k) || !Y1.N3())))))) {
                    this.f42743n3 = motionEvent.getPointerId(0);
                    unVar.f42412s9 = true;
                    this.f42741l3 = (int) motionEvent.getX();
                    this.f42742m3 = (int) motionEvent.getY();
                    return;
                }
                un.c2(unVar, 0.0f);
                unVar.f42399r9 = null;
                return;
            }
        }
        if (unVar.f42399r9 != null && motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f42743n3) {
            int max = Math.max(org.telegram.messenger.i0.L(-80.0f), Math.min(0, (int) (motionEvent.getX() - this.f42741l3)));
            int abs2 = Math.abs(((int) motionEvent.getY()) - this.f42742m3);
            if (getScrollState() == 0 && unVar.f42412s9 && !unVar.f42488y9 && max <= (-org.telegram.messenger.i0.a1(true, 0.4f)) && Math.abs(max) / 3 > abs2) {
                MotionEvent obtain3 = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                unVar.f42399r9.onTouchEvent(obtain3);
                super.onInterceptTouchEvent(obtain3);
                obtain3.recycle();
                unVar.B0.R = false;
                unVar.f42412s9 = false;
                unVar.f42488y9 = true;
                this.f42741l3 = (int) motionEvent.getX();
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
            } else if (unVar.f42488y9) {
                if (Math.abs(max) >= org.telegram.messenger.i0.L(50.0f)) {
                    if (!this.f42747r3) {
                        try {
                            performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        this.f42747r3 = true;
                    }
                } else {
                    this.f42747r3 = false;
                }
                float f12 = max;
                un.c2(unVar, f12);
                org.telegram.messenger.jj Y12 = un.Y1(unVar);
                if (Y12 != null && (Y12.h4() || org.telegram.messenger.jj.L4(Y12.f16337k))) {
                    unVar.hd(false, false);
                }
                View view = unVar.f42399r9;
                if (view instanceof org.telegram.ui.Cells.q1) {
                    D1((org.telegram.ui.Cells.q1) view, f12);
                }
                invalidate();
            }
        } else if (unVar.f42399r9 != null) {
            if (motionEvent != null) {
                if (motionEvent.getPointerId(0) == this.f42743n3) {
                    if (motionEvent.getAction() != 3 && motionEvent.getAction() != 1 && motionEvent.getAction() != 6) {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (motionEvent != null && motionEvent.getAction() != 3) {
                View view2 = unVar.f42399r9;
                if (view2 instanceof org.telegram.ui.Cells.q1) {
                    f10 = ((org.telegram.ui.Cells.q1) view2).P1(false);
                } else if (view2 instanceof org.telegram.ui.Cells.s0) {
                    f10 = ((org.telegram.ui.Cells.s0) view2).getWalletSlidingOffset();
                } else {
                    f10 = 0.0f;
                }
                if (Math.abs(f10) >= org.telegram.messenger.i0.L(50.0f)) {
                    org.telegram.messenger.jj Y13 = un.Y1(unVar);
                    boolean N62 = unVar.N6(Y13);
                    qk qkVar = unVar.f42207c1;
                    if ((qkVar != null && qkVar.getVisibility() == 0 && ((!unVar.W0 || !N62) && !Y13.V1)) || ((chat = unVar.e) != null && ((org.telegram.messenger.w3.r0(chat) && !unVar.T9()) || ((org.telegram.messenger.w3.T(unVar.e) && !org.telegram.messenger.w3.w(5, unVar.e) && !unVar.e.megagroup) || !org.telegram.messenger.w3.n(unVar.e))))) {
                        if (Y13.d1() != 0 && (L8 = unVar.L8(Y13.d1())) != null && (jjVar = L8.h) != null) {
                            Y13 = jjVar;
                        }
                        unVar.D5 = Y13;
                        Bundle j10 = org.telegram.ui.Cells.f1.j(3, "onlySelect", "dialogsType", true);
                        j10.putBoolean("quote", true);
                        j10.putBoolean("reply_to", true);
                        long o10 = org.telegram.messenger.o5.o(Y13.b1());
                        int i11 = (o10 > 0L ? 1 : (o10 == 0L ? 0 : -1));
                        if (i11 != 0 && o10 != unVar.a() && o10 != unVar.getUserConfig().e() && i11 > 0) {
                            j10.putLong("reply_to_author", o10);
                        }
                        j10.putInt("messagesCount", 1);
                        j10.putBoolean("canSelectTopics", true);
                        ay ayVar = new ay(j10);
                        ayVar.C2 = unVar;
                        unVar.presentFragment(ayVar);
                    } else {
                        unVar.Ub(un.Y1(unVar));
                    }
                }
            }
            View view3 = unVar.f42399r9;
            if (view3 instanceof org.telegram.ui.Cells.q1) {
                f7 = ((org.telegram.ui.Cells.q1) view3).getSlidingOffsetX();
            } else if (view3 instanceof org.telegram.ui.Cells.s0) {
                f7 = ((org.telegram.ui.Cells.s0) view3).getWalletSlidingOffset();
            } else {
                f7 = 0.0f;
            }
            this.f42746q3 = f7;
            if (f7 == 0.0f) {
                unVar.f42399r9 = null;
            }
            this.f42744o3 = System.currentTimeMillis();
            this.f42745p3 = 0.0f;
            invalidate();
            unVar.f42412s9 = false;
            unVar.f42488y9 = false;
            unVar.B0.R = true;
        }
    }

    public final void D1(org.telegram.ui.Cells.q1 q1Var, float f7) {
        org.telegram.messenger.ej currentMessagesGroup = q1Var.getCurrentMessagesGroup();
        if (currentMessagesGroup == null) {
            return;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt != q1Var && (childAt instanceof org.telegram.ui.Cells.q1)) {
                org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) childAt;
                if (q1Var2.getCurrentMessagesGroup() == currentMessagesGroup) {
                    q1Var2.setSlidingOffset(f7);
                    q1Var2.invalidate();
                }
            }
        }
        invalidate();
    }

    @Override
    public final boolean F0(View view) {
        if (view.getVisibility() != 4 && view.getVisibility() != 8) {
            return true;
        }
        return false;
    }

    @Override
    public final AccessibilityNodeInfo createAccessibilityNodeInfo() {
        if (this.F3.h != null) {
            return null;
        }
        return super.createAccessibilityNodeInfo();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        un unVar = this.F3;
        unVar.I8 = null;
        canvas.save();
        if (unVar.f42364oa != null && unVar.f42314ka) {
            boolean z10 = unVar.f42325la;
        }
        this.E1.setEmpty();
        if (unVar.f42266ga != 0.0f) {
            int save = canvas.save();
            if (unVar.f42351na != 0.0f) {
                f7 = (unVar.f42492z0.getMeasuredHeight() - unVar.f42266ga) * unVar.f42351na;
            } else {
                f7 = 0.0f;
            }
            float f10 = (-unVar.f42266ga) - f7;
            unVar.Sa = f10;
            canvas.translate(0.0f, f10);
            z1(canvas, null);
            super.dispatchDraw(canvas);
            A1(canvas, null);
            canvas.restoreToCount(save);
        } else {
            z1(canvas, null);
            super.dispatchDraw(canvas);
            A1(canvas, null);
        }
        canvas.restore();
    }

    @Override
    public final void draw(android.graphics.Canvas r44) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vj.draw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r23, android.view.View r24, long r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vj.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override
    public final void j1(View view, float f7, float f10, boolean z10) {
        org.telegram.messenger.ej currentMessagesGroup;
        super.j1(view, f7, f10, z10);
        if (view instanceof org.telegram.ui.Cells.q1) {
            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
            org.telegram.messenger.jj messageObject = q1Var.getMessageObject();
            if (!messageObject.I3() && !messageObject.U2() && (currentMessagesGroup = q1Var.getCurrentMessagesGroup()) != null) {
                int childCount = getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = getChildAt(i10);
                    if (childAt != view && (childAt instanceof org.telegram.ui.Cells.q1)) {
                        org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) childAt;
                        if (q1Var2.getCurrentMessagesGroup() == currentMessagesGroup) {
                            q1Var2.setPressed(z10);
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vj.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        if (this.F3.h == null) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            AccessibilityNodeInfo.CollectionInfo collectionInfo = accessibilityNodeInfo.getCollectionInfo();
            if (collectionInfo != null) {
                accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(collectionInfo.getRowCount(), 1, false));
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        mh.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        un unVar = this.F3;
        lm lmVar = unVar.f42386q9;
        lmVar.getClass();
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            org.telegram.messenger.i0.r(lmVar.f23421f0);
            lmVar.f23447z = false;
        }
        if (!this.V1 && ((lVar = unVar.f42387qa) == null || !lVar.a())) {
            boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
            lVar2 = ((org.telegram.ui.ActionBar.k2) unVar).actionBar;
            if (!lVar2.u() && !unVar.M9()) {
                C1(motionEvent);
                if (onInterceptTouchEvent || unVar.f42438u9) {
                    return true;
                }
            } else {
                return onInterceptTouchEvent;
            }
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = this.f42735f3;
        int i15 = i12 - i10;
        un unVar = this.F3;
        if (i14 != i15) {
            if (i14 != 0) {
                unVar.u9(false);
            }
            this.f42735f3 = i15;
        }
        int measuredHeight = getMeasuredHeight();
        if (this.E3 != measuredHeight) {
            this.D3 = true;
            xj xjVar = unVar.A0;
            if (xjVar != null) {
                xjVar.g();
            }
            unVar.f42313k9.a();
            this.D3 = false;
            this.E3 = measuredHeight;
        }
        unVar.f42273h6 = false;
        lm lmVar = unVar.f42386q9;
        if (lmVar != null && lmVar.x()) {
            unVar.f42386q9.w();
        }
        unVar.B9();
        unVar.R9();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.l lVar;
        tp tpVar;
        un unVar = this.F3;
        fe.b bVar = unVar.Qc;
        lm lmVar = unVar.f42386q9;
        lmVar.getClass();
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            org.telegram.messenger.i0.r(lmVar.f23421f0);
            lmVar.f23447z = false;
        }
        if (motionEvent.getAction() == 0) {
            unVar.La = true;
        }
        if (unVar.f42266ga != 0.0f && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            float min = Math.min(1.0f, unVar.f42266ga / org.telegram.messenger.i0.L(110.0f));
            if (motionEvent.getAction() == 1 && min == 1.0f && (tpVar = unVar.ia) != null && !tpVar.R) {
                if (tpVar.K != 1.0f) {
                    float f7 = unVar.f42266ga;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, org.telegram.messenger.i0.L(8.0f) + f7);
                    unVar.f42301ja = ofFloat;
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                        public final vj f42152b;

                        {
                            this.f42152b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    un unVar2 = this.f42152b.F3;
                                    unVar2.f42266ga = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    unVar2.f42492z0.invalidate();
                                    return;
                                case 1:
                                    un unVar3 = this.f42152b.F3;
                                    unVar3.f42266ga = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    unVar3.f42492z0.invalidate();
                                    return;
                                case 2:
                                    un unVar4 = this.f42152b.F3;
                                    unVar4.f42266ga = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    unVar4.f42492z0.invalidate();
                                    return;
                                default:
                                    un unVar5 = this.f42152b.F3;
                                    unVar5.f42266ga = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    unVar5.f42492z0.invalidate();
                                    return;
                            }
                        }
                    });
                    ofFloat.setDuration(200L);
                    org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.f26495f;
                    ofFloat.setInterpolator(grVar);
                    ofFloat.start();
                    final tp tpVar2 = unVar.ia;
                    rh rhVar = new rh(this, 3);
                    AnimatorSet animatorSet = tpVar2.J;
                    if (animatorSet != null) {
                        animatorSet.removeAllListeners();
                        tpVar2.J.cancel();
                    }
                    tpVar2.Y = rhVar;
                    tpVar2.J = new AnimatorSet();
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(tpVar2.K, 1.0f);
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    tp tpVar3 = tpVar2;
                                    tpVar3.getClass();
                                    tpVar3.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    tpVar3.T.invalidate();
                                    View view = tpVar3.f41888a0;
                                    if (view != null) {
                                        view.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    tp tpVar4 = tpVar2;
                                    tpVar4.getClass();
                                    tpVar4.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view2 = tpVar4.f41888a0;
                                    if (view2 != null) {
                                        view2.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(tpVar2.L, 0.0f);
                    ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    tp tpVar3 = tpVar2;
                                    tpVar3.getClass();
                                    tpVar3.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    tpVar3.T.invalidate();
                                    View view = tpVar3.f41888a0;
                                    if (view != null) {
                                        view.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    tp tpVar4 = tpVar2;
                                    tpVar4.getClass();
                                    tpVar4.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view2 = tpVar4.f41888a0;
                                    if (view2 != null) {
                                        view2.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    tpVar2.J.addListener(new s9(tpVar2, 20));
                    tpVar2.J.playTogether(ofFloat2, ofFloat3);
                    tpVar2.J.setDuration(120L);
                    tpVar2.J.setInterpolator(grVar);
                    tpVar2.J.start();
                } else {
                    un.d2(unVar);
                }
            } else {
                tp tpVar3 = unVar.ia;
                if (tpVar3 != null && tpVar3.R) {
                    long currentTimeMillis = System.currentTimeMillis();
                    tp tpVar4 = unVar.ia;
                    if (currentTimeMillis - tpVar4.U < 500 && tpVar4.M) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        unVar.f42301ja = animatorSet2;
                        if (unVar.ia != null) {
                            bVar.a(false, true);
                        }
                        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(unVar.f42266ga, org.telegram.messenger.i0.L(111.0f));
                        ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final vj f42152b;

                            {
                                this.f42152b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        un unVar2 = this.f42152b.F3;
                                        unVar2.f42266ga = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        unVar2.f42492z0.invalidate();
                                        return;
                                    case 1:
                                        un unVar3 = this.f42152b.F3;
                                        unVar3.f42266ga = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        unVar3.f42492z0.invalidate();
                                        return;
                                    case 2:
                                        un unVar4 = this.f42152b.F3;
                                        unVar4.f42266ga = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        unVar4.f42492z0.invalidate();
                                        return;
                                    default:
                                        un unVar5 = this.f42152b.F3;
                                        unVar5.f42266ga = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        unVar5.f42492z0.invalidate();
                                        return;
                                }
                            }
                        });
                        ofFloat4.setDuration(400L);
                        ofFloat4.setInterpolator(org.telegram.ui.Components.gr.f26495f);
                        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(org.telegram.messenger.i0.L(111.0f), 0.0f);
                        ofFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final vj f42152b;

                            {
                                this.f42152b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        un unVar2 = this.f42152b.F3;
                                        unVar2.f42266ga = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        unVar2.f42492z0.invalidate();
                                        return;
                                    case 1:
                                        un unVar3 = this.f42152b.F3;
                                        unVar3.f42266ga = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        unVar3.f42492z0.invalidate();
                                        return;
                                    case 2:
                                        un unVar4 = this.f42152b.F3;
                                        unVar4.f42266ga = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        unVar4.f42492z0.invalidate();
                                        return;
                                    default:
                                        un unVar5 = this.f42152b.F3;
                                        unVar5.f42266ga = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        unVar5.f42492z0.invalidate();
                                        return;
                                }
                            }
                        });
                        ofFloat5.setStartDelay(600L);
                        ofFloat5.setDuration(250L);
                        ofFloat5.setInterpolator(ci.o.V);
                        animatorSet2.playSequentially(ofFloat4, ofFloat5);
                        animatorSet2.start();
                    }
                }
                ValueAnimator ofFloat6 = ValueAnimator.ofFloat(unVar.f42266ga, 0.0f);
                unVar.f42301ja = ofFloat6;
                if (unVar.ia != null) {
                    bVar.a(false, true);
                }
                ofFloat6.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final vj f42152b;

                    {
                        this.f42152b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (r2) {
                            case 0:
                                un unVar2 = this.f42152b.F3;
                                unVar2.f42266ga = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                unVar2.f42492z0.invalidate();
                                return;
                            case 1:
                                un unVar3 = this.f42152b.F3;
                                unVar3.f42266ga = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                unVar3.f42492z0.invalidate();
                                return;
                            case 2:
                                un unVar4 = this.f42152b.F3;
                                unVar4.f42266ga = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                unVar4.f42492z0.invalidate();
                                return;
                            default:
                                un unVar5 = this.f42152b.F3;
                                unVar5.f42266ga = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                unVar5.f42492z0.invalidate();
                                return;
                        }
                    }
                });
                ofFloat6.setDuration(250L);
                ofFloat6.setInterpolator(ci.o.V);
                ofFloat6.start();
            }
        }
        if (!this.V1) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            lVar = ((org.telegram.ui.ActionBar.k2) unVar).actionBar;
            if (!lVar.u() && !unVar.M9()) {
                C1(motionEvent);
                if (unVar.f42488y9 || unVar.f42438u9 || onTouchEvent) {
                    return true;
                }
            } else {
                return onTouchEvent;
            }
        }
        return false;
    }

    @Override
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        if (this.F3.f42240e9 != null) {
            return false;
        }
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        org.telegram.ui.Components.gl0 X3;
        org.telegram.ui.Components.q81 q81Var;
        super.requestDisallowInterceptTouchEvent(z10);
        View view = this.F3.f42399r9;
        if (view != null) {
            if ((view instanceof org.telegram.ui.Cells.q1) && (X3 = ((org.telegram.ui.Cells.q1) view).X3()) != null && (q81Var = X3.f26399d0) != null && X3.f26400e0 && q81Var.f29596w && !q81Var.E) {
                if (q81Var.f29597x) {
                    if (!q81Var.f29598y && (q81Var.L & 3) != 1) {
                        return;
                    }
                } else {
                    return;
                }
            }
            C1(null);
        }
    }

    @Override
    public final void requestLayout() {
        if (this.D3) {
            return;
        }
        zg.a aVar = this.F3.f42327lc;
        if (aVar.f55717b != 0) {
            int childCount = aVar.f55716a.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                aVar.f55716a.getChildAt(i10).forceLayout();
            }
        }
        super.requestLayout();
    }

    @Override
    public final void setItemAnimator(s4.l0 l0Var) {
        if (this.V1) {
            return;
        }
        super.setItemAnimator(l0Var);
    }

    @Override
    public final void setTranslationY(float f7) {
        if (f7 != getTranslationY()) {
            super.setTranslationY(f7);
            un unVar = this.F3;
            unVar.A9();
            unVar.C9();
        }
    }

    public final void z1(Canvas canvas, RectF rectF) {
        int i10;
        int i11;
        float f7;
        char c10;
        un unVar;
        float f10;
        org.telegram.messenger.ej ejVar;
        int i12;
        float f11;
        int i13;
        boolean z10;
        org.telegram.messenger.ej ejVar2;
        int i14;
        ArrayList arrayList;
        org.telegram.messenger.dj djVar;
        boolean z11;
        char c11;
        int i15;
        org.telegram.messenger.ej currentMessagesGroup;
        int i16;
        int i17;
        boolean z12;
        org.telegram.ui.ActionBar.l lVar;
        int measuredHeight;
        int i18;
        int i19;
        org.telegram.ui.ActionBar.l lVar2;
        int measuredHeight2;
        vj vjVar = this;
        Canvas canvas2 = canvas;
        int childCount = vjVar.getChildCount();
        org.telegram.messenger.ej ejVar3 = null;
        int i20 = 0;
        while (true) {
            i10 = 8;
            i11 = 2;
            f7 = 0.0f;
            c10 = 0;
            unVar = vjVar.F3;
            if (i20 < childCount) {
                View childAt = vjVar.getChildAt(i20);
                f10 = 1.0f;
                if (childAt.getVisibility() != 4 && childAt.getVisibility() != 8) {
                    if (!un.k2(unVar, childAt, rectF)) {
                        if (childAt instanceof org.telegram.ui.Cells.y1) {
                            canvas2.save();
                            canvas2.translate(childAt.getX(), childAt.getY());
                            ((org.telegram.ui.Cells.y1) childAt).a(canvas2);
                            canvas2.restore();
                        } else if (unVar.C0.f37294n && (childAt instanceof org.telegram.ui.Cells.f0)) {
                            float measuredHeight3 = ((((vjVar.getMeasuredHeight() - unVar.L9) - unVar.Ua) / 2.0f) - (childAt.getMeasuredHeight() / 2)) + unVar.L9;
                            if (!((org.telegram.ui.Cells.f0) childAt).I && !unVar.f42492z0.V1) {
                                if (childAt.getTop() > measuredHeight3) {
                                    childAt.setTranslationY(measuredHeight3 - childAt.getTop());
                                } else {
                                    childAt.setTranslationY(0.0f);
                                }
                            }
                        } else if (childAt instanceof org.telegram.ui.Cells.ra) {
                            float measuredHeight4 = ((((vjVar.getMeasuredHeight() - unVar.L9) - unVar.Ua) / 2.0f) - (childAt.getMeasuredHeight() / 2)) + unVar.L9;
                            if (!((org.telegram.ui.Cells.ra) childAt).O && !unVar.f42492z0.V1) {
                                if (childAt.getTop() > measuredHeight4) {
                                    childAt.setTranslationY(measuredHeight4 - childAt.getTop());
                                } else {
                                    childAt.setTranslationY(0.0f);
                                }
                            }
                        } else {
                            if (childAt instanceof org.telegram.ui.Cells.q1) {
                                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                                org.telegram.messenger.ej currentMessagesGroup2 = q1Var.getCurrentMessagesGroup();
                                if (currentMessagesGroup2 != null && currentMessagesGroup2 == ejVar3) {
                                    i17 = i20;
                                    z12 = true;
                                } else {
                                    org.telegram.messenger.bj currentPosition = q1Var.getCurrentPosition();
                                    org.telegram.ui.Components.aa0 backgroundDrawable = q1Var.getBackgroundDrawable();
                                    if ((!backgroundDrawable.f24345f && !q1Var.w2()) || (currentPosition != null && (2 & currentPosition.f14783l) == 0)) {
                                        i17 = i20;
                                        z12 = true;
                                    } else {
                                        boolean z13 = q1Var.f22755v6;
                                        org.telegram.ui.ActionBar.p6 p6Var = vjVar.f30625n2;
                                        z12 = true;
                                        if (z13 || q1Var.f22768w6) {
                                            i17 = i20;
                                            if (currentPosition == null) {
                                                Paint W0 = vjVar.W0("paintChatMessageBackgroundSelected");
                                                sn snVar = unVar.f42477xa;
                                                if ((snVar != null && snVar.f41600q) || W0 == null) {
                                                    W0 = org.telegram.ui.ActionBar.t6.a2;
                                                    W0.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21265vd, p6Var));
                                                } else {
                                                    if (!unVar.J9()) {
                                                        lVar = ((org.telegram.ui.ActionBar.k2) unVar).actionBar;
                                                        measuredHeight = lVar.getMeasuredHeight();
                                                    } else {
                                                        measuredHeight = unVar.f42492z0.getTop();
                                                    }
                                                    float backgroundTranslationY = measuredHeight - unVar.l1.getBackgroundTranslationY();
                                                    int backgroundSizeY = unVar.l1.getBackgroundSizeY();
                                                    sn snVar2 = unVar.f42477xa;
                                                    if (snVar2 != null) {
                                                        snVar2.b(q1Var.getX(), backgroundTranslationY, vjVar.getMeasuredWidth(), backgroundSizeY);
                                                    } else {
                                                        org.telegram.ui.ActionBar.t6.r(q1Var.getX(), backgroundTranslationY, vjVar.getMeasuredWidth(), backgroundSizeY);
                                                    }
                                                }
                                                Paint paint = W0;
                                                canvas2.save();
                                                canvas2.translate(0.0f, q1Var.getTranslationY());
                                                int alpha = paint.getAlpha();
                                                paint.setAlpha((int) (q1Var.getAlpha() * q1Var.getHighlightAlpha() * alpha));
                                                canvas2.drawRect(0.0f, q1Var.getTop(), vjVar.getMeasuredWidth(), q1Var.getBottom(), paint);
                                                paint.setAlpha(alpha);
                                                canvas2.restore();
                                            }
                                        } else {
                                            int y3 = (int) q1Var.getY();
                                            canvas2.save();
                                            if (currentPosition == null) {
                                                i18 = q1Var.getMeasuredHeight();
                                                i17 = i20;
                                            } else {
                                                int measuredHeight5 = q1Var.getMeasuredHeight() + y3;
                                                long j10 = 0;
                                                float f12 = 0.0f;
                                                int i21 = 0;
                                                while (i21 < childCount) {
                                                    View childAt2 = vjVar.getChildAt(i21);
                                                    int i22 = i20;
                                                    if (childAt2 instanceof org.telegram.ui.Cells.q1) {
                                                        org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) childAt2;
                                                        if (q1Var2.getCurrentMessagesGroup() == currentMessagesGroup2) {
                                                            org.telegram.ui.Components.aa0 backgroundDrawable2 = q1Var2.getBackgroundDrawable();
                                                            i19 = i21;
                                                            y3 = Math.min(y3, (int) q1Var2.getY());
                                                            measuredHeight5 = Math.max(measuredHeight5, q1Var2.getMeasuredHeight() + ((int) q1Var2.getY()));
                                                            long j11 = backgroundDrawable2.f24350l;
                                                            if (j11 > j10) {
                                                                j10 = j11;
                                                                f7 = q1Var2.getX() + backgroundDrawable2.h;
                                                                f12 = q1Var2.getY() + backgroundDrawable2.f24347i;
                                                            }
                                                            i21 = i19 + 1;
                                                            i20 = i22;
                                                        }
                                                    }
                                                    i19 = i21;
                                                    i21 = i19 + 1;
                                                    i20 = i22;
                                                }
                                                i17 = i20;
                                                backgroundDrawable.f24348j = f7;
                                                backgroundDrawable.f24349k = f12 - y3;
                                                i18 = measuredHeight5 - y3;
                                            }
                                            int i23 = i18 + y3;
                                            canvas2.clipRect(0, y3, vjVar.getMeasuredWidth(), i23);
                                            Paint W02 = vjVar.W0("paintChatMessageBackgroundSelected");
                                            sn snVar3 = unVar.f42477xa;
                                            if (snVar3 != null && !snVar3.f41600q && W02 != null) {
                                                backgroundDrawable.f24343b = W02;
                                                if (!unVar.J9()) {
                                                    lVar2 = ((org.telegram.ui.ActionBar.k2) unVar).actionBar;
                                                    measuredHeight2 = lVar2.getMeasuredHeight();
                                                } else {
                                                    measuredHeight2 = unVar.f42492z0.getTop();
                                                }
                                                float backgroundTranslationY2 = measuredHeight2 - unVar.l1.getBackgroundTranslationY();
                                                int backgroundSizeY2 = unVar.l1.getBackgroundSizeY();
                                                sn snVar4 = unVar.f42477xa;
                                                if (snVar4 != null) {
                                                    snVar4.b(q1Var.getX(), backgroundTranslationY2, vjVar.getMeasuredWidth(), backgroundSizeY2);
                                                } else {
                                                    org.telegram.ui.ActionBar.t6.r(q1Var.getX(), backgroundTranslationY2, vjVar.getMeasuredWidth(), backgroundSizeY2);
                                                }
                                            } else {
                                                backgroundDrawable.f24343b = null;
                                                backgroundDrawable.f24342a.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21265vd, p6Var));
                                            }
                                            backgroundDrawable.setBounds(0, y3, vjVar.getMeasuredWidth(), i23);
                                            backgroundDrawable.draw(canvas2);
                                            canvas2.restore();
                                        }
                                    }
                                    ejVar3 = currentMessagesGroup2;
                                }
                                if (unVar.X8 != q1Var && currentMessagesGroup2 == null && q1Var.J0()) {
                                    canvas2.save();
                                    canvas2.translate(q1Var.getX(), q1Var.getY() + q1Var.getPaddingTop());
                                    if (q1Var.getScaleX() != 1.0f) {
                                        canvas2.scale(q1Var.getScaleX(), q1Var.getScaleY(), q1Var.getPivotX(), q1Var.getHeight() >> 1);
                                    }
                                    q1Var.K0(canvas2, z12, false);
                                    canvas2.restore();
                                }
                            } else {
                                i17 = i20;
                                if (childAt instanceof org.telegram.ui.Cells.s0) {
                                    org.telegram.ui.Cells.s0 s0Var = (org.telegram.ui.Cells.s0) childAt;
                                    if (s0Var.R()) {
                                        canvas2.save();
                                        canvas2.translate(s0Var.getX(), s0Var.getY() + s0Var.getPaddingTop());
                                        canvas2.scale(s0Var.getScaleX(), s0Var.getScaleY(), s0Var.getMeasuredWidth() / 2.0f, s0Var.getMeasuredHeight() / 2.0f);
                                        canvas2.translate(unVar.e9() / 2.0f, 0.0f);
                                        s0Var.H(canvas2, true);
                                        s0Var.J(canvas2, true);
                                        canvas2.restore();
                                    }
                                }
                            }
                            i20 = i17 + 1;
                        }
                    }
                }
                i17 = i20;
                i20 = i17 + 1;
            } else {
                f10 = 1.0f;
                break;
            }
        }
        View view = unVar.X8;
        if (view instanceof org.telegram.ui.Cells.q1) {
            ejVar = ((org.telegram.ui.Cells.q1) view).getCurrentMessagesGroup();
        } else {
            ejVar = null;
        }
        int i24 = 0;
        while (i24 < 3) {
            ArrayList arrayList2 = vjVar.f42740k3;
            arrayList2.clear();
            if (i24 == i11 && !unVar.f42492z0.V1) {
                i12 = i10;
                i13 = i11;
                f11 = f7;
            } else {
                int i25 = 0;
                while (i25 < childCount) {
                    View childAt3 = unVar.f42492z0.getChildAt(i25);
                    if (childAt3 instanceof org.telegram.ui.Cells.q1) {
                        org.telegram.ui.Cells.q1 q1Var3 = (org.telegram.ui.Cells.q1) childAt3;
                        if (childAt3.getY() <= unVar.f42492z0.getHeight() && childAt3.getY() + childAt3.getHeight() >= f7 && q1Var3.getVisibility() != i10 && (currentMessagesGroup = q1Var3.getCurrentMessagesGroup()) != null) {
                            org.telegram.messenger.dj djVar2 = currentMessagesGroup.f15403m;
                            if (i24 == 0) {
                                i15 = i10;
                                i16 = 1;
                                if (currentMessagesGroup.d.size() == 1) {
                                    i25++;
                                    i10 = i15;
                                    i11 = 2;
                                    f7 = 0.0f;
                                }
                            } else {
                                i15 = i10;
                                i16 = 1;
                            }
                            if ((i24 != i16 || djVar2.f15246i) && ((i24 != 0 || !q1Var3.getMessageObject().Z) && ((i24 != 1 || q1Var3.getMessageObject().Z) && ((i24 != i11 || q1Var3.f22785xa) && (i24 == i11 || !q1Var3.f22785xa))))) {
                                if (!arrayList2.contains(currentMessagesGroup)) {
                                    djVar2.f15241a = 0;
                                    djVar2.f15242b = 0;
                                    djVar2.f15243c = 0;
                                    djVar2.d = 0;
                                    djVar2.f15249l = false;
                                    djVar2.f15248k = false;
                                    djVar2.f15250m = q1Var3;
                                    arrayList2.add(currentMessagesGroup);
                                }
                                djVar2.f15248k = q1Var3.F2();
                                djVar2.f15249l = q1Var3.E2();
                                int backgroundDrawableLeft = q1Var3.getBackgroundDrawableLeft() + q1Var3.getLeft();
                                int backgroundDrawableRight = q1Var3.getBackgroundDrawableRight() + q1Var3.getLeft();
                                int backgroundDrawableTop = q1Var3.getBackgroundDrawableTop() + q1Var3.getPaddingTop() + q1Var3.getTop();
                                int backgroundDrawableBottom = q1Var3.getBackgroundDrawableBottom() + q1Var3.getPaddingTop() + q1Var3.getTop();
                                if ((q1Var3.getCurrentPosition().f14783l & 4) == 0) {
                                    backgroundDrawableTop -= org.telegram.messenger.i0.L(10.0f);
                                }
                                int i26 = backgroundDrawableTop;
                                if ((q1Var3.getCurrentPosition().f14783l & 8) == 0) {
                                    backgroundDrawableBottom = org.telegram.messenger.i0.L(10.0f) + backgroundDrawableBottom;
                                }
                                int i27 = backgroundDrawableBottom;
                                if (q1Var3.f22785xa) {
                                    djVar2.f15250m = q1Var3;
                                }
                                int i28 = djVar2.f15242b;
                                if (i28 == 0 || i26 < i28) {
                                    djVar2.f15242b = i26;
                                }
                                int i29 = djVar2.d;
                                if (i29 == 0 || i27 > i29) {
                                    djVar2.d = i27;
                                }
                                int i30 = djVar2.f15241a;
                                if (i30 == 0 || backgroundDrawableLeft < i30) {
                                    djVar2.f15241a = backgroundDrawableLeft;
                                }
                                int i31 = djVar2.f15243c;
                                if (i31 == 0 || backgroundDrawableRight > i31) {
                                    djVar2.f15243c = backgroundDrawableRight;
                                }
                            }
                            i25++;
                            i10 = i15;
                            i11 = 2;
                            f7 = 0.0f;
                        }
                    }
                    i15 = i10;
                    i25++;
                    i10 = i15;
                    i11 = 2;
                    f7 = 0.0f;
                }
                i12 = i10;
                int i32 = 0;
                while (i32 < arrayList2.size()) {
                    org.telegram.messenger.ej ejVar4 = (org.telegram.messenger.ej) arrayList2.get(i32);
                    org.telegram.messenger.dj djVar3 = ejVar4.f15403m;
                    ArrayList arrayList3 = ejVar4.d;
                    float P1 = djVar3.f15250m.P1(true);
                    float f13 = djVar3.f15241a + P1 + djVar3.e;
                    float f14 = djVar3.f15242b + djVar3.f15244f;
                    float f15 = djVar3.f15245g + djVar3.f15243c + P1;
                    float f16 = djVar3.d + djVar3.h;
                    if (!djVar3.f15247j) {
                        f14 += djVar3.f15250m.getTranslationY();
                        f16 += djVar3.f15250m.getTranslationY();
                    }
                    float f17 = f14;
                    if (f16 > org.telegram.messenger.i0.L(20.0f) + unVar.f42492z0.getMeasuredHeight()) {
                        f16 = org.telegram.messenger.i0.L(20.0f) + unVar.f42492z0.getMeasuredHeight();
                    }
                    if (djVar3.f15250m.getScaleX() == f10 && djVar3.f15250m.getScaleY() == f10) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z10) {
                        canvas2.save();
                        ejVar2 = ejVar4;
                        i14 = i24;
                        arrayList = arrayList2;
                        canvas2.scale(djVar3.f15250m.getScaleX(), djVar3.f15250m.getScaleY(), c3.i0.B(f15, f13, 2.0f, f13), c3.i0.B(f16, f17, 2.0f, f17));
                    } else {
                        ejVar2 = ejVar4;
                        i14 = i24;
                        arrayList = arrayList2;
                    }
                    int size = arrayList3.size();
                    int i33 = 0;
                    while (true) {
                        if (i33 < size) {
                            org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) arrayList3.get(i33);
                            djVar = djVar3;
                            if (org.telegram.messenger.jj.B0(jjVar.f16337k) == unVar.f42297j6) {
                                c11 = 0;
                            } else {
                                c11 = 1;
                            }
                            if (unVar.f42333m6[c11].indexOfKey(jjVar.f1()) < 0) {
                                z11 = false;
                                break;
                            } else {
                                i33++;
                                djVar3 = djVar;
                            }
                        } else {
                            djVar = djVar3;
                            z11 = true;
                            break;
                        }
                    }
                    float f18 = f16;
                    un unVar2 = unVar;
                    boolean z14 = z11;
                    org.telegram.messenger.ej ejVar5 = ejVar2;
                    djVar.f15250m.I0(canvas, (int) f13, (int) f17, (int) f15, (int) f16, djVar.f15248k, djVar.f15249l, z14, 0);
                    if (ejVar5 != ejVar) {
                        djVar.f15250m = null;
                    }
                    djVar.f15252o = ejVar5.f15396c;
                    if (z10) {
                        canvas.restore();
                        for (int i34 = 0; i34 < childCount; i34++) {
                            View childAt4 = unVar2.f42492z0.getChildAt(i34);
                            if (childAt4 instanceof org.telegram.ui.Cells.q1) {
                                org.telegram.ui.Cells.q1 q1Var4 = (org.telegram.ui.Cells.q1) childAt4;
                                if (q1Var4.getCurrentMessagesGroup() == ejVar5) {
                                    int left = q1Var4.getLeft();
                                    int top = q1Var4.getTop();
                                    childAt4.setPivotX(((f15 - f13) / 2.0f) + (f13 - left));
                                    childAt4.setPivotY(((f18 - f17) / 2.0f) + (f17 - top));
                                }
                            }
                        }
                    }
                    i32++;
                    canvas2 = canvas;
                    unVar = unVar2;
                    i24 = i14;
                    arrayList2 = arrayList;
                    c10 = 0;
                }
                f11 = 0.0f;
                i13 = 2;
            }
            canvas2 = canvas;
            unVar = unVar;
            i10 = i12;
            f7 = f11;
            i11 = i13;
            c10 = c10;
            i24++;
            vjVar = this;
        }
    }
}
