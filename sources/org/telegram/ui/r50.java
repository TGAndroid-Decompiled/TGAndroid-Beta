package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
public final class r50 extends FrameLayout {
    public final int f49101a = 1;
    public float f49102b;
    public final Path f49103c;
    public final Object d;
    public Object f49104e;
    public final Object f49105f;

    public r50(t50 t50Var, Context context) {
        super(context);
        this.f49105f = t50Var;
        this.f49103c = new Path();
        this.f49104e = new RectF();
        this.f49102b = -1.0f;
        gh.g c2 = t50Var.getBaseSimpleGlass().f53525c.c(this, null, false);
        c2.p(b8.cd.m(t50Var.getResourceProvider()));
        c2.q(org.telegram.messenger.g0.L(6.0f));
        this.d = c2;
        setWillNotDraw(false);
        addView(t50Var.f49703e, b8.mf.c(-1.0f, -1));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        boolean z10;
        boolean z11;
        boolean z12;
        View[] viewArr;
        org.telegram.ui.Components.r31 G;
        switch (this.f49101a) {
            case 0:
                RectF rectF = (RectF) this.f49104e;
                gh.g gVar = (gh.g) this.d;
                float f11 = ((t50) this.f49105f).f49700a.f53846f;
                if (f11 >= 1.0f) {
                    float min = Math.min(1.0f, f11 / org.telegram.messenger.g0.L(44.0f));
                    float L = (1.0f - min) * org.telegram.messenger.g0.L(24.0f);
                    rectF.set(L, 0.0f, getWidth() - L, f11);
                    float min2 = Math.min(f11 / 2.0f, org.telegram.messenger.g0.L(22.0f));
                    if (Math.abs(min2 - this.f49102b) > 0.5f) {
                        this.f49102b = min2;
                        gVar.r(min2);
                    }
                    int L2 = org.telegram.messenger.g0.L(6.0f);
                    gVar.setBounds(((int) rectF.left) - L2, ((int) rectF.top) - L2, ((int) rectF.right) + L2, ((int) rectF.bottom) + L2);
                    gVar.setAlpha((int) (min * 255.0f));
                    gVar.draw(canvas);
                    canvas.save();
                    Path path = this.f49103c;
                    path.rewind();
                    path.addRoundRect(rectF, min2, min2, Path.Direction.CW);
                    canvas.clipPath(path);
                    super.dispatchDraw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            default:
                ey0 ey0Var = (ey0) this.f49105f;
                View[] viewPages = ey0Var.f45093j1.getViewPages();
                float f12 = 0.0f;
                this.f49102b = 0.0f;
                int length = viewPages.length;
                int i3 = 0;
                while (i3 < length) {
                    View view = viewPages[i3];
                    if (view == null) {
                        viewArr = viewPages;
                    } else {
                        dy0 dy0Var = (dy0) view;
                        FrameLayout frameLayout = dy0Var.f44831e;
                        org.telegram.ui.Components.l41 l41Var = dy0Var.f44832f;
                        float i10 = Utilities.i(1.0f - Math.abs(dy0Var.getTranslationX() / dy0Var.getMeasuredWidth()), 1.0f, f12);
                        float f13 = this.f49102b;
                        float paddingTop = frameLayout.getPaddingTop();
                        int i11 = 0;
                        while (true) {
                            int childCount = l41Var.getChildCount();
                            org.telegram.ui.Components.f41 f41Var = l41Var.f35594g3;
                            if (i11 < childCount) {
                                View childAt = l41Var.getChildAt(i11);
                                l41Var.f35593f3.getClass();
                                int H = u4.o0.H(childAt);
                                View[] viewArr2 = viewPages;
                                if (H >= 0 && H < f41Var.E.size() && (G = f41Var.G(H)) != null && G.f54715a == 28) {
                                    paddingTop = childAt.getY() + frameLayout.getPaddingTop();
                                }
                                i11++;
                                viewPages = viewArr2;
                            } else {
                                viewArr = viewPages;
                                this.f49102b = (paddingTop * i10) + f13;
                                if (dy0Var.getVisibility() == 0) {
                                    ci.t4 t4Var = dy0Var.h;
                                    float f14 = -t4Var.getHeight();
                                    int i12 = 0;
                                    while (true) {
                                        if (i12 < l41Var.getChildCount()) {
                                            View childAt2 = l41Var.getChildAt(i12);
                                            l41Var.f35593f3.getClass();
                                            if (f41Var.G(u4.o0.H(childAt2)).f54715a == 28) {
                                                f14 = childAt2.getY() + frameLayout.getPaddingTop();
                                            } else {
                                                i12++;
                                            }
                                        }
                                    }
                                    t4Var.setTranslationY(Math.max(org.telegram.messenger.g0.f22602m, f14));
                                }
                            }
                        }
                    }
                    i3++;
                    viewPages = viewArr;
                    f12 = 0.0f;
                }
                org.telegram.ui.Components.u5 u5Var = (org.telegram.ui.Components.u5) this.d;
                if (this.f49102b <= org.telegram.messenger.g0.f22602m) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                float e10 = u5Var.e(false, f10);
                float f15 = org.telegram.messenger.g0.f22602m;
                float f16 = f15 * e10;
                float max = Math.max(f15, this.f49102b) - (org.telegram.messenger.g0.f22602m * e10);
                this.f49102b = max;
                RectF rectF2 = org.telegram.messenger.g0.P;
                rectF2.set(ey0Var.f28618u0, max, getWidth() - ey0Var.f28618u0, org.telegram.messenger.g0.L(8.0f) + getHeight());
                float W1 = org.telegram.messenger.g0.W1(e10, org.telegram.messenger.g0.L(14.0f), 0);
                canvas.drawRoundRect(rectF2, W1, W1, ey0Var.k1);
                canvas.save();
                Path path2 = this.f49103c;
                path2.rewind();
                path2.addRoundRect(rectF2, W1, W1, Path.Direction.CW);
                canvas.clipPath(path2);
                super.dispatchDraw(canvas);
                canvas.restore();
                if (f16 > org.telegram.messenger.g0.f22602m / 2.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Boolean bool = (Boolean) this.f49104e;
                if (bool == null || bool.booleanValue() != z10) {
                    if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27954h5, ey0Var.J0)) > 0.721f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28160s8, ey0Var.J0), 855638016)) > 0.721f) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    this.f49104e = Boolean.valueOf(z10);
                    if (!z10) {
                        z11 = z12;
                    }
                    org.telegram.messenger.g0.s3(ey0Var.getWindow(), z11);
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f49101a) {
            case 0:
                if (motionEvent.getAction() == 0 && motionEvent.getY() > ((t50) this.f49105f).f49700a.f53846f) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f49102b) {
                    ((ey0) this.f49105f).dismiss();
                    return true;
                }
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f49101a) {
            case 1:
                return super.drawChild(canvas, view, j10);
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        switch (this.f49101a) {
            case 0:
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(((t50) this.f49105f).f49709x, 1073741824));
                return;
            default:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824));
                return;
        }
    }

    public r50(ey0 ey0Var, Context context) {
        super(context);
        this.f49105f = ey0Var;
        this.d = new org.telegram.ui.Components.u5(this, 250L, org.telegram.ui.Components.xq.h);
        this.f49103c = new Path();
    }
}
