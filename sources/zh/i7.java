package zh;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.wr;
import org.telegram.ui.m91;
public final class i7 extends aw0 {
    public final Path A0;
    public final RectF B0;
    public final RectF C0;
    public final RectF D0;
    public final RectF E0;
    public final RectF F0;
    public final SparseArray G0;
    public final org.telegram.ui.ActionBar.p2 H0;
    public final u7 I0;
    public float f48521w0;
    public float f48522x0;
    public float f48523y0;
    public final float[] f48524z0;

    public i7(u7 u7Var, Context context, org.telegram.ui.ActionBar.p2 p2Var) {
        super(context, null);
        this.I0 = u7Var;
        this.H0 = p2Var;
        this.f48524z0 = new float[8];
        this.A0 = new Path();
        this.B0 = new RectF();
        this.C0 = new RectF();
        this.D0 = new RectF();
        this.E0 = new RectF();
        this.F0 = new RectF();
        this.G0 = new SparseArray();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r29) {
        throw new UnsupportedOperationException("Method not decompiled: zh.i7.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        u7 u7Var = this.I0;
        if (keyCode != 24 && keyEvent.getKeyCode() != 25) {
            if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                u7Var.onAttachedBackPressed();
                return true;
            }
            return super.dispatchKeyEventPreIme(keyEvent);
        }
        u7Var.r(keyEvent);
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
        k7 k7Var;
        int i11;
        pk0 pk0Var;
        u7 u7Var = this.I0;
        float[] fArr = u7Var.f48949o0;
        a3 currentPeerView = u7Var.f48947n0.getCurrentPeerView();
        if (currentPeerView != null) {
            l2 l2Var = currentPeerView.K0;
            if (l2Var.W.y()) {
                float x10 = currentPeerView.getX();
                float y3 = ((View) currentPeerView.getParent()).getY() + currentPeerView.getY();
                motionEvent.offsetLocation(-x10, -y3);
                if (!l2Var.W.o(currentPeerView.getContext()).onTouchEvent(motionEvent)) {
                    motionEvent.offsetLocation(x10, y3);
                }
                return true;
            }
        }
        float f7 = 0.0f;
        if (u7Var.f48952p1 && currentPeerView != null && (pk0Var = currentPeerView.f48207r3) != null) {
            float f10 = 0.0f;
            for (View view = currentPeerView; view != null && (view.getParent() instanceof View); view = (View) view.getParent()) {
                f7 += view.getX();
                f10 += view.getY();
            }
            if (currentPeerView.f48207r3.getReactionsWindow() != null && currentPeerView.f48207r3.getReactionsWindow().f46952c != null) {
                motionEvent.offsetLocation(-f7, (-f10) - currentPeerView.f48207r3.getReactionsWindow().f46952c.getTranslationY());
                currentPeerView.f48207r3.getReactionsWindow().f46952c.dispatchTouchEvent(motionEvent);
                return true;
            }
            Rect rect = AndroidUtilities.rectTmp2;
            pk0Var.getHitRect(rect);
            rect.offset((int) f7, (int) f10);
            if (motionEvent.getAction() == 0 && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                currentPeerView.b1(false);
                return true;
            }
            motionEvent.offsetLocation(-rect.left, -rect.top);
            pk0Var.dispatchTouchEvent(motionEvent);
            return true;
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            z10 = false;
        } else {
            u7Var.f48940j0 = false;
            AndroidUtilities.cancelRunOnUIThread(u7Var.f48923b1);
            float f11 = u7Var.X;
            if (f11 != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, 0.0f);
                u7Var.G = ofFloat;
                ofFloat.addUpdateListener(new f7(this, 0));
                u7Var.G.addListener(new g7(this, 0));
                u7Var.G.setDuration(250L);
                u7Var.G.setInterpolator(wr.f28819f);
                u7Var.G.start();
            }
            if (u7Var.V >= 0.3f) {
                u7Var.q(true);
            }
            u7Var.K(false);
            u7Var.L(false);
            z10 = true;
        }
        if (motionEvent.getAction() == 0) {
            u7Var.f48919a0 = false;
            if (currentPeerView != null) {
                m91 m91Var = currentPeerView.f48228y0;
                z6 z6Var = currentPeerView.C0;
                h2 h2Var = currentPeerView.f48160c1;
                bi.x4 x4Var = currentPeerView.F0;
                if (x4Var != null && x4Var.V && z6Var != null) {
                    if (!x4Var.f3897r0.contains(motionEvent.getX() - (currentPeerView.F0.getX() + (h2Var.getX() + currentPeerView.getX())), motionEvent.getY() - (currentPeerView.F0.getY() + (h2Var.getY() + currentPeerView.getY()))) && !currentPeerView.H0(motionEvent, z6Var)) {
                        currentPeerView.F0.e(true);
                    }
                }
                bi.x4 x4Var2 = currentPeerView.G0;
                if (x4Var2 != null && x4Var2.V && m91Var != null && !x4Var2.f3897r0.contains(motionEvent.getX() - (currentPeerView.G0.getX() + (h2Var.getX() + currentPeerView.getX())), motionEvent.getY() - (currentPeerView.G0.getY() + (h2Var.getY() + currentPeerView.getY()))) && !currentPeerView.H0(motionEvent, m91Var)) {
                    currentPeerView.G0.e(true);
                }
            }
            u7Var.f48947n0.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
        }
        if (!u7Var.f48970x && !u7Var.H0 && !u7Var.I0) {
            z11 = true;
        } else {
            z11 = false;
        }
        float f12 = u7Var.f48929e0;
        SparseArray sparseArray = this.G0;
        if (f12 == 0.0f && !u7Var.f48940j0 && u7Var.f48947n0.F0 == 1 && motionEvent.getAction() == 2 && z11 && (((((Float) sparseArray.get(motionEvent.getPointerId(0), Float.valueOf(0.0f))).floatValue() - motionEvent.getX(0)) != 0.0f && (((i11 = (k7Var = u7Var.f48947n0).I0) == 0 && k7Var.K0 == 0.0f && floatValue < 0.0f) || (i11 == k7Var.getAdapter().b() - 1 && k7Var.K0 == 0.0f && i10 > 0))) || u7Var.X != 0.0f)) {
            float f13 = u7Var.X;
            if (f13 == 0.0f) {
                u7Var.Y = -floatValue;
            }
            if ((floatValue < 0.0f && u7Var.Y > 0.0f) || (i10 > 0 && u7Var.Y < 0.0f)) {
                floatValue *= 0.2f;
            }
            u7Var.X = f13 - floatValue;
            u7.k(u7Var);
            float f14 = u7Var.X;
            if ((f14 > 0.0f && u7Var.Y < 0.0f) || (f14 < 0.0f && u7Var.Y > 0.0f)) {
                u7Var.X = 0.0f;
            }
            z12 = true;
        } else {
            z12 = false;
        }
        if (currentPeerView != null && u7Var.f48929e0 == 0.0f && !u7Var.f48940j0 && !u7Var.L0 && !u7Var.I0 && u7Var.f48947n0.F0 != 1) {
            AndroidUtilities.getViewPositionInParent(currentPeerView.f48160c1, this, fArr);
            motionEvent.offsetLocation(-fArr[0], -fArr[1]);
            a3 currentPeerView2 = u7Var.f48947n0.getCurrentPeerView();
            currentPeerView2.X2.a(motionEvent, currentPeerView2.f48160c1, null, null, 0);
            motionEvent.offsetLocation(fArr[0], fArr[1]);
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            for (int i12 = 0; i12 < motionEvent.getPointerCount(); i12++) {
                sparseArray.put(motionEvent.getPointerId(i12), Float.valueOf(motionEvent.getX(i12)));
            }
        } else {
            sparseArray.clear();
        }
        if (!z12) {
            boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (u7Var.f48929e0 != 0.0f && !u7Var.f48935g1 && u7Var.f48951p0 < AndroidUtilities.dp(20.0f)) {
                    if (u7Var.f48967w.f48443f > 0.5f) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    u7Var.n(z13);
                }
                a3 t10 = u7Var.t();
                if (t10 != null) {
                    t10.K0.f48798w0 = false;
                }
            }
            if (z10 && !u7Var.f48919a0) {
                u7Var.m();
            }
            if (!dispatchTouchEvent && (!u7.f48915x1 || !u7Var.f48953q0)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.I0.f48973y0) {
            return false;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        u7 u7Var = this.I0;
        if (u7Var.f48921b && !u7Var.f48924c) {
            org.telegram.ui.ActionBar.p2 p2Var = this.H0;
            AndroidUtilities.requestAdjustResize(p2Var.getParentActivity(), p2Var.getClassGuid());
        }
        pc.a(this, new h7(this));
        NotificationCenter.getInstance(u7Var.h).addObserver(u7Var, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(u7Var.h).addObserver(u7Var, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(u7Var.h).addObserver(u7Var, NotificationCenter.articleClosed);
        NotificationCenter.getInstance(u7Var.h).addObserver(u7Var, NotificationCenter.openArticle);
        NotificationCenter.getInstance(u7Var.h).addObserver(u7Var, NotificationCenter.storyDeleted);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        pc.h(this);
        u7 u7Var = this.I0;
        NotificationCenter.getInstance(u7Var.h).removeObserver(u7Var, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(u7Var.h).removeObserver(u7Var, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(u7Var.h).removeObserver(u7Var, NotificationCenter.articleClosed);
        NotificationCenter.getInstance(u7Var.h).removeObserver(u7Var, NotificationCenter.openArticle);
        NotificationCenter.getInstance(u7Var.h).removeObserver(u7Var, NotificationCenter.storyDeleted);
    }

    @Override
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r19) {
        throw new UnsupportedOperationException("Method not decompiled: zh.i7.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        u7 u7Var = this.I0;
        ((FrameLayout.LayoutParams) u7Var.f48928d1.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight - AndroidUtilities.dp(2.0f);
        u7Var.f48928d1.getLayoutParams().height = AndroidUtilities.dp(2.0f);
        super.onMeasure(i10, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        o1 o1Var;
        int action = motionEvent.getAction();
        u7 u7Var = this.I0;
        if (action == 1 || motionEvent.getAction() == 3) {
            u7Var.f48940j0 = false;
            u7Var.K(false);
            if (u7Var.V >= 1.0f) {
                u7Var.q(true);
            } else if (!u7Var.H0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(u7Var.W, 0.0f);
                u7Var.G = ofFloat;
                ofFloat.addUpdateListener(new f7(this, 1));
                u7Var.G.addListener(new g7(this, 1));
                u7Var.G.setDuration(150L);
                u7Var.G.setInterpolator(wr.f28819f);
                u7Var.G.start();
            }
            a3 t10 = u7Var.t();
            if (t10 != null && (o1Var = t10.L0) != null) {
                o1Var.setAllowTouches(true);
            }
        }
        if (!u7Var.f48940j0 && !u7Var.f48970x && u7Var.Z == 0.0f && ((u7Var.f48929e0 == 0.0f || (!u7Var.f48932f0 && !u7Var.f48934g0)) && !u7Var.f48941j1)) {
            return false;
        }
        u7Var.f48938i0.onTouchEvent(motionEvent);
        return true;
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        this.I0.f48932f0 = false;
    }
}
