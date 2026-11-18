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
    public final int f54008a = 0;
    public float f54009b;
    public final Path f54010c;
    public final Object d;
    public Object f54011e;
    public final Object f54012f;

    public y50(a60 a60Var, Context context) {
        super(context);
        this.f54012f = a60Var;
        this.f54010c = new Path();
        this.f54011e = new RectF();
        this.f54009b = -1.0f;
        fh.g c10 = a60Var.getBaseSimpleGlass().f56616c.c(this, null, false);
        c10.p(c8.i0.m(a60Var.getResourceProvider()));
        c10.q(org.telegram.messenger.g0.L(6.0f));
        this.d = c10;
        setWillNotDraw(false);
        addView(a60Var.f45470e, c8.ma.c(-1.0f, -1));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        boolean z10;
        boolean z11;
        boolean z12;
        View[] viewArr;
        org.telegram.ui.Components.l41 G;
        switch (this.f54008a) {
            case 0:
                RectF rectF = (RectF) this.f54011e;
                fh.g gVar = (fh.g) this.d;
                float f11 = ((a60) this.f54012f).f45467a.f57663f;
                if (f11 >= 1.0f) {
                    float min = Math.min(1.0f, f11 / org.telegram.messenger.g0.L(44.0f));
                    float L = (1.0f - min) * org.telegram.messenger.g0.L(24.0f);
                    rectF.set(L, 0.0f, getWidth() - L, f11);
                    float min2 = Math.min(f11 / 2.0f, org.telegram.messenger.g0.L(22.0f));
                    if (Math.abs(min2 - this.f54009b) > 0.5f) {
                        this.f54009b = min2;
                        gVar.r(min2);
                    }
                    int L2 = org.telegram.messenger.g0.L(6.0f);
                    gVar.setBounds(((int) rectF.left) - L2, ((int) rectF.top) - L2, ((int) rectF.right) + L2, ((int) rectF.bottom) + L2);
                    gVar.setAlpha((int) (min * 255.0f));
                    gVar.draw(canvas);
                    canvas.save();
                    Path path = this.f54010c;
                    path.rewind();
                    path.addRoundRect(rectF, min2, min2, Path.Direction.CW);
                    canvas.clipPath(path);
                    super.dispatchDraw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            default:
                qy0 qy0Var = (qy0) this.f54012f;
                View[] viewPages = qy0Var.f51337m1.getViewPages();
                float f12 = 0.0f;
                this.f54009b = 0.0f;
                int length = viewPages.length;
                int i7 = 0;
                while (i7 < length) {
                    View view = viewPages[i7];
                    if (view == null) {
                        viewArr = viewPages;
                    } else {
                        py0 py0Var = (py0) view;
                        FrameLayout frameLayout = py0Var.f50960e;
                        org.telegram.ui.Components.e51 e51Var = py0Var.f50961f;
                        float i10 = Utilities.i(1.0f - Math.abs(py0Var.getTranslationX() / py0Var.getMeasuredWidth()), 1.0f, f12);
                        float f13 = this.f54009b;
                        float paddingTop = frameLayout.getPaddingTop();
                        int i11 = 0;
                        while (true) {
                            int childCount = e51Var.getChildCount();
                            org.telegram.ui.Components.z41 z41Var = e51Var.f34607g3;
                            if (i11 < childCount) {
                                View childAt = e51Var.getChildAt(i11);
                                e51Var.f34606f3.getClass();
                                int H = v4.p0.H(childAt);
                                View[] viewArr2 = viewPages;
                                if (H >= 0 && H < z41Var.E.size() && (G = z41Var.G(H)) != null && G.f56589a == 28) {
                                    paddingTop = childAt.getY() + frameLayout.getPaddingTop();
                                }
                                i11++;
                                viewPages = viewArr2;
                            } else {
                                viewArr = viewPages;
                                this.f54009b = (paddingTop * i10) + f13;
                                if (py0Var.getVisibility() == 0) {
                                    di.n4 n4Var = py0Var.h;
                                    float f14 = -n4Var.getHeight();
                                    int i12 = 0;
                                    while (true) {
                                        if (i12 < e51Var.getChildCount()) {
                                            View childAt2 = e51Var.getChildAt(i12);
                                            e51Var.f34606f3.getClass();
                                            if (z41Var.G(v4.p0.H(childAt2)).f56589a == 28) {
                                                f14 = childAt2.getY() + frameLayout.getPaddingTop();
                                            } else {
                                                i12++;
                                            }
                                        }
                                    }
                                    n4Var.setTranslationY(Math.max(org.telegram.messenger.g0.f24112m, f14));
                                }
                            }
                        }
                    }
                    i7++;
                    viewPages = viewArr;
                    f12 = 0.0f;
                }
                org.telegram.ui.Components.c6 c6Var = (org.telegram.ui.Components.c6) this.d;
                if (this.f54009b <= org.telegram.messenger.g0.f24112m) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                float e10 = c6Var.e(false, f10);
                float f15 = org.telegram.messenger.g0.f24112m;
                float f16 = f15 * e10;
                float max = Math.max(f15, this.f54009b) - (org.telegram.messenger.g0.f24112m * e10);
                this.f54009b = max;
                RectF rectF2 = org.telegram.messenger.g0.P;
                rectF2.set(qy0Var.f30225u0, max, getWidth() - qy0Var.f30225u0, org.telegram.messenger.g0.L(8.0f) + getHeight());
                float W1 = org.telegram.messenger.g0.W1(e10, org.telegram.messenger.g0.L(14.0f), 0);
                canvas.drawRoundRect(rectF2, W1, W1, qy0Var.n1);
                canvas.save();
                Path path2 = this.f54010c;
                path2.rewind();
                path2.addRoundRect(rectF2, W1, W1, Path.Direction.CW);
                canvas.clipPath(path2);
                super.dispatchDraw(canvas);
                canvas.restore();
                if (f16 > org.telegram.messenger.g0.f24112m / 2.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Boolean bool = (Boolean) this.f54011e;
                if (bool == null || bool.booleanValue() != z10) {
                    if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29467h5, qy0Var.J0)) > 0.721f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.n6.w(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29674s8, qy0Var.J0), 855638016)) > 0.721f) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    this.f54011e = Boolean.valueOf(z10);
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
        switch (this.f54008a) {
            case 0:
                if (motionEvent.getAction() == 0 && motionEvent.getY() > ((a60) this.f54012f).f45467a.f57663f) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f54009b) {
                    ((qy0) this.f54012f).dismiss();
                    return true;
                }
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.f54008a) {
            case 1:
                return super.drawChild(canvas, view, j3);
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        switch (this.f54008a) {
            case 0:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(((a60) this.f54012f).f45476x, 1073741824));
                return;
            default:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824));
                return;
        }
    }

    public y50(qy0 qy0Var, Context context) {
        super(context);
        this.f54012f = qy0Var;
        this.d = new org.telegram.ui.Components.c6(this, 250L, org.telegram.ui.Components.lr.h);
        this.f54010c = new Path();
    }
}
