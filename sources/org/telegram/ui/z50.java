package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
public final class z50 extends FrameLayout {
    public final int f52438a = 0;
    public float f52439b;
    public final Path f52440c;
    public final Object d;
    public Object f52441e;
    public final Object f52442f;

    public z50(b60 b60Var, Context context) {
        super(context);
        this.f52442f = b60Var;
        this.f52440c = new Path();
        this.f52441e = new RectF();
        this.f52439b = -1.0f;
        fh.g c10 = b60Var.getBaseSimpleGlass().f21021c.c(this, null, false);
        c10.p(c8.g0.l(b60Var.getResourceProvider()));
        c10.q(org.telegram.messenger.g0.L(6.0f));
        this.d = c10;
        setWillNotDraw(false);
        addView(b60Var.f43911e, c8.ha.c(-1.0f, -1));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        boolean z9;
        boolean z10;
        boolean z11;
        View[] viewArr;
        org.telegram.ui.Components.y31 G;
        switch (this.f52438a) {
            case 0:
                RectF rectF = (RectF) this.f52441e;
                fh.g gVar = (fh.g) this.d;
                float f11 = ((b60) this.f52442f).f43908a.f55505f;
                if (f11 >= 1.0f) {
                    float min = Math.min(1.0f, f11 / org.telegram.messenger.g0.L(44.0f));
                    float L = (1.0f - min) * org.telegram.messenger.g0.L(24.0f);
                    rectF.set(L, 0.0f, getWidth() - L, f11);
                    float min2 = Math.min(f11 / 2.0f, org.telegram.messenger.g0.L(22.0f));
                    if (Math.abs(min2 - this.f52439b) > 0.5f) {
                        this.f52439b = min2;
                        gVar.r(min2);
                    }
                    int L2 = org.telegram.messenger.g0.L(6.0f);
                    gVar.setBounds(((int) rectF.left) - L2, ((int) rectF.top) - L2, ((int) rectF.right) + L2, ((int) rectF.bottom) + L2);
                    gVar.setAlpha((int) (min * 255.0f));
                    gVar.draw(canvas);
                    canvas.save();
                    Path path = this.f52440c;
                    path.rewind();
                    path.addRoundRect(rectF, min2, min2, Path.Direction.CW);
                    canvas.clipPath(path);
                    super.dispatchDraw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            default:
                ry0 ry0Var = (ry0) this.f52442f;
                View[] viewPages = ry0Var.f49635i1.getViewPages();
                float f12 = 0.0f;
                this.f52439b = 0.0f;
                int length = viewPages.length;
                int i7 = 0;
                while (i7 < length) {
                    View view = viewPages[i7];
                    if (view == null) {
                        viewArr = viewPages;
                    } else {
                        qy0 qy0Var = (qy0) view;
                        FrameLayout frameLayout = qy0Var.f49219e;
                        org.telegram.ui.Components.r41 r41Var = qy0Var.f49220f;
                        float i10 = Utilities.i(1.0f - Math.abs(qy0Var.getTranslationX() / qy0Var.getMeasuredWidth()), 1.0f, f12);
                        float f13 = this.f52439b;
                        float paddingTop = frameLayout.getPaddingTop();
                        int i11 = 0;
                        while (true) {
                            int childCount = r41Var.getChildCount();
                            org.telegram.ui.Components.m41 m41Var = r41Var.f37556f3;
                            if (i11 < childCount) {
                                View childAt = r41Var.getChildAt(i11);
                                r41Var.f37555e3.getClass();
                                int H = v4.n0.H(childAt);
                                View[] viewArr2 = viewPages;
                                if (H >= 0 && H < m41Var.D.size() && (G = m41Var.G(H)) != null && G.f54544a == 28) {
                                    paddingTop = childAt.getY() + frameLayout.getPaddingTop();
                                }
                                i11++;
                                viewPages = viewArr2;
                            } else {
                                viewArr = viewPages;
                                this.f52439b = (paddingTop * i10) + f13;
                                if (qy0Var.getVisibility() == 0) {
                                    bi.m5 m5Var = qy0Var.h;
                                    float f14 = -m5Var.getHeight();
                                    int i12 = 0;
                                    while (true) {
                                        if (i12 < r41Var.getChildCount()) {
                                            View childAt2 = r41Var.getChildAt(i12);
                                            r41Var.f37555e3.getClass();
                                            if (m41Var.G(v4.n0.H(childAt2)).f54544a == 28) {
                                                f14 = childAt2.getY() + frameLayout.getPaddingTop();
                                            } else {
                                                i12++;
                                            }
                                        }
                                    }
                                    m5Var.setTranslationY(Math.max(org.telegram.messenger.g0.f22557m, f14));
                                }
                            }
                        }
                    }
                    i7++;
                    viewPages = viewArr;
                    f12 = 0.0f;
                }
                org.telegram.ui.Components.w5 w5Var = (org.telegram.ui.Components.w5) this.d;
                if (this.f52439b <= org.telegram.messenger.g0.f22557m) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                float e10 = w5Var.e(false, f10);
                float f15 = org.telegram.messenger.g0.f22557m;
                float f16 = f15 * e10;
                float max = Math.max(f15, this.f52439b) - (org.telegram.messenger.g0.f22557m * e10);
                this.f52439b = max;
                RectF rectF2 = org.telegram.messenger.g0.P;
                rectF2.set(ry0Var.f28654t0, max, getWidth() - ry0Var.f28654t0, org.telegram.messenger.g0.L(8.0f) + getHeight());
                float W1 = org.telegram.messenger.g0.W1(e10, org.telegram.messenger.g0.L(14.0f), 0);
                canvas.drawRoundRect(rectF2, W1, W1, ry0Var.f49636j1);
                canvas.save();
                Path path2 = this.f52440c;
                path2.rewind();
                path2.addRoundRect(rectF2, W1, W1, Path.Direction.CW);
                canvas.clipPath(path2);
                super.dispatchDraw(canvas);
                canvas.restore();
                if (f16 > org.telegram.messenger.g0.f22557m / 2.0f) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                Boolean bool = (Boolean) this.f52441e;
                if (bool == null || bool.booleanValue() != z9) {
                    if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27938h5, ry0Var.I0)) > 0.721f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.l6.w(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28145s8, ry0Var.I0), 855638016)) > 0.721f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.f52441e = Boolean.valueOf(z9);
                    if (!z9) {
                        z10 = z11;
                    }
                    org.telegram.messenger.g0.s3(ry0Var.getWindow(), z10);
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f52438a) {
            case 0:
                if (motionEvent.getAction() == 0 && motionEvent.getY() > ((b60) this.f52442f).f43908a.f55505f) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f52439b) {
                    ((ry0) this.f52442f).dismiss();
                    return true;
                }
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.f52438a) {
            case 1:
                return super.drawChild(canvas, view, j3);
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        switch (this.f52438a) {
            case 0:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(((b60) this.f52442f).f43917x, 1073741824));
                return;
            default:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824));
                return;
        }
    }

    public z50(ry0 ry0Var, Context context) {
        super(context);
        this.f52442f = ry0Var;
        this.d = new org.telegram.ui.Components.w5(this, 250L, org.telegram.ui.Components.xq.h);
        this.f52440c = new Path();
    }
}
