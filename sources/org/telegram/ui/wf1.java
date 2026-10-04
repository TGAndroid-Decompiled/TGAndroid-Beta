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
public abstract class wf1 extends org.telegram.ui.Components.ja {
    public static final int f42446o3 = 0;
    public boolean f42447k3;
    public boolean f42448l3;
    public float f42449m3;
    public final yf1 f42450n3;

    public wf1(yf1 yf1Var, Context context) {
        super(context, null);
        this.f42450n3 = yf1Var;
        this.f42447k3 = true;
        new Paint();
        new RectF();
        this.f33529h1 = true;
        this.f27704i3 = AndroidUtilities.dp(200.0f);
    }

    public final void A1() {
        if (getItemAnimator() != null && getItemAnimator().k()) {
            HashSet hashSet = yf1.f43161n1;
        }
    }

    public final void B1(boolean z10, org.telegram.ui.Cells.s2 s2Var) {
        yf1 yf1Var = this.f42450n3;
        yf1Var.E = z10;
        int i10 = 2;
        boolean z11 = true;
        if (!z10) {
            if (s2Var != null) {
                yf1Var.F.h1(1, 0);
                if (yf1Var.E) {
                    i10 = 0;
                }
                yf1Var.f43207y = i10;
                yw ywVar = yf1Var.f43203w;
                if (ywVar != null) {
                    if (i10 == 0) {
                        z11 = false;
                    }
                    ywVar.X = z11;
                }
            }
        } else {
            yf1Var.F.h1(0, 0);
            if (yf1Var.E) {
                i10 = 0;
            }
            yf1Var.f43207y = i10;
            yw ywVar2 = yf1Var.f43203w;
            if (ywVar2 != null) {
                if (i10 == 0) {
                    z11 = false;
                }
                ywVar2.X = z11;
            }
            if (s2Var != null) {
                s2Var.S();
                s2Var.invalidate();
            }
        }
        mf1 mf1Var = yf1Var.E0;
        if (mf1Var != null) {
            mf1Var.forceLayout();
        }
    }

    @Override
    public final boolean G0(View view) {
        if ((view instanceof org.telegram.ui.Cells.m4) && !view.isClickable()) {
            return false;
        }
        return true;
    }

    @Override
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        view.setTranslationY(this.f42449m3);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        yf1 yf1Var = this.f42450n3;
        if (yf1Var.f43167b1 != null) {
            canvas.save();
            canvas.translate(yf1Var.f43167b1.getLeft(), yf1Var.f43167b1.getY());
            yf1Var.f43167b1.draw(canvas);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        A1();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        A1();
        if (this.f42450n3.f43167b1 == view) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        yf1 yf1Var = this.f42450n3;
        if (yf1Var.f43203w != null && this.f42449m3 != 0.0f) {
            int paddingTop = getPaddingTop();
            if (paddingTop != 0) {
                canvas.save();
                canvas.translate(0.0f, paddingTop);
            }
            yf1Var.f43203w.c(canvas, true);
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
            HashSet hashSet = yf1.f43161n1;
            yf1 yf1Var = this.f42450n3;
            if (yf1Var.getParentLayout() == null || !((ActionBarLayout) yf1Var.getParentLayout()).y()) {
                if (motionEvent.getAction() == 0) {
                    kVar = ((org.telegram.ui.ActionBar.n2) yf1Var).actionBar;
                    kVar.getClass();
                    s4.h0 adapter = getAdapter();
                    if (yf1Var.f43168c != adapter.h()) {
                        this.f42448l3 = true;
                        adapter.l();
                        this.f42448l3 = false;
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
        HashSet hashSet = yf1.f43161n1;
        yf1 yf1Var = this.f42450n3;
        yf1Var.getClass();
        yf1Var.getClass();
        yf1Var.getClass();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        if (this.f42447k3) {
            yf1 yf1Var = this.f42450n3;
            if (yf1Var.getMessagesController().dialogsLoaded) {
                if (yf1Var.f43205x > 0) {
                    this.f42448l3 = true;
                    kVar = ((org.telegram.ui.ActionBar.n2) yf1Var).actionBar;
                    ((s4.c0) getLayoutManager()).h1(1, (int) kVar.getTranslationY());
                    this.f42448l3 = false;
                }
                this.f42447k3 = false;
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
            HashSet hashSet = yf1.f43161n1;
            yf1 yf1Var = this.f42450n3;
            if (yf1Var.getParentLayout() == null || !((ActionBarLayout) yf1Var.getParentLayout()).y()) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    setOverScrollMode(0);
                }
                if (action == 1 || action == 3) {
                    cf1 cf1Var = yf1Var.O;
                    if (cf1Var.f46690y != 0 && yf1Var.P.d && cf1Var.g(null, 4) != 0) {
                        yf1Var.P.getClass();
                    }
                }
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if ((action == 1 || action == 3) && yf1Var.f43207y == 2 && yf1Var.f43205x > 0 && (L0 = (c0Var = (s4.c0) getLayoutManager()).L0()) == 0) {
                    int paddingTop = getPaddingTop();
                    View m10 = c0Var.m(L0);
                    if (SharedConfig.useThreeLinesLayout) {
                        f7 = 78.0f;
                    } else {
                        f7 = 72.0f;
                    }
                    int dp = (int) (AndroidUtilities.dp(f7) * 0.85f);
                    int measuredHeight = m10.getMeasuredHeight() + (m10.getTop() - paddingTop);
                    long currentTimeMillis = System.currentTimeMillis() - yf1Var.Y;
                    if (measuredHeight >= dp && currentTimeMillis >= 200) {
                        if (yf1Var.f43207y != 1) {
                            if (this.f42449m3 == 0.0f) {
                                w0(0, m10.getTop() - paddingTop, org.telegram.ui.Components.tr.h);
                            }
                            if (!yf1Var.Z) {
                                yf1Var.Z = true;
                                try {
                                    performHapticFeedback(3, 2);
                                } catch (Exception unused) {
                                }
                                yw ywVar = yf1Var.f43203w;
                                if (ywVar != null) {
                                    ywVar.a(true);
                                }
                            }
                            ((org.telegram.ui.Cells.s2) m10).Z();
                            yf1Var.f43207y = 1;
                        }
                    } else {
                        w0(0, measuredHeight, org.telegram.ui.Components.tr.h);
                        yf1Var.f43207y = 2;
                    }
                    float f10 = this.f42449m3;
                    if (f10 != 0.0f) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                        ofFloat.addUpdateListener(new b21(this, 18));
                        ofFloat.setDuration(Math.max(100L, org.telegram.messenger.ok.b(this.f42449m3, AndroidUtilities.dp(72.0f), 120.0f, 350.0f)));
                        ofFloat.setInterpolator(org.telegram.ui.Components.tr.h);
                        setScrollEnabled(false);
                        ofFloat.addListener(new ap0(this, 25));
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
        if (this.f42448l3) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setAdapter(s4.h0 h0Var) {
        super.setAdapter(h0Var);
        this.f42447k3 = true;
    }

    public final void setViewsOffset(float f7) {
        View m10;
        this.f42449m3 = f7;
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
}
