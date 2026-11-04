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
public final class wi extends ol {
    public final q1.f A3;
    public final q1.g B3;
    public boolean C3;
    public final Path D3;
    public boolean E3;
    public int F3;
    public final wm G3;
    public int f51162g3;
    public final ArrayList f51163h3;
    public final ArrayList i3;
    public final ArrayList f51164j3;
    public final ArrayList f51165k3;
    public final ArrayList f51166l3;
    public int f51167m3;
    public int f51168n3;
    public int f51169o3;
    public long f51170p3;
    public float f51171q3;
    public float f51172r3;
    public boolean f51173s3;
    public final float f51174t3;
    public final Paint f51175u3;
    public final Paint f51176v3;
    public final q1.f f51177w3;
    public final q1.g f51178x3;
    public final q1.f f51179y3;
    public final q1.g f51180z3;

    public wi(wm wmVar, Context context, um umVar) {
        super(wmVar, context, umVar);
        this.G3 = wmVar;
        this.f51163h3 = new ArrayList();
        this.i3 = new ArrayList();
        this.f51164j3 = new ArrayList();
        this.f51165k3 = new ArrayList();
        this.f51166l3 = new ArrayList(10);
        this.f51174t3 = 2000.0f;
        Paint paint = new Paint(1);
        this.f51175u3 = paint;
        Paint paint2 = new Paint(1);
        this.f51176v3 = paint2;
        q1.f fVar = new q1.f(0.0f);
        this.f51177w3 = fVar;
        q1.g gVar = new q1.g(fVar);
        gVar.h = 0.0f;
        gVar.f53648g = 2000.0f;
        gVar.f53653m = org.telegram.ui.Cells.f1.s(0.0f, 1500.0f, 1.0f);
        gVar.b(new q1.d(this) {
            public final wi f50539b;

            {
                this.f50539b = this;
            }

            @Override
            public final void a(q1.g gVar2, float f10, float f11) {
                switch (r2) {
                    case 0:
                        this.f50539b.invalidate();
                        return;
                    case 1:
                        this.f50539b.invalidate();
                        return;
                    default:
                        this.f50539b.invalidate();
                        return;
                }
            }
        });
        this.f51178x3 = gVar;
        q1.f fVar2 = new q1.f(0.0f);
        this.f51179y3 = fVar2;
        q1.g gVar2 = new q1.g(fVar2);
        gVar2.h = 0.0f;
        gVar2.f53653m = org.telegram.ui.Cells.f1.s(0.0f, 400.0f, 0.5f);
        gVar2.b(new q1.d(this) {
            public final wi f50539b;

            {
                this.f50539b = this;
            }

            @Override
            public final void a(q1.g gVar22, float f10, float f11) {
                switch (r2) {
                    case 0:
                        this.f50539b.invalidate();
                        return;
                    case 1:
                        this.f50539b.invalidate();
                        return;
                    default:
                        this.f50539b.invalidate();
                        return;
                }
            }
        });
        this.f51180z3 = gVar2;
        q1.f fVar3 = new q1.f(0.0f);
        this.A3 = fVar3;
        q1.g gVar3 = new q1.g(fVar3);
        gVar3.h = 0.0f;
        gVar3.f53653m = org.telegram.ui.Cells.f1.s(0.0f, 200.0f, 1.0f);
        gVar3.b(new q1.d(this) {
            public final wi f50539b;

            {
                this.f50539b = this;
            }

            @Override
            public final void a(q1.g gVar22, float f10, float f11) {
                switch (r2) {
                    case 0:
                        this.f50539b.invalidate();
                        return;
                    case 1:
                        this.f50539b.invalidate();
                        return;
                    default:
                        this.f50539b.invalidate();
                        return;
                }
            }
        });
        this.B3 = gVar3;
        this.D3 = new Path();
        this.F3 = 0;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
    }

    public final void A1(Canvas canvas, RectF rectF) {
        float f10;
        boolean z10;
        float f11;
        boolean z11;
        float f12;
        ArrayList arrayList;
        float f13;
        float f14;
        ArrayList arrayList2 = this.f51163h3;
        int size = arrayList2.size();
        wm wmVar = this.G3;
        boolean z12 = true;
        boolean z13 = false;
        if (size > 0) {
            for (int i3 = 0; i3 < size; i3++) {
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) arrayList2.get(i3);
                if (!wm.l2(wmVar, q1Var, rectF)) {
                    canvas.save();
                    canvas.translate(q1Var.R1(false) + q1Var.getLeft(), q1Var.getY() + q1Var.getPaddingTop());
                    if (q1Var.a()) {
                        f14 = q1Var.getAlpha();
                    } else {
                        f14 = 1.0f;
                    }
                    q1Var.x1(f14, canvas, true);
                    canvas.restore();
                }
            }
            arrayList2.clear();
        }
        ArrayList arrayList3 = this.i3;
        int size2 = arrayList3.size();
        if (size2 > 0) {
            for (int i10 = 0; i10 < size2; i10++) {
                org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) arrayList3.get(i10);
                if (!wm.l2(wmVar, q1Var2, rectF)) {
                    float R1 = q1Var2.R1(false) + q1Var2.getLeft();
                    float y9 = q1Var2.getY() + q1Var2.getPaddingTop();
                    if (q1Var2.a()) {
                        f13 = q1Var2.getAlpha();
                    } else {
                        f13 = 1.0f;
                    }
                    canvas.save();
                    canvas.translate(R1, y9);
                    q1Var2.setInvalidatesParent(true);
                    q1Var2.h1(canvas, f13);
                    q1Var2.setInvalidatesParent(false);
                    canvas.restore();
                }
            }
            arrayList3.clear();
        }
        ArrayList arrayList4 = this.f51164j3;
        int size3 = arrayList4.size();
        if (size3 > 0) {
            int i11 = 0;
            while (i11 < size3) {
                org.telegram.ui.Cells.q1 q1Var3 = (org.telegram.ui.Cells.q1) arrayList4.get(i11);
                if (wm.l2(wmVar, q1Var3, rectF)) {
                    arrayList = arrayList4;
                } else {
                    if (q1Var3.getCurrentPosition() != null && (q1Var3.getCurrentPosition().f25149l & z12) == 0) {
                        z11 = z12;
                    } else {
                        z11 = z13;
                    }
                    if (q1Var3.a()) {
                        f12 = q1Var3.getAlpha();
                    } else {
                        f12 = 1.0f;
                    }
                    float R12 = q1Var3.R1(z13) + q1Var3.getLeft();
                    float y10 = q1Var3.getY() + q1Var3.getPaddingTop();
                    canvas.save();
                    org.telegram.messenger.ui currentMessagesGroup = q1Var3.getCurrentMessagesGroup();
                    if (currentMessagesGroup != null) {
                        org.telegram.messenger.ti tiVar = currentMessagesGroup.f25709m;
                        if (tiVar.f25534j) {
                            float R13 = q1Var3.R1(z12);
                            float f15 = tiVar.f25527a + R13 + tiVar.f25530e;
                            arrayList = arrayList4;
                            float f16 = tiVar.f25528b + tiVar.f25531f;
                            float f17 = tiVar.f25529c + R13 + tiVar.f25532g;
                            float f18 = tiVar.d + tiVar.h;
                            if (!tiVar.f25534j) {
                                f16 += q1Var3.getTranslationY();
                                f18 += q1Var3.getTranslationY();
                            }
                            canvas.clipRect(f15 + org.telegram.messenger.g0.L(8.0f), f16 + org.telegram.messenger.g0.L(8.0f), f17 - org.telegram.messenger.g0.L(8.0f), f18 - org.telegram.messenger.g0.L(8.0f));
                        } else {
                            arrayList = arrayList4;
                        }
                    } else {
                        arrayList = arrayList4;
                    }
                    if (q1Var3.getTransitionParams().f30932w0) {
                        canvas.translate(R12, y10);
                        q1Var3.setInvalidatesParent(true);
                        q1Var3.Q0(f12, canvas, z11);
                        q1Var3.setInvalidatesParent(false);
                    }
                    canvas.restore();
                }
                i11++;
                arrayList4 = arrayList;
                z12 = true;
                z13 = false;
            }
            f10 = 8.0f;
            arrayList4.clear();
        } else {
            f10 = 8.0f;
        }
        ArrayList arrayList5 = this.f51165k3;
        int size4 = arrayList5.size();
        if (size4 > 0) {
            for (int i12 = 0; i12 < size4; i12++) {
                org.telegram.ui.Cells.q1 q1Var4 = (org.telegram.ui.Cells.q1) arrayList5.get(i12);
                if (!wm.l2(wmVar, q1Var4, rectF)) {
                    if (q1Var4.getCurrentPosition() != null && (q1Var4.getCurrentPosition().f25149l & 1) == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (q1Var4.a()) {
                        f11 = q1Var4.getAlpha();
                    } else {
                        f11 = 1.0f;
                    }
                    float R14 = q1Var4.R1(false) + q1Var4.getLeft();
                    float y11 = q1Var4.getY() + q1Var4.getPaddingTop();
                    canvas.save();
                    org.telegram.messenger.ui currentMessagesGroup2 = q1Var4.getCurrentMessagesGroup();
                    if (currentMessagesGroup2 != null) {
                        org.telegram.messenger.ti tiVar2 = currentMessagesGroup2.f25709m;
                        if (tiVar2.f25534j) {
                            float R15 = q1Var4.R1(true);
                            float f19 = tiVar2.f25527a + R15 + tiVar2.f25530e;
                            float f20 = tiVar2.f25528b + tiVar2.f25531f;
                            float f21 = tiVar2.f25529c + R15 + tiVar2.f25532g;
                            float f22 = tiVar2.d + tiVar2.h;
                            if (!tiVar2.f25534j) {
                                f20 += q1Var4.getTranslationY();
                                f22 += q1Var4.getTranslationY();
                            }
                            canvas.clipRect(f19 + org.telegram.messenger.g0.L(f10), f20 + org.telegram.messenger.g0.L(f10), f21 - org.telegram.messenger.g0.L(f10), f22 - org.telegram.messenger.g0.L(f10));
                        }
                    }
                    if (!z10 && q1Var4.getTransitionParams().f30932w0) {
                        canvas.translate(R14, y11);
                        q1Var4.setInvalidatesParent(true);
                        q1Var4.o1(canvas, f11, null);
                        q1Var4.V0(canvas, f11);
                        q1Var4.setInvalidatesParent(false);
                    }
                    canvas.restore();
                }
            }
            arrayList5.clear();
        }
    }

    public final void B1(boolean z10) {
        float f10;
        VelocityTracker velocityTracker;
        wm wmVar = this.G3;
        if (z10 && (velocityTracker = wmVar.y9) != null) {
            velocityTracker.computeCurrentVelocity(1000);
            f10 = wmVar.y9.getXVelocity();
        } else {
            f10 = 0.0f;
        }
        VelocityTracker velocityTracker2 = wmVar.y9;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            wmVar.y9 = null;
        }
        wmVar.f51516v9 = false;
        wmVar.C0.R = true;
        org.telegram.ui.Components.n01 n01Var = wmVar.f51407n0;
        if (n01Var != null) {
            n01Var.settle(f10);
        }
    }

    public final void C1(MotionEvent motionEvent) {
        float f10;
        float f11;
        TLRPC.Chat chat;
        org.telegram.messenger.ui S8;
        org.telegram.messenger.zi ziVar;
        boolean z10;
        ArrayList arrayList;
        TLRPC.Chat chat2;
        boolean z11;
        boolean z12;
        boolean z13 = true;
        wm wmVar = this.G3;
        if (motionEvent != null) {
            wmVar.Q4 = true;
        }
        if (wmVar.ea() && wmVar.f51479s9 == null) {
            if (motionEvent == null) {
                if (wmVar.f51516v9) {
                    B1(false);
                }
                wmVar.f51504u9 = false;
            } else {
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 0) {
                    z11 = ((org.telegram.ui.ActionBar.d2) wmVar).inPreviewMode;
                    if (!z11 && !wmVar.y9() && motionEvent.getX() >= getMeasuredWidth() * 0.55f) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    wmVar.f51504u9 = z12;
                    if (!z12) {
                        wmVar.f51516v9 = false;
                    } else {
                        wmVar.f51516v9 = false;
                        wmVar.f51530w9 = motionEvent.getX();
                        wmVar.f51544x9 = motionEvent.getY();
                        VelocityTracker velocityTracker = wmVar.y9;
                        if (velocityTracker != null) {
                            velocityTracker.recycle();
                        }
                        VelocityTracker obtain = VelocityTracker.obtain();
                        wmVar.y9 = obtain;
                        obtain.addMovement(motionEvent);
                        return;
                    }
                } else if (wmVar.f51504u9 || wmVar.f51516v9) {
                    if (actionMasked == 2) {
                        VelocityTracker velocityTracker2 = wmVar.y9;
                        if (velocityTracker2 != null) {
                            velocityTracker2.addMovement(motionEvent);
                        }
                        float x10 = motionEvent.getX() - wmVar.f51530w9;
                        float abs = Math.abs(motionEvent.getY() - wmVar.f51544x9);
                        if (wmVar.f51504u9 && !wmVar.f51516v9 && getScrollState() == 0 && x10 <= (-org.telegram.messenger.g0.a1(true, 0.4f)) && Math.abs(x10) / 3.0f > abs && wmVar.y8() != null) {
                            MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                            super.onInterceptTouchEvent(obtain2);
                            obtain2.recycle();
                            wmVar.C0.R = false;
                            wmVar.f51504u9 = false;
                            wmVar.f51516v9 = true;
                            wmVar.f51530w9 = motionEvent.getX();
                            org.telegram.ui.Components.n01 n01Var = wmVar.f51407n0;
                            ValueAnimator valueAnimator = n01Var.K;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                                n01Var.K = null;
                            }
                            org.telegram.messenger.g0.v1(wmVar.m1);
                            if (getParent() != null) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                                return;
                            }
                            return;
                        } else if (wmVar.f51516v9) {
                            wmVar.f51407n0.setProgress((-(motionEvent.getX() - wmVar.f51530w9)) / wmVar.f51407n0.getContentWidth());
                            return;
                        } else {
                            return;
                        }
                    } else if (actionMasked == 1 || actionMasked == 3) {
                        if (wmVar.f51516v9) {
                            VelocityTracker velocityTracker3 = wmVar.y9;
                            if (velocityTracker3 != null) {
                                velocityTracker3.addMovement(motionEvent);
                            }
                            if (actionMasked != 1) {
                                z13 = false;
                            }
                            B1(z13);
                        }
                        wmVar.f51504u9 = false;
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !wmVar.f51568z9 && !wmVar.f51492t9 && wmVar.f51479s9 == null) {
            z10 = ((org.telegram.ui.ActionBar.d2) wmVar).inPreviewMode;
            if (!z10) {
                View pressedChildView = getPressedChildView();
                if (!(pressedChildView instanceof org.telegram.ui.Cells.q1)) {
                    if (pressedChildView instanceof org.telegram.ui.Cells.t0) {
                        org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) pressedChildView;
                        float x11 = motionEvent.getX() - pressedChildView.getX();
                        float y9 = motionEvent.getY() - pressedChildView.getY();
                        if (t0Var.S()) {
                            org.telegram.ui.Wallet.b4 b4Var = t0Var.J0;
                            float f12 = (x11 - t0Var.L0) - (t0Var.f30400k0 / 2.0f);
                            float paddingTop = (y9 - t0Var.M0) - t0Var.getPaddingTop();
                            org.telegram.ui.Wallet.a4 a4Var = b4Var.f42254m;
                            if (a4Var != null && a4Var.f57750n && b4Var.f42272w.contains((int) f12, (int) paddingTop)) {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                if (wmVar.f51479s9 != null) {
                    wm.d2(wmVar, 0.0f);
                }
                wmVar.f51479s9 = pressedChildView;
                org.telegram.messenger.zi Z1 = wm.Z1(wmVar);
                boolean T6 = wmVar.T6(Z1);
                int i3 = wmVar.f51325g4;
                if ((i3 == 0 || i3 == 5 || i3 == 8 || (i3 == 3 && wmVar.f51475s4 == wmVar.getUserConfig().e())) && (((arrayList = wmVar.f51436p4) == null || !arrayList.contains(Z1)) && ((wmVar.Y8(Z1) != 1 || (org.telegram.messenger.zi.B0(Z1.f26868k) != wmVar.f51272c7 && !Z1.n5())) && ((wmVar.h != null || Z1.f1() >= 0) && (((chat2 = wmVar.f51292e) == null || !org.telegram.messenger.t3.c0(chat2) || T6) && !wmVar.y9() && (!org.telegram.messenger.zi.d3(Z1.f26868k) || !Z1.O3())))))) {
                    this.f51169o3 = motionEvent.getPointerId(0);
                    wmVar.f51492t9 = true;
                    this.f51167m3 = (int) motionEvent.getX();
                    this.f51168n3 = (int) motionEvent.getY();
                    return;
                }
                wm.d2(wmVar, 0.0f);
                wmVar.f51479s9 = null;
                return;
            }
        }
        if (wmVar.f51479s9 != null && motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f51169o3) {
            int max = Math.max(org.telegram.messenger.g0.L(-80.0f), Math.min(0, (int) (motionEvent.getX() - this.f51167m3)));
            int abs2 = Math.abs(((int) motionEvent.getY()) - this.f51168n3);
            if (getScrollState() == 0 && wmVar.f51492t9 && !wmVar.f51568z9 && max <= (-org.telegram.messenger.g0.a1(true, 0.4f)) && Math.abs(max) / 3 > abs2) {
                MotionEvent obtain3 = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                wmVar.f51479s9.onTouchEvent(obtain3);
                super.onInterceptTouchEvent(obtain3);
                obtain3.recycle();
                wmVar.C0.R = false;
                wmVar.f51492t9 = false;
                wmVar.f51568z9 = true;
                this.f51167m3 = (int) motionEvent.getX();
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
            } else if (wmVar.f51568z9) {
                if (Math.abs(max) >= org.telegram.messenger.g0.L(50.0f)) {
                    if (!this.f51173s3) {
                        try {
                            performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        this.f51173s3 = true;
                    }
                } else {
                    this.f51173s3 = false;
                }
                float f13 = max;
                wm.d2(wmVar, f13);
                org.telegram.messenger.zi Z12 = wm.Z1(wmVar);
                if (Z12 != null && (Z12.i4() || org.telegram.messenger.zi.M4(Z12.f26868k))) {
                    wmVar.rd(false, false);
                }
                View view = wmVar.f51479s9;
                if (view instanceof org.telegram.ui.Cells.q1) {
                    D1((org.telegram.ui.Cells.q1) view, f13);
                }
                invalidate();
            }
        } else if (wmVar.f51479s9 != null) {
            if (motionEvent != null) {
                if (motionEvent.getPointerId(0) == this.f51169o3) {
                    if (motionEvent.getAction() != 3 && motionEvent.getAction() != 1 && motionEvent.getAction() != 6) {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (motionEvent != null && motionEvent.getAction() != 3) {
                View view2 = wmVar.f51479s9;
                if (view2 instanceof org.telegram.ui.Cells.q1) {
                    f11 = ((org.telegram.ui.Cells.q1) view2).R1(false);
                } else if (view2 instanceof org.telegram.ui.Cells.t0) {
                    f11 = ((org.telegram.ui.Cells.t0) view2).getWalletSlidingOffset();
                } else {
                    f11 = 0.0f;
                }
                if (Math.abs(f11) >= org.telegram.messenger.g0.L(50.0f)) {
                    org.telegram.messenger.zi Z13 = wm.Z1(wmVar);
                    boolean T62 = wmVar.T6(Z13);
                    qj qjVar = wmVar.f51279d1;
                    if ((qjVar != null && qjVar.getVisibility() == 0 && ((!wmVar.X0 || !T62) && !Z13.V1)) || ((chat = wmVar.f51292e) != null && ((org.telegram.messenger.t3.r0(chat) && !wmVar.da()) || ((org.telegram.messenger.t3.T(wmVar.f51292e) && !org.telegram.messenger.t3.w(5, wmVar.f51292e) && !wmVar.f51292e.megagroup) || !org.telegram.messenger.t3.n(wmVar.f51292e))))) {
                        if (Z13.d1() != 0 && (S8 = wmVar.S8(Z13.d1())) != null && (ziVar = S8.h) != null) {
                            Z13 = ziVar;
                        }
                        wmVar.E5 = Z13;
                        Bundle l10 = org.telegram.ui.Cells.f1.l(3, "onlySelect", "dialogsType", true);
                        l10.putBoolean("quote", true);
                        l10.putBoolean("reply_to", true);
                        long o10 = org.telegram.messenger.m5.o(Z13.b1());
                        int i10 = (o10 > 0L ? 1 : (o10 == 0L ? 0 : -1));
                        if (i10 != 0 && o10 != wmVar.a() && o10 != wmVar.getUserConfig().e() && i10 > 0) {
                            l10.putLong("reply_to_author", o10);
                        }
                        l10.putInt("messagesCount", 1);
                        l10.putBoolean("canSelectTopics", true);
                        uw uwVar = new uw(l10);
                        uwVar.D2 = wmVar;
                        wmVar.presentFragment(uwVar);
                    } else {
                        wmVar.ec(wm.Z1(wmVar));
                    }
                }
            }
            View view3 = wmVar.f51479s9;
            if (view3 instanceof org.telegram.ui.Cells.q1) {
                f10 = ((org.telegram.ui.Cells.q1) view3).getSlidingOffsetX();
            } else if (view3 instanceof org.telegram.ui.Cells.t0) {
                f10 = ((org.telegram.ui.Cells.t0) view3).getWalletSlidingOffset();
            } else {
                f10 = 0.0f;
            }
            this.f51172r3 = f10;
            if (f10 == 0.0f) {
                wmVar.f51479s9 = null;
            }
            this.f51170p3 = System.currentTimeMillis();
            this.f51171q3 = 0.0f;
            invalidate();
            wmVar.f51492t9 = false;
            wmVar.f51568z9 = false;
            wmVar.C0.R = true;
        }
    }

    public final void D1(org.telegram.ui.Cells.q1 q1Var, float f10) {
        org.telegram.messenger.ui currentMessagesGroup = q1Var.getCurrentMessagesGroup();
        if (currentMessagesGroup == null) {
            return;
        }
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt != q1Var && (childAt instanceof org.telegram.ui.Cells.q1)) {
                org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) childAt;
                if (q1Var2.getCurrentMessagesGroup() == currentMessagesGroup) {
                    q1Var2.setSlidingOffset(f10);
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
        if (this.G3.h != null) {
            return null;
        }
        return super.createAccessibilityNodeInfo();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        wm wmVar = this.G3;
        wmVar.J8 = null;
        canvas.save();
        if (wmVar.f51442pa != null && wmVar.la) {
            boolean z10 = wmVar.f51403ma;
        }
        this.F1.setEmpty();
        if (wmVar.f51343ha != 0.0f) {
            int save = canvas.save();
            if (wmVar.f51429oa != 0.0f) {
                f10 = (wmVar.A0.getMeasuredHeight() - wmVar.f51343ha) * wmVar.f51429oa;
            } else {
                f10 = 0.0f;
            }
            float f11 = (-wmVar.f51343ha) - f10;
            wmVar.Ta = f11;
            canvas.translate(0.0f, f11);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wi.draw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r23, android.view.View r24, long r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wi.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override
    public final void j1(View view, float f10, float f11, boolean z10) {
        org.telegram.messenger.ui currentMessagesGroup;
        super.j1(view, f10, f11, z10);
        if (view instanceof org.telegram.ui.Cells.q1) {
            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
            org.telegram.messenger.zi messageObject = q1Var.getMessageObject();
            if (!messageObject.J3() && !messageObject.V2() && (currentMessagesGroup = q1Var.getCurrentMessagesGroup()) != null) {
                int childCount = getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = getChildAt(i3);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wi.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        if (this.G3.h == null) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            AccessibilityNodeInfo.CollectionInfo collectionInfo = accessibilityNodeInfo.getCollectionInfo();
            if (collectionInfo != null) {
                accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(collectionInfo.getRowCount(), 1, false));
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        xh.j jVar;
        org.telegram.ui.ActionBar.k kVar;
        wm wmVar = this.G3;
        ll llVar = wmVar.r9;
        llVar.getClass();
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            org.telegram.messenger.g0.r(llVar.f30669f0);
            llVar.f30695z = false;
        }
        if (!this.W1 && ((jVar = wmVar.f51467ra) == null || !jVar.a())) {
            boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
            kVar = ((org.telegram.ui.ActionBar.d2) wmVar).actionBar;
            if (!kVar.v() && !wmVar.W9()) {
                C1(motionEvent);
                if (onInterceptTouchEvent || wmVar.f51516v9) {
                    return true;
                }
            } else {
                return onInterceptTouchEvent;
            }
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        int i13 = this.f51162g3;
        int i14 = i11 - i3;
        wm wmVar = this.G3;
        if (i13 != i14) {
            if (i13 != 0) {
                wmVar.E9(false);
            }
            this.f51162g3 = i14;
        }
        int measuredHeight = getMeasuredHeight();
        if (this.F3 != measuredHeight) {
            this.E3 = true;
            yi yiVar = wmVar.B0;
            if (yiVar != null) {
                yiVar.g();
            }
            wmVar.f51392l9.a();
            this.E3 = false;
            this.F3 = measuredHeight;
        }
        wmVar.f51351i6 = false;
        ll llVar = wmVar.r9;
        if (llVar != null && llVar.x()) {
            wmVar.r9.w();
        }
        wmVar.L9();
        wmVar.ba();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        to toVar;
        wm wmVar = this.G3;
        qe.a aVar = wmVar.Zc;
        ll llVar = wmVar.r9;
        llVar.getClass();
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            org.telegram.messenger.g0.r(llVar.f30669f0);
            llVar.f30695z = false;
        }
        if (motionEvent.getAction() == 0) {
            wmVar.Ma = true;
        }
        if (wmVar.f51343ha != 0.0f && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            float min = Math.min(1.0f, wmVar.f51343ha / org.telegram.messenger.g0.L(110.0f));
            if (motionEvent.getAction() == 1 && min == 1.0f && (toVar = wmVar.f51369ja) != null && !toVar.S) {
                if (toVar.L != 1.0f) {
                    float f10 = wmVar.f51343ha;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, org.telegram.messenger.g0.L(8.0f) + f10);
                    wmVar.f51380ka = ofFloat;
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                        public final wi f50092b;

                        {
                            this.f50092b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    wm wmVar2 = this.f50092b.G3;
                                    wmVar2.f51343ha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    wmVar2.A0.invalidate();
                                    return;
                                case 1:
                                    wm wmVar3 = this.f50092b.G3;
                                    wmVar3.f51343ha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    wmVar3.A0.invalidate();
                                    return;
                                case 2:
                                    wm wmVar4 = this.f50092b.G3;
                                    wmVar4.f51343ha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    wmVar4.A0.invalidate();
                                    return;
                                default:
                                    wm wmVar5 = this.f50092b.G3;
                                    wmVar5.f51343ha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    wmVar5.A0.invalidate();
                                    return;
                            }
                        }
                    });
                    ofFloat.setDuration(200L);
                    org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.f40452f;
                    ofFloat.setInterpolator(xqVar);
                    ofFloat.start();
                    final to toVar2 = wmVar.f51369ja;
                    xg xgVar = new xg(this, 3);
                    AnimatorSet animatorSet = toVar2.K;
                    if (animatorSet != null) {
                        animatorSet.removeAllListeners();
                        toVar2.K.cancel();
                    }
                    toVar2.Z = xgVar;
                    toVar2.K = new AnimatorSet();
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(toVar2.L, 1.0f);
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    to toVar3 = toVar2;
                                    toVar3.getClass();
                                    toVar3.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    toVar3.U.invalidate();
                                    View view = toVar3.f49839b0;
                                    if (view != null) {
                                        view.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    to toVar4 = toVar2;
                                    toVar4.getClass();
                                    toVar4.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view2 = toVar4.f49839b0;
                                    if (view2 != null) {
                                        view2.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(toVar2.M, 0.0f);
                    ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    to toVar3 = toVar2;
                                    toVar3.getClass();
                                    toVar3.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    toVar3.U.invalidate();
                                    View view = toVar3.f49839b0;
                                    if (view != null) {
                                        view.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    to toVar4 = toVar2;
                                    toVar4.getClass();
                                    toVar4.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view2 = toVar4.f49839b0;
                                    if (view2 != null) {
                                        view2.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    toVar2.K.addListener(new org.telegram.ui.Cells.w9(toVar2, 9));
                    toVar2.K.playTogether(ofFloat2, ofFloat3);
                    toVar2.K.setDuration(120L);
                    toVar2.K.setInterpolator(xqVar);
                    toVar2.K.start();
                } else {
                    wm.e2(wmVar);
                }
            } else {
                to toVar3 = wmVar.f51369ja;
                if (toVar3 != null && toVar3.S) {
                    long currentTimeMillis = System.currentTimeMillis();
                    to toVar4 = wmVar.f51369ja;
                    if (currentTimeMillis - toVar4.V < 500 && toVar4.N) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        wmVar.f51380ka = animatorSet2;
                        if (wmVar.f51369ja != null) {
                            aVar.a(false, true);
                        }
                        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(wmVar.f51343ha, org.telegram.messenger.g0.L(111.0f));
                        ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final wi f50092b;

                            {
                                this.f50092b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        wm wmVar2 = this.f50092b.G3;
                                        wmVar2.f51343ha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        wmVar2.A0.invalidate();
                                        return;
                                    case 1:
                                        wm wmVar3 = this.f50092b.G3;
                                        wmVar3.f51343ha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        wmVar3.A0.invalidate();
                                        return;
                                    case 2:
                                        wm wmVar4 = this.f50092b.G3;
                                        wmVar4.f51343ha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        wmVar4.A0.invalidate();
                                        return;
                                    default:
                                        wm wmVar5 = this.f50092b.G3;
                                        wmVar5.f51343ha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        wmVar5.A0.invalidate();
                                        return;
                                }
                            }
                        });
                        ofFloat4.setDuration(400L);
                        ofFloat4.setInterpolator(org.telegram.ui.Components.xq.f40452f);
                        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(org.telegram.messenger.g0.L(111.0f), 0.0f);
                        ofFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final wi f50092b;

                            {
                                this.f50092b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        wm wmVar2 = this.f50092b.G3;
                                        wmVar2.f51343ha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        wmVar2.A0.invalidate();
                                        return;
                                    case 1:
                                        wm wmVar3 = this.f50092b.G3;
                                        wmVar3.f51343ha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        wmVar3.A0.invalidate();
                                        return;
                                    case 2:
                                        wm wmVar4 = this.f50092b.G3;
                                        wmVar4.f51343ha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        wmVar4.A0.invalidate();
                                        return;
                                    default:
                                        wm wmVar5 = this.f50092b.G3;
                                        wmVar5.f51343ha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        wmVar5.A0.invalidate();
                                        return;
                                }
                            }
                        });
                        ofFloat5.setStartDelay(600L);
                        ofFloat5.setDuration(250L);
                        ofFloat5.setInterpolator(ni.l.V);
                        animatorSet2.playSequentially(ofFloat4, ofFloat5);
                        animatorSet2.start();
                    }
                }
                ValueAnimator ofFloat6 = ValueAnimator.ofFloat(wmVar.f51343ha, 0.0f);
                wmVar.f51380ka = ofFloat6;
                if (wmVar.f51369ja != null) {
                    aVar.a(false, true);
                }
                ofFloat6.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final wi f50092b;

                    {
                        this.f50092b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (r2) {
                            case 0:
                                wm wmVar2 = this.f50092b.G3;
                                wmVar2.f51343ha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                wmVar2.A0.invalidate();
                                return;
                            case 1:
                                wm wmVar3 = this.f50092b.G3;
                                wmVar3.f51343ha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                wmVar3.A0.invalidate();
                                return;
                            case 2:
                                wm wmVar4 = this.f50092b.G3;
                                wmVar4.f51343ha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                wmVar4.A0.invalidate();
                                return;
                            default:
                                wm wmVar5 = this.f50092b.G3;
                                wmVar5.f51343ha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                wmVar5.A0.invalidate();
                                return;
                        }
                    }
                });
                ofFloat6.setDuration(250L);
                ofFloat6.setInterpolator(ni.l.V);
                ofFloat6.start();
            }
        }
        if (!this.W1) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            kVar = ((org.telegram.ui.ActionBar.d2) wmVar).actionBar;
            if (!kVar.v() && !wmVar.W9()) {
                C1(motionEvent);
                if (wmVar.f51568z9 || wmVar.f51516v9 || onTouchEvent) {
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
        if (this.G3.f51316f9 != null) {
            return false;
        }
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        org.telegram.ui.Components.gk0 Z3;
        org.telegram.ui.Components.h71 h71Var;
        super.requestDisallowInterceptTouchEvent(z10);
        View view = this.G3.f51479s9;
        if (view != null) {
            if ((view instanceof org.telegram.ui.Cells.q1) && (Z3 = ((org.telegram.ui.Cells.q1) view).Z3()) != null && (h71Var = Z3.f34132e0) != null && Z3.f34133f0 && h71Var.f34337w && !h71Var.E) {
                if (h71Var.f34338x) {
                    if (!h71Var.f34339y && (h71Var.L & 3) != 1) {
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
        if (this.E3) {
            return;
        }
        kh.a aVar = this.G3.f51469rc;
        if (aVar.f17252b != 0) {
            int childCount = aVar.f17251a.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                aVar.f17251a.getChildAt(i3).forceLayout();
            }
        }
        super.requestLayout();
    }

    @Override
    public final void setItemAnimator(u4.m0 m0Var) {
        if (this.W1) {
            return;
        }
        super.setItemAnimator(m0Var);
    }

    @Override
    public final void setTranslationY(float f10) {
        if (f10 != getTranslationY()) {
            super.setTranslationY(f10);
            wm wmVar = this.G3;
            wmVar.K9();
            wmVar.M9();
        }
    }

    public final void z1(Canvas canvas, RectF rectF) {
        int i3;
        int i10;
        float f10;
        char c2;
        wm wmVar;
        float f11;
        org.telegram.messenger.ui uiVar;
        int i11;
        float f12;
        int i12;
        boolean z10;
        org.telegram.messenger.ui uiVar2;
        int i13;
        ArrayList arrayList;
        org.telegram.messenger.ti tiVar;
        boolean z11;
        char c10;
        int i14;
        org.telegram.messenger.ui currentMessagesGroup;
        int i15;
        int i16;
        boolean z12;
        org.telegram.ui.ActionBar.k kVar;
        int measuredHeight;
        int i17;
        int i18;
        org.telegram.ui.ActionBar.k kVar2;
        int measuredHeight2;
        wi wiVar = this;
        Canvas canvas2 = canvas;
        int childCount = wiVar.getChildCount();
        org.telegram.messenger.ui uiVar3 = null;
        int i19 = 0;
        while (true) {
            i3 = 8;
            i10 = 2;
            f10 = 0.0f;
            c2 = 0;
            wmVar = wiVar.G3;
            if (i19 < childCount) {
                View childAt = wiVar.getChildAt(i19);
                f11 = 1.0f;
                if (childAt.getVisibility() != 4 && childAt.getVisibility() != 8) {
                    if (!wm.l2(wmVar, childAt, rectF)) {
                        if (childAt instanceof org.telegram.ui.Cells.y1) {
                            canvas2.save();
                            canvas2.translate(childAt.getX(), childAt.getY());
                            ((org.telegram.ui.Cells.y1) childAt).a(canvas2);
                            canvas2.restore();
                        } else if (wmVar.D0.f45296n && (childAt instanceof org.telegram.ui.Cells.f0)) {
                            float measuredHeight3 = ((((wiVar.getMeasuredHeight() - wmVar.M9) - wmVar.Va) / 2.0f) - (childAt.getMeasuredHeight() / 2)) + wmVar.M9;
                            if (!((org.telegram.ui.Cells.f0) childAt).J && !wmVar.A0.W1) {
                                if (childAt.getTop() > measuredHeight3) {
                                    childAt.setTranslationY(measuredHeight3 - childAt.getTop());
                                } else {
                                    childAt.setTranslationY(0.0f);
                                }
                            }
                        } else if (childAt instanceof org.telegram.ui.Cells.ra) {
                            float measuredHeight4 = ((((wiVar.getMeasuredHeight() - wmVar.M9) - wmVar.Va) / 2.0f) - (childAt.getMeasuredHeight() / 2)) + wmVar.M9;
                            if (!((org.telegram.ui.Cells.ra) childAt).P && !wmVar.A0.W1) {
                                if (childAt.getTop() > measuredHeight4) {
                                    childAt.setTranslationY(measuredHeight4 - childAt.getTop());
                                } else {
                                    childAt.setTranslationY(0.0f);
                                }
                            }
                        } else {
                            if (childAt instanceof org.telegram.ui.Cells.q1) {
                                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                                org.telegram.messenger.ui currentMessagesGroup2 = q1Var.getCurrentMessagesGroup();
                                if (currentMessagesGroup2 != null && currentMessagesGroup2 == uiVar3) {
                                    i16 = i19;
                                    z12 = true;
                                } else {
                                    org.telegram.messenger.ri currentPosition = q1Var.getCurrentPosition();
                                    org.telegram.ui.Components.e90 backgroundDrawable = q1Var.getBackgroundDrawable();
                                    if ((!backgroundDrawable.f33321f && !q1Var.y2()) || (currentPosition != null && (2 & currentPosition.f25149l) == 0)) {
                                        i16 = i19;
                                        z12 = true;
                                    } else {
                                        boolean z13 = q1Var.f30126w6;
                                        org.telegram.ui.ActionBar.e6 e6Var = wiVar.f38460o2;
                                        z12 = true;
                                        if (z13 || q1Var.f30140x6) {
                                            i16 = i19;
                                            if (currentPosition == null) {
                                                Paint W0 = wiVar.W0("paintChatMessageBackgroundSelected");
                                                um umVar = wmVar.f51557ya;
                                                if ((umVar != null && umVar.f50134q) || W0 == null) {
                                                    W0 = org.telegram.ui.ActionBar.k6.f27819a2;
                                                    W0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28221vd, e6Var));
                                                } else {
                                                    if (!wmVar.T9()) {
                                                        kVar = ((org.telegram.ui.ActionBar.d2) wmVar).actionBar;
                                                        measuredHeight = kVar.getMeasuredHeight();
                                                    } else {
                                                        measuredHeight = wmVar.A0.getTop();
                                                    }
                                                    float backgroundTranslationY = measuredHeight - wmVar.m1.getBackgroundTranslationY();
                                                    int backgroundSizeY = wmVar.m1.getBackgroundSizeY();
                                                    um umVar2 = wmVar.f51557ya;
                                                    if (umVar2 != null) {
                                                        umVar2.b(q1Var.getX(), backgroundTranslationY, wiVar.getMeasuredWidth(), backgroundSizeY);
                                                    } else {
                                                        org.telegram.ui.ActionBar.k6.r(q1Var.getX(), backgroundTranslationY, wiVar.getMeasuredWidth(), backgroundSizeY);
                                                    }
                                                }
                                                Paint paint = W0;
                                                canvas2.save();
                                                canvas2.translate(0.0f, q1Var.getTranslationY());
                                                int alpha = paint.getAlpha();
                                                paint.setAlpha((int) (q1Var.getAlpha() * q1Var.getHighlightAlpha() * alpha));
                                                canvas2.drawRect(0.0f, q1Var.getTop(), wiVar.getMeasuredWidth(), q1Var.getBottom(), paint);
                                                paint.setAlpha(alpha);
                                                canvas2.restore();
                                            }
                                        } else {
                                            int y9 = (int) q1Var.getY();
                                            canvas2.save();
                                            if (currentPosition == null) {
                                                i17 = q1Var.getMeasuredHeight();
                                                i16 = i19;
                                            } else {
                                                int measuredHeight5 = q1Var.getMeasuredHeight() + y9;
                                                long j10 = 0;
                                                float f13 = 0.0f;
                                                int i20 = 0;
                                                while (i20 < childCount) {
                                                    View childAt2 = wiVar.getChildAt(i20);
                                                    int i21 = i19;
                                                    if (childAt2 instanceof org.telegram.ui.Cells.q1) {
                                                        org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) childAt2;
                                                        if (q1Var2.getCurrentMessagesGroup() == currentMessagesGroup2) {
                                                            org.telegram.ui.Components.e90 backgroundDrawable2 = q1Var2.getBackgroundDrawable();
                                                            i18 = i20;
                                                            y9 = Math.min(y9, (int) q1Var2.getY());
                                                            measuredHeight5 = Math.max(measuredHeight5, q1Var2.getMeasuredHeight() + ((int) q1Var2.getY()));
                                                            long j11 = backgroundDrawable2.f33326l;
                                                            if (j11 > j10) {
                                                                j10 = j11;
                                                                f10 = q1Var2.getX() + backgroundDrawable2.h;
                                                                f13 = q1Var2.getY() + backgroundDrawable2.f33323i;
                                                            }
                                                            i20 = i18 + 1;
                                                            i19 = i21;
                                                        }
                                                    }
                                                    i18 = i20;
                                                    i20 = i18 + 1;
                                                    i19 = i21;
                                                }
                                                i16 = i19;
                                                backgroundDrawable.f33324j = f10;
                                                backgroundDrawable.f33325k = f13 - y9;
                                                i17 = measuredHeight5 - y9;
                                            }
                                            int i22 = i17 + y9;
                                            canvas2.clipRect(0, y9, wiVar.getMeasuredWidth(), i22);
                                            Paint W02 = wiVar.W0("paintChatMessageBackgroundSelected");
                                            um umVar3 = wmVar.f51557ya;
                                            if (umVar3 != null && !umVar3.f50134q && W02 != null) {
                                                backgroundDrawable.f33318b = W02;
                                                if (!wmVar.T9()) {
                                                    kVar2 = ((org.telegram.ui.ActionBar.d2) wmVar).actionBar;
                                                    measuredHeight2 = kVar2.getMeasuredHeight();
                                                } else {
                                                    measuredHeight2 = wmVar.A0.getTop();
                                                }
                                                float backgroundTranslationY2 = measuredHeight2 - wmVar.m1.getBackgroundTranslationY();
                                                int backgroundSizeY2 = wmVar.m1.getBackgroundSizeY();
                                                um umVar4 = wmVar.f51557ya;
                                                if (umVar4 != null) {
                                                    umVar4.b(q1Var.getX(), backgroundTranslationY2, wiVar.getMeasuredWidth(), backgroundSizeY2);
                                                } else {
                                                    org.telegram.ui.ActionBar.k6.r(q1Var.getX(), backgroundTranslationY2, wiVar.getMeasuredWidth(), backgroundSizeY2);
                                                }
                                            } else {
                                                backgroundDrawable.f33318b = null;
                                                backgroundDrawable.f33317a.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28221vd, e6Var));
                                            }
                                            backgroundDrawable.setBounds(0, y9, wiVar.getMeasuredWidth(), i22);
                                            backgroundDrawable.draw(canvas2);
                                            canvas2.restore();
                                        }
                                    }
                                    uiVar3 = currentMessagesGroup2;
                                }
                                if (wmVar.Y8 != q1Var && currentMessagesGroup2 == null && q1Var.L0()) {
                                    canvas2.save();
                                    canvas2.translate(q1Var.getX(), q1Var.getY() + q1Var.getPaddingTop());
                                    if (q1Var.getScaleX() != 1.0f) {
                                        canvas2.scale(q1Var.getScaleX(), q1Var.getScaleY(), q1Var.getPivotX(), q1Var.getHeight() >> 1);
                                    }
                                    q1Var.M0(canvas2, z12, false);
                                    canvas2.restore();
                                }
                            } else {
                                i16 = i19;
                                if (childAt instanceof org.telegram.ui.Cells.t0) {
                                    org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) childAt;
                                    if (t0Var.Q()) {
                                        canvas2.save();
                                        canvas2.translate(t0Var.getX(), t0Var.getY() + t0Var.getPaddingTop());
                                        canvas2.scale(t0Var.getScaleX(), t0Var.getScaleY(), t0Var.getMeasuredWidth() / 2.0f, t0Var.getMeasuredHeight() / 2.0f);
                                        canvas2.translate(wmVar.l9() / 2.0f, 0.0f);
                                        t0Var.G(canvas2, true);
                                        t0Var.I(canvas2, true);
                                        canvas2.restore();
                                    }
                                }
                            }
                            i19 = i16 + 1;
                        }
                    }
                }
                i16 = i19;
                i19 = i16 + 1;
            } else {
                f11 = 1.0f;
                break;
            }
        }
        View view = wmVar.Y8;
        if (view instanceof org.telegram.ui.Cells.q1) {
            uiVar = ((org.telegram.ui.Cells.q1) view).getCurrentMessagesGroup();
        } else {
            uiVar = null;
        }
        int i23 = 0;
        while (i23 < 3) {
            ArrayList arrayList2 = wiVar.f51166l3;
            arrayList2.clear();
            if (i23 == i10 && !wmVar.A0.W1) {
                i11 = i3;
                i12 = i10;
                f12 = f10;
            } else {
                int i24 = 0;
                while (i24 < childCount) {
                    View childAt3 = wmVar.A0.getChildAt(i24);
                    if (childAt3 instanceof org.telegram.ui.Cells.q1) {
                        org.telegram.ui.Cells.q1 q1Var3 = (org.telegram.ui.Cells.q1) childAt3;
                        if (childAt3.getY() <= wmVar.A0.getHeight() && childAt3.getY() + childAt3.getHeight() >= f10 && q1Var3.getVisibility() != i3 && (currentMessagesGroup = q1Var3.getCurrentMessagesGroup()) != null) {
                            org.telegram.messenger.ti tiVar2 = currentMessagesGroup.f25709m;
                            if (i23 == 0) {
                                i14 = i3;
                                i15 = 1;
                                if (currentMessagesGroup.d.size() == 1) {
                                    i24++;
                                    i3 = i14;
                                    i10 = 2;
                                    f10 = 0.0f;
                                }
                            } else {
                                i14 = i3;
                                i15 = 1;
                            }
                            if ((i23 != i15 || tiVar2.f25533i) && ((i23 != 0 || !q1Var3.getMessageObject().Z) && ((i23 != 1 || q1Var3.getMessageObject().Z) && ((i23 != i10 || q1Var3.f30156ya) && (i23 == i10 || !q1Var3.f30156ya))))) {
                                if (!arrayList2.contains(currentMessagesGroup)) {
                                    tiVar2.f25527a = 0;
                                    tiVar2.f25528b = 0;
                                    tiVar2.f25529c = 0;
                                    tiVar2.d = 0;
                                    tiVar2.f25536l = false;
                                    tiVar2.f25535k = false;
                                    tiVar2.f25537m = q1Var3;
                                    arrayList2.add(currentMessagesGroup);
                                }
                                tiVar2.f25535k = q1Var3.H2();
                                tiVar2.f25536l = q1Var3.G2();
                                int backgroundDrawableLeft = q1Var3.getBackgroundDrawableLeft() + q1Var3.getLeft();
                                int backgroundDrawableRight = q1Var3.getBackgroundDrawableRight() + q1Var3.getLeft();
                                int backgroundDrawableTop = q1Var3.getBackgroundDrawableTop() + q1Var3.getPaddingTop() + q1Var3.getTop();
                                int backgroundDrawableBottom = q1Var3.getBackgroundDrawableBottom() + q1Var3.getPaddingTop() + q1Var3.getTop();
                                if ((q1Var3.getCurrentPosition().f25149l & 4) == 0) {
                                    backgroundDrawableTop -= org.telegram.messenger.g0.L(10.0f);
                                }
                                int i25 = backgroundDrawableTop;
                                if ((q1Var3.getCurrentPosition().f25149l & 8) == 0) {
                                    backgroundDrawableBottom = org.telegram.messenger.g0.L(10.0f) + backgroundDrawableBottom;
                                }
                                int i26 = backgroundDrawableBottom;
                                if (q1Var3.f30156ya) {
                                    tiVar2.f25537m = q1Var3;
                                }
                                int i27 = tiVar2.f25528b;
                                if (i27 == 0 || i25 < i27) {
                                    tiVar2.f25528b = i25;
                                }
                                int i28 = tiVar2.d;
                                if (i28 == 0 || i26 > i28) {
                                    tiVar2.d = i26;
                                }
                                int i29 = tiVar2.f25527a;
                                if (i29 == 0 || backgroundDrawableLeft < i29) {
                                    tiVar2.f25527a = backgroundDrawableLeft;
                                }
                                int i30 = tiVar2.f25529c;
                                if (i30 == 0 || backgroundDrawableRight > i30) {
                                    tiVar2.f25529c = backgroundDrawableRight;
                                }
                            }
                            i24++;
                            i3 = i14;
                            i10 = 2;
                            f10 = 0.0f;
                        }
                    }
                    i14 = i3;
                    i24++;
                    i3 = i14;
                    i10 = 2;
                    f10 = 0.0f;
                }
                i11 = i3;
                int i31 = 0;
                while (i31 < arrayList2.size()) {
                    org.telegram.messenger.ui uiVar4 = (org.telegram.messenger.ui) arrayList2.get(i31);
                    org.telegram.messenger.ti tiVar3 = uiVar4.f25709m;
                    ArrayList arrayList3 = uiVar4.d;
                    float R1 = tiVar3.f25537m.R1(true);
                    float f14 = tiVar3.f25527a + R1 + tiVar3.f25530e;
                    float f15 = tiVar3.f25528b + tiVar3.f25531f;
                    float f16 = tiVar3.f25532g + tiVar3.f25529c + R1;
                    float f17 = tiVar3.d + tiVar3.h;
                    if (!tiVar3.f25534j) {
                        f15 += tiVar3.f25537m.getTranslationY();
                        f17 += tiVar3.f25537m.getTranslationY();
                    }
                    float f18 = f15;
                    if (f17 > org.telegram.messenger.g0.L(20.0f) + wmVar.A0.getMeasuredHeight()) {
                        f17 = org.telegram.messenger.g0.L(20.0f) + wmVar.A0.getMeasuredHeight();
                    }
                    if (tiVar3.f25537m.getScaleX() == f11 && tiVar3.f25537m.getScaleY() == f11) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z10) {
                        canvas2.save();
                        uiVar2 = uiVar4;
                        i13 = i23;
                        arrayList = arrayList2;
                        canvas2.scale(tiVar3.f25537m.getScaleX(), tiVar3.f25537m.getScaleY(), com.google.android.recaptcha.internal.a.z(f16, f14, 2.0f, f14), com.google.android.recaptcha.internal.a.z(f17, f18, 2.0f, f18));
                    } else {
                        uiVar2 = uiVar4;
                        i13 = i23;
                        arrayList = arrayList2;
                    }
                    int size = arrayList3.size();
                    int i32 = 0;
                    while (true) {
                        if (i32 < size) {
                            org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) arrayList3.get(i32);
                            tiVar = tiVar3;
                            if (org.telegram.messenger.zi.B0(ziVar.f26868k) == wmVar.f51376k6) {
                                c10 = 0;
                            } else {
                                c10 = 1;
                            }
                            if (wmVar.f51412n6[c10].indexOfKey(ziVar.f1()) < 0) {
                                z11 = false;
                                break;
                            } else {
                                i32++;
                                tiVar3 = tiVar;
                            }
                        } else {
                            tiVar = tiVar3;
                            z11 = true;
                            break;
                        }
                    }
                    float f19 = f17;
                    wm wmVar2 = wmVar;
                    boolean z14 = z11;
                    org.telegram.messenger.ui uiVar5 = uiVar2;
                    tiVar.f25537m.K0(canvas, (int) f14, (int) f18, (int) f16, (int) f17, tiVar.f25535k, tiVar.f25536l, z14, 0);
                    if (uiVar5 != uiVar) {
                        tiVar.f25537m = null;
                    }
                    tiVar.f25539o = uiVar5.f25701c;
                    if (z10) {
                        canvas.restore();
                        for (int i33 = 0; i33 < childCount; i33++) {
                            View childAt4 = wmVar2.A0.getChildAt(i33);
                            if (childAt4 instanceof org.telegram.ui.Cells.q1) {
                                org.telegram.ui.Cells.q1 q1Var4 = (org.telegram.ui.Cells.q1) childAt4;
                                if (q1Var4.getCurrentMessagesGroup() == uiVar5) {
                                    int left = q1Var4.getLeft();
                                    int top = q1Var4.getTop();
                                    childAt4.setPivotX(((f16 - f14) / 2.0f) + (f14 - left));
                                    childAt4.setPivotY(((f19 - f18) / 2.0f) + (f18 - top));
                                }
                            }
                        }
                    }
                    i31++;
                    canvas2 = canvas;
                    wmVar = wmVar2;
                    i23 = i13;
                    arrayList2 = arrayList;
                    c2 = 0;
                }
                f12 = 0.0f;
                i12 = 2;
            }
            canvas2 = canvas;
            wmVar = wmVar;
            i3 = i11;
            f10 = f12;
            i10 = i12;
            c2 = c2;
            i23++;
            wiVar = this;
        }
    }
}
