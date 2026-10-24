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
public abstract class ve1 extends org.telegram.ui.Components.ga {
    public static final int f42712i3 = 0;
    public boolean f42713e3;
    public boolean f42714f3;
    public float f42715g3;
    public final xe1 f42716h3;

    public ve1(xe1 xe1Var, Context context) {
        super(context, null);
        this.f42716h3 = xe1Var;
        this.f42713e3 = true;
        new Paint();
        new RectF();
        this.f28380f1 = true;
        this.f26599c3 = AndroidUtilities.dp(200.0f);
    }

    public final void E1() {
        if (getItemAnimator() != null && getItemAnimator().k()) {
            HashSet hashSet = xe1.f43544q1;
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
        xe1 xe1Var = this.f42716h3;
        xe1Var.E = z10;
        int i10 = 2;
        boolean z11 = true;
        if (!z10) {
            if (q2Var != null) {
                xe1Var.F.h1(1, 0);
                if (xe1Var.E) {
                    i10 = 0;
                }
                xe1Var.f43592y = i10;
                kw kwVar = xe1Var.f43588w;
                if (kwVar != null) {
                    if (i10 == 0) {
                        z11 = false;
                    }
                    kwVar.X = z11;
                }
            }
        } else {
            xe1Var.F.h1(0, 0);
            if (xe1Var.E) {
                i10 = 0;
            }
            xe1Var.f43592y = i10;
            kw kwVar2 = xe1Var.f43588w;
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
        ke1 ke1Var = xe1Var.E0;
        if (ke1Var != null) {
            ke1Var.forceLayout();
        }
    }

    @Override
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        view.setTranslationY(this.f42715g3);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        xe1 xe1Var = this.f42716h3;
        if (xe1Var.f43553c1 != null) {
            canvas.save();
            canvas.translate(xe1Var.f43553c1.getLeft(), xe1Var.f43553c1.getY());
            xe1Var.f43553c1.draw(canvas);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        E1();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        E1();
        if (this.f42716h3.f43553c1 == view) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        xe1 xe1Var = this.f42716h3;
        if (xe1Var.f43588w != null && this.f42715g3 != 0.0f) {
            int paddingTop = getPaddingTop();
            if (paddingTop != 0) {
                canvas.save();
                canvas.translate(0.0f, paddingTop);
            }
            xe1Var.f43588w.c(canvas, true);
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
            HashSet hashSet = xe1.f43544q1;
            xe1 xe1Var = this.f42716h3;
            if (xe1Var.getParentLayout() == null || !((ActionBarLayout) xe1Var.getParentLayout()).x()) {
                if (motionEvent.getAction() == 0) {
                    kVar = ((org.telegram.ui.ActionBar.o2) xe1Var).actionBar;
                    kVar.getClass();
                    s4.g0 adapter = getAdapter();
                    if (xe1Var.f43551c != adapter.h()) {
                        this.f42714f3 = true;
                        adapter.l();
                        this.f42714f3 = false;
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
        HashSet hashSet = xe1.f43544q1;
        xe1 xe1Var = this.f42716h3;
        xe1Var.getClass();
        xe1Var.getClass();
        xe1Var.getClass();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        if (this.f42713e3) {
            xe1 xe1Var = this.f42716h3;
            if (xe1Var.getMessagesController().dialogsLoaded) {
                if (xe1Var.f43590x > 0) {
                    this.f42714f3 = true;
                    kVar = ((org.telegram.ui.ActionBar.o2) xe1Var).actionBar;
                    ((s4.b0) getLayoutManager()).h1(1, (int) kVar.getTranslationY());
                    this.f42714f3 = false;
                }
                this.f42713e3 = false;
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
            HashSet hashSet = xe1.f43544q1;
            xe1 xe1Var = this.f42716h3;
            if (xe1Var.getParentLayout() == null || !((ActionBarLayout) xe1Var.getParentLayout()).x()) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    setOverScrollMode(0);
                }
                if (action == 1 || action == 3) {
                    ae1 ae1Var = xe1Var.O;
                    if (ae1Var.f46497y != 0 && xe1Var.P.d && ae1Var.g(null, 4) != 0) {
                        xe1Var.P.getClass();
                    }
                }
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if ((action == 1 || action == 3) && xe1Var.f43592y == 2 && xe1Var.f43590x > 0 && (L0 = (b0Var = (s4.b0) getLayoutManager()).L0()) == 0) {
                    int paddingTop = getPaddingTop();
                    View m10 = b0Var.m(L0);
                    if (SharedConfig.useThreeLinesLayout) {
                        f7 = 78.0f;
                    } else {
                        f7 = 72.0f;
                    }
                    int dp = (int) (AndroidUtilities.dp(f7) * 0.85f);
                    int measuredHeight = m10.getMeasuredHeight() + (m10.getTop() - paddingTop);
                    long currentTimeMillis = System.currentTimeMillis() - xe1Var.Y;
                    if (measuredHeight >= dp && currentTimeMillis >= 200) {
                        if (xe1Var.f43592y != 1) {
                            if (this.f42715g3 == 0.0f) {
                                v0(0, m10.getTop() - paddingTop, org.telegram.ui.Components.zr.h);
                            }
                            if (!xe1Var.Z) {
                                xe1Var.Z = true;
                                try {
                                    performHapticFeedback(3, 2);
                                } catch (Exception unused) {
                                }
                                kw kwVar = xe1Var.f43588w;
                                if (kwVar != null) {
                                    kwVar.a(true);
                                }
                            }
                            ((org.telegram.ui.Cells.q2) m10).Z();
                            xe1Var.f43592y = 1;
                        }
                    } else {
                        v0(0, measuredHeight, org.telegram.ui.Components.zr.h);
                        xe1Var.f43592y = 2;
                    }
                    float f10 = this.f42715g3;
                    if (f10 != 0.0f) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                        ofFloat.addUpdateListener(new f11(this, 17));
                        ofFloat.setDuration(Math.max(100L, org.telegram.messenger.tl.x(this.f42715g3, AndroidUtilities.dp(72.0f), 120.0f, 350.0f)));
                        ofFloat.setInterpolator(org.telegram.ui.Components.zr.h);
                        setScrollEnabled(false);
                        ofFloat.addListener(new ue1(this, 0));
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
        if (this.f42714f3) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setAdapter(s4.g0 g0Var) {
        super.setAdapter(g0Var);
        this.f42713e3 = true;
    }

    public final void setViewsOffset(float f7) {
        View m10;
        this.f42715g3 = f7;
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
