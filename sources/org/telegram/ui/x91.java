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
public abstract class x91 extends org.telegram.ui.Components.w9 {
    public static final int f51654n3 = 0;
    public boolean j3;
    public boolean f51655k3;
    public float f51656l3;
    public final z91 f51657m3;

    public x91(z91 z91Var, Context context) {
        super(context, null);
        this.f51657m3 = z91Var;
        this.j3 = true;
        new Paint();
        new RectF();
        this.f36965f1 = true;
        this.f39932h3 = org.telegram.messenger.g0.L(200.0f);
    }

    public final void B1(boolean z9, org.telegram.ui.Cells.t2 t2Var) {
        z91 z91Var = this.f51657m3;
        z91Var.E = z9;
        int i7 = 2;
        boolean z10 = true;
        if (!z9) {
            if (t2Var != null) {
                z91Var.F.h1(1, 0);
                if (z91Var.E) {
                    i7 = 0;
                }
                z91Var.D = i7;
                iv ivVar = z91Var.f52388x;
                if (ivVar != null) {
                    if (i7 == 0) {
                        z10 = false;
                    }
                    ivVar.X = z10;
                }
            }
        } else {
            z91Var.F.h1(0, 0);
            if (z91Var.E) {
                i7 = 0;
            }
            z91Var.D = i7;
            iv ivVar2 = z91Var.f52388x;
            if (ivVar2 != null) {
                if (i7 == 0) {
                    z10 = false;
                }
                ivVar2.X = z10;
            }
            if (t2Var != null) {
                t2Var.b0();
                t2Var.invalidate();
            }
        }
        p91 p91Var = z91Var.E0;
        if (p91Var != null) {
            p91Var.forceLayout();
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
        view.setTranslationY(this.f51656l3);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        z91 z91Var = this.f51657m3;
        if (z91Var.f52351c1 != null) {
            canvas.save();
            canvas.translate(z91Var.f52351c1.getLeft(), z91Var.f52351c1.getY());
            z91Var.f52351c1.draw(canvas);
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
        if (this.f51657m3.f52351c1 == view) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        z91 z91Var = this.f51657m3;
        if (z91Var.f52388x != null && this.f51656l3 != 0.0f) {
            int paddingTop = getPaddingTop();
            if (paddingTop != 0) {
                canvas.save();
                canvas.translate(0.0f, paddingTop);
            }
            z91Var.f52388x.c(canvas, true);
            if (paddingTop != 0) {
                canvas.restore();
            }
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.l lVar;
        if (!this.V1) {
            HashSet hashSet = z91.f52342q1;
            z91 z91Var = this.f51657m3;
            if (z91Var.getParentLayout() == null || !((ActionBarLayout) z91Var.getParentLayout()).y()) {
                if (motionEvent.getAction() == 0) {
                    lVar = ((org.telegram.ui.ActionBar.f2) z91Var).actionBar;
                    lVar.getClass();
                    v4.g0 adapter = getAdapter();
                    if (z91Var.f52349c != adapter.b()) {
                        this.f51655k3 = true;
                        adapter.f();
                        this.f51655k3 = false;
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
        z91 z91Var = this.f51657m3;
        z91Var.getClass();
        z91Var.getClass();
        z91Var.getClass();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        org.telegram.ui.ActionBar.l lVar;
        if (this.j3) {
            z91 z91Var = this.f51657m3;
            if (z91Var.getMessagesController().Y1) {
                if (z91Var.f52390y > 0) {
                    this.f51655k3 = true;
                    lVar = ((org.telegram.ui.ActionBar.f2) z91Var).actionBar;
                    ((v4.b0) getLayoutManager()).h1(1, (int) lVar.getTranslationY());
                    this.f51655k3 = false;
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
            HashSet hashSet = z91.f52342q1;
            z91 z91Var = this.f51657m3;
            if (z91Var.getParentLayout() == null || !((ActionBarLayout) z91Var.getParentLayout()).y()) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    setOverScrollMode(0);
                }
                if (action == 1 || action == 3) {
                    e91 e91Var = z91Var.O;
                    if (e91Var.D != 0 && z91Var.P.d && e91Var.i(null, 4) != 0) {
                        z91Var.P.getClass();
                    }
                }
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if ((action == 1 || action == 3) && z91Var.D == 2 && z91Var.f52390y > 0 && (L0 = (b0Var = (v4.b0) getLayoutManager()).L0()) == 0) {
                    int paddingTop = getPaddingTop();
                    View m10 = b0Var.m(L0);
                    if (org.telegram.messenger.iz.f23431p1) {
                        f10 = 78.0f;
                    } else {
                        f10 = 72.0f;
                    }
                    int L = (int) (org.telegram.messenger.g0.L(f10) * 0.85f);
                    int measuredHeight = m10.getMeasuredHeight() + (m10.getTop() - paddingTop);
                    long currentTimeMillis = System.currentTimeMillis() - z91Var.Y;
                    if (measuredHeight >= L && currentTimeMillis >= 200) {
                        if (z91Var.D != 1) {
                            if (this.f51656l3 == 0.0f) {
                                w0(0, m10.getTop() - paddingTop, org.telegram.ui.Components.wq.h);
                            }
                            if (!z91Var.Z) {
                                z91Var.Z = true;
                                try {
                                    performHapticFeedback(3, 2);
                                } catch (Exception unused) {
                                }
                                iv ivVar = z91Var.f52388x;
                                if (ivVar != null) {
                                    ivVar.a(true);
                                }
                            }
                            ((org.telegram.ui.Cells.t2) m10).i0();
                            z91Var.D = 1;
                        }
                    } else {
                        w0(0, measuredHeight, org.telegram.ui.Components.wq.h);
                        z91Var.D = 2;
                    }
                    float f11 = this.f51656l3;
                    if (f11 != 0.0f) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, 0.0f);
                        ofFloat.addUpdateListener(new kz0(this, 15));
                        ofFloat.setDuration(Math.max(100L, org.telegram.messenger.camera.q.v(this.f51656l3, org.telegram.messenger.g0.L(72.0f), 120.0f, 350.0f)));
                        ofFloat.setInterpolator(org.telegram.ui.Components.wq.h);
                        setScrollEnabled(false);
                        ofFloat.addListener(new u81(this, 1));
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
        if (this.f51655k3) {
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
        this.f51656l3 = f10;
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
