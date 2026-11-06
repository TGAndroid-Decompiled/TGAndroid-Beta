package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
public final class x50 extends FrameLayout {
    public final int f51767a = 1;
    public float f51768b;
    public final Path f51769c;
    public final Object d;
    public Object f51770e;
    public final Object f51771f;

    public x50(z50 z50Var, Context context) {
        super(context);
        this.f51771f = z50Var;
        this.f51769c = new Path();
        this.f51770e = new RectF();
        this.f51768b = -1.0f;
        fh.g c10 = z50Var.getBaseSimpleGlass().f21018c.c(this, null, false);
        c10.p(c8.g0.m(z50Var.getResourceProvider()));
        c10.q(org.telegram.messenger.g0.L(6.0f));
        this.d = c10;
        setWillNotDraw(false);
        addView(z50Var.f52478e, c8.ha.c(-1.0f, -1));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        boolean z9;
        boolean z10;
        boolean z11;
        View[] viewArr;
        org.telegram.ui.Components.x31 G;
        switch (this.f51767a) {
            case 0:
                RectF rectF = (RectF) this.f51770e;
                fh.g gVar = (fh.g) this.d;
                float f11 = ((z50) this.f51771f).f52475a.f55400f;
                if (f11 >= 1.0f) {
                    float min = Math.min(1.0f, f11 / org.telegram.messenger.g0.L(44.0f));
                    float L = (1.0f - min) * org.telegram.messenger.g0.L(24.0f);
                    rectF.set(L, 0.0f, getWidth() - L, f11);
                    float min2 = Math.min(f11 / 2.0f, org.telegram.messenger.g0.L(22.0f));
                    if (Math.abs(min2 - this.f51768b) > 0.5f) {
                        this.f51768b = min2;
                        gVar.r(min2);
                    }
                    int L2 = org.telegram.messenger.g0.L(6.0f);
                    gVar.setBounds(((int) rectF.left) - L2, ((int) rectF.top) - L2, ((int) rectF.right) + L2, ((int) rectF.bottom) + L2);
                    gVar.setAlpha((int) (min * 255.0f));
                    gVar.draw(canvas);
                    canvas.save();
                    Path path = this.f51769c;
                    path.rewind();
                    path.addRoundRect(rectF, min2, min2, Path.Direction.CW);
                    canvas.clipPath(path);
                    super.dispatchDraw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            default:
                oy0 oy0Var = (oy0) this.f51771f;
                View[] viewPages = oy0Var.f48567i1.getViewPages();
                float f12 = 0.0f;
                this.f51768b = 0.0f;
                int length = viewPages.length;
                int i7 = 0;
                while (i7 < length) {
                    View view = viewPages[i7];
                    if (view == null) {
                        viewArr = viewPages;
                    } else {
                        ny0 ny0Var = (ny0) view;
                        FrameLayout frameLayout = ny0Var.f48171e;
                        org.telegram.ui.Components.q41 q41Var = ny0Var.f48172f;
                        float i10 = Utilities.i(1.0f - Math.abs(ny0Var.getTranslationX() / ny0Var.getMeasuredWidth()), 1.0f, f12);
                        float f13 = this.f51768b;
                        float paddingTop = frameLayout.getPaddingTop();
                        int i11 = 0;
                        while (true) {
                            int childCount = q41Var.getChildCount();
                            org.telegram.ui.Components.l41 l41Var = q41Var.f37160f3;
                            if (i11 < childCount) {
                                View childAt = q41Var.getChildAt(i11);
                                q41Var.f37159e3.getClass();
                                int H = v4.n0.H(childAt);
                                View[] viewArr2 = viewPages;
                                if (H >= 0 && H < l41Var.D.size() && (G = l41Var.G(H)) != null && G.f54439a == 28) {
                                    paddingTop = childAt.getY() + frameLayout.getPaddingTop();
                                }
                                i11++;
                                viewPages = viewArr2;
                            } else {
                                viewArr = viewPages;
                                this.f51768b = (paddingTop * i10) + f13;
                                if (ny0Var.getVisibility() == 0) {
                                    bi.m5 m5Var = ny0Var.h;
                                    float f14 = -m5Var.getHeight();
                                    int i12 = 0;
                                    while (true) {
                                        if (i12 < q41Var.getChildCount()) {
                                            View childAt2 = q41Var.getChildAt(i12);
                                            q41Var.f37159e3.getClass();
                                            if (l41Var.G(v4.n0.H(childAt2)).f54439a == 28) {
                                                f14 = childAt2.getY() + frameLayout.getPaddingTop();
                                            } else {
                                                i12++;
                                            }
                                        }
                                    }
                                    m5Var.setTranslationY(Math.max(org.telegram.messenger.g0.f22538m, f14));
                                }
                            }
                        }
                    }
                    i7++;
                    viewPages = viewArr;
                    f12 = 0.0f;
                }
                org.telegram.ui.Components.w5 w5Var = (org.telegram.ui.Components.w5) this.d;
                if (this.f51768b <= org.telegram.messenger.g0.f22538m) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                float e10 = w5Var.e(false, f10);
                float f15 = org.telegram.messenger.g0.f22538m;
                float f16 = f15 * e10;
                float max = Math.max(f15, this.f51768b) - (org.telegram.messenger.g0.f22538m * e10);
                this.f51768b = max;
                RectF rectF2 = org.telegram.messenger.g0.P;
                rectF2.set(oy0Var.f28646t0, max, getWidth() - oy0Var.f28646t0, org.telegram.messenger.g0.L(8.0f) + getHeight());
                float W1 = org.telegram.messenger.g0.W1(e10, org.telegram.messenger.g0.L(14.0f), 0);
                canvas.drawRoundRect(rectF2, W1, W1, oy0Var.f48568j1);
                canvas.save();
                Path path2 = this.f51769c;
                path2.rewind();
                path2.addRoundRect(rectF2, W1, W1, Path.Direction.CW);
                canvas.clipPath(path2);
                super.dispatchDraw(canvas);
                canvas.restore();
                if (f16 > org.telegram.messenger.g0.f22538m / 2.0f) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                Boolean bool = (Boolean) this.f51770e;
                if (bool == null || bool.booleanValue() != z9) {
                    if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27922h5, oy0Var.I0)) > 0.721f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28129s8, oy0Var.I0), 855638016)) > 0.721f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.f51770e = Boolean.valueOf(z9);
                    if (!z9) {
                        z10 = z11;
                    }
                    org.telegram.messenger.g0.s3(oy0Var.getWindow(), z10);
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f51767a) {
            case 0:
                if (motionEvent.getAction() == 0 && motionEvent.getY() > ((z50) this.f51771f).f52475a.f55400f) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f51768b) {
                    ((oy0) this.f51771f).dismiss();
                    return true;
                }
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.f51767a) {
            case 1:
                return super.drawChild(canvas, view, j3);
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        switch (this.f51767a) {
            case 0:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(((z50) this.f51771f).f52484x, 1073741824));
                return;
            default:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824));
                return;
        }
    }

    public x50(oy0 oy0Var, Context context) {
        super(context);
        this.f51771f = oy0Var;
        this.d = new org.telegram.ui.Components.w5(this, 250L, org.telegram.ui.Components.xq.h);
        this.f51769c = new Path();
    }
}
