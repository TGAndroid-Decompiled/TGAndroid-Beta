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
public abstract class xe1 extends org.telegram.ui.Components.fa {
    public static final int f44578d3 = 0;
    public boolean Z2;
    public boolean f44579a3;
    public float f44580b3;
    public final ze1 c3;

    public xe1(ze1 ze1Var, Context context) {
        super(context, null);
        this.c3 = ze1Var;
        this.Z2 = true;
        new Paint();
        new RectF();
        this.f29693d1 = true;
        this.X2 = AndroidUtilities.dp(200.0f);
    }

    @Override
    public final boolean F0(View view) {
        if ((view instanceof org.telegram.ui.Cells.k4) && !view.isClickable()) {
            return false;
        }
        return true;
    }

    @Override
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        view.setTranslationY(this.f44580b3);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ze1 ze1Var = this.c3;
        if (ze1Var.X0 != null) {
            canvas.save();
            canvas.translate(ze1Var.X0.getLeft(), ze1Var.X0.getY());
            ze1Var.X0.draw(canvas);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        y1();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        y1();
        if (this.c3.X0 == view) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ze1 ze1Var = this.c3;
        if (ze1Var.f45193w != null && this.f44580b3 != 0.0f) {
            int paddingTop = getPaddingTop();
            if (paddingTop != 0) {
                canvas.save();
                canvas.translate(0.0f, paddingTop);
            }
            ze1Var.f45193w.c(canvas, true);
            if (paddingTop != 0) {
                canvas.restore();
            }
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.l lVar;
        if (!this.T1) {
            HashSet hashSet = ze1.f45154j1;
            ze1 ze1Var = this.c3;
            if (ze1Var.getParentLayout() == null || !((ActionBarLayout) ze1Var.getParentLayout()).y()) {
                if (motionEvent.getAction() == 0) {
                    lVar = ((org.telegram.ui.ActionBar.o2) ze1Var).actionBar;
                    lVar.getClass();
                    f2.p0 adapter = getAdapter();
                    if (ze1Var.f45161c != adapter.h()) {
                        this.f44579a3 = true;
                        adapter.l();
                        this.f44579a3 = false;
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
        HashSet hashSet = ze1.f45154j1;
        ze1 ze1Var = this.c3;
        ze1Var.getClass();
        ze1Var.getClass();
        ze1Var.getClass();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.l lVar;
        if (this.Z2) {
            ze1 ze1Var = this.c3;
            if (ze1Var.getMessagesController().dialogsLoaded) {
                if (ze1Var.f45195x > 0) {
                    this.f44579a3 = true;
                    lVar = ((org.telegram.ui.ActionBar.o2) ze1Var).actionBar;
                    ((f2.j0) getLayoutManager()).h1(1, (int) lVar.getTranslationY());
                    this.f44579a3 = false;
                }
                this.Z2 = false;
            }
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        f2.j0 j0Var;
        int L0;
        float f9;
        if (!this.T1) {
            HashSet hashSet = ze1.f45154j1;
            ze1 ze1Var = this.c3;
            if (ze1Var.getParentLayout() == null || !((ActionBarLayout) ze1Var.getParentLayout()).y()) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    setOverScrollMode(0);
                }
                if (action == 1 || action == 3) {
                    be1 be1Var = ze1Var.K;
                    if (be1Var.f6309y != 0 && ze1Var.L.d && be1Var.f(null, 4) != 0) {
                        ze1Var.L.getClass();
                    }
                }
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if ((action == 1 || action == 3) && ze1Var.f45197y == 2 && ze1Var.f45195x > 0 && (L0 = (j0Var = (f2.j0) getLayoutManager()).L0()) == 0) {
                    int paddingTop = getPaddingTop();
                    View m10 = j0Var.m(L0);
                    if (SharedConfig.useThreeLinesLayout) {
                        f9 = 78.0f;
                    } else {
                        f9 = 72.0f;
                    }
                    int dp = (int) (AndroidUtilities.dp(f9) * 0.85f);
                    int measuredHeight = m10.getMeasuredHeight() + (m10.getTop() - paddingTop);
                    long currentTimeMillis = System.currentTimeMillis() - ze1Var.U;
                    if (measuredHeight >= dp && currentTimeMillis >= 200) {
                        if (ze1Var.f45197y != 1) {
                            if (this.f44580b3 == 0.0f) {
                                v0(0, m10.getTop() - paddingTop, org.telegram.ui.Components.jr.h);
                            }
                            if (!ze1Var.V) {
                                ze1Var.V = true;
                                try {
                                    performHapticFeedback(3, 2);
                                } catch (Exception unused) {
                                }
                                mw mwVar = ze1Var.f45193w;
                                if (mwVar != null) {
                                    mwVar.a(true);
                                }
                            }
                            ((org.telegram.ui.Cells.p2) m10).a0();
                            ze1Var.f45197y = 1;
                        }
                    } else {
                        v0(0, measuredHeight, org.telegram.ui.Components.jr.h);
                        ze1Var.f45197y = 2;
                    }
                    float f10 = this.f44580b3;
                    if (f10 != 0.0f) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                        ofFloat.addUpdateListener(new w01(this, 19));
                        ofFloat.setDuration(Math.max(100L, org.telegram.messenger.x3.A(this.f44580b3, AndroidUtilities.dp(72.0f), 120.0f, 350.0f)));
                        ofFloat.setInterpolator(org.telegram.ui.Components.jr.h);
                        setScrollEnabled(false);
                        ofFloat.addListener(new cc1(this, 2));
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
        if (this.f44579a3) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setAdapter(f2.p0 p0Var) {
        super.setAdapter(p0Var);
        this.Z2 = true;
    }

    public final void setViewsOffset(float f9) {
        View m10;
        this.f44580b3 = f9;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            getChildAt(i10).setTranslationY(f9);
        }
        if (this.A1 != -1 && (m10 = getLayoutManager().m(this.A1)) != null) {
            int right = m10.getRight();
            int bottom = (int) (m10.getBottom() + f9);
            Rect rect = this.C1;
            rect.set(m10.getLeft(), (int) (m10.getTop() + f9), right, bottom);
            this.f29736z1.setBounds(rect);
        }
        invalidate();
    }

    public final void y1() {
        if (getItemAnimator() != null && getItemAnimator().k()) {
            HashSet hashSet = ze1.f45154j1;
        }
    }

    public final void z1(boolean z10, org.telegram.ui.Cells.p2 p2Var) {
        ze1 ze1Var = this.c3;
        ze1Var.A = z10;
        int i10 = 2;
        boolean z11 = true;
        if (!z10) {
            if (p2Var != null) {
                ze1Var.B.h1(1, 0);
                if (ze1Var.A) {
                    i10 = 0;
                }
                ze1Var.f45197y = i10;
                mw mwVar = ze1Var.f45193w;
                if (mwVar != null) {
                    if (i10 == 0) {
                        z11 = false;
                    }
                    mwVar.X = z11;
                }
            }
        } else {
            ze1Var.B.h1(0, 0);
            if (ze1Var.A) {
                i10 = 0;
            }
            ze1Var.f45197y = i10;
            mw mwVar2 = ze1Var.f45193w;
            if (mwVar2 != null) {
                if (i10 == 0) {
                    z11 = false;
                }
                mwVar2.X = z11;
            }
            if (p2Var != null) {
                p2Var.U();
                p2Var.invalidate();
            }
        }
        me1 me1Var = ze1Var.A0;
        if (me1Var != null) {
            me1Var.forceLayout();
        }
    }
}
