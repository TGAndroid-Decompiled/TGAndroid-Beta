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
public abstract class we1 extends org.telegram.ui.Components.ia {
    public static final int f43018i3 = 0;
    public boolean f43019e3;
    public boolean f43020f3;
    public float f43021g3;
    public final ye1 f43022h3;

    public we1(ye1 ye1Var, Context context) {
        super(context, null);
        this.f43022h3 = ye1Var;
        this.f43019e3 = true;
        new Paint();
        new RectF();
        this.f28689f1 = true;
        this.f27259c3 = AndroidUtilities.dp(200.0f);
    }

    public final void E1() {
        if (getItemAnimator() != null && getItemAnimator().k()) {
            HashSet hashSet = ye1.f43791q1;
        }
    }

    @Override
    public final boolean F0(View view) {
        if ((view instanceof org.telegram.ui.Cells.l4) && !view.isClickable()) {
            return false;
        }
        return true;
    }

    public final void F1(boolean z10, org.telegram.ui.Cells.q2 q2Var) {
        ye1 ye1Var = this.f43022h3;
        ye1Var.E = z10;
        int i10 = 2;
        boolean z11 = true;
        if (!z10) {
            if (q2Var != null) {
                ye1Var.F.h1(1, 0);
                if (ye1Var.E) {
                    i10 = 0;
                }
                ye1Var.f43839y = i10;
                kw kwVar = ye1Var.f43835w;
                if (kwVar != null) {
                    if (i10 == 0) {
                        z11 = false;
                    }
                    kwVar.X = z11;
                }
            }
        } else {
            ye1Var.F.h1(0, 0);
            if (ye1Var.E) {
                i10 = 0;
            }
            ye1Var.f43839y = i10;
            kw kwVar2 = ye1Var.f43835w;
            if (kwVar2 != null) {
                if (i10 == 0) {
                    z11 = false;
                }
                kwVar2.X = z11;
            }
            if (q2Var != null) {
                q2Var.T();
                q2Var.invalidate();
            }
        }
        le1 le1Var = ye1Var.E0;
        if (le1Var != null) {
            le1Var.forceLayout();
        }
    }

    @Override
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        view.setTranslationY(this.f43021g3);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ye1 ye1Var = this.f43022h3;
        if (ye1Var.f43800c1 != null) {
            canvas.save();
            canvas.translate(ye1Var.f43800c1.getLeft(), ye1Var.f43800c1.getY());
            ye1Var.f43800c1.draw(canvas);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        E1();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        E1();
        if (this.f43022h3.f43800c1 == view) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ye1 ye1Var = this.f43022h3;
        if (ye1Var.f43835w != null && this.f43021g3 != 0.0f) {
            int paddingTop = getPaddingTop();
            if (paddingTop != 0) {
                canvas.save();
                canvas.translate(0.0f, paddingTop);
            }
            ye1Var.f43835w.c(canvas, true);
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
            HashSet hashSet = ye1.f43791q1;
            ye1 ye1Var = this.f43022h3;
            if (ye1Var.getParentLayout() == null || !((ActionBarLayout) ye1Var.getParentLayout()).x()) {
                if (motionEvent.getAction() == 0) {
                    kVar = ((org.telegram.ui.ActionBar.o2) ye1Var).actionBar;
                    kVar.getClass();
                    s4.g0 adapter = getAdapter();
                    if (ye1Var.f43798c != adapter.h()) {
                        this.f43020f3 = true;
                        adapter.l();
                        this.f43020f3 = false;
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
        HashSet hashSet = ye1.f43791q1;
        ye1 ye1Var = this.f43022h3;
        ye1Var.getClass();
        ye1Var.getClass();
        ye1Var.getClass();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        if (this.f43019e3) {
            ye1 ye1Var = this.f43022h3;
            if (ye1Var.getMessagesController().dialogsLoaded) {
                if (ye1Var.f43837x > 0) {
                    this.f43020f3 = true;
                    kVar = ((org.telegram.ui.ActionBar.o2) ye1Var).actionBar;
                    ((s4.b0) getLayoutManager()).h1(1, (int) kVar.getTranslationY());
                    this.f43020f3 = false;
                }
                this.f43019e3 = false;
            }
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        s4.b0 b0Var;
        int L0;
        float f7;
        if (!this.V1) {
            HashSet hashSet = ye1.f43791q1;
            ye1 ye1Var = this.f43022h3;
            if (ye1Var.getParentLayout() == null || !((ActionBarLayout) ye1Var.getParentLayout()).x()) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    setOverScrollMode(0);
                }
                if (action == 1 || action == 3) {
                    be1 be1Var = ye1Var.O;
                    if (be1Var.f46498y != 0 && ye1Var.P.d && be1Var.g(null, 4) != 0) {
                        ye1Var.P.getClass();
                    }
                }
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if ((action == 1 || action == 3) && ye1Var.f43839y == 2 && ye1Var.f43837x > 0 && (L0 = (b0Var = (s4.b0) getLayoutManager()).L0()) == 0) {
                    int paddingTop = getPaddingTop();
                    View m10 = b0Var.m(L0);
                    if (SharedConfig.useThreeLinesLayout) {
                        f7 = 78.0f;
                    } else {
                        f7 = 72.0f;
                    }
                    int dp = (int) (AndroidUtilities.dp(f7) * 0.85f);
                    int measuredHeight = m10.getMeasuredHeight() + (m10.getTop() - paddingTop);
                    long currentTimeMillis = System.currentTimeMillis() - ye1Var.Y;
                    if (measuredHeight >= dp && currentTimeMillis >= 200) {
                        if (ye1Var.f43839y != 1) {
                            if (this.f43021g3 == 0.0f) {
                                v0(0, m10.getTop() - paddingTop, org.telegram.ui.Components.bs.h);
                            }
                            if (!ye1Var.Z) {
                                ye1Var.Z = true;
                                try {
                                    performHapticFeedback(3, 2);
                                } catch (Exception unused) {
                                }
                                kw kwVar = ye1Var.f43835w;
                                if (kwVar != null) {
                                    kwVar.a(true);
                                }
                            }
                            ((org.telegram.ui.Cells.q2) m10).Z();
                            ye1Var.f43839y = 1;
                        }
                    } else {
                        v0(0, measuredHeight, org.telegram.ui.Components.bs.h);
                        ye1Var.f43839y = 2;
                    }
                    float f10 = this.f43021g3;
                    if (f10 != 0.0f) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                        ofFloat.addUpdateListener(new g11(this, 17));
                        ofFloat.setDuration(Math.max(100L, org.telegram.messenger.sl.x(this.f43021g3, AndroidUtilities.dp(72.0f), 120.0f, 350.0f)));
                        ofFloat.setInterpolator(org.telegram.ui.Components.bs.h);
                        setScrollEnabled(false);
                        ofFloat.addListener(new ve1(this, 0));
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
        if (this.f43020f3) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setAdapter(s4.g0 g0Var) {
        super.setAdapter(g0Var);
        this.f43019e3 = true;
    }

    public final void setViewsOffset(float f7) {
        View m10;
        this.f43021g3 = f7;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            getChildAt(i10).setTranslationY(f7);
        }
        if (this.C1 != -1 && (m10 = getLayoutManager().m(this.C1)) != null) {
            int right = m10.getRight();
            int bottom = (int) (m10.getBottom() + f7);
            Rect rect = this.E1;
            rect.set(m10.getLeft(), (int) (m10.getTop() + f7), right, bottom);
            this.B1.setBounds(rect);
        }
        invalidate();
    }
}
