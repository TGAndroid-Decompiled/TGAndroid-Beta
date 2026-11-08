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
public abstract class u91 extends org.telegram.ui.Components.x9 {
    public static final int f50272n3 = 0;
    public boolean j3;
    public boolean f50273k3;
    public float f50274l3;
    public final w91 f50275m3;

    public u91(w91 w91Var, Context context) {
        super(context, null);
        this.f50275m3 = w91Var;
        this.j3 = true;
        new Paint();
        new RectF();
        this.f36966f1 = true;
        this.f40271h3 = org.telegram.messenger.g0.L(200.0f);
    }

    public final void B1(boolean z9, org.telegram.ui.Cells.t2 t2Var) {
        w91 w91Var = this.f50275m3;
        w91Var.E = z9;
        int i7 = 2;
        boolean z10 = true;
        if (!z9) {
            if (t2Var != null) {
                w91Var.F.h1(1, 0);
                if (w91Var.E) {
                    i7 = 0;
                }
                w91Var.D = i7;
                fv fvVar = w91Var.f51037x;
                if (fvVar != null) {
                    if (i7 == 0) {
                        z10 = false;
                    }
                    fvVar.X = z10;
                }
            }
        } else {
            w91Var.F.h1(0, 0);
            if (w91Var.E) {
                i7 = 0;
            }
            w91Var.D = i7;
            fv fvVar2 = w91Var.f51037x;
            if (fvVar2 != null) {
                if (i7 == 0) {
                    z10 = false;
                }
                fvVar2.X = z10;
            }
            if (t2Var != null) {
                t2Var.b0();
                t2Var.invalidate();
            }
        }
        m91 m91Var = w91Var.E0;
        if (m91Var != null) {
            m91Var.forceLayout();
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
        view.setTranslationY(this.f50274l3);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        w91 w91Var = this.f50275m3;
        if (w91Var.f51000c1 != null) {
            canvas.save();
            canvas.translate(w91Var.f51000c1.getLeft(), w91Var.f51000c1.getY());
            w91Var.f51000c1.draw(canvas);
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
        if (this.f50275m3.f51000c1 == view) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        w91 w91Var = this.f50275m3;
        if (w91Var.f51037x != null && this.f50274l3 != 0.0f) {
            int paddingTop = getPaddingTop();
            if (paddingTop != 0) {
                canvas.save();
                canvas.translate(0.0f, paddingTop);
            }
            w91Var.f51037x.c(canvas, true);
            if (paddingTop != 0) {
                canvas.restore();
            }
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        if (!this.V1) {
            HashSet hashSet = w91.f50991q1;
            w91 w91Var = this.f50275m3;
            if (w91Var.getParentLayout() == null || !((ActionBarLayout) w91Var.getParentLayout()).y()) {
                if (motionEvent.getAction() == 0) {
                    kVar = ((org.telegram.ui.ActionBar.f2) w91Var).actionBar;
                    kVar.getClass();
                    v4.g0 adapter = getAdapter();
                    if (w91Var.f50998c != adapter.b()) {
                        this.f50273k3 = true;
                        adapter.f();
                        this.f50273k3 = false;
                    }
                }
                return super.onInterceptTouchEvent(motionEvent);
            }
        }
        return false;
    }

    @Override
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        w91 w91Var = this.f50275m3;
        w91Var.getClass();
        w91Var.getClass();
        w91Var.getClass();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        if (this.j3) {
            w91 w91Var = this.f50275m3;
            if (w91Var.getMessagesController().Y1) {
                if (w91Var.f51039y > 0) {
                    this.f50273k3 = true;
                    kVar = ((org.telegram.ui.ActionBar.f2) w91Var).actionBar;
                    ((v4.b0) getLayoutManager()).h1(1, (int) kVar.getTranslationY());
                    this.f50273k3 = false;
                }
                this.j3 = false;
            }
        }
        super.onMeasure(i7, i10);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        v4.b0 b0Var;
        int L0;
        float f10;
        if (!this.V1) {
            HashSet hashSet = w91.f50991q1;
            w91 w91Var = this.f50275m3;
            if (w91Var.getParentLayout() == null || !((ActionBarLayout) w91Var.getParentLayout()).y()) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    setOverScrollMode(0);
                }
                if (action == 1 || action == 3) {
                    c91 c91Var = w91Var.O;
                    if (c91Var.D != 0 && w91Var.P.d && c91Var.i(null, 4) != 0) {
                        w91Var.P.getClass();
                    }
                }
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if ((action == 1 || action == 3) && w91Var.D == 2 && w91Var.f51039y > 0 && (L0 = (b0Var = (v4.b0) getLayoutManager()).L0()) == 0) {
                    int paddingTop = getPaddingTop();
                    View m10 = b0Var.m(L0);
                    if (org.telegram.messenger.iz.f23427p1) {
                        f10 = 78.0f;
                    } else {
                        f10 = 72.0f;
                    }
                    int L = (int) (org.telegram.messenger.g0.L(f10) * 0.85f);
                    int measuredHeight = m10.getMeasuredHeight() + (m10.getTop() - paddingTop);
                    long currentTimeMillis = System.currentTimeMillis() - w91Var.Y;
                    if (measuredHeight >= L && currentTimeMillis >= 200) {
                        if (w91Var.D != 1) {
                            if (this.f50274l3 == 0.0f) {
                                w0(0, m10.getTop() - paddingTop, org.telegram.ui.Components.xq.h);
                            }
                            if (!w91Var.Z) {
                                w91Var.Z = true;
                                try {
                                    performHapticFeedback(3, 2);
                                } catch (Exception unused) {
                                }
                                fv fvVar = w91Var.f51037x;
                                if (fvVar != null) {
                                    fvVar.a(true);
                                }
                            }
                            ((org.telegram.ui.Cells.t2) m10).i0();
                            w91Var.D = 1;
                        }
                    } else {
                        w0(0, measuredHeight, org.telegram.ui.Components.xq.h);
                        w91Var.D = 2;
                    }
                    float f11 = this.f50274l3;
                    if (f11 != 0.0f) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, 0.0f);
                        ofFloat.addUpdateListener(new gz0(this, 15));
                        ofFloat.setDuration(Math.max(100L, org.telegram.messenger.camera.q.v(this.f50274l3, org.telegram.messenger.g0.L(72.0f), 120.0f, 350.0f)));
                        ofFloat.setInterpolator(org.telegram.ui.Components.xq.h);
                        setScrollEnabled(false);
                        ofFloat.addListener(new s81(this, 1));
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
        if (this.f50273k3) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setAdapter(v4.g0 g0Var) {
        super.setAdapter(g0Var);
        this.j3 = true;
    }

    public final void setViewsOffset(float f10) {
        View m10;
        this.f50274l3 = f10;
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            getChildAt(i7).setTranslationY(f10);
        }
        if (this.C1 != -1 && (m10 = getLayoutManager().m(this.C1)) != null) {
            int right = m10.getRight();
            int bottom = (int) (m10.getBottom() + f10);
            Rect rect = this.E1;
            rect.set(m10.getLeft(), (int) (m10.getTop() + f10), right, bottom);
            this.B1.setBounds(rect);
        }
        invalidate();
    }
}
