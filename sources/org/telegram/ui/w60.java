package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
public final class w60 extends FrameLayout {
    public final int f42884a = 1;
    public float f42885b;
    public final Path f42886c;
    public final Object d;
    public Object e;
    public final Object f42887f;

    public w60(y60 y60Var, Context context) {
        super(context);
        this.f42887f = y60Var;
        this.f42886c = new Path();
        this.e = new RectF();
        this.f42885b = -1.0f;
        vg.f c10 = y60Var.getBaseSimpleGlass().f6599c.c(this, null, false);
        c10.o(w7.b9.m(y60Var.getResourceProvider()));
        c10.p(org.telegram.messenger.i0.L(6.0f));
        this.d = c10;
        setWillNotDraw(false);
        addView(y60Var.e, w7.b6.c(-1.0f, -1));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        boolean z10;
        boolean z11;
        boolean z12;
        View[] viewArr;
        org.telegram.ui.Components.a51 G;
        switch (this.f42884a) {
            case 0:
                RectF rectF = (RectF) this.e;
                vg.f fVar = (vg.f) this.d;
                float f10 = ((y60) this.f42887f).f43732a.f7031f;
                if (f10 >= 1.0f) {
                    float min = Math.min(1.0f, f10 / org.telegram.messenger.i0.L(44.0f));
                    float L = (1.0f - min) * org.telegram.messenger.i0.L(24.0f);
                    rectF.set(L, 0.0f, getWidth() - L, f10);
                    float min2 = Math.min(f10 / 2.0f, org.telegram.messenger.i0.L(22.0f));
                    if (Math.abs(min2 - this.f42885b) > 0.5f) {
                        this.f42885b = min2;
                        fVar.q(min2);
                    }
                    int L2 = org.telegram.messenger.i0.L(6.0f);
                    fVar.setBounds(((int) rectF.left) - L2, ((int) rectF.top) - L2, ((int) rectF.right) + L2, ((int) rectF.bottom) + L2);
                    fVar.setAlpha((int) (min * 255.0f));
                    fVar.draw(canvas);
                    canvas.save();
                    Path path = this.f42886c;
                    path.rewind();
                    path.addRoundRect(rectF, min2, min2, Path.Direction.CW);
                    canvas.clipPath(path);
                    super.dispatchDraw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            default:
                c01 c01Var = (c01) this.f42887f;
                View[] viewPages = c01Var.f36351i1.getViewPages();
                float f11 = 0.0f;
                this.f42885b = 0.0f;
                int length = viewPages.length;
                int i10 = 0;
                while (i10 < length) {
                    View view = viewPages[i10];
                    if (view == null) {
                        viewArr = viewPages;
                    } else {
                        b01 b01Var = (b01) view;
                        FrameLayout frameLayout = b01Var.e;
                        org.telegram.ui.Components.u51 u51Var = b01Var.f35922f;
                        float i11 = Utilities.i(1.0f - Math.abs(b01Var.getTranslationX() / b01Var.getMeasuredWidth()), 1.0f, f11);
                        float f12 = this.f42885b;
                        float paddingTop = frameLayout.getPaddingTop();
                        int i12 = 0;
                        while (true) {
                            int childCount = u51Var.getChildCount();
                            org.telegram.ui.Components.p51 p51Var = u51Var.f30819f3;
                            if (i12 < childCount) {
                                View childAt = u51Var.getChildAt(i12);
                                u51Var.f30818e3.getClass();
                                int H = s4.n0.H(childAt);
                                View[] viewArr2 = viewPages;
                                if (H >= 0 && H < p51Var.D.size() && (G = p51Var.G(H)) != null && G.f7680a == 28) {
                                    paddingTop = childAt.getY() + frameLayout.getPaddingTop();
                                }
                                i12++;
                                viewPages = viewArr2;
                            } else {
                                viewArr = viewPages;
                                this.f42885b = (paddingTop * i11) + f12;
                                if (b01Var.getVisibility() == 0) {
                                    jg.b1 b1Var = b01Var.h;
                                    float f13 = -b1Var.getHeight();
                                    int i13 = 0;
                                    while (true) {
                                        if (i13 < u51Var.getChildCount()) {
                                            View childAt2 = u51Var.getChildAt(i13);
                                            u51Var.f30818e3.getClass();
                                            if (p51Var.G(s4.n0.H(childAt2)).f7680a == 28) {
                                                f13 = childAt2.getY() + frameLayout.getPaddingTop();
                                            } else {
                                                i13++;
                                            }
                                        }
                                    }
                                    b1Var.setTranslationY(Math.max(org.telegram.messenger.i0.f16020m, f13));
                                }
                            }
                        }
                    }
                    i10++;
                    viewPages = viewArr;
                    f11 = 0.0f;
                }
                org.telegram.ui.Components.t5 t5Var = (org.telegram.ui.Components.t5) this.d;
                if (this.f42885b <= org.telegram.messenger.i0.f16020m) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                float e = t5Var.e(false, f7);
                float f14 = org.telegram.messenger.i0.f16020m;
                float f15 = f14 * e;
                float max = Math.max(f14, this.f42885b) - (org.telegram.messenger.i0.f16020m * e);
                this.f42885b = max;
                RectF rectF2 = org.telegram.messenger.i0.P;
                rectF2.set(c01Var.f21615t0, max, getWidth() - c01Var.f21615t0, org.telegram.messenger.i0.L(8.0f) + getHeight());
                float W1 = org.telegram.messenger.i0.W1(e, org.telegram.messenger.i0.L(14.0f), 0);
                canvas.drawRoundRect(rectF2, W1, W1, c01Var.f36352j1);
                canvas.save();
                Path path2 = this.f42886c;
                path2.rewind();
                path2.addRoundRect(rectF2, W1, W1, Path.Direction.CW);
                canvas.clipPath(path2);
                super.dispatchDraw(canvas);
                canvas.restore();
                if (f15 > org.telegram.messenger.i0.f16020m / 2.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Boolean bool = (Boolean) this.e;
                if (bool == null || bool.booleanValue() != z10) {
                    if (org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21001h5, c01Var.I0)) > 0.721f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.w(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21206s8, c01Var.I0), 855638016)) > 0.721f) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    this.e = Boolean.valueOf(z10);
                    if (!z10) {
                        z11 = z12;
                    }
                    org.telegram.messenger.i0.r3(c01Var.getWindow(), z11);
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f42884a) {
            case 0:
                if (motionEvent.getAction() == 0 && motionEvent.getY() > ((y60) this.f42887f).f43732a.f7031f) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f42885b) {
                    ((c01) this.f42887f).dismiss();
                    return true;
                }
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f42884a) {
            case 1:
                return super.drawChild(canvas, view, j10);
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f42884a) {
            case 0:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(((y60) this.f42887f).f43740x, 1073741824));
                return;
            default:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
                return;
        }
    }

    public w60(c01 c01Var, Context context) {
        super(context);
        this.f42887f = c01Var;
        this.d = new org.telegram.ui.Components.t5(this, 250L, org.telegram.ui.Components.gr.h);
        this.f42886c = new Path();
    }
}
