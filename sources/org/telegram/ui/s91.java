package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashSet;
import org.telegram.ui.ActionBar.ActionBarLayout;
public abstract class s91 extends org.telegram.ui.Components.t9 {
    public static final int f51164o3 = 0;
    public boolean f51165k3;
    public boolean f51166l3;
    public float f51167m3;
    public final u91 f51168n3;

    public s91(u91 u91Var, Context context) {
        super(context, null);
        this.f51168n3 = u91Var;
        this.f51165k3 = true;
        new Paint();
        new RectF();
        this.f40054g1 = true;
        this.f39615i3 = org.telegram.messenger.g0.L(200.0f);
    }

    public final void B1(boolean z10, org.telegram.ui.Cells.t2 t2Var) {
        u91 u91Var = this.f51168n3;
        u91Var.F = z10;
        int i7 = 2;
        boolean z11 = true;
        if (!z10) {
            if (t2Var != null) {
                u91Var.G.h1(1, 0);
                if (u91Var.F) {
                    i7 = 0;
                }
                u91Var.E = i7;
                gv gvVar = u91Var.f51880x;
                if (gvVar != null) {
                    if (i7 == 0) {
                        z11 = false;
                    }
                    gvVar.X = z11;
                }
            }
        } else {
            u91Var.G.h1(0, 0);
            if (u91Var.F) {
                i7 = 0;
            }
            u91Var.E = i7;
            gv gvVar2 = u91Var.f51880x;
            if (gvVar2 != null) {
                if (i7 == 0) {
                    z11 = false;
                }
                gvVar2.X = z11;
            }
            if (t2Var != null) {
                t2Var.d0();
                t2Var.invalidate();
            }
        }
        k91 k91Var = u91Var.F0;
        if (k91Var != null) {
            k91Var.forceLayout();
        }
    }

    @Override
    public final boolean F0(View view) {
        if ((view instanceof org.telegram.ui.Cells.n4) && !view.isClickable()) {
            return false;
        }
        return true;
    }

    @Override
    public final void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i7, layoutParams);
        view.setTranslationY(this.f51167m3);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        u91 u91Var = this.f51168n3;
        if (u91Var.f51844d1 != null) {
            canvas.save();
            canvas.translate(u91Var.f51844d1.getLeft(), u91Var.f51844d1.getY());
            u91Var.f51844d1.draw(canvas);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        if (getItemAnimator() != null) {
            getItemAnimator().k();
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (getItemAnimator() != null) {
            getItemAnimator().k();
        }
        if (this.f51168n3.f51844d1 == view) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        u91 u91Var = this.f51168n3;
        if (u91Var.f51880x != null && this.f51167m3 != 0.0f) {
            int paddingTop = getPaddingTop();
            if (paddingTop != 0) {
                canvas.save();
                canvas.translate(0.0f, paddingTop);
            }
            u91Var.f51880x.c(canvas, true);
            if (paddingTop != 0) {
                canvas.restore();
            }
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        if (!this.W1) {
            HashSet hashSet = u91.f51833r1;
            u91 u91Var = this.f51168n3;
            if (u91Var.getParentLayout() == null || !((ActionBarLayout) u91Var.getParentLayout()).y()) {
                if (motionEvent.getAction() == 0) {
                    kVar = ((org.telegram.ui.ActionBar.e2) u91Var).actionBar;
                    kVar.getClass();
                    v4.h0 adapter = getAdapter();
                    if (u91Var.f51840c != adapter.b()) {
                        this.f51166l3 = true;
                        adapter.f();
                        this.f51166l3 = false;
                    }
                }
                return super.onInterceptTouchEvent(motionEvent);
            }
        }
        return false;
    }

    @Override
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        u91 u91Var = this.f51168n3;
        u91Var.getClass();
        u91Var.getClass();
        u91Var.getClass();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        if (this.f51165k3) {
            u91 u91Var = this.f51168n3;
            if (u91Var.getMessagesController().Z1) {
                if (u91Var.f51882y > 0) {
                    this.f51166l3 = true;
                    kVar = ((org.telegram.ui.ActionBar.e2) u91Var).actionBar;
                    ((v4.b0) getLayoutManager()).h1(1, (int) kVar.getTranslationY());
                    this.f51166l3 = false;
                }
                this.f51165k3 = false;
            }
        }
        super.onMeasure(i7, i10);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        v4.b0 b0Var;
        int L0;
        float f10;
        if (!this.W1) {
            HashSet hashSet = u91.f51833r1;
            u91 u91Var = this.f51168n3;
            if (u91Var.getParentLayout() == null || !((ActionBarLayout) u91Var.getParentLayout()).y()) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    setOverScrollMode(0);
                }
                if (action == 1 || action == 3) {
                    z81 z81Var = u91Var.P;
                    if (z81Var.E != 0 && u91Var.Q.d && z81Var.i(null, 4) != 0) {
                        u91Var.Q.getClass();
                    }
                }
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if ((action == 1 || action == 3) && u91Var.E == 2 && u91Var.f51882y > 0 && (L0 = (b0Var = (v4.b0) getLayoutManager()).L0()) == 0) {
                    int paddingTop = getPaddingTop();
                    View m10 = b0Var.m(L0);
                    if (org.telegram.messenger.gz.f23971p1) {
                        f10 = 78.0f;
                    } else {
                        f10 = 72.0f;
                    }
                    int L = (int) (org.telegram.messenger.g0.L(f10) * 0.85f);
                    int measuredHeight = m10.getMeasuredHeight() + (m10.getTop() - paddingTop);
                    long currentTimeMillis = System.currentTimeMillis() - u91Var.Z;
                    if (measuredHeight >= L && currentTimeMillis >= 200) {
                        if (u91Var.E != 1) {
                            if (this.f51167m3 == 0.0f) {
                                w0(0, m10.getTop() - paddingTop, org.telegram.ui.Components.er.h);
                            }
                            if (!u91Var.f51835a0) {
                                u91Var.f51835a0 = true;
                                try {
                                    performHapticFeedback(3, 2);
                                } catch (Exception unused) {
                                }
                                gv gvVar = u91Var.f51880x;
                                if (gvVar != null) {
                                    gvVar.a(true);
                                }
                            }
                            ((org.telegram.ui.Cells.t2) m10).j0();
                            u91Var.E = 1;
                        }
                    } else {
                        w0(0, measuredHeight, org.telegram.ui.Components.er.h);
                        u91Var.E = 2;
                    }
                    float f11 = this.f51167m3;
                    if (f11 != 0.0f) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, 0.0f);
                        ofFloat.addUpdateListener(new ez0(this, 15));
                        ofFloat.setDuration(Math.max(100L, org.telegram.messenger.i20.v(this.f51167m3, org.telegram.messenger.g0.L(72.0f), 120.0f, 350.0f)));
                        ofFloat.setInterpolator(org.telegram.ui.Components.er.h);
                        setScrollEnabled(false);
                        ofFloat.addListener(new g71(this, 2));
                        ofFloat.start();
                    }
                }
                return onTouchEvent;
            }
        }
        return false;
    }

    @Override
    public final void removeView(View view) {
        super.removeView(view);
        view.setTranslationY(0.0f);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    @Override
    public final void requestLayout() {
        if (this.f51166l3) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setAdapter(v4.h0 h0Var) {
        super.setAdapter(h0Var);
        this.f51165k3 = true;
    }

    public final void setViewsOffset(float f10) {
        View m10;
        this.f51167m3 = f10;
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            getChildAt(i7).setTranslationY(f10);
        }
        if (this.D1 != -1 && (m10 = getLayoutManager().m(this.D1)) != null) {
            int right = m10.getRight();
            int bottom = (int) (m10.getBottom() + f10);
            Rect rect = this.F1;
            rect.set(m10.getLeft(), (int) (m10.getTop() + f10), right, bottom);
            this.C1.setBounds(rect);
        }
        invalidate();
    }
}
