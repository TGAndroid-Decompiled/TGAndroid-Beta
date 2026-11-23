package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
public final class y50 extends FrameLayout {
    public final int f54033a = 0;
    public float f54034b;
    public final Path f54035c;
    public final Object d;
    public Object f54036e;
    public final Object f54037f;

    public y50(a60 a60Var, Context context) {
        super(context);
        this.f54037f = a60Var;
        this.f54035c = new Path();
        this.f54036e = new RectF();
        this.f54034b = -1.0f;
        fh.g c10 = a60Var.getBaseSimpleGlass().f56626c.c(this, null, false);
        c10.p(c8.j0.m(a60Var.getResourceProvider()));
        c10.q(org.telegram.messenger.g0.L(6.0f));
        this.d = c10;
        setWillNotDraw(false);
        addView(a60Var.f45480e, c8.na.c(-1.0f, -1));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        boolean z10;
        boolean z11;
        boolean z12;
        View[] viewArr;
        org.telegram.ui.Components.o41 G;
        switch (this.f54033a) {
            case 0:
                RectF rectF = (RectF) this.f54036e;
                fh.g gVar = (fh.g) this.d;
                float f11 = ((a60) this.f54037f).f45477a.f57671f;
                if (f11 >= 1.0f) {
                    float min = Math.min(1.0f, f11 / org.telegram.messenger.g0.L(44.0f));
                    float L = (1.0f - min) * org.telegram.messenger.g0.L(24.0f);
                    rectF.set(L, 0.0f, getWidth() - L, f11);
                    float min2 = Math.min(f11 / 2.0f, org.telegram.messenger.g0.L(22.0f));
                    if (Math.abs(min2 - this.f54034b) > 0.5f) {
                        this.f54034b = min2;
                        gVar.r(min2);
                    }
                    int L2 = org.telegram.messenger.g0.L(6.0f);
                    gVar.setBounds(((int) rectF.left) - L2, ((int) rectF.top) - L2, ((int) rectF.right) + L2, ((int) rectF.bottom) + L2);
                    gVar.setAlpha((int) (min * 255.0f));
                    gVar.draw(canvas);
                    canvas.save();
                    Path path = this.f54035c;
                    path.rewind();
                    path.addRoundRect(rectF, min2, min2, Path.Direction.CW);
                    canvas.clipPath(path);
                    super.dispatchDraw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            default:
                qy0 qy0Var = (qy0) this.f54037f;
                View[] viewPages = qy0Var.f51361m1.getViewPages();
                float f12 = 0.0f;
                this.f54034b = 0.0f;
                int length = viewPages.length;
                int i7 = 0;
                while (i7 < length) {
                    View view = viewPages[i7];
                    if (view == null) {
                        viewArr = viewPages;
                    } else {
                        py0 py0Var = (py0) view;
                        FrameLayout frameLayout = py0Var.f50941e;
                        org.telegram.ui.Components.h51 h51Var = py0Var.f50942f;
                        float i10 = Utilities.i(1.0f - Math.abs(py0Var.getTranslationX() / py0Var.getMeasuredWidth()), 1.0f, f12);
                        float f13 = this.f54034b;
                        float paddingTop = frameLayout.getPaddingTop();
                        int i11 = 0;
                        while (true) {
                            int childCount = h51Var.getChildCount();
                            org.telegram.ui.Components.c51 c51Var = h51Var.f35742g3;
                            if (i11 < childCount) {
                                View childAt = h51Var.getChildAt(i11);
                                h51Var.f35741f3.getClass();
                                int H = v4.o0.H(childAt);
                                View[] viewArr2 = viewPages;
                                if (H >= 0 && H < c51Var.E.size() && (G = c51Var.G(H)) != null && G.f56599a == 28) {
                                    paddingTop = childAt.getY() + frameLayout.getPaddingTop();
                                }
                                i11++;
                                viewPages = viewArr2;
                            } else {
                                viewArr = viewPages;
                                this.f54034b = (paddingTop * i10) + f13;
                                if (py0Var.getVisibility() == 0) {
                                    di.n4 n4Var = py0Var.h;
                                    float f14 = -n4Var.getHeight();
                                    int i12 = 0;
                                    while (true) {
                                        if (i12 < h51Var.getChildCount()) {
                                            View childAt2 = h51Var.getChildAt(i12);
                                            h51Var.f35741f3.getClass();
                                            if (c51Var.G(v4.o0.H(childAt2)).f56599a == 28) {
                                                f14 = childAt2.getY() + frameLayout.getPaddingTop();
                                            } else {
                                                i12++;
                                            }
                                        }
                                    }
                                    n4Var.setTranslationY(Math.max(org.telegram.messenger.g0.f24004m, f14));
                                }
                            }
                        }
                    }
                    i7++;
                    viewPages = viewArr;
                    f12 = 0.0f;
                }
                org.telegram.ui.Components.d6 d6Var = (org.telegram.ui.Components.d6) this.d;
                if (this.f54034b <= org.telegram.messenger.g0.f24004m) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                float e10 = d6Var.e(false, f10);
                float f15 = org.telegram.messenger.g0.f24004m;
                float f16 = f15 * e10;
                float max = Math.max(f15, this.f54034b) - (org.telegram.messenger.g0.f24004m * e10);
                this.f54034b = max;
                RectF rectF2 = org.telegram.messenger.g0.P;
                rectF2.set(qy0Var.f30177u0, max, getWidth() - qy0Var.f30177u0, org.telegram.messenger.g0.L(8.0f) + getHeight());
                float W1 = org.telegram.messenger.g0.W1(e10, org.telegram.messenger.g0.L(14.0f), 0);
                canvas.drawRoundRect(rectF2, W1, W1, qy0Var.n1);
                canvas.save();
                Path path2 = this.f54035c;
                path2.rewind();
                path2.addRoundRect(rectF2, W1, W1, Path.Direction.CW);
                canvas.clipPath(path2);
                super.dispatchDraw(canvas);
                canvas.restore();
                if (f16 > org.telegram.messenger.g0.f24004m / 2.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Boolean bool = (Boolean) this.f54036e;
                if (bool == null || bool.booleanValue() != z10) {
                    if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29420h5, qy0Var.J0)) > 0.721f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.w(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29627s8, qy0Var.J0), 855638016)) > 0.721f) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    this.f54036e = Boolean.valueOf(z10);
                    if (!z10) {
                        z11 = z12;
                    }
                    org.telegram.messenger.g0.r3(qy0Var.getWindow(), z11);
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f54033a) {
            case 0:
                if (motionEvent.getAction() == 0 && motionEvent.getY() > ((a60) this.f54037f).f45477a.f57671f) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f54034b) {
                    ((qy0) this.f54037f).dismiss();
                    return true;
                }
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.f54033a) {
            case 1:
                return super.drawChild(canvas, view, j3);
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        switch (this.f54033a) {
            case 0:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(((a60) this.f54037f).f45486x, 1073741824));
                return;
            default:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824));
                return;
        }
    }

    public y50(qy0 qy0Var, Context context) {
        super(context);
        this.f54037f = qy0Var;
        this.d = new org.telegram.ui.Components.d6(this, 250L, org.telegram.ui.Components.nr.h);
        this.f54035c = new Path();
    }
}
