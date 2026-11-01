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
import org.telegram.messenger.at;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.nj0;
import org.telegram.ui.Components.vu0;
import org.telegram.ui.bg0;
public final class c7 extends vu0 {
    public float f48861f0;
    public float f48862g0;
    public float f48863h0;
    public final float[] f48864i0;
    public final Path f48865j0;
    public final RectF f48866k0;
    public final RectF f48867l0;
    public final RectF m0;
    public final RectF f48868n0;
    public final RectF f48869o0;
    public final SparseArray f48870p0;
    public final org.telegram.ui.ActionBar.k2 f48871q0;
    public final o7 f48872r0;

    public c7(o7 o7Var, Context context, org.telegram.ui.ActionBar.k2 k2Var) {
        super(context, null);
        this.f48872r0 = o7Var;
        this.f48871q0 = k2Var;
        this.f48864i0 = new float[8];
        this.f48865j0 = new Path();
        this.f48866k0 = new RectF();
        this.f48867l0 = new RectF();
        this.m0 = new RectF();
        this.f48868n0 = new RectF();
        this.f48869o0 = new RectF();
        this.f48870p0 = new SparseArray();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r30) {
        throw new UnsupportedOperationException("Method not decompiled: th.c7.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        o7 o7Var = this.f48872r0;
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
        nj0 nj0Var;
        o7 o7Var = this.f48872r0;
        float[] fArr = o7Var.f49335o0;
        z2 currentPeerView = o7Var.f49333n0.getCurrentPeerView();
        if (currentPeerView != null) {
            k2 k2Var = currentPeerView.f49773t0;
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
        if (o7Var.f49338p1 && currentPeerView != null && (nj0Var = currentPeerView.f49706a3) != null) {
            float f10 = 0.0f;
            for (View view = currentPeerView; view != null && (view.getParent() instanceof View); view = (View) view.getParent()) {
                f7 += view.getX();
                f10 += view.getY();
            }
            if (currentPeerView.f49706a3.getReactionsWindow() != null && currentPeerView.f49706a3.getReactionsWindow().f48288c != null) {
                motionEvent.offsetLocation(-f7, (-f10) - currentPeerView.f49706a3.getReactionsWindow().f48288c.getTranslationY());
                currentPeerView.f49706a3.getReactionsWindow().f48288c.dispatchTouchEvent(motionEvent);
                return true;
            }
            Rect rect = org.telegram.messenger.i0.Q;
            nj0Var.getHitRect(rect);
            rect.offset((int) f7, (int) f10);
            if (motionEvent.getAction() == 0 && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                currentPeerView.Z0(false);
                return true;
            }
            motionEvent.offsetLocation(-rect.left, -rect.top);
            nj0Var.dispatchTouchEvent(motionEvent);
            return true;
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            z10 = false;
        } else {
            o7Var.f49326j0 = false;
            org.telegram.messenger.i0.r(o7Var.f49309b1);
            float f11 = o7Var.X;
            if (f11 != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, 0.0f);
                o7Var.G = ofFloat;
                ofFloat.addUpdateListener(new z6(this, 0));
                o7Var.G.addListener(new a7(this, 0));
                o7Var.G.setDuration(250L);
                o7Var.G.setInterpolator(gr.f26523f);
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
            o7Var.f49305a0 = false;
            if (currentPeerView != null) {
                bg0 bg0Var = currentPeerView.f49727h0;
                t6 t6Var = currentPeerView.f49743l0;
                g2 g2Var = currentPeerView.L0;
                vh.p2 p2Var = currentPeerView.f49753o0;
                if (p2Var != null && p2Var.V && t6Var != null) {
                    if (!p2Var.f51762r0.contains(motionEvent.getX() - (currentPeerView.f49753o0.getX() + (g2Var.getX() + currentPeerView.getX())), motionEvent.getY() - (currentPeerView.f49753o0.getY() + (g2Var.getY() + currentPeerView.getY()))) && !currentPeerView.F0(t6Var, motionEvent)) {
                        currentPeerView.f49753o0.e(true);
                    }
                }
                vh.p2 p2Var2 = currentPeerView.f49757p0;
                if (p2Var2 != null && p2Var2.V && bg0Var != null && !p2Var2.f51762r0.contains(motionEvent.getX() - (currentPeerView.f49757p0.getX() + (g2Var.getX() + currentPeerView.getX())), motionEvent.getY() - (currentPeerView.f49757p0.getY() + (g2Var.getY() + currentPeerView.getY()))) && !currentPeerView.F0(bg0Var, motionEvent)) {
                    currentPeerView.f49757p0.e(true);
                }
            }
            o7Var.f49333n0.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
        }
        if (!o7Var.f49358y && !o7Var.H0 && !o7Var.I0) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i12 = (o7Var.f49315e0 > 0.0f ? 1 : (o7Var.f49315e0 == 0.0f ? 0 : -1));
        SparseArray sparseArray = this.f48870p0;
        if (i12 == 0 && !o7Var.f49326j0 && o7Var.f49333n0.F0 == 1 && motionEvent.getAction() == 2 && z11 && (((((Float) sparseArray.get(motionEvent.getPointerId(0), Float.valueOf(0.0f))).floatValue() - motionEvent.getX(0)) != 0.0f && (((i11 = (e7Var = o7Var.f49333n0).I0) == 0 && e7Var.K0 == 0.0f && floatValue < 0.0f) || (i11 == e7Var.getAdapter().b() - 1 && e7Var.K0 == 0.0f && i10 > 0))) || o7Var.X != 0.0f)) {
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
        if (currentPeerView != null && o7Var.f49315e0 == 0.0f && !o7Var.f49326j0 && !o7Var.L0 && !o7Var.I0 && o7Var.f49333n0.F0 != 1) {
            org.telegram.messenger.i0.r1(currentPeerView.L0, this, fArr);
            motionEvent.offsetLocation(-fArr[0], -fArr[1]);
            z2 currentPeerView2 = o7Var.f49333n0.getCurrentPeerView();
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
                if (o7Var.f49315e0 != 0.0f && !o7Var.f49321g1 && o7Var.f49337p0 < org.telegram.messenger.i0.L(20.0f)) {
                    if (o7Var.f49356x.f48978f > 0.5f) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    o7Var.A(z13);
                }
                z2 H = o7Var.H();
                if (H != null) {
                    H.f49773t0.f49147w0 = false;
                }
            }
            if (z10 && !o7Var.f49305a0) {
                o7Var.y();
            }
            if (!dispatchTouchEvent && (!o7.f49301x1 || !o7Var.f49339q0)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.f48872r0.f49359y0) {
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        o7 o7Var = this.f48872r0;
        if (o7Var.f49307b && !o7Var.f49310c) {
            org.telegram.ui.ActionBar.k2 k2Var = this.f48871q0;
            org.telegram.messenger.i0.Z2(k2Var.getParentActivity(), k2Var.getClassGuid());
        }
        setTag(2131296351, new b7(this));
        at.f(o7Var.h).c(o7Var, at.f14819x5);
        at.f(o7Var.h).c(o7Var, at.f14805v5);
        at.f(o7Var.h).c(o7Var, at.f14693d1);
        at.f(o7Var.h).c(o7Var, at.f14687c1);
        at.f(o7Var.h).c(o7Var, at.f14812w5);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setTag(2131296351, null);
        o7 o7Var = this.f48872r0;
        at.f(o7Var.h).n(o7Var, at.f14819x5);
        at.f(o7Var.h).n(o7Var, at.f14805v5);
        at.f(o7Var.h).n(o7Var, at.f14693d1);
        at.f(o7Var.h).n(o7Var, at.f14687c1);
        at.f(o7Var.h).n(o7Var, at.f14812w5);
    }

    @Override
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r19) {
        throw new UnsupportedOperationException("Method not decompiled: th.c7.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        o7 o7Var = this.f48872r0;
        ((FrameLayout.LayoutParams) o7Var.f49314d1.getLayoutParams()).topMargin = org.telegram.messenger.i0.f16166m - org.telegram.messenger.i0.L(2.0f);
        o7Var.f49314d1.getLayoutParams().height = org.telegram.messenger.i0.L(2.0f);
        super.onMeasure(i10, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        p1 p1Var;
        int action = motionEvent.getAction();
        o7 o7Var = this.f48872r0;
        if (action == 1 || motionEvent.getAction() == 3) {
            o7Var.f49326j0 = false;
            o7Var.Y(false);
            if (o7Var.V >= 1.0f) {
                o7Var.D(true);
            } else if (!o7Var.H0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(o7Var.W, 0.0f);
                o7Var.G = ofFloat;
                ofFloat.addUpdateListener(new z6(this, 1));
                o7Var.G.addListener(new a7(this, 1));
                o7Var.G.setDuration(150L);
                o7Var.G.setInterpolator(gr.f26523f);
                o7Var.G.start();
            }
            z2 H = o7Var.H();
            if (H != null && (p1Var = H.f49777u0) != null) {
                p1Var.setAllowTouches(true);
            }
        }
        if (!o7Var.f49326j0 && !o7Var.f49358y && o7Var.Z == 0.0f && ((o7Var.f49315e0 == 0.0f || (!o7Var.f49318f0 && !o7Var.f49320g0)) && !o7Var.f49327j1)) {
            return false;
        }
        o7Var.f49324i0.onTouchEvent(motionEvent);
        return true;
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        this.f48872r0.f49318f0 = false;
    }
}
