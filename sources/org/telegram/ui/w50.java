package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
public final class w50 extends FrameLayout {
    public final int f52432a = 1;
    public float f52433b;
    public final Path f52434c;
    public final Object d;
    public Object f52435e;
    public final Object f52436f;

    public w50(y50 y50Var, Context context) {
        super(context);
        this.f52436f = y50Var;
        this.f52434c = new Path();
        this.f52435e = new RectF();
        this.f52433b = -1.0f;
        fh.g c10 = y50Var.getBaseSimpleGlass().f56042c.c(this, null, false);
        c10.p(c8.g0.l(y50Var.getResourceProvider()));
        c10.q(org.telegram.messenger.g0.L(6.0f));
        this.d = c10;
        setWillNotDraw(false);
        addView(y50Var.f53420e, c8.ja.c(-1.0f, -1));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        boolean z10;
        boolean z11;
        boolean z12;
        View[] viewArr;
        org.telegram.ui.Components.b41 G;
        switch (this.f52432a) {
            case 0:
                RectF rectF = (RectF) this.f52435e;
                fh.g gVar = (fh.g) this.d;
                float f11 = ((y50) this.f52436f).f53417a.f57087f;
                if (f11 >= 1.0f) {
                    float min = Math.min(1.0f, f11 / org.telegram.messenger.g0.L(44.0f));
                    float L = (1.0f - min) * org.telegram.messenger.g0.L(24.0f);
                    rectF.set(L, 0.0f, getWidth() - L, f11);
                    float min2 = Math.min(f11 / 2.0f, org.telegram.messenger.g0.L(22.0f));
                    if (Math.abs(min2 - this.f52433b) > 0.5f) {
                        this.f52433b = min2;
                        gVar.r(min2);
                    }
                    int L2 = org.telegram.messenger.g0.L(6.0f);
                    gVar.setBounds(((int) rectF.left) - L2, ((int) rectF.top) - L2, ((int) rectF.right) + L2, ((int) rectF.bottom) + L2);
                    gVar.setAlpha((int) (min * 255.0f));
                    gVar.draw(canvas);
                    canvas.save();
                    Path path = this.f52434c;
                    path.rewind();
                    path.addRoundRect(rectF, min2, min2, Path.Direction.CW);
                    canvas.clipPath(path);
                    super.dispatchDraw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            default:
                my0 my0Var = (my0) this.f52436f;
                View[] viewPages = my0Var.f49341m1.getViewPages();
                float f12 = 0.0f;
                this.f52433b = 0.0f;
                int length = viewPages.length;
                int i7 = 0;
                while (i7 < length) {
                    View view = viewPages[i7];
                    if (view == null) {
                        viewArr = viewPages;
                    } else {
                        ly0 ly0Var = (ly0) view;
                        FrameLayout frameLayout = ly0Var.f49064e;
                        org.telegram.ui.Components.u41 u41Var = ly0Var.f49065f;
                        float i10 = Utilities.i(1.0f - Math.abs(ly0Var.getTranslationX() / ly0Var.getMeasuredWidth()), 1.0f, f12);
                        float f13 = this.f52433b;
                        float paddingTop = frameLayout.getPaddingTop();
                        int i11 = 0;
                        while (true) {
                            int childCount = u41Var.getChildCount();
                            org.telegram.ui.Components.p41 p41Var = u41Var.f39895g3;
                            if (i11 < childCount) {
                                View childAt = u41Var.getChildAt(i11);
                                u41Var.f39894f3.getClass();
                                int H = v4.o0.H(childAt);
                                View[] viewArr2 = viewPages;
                                if (H >= 0 && H < p41Var.E.size() && (G = p41Var.G(H)) != null && G.f56015a == 28) {
                                    paddingTop = childAt.getY() + frameLayout.getPaddingTop();
                                }
                                i11++;
                                viewPages = viewArr2;
                            } else {
                                viewArr = viewPages;
                                this.f52433b = (paddingTop * i10) + f13;
                                if (ly0Var.getVisibility() == 0) {
                                    di.k4 k4Var = ly0Var.h;
                                    float f14 = -k4Var.getHeight();
                                    int i12 = 0;
                                    while (true) {
                                        if (i12 < u41Var.getChildCount()) {
                                            View childAt2 = u41Var.getChildAt(i12);
                                            u41Var.f39894f3.getClass();
                                            if (p41Var.G(v4.o0.H(childAt2)).f56015a == 28) {
                                                f14 = childAt2.getY() + frameLayout.getPaddingTop();
                                            } else {
                                                i12++;
                                            }
                                        }
                                    }
                                    k4Var.setTranslationY(Math.max(org.telegram.messenger.g0.f23603m, f14));
                                }
                            }
                        }
                    }
                    i7++;
                    viewPages = viewArr;
                    f12 = 0.0f;
                }
                org.telegram.ui.Components.u5 u5Var = (org.telegram.ui.Components.u5) this.d;
                if (this.f52433b <= org.telegram.messenger.g0.f23603m) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                float e10 = u5Var.e(false, f10);
                float f15 = org.telegram.messenger.g0.f23603m;
                float f16 = f15 * e10;
                float max = Math.max(f15, this.f52433b) - (org.telegram.messenger.g0.f23603m * e10);
                this.f52433b = max;
                RectF rectF2 = org.telegram.messenger.g0.P;
                rectF2.set(my0Var.f29717u0, max, getWidth() - my0Var.f29717u0, org.telegram.messenger.g0.L(8.0f) + getHeight());
                float W1 = org.telegram.messenger.g0.W1(e10, org.telegram.messenger.g0.L(14.0f), 0);
                canvas.drawRoundRect(rectF2, W1, W1, my0Var.n1);
                canvas.save();
                Path path2 = this.f52434c;
                path2.rewind();
                path2.addRoundRect(rectF2, W1, W1, Path.Direction.CW);
                canvas.clipPath(path2);
                super.dispatchDraw(canvas);
                canvas.restore();
                if (f16 > org.telegram.messenger.g0.f23603m / 2.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Boolean bool = (Boolean) this.f52435e;
                if (bool == null || bool.booleanValue() != z10) {
                    if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28922h5, my0Var.J0)) > 0.721f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.j6.w(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29129s8, my0Var.J0), 855638016)) > 0.721f) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    this.f52435e = Boolean.valueOf(z10);
                    if (!z10) {
                        z11 = z12;
                    }
                    org.telegram.messenger.g0.s3(my0Var.getWindow(), z11);
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f52432a) {
            case 0:
                if (motionEvent.getAction() == 0 && motionEvent.getY() > ((y50) this.f52436f).f53417a.f57087f) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f52433b) {
                    ((my0) this.f52436f).dismiss();
                    return true;
                }
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.f52432a) {
            case 1:
                return super.drawChild(canvas, view, j3);
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        switch (this.f52432a) {
            case 0:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(((y50) this.f52436f).f53426x, 1073741824));
                return;
            default:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824));
                return;
        }
    }

    public w50(my0 my0Var, Context context) {
        super(context);
        this.f52436f = my0Var;
        this.d = new org.telegram.ui.Components.u5(this, 250L, org.telegram.ui.Components.er.h);
        this.f52434c = new Path();
    }
}
