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
public abstract class ye1 extends org.telegram.ui.Components.ka {
    public static final int f46051o3 = 0;
    public boolean f46052k3;
    public boolean f46053l3;
    public float f46054m3;
    public final af1 f46055n3;

    public ye1(af1 af1Var, Context context) {
        super(context, null);
        this.f46055n3 = af1Var;
        this.f46052k3 = true;
        new Paint();
        new RectF();
        this.f30630f1 = true;
        this.f29889i3 = AndroidUtilities.dp(200.0f);
    }

    public final void E1() {
        if (getItemAnimator() != null && getItemAnimator().k()) {
            HashSet hashSet = af1.f37733q1;
        }
    }

    @Override
    public final boolean F0(View view) {
        if ((view instanceof org.telegram.ui.Cells.q4) && !view.isClickable()) {
            return false;
        }
        return true;
    }

    public final void F1(boolean z10, org.telegram.ui.Cells.p2 p2Var) {
        af1 af1Var = this.f46055n3;
        af1Var.E = z10;
        int i10 = 2;
        boolean z11 = true;
        if (!z10) {
            if (p2Var != null) {
                af1Var.F.h1(1, 0);
                if (af1Var.E) {
                    i10 = 0;
                }
                af1Var.f37781y = i10;
                fw fwVar = af1Var.f37777w;
                if (fwVar != null) {
                    if (i10 == 0) {
                        z11 = false;
                    }
                    fwVar.X = z11;
                }
            }
        } else {
            af1Var.F.h1(0, 0);
            if (af1Var.E) {
                i10 = 0;
            }
            af1Var.f37781y = i10;
            fw fwVar2 = af1Var.f37777w;
            if (fwVar2 != null) {
                if (i10 == 0) {
                    z11 = false;
                }
                fwVar2.X = z11;
            }
            if (p2Var != null) {
                p2Var.T();
                p2Var.invalidate();
            }
        }
        oe1 oe1Var = af1Var.E0;
        if (oe1Var != null) {
            oe1Var.forceLayout();
        }
    }

    @Override
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        view.setTranslationY(this.f46054m3);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        af1 af1Var = this.f46055n3;
        if (af1Var.f37742c1 != null) {
            canvas.save();
            canvas.translate(af1Var.f37742c1.getLeft(), af1Var.f37742c1.getY());
            af1Var.f37742c1.draw(canvas);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        E1();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        E1();
        if (this.f46055n3.f37742c1 == view) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        af1 af1Var = this.f46055n3;
        if (af1Var.f37777w != null && this.f46054m3 != 0.0f) {
            int paddingTop = getPaddingTop();
            if (paddingTop != 0) {
                canvas.save();
                canvas.translate(0.0f, paddingTop);
            }
            af1Var.f37777w.c(canvas, true);
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
            HashSet hashSet = af1.f37733q1;
            af1 af1Var = this.f46055n3;
            if (af1Var.getParentLayout() == null || !((ActionBarLayout) af1Var.getParentLayout()).x()) {
                if (motionEvent.getAction() == 0) {
                    kVar = ((org.telegram.ui.ActionBar.r2) af1Var).actionBar;
                    kVar.getClass();
                    s4.h0 adapter = getAdapter();
                    if (af1Var.f37740c != adapter.h()) {
                        this.f46053l3 = true;
                        adapter.l();
                        this.f46053l3 = false;
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
        HashSet hashSet = af1.f37733q1;
        af1 af1Var = this.f46055n3;
        af1Var.getClass();
        af1Var.getClass();
        af1Var.getClass();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        if (this.f46052k3) {
            af1 af1Var = this.f46055n3;
            if (af1Var.getMessagesController().dialogsLoaded) {
                if (af1Var.f37779x > 0) {
                    this.f46053l3 = true;
                    kVar = ((org.telegram.ui.ActionBar.r2) af1Var).actionBar;
                    ((s4.c0) getLayoutManager()).h1(1, (int) kVar.getTranslationY());
                    this.f46053l3 = false;
                }
                this.f46052k3 = false;
            }
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        s4.c0 c0Var;
        int L0;
        float f7;
        if (!this.V1) {
            HashSet hashSet = af1.f37733q1;
            af1 af1Var = this.f46055n3;
            if (af1Var.getParentLayout() == null || !((ActionBarLayout) af1Var.getParentLayout()).x()) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    setOverScrollMode(0);
                }
                if (action == 1 || action == 3) {
                    ee1 ee1Var = af1Var.O;
                    if (ee1Var.f47870y != 0 && af1Var.P.d && ee1Var.i(null, 4) != 0) {
                        af1Var.P.getClass();
                    }
                }
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if ((action == 1 || action == 3) && af1Var.f37781y == 2 && af1Var.f37779x > 0 && (L0 = (c0Var = (s4.c0) getLayoutManager()).L0()) == 0) {
                    int paddingTop = getPaddingTop();
                    View m10 = c0Var.m(L0);
                    if (SharedConfig.useThreeLinesLayout) {
                        f7 = 78.0f;
                    } else {
                        f7 = 72.0f;
                    }
                    int dp = (int) (AndroidUtilities.dp(f7) * 0.85f);
                    int measuredHeight = m10.getMeasuredHeight() + (m10.getTop() - paddingTop);
                    long currentTimeMillis = System.currentTimeMillis() - af1Var.Y;
                    if (measuredHeight >= dp && currentTimeMillis >= 200) {
                        if (af1Var.f37781y != 1) {
                            if (this.f46054m3 == 0.0f) {
                                w0(0, m10.getTop() - paddingTop, org.telegram.ui.Components.ds.h);
                            }
                            if (!af1Var.Z) {
                                af1Var.Z = true;
                                try {
                                    performHapticFeedback(3, 2);
                                } catch (Exception unused) {
                                }
                                fw fwVar = af1Var.f37777w;
                                if (fwVar != null) {
                                    fwVar.a(true);
                                }
                            }
                            ((org.telegram.ui.Cells.p2) m10).Z();
                            af1Var.f37781y = 1;
                        }
                    } else {
                        w0(0, measuredHeight, org.telegram.ui.Components.ds.h);
                        af1Var.f37781y = 2;
                    }
                    float f10 = this.f46054m3;
                    if (f10 != 0.0f) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                        ofFloat.addUpdateListener(new v11(this, 16));
                        ofFloat.setDuration(Math.max(100L, org.telegram.messenger.vh.w(this.f46054m3, AndroidUtilities.dp(72.0f), 120.0f, 350.0f)));
                        ofFloat.setInterpolator(org.telegram.ui.Components.ds.h);
                        setScrollEnabled(false);
                        ofFloat.addListener(new fc1(this, 2));
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
        if (this.f46053l3) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setAdapter(s4.h0 h0Var) {
        super.setAdapter(h0Var);
        this.f46052k3 = true;
    }

    public final void setViewsOffset(float f7) {
        View m10;
        this.f46054m3 = f7;
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
