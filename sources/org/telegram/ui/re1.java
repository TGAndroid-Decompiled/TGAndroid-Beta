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
public abstract class re1 extends org.telegram.ui.Components.ia {
    public static final int f40712f3 = 0;
    public boolean f40713b3;
    public boolean f40714c3;
    public float f40715d3;
    public final te1 f40716e3;

    public re1(te1 te1Var, Context context) {
        super(context, null);
        this.f40716e3 = te1Var;
        this.f40713b3 = true;
        new Paint();
        new RectF();
        this.f27268f1 = true;
        this.Z2 = AndroidUtilities.dp(200.0f);
    }

    public final void A1(boolean z10, org.telegram.ui.Cells.r2 r2Var) {
        te1 te1Var = this.f40716e3;
        te1Var.E = z10;
        int i10 = 2;
        boolean z11 = true;
        if (!z10) {
            if (r2Var != null) {
                te1Var.F.h1(1, 0);
                if (te1Var.E) {
                    i10 = 0;
                }
                te1Var.f41723y = i10;
                kw kwVar = te1Var.f41719w;
                if (kwVar != null) {
                    if (i10 == 0) {
                        z11 = false;
                    }
                    kwVar.X = z11;
                }
            }
        } else {
            te1Var.F.h1(0, 0);
            if (te1Var.E) {
                i10 = 0;
            }
            te1Var.f41723y = i10;
            kw kwVar2 = te1Var.f41719w;
            if (kwVar2 != null) {
                if (i10 == 0) {
                    z11 = false;
                }
                kwVar2.X = z11;
            }
            if (r2Var != null) {
                r2Var.U();
                r2Var.invalidate();
            }
        }
        he1 he1Var = te1Var.E0;
        if (he1Var != null) {
            he1Var.forceLayout();
        }
    }

    @Override
    public final boolean F0(View view) {
        if ((view instanceof org.telegram.ui.Cells.l4) && !view.isClickable()) {
            return false;
        }
        return true;
    }

    @Override
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        view.setTranslationY(this.f40715d3);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        te1 te1Var = this.f40716e3;
        if (te1Var.f41684b1 != null) {
            canvas.save();
            canvas.translate(te1Var.f41684b1.getLeft(), te1Var.f41684b1.getY());
            te1Var.f41684b1.draw(canvas);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        z1();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        z1();
        if (this.f40716e3.f41684b1 == view) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        te1 te1Var = this.f40716e3;
        if (te1Var.f41719w != null && this.f40715d3 != 0.0f) {
            int paddingTop = getPaddingTop();
            if (paddingTop != 0) {
                canvas.save();
                canvas.translate(0.0f, paddingTop);
            }
            te1Var.f41719w.c(canvas, true);
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
            HashSet hashSet = te1.f41678n1;
            te1 te1Var = this.f40716e3;
            if (te1Var.getParentLayout() == null || !((ActionBarLayout) te1Var.getParentLayout()).y()) {
                if (motionEvent.getAction() == 0) {
                    kVar = ((org.telegram.ui.ActionBar.n2) te1Var).actionBar;
                    kVar.getClass();
                    s4.g0 adapter = getAdapter();
                    if (te1Var.f41685c != adapter.h()) {
                        this.f40714c3 = true;
                        adapter.l();
                        this.f40714c3 = false;
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
        HashSet hashSet = te1.f41678n1;
        te1 te1Var = this.f40716e3;
        te1Var.getClass();
        te1Var.getClass();
        te1Var.getClass();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        if (this.f40713b3) {
            te1 te1Var = this.f40716e3;
            if (te1Var.getMessagesController().dialogsLoaded) {
                if (te1Var.f41721x > 0) {
                    this.f40714c3 = true;
                    kVar = ((org.telegram.ui.ActionBar.n2) te1Var).actionBar;
                    ((s4.b0) getLayoutManager()).h1(1, (int) kVar.getTranslationY());
                    this.f40714c3 = false;
                }
                this.f40713b3 = false;
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
            HashSet hashSet = te1.f41678n1;
            te1 te1Var = this.f40716e3;
            if (te1Var.getParentLayout() == null || !((ActionBarLayout) te1Var.getParentLayout()).y()) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    setOverScrollMode(0);
                }
                if (action == 1 || action == 3) {
                    xd1 xd1Var = te1Var.O;
                    if (xd1Var.f46093y != 0 && te1Var.P.d && xd1Var.g(null, 4) != 0) {
                        te1Var.P.getClass();
                    }
                }
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if ((action == 1 || action == 3) && te1Var.f41723y == 2 && te1Var.f41721x > 0 && (L0 = (b0Var = (s4.b0) getLayoutManager()).L0()) == 0) {
                    int paddingTop = getPaddingTop();
                    View m10 = b0Var.m(L0);
                    if (SharedConfig.useThreeLinesLayout) {
                        f7 = 78.0f;
                    } else {
                        f7 = 72.0f;
                    }
                    int dp = (int) (AndroidUtilities.dp(f7) * 0.85f);
                    int measuredHeight = m10.getMeasuredHeight() + (m10.getTop() - paddingTop);
                    long currentTimeMillis = System.currentTimeMillis() - te1Var.Y;
                    if (measuredHeight >= dp && currentTimeMillis >= 200) {
                        if (te1Var.f41723y != 1) {
                            if (this.f40715d3 == 0.0f) {
                                v0(0, m10.getTop() - paddingTop, org.telegram.ui.Components.bs.h);
                            }
                            if (!te1Var.Z) {
                                te1Var.Z = true;
                                try {
                                    performHapticFeedback(3, 2);
                                } catch (Exception unused) {
                                }
                                kw kwVar = te1Var.f41719w;
                                if (kwVar != null) {
                                    kwVar.a(true);
                                }
                            }
                            ((org.telegram.ui.Cells.r2) m10).a0();
                            te1Var.f41723y = 1;
                        }
                    } else {
                        v0(0, measuredHeight, org.telegram.ui.Components.bs.h);
                        te1Var.f41723y = 2;
                    }
                    float f10 = this.f40715d3;
                    if (f10 != 0.0f) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                        ofFloat.addUpdateListener(new e11(this, 17));
                        ofFloat.setDuration(Math.max(100L, org.telegram.messenger.wh.y(this.f40715d3, AndroidUtilities.dp(72.0f), 120.0f, 350.0f)));
                        ofFloat.setInterpolator(org.telegram.ui.Components.bs.h);
                        setScrollEnabled(false);
                        ofFloat.addListener(new bc0(this, 29));
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
        if (this.f40714c3) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setAdapter(s4.g0 g0Var) {
        super.setAdapter(g0Var);
        this.f40713b3 = true;
    }

    public final void setViewsOffset(float f7) {
        View m10;
        this.f40715d3 = f7;
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

    public final void z1() {
        if (getItemAnimator() != null && getItemAnimator().k()) {
            HashSet hashSet = te1.f41678n1;
        }
    }
}
