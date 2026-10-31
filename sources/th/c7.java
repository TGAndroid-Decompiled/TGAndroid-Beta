package th;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.zs;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.mj0;
import org.telegram.ui.Components.uu0;
import org.telegram.ui.dg0;
public final class c7 extends uu0 {
    public float f48847f0;
    public float f48848g0;
    public float f48849h0;
    public final float[] f48850i0;
    public final Path f48851j0;
    public final RectF f48852k0;
    public final RectF f48853l0;
    public final RectF m0;
    public final RectF f48854n0;
    public final RectF f48855o0;
    public final SparseArray f48856p0;
    public final org.telegram.ui.ActionBar.k2 f48857q0;
    public final o7 f48858r0;

    public c7(o7 o7Var, Context context, org.telegram.ui.ActionBar.k2 k2Var) {
        super(context, null);
        this.f48858r0 = o7Var;
        this.f48857q0 = k2Var;
        this.f48850i0 = new float[8];
        this.f48851j0 = new Path();
        this.f48852k0 = new RectF();
        this.f48853l0 = new RectF();
        this.m0 = new RectF();
        this.f48854n0 = new RectF();
        this.f48855o0 = new RectF();
        this.f48856p0 = new SparseArray();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r30) {
        throw new UnsupportedOperationException("Method not decompiled: th.c7.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        o7 o7Var = this.f48858r0;
        if (keyCode != 24 && keyEvent.getKeyCode() != 25) {
            if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                o7Var.p();
                return true;
            }
            return super.dispatchKeyEventPreIme(keyEvent);
        }
        o7Var.F(keyEvent);
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        float floatValue;
        int i10;
        e7 e7Var;
        int i11;
        mj0 mj0Var;
        o7 o7Var = this.f48858r0;
        float[] fArr = o7Var.f49321o0;
        z2 currentPeerView = o7Var.f49319n0.getCurrentPeerView();
        if (currentPeerView != null) {
            k2 k2Var = currentPeerView.f49759t0;
            if (k2Var.W.x()) {
                float x10 = currentPeerView.getX();
                float y3 = ((View) currentPeerView.getParent()).getY() + currentPeerView.getY();
                motionEvent.offsetLocation(-x10, -y3);
                if (!k2Var.W.n(currentPeerView.getContext()).onTouchEvent(motionEvent)) {
                    motionEvent.offsetLocation(x10, y3);
                }
                return true;
            }
        }
        float f7 = 0.0f;
        if (o7Var.f49324p1 && currentPeerView != null && (mj0Var = currentPeerView.f49692a3) != null) {
            float f10 = 0.0f;
            for (View view = currentPeerView; view != null && (view.getParent() instanceof View); view = (View) view.getParent()) {
                f7 += view.getX();
                f10 += view.getY();
            }
            if (currentPeerView.f49692a3.getReactionsWindow() != null && currentPeerView.f49692a3.getReactionsWindow().f48277c != null) {
                motionEvent.offsetLocation(-f7, (-f10) - currentPeerView.f49692a3.getReactionsWindow().f48277c.getTranslationY());
                currentPeerView.f49692a3.getReactionsWindow().f48277c.dispatchTouchEvent(motionEvent);
                return true;
            }
            Rect rect = org.telegram.messenger.i0.Q;
            mj0Var.getHitRect(rect);
            rect.offset((int) f7, (int) f10);
            if (motionEvent.getAction() == 0 && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                currentPeerView.Z0(false);
                return true;
            }
            motionEvent.offsetLocation(-rect.left, -rect.top);
            mj0Var.dispatchTouchEvent(motionEvent);
            return true;
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            z10 = false;
        } else {
            o7Var.f49312j0 = false;
            org.telegram.messenger.i0.r(o7Var.f49295b1);
            float f11 = o7Var.X;
            if (f11 != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, 0.0f);
                o7Var.G = ofFloat;
                ofFloat.addUpdateListener(new z6(this, 0));
                o7Var.G.addListener(new a7(this, 0));
                o7Var.G.setDuration(250L);
                o7Var.G.setInterpolator(gr.f26495f);
                o7Var.G.start();
            }
            if (o7Var.V >= 0.3f) {
                o7Var.D(true);
            }
            o7Var.Y(false);
            o7Var.Z(false);
            z10 = true;
        }
        if (motionEvent.getAction() == 0) {
            o7Var.f49291a0 = false;
            if (currentPeerView != null) {
                dg0 dg0Var = currentPeerView.f49713h0;
                t6 t6Var = currentPeerView.f49729l0;
                g2 g2Var = currentPeerView.L0;
                vh.p2 p2Var = currentPeerView.f49739o0;
                if (p2Var != null && p2Var.V && t6Var != null) {
                    if (!p2Var.f51747r0.contains(motionEvent.getX() - (currentPeerView.f49739o0.getX() + (g2Var.getX() + currentPeerView.getX())), motionEvent.getY() - (currentPeerView.f49739o0.getY() + (g2Var.getY() + currentPeerView.getY()))) && !currentPeerView.F0(t6Var, motionEvent)) {
                        currentPeerView.f49739o0.e(true);
                    }
                }
                vh.p2 p2Var2 = currentPeerView.f49743p0;
                if (p2Var2 != null && p2Var2.V && dg0Var != null && !p2Var2.f51747r0.contains(motionEvent.getX() - (currentPeerView.f49743p0.getX() + (g2Var.getX() + currentPeerView.getX())), motionEvent.getY() - (currentPeerView.f49743p0.getY() + (g2Var.getY() + currentPeerView.getY()))) && !currentPeerView.F0(dg0Var, motionEvent)) {
                    currentPeerView.f49743p0.e(true);
                }
            }
            o7Var.f49319n0.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
        }
        if (!o7Var.f49344y && !o7Var.H0 && !o7Var.I0) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i12 = (o7Var.f49301e0 > 0.0f ? 1 : (o7Var.f49301e0 == 0.0f ? 0 : -1));
        SparseArray sparseArray = this.f48856p0;
        if (i12 == 0 && !o7Var.f49312j0 && o7Var.f49319n0.F0 == 1 && motionEvent.getAction() == 2 && z11 && (((((Float) sparseArray.get(motionEvent.getPointerId(0), Float.valueOf(0.0f))).floatValue() - motionEvent.getX(0)) != 0.0f && (((i11 = (e7Var = o7Var.f49319n0).I0) == 0 && e7Var.K0 == 0.0f && floatValue < 0.0f) || (i11 == e7Var.getAdapter().b() - 1 && e7Var.K0 == 0.0f && i10 > 0))) || o7Var.X != 0.0f)) {
            float f12 = o7Var.X;
            if (f12 == 0.0f) {
                o7Var.Y = -floatValue;
            }
            if ((floatValue < 0.0f && o7Var.Y > 0.0f) || (i10 > 0 && o7Var.Y < 0.0f)) {
                floatValue *= 0.2f;
            }
            o7Var.X = f12 - floatValue;
            o7.w(o7Var);
            float f13 = o7Var.X;
            if ((f13 > 0.0f && o7Var.Y < 0.0f) || (f13 < 0.0f && o7Var.Y > 0.0f)) {
                o7Var.X = 0.0f;
            }
            z12 = true;
        } else {
            z12 = false;
        }
        if (currentPeerView != null && o7Var.f49301e0 == 0.0f && !o7Var.f49312j0 && !o7Var.L0 && !o7Var.I0 && o7Var.f49319n0.F0 != 1) {
            org.telegram.messenger.i0.r1(currentPeerView.L0, this, fArr);
            motionEvent.offsetLocation(-fArr[0], -fArr[1]);
            z2 currentPeerView2 = o7Var.f49319n0.getCurrentPeerView();
            currentPeerView2.G2.a(motionEvent, currentPeerView2.L0, null, null, 0);
            motionEvent.offsetLocation(fArr[0], fArr[1]);
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            for (int i13 = 0; i13 < motionEvent.getPointerCount(); i13++) {
                sparseArray.put(motionEvent.getPointerId(i13), Float.valueOf(motionEvent.getX(i13)));
            }
        } else {
            sparseArray.clear();
        }
        if (!z12) {
            boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (o7Var.f49301e0 != 0.0f && !o7Var.f49307g1 && o7Var.f49323p0 < org.telegram.messenger.i0.L(20.0f)) {
                    if (o7Var.f49342x.f48964f > 0.5f) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    o7Var.A(z13);
                }
                z2 H = o7Var.H();
                if (H != null) {
                    H.f49759t0.f49133w0 = false;
                }
            }
            if (z10 && !o7Var.f49291a0) {
                o7Var.y();
            }
            if (!dispatchTouchEvent && (!o7.f49287x1 || !o7Var.f49325q0)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.f48858r0.f49345y0) {
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        o7 o7Var = this.f48858r0;
        if (o7Var.f49293b && !o7Var.f49296c) {
            org.telegram.ui.ActionBar.k2 k2Var = this.f48857q0;
            org.telegram.messenger.i0.Z2(k2Var.getParentActivity(), k2Var.getClassGuid());
        }
        setTag(2131296351, new b7(this));
        zs.f(o7Var.h).c(o7Var, zs.f19723x5);
        zs.f(o7Var.h).c(o7Var, zs.f19709v5);
        zs.f(o7Var.h).c(o7Var, zs.f19597d1);
        zs.f(o7Var.h).c(o7Var, zs.f19591c1);
        zs.f(o7Var.h).c(o7Var, zs.f19716w5);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setTag(2131296351, null);
        o7 o7Var = this.f48858r0;
        zs.f(o7Var.h).n(o7Var, zs.f19723x5);
        zs.f(o7Var.h).n(o7Var, zs.f19709v5);
        zs.f(o7Var.h).n(o7Var, zs.f19597d1);
        zs.f(o7Var.h).n(o7Var, zs.f19591c1);
        zs.f(o7Var.h).n(o7Var, zs.f19716w5);
    }

    @Override
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r19) {
        throw new UnsupportedOperationException("Method not decompiled: th.c7.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        o7 o7Var = this.f48858r0;
        ((FrameLayout.LayoutParams) o7Var.f49300d1.getLayoutParams()).topMargin = org.telegram.messenger.i0.f16020m - org.telegram.messenger.i0.L(2.0f);
        o7Var.f49300d1.getLayoutParams().height = org.telegram.messenger.i0.L(2.0f);
        super.onMeasure(i10, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        p1 p1Var;
        int action = motionEvent.getAction();
        o7 o7Var = this.f48858r0;
        if (action == 1 || motionEvent.getAction() == 3) {
            o7Var.f49312j0 = false;
            o7Var.Y(false);
            if (o7Var.V >= 1.0f) {
                o7Var.D(true);
            } else if (!o7Var.H0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(o7Var.W, 0.0f);
                o7Var.G = ofFloat;
                ofFloat.addUpdateListener(new z6(this, 1));
                o7Var.G.addListener(new a7(this, 1));
                o7Var.G.setDuration(150L);
                o7Var.G.setInterpolator(gr.f26495f);
                o7Var.G.start();
            }
            z2 H = o7Var.H();
            if (H != null && (p1Var = H.f49763u0) != null) {
                p1Var.setAllowTouches(true);
            }
        }
        if (!o7Var.f49312j0 && !o7Var.f49344y && o7Var.Z == 0.0f && ((o7Var.f49301e0 == 0.0f || (!o7Var.f49304f0 && !o7Var.f49306g0)) && !o7Var.f49313j1)) {
            return false;
        }
        o7Var.f49310i0.onTouchEvent(motionEvent);
        return true;
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        this.f48858r0.f49304f0 = false;
    }
}
