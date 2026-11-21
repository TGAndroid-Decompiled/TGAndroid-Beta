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
public abstract class w91 extends org.telegram.ui.Components.ba {
    public static final int f53035o3 = 0;
    public boolean f53036k3;
    public boolean f53037l3;
    public float f53038m3;
    public final y91 f53039n3;

    public w91(y91 y91Var, Context context) {
        super(context, null);
        this.f53039n3 = y91Var;
        this.f53036k3 = true;
        new Paint();
        new RectF();
        this.f34860g1 = true;
        this.f33823i3 = org.telegram.messenger.g0.L(200.0f);
    }

    public final void B1(boolean z10, org.telegram.ui.Cells.u2 u2Var) {
        y91 y91Var = this.f53039n3;
        y91Var.F = z10;
        int i7 = 2;
        boolean z11 = true;
        if (!z10) {
            if (u2Var != null) {
                y91Var.G.h1(1, 0);
                if (y91Var.F) {
                    i7 = 0;
                }
                y91Var.E = i7;
                jv jvVar = y91Var.f54142x;
                if (jvVar != null) {
                    if (i7 == 0) {
                        z11 = false;
                    }
                    jvVar.X = z11;
                }
            }
        } else {
            y91Var.G.h1(0, 0);
            if (y91Var.F) {
                i7 = 0;
            }
            y91Var.E = i7;
            jv jvVar2 = y91Var.f54142x;
            if (jvVar2 != null) {
                if (i7 == 0) {
                    z11 = false;
                }
                jvVar2.X = z11;
            }
            if (u2Var != null) {
                u2Var.b0();
                u2Var.invalidate();
            }
        }
        o91 o91Var = y91Var.F0;
        if (o91Var != null) {
            o91Var.forceLayout();
        }
    }

    @Override
    public final boolean F0(View view) {
        if ((view instanceof org.telegram.ui.Cells.o4) && !view.isClickable()) {
            return false;
        }
        return true;
    }

    @Override
    public final void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i7, layoutParams);
        view.setTranslationY(this.f53038m3);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        y91 y91Var = this.f53039n3;
        if (y91Var.f54105d1 != null) {
            canvas.save();
            canvas.translate(y91Var.f54105d1.getLeft(), y91Var.f54105d1.getY());
            y91Var.f54105d1.draw(canvas);
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
        if (this.f53039n3.f54105d1 == view) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        y91 y91Var = this.f53039n3;
        if (y91Var.f54142x != null && this.f53038m3 != 0.0f) {
            int paddingTop = getPaddingTop();
            if (paddingTop != 0) {
                canvas.save();
                canvas.translate(0.0f, paddingTop);
            }
            y91Var.f54142x.c(canvas, true);
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
            HashSet hashSet = y91.f54094s1;
            y91 y91Var = this.f53039n3;
            if (y91Var.getParentLayout() == null || !((ActionBarLayout) y91Var.getParentLayout()).y()) {
                if (motionEvent.getAction() == 0) {
                    kVar = ((org.telegram.ui.ActionBar.g2) y91Var).actionBar;
                    kVar.getClass();
                    v4.i0 adapter = getAdapter();
                    if (y91Var.f54101c != adapter.b()) {
                        this.f53037l3 = true;
                        adapter.f();
                        this.f53037l3 = false;
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
        y91 y91Var = this.f53039n3;
        y91Var.getClass();
        y91Var.getClass();
        y91Var.getClass();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        if (this.f53036k3) {
            y91 y91Var = this.f53039n3;
            if (y91Var.getMessagesController().f25634b2) {
                if (y91Var.f54144y > 0) {
                    this.f53037l3 = true;
                    kVar = ((org.telegram.ui.ActionBar.g2) y91Var).actionBar;
                    ((v4.c0) getLayoutManager()).h1(1, (int) kVar.getTranslationY());
                    this.f53037l3 = false;
                }
                this.f53036k3 = false;
            }
        }
        super.onMeasure(i7, i10);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        v4.c0 c0Var;
        int L0;
        float f10;
        if (!this.W1) {
            HashSet hashSet = y91.f54094s1;
            y91 y91Var = this.f53039n3;
            if (y91Var.getParentLayout() == null || !((ActionBarLayout) y91Var.getParentLayout()).y()) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    setOverScrollMode(0);
                }
                if (action == 1 || action == 3) {
                    d91 d91Var = y91Var.P;
                    if (d91Var.E != 0 && y91Var.Q.d && d91Var.i(null, 4) != 0) {
                        y91Var.Q.getClass();
                    }
                }
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if ((action == 1 || action == 3) && y91Var.E == 2 && y91Var.f54144y > 0 && (L0 = (c0Var = (v4.c0) getLayoutManager()).L0()) == 0) {
                    int paddingTop = getPaddingTop();
                    View m10 = c0Var.m(L0);
                    if (org.telegram.messenger.bz.f23215p1) {
                        f10 = 78.0f;
                    } else {
                        f10 = 72.0f;
                    }
                    int L = (int) (org.telegram.messenger.g0.L(f10) * 0.85f);
                    int measuredHeight = m10.getMeasuredHeight() + (m10.getTop() - paddingTop);
                    long currentTimeMillis = System.currentTimeMillis() - y91Var.Z;
                    if (measuredHeight >= L && currentTimeMillis >= 200) {
                        if (y91Var.E != 1) {
                            if (this.f53038m3 == 0.0f) {
                                w0(0, m10.getTop() - paddingTop, org.telegram.ui.Components.nr.h);
                            }
                            if (!y91Var.f54096a0) {
                                y91Var.f54096a0 = true;
                                try {
                                    performHapticFeedback(3, 2);
                                } catch (Exception unused) {
                                }
                                jv jvVar = y91Var.f54142x;
                                if (jvVar != null) {
                                    jvVar.a(true);
                                }
                            }
                            ((org.telegram.ui.Cells.u2) m10).h0();
                            y91Var.E = 1;
                        }
                    } else {
                        w0(0, measuredHeight, org.telegram.ui.Components.nr.h);
                        y91Var.E = 2;
                    }
                    float f11 = this.f53038m3;
                    if (f11 != 0.0f) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, 0.0f);
                        ofFloat.addUpdateListener(new iz0(this, 15));
                        ofFloat.setDuration(Math.max(100L, org.telegram.messenger.n10.w(this.f53038m3, org.telegram.messenger.g0.L(72.0f), 120.0f, 350.0f)));
                        ofFloat.setInterpolator(org.telegram.ui.Components.nr.h);
                        setScrollEnabled(false);
                        ofFloat.addListener(new k71(this, 2));
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
        if (this.f53037l3) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setAdapter(v4.i0 i0Var) {
        super.setAdapter(i0Var);
        this.f53036k3 = true;
    }

    public final void setViewsOffset(float f10) {
        View m10;
        this.f53038m3 = f10;
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
