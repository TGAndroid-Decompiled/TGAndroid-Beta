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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.ActionBarLayout;
public abstract class uf1 extends org.telegram.ui.Components.ia {
    public static final int f38466h3 = 0;
    public boolean f38467d3;
    public boolean f38468e3;
    public float f38469f3;
    public final wf1 f38470g3;

    public uf1(wf1 wf1Var, Context context) {
        super(context, null);
        this.f38470g3 = wf1Var;
        this.f38467d3 = true;
        new Paint();
        new RectF();
        this.f30098h1 = true;
        this.f24993b3 = AndroidUtilities.dp(200.0f);
    }

    @Override
    public final boolean F0(View view) {
        if ((view instanceof org.telegram.ui.Cells.m4) && !view.isClickable()) {
            return false;
        }
        return true;
    }

    @Override
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        view.setTranslationY(this.f38469f3);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        wf1 wf1Var = this.f38470g3;
        if (wf1Var.f39313b1 != null) {
            canvas.save();
            canvas.translate(wf1Var.f39313b1.getLeft(), wf1Var.f39313b1.getY());
            wf1Var.f39313b1.draw(canvas);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        y1();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        y1();
        if (this.f38470g3.f39313b1 == view) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        wf1 wf1Var = this.f38470g3;
        if (wf1Var.f39348w != null && this.f38469f3 != 0.0f) {
            int paddingTop = getPaddingTop();
            if (paddingTop != 0) {
                canvas.save();
                canvas.translate(0.0f, paddingTop);
            }
            wf1Var.f39348w.c(canvas, true);
            if (paddingTop != 0) {
                canvas.restore();
            }
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        if (!this.X1) {
            HashSet hashSet = wf1.f39307n1;
            wf1 wf1Var = this.f38470g3;
            if (wf1Var.getParentLayout() == null || !((ActionBarLayout) wf1Var.getParentLayout()).y()) {
                if (motionEvent.getAction() == 0) {
                    kVar = ((org.telegram.ui.ActionBar.m2) wf1Var).actionBar;
                    kVar.getClass();
                    s4.h0 adapter = getAdapter();
                    if (wf1Var.f39314c != adapter.h()) {
                        this.f38468e3 = true;
                        adapter.l();
                        this.f38468e3 = false;
                    }
                }
                return super.onInterceptTouchEvent(motionEvent);
            }
        }
        return false;
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        HashSet hashSet = wf1.f39307n1;
        wf1 wf1Var = this.f38470g3;
        wf1Var.getClass();
        wf1Var.getClass();
        wf1Var.getClass();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        if (this.f38467d3) {
            wf1 wf1Var = this.f38470g3;
            if (wf1Var.getMessagesController().dialogsLoaded) {
                if (wf1Var.f39350x > 0) {
                    this.f38468e3 = true;
                    kVar = ((org.telegram.ui.ActionBar.m2) wf1Var).actionBar;
                    ((s4.c0) getLayoutManager()).h1(1, (int) kVar.getTranslationY());
                    this.f38468e3 = false;
                }
                this.f38467d3 = false;
            }
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        s4.c0 c0Var;
        int L0;
        float f7;
        if (!this.X1) {
            HashSet hashSet = wf1.f39307n1;
            wf1 wf1Var = this.f38470g3;
            if (wf1Var.getParentLayout() == null || !((ActionBarLayout) wf1Var.getParentLayout()).y()) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    setOverScrollMode(0);
                }
                if (action == 1 || action == 3) {
                    af1 af1Var = wf1Var.O;
                    if (af1Var.f43109y != 0 && wf1Var.P.d && af1Var.g(null, 4) != 0) {
                        wf1Var.P.getClass();
                    }
                }
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if ((action == 1 || action == 3) && wf1Var.f39352y == 2 && wf1Var.f39350x > 0 && (L0 = (c0Var = (s4.c0) getLayoutManager()).L0()) == 0) {
                    int paddingTop = getPaddingTop();
                    View m10 = c0Var.m(L0);
                    if (SharedConfig.useThreeLinesLayout) {
                        f7 = 78.0f;
                    } else {
                        f7 = 72.0f;
                    }
                    int dp = (int) (AndroidUtilities.dp(f7) * 0.85f);
                    int measuredHeight = m10.getMeasuredHeight() + (m10.getTop() - paddingTop);
                    long currentTimeMillis = System.currentTimeMillis() - wf1Var.Y;
                    if (measuredHeight >= dp && currentTimeMillis >= 200) {
                        if (wf1Var.f39352y != 1) {
                            if (this.f38469f3 == 0.0f) {
                                v0(0, m10.getTop() - paddingTop, org.telegram.ui.Components.rr.h);
                            }
                            if (!wf1Var.Z) {
                                wf1Var.Z = true;
                                try {
                                    performHapticFeedback(3, 2);
                                } catch (Exception unused) {
                                }
                                ww wwVar = wf1Var.f39348w;
                                if (wwVar != null) {
                                    wwVar.a(true);
                                }
                            }
                            ((org.telegram.ui.Cells.s2) m10).a0();
                            wf1Var.f39352y = 1;
                        }
                    } else {
                        v0(0, measuredHeight, org.telegram.ui.Components.rr.h);
                        wf1Var.f39352y = 2;
                    }
                    float f10 = this.f38469f3;
                    if (f10 != 0.0f) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                        ofFloat.addUpdateListener(new q11(this, 19));
                        ofFloat.setDuration(Math.max(100L, org.telegram.messenger.ok.b(this.f38469f3, AndroidUtilities.dp(72.0f), 120.0f, 350.0f)));
                        ofFloat.setInterpolator(org.telegram.ui.Components.rr.h);
                        setScrollEnabled(false);
                        ofFloat.addListener(new xo0(this, 25));
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
        if (this.f38468e3) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setAdapter(s4.h0 h0Var) {
        super.setAdapter(h0Var);
        this.f38467d3 = true;
    }

    public final void setViewsOffset(float f7) {
        View m10;
        this.f38469f3 = f7;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            getChildAt(i10).setTranslationY(f7);
        }
        if (this.E1 != -1 && (m10 = getLayoutManager().m(this.E1)) != null) {
            int right = m10.getRight();
            int bottom = (int) (m10.getBottom() + f7);
            Rect rect = this.G1;
            rect.set(m10.getLeft(), (int) (m10.getTop() + f7), right, bottom);
            this.D1.setBounds(rect);
        }
        invalidate();
    }

    public final void y1() {
        if (getItemAnimator() != null && getItemAnimator().k()) {
            HashSet hashSet = wf1.f39307n1;
        }
    }

    public final void z1(boolean z10, org.telegram.ui.Cells.s2 s2Var) {
        wf1 wf1Var = this.f38470g3;
        wf1Var.E = z10;
        int i10 = 2;
        boolean z11 = true;
        if (!z10) {
            if (s2Var != null) {
                wf1Var.F.h1(1, 0);
                if (wf1Var.E) {
                    i10 = 0;
                }
                wf1Var.f39352y = i10;
                ww wwVar = wf1Var.f39348w;
                if (wwVar != null) {
                    if (i10 == 0) {
                        z11 = false;
                    }
                    wwVar.X = z11;
                }
            }
        } else {
            wf1Var.F.h1(0, 0);
            if (wf1Var.E) {
                i10 = 0;
            }
            wf1Var.f39352y = i10;
            ww wwVar2 = wf1Var.f39348w;
            if (wwVar2 != null) {
                if (i10 == 0) {
                    z11 = false;
                }
                wwVar2.X = z11;
            }
            if (s2Var != null) {
                s2Var.U();
                s2Var.invalidate();
            }
        }
        kf1 kf1Var = wf1Var.E0;
        if (kf1Var != null) {
            kf1Var.forceLayout();
        }
    }
}
