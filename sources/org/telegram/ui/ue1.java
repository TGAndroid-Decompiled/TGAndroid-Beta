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

public abstract class ue1 extends org.telegram.ui.Components.y9 {

    public static final int f43208d3 = 0;
    public boolean Z2;
    public boolean a3;

    public float f43209b3;

    public final we1 f43210c3;

    public ue1(we1 we1Var, Context context) {
        super(context, null);
        this.f43210c3 = we1Var;
        this.Z2 = true;
        new Paint();
        new RectF();
        this.f35261d1 = true;
        this.X2 = AndroidUtilities.dp(200.0f);
    }

    @Override
    public final boolean F0(View view) {
        return !(view instanceof org.telegram.ui.Cells.j4) || view.isClickable();
    }

    @Override
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        view.setTranslationY(this.f43209b3);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        we1 we1Var = this.f43210c3;
        if (we1Var.X0 != null) {
            canvas.save();
            canvas.translate(we1Var.X0.getLeft(), we1Var.X0.getY());
            we1Var.X0.draw(canvas);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        y1();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        y1();
        if (this.f43210c3.X0 == view) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        we1 we1Var = this.f43210c3;
        if (we1Var.f43757w != null && this.f43209b3 != 0.0f) {
            int paddingTop = getPaddingTop();
            if (paddingTop != 0) {
                canvas.save();
                canvas.translate(0.0f, paddingTop);
            }
            we1Var.f43757w.c(canvas, true);
            if (paddingTop != 0) {
                canvas.restore();
            }
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.T1) {
            HashSet hashSet = we1.f43718j1;
            we1 we1Var = this.f43210c3;
            if (we1Var.getParentLayout() == null || !((ActionBarLayout) we1Var.getParentLayout()).y()) {
                if (motionEvent.getAction() == 0) {
                    ((org.telegram.ui.ActionBar.n2) we1Var).actionBar.getClass();
                    f2.q0 adapter = getAdapter();
                    if (we1Var.f43725c != adapter.h()) {
                        this.a3 = true;
                        adapter.l();
                        this.a3 = false;
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
        HashSet hashSet = we1.f43718j1;
        we1 we1Var = this.f43210c3;
        we1Var.getClass();
        we1Var.getClass();
        we1Var.getClass();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (this.Z2) {
            we1 we1Var = this.f43210c3;
            if (we1Var.getMessagesController().dialogsLoaded) {
                if (we1Var.f43759x > 0) {
                    this.a3 = true;
                    ((f2.k0) getLayoutManager()).h1(1, (int) ((org.telegram.ui.ActionBar.n2) we1Var).actionBar.getTranslationY());
                    this.a3 = false;
                }
                this.Z2 = false;
            }
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        f2.k0 k0Var;
        int iL0;
        if (!this.T1) {
            HashSet hashSet = we1.f43718j1;
            we1 we1Var = this.f43210c3;
            if (we1Var.getParentLayout() == null || !((ActionBarLayout) we1Var.getParentLayout()).y()) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    setOverScrollMode(0);
                }
                if (action == 1 || action == 3) {
                    ae1 ae1Var = we1Var.K;
                    if (ae1Var.f5666y != 0 && we1Var.L.d && ae1Var.f(null, 4) != 0) {
                        we1Var.L.getClass();
                    }
                }
                boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
                if ((action == 1 || action == 3) && we1Var.f43761y == 2 && we1Var.f43759x > 0 && (iL0 = (k0Var = (f2.k0) getLayoutManager()).L0()) == 0) {
                    int paddingTop = getPaddingTop();
                    View viewM = k0Var.m(iL0);
                    int iDp = (int) (AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 78.0f : 72.0f) * 0.85f);
                    int measuredHeight = viewM.getMeasuredHeight() + (viewM.getTop() - paddingTop);
                    long jCurrentTimeMillis = System.currentTimeMillis() - we1Var.U;
                    if (measuredHeight < iDp || jCurrentTimeMillis < 200) {
                        v0(0, measuredHeight, org.telegram.ui.Components.er.h);
                        we1Var.f43761y = 2;
                    } else if (we1Var.f43761y != 1) {
                        if (this.f43209b3 == 0.0f) {
                            v0(0, viewM.getTop() - paddingTop, org.telegram.ui.Components.er.h);
                        }
                        if (!we1Var.V) {
                            we1Var.V = true;
                            try {
                                performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                            nw nwVar = we1Var.f43757w;
                            if (nwVar != null) {
                                nwVar.a(true);
                            }
                        }
                        ((org.telegram.ui.Cells.p2) viewM).a0();
                        we1Var.f43761y = 1;
                    }
                    float f10 = this.f43209b3;
                    if (f10 != 0.0f) {
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f10, 0.0f);
                        valueAnimatorOfFloat.addUpdateListener(new w01(this, 19));
                        valueAnimatorOfFloat.setDuration(Math.max(100L, (long) org.telegram.messenger.rl.c(this.f43209b3, AndroidUtilities.dp(72.0f), 120.0f, 350.0f)));
                        valueAnimatorOfFloat.setInterpolator(org.telegram.ui.Components.er.h);
                        setScrollEnabled(false);
                        valueAnimatorOfFloat.addListener(new zb1(this, 2));
                        valueAnimatorOfFloat.start();
                    }
                }
                return zOnTouchEvent;
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
        if (this.a3) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setAdapter(f2.q0 q0Var) {
        super.setAdapter(q0Var);
        this.Z2 = true;
    }

    public final void setViewsOffset(float f10) {
        View viewM;
        this.f43209b3 = f10;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            getChildAt(i10).setTranslationY(f10);
        }
        if (this.A1 != -1 && (viewM = getLayoutManager().m(this.A1)) != null) {
            int left = viewM.getLeft();
            int top = (int) (viewM.getTop() + f10);
            int right = viewM.getRight();
            int bottom = (int) (viewM.getBottom() + f10);
            Rect rect = this.C1;
            rect.set(left, top, right, bottom);
            this.f35304z1.setBounds(rect);
        }
        invalidate();
    }

    public final void y1() {
        if (getItemAnimator() == null || !getItemAnimator().k()) {
            return;
        }
        HashSet hashSet = we1.f43718j1;
    }

    public final void z1(boolean z10, org.telegram.ui.Cells.p2 p2Var) {
        int i10;
        we1 we1Var = this.f43210c3;
        we1Var.A = z10;
        if (z10) {
            we1Var.B.h1(0, 0);
            i10 = we1Var.A ? 0 : 2;
            we1Var.f43761y = i10;
            nw nwVar = we1Var.f43757w;
            if (nwVar != null) {
                nwVar.X = i10 != 0;
            }
            if (p2Var != null) {
                p2Var.U();
                p2Var.invalidate();
            }
        } else if (p2Var != null) {
            we1Var.B.h1(1, 0);
            i10 = we1Var.A ? 0 : 2;
            we1Var.f43761y = i10;
            nw nwVar2 = we1Var.f43757w;
            if (nwVar2 != null) {
                nwVar2.X = i10 != 0;
            }
        }
        ke1 ke1Var = we1Var.A0;
        if (ke1Var != null) {
            ke1Var.forceLayout();
        }
    }
}
