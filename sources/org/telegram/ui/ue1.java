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
public abstract class ue1 extends org.telegram.ui.Components.aa {
    public static final int f43239d3 = 0;
    public boolean Z2;
    public boolean a3;
    public float f43240b3;
    public final we1 f43241c3;

    public ue1(we1 we1Var, Context context) {
        super(context, null);
        this.f43241c3 = we1Var;
        this.Z2 = true;
        new Paint();
        new RectF();
        this.f34244d1 = true;
        this.X2 = AndroidUtilities.dp(200.0f);
    }

    @Override
    public final boolean F0(View view) {
        if ((view instanceof org.telegram.ui.Cells.m4) && !view.isClickable()) {
            return false;
        }
        return true;
    }

    @Override
    public final void addView(View view, int i9, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i9, layoutParams);
        view.setTranslationY(this.f43240b3);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        we1 we1Var = this.f43241c3;
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
        if (this.f43241c3.X0 == view) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        we1 we1Var = this.f43241c3;
        if (we1Var.f43779w != null && this.f43240b3 != 0.0f) {
            int paddingTop = getPaddingTop();
            if (paddingTop != 0) {
                canvas.save();
                canvas.translate(0.0f, paddingTop);
            }
            we1Var.f43779w.c(canvas, true);
            if (paddingTop != 0) {
                canvas.restore();
            }
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        if (!this.T1) {
            HashSet hashSet = we1.f43740j1;
            we1 we1Var = this.f43241c3;
            if (we1Var.getParentLayout() == null || !((ActionBarLayout) we1Var.getParentLayout()).y()) {
                if (motionEvent.getAction() == 0) {
                    kVar = ((org.telegram.ui.ActionBar.o2) we1Var).actionBar;
                    kVar.getClass();
                    f2.r0 adapter = getAdapter();
                    if (we1Var.f43747c != adapter.h()) {
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
    public void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        HashSet hashSet = we1.f43740j1;
        we1 we1Var = this.f43241c3;
        we1Var.getClass();
        we1Var.getClass();
        we1Var.getClass();
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        if (this.Z2) {
            we1 we1Var = this.f43241c3;
            if (we1Var.getMessagesController().dialogsLoaded) {
                if (we1Var.f43781x > 0) {
                    this.a3 = true;
                    kVar = ((org.telegram.ui.ActionBar.o2) we1Var).actionBar;
                    ((f2.m0) getLayoutManager()).h1(1, (int) kVar.getTranslationY());
                    this.a3 = false;
                }
                this.Z2 = false;
            }
        }
        super.onMeasure(i9, i10);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        f2.m0 m0Var;
        int L0;
        float f10;
        if (!this.T1) {
            HashSet hashSet = we1.f43740j1;
            we1 we1Var = this.f43241c3;
            if (we1Var.getParentLayout() == null || !((ActionBarLayout) we1Var.getParentLayout()).y()) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    setOverScrollMode(0);
                }
                if (action == 1 || action == 3) {
                    zd1 zd1Var = we1Var.K;
                    if (zd1Var.f5378y != 0 && we1Var.L.d && zd1Var.f(null, 4) != 0) {
                        we1Var.L.getClass();
                    }
                }
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if ((action == 1 || action == 3) && we1Var.f43783y == 2 && we1Var.f43781x > 0 && (L0 = (m0Var = (f2.m0) getLayoutManager()).L0()) == 0) {
                    int paddingTop = getPaddingTop();
                    View m10 = m0Var.m(L0);
                    if (SharedConfig.useThreeLinesLayout) {
                        f10 = 78.0f;
                    } else {
                        f10 = 72.0f;
                    }
                    int dp = (int) (AndroidUtilities.dp(f10) * 0.85f);
                    int measuredHeight = m10.getMeasuredHeight() + (m10.getTop() - paddingTop);
                    long currentTimeMillis = System.currentTimeMillis() - we1Var.U;
                    if (measuredHeight >= dp && currentTimeMillis >= 200) {
                        if (we1Var.f43783y != 1) {
                            if (this.f43240b3 == 0.0f) {
                                v0(0, m10.getTop() - paddingTop, org.telegram.ui.Components.gr.h);
                            }
                            if (!we1Var.V) {
                                we1Var.V = true;
                                try {
                                    performHapticFeedback(3, 2);
                                } catch (Exception unused) {
                                }
                                kw kwVar = we1Var.f43779w;
                                if (kwVar != null) {
                                    kwVar.a(true);
                                }
                            }
                            ((org.telegram.ui.Cells.r2) m10).Z();
                            we1Var.f43783y = 1;
                        }
                    } else {
                        v0(0, measuredHeight, org.telegram.ui.Components.gr.h);
                        we1Var.f43783y = 2;
                    }
                    float f11 = this.f43240b3;
                    if (f11 != 0.0f) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, 0.0f);
                        ofFloat.addUpdateListener(new v01(this, 19));
                        ofFloat.setDuration(Math.max(100L, org.telegram.messenger.ll.c(this.f43240b3, AndroidUtilities.dp(72.0f), 120.0f, 350.0f)));
                        ofFloat.setInterpolator(org.telegram.ui.Components.gr.h);
                        setScrollEnabled(false);
                        ofFloat.addListener(new te1(this, 0));
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
        if (this.a3) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setAdapter(f2.r0 r0Var) {
        super.setAdapter(r0Var);
        this.Z2 = true;
    }

    public final void setViewsOffset(float f10) {
        View m10;
        this.f43240b3 = f10;
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            getChildAt(i9).setTranslationY(f10);
        }
        if (this.A1 != -1 && (m10 = getLayoutManager().m(this.A1)) != null) {
            int right = m10.getRight();
            int bottom = (int) (m10.getBottom() + f10);
            Rect rect = this.C1;
            rect.set(m10.getLeft(), (int) (m10.getTop() + f10), right, bottom);
            this.f34287z1.setBounds(rect);
        }
        invalidate();
    }

    public final void y1() {
        if (getItemAnimator() != null && getItemAnimator().k()) {
            HashSet hashSet = we1.f43740j1;
        }
    }

    public final void z1(boolean z10, org.telegram.ui.Cells.r2 r2Var) {
        we1 we1Var = this.f43241c3;
        we1Var.A = z10;
        int i9 = 2;
        boolean z11 = true;
        if (!z10) {
            if (r2Var != null) {
                we1Var.B.h1(1, 0);
                if (we1Var.A) {
                    i9 = 0;
                }
                we1Var.f43783y = i9;
                kw kwVar = we1Var.f43779w;
                if (kwVar != null) {
                    if (i9 == 0) {
                        z11 = false;
                    }
                    kwVar.X = z11;
                }
            }
        } else {
            we1Var.B.h1(0, 0);
            if (we1Var.A) {
                i9 = 0;
            }
            we1Var.f43783y = i9;
            kw kwVar2 = we1Var.f43779w;
            if (kwVar2 != null) {
                if (i9 == 0) {
                    z11 = false;
                }
                kwVar2.X = z11;
            }
            if (r2Var != null) {
                r2Var.T();
                r2Var.invalidate();
            }
        }
        je1 je1Var = we1Var.A0;
        if (je1Var != null) {
            je1Var.forceLayout();
        }
    }
}
